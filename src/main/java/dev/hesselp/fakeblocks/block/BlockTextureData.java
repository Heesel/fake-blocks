package dev.hesselp.fakeblocks.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class BlockTextureData {
    private final String baseName;
    private final ModelType modelType;
    private final Map<String, String> textures;
    private final Block baseBlock;
    private final Map<Direction, Integer> tintedFaces; // new field
    private final Map<Direction, float[]> faceUvs; // new field


    public BlockTextureData(String baseName, ModelType modelType, Map<String, String> textures, Block baseBlock, Map<Direction, Integer> tintedFaces, Map<Direction, float[]> faceUvs) {
        this.baseName = baseName;
        this.modelType = modelType;
        this.textures = textures;
        this.baseBlock = baseBlock;
        this.tintedFaces = tintedFaces;
        this.faceUvs = faceUvs;

    }

    // Getters
    public String getBaseName() { return baseName; }
    public ModelType getModelType() { return modelType; }
    public Map<String, String> getTextures() { return textures; }
    public Block getBaseBlock() { return baseBlock; }
    public Map<Direction, Integer> getTintedFaces() { return tintedFaces; }
    public Map<Direction, float[]> getFaceUvs() { return faceUvs; }


    public enum ModelType {
        CUBE,
        CUBE_ALL,
        CUBE_BOTTOM_TOP,
        CUBE_COLUMN,
        CUBE_TOP,
        CUBE_COLUMN_HORIZONTAL
    }
}

