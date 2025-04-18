package dev.hesselp.fakeblocks.datagen;

import dev.hesselp.fakeblocks.FakeBlocks;
import dev.hesselp.fakeblocks.block.FBBlockRegisterer;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class FBItemModelProvider extends ItemModelProvider {

    public FBItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FakeBlocks.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        FBBlockRegisterer.FAKE_BLOCKS.forEach((name, block) -> {
            String baseName = name.replace("fake_", "");
            withExistingParent(name, ResourceLocation.fromNamespaceAndPath("minecraft","block/" + baseName));
        });
    }
}
