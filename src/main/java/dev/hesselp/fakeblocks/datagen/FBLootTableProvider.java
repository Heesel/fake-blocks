package dev.hesselp.fakeblocks.datagen;

import dev.hesselp.fakeblocks.block.FBBlockRegisterer;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import java.util.Set;

public class FBLootTableProvider extends BlockLootSubProvider {

    public FBLootTableProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        FBBlockRegisterer.FAKE_BLOCKS.forEach((name, triple) -> {
            Block fakeBlock = triple.getLeft().get();
            if (!fakeBlock.getLootTable().equals(BuiltInLootTables.EMPTY)) {
                this.dropSelf(fakeBlock);
            }
        });
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return FBBlockRegisterer.FAKE_BLOCKS.values().stream()
                .map(triple -> (Block) triple.getLeft().get())
                .filter(block -> !block.getLootTable().equals(BuiltInLootTables.EMPTY))
                .toList();
    }
}
