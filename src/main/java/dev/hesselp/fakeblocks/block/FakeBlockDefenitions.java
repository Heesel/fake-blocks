package dev.hesselp.fakeblocks.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class FakeBlockDefenitions {
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
                .name("fake_obsidian")
                .base(Blocks.OBSIDIAN)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/obsidian")
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
                .register();

        new FakeBlockBuilder()
                .name("fake_cobblestone")
                .base(Blocks.COBBLESTONE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/cobblestone")
                .register();
    }
}
