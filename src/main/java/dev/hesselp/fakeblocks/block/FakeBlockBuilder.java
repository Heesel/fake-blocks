package dev.hesselp.fakeblocks.block;

import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class FakeBlockBuilder {
    private String name;
    private Block baseBlock;
    private BlockTextureData.ModelType modelType;
    private final Map<String, String> textures = new HashMap<>();
//    private boolean tinted = false;
//    private BlockColorFunction colorFunction = (i, w, p) -> -1;

    public FakeBlockBuilder name(String name) {
        this.name = name;
        return this;
    }

    public FakeBlockBuilder base(Block block) {
        this.baseBlock = block;
        return this;
    }

    public FakeBlockBuilder modelType(BlockTextureData.ModelType modelType) {
        this.modelType = modelType;
        return this;
    }

    public FakeBlockBuilder texture(String key, String value) {
        this.textures.put(key, value);
        return this;
    }

    public void register() {
        FBBlockRegisterer.registerFakeBlock(
                name,
                baseBlock,
                new BlockTextureData(
                        name.replace("fake_", ""),
                        modelType,
                        textures
                )
        );
    }
}
