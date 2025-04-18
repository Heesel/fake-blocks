package dev.hesselp.fakeblocks.datagen;

import dev.hesselp.fakeblocks.FakeBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = FakeBlocks.MODID, bus = EventBusSubscriber.Bus.MOD)
public class Datagenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        PackOutput packOutput = dataGenerator.getPackOutput();

        dataGenerator.addProvider(event.includeClient(), new FBBlockStateProvider(packOutput, event.getExistingFileHelper()));
        dataGenerator.addProvider(event.includeClient(), new FBItemModelProvider(packOutput, event.getExistingFileHelper()));
    }
}
