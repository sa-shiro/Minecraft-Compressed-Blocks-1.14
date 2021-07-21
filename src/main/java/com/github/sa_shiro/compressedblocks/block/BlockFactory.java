package com.github.sa_shiro.compressedblocks.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

public class BlockFactory {

    private final BlockType type;
    private final String registryName;
    private final Material material;
    private final SoundType soundType;
    private int dustColor;
    private MaterialColor materialColor, materialColorSide, materialColorEnd;
    private String textureSide, textureEnd, textureParticle, textureDown, textureUp, textureNorth, textureSouth, textureEast, textureWest, namespace = null;
    private boolean hasCustomTexture = false, hasRotation = false, isLogBlock = false;

    /**
     * Utility to create new Blocks to iterate over for registering
     *
     * @param typeIn          {@link BlockType}
     * @param registryNameIn  Registry Name
     * @param materialIn      Minecraft {@link Material}
     * @param materialColorIn Minecraft {@link MaterialColor}
     * @param soundTypeIn     Minecraft {@link SoundType}
     */
    @ParametersAreNonnullByDefault
    public BlockFactory(BlockType typeIn, String registryNameIn, Material materialIn, @Nullable MaterialColor materialColorIn, SoundType soundTypeIn) {
        if (materialColorIn == null) materialColorIn = materialIn.getColor();
        this.type = typeIn;
        this.registryName = registryNameIn;
        this.dustColor = 0;
        this.material = materialIn;
        this.materialColor = materialColorIn;
        this.soundType = soundTypeIn;
    }

    /**
     * Utility to create new Blocks to iterate over for registering
     *
     * @param typeIn          {@link BlockType}
     * @param registryNameIn  Registry Name
     * @param dustColorIn     Dust Color (used for sand and co)
     * @param materialIn      Minecraft {@link Material}
     * @param materialColorIn Minecraft {@link MaterialColor}
     * @param soundTypeIn     Minecraft {@link SoundType}
     */
    @ParametersAreNonnullByDefault
    public BlockFactory(BlockType typeIn, String registryNameIn, int dustColorIn, Material materialIn, @Nullable MaterialColor materialColorIn, SoundType soundTypeIn) {
        if (materialColorIn == null) materialColorIn = materialIn.getColor();
        this.type = typeIn;
        this.registryName = registryNameIn;
        this.dustColor = dustColorIn;
        this.material = materialIn;
        this.materialColor = materialColorIn;
        this.soundType = soundTypeIn;
    }

    @ParametersAreNonnullByDefault
    public BlockFactory(@Nonnull BlockType typeIn, String registryNameIn, Material materialIn, SoundType soundTypeIn) {
        this.type = typeIn;
        this.registryName = registryNameIn;
        this.material = materialIn;
        this.soundType = soundTypeIn;
    }

    /**
     * Function to get the Block's Type
     *
     * @return {@link BlockType}
     */
    public BlockType getType() {
        return type;
    }

    /**
     * Function to get the Block's Registry Name
     *
     * @return Registry Name
     */
    public String getRegistryName() {
        return registryName;
    }

    /**
     * Function to get the Block's Dust Color
     *
     * @return Dust Color
     */
    public int getDustColor() {
        return dustColor;
    }

    /**
     * Function to get the Block's Material
     *
     * @return Minecraft {@link Material}
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Function to get the Block's Material Color
     *
     * @return {@link MaterialColor}
     */
    public MaterialColor getMaterialColor() {
        return materialColor;
    }

    public BlockFactory setMaterialColor(MaterialColor materialColorSide, MaterialColor materialColorEnd) {
        this.materialColorSide = materialColorSide;
        this.materialColorEnd = materialColorEnd;
        return this;
    }

    public MaterialColor getMaterialColorEnd() {
        return materialColorEnd;
    }

    public MaterialColor getMaterialColorSide() {
        return materialColorSide;
    }

    /**
     * Function to get the Block's Sound Type
     *
     * @return Minecraft {@link SoundType}
     */
    public SoundType getSoundType() {
        return soundType;
    }

    /**
     * Function to check if the Block has a custom Texture
     *
     * @return true if it has a custom Texture set
     */
    public boolean getHasCustomTexture() {
        return hasCustomTexture;
    }

    public String getTexturePath() {
        return namespace == null ? "minecraft" : namespace;
    }

    @ParametersAreNonnullByDefault
    public BlockFactory setCustomTexture(String particle, String side, String end) {
        hasCustomTexture = true;
        textureSide = side;
        textureEnd = end;
        return setCustomTexture(getTexturePath(), particle, end, end, side, side, side, side);
    }

    @ParametersAreNonnullByDefault
    public BlockFactory setCustomTexture(String particle, String down, String up, String north, String south, String east, String west) {
        return setCustomTexture(getTexturePath(), particle, down, up, north, south, east, west);
    }

    @ParametersAreNonnullByDefault
    public BlockFactory setCustomTexture(@Nullable String modID, String particle, String down, String up, String north, String south, String east, String west) {
        namespace = modID;
        hasCustomTexture = true;
        textureParticle = particle;
        textureDown = down;
        textureUp = up;
        textureNorth = north;
        textureSouth = south;
        textureEast = east;
        textureWest = west;
        return this;
    }

    public String getCustomTexture(TextureLocation location) {
        switch (location) {
            case DOWN:
                return textureDown;
            case NORTH:
                return textureNorth;
            case SOUTH:
                return textureSouth;
            case EAST:
                return textureEast;
            case WEST:
                return textureWest;
            case PARTICLE:
                return textureParticle;
            case SIDE:
                return textureSide;
            case END:
                return textureEnd;
            case UP:
            default:
                return textureUp;
        }
    }

    public boolean getHasRotation() {
        return hasRotation;
    }

    public BlockFactory hasRotation() {
        hasRotation = true;
        return this;
    }

    public BlockFactory isLogBlock() {
        isLogBlock = true;
        return this;
    }

    public boolean getIsLogBlock() {
        return isLogBlock;
    }

    public enum TextureLocation {
        ALL, PARTICLE,
        UP, DOWN,
        NORTH, SOUTH, EAST, WEST,
        SIDE, END;

        TextureLocation() {
        }
    }
}
