package dev.hesselp.fakeblocks.block;

import dev.hesselp.fakeblocks.FakeBlocks;
import dev.hesselp.fakeblocks.item.FBItemRegisterer;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Triple;
import org.jetbrains.annotations.NotNull;

public class FBBlockRegisterer {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(FakeBlocks.MODID);
    public static final Map<String, Triple<DeferredBlock<Block>, BlockTextureData, Block>> FAKE_BLOCKS =
            Collections.synchronizedMap(new LinkedHashMap<>());

    public static void registerFakeBlock(String name, Block baseBlock, BlockTextureData textureData) {
        DeferredBlock<Block> fakeBlock = registerBlock(name, () ->
                        new FakeBlock(BlockBehaviour.Properties.ofFullCopy(baseBlock).noCollission()));
        FAKE_BLOCKS.put(name, Triple.of(fakeBlock, textureData, baseBlock));
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static void registerDispenserBehaviors() {
        var tntItem = FBBlockRegisterer.FAKE_BLOCKS.get("fake_tnt").getLeft().get().asItem();

        DispenserBlock.registerBehavior(tntItem, new DefaultDispenseItemBehavior() {
            @Override
            protected @NotNull ItemStack execute(@NotNull BlockSource source, @NotNull ItemStack stack) {
                Level level = source.level();
                BlockPos pos = source.pos().relative(source.state().getValue(DispenserBlock.FACING));

                // 1. Create the primed entity
                net.minecraft.world.entity.item.PrimedTnt primedtnt = new net.minecraft.world.entity.item.PrimedTnt(
                        level, (double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, null
                );

                // 2. Add our safety tag so the explosion does no damage[cite: 7]
                primedtnt.addTag("is_fake_tnt");
                level.addFreshEntity(primedtnt);

                // 3. Play the sound and trigger game events[cite: 7]
                level.playSound(null, primedtnt.getX(), primedtnt.getY(), primedtnt.getZ(),
                        SoundEvents.TNT_PRIMED, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.gameEvent(null, GameEvent.ENTITY_PLACE, pos);

                // 4. Shrink the item stack in the dispenser
                stack.shrink(1);
                return stack;
            }
        });
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        FBItemRegisterer.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        FakeBlockDefinitions.registerAll();
    }
}
