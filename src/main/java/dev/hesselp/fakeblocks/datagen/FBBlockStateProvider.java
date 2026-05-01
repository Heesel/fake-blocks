package dev.hesselp.fakeblocks.datagen;

import dev.hesselp.fakeblocks.FakeBlocks;
import dev.hesselp.fakeblocks.block.FBBlockRegisterer;
import dev.hesselp.fakeblocks.block.BlockTextureData;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class FBBlockStateProvider extends BlockStateProvider {
    public FBBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FakeBlocks.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        FBBlockRegisterer.FAKE_BLOCKS.forEach((name, triple) -> {
            DeferredBlock<?> block = triple.getLeft();
            BlockTextureData textureData = triple.getMiddle();

            switch(textureData.getModelType()) {
                case CUBE:
                    BlockModelBuilder model = models().withExistingParent(name, "block/block")
                            .renderType("minecraft:cutout_mipped");

                    textureData.getTextures().forEach((key, path) -> {
                        model.texture(key, resourceLocation(path));
                    });

                    String particlePath = textureData.getTextures().getOrDefault("particle", textureData.getTextures().get("all"));
                    if (particlePath != null) {
                        model.texture("particle", resourceLocation(particlePath));
                    }

                    var baseElement = model.element().from(0, 0, 0).to(16, 16, 16);

                    baseElement.allFaces((dir, faceBuilder) -> {
                        String textureKey = dir.getName(); // "up", "north", etc.
                        faceBuilder.texture("#" + textureKey);

                        if(textureData.getTintedFaces().containsKey(dir)) {
                            faceBuilder.tintindex(textureData.getTintedFaces().get(dir));
                        }

                        if (textureData.getFaceUvs().containsKey(dir)) {
                            float[] uvs = textureData.getFaceUvs().get(dir);
                            faceBuilder.uvs(uvs[0], uvs[1], uvs[2], uvs[3]);
                        }

                        faceBuilder.cullface(dir);
                    });

                    String overlayPath = textureData.getTextures().get("overlay");
                    if (overlayPath != null) {
                        var overlayElement = model.element().from(0, 0, 0).to(16, 16, 16);
                        for (net.minecraft.core.Direction dir : net.minecraft.core.Direction.Plane.HORIZONTAL) {
                            var face = overlayElement.face(dir)
                                    .texture("#overlay")
                                    .cullface(dir)
                                    .tintindex(0); // Biome tint

                            // Align overlay UVs with the side UVs
                            if (textureData.getFaceUvs().containsKey(dir)) {
                                float[] uvs = textureData.getFaceUvs().get(dir);
                                face.uvs(uvs[0], uvs[1], uvs[2], uvs[3]);
                            }
                        }

                        model.texture("overlay", resourceLocation(overlayPath));
                    }

                    String sidePath = textureData.getTextures().get("side");
                    if (sidePath != null) {
                        model.texture("side", resourceLocation(sidePath));
                    }


                    waterloggedBlockWithItem(block.get(), model);
                    break;
                case CUBE_ALL:
                    String renderType = switch (textureData.getRenderType()) {
                        case CUTOUT -> "minecraft:cutout";
                        case CUTOUT_MIPPED -> "minecraft:cutout_mipped";
                        case TRANSLUCENT -> "minecraft:translucent";
                        default -> "minecraft:solid";
                    };

                    BlockModelBuilder cubeAllModel = models()
                            .cubeAll(name, resourceLocation(textureData.getTextures().get("all")))
                            .renderType(renderType);

                    waterloggedBlockWithItem(block.get(), cubeAllModel);
                    break;
                case CUBE_BOTTOM_TOP:
                    waterloggedBlockWithItem(block.get(), models().cubeBottomTop(name,
                            // NeoForge expects (side, bottom, top) for cubeBottomTop.
                            resourceLocation(textureData.getTextures().get("side")),
                            resourceLocation(textureData.getTextures().get("bottom")),
                            resourceLocation(textureData.getTextures().get("top"))));
                    break;
                case CUBE_COLUMN:
                    waterloggedBlockWithItem(block.get(), models().cubeColumn(name, resourceLocation(textureData.getTextures().get("side")), resourceLocation(textureData.getTextures().get("end"))));
                    break;

                case CUBE_TOP:
                    waterloggedBlockWithItem(block.get(), models().cubeTop(name, resourceLocation(textureData.getTextures().get("top")), resourceLocation(textureData.getTextures().get("side"))));
                    break;
                case CUBE_COLUMN_HORIZONTAL:

                    waterloggedBlockWithItem(block.get(), models().cubeColumnHorizontal(name, resourceLocation(textureData.getTextures().get("side")), resourceLocation(textureData.getTextures().get("end"))));
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + textureData.getModelType());
            }
        });
    }

    private ResourceLocation resourceLocation (String path) {
        return ResourceLocation.fromNamespaceAndPath("minecraft", path);
    }

    private void waterloggedBlockWithItem(Block block, BlockModelBuilder model) {
        getVariantBuilder(block).forAllStates(state -> {
            // Waterlogged doesn't affect model, just use the same model for all states
            return ConfiguredModel.builder().modelFile(model).build();
        });
        itemModels().withExistingParent(
                BuiltInRegistries.BLOCK.getKey(block).getPath(),
                modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block).getPath())
        );
    }
}
