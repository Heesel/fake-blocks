package dev.hesselp.fakeblocks.datagen;

import dev.hesselp.fakeblocks.block.BlockTextureData;
import dev.hesselp.fakeblocks.block.FBBlockRegisterer;
import dev.hesselp.fakeblocks.item.FBItemRegisterer;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;

public class FBRecipeProvider extends RecipeProvider {
    private static final Logger LOGGER = LogUtils.getLogger();
    public FBRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        FBBlockRegisterer.FAKE_BLOCKS.forEach((fakeName, triple) -> {
            ItemLike fakeItem = triple.getLeft().get();

            BlockTextureData textureData = triple.getMiddle();
            String baseName = textureData.getBaseName();

            ResourceLocation baseId = ResourceLocation.fromNamespaceAndPath("minecraft", baseName);
            Block baseBlock = BuiltInRegistries.BLOCK.get(baseId);

            if (baseBlock == Blocks.AIR) {
                LOGGER.warn("FakeBlocks: Could not find base block '{}' for recipe of '{}', skipping.", baseName, fakeName);
                return;
            }
            
            ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, fakeItem, 1)
                    .requires(baseBlock) // base block
                    .requires(FBItemRegisterer.NO_COLLISION_DUST.get()) // dust
                    .unlockedBy("has_base_block", has(baseBlock))
                    .unlockedBy("has_no_collision_dust", has(FBItemRegisterer.NO_COLLISION_DUST.get()))
                    .save(output, ResourceLocation.fromNamespaceAndPath("fakeblocks", "craft/" + fakeName));
        });
    }
}
