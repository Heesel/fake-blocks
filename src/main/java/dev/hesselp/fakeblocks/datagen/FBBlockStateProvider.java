package dev.hesselp.fakeblocks.datagen;

import dev.hesselp.fakeblocks.FakeBlocks;
import dev.hesselp.fakeblocks.block.FBBlockRegisterer;
import dev.hesselp.fakeblocks.block.BlockTextureData;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class FBBlockStateProvider extends BlockStateProvider {
    public FBBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FakeBlocks.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        FBBlockRegisterer.FAKE_BLOCKS.forEach((name, pair) -> {
            DeferredBlock<?> block = pair.getLeft();
            BlockTextureData textureData = pair.getRight();

            switch(textureData.getModelType()) {
                case CUBE:
                    simpleBlockWithItem(block.get(), models().cube(name,
                            resourceLocation(textureData.getTextures().get("down")),
                            resourceLocation(textureData.getTextures().get("up")),
                            resourceLocation(textureData.getTextures().get("north")),
                            resourceLocation(textureData.getTextures().get("south")),
                            resourceLocation(textureData.getTextures().get("west")),
                            resourceLocation(textureData.getTextures().get("east"))
                            ));
                    break;
                case CUBE_ALL:
                    simpleBlockWithItem(block.get(), models().cubeAll(name, resourceLocation(textureData.getTextures().get("all"))));
                    break;
                case CUBE_BOTTOM_TOP:
                    simpleBlockWithItem(block.get(), models().cubeBottomTop(name,
                            ResourceLocation.fromNamespaceAndPath("minecraft",textureData.getTextures().get("bottom")),
                            ResourceLocation.fromNamespaceAndPath("minecraft",textureData.getTextures().get("top")),
                            ResourceLocation.fromNamespaceAndPath("minecraft",textureData.getTextures().get("side"))));
                    break;
                case CUBE_COLUMN:
                    simpleBlockWithItem(block.get(), models().cubeColumn(name, resourceLocation(textureData.getTextures().get("side")), resourceLocation(textureData.getTextures().get("end"))));
                    break;

                case CUBE_TOP:
                    simpleBlockWithItem(block.get(), models().cubeTop(name, resourceLocation(textureData.getTextures().get("top")), resourceLocation(textureData.getTextures().get("side"))));
                    break;
                case CUBE_COLUMN_HORIZONTAL:

                    simpleBlockWithItem(block.get(), models().cubeColumnHorizontal(name, resourceLocation(textureData.getTextures().get("side")), resourceLocation(textureData.getTextures().get("end"))));
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + textureData.getModelType());
            }
        });
//        FBBlockRegisterer.FAKE_BLOCKS.forEach((name, block) -> {
//            String baseName = name.replace("fake_", "");
//            block(block, baseName);
//        });
    }

    private ResourceLocation resourceLocation (String path) {
        return ResourceLocation.fromNamespaceAndPath("minecraft", path);
    }
}
