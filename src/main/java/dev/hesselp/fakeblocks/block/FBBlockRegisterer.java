package dev.hesselp.fakeblocks.block;

import dev.hesselp.fakeblocks.FakeBlocks;
import dev.hesselp.fakeblocks.item.FBItemRegisterer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Triple;

public class FBBlockRegisterer {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(FakeBlocks.MODID);
    public static final Map<String, Triple<DeferredBlock<Block>, BlockTextureData, Block>> FAKE_BLOCKS = new HashMap<>();

    public static void registerFakeBlock(String name, Block baseBlock, BlockTextureData textureData) {
        DeferredBlock<Block> fakeBlock = registerBlock(name, () ->
                        new Block(BlockBehaviour.Properties.ofFullCopy(baseBlock).noCollission()));
        FAKE_BLOCKS.put(name, Triple.of(fakeBlock, textureData, baseBlock));
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        FBItemRegisterer.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        FakeBlockDefinitions.registerAll();
    }
}
