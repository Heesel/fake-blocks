package dev.hesselp.fakeblocks.block;

import java.util.Map;

public class BlockTextureData {
    private final String baseName;
    private final ModelType modelType;
    private final Map<String, String> textures;


    public BlockTextureData(String baseName, ModelType modelType, Map<String, String> textures) {
        this.baseName = baseName;
        this.modelType = modelType;
        this.textures = textures;
    }

    // Getters
    public String getBaseName() { return baseName; }
    public ModelType getModelType() { return modelType; }
    public Map<String, String> getTextures() { return textures; }

    public enum ModelType {
        CUBE,
        CUBE_ALL,
        CUBE_BOTTOM_TOP,
        CUBE_COLUMN,
        CUBE_TOP,
        CUBE_COLUMN_HORIZONTAL
        // Add more as needed
    }
}
