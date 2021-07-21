package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.github.sa_shiro.compressedblocks.event.ModRegistryObjects;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class GenBlockStateProvider extends BlockStateProvider {
    public GenBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, CompressedBlocks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModelFile.UncheckedModelFile blockBlock = new ModelFile.UncheckedModelFile("block/block");
        ModelFile.UncheckedModelFile cubeColumn = new ModelFile.UncheckedModelFile("block/cube_column");
        ModelFile.UncheckedModelFile cubeColumnHorizontal = new ModelFile.UncheckedModelFile("block/cube_column_horizontal");
        assert false;

        for (BlockFactory factory : Lists.blockList) {
            for (RegistryObject<Block> block : ModRegistryObjects.BLOCK_REGISTRY) {
                String str = "";
                for (int i = 0; i <= 9; i++) {
                    if (block.get().getRegistryName().toString().contains("compressedblocks:c" + i)) {
                        str = block.get().getRegistryName().toString().replace("compressedblocks:c" + i + "_", "");
                    }
                }

                if (factory.getRegistryName().equals(str)) {
                    if (!factory.getHasCustomTexture() && !factory.getHasRotation()) {
                        simpleBlock(
                                block.get().getBlock(), models().cubeAll(
                                        block.get().getBlock().getRegistryName().toString(),
                                        getActualResourceLocation(factory.getRegistryName())
                                )
                                        .texture("particle", getActualResourceLocation(factory.getRegistryName()))
                                        .texture("overlay", getCompressionOverlay(block.get().getBlock().getRegistryName().toString()))
                                        .parent(blockBlock)
                                        .element()
                                        .from(0, 0, 0)
                                        .to(16, 16, 16)
                                        .face(Direction.DOWN).texture("#all").end()
                                        .face(Direction.UP).texture("#all").end()
                                        .face(Direction.NORTH).texture("#all").end()
                                        .face(Direction.SOUTH).texture("#all").end()
                                        .face(Direction.EAST).texture("#all").end()
                                        .face(Direction.WEST).texture("#all").end()
                                        .end()
                                        .element()
                                        .from(0, 0, 0)
                                        .to(16, 16, 16)
                                        .face(Direction.DOWN).texture("#overlay").end()
                                        .face(Direction.UP).texture("#overlay").end()
                                        .face(Direction.NORTH).texture("#overlay").end()
                                        .face(Direction.SOUTH).texture("#overlay").end()
                                        .face(Direction.EAST).texture("#overlay").end()
                                        .face(Direction.WEST).texture("#overlay").end()
                                        .end()
                        );

                    } else if (factory.getHasCustomTexture() && !factory.getHasRotation()) {
                        simpleBlock(
                                block.get().getBlock(), models().cube(
                                        block.get().getBlock().getRegistryName().toString(),
                                        new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.DOWN)),
                                        new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.UP)),
                                        new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.NORTH)),
                                        new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.SOUTH)),
                                        new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.EAST)),
                                        new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.WEST))
                                )
                                        .texture("particle", new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.PARTICLE)))
                                        .texture("overlay", getCompressionOverlay(block.get().getBlock().getRegistryName().toString()))
                                        .parent(blockBlock)
                                        .element()
                                        .from(0, 0, 0)
                                        .to(16, 16, 16)
                                        .face(Direction.DOWN).texture("#down").end()
                                        .face(Direction.UP).texture("#up").end()
                                        .face(Direction.NORTH).texture("#north").end()
                                        .face(Direction.SOUTH).texture("#south").end()
                                        .face(Direction.EAST).texture("#east").end()
                                        .face(Direction.WEST).texture("#west").end()
                                        .end()
                                        .element()
                                        .from(0, 0, 0)
                                        .to(16, 16, 16)
                                        .face(Direction.DOWN).texture("#overlay").end()
                                        .face(Direction.UP).texture("#overlay").end()
                                        .face(Direction.NORTH).texture("#overlay").end()
                                        .face(Direction.SOUTH).texture("#overlay").end()
                                        .face(Direction.EAST).texture("#overlay").end()
                                        .face(Direction.WEST).texture("#overlay").end()
                                        .end()
                        );
                    } else if (factory.getHasCustomTexture() && factory.getHasRotation()) {
                        axisBlock(
                                (RotatedPillarBlock) block.get().getBlock(),
                                models().cubeColumn(
                                        block.get().getBlock().getRegistryName().toString(),
                                        new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.SIDE)),
                                        new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.END))
                                )
                                        .texture("particle", new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.PARTICLE)))
                                        .texture("overlay", getCompressionOverlay(block.get().getBlock().getRegistryName().toString()))
                                        .parent(cubeColumn)
                                        .element()
                                        .from(0, 0, 0)
                                        .to(16, 16, 16)
                                        .face(Direction.DOWN).texture("#end").end()
                                        .face(Direction.UP).texture("#end").end()
                                        .face(Direction.NORTH).texture("#side").end()
                                        .face(Direction.SOUTH).texture("#side").end()
                                        .face(Direction.EAST).texture("#side").end()
                                        .face(Direction.WEST).texture("#side").end()
                                        .end()
                                        .element()
                                        .from(0, 0, 0)
                                        .to(16, 16, 16)
                                        .face(Direction.DOWN).texture("#overlay").end()
                                        .face(Direction.UP).texture("#overlay").end()
                                        .face(Direction.NORTH).texture("#overlay").end()
                                        .face(Direction.SOUTH).texture("#overlay").end()
                                        .face(Direction.EAST).texture("#overlay").end()
                                        .face(Direction.WEST).texture("#overlay").end()
                                        .end()
                                ,
                                models().cubeColumn(
                                        block.get().getBlock().getRegistryName().toString() + "_horizontal",
                                        new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.SIDE)),
                                        new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.END))
                                )
                                        .texture("particle", new ResourceLocation(factory.getTexturePath(), "block/" + factory.getCustomTexture(BlockFactory.TextureLocation.PARTICLE)))
                                        .texture("overlay", getCompressionOverlay(block.get().getBlock().getRegistryName().toString()))
                                        .parent(cubeColumnHorizontal)
                                        .element()
                                        .from(0, 0, 0)
                                        .to(16, 16, 16)
                                        .face(Direction.DOWN).texture("#end").end()
                                        .face(Direction.UP).texture("#end").end()
                                        .face(Direction.NORTH).texture("#side").end()
                                        .face(Direction.SOUTH).texture("#side").end()
                                        .face(Direction.EAST).texture("#side").end()
                                        .face(Direction.WEST).texture("#side").end()
                                        .end()
                                        .element()
                                        .from(0, 0, 0)
                                        .to(16, 16, 16)
                                        .face(Direction.DOWN).texture("#overlay").end()
                                        .face(Direction.UP).texture("#overlay").end()
                                        .face(Direction.NORTH).texture("#overlay").end()
                                        .face(Direction.SOUTH).texture("#overlay").end()
                                        .face(Direction.EAST).texture("#overlay").end()
                                        .face(Direction.WEST).texture("#overlay").end()
                                        .end()
                        );
                    }
                }
            }
        }
    }

    private ResourceLocation getActualResourceLocation(String blockName) {
        switch (blockName) {
            case "flesh_block":
                return new ResourceLocation("compressedblocks", "block/flesh");
            case "rotten_flesh_block":
                return new ResourceLocation("compressedblocks", "block/rotten_flesh");
            case "gunpowder_block":
                return new ResourceLocation("compressedblocks", "block/gunpowder");
            case "flint_block":
                return new ResourceLocation("compressedblocks", "block/flint");
            case "magma_block":
                return new ResourceLocation("minecraft", "block/magma");
            default:
                return new ResourceLocation("minecraft", "block/" + blockName);
        }
    }

    private ResourceLocation getCompressionOverlay(String blockName) {
        String overlay = "";
        if (blockName.contains("c0")) overlay = "compression_level_0";
        else if (blockName.contains("c1")) overlay = "compression_level_1";
        else if (blockName.contains("c2")) overlay = "compression_level_2";
        else if (blockName.contains("c3")) overlay = "compression_level_3";
        else if (blockName.contains("c4")) overlay = "compression_level_4";
        else if (blockName.contains("c5")) overlay = "compression_level_5";
        else if (blockName.contains("c6")) overlay = "compression_level_6";
        else if (blockName.contains("c7")) overlay = "compression_level_7";
        else if (blockName.contains("c8")) overlay = "compression_level_8";
        else if (blockName.contains("c9")) overlay = "compression_level_9";
        return new ResourceLocation("compressedblocks", "block/" + overlay);
    }
}