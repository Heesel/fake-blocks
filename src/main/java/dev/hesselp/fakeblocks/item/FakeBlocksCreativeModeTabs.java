package dev.hesselp.fakeblocks.item;

import dev.hesselp.fakeblocks.FakeBlocks;
import dev.hesselp.fakeblocks.block.FBBlockRegisterer;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FakeBlocksCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FakeBlocks.MODID);

    public static final Supplier<CreativeModeTab> FAKE_BLOCKS_ITEM_TAB = CREATIVE_MODE_TAB.register("fake_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.DIRT))
                    .title(Component.translatable("creativetab.fakeblocks.menu"))
                    .displayItems((itemDisplayParameters, output) -> {
                        FBBlockRegisterer.FAKE_BLOCKS.forEach((name, pair) -> {
                            DeferredBlock<?> block = pair.getLeft();
                            output.accept(block.get().asItem());
                        });
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
