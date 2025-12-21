package dev.hesselp.fakeblocks.client;

import dev.hesselp.fakeblocks.FakeBlocks;
import dev.hesselp.fakeblocks.block.FBBlockRegisterer;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = FakeBlocks.MODID, bus = EventBusSubscriber.Bus.MOD)
public class FBClient {

    @SubscribeEvent
    public static void onRegisterBlockColors(RegisterColorHandlersEvent.Block event) {

        FBBlockRegisterer.FAKE_BLOCKS.forEach((name, pair) -> {
            Block fake = pair.getLeft().get();
            Block base = pair.getRight().getBaseBlock();

            event.register((state, level, pos, tintIndex) ->
                    event.getBlockColors().getColor(base.defaultBlockState(), level, pos, tintIndex), fake);
        });
    }

    @SubscribeEvent
    public static void onRegisterItemColors(RegisterColorHandlersEvent.Item event) {
        // Forward item tint to the base item's color logic
        FBBlockRegisterer.FAKE_BLOCKS.forEach((name, pair) -> {
            Block fake = pair.getLeft().get();
            Block base = pair.getRight().getBaseBlock();

            // Delegate to ItemColors using the base item's default stack
            event.register((stack, tintIndex) ->
                            event.getItemColors().getColor(base.asItem().getDefaultInstance(), tintIndex),
                    fake.asItem());
        });
    }
}
