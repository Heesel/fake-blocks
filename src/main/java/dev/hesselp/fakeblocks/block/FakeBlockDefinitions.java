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
                .texture("particle", "block/dirt")
                .texture("overlay", "block/grass_block_side_overlay")
                .texture("side", "block/grass_block_side")
                .tintFace(Direction.UP, 0)
                .uv(Direction.UP,    0f, 0f, 16f, 16f)
                .uv(Direction.DOWN,  0f, 0f, 16f, 16f)
                .uv(Direction.NORTH, 0f, 0f, 16f, 16f)
                .uv(Direction.SOUTH, 0f, 0f, 16f, 16f)
                .uv(Direction.WEST,  0f, 0f, 16f, 16f)
                .uv(Direction.EAST,  0f, 0f, 16f, 16f)
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
                .name("fake_coal_block")
                .base(Blocks.COAL_BLOCK)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/coal_block")
                .register();

        new FakeBlockBuilder()
                .name("fake_copper_block")
                .base(Blocks.COPPER_BLOCK)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/copper_block")
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

        new FakeBlockBuilder()
                .name("fake_stone_bricks")
                .base(Blocks.STONE_BRICKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/stone_bricks")
                .register();

        new FakeBlockBuilder()
                .name("fake_bedrock")
                .base(Blocks.BEDROCK)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/bedrock")
                .register();

        new FakeBlockBuilder()
                .name("fake_oak_planks")
                .base(Blocks.OAK_PLANKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/oak_planks")
                .register();

        new FakeBlockBuilder()
                .name("fake_spruce_planks")
                .base(Blocks.SPRUCE_PLANKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/spruce_planks")
                .register();

        new FakeBlockBuilder()
                .name("fake_birch_planks")
                .base(Blocks.BIRCH_PLANKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/birch_planks")
                .register();

        new FakeBlockBuilder()
                .name("fake_jungle_planks")
                .base(Blocks.JUNGLE_PLANKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/jungle_planks")
                .register();

        new FakeBlockBuilder()
                .name("fake_acacia_planks")
                .base(Blocks.ACACIA_PLANKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/acacia_planks")
                .register();

        new FakeBlockBuilder()
                .name("fake_dark_oak_planks")
                .base(Blocks.DARK_OAK_PLANKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/dark_oak_planks")
                .register();

        new FakeBlockBuilder()
                .name("fake_mangrove_planks")
                .base(Blocks.MANGROVE_PLANKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/mangrove_planks")
                .register();

        new FakeBlockBuilder()
                .name("fake_cherry_planks")
                .base(Blocks.CHERRY_PLANKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/cherry_planks")
                .register();

        new FakeBlockBuilder()
                .name("fake_bamboo_planks")
                .base(Blocks.BAMBOO_PLANKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/bamboo_planks")
                .register();

        new FakeBlockBuilder()
                .name("fake_crimson_planks")
                .base(Blocks.CRIMSON_PLANKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/crimson_planks")
                .register();

        new FakeBlockBuilder()
                .name("fake_warped_planks")
                .base(Blocks.WARPED_PLANKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/warped_planks")
                .register();

        new FakeBlockBuilder()
                .name("fake_ice")
                .base(Blocks.ICE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/ice")
                .register();

        new FakeBlockBuilder()
                .name("fake_packed_ice")
                .base(Blocks.PACKED_ICE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/packed_ice")
                .register();

        new FakeBlockBuilder()
                .name("fake_blue_ice")
                .base(Blocks.BLUE_ICE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/blue_ice")
                .register();

        new FakeBlockBuilder()
                .name("fake_end_stone")
                .base(Blocks.END_STONE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/end_stone")
                .register();

        new FakeBlockBuilder()
                .name("fake_end_stone_bricks")
                .base(Blocks.END_STONE_BRICKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/end_stone_bricks")
                .register();

        new FakeBlockBuilder()
                .name("fake_smooth_stone")
                .base(Blocks.SMOOTH_STONE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/smooth_stone")
                .register();

        new FakeBlockBuilder()
                .name("fake_deepslate")
                .base(Blocks.DEEPSLATE)
                .modelType(BlockTextureData.ModelType.CUBE_COLUMN)
                .texture("end", "block/deepslate_top")
                .texture("side", "block/deepslate")
                .register();

        new FakeBlockBuilder()
                .name("fake_deepslate_bricks")
                .base(Blocks.DEEPSLATE_BRICKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/deepslate_bricks")
                .register();

        new FakeBlockBuilder()
                .name("fake_tuff")
                .base(Blocks.TUFF)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/tuff")
                .register();

        new FakeBlockBuilder()
                .name("fake_sandstone")
                .base(Blocks.SANDSTONE)
                .modelType(BlockTextureData.ModelType.CUBE_BOTTOM_TOP)
                .texture("bottom", "block/sandstone_bottom")
                .texture("side", "block/sandstone")
                .texture("top", "block/sandstone_top")
                .register();

        new FakeBlockBuilder()
                .name("fake_smooth_sandstone")
                .base(Blocks.SMOOTH_SANDSTONE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/sandstone_top")
                .register();

        new FakeBlockBuilder()
                .name("fake_nether_bricks")
                .base(Blocks.NETHER_BRICKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/nether_bricks")
                .register();

        new FakeBlockBuilder()
                .name("fake_bricks")
                .base(Blocks.BRICKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/bricks")
                .register();

        new FakeBlockBuilder()
                .name("fake_redstone_block")
                .base(Blocks.REDSTONE_BLOCK)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/redstone_block")
                .register();

        new FakeBlockBuilder()
                .name("fake_clay")
                .base(Blocks.CLAY)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/clay")
                .register();

        new FakeBlockBuilder()
                .name("fake_cobbled_deepslate")
                .base(Blocks.COBBLED_DEEPSLATE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/cobbled_deepslate")
                .register();

        new FakeBlockBuilder()
                .name("fake_white_wool")
                .base(Blocks.WHITE_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/white_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_orange_wool")
                .base(Blocks.ORANGE_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/orange_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_magenta_wool")
                .base(Blocks.MAGENTA_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/magenta_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_light_blue_wool")
                .base(Blocks.LIGHT_BLUE_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/light_blue_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_yellow_wool")
                .base(Blocks.YELLOW_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/yellow_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_lime_wool")
                .base(Blocks.LIME_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/lime_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_pink_wool")
                .base(Blocks.PINK_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/pink_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_gray_wool")
                .base(Blocks.GRAY_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/gray_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_light_gray_wool")
                .base(Blocks.LIGHT_GRAY_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/light_gray_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_cyan_wool")
                .base(Blocks.CYAN_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/cyan_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_purple_wool")
                .base(Blocks.PURPLE_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/purple_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_blue_wool")
                .base(Blocks.BLUE_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/blue_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_brown_wool")
                .base(Blocks.BROWN_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/brown_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_green_wool")
                .base(Blocks.GREEN_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/green_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_red_wool")
                .base(Blocks.RED_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/red_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_black_wool")
                .base(Blocks.BLACK_WOOL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/black_wool")
                .register();

        new FakeBlockBuilder()
                .name("fake_terracotta")
                .base(Blocks.TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_white_terracotta")
                .base(Blocks.WHITE_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/white_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_orange_terracotta")
                .base(Blocks.ORANGE_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/orange_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_magenta_terracotta")
                .base(Blocks.MAGENTA_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/magenta_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_light_blue_terracotta")
                .base(Blocks.LIGHT_BLUE_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/light_blue_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_yellow_terracotta")
                .base(Blocks.YELLOW_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/yellow_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_lime_terracotta")
                .base(Blocks.LIME_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/lime_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_pink_terracotta")
                .base(Blocks.PINK_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/pink_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_gray_terracotta")
                .base(Blocks.GRAY_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/gray_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_light_gray_terracotta")
                .base(Blocks.LIGHT_GRAY_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/light_gray_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_cyan_terracotta")
                .base(Blocks.CYAN_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/cyan_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_purple_terracotta")
                .base(Blocks.PURPLE_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/purple_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_blue_terracotta")
                .base(Blocks.BLUE_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/blue_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_brown_terracotta")
                .base(Blocks.BROWN_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/brown_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_green_terracotta")
                .base(Blocks.GREEN_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/green_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_red_terracotta")
                .base(Blocks.RED_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/red_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_black_terracotta")
                .base(Blocks.BLACK_TERRACOTTA)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/black_terracotta")
                .register();

        new FakeBlockBuilder()
                .name("fake_white_concrete")
                .base(Blocks.WHITE_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/white_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_orange_concrete")
                .base(Blocks.ORANGE_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/orange_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_magenta_concrete")
                .base(Blocks.MAGENTA_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/magenta_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_light_blue_concrete")
                .base(Blocks.LIGHT_BLUE_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/light_blue_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_yellow_concrete")
                .base(Blocks.YELLOW_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/yellow_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_lime_concrete")
                .base(Blocks.LIME_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/lime_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_pink_concrete")
                .base(Blocks.PINK_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/pink_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_gray_concrete")
                .base(Blocks.GRAY_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/gray_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_light_gray_concrete")
                .base(Blocks.LIGHT_GRAY_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/light_gray_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_cyan_concrete")
                .base(Blocks.CYAN_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/cyan_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_purple_concrete")
                .base(Blocks.PURPLE_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/purple_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_blue_concrete")
                .base(Blocks.BLUE_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/blue_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_brown_concrete")
                .base(Blocks.BROWN_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/brown_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_green_concrete")
                .base(Blocks.GREEN_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/green_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_red_concrete")
                .base(Blocks.RED_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/red_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_black_concrete")
                .base(Blocks.BLACK_CONCRETE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/black_concrete")
                .register();

        new FakeBlockBuilder()
                .name("fake_red_sand")
                .base(Blocks.RED_SAND)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/red_sand")
                .register();

        new FakeBlockBuilder()
                .name("fake_soul_sand")
                .base(Blocks.SOUL_SAND)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/soul_sand")
                .register();

        new FakeBlockBuilder()
                .name("fake_soul_soil")
                .base(Blocks.SOUL_SOIL)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/soul_soil")
                .register();

        new FakeBlockBuilder()
                .name("fake_magma_block")
                .base(Blocks.MAGMA_BLOCK)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/magma")
                .register();

        new FakeBlockBuilder()
                .name("fake_crying_obsidian")
                .base(Blocks.CRYING_OBSIDIAN)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/crying_obsidian")
                .register();

        new FakeBlockBuilder()
                .name("fake_blackstone")
                .base(Blocks.BLACKSTONE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/blackstone")
                .register();

        new FakeBlockBuilder()
                .name("fake_coal_ore")
                .base(Blocks.COAL_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/coal_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_deepslate_coal_ore")
                .base(Blocks.DEEPSLATE_COAL_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/deepslate_coal_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_iron_ore")
                .base(Blocks.IRON_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/iron_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_deepslate_iron_ore")
                .base(Blocks.DEEPSLATE_IRON_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/deepslate_iron_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_copper_ore")
                .base(Blocks.COPPER_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/copper_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_deepslate_copper_ore")
                .base(Blocks.DEEPSLATE_COPPER_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/deepslate_copper_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_gold_ore")
                .base(Blocks.GOLD_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/gold_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_deepslate_gold_ore")
                .base(Blocks.DEEPSLATE_GOLD_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/deepslate_gold_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_nether_gold_ore")
                .base(Blocks.NETHER_GOLD_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/nether_gold_ore")
                .register();

//        new FakeBlockBuilder()
//                .name("fake_redstone_ore")
//                .base(Blocks.REDSTONE_ORE)
//                .modelType(BlockTextureData.ModelType.CUBE_ALL)
//                .texture("all", "block/redstone_ore")
//                .register();

//        new FakeBlockBuilder()
//                .name("fake_deepslate_redstone_ore")
//                .base(Blocks.DEEPSLATE_REDSTONE_ORE)
//                .modelType(BlockTextureData.ModelType.CUBE_ALL)
//                .texture("all", "block/deepslate_redstone_ore")
//                .register();

        new FakeBlockBuilder()
                .name("fake_lapis_ore")
                .base(Blocks.LAPIS_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/lapis_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_deepslate_lapis_ore")
                .base(Blocks.DEEPSLATE_LAPIS_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/deepslate_lapis_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_diamond_ore")
                .base(Blocks.DIAMOND_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/diamond_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_deepslate_diamond_ore")
                .base(Blocks.DEEPSLATE_DIAMOND_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/deepslate_diamond_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_emerald_ore")
                .base(Blocks.EMERALD_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/emerald_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_deepslate_emerald_ore")
                .base(Blocks.DEEPSLATE_EMERALD_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/deepslate_emerald_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_nether_quartz_ore")
                .base(Blocks.NETHER_QUARTZ_ORE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/nether_quartz_ore")
                .register();

        new FakeBlockBuilder()
                .name("fake_ancient_debris")
                .base(Blocks.ANCIENT_DEBRIS)
                .modelType(BlockTextureData.ModelType.CUBE_COLUMN)
                .texture("side", "block/ancient_debris_side")
                .texture("end", "block/ancient_debris_top")
                .register();

        new FakeBlockBuilder()
                .name("fake_deepslate_tiles")
                .base(Blocks.DEEPSLATE_TILES)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/deepslate_tiles")
                .register();

        new FakeBlockBuilder()
                .name("fake_tuff_bricks")
                .base(Blocks.TUFF_BRICKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/tuff_bricks")
                .register();

        new FakeBlockBuilder()
                .name("fake_polished_tuff")
                .base(Blocks.POLISHED_TUFF)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/polished_tuff")
                .register();

        new FakeBlockBuilder()
                .name("fake_polished_diorite")
                .base(Blocks.POLISHED_DIORITE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/polished_diorite")
                .register();

        new FakeBlockBuilder()
                .name("fake_polished_andesite")
                .base(Blocks.POLISHED_ANDESITE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/polished_andesite")
                .register();

        new FakeBlockBuilder()
                .name("fake_polished_deepslate")
                .base(Blocks.POLISHED_DEEPSLATE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/polished_deepslate")
                .register();

        new FakeBlockBuilder()
                .name("fake_reinforced_deepslate")
                .base(Blocks.REINFORCED_DEEPSLATE)
                .modelType(BlockTextureData.ModelType.CUBE_BOTTOM_TOP)
                .texture("side", "block/reinforced_deepslate_side")
                .texture("top", "block/reinforced_deepslate_top")
                .texture("bottom", "block/reinforced_deepslate_bottom")
                .register();

        new FakeBlockBuilder()
                .name("fake_polished_granite")
                .base(Blocks.POLISHED_GRANITE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/polished_granite")
                .register();

        new FakeBlockBuilder()
                .name("fake_mossy_stone_bricks")
                .base(Blocks.MOSSY_STONE_BRICKS)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/mossy_stone_bricks")
                .register();

        new FakeBlockBuilder()
                .name("fake_mossy_cobblestone")
                .base(Blocks.MOSSY_COBBLESTONE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/mossy_cobblestone")
                .register();

        new FakeBlockBuilder()
                .name("fake_smooth_red_sandstone")
                .base(Blocks.SMOOTH_RED_SANDSTONE)
                .modelType(BlockTextureData.ModelType.CUBE_ALL)
                .texture("all", "block/red_sandstone_top")
                .register();

        new FakeBlockBuilder()
                .name("fake_tnt")
                .base(Blocks.TNT)
                .modelType(BlockTextureData.ModelType.CUBE_BOTTOM_TOP)
                .texture("bottom", "block/tnt_bottom")
                .texture("side", "block/tnt_side")
                .texture("top", "block/tnt_top")
                .register();



    }
}
