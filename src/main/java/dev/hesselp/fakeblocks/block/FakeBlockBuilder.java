package dev.hesselp.fakeblocks.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;

import java.util.*;

public class FakeBlockBuilder {
    private String name;
    private Block baseBlock;
    private BlockTextureData.ModelType modelType;
    private final Map<String, String> textures = new HashMap<>();
    private final Map<Direction, Integer> faceTints = new HashMap<>();
    private final Map<Direction, float[]> faceUvs = new HashMap<>(); // [u1, v1, u2, v2]
    private BlockTextureData.RenderType renderType = BlockTextureData.RenderType.SOLID; // default

    public FakeBlockBuilder renderType(BlockTextureData.RenderType renderType) {
        this.renderType = renderType;
        return this;
    }

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

    public FakeBlockBuilder tintFace(Direction dir, int tintIndex) {
        faceTints.put(dir, tintIndex);
        return this;
    }

    public FakeBlockBuilder tintFaces(int tintIndex, Direction... dirs) {
        for (Direction dir : dirs) {
            faceTints.put(dir, tintIndex);
        }
        return this;
    }

    public Map<Direction, Integer> getFaceTints() {
        return Collections.unmodifiableMap(faceTints);
    }

    public FakeBlockBuilder uv(Direction dir, float u1, float v1, float u2, float v2) {
        faceUvs.put(dir, new float[] { u1, v1, u2, v2 });
        return this;
    }


    public void register() {
        FBBlockRegisterer.registerFakeBlock(
                name,
                baseBlock,
                new BlockTextureData(
                        name.replace("fake_", ""),
                        modelType,
                        textures,
                        baseBlock,
                        faceTints,
                        faceUvs,
                        renderType
                )
        );
    }
}
