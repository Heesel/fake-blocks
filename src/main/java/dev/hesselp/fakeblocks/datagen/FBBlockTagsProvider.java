package dev.hesselp.fakeblocks.datagen;

import dev.hesselp.fakeblocks.block.FBBlockRegisterer;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class FBBlockTagsProvider extends BlockTagsProvider {

    public FBBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        FBBlockRegisterer.FAKE_BLOCKS.forEach((name, data) -> {
            Block fakeBlock = data.getLeft().get();

            // Just mirror the base block into all four mineable tags —
            // NeoForge will only apply the ones that actually match at runtime
            tag(BlockTags.MINEABLE_WITH_PICKAXE).add(fakeBlock);
            tag(BlockTags.MINEABLE_WITH_SHOVEL).add(fakeBlock);
            tag(BlockTags.MINEABLE_WITH_AXE).add(fakeBlock);
            tag(BlockTags.MINEABLE_WITH_HOE).add(fakeBlock);
        });
    }
}
