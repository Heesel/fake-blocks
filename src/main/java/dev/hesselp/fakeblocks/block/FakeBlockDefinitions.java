package dev.hesselp.fakeblocks.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Blocks;

public class FakeBlockDefinitions {
    public static void registerAll() {
        new FakeBlockBuilder()
                .name("fake_dirt")
                .base(Blocks.DIRT)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/dirt")
                .register();

        new FakeBlockBuilder()
                .name("fake_stone")
                .base(Blocks.STONE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/stone")
                .register();

        new FakeBlockBuilder()
                .name("fake_granite")
                .base(Blocks.GRANITE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/granite")
                .register();

        new FakeBlockBuilder()
                .name("fake_diorite")
                .base(Blocks.GRANITE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/diorite")
                .register();

        new FakeBlockBuilder()
                .name("fake_sand")
                .base(Blocks.SAND)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/sand")
                .register();

        new FakeBlockBuilder()
                .name("fake_gravel")
                .base(Blocks.GRAVEL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/gravel")
                .register();

        new FakeBlockBuilder()
                .name("fake_obsidian")
                .base(Blocks.OBSIDIAN)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/obsidian")
                .register();

        new FakeBlockBuilder()
                .name("fake_netherrack")
                .base(Blocks.NETHERRACK)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/netherrack")
                .register();

        new FakeBlockBuilder()
                .name("fake_grass_block")
                .base(Blocks.GRASS_BLOCK)
                .modelType(BlockTextureData.ModelType.CUBE)
                .texture("down", "block/dirt")
                .texture("up", "block/grass_block_top")
                .texture("north", "block/grass_block_side")
                .texture("south", "block/grass_block_side")
                .texture("west", "block/grass_block_side")
                .texture("east", "block/grass_block_side")
                .tintFace(Direction.UP, 0)
                .register();

        new FakeBlockBuilder()
                .name("fake_cobblestone")
                .base(Blocks.COBBLESTONE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/cobblestone")
                .register();

        new FakeBlockBuilder()
                .name("fake_iron_block")
                .base(Blocks.IRON_BLOCK)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/iron_block")
                .register();

        new FakeBlockBuilder()
                .name("fake_gold_block")
                .base(Blocks.GOLD_BLOCK)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/gold_block")
                .register();

        new FakeBlockBuilder()
                .name("fake_diamond_block")
                .base(Blocks.DIAMOND_BLOCK)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/diamond_block")
                .register();

        new FakeBlockBuilder()
                .name("fake_emerald_block")
                .base(Blocks.EMERALD_BLOCK)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/emerald_block")
                .register();

        new FakeBlockBuilder()
                .name("fake_netherite_block")
                .base(Blocks.NETHERITE_BLOCK)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/netherite_block")
                .register();

        new FakeBlockBuilder()
                .name("fake_andesite")
                .base(Blocks.ANDESITE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/andesite")
                .register();
    }
}
