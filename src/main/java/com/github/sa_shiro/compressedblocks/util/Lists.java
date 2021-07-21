package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.github.sa_shiro.compressedblocks.block.BlockType;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;

import java.util.ArrayList;

public class Lists {
    public final static ArrayList<Float> HARDNESS = new ArrayList<>();
    public final static ArrayList<Float> RESISTANCE = new ArrayList<>();
    public final static ArrayList<Integer> HARVEST_LEVEL = new ArrayList<>();
    public static final ArrayList<BlockFactory> blockList = new ArrayList<>();
    public static final ArrayList<String> ITEMS = new ArrayList<>();

    //------------------------------------------------------------------------------------------------------------------
    // Minecraft Blocks
    //------------------------------------------------------------------------------------------------------------------
    public static final BlockFactory STONE = new BlockFactory(BlockType.DEFAULT, "stone", Material.STONE, MaterialColor.STONE, SoundType.STONE);
    public static final BlockFactory GRANITE = new BlockFactory(BlockType.DEFAULT, "granite", Material.STONE, MaterialColor.DIRT, SoundType.STONE);
    public static final BlockFactory DIORITE = new BlockFactory(BlockType.DEFAULT, "diorite", Material.STONE, MaterialColor.QUARTZ, SoundType.STONE);
    public static final BlockFactory ANDESITE = new BlockFactory(BlockType.DEFAULT, "andesite", Material.STONE, MaterialColor.STONE, SoundType.STONE);
    public static final BlockFactory DIRT = new BlockFactory(BlockType.DEFAULT, "dirt", Material.DIRT, MaterialColor.DIRT, SoundType.GRASS);
    // fixme: make compressed grass block act like minecraft grass block
    public static final BlockFactory GRASS_BLOCK = new BlockFactory(BlockType.DEFAULT, "grass_block", Material.DIRT, MaterialColor.DIRT, SoundType.GRASS)
            .setCustomTexture("compressedblocks", "grass_bottom", "grass_bottom", "grass_top", "grass_side", "grass_side", "grass_side", "grass_side");
    public static final BlockFactory COARSE_DIRT = new BlockFactory(BlockType.DEFAULT, "coarse_dirt", Material.DIRT, MaterialColor.DIRT, SoundType.GRASS);
    public static final BlockFactory CRIMSON_NYLIUM = new BlockFactory(BlockType.DEFAULT, "crimson_nylium", Material.STONE, MaterialColor.CRIMSON_NYLIUM, SoundType.NYLIUM);
    public static final BlockFactory WARPED_NYLIUM = new BlockFactory(BlockType.DEFAULT, "warped_nylium", Material.STONE, MaterialColor.WARPED_NYLIUM, SoundType.NYLIUM);
    public static final BlockFactory COBBLESTONE = new BlockFactory(BlockType.DEFAULT, "cobblestone", Material.STONE, null, SoundType.STONE);
    public static final BlockFactory MOSSY_COBBLESTONE = new BlockFactory(BlockType.DEFAULT, "mossy_cobblestone", Material.STONE, null, SoundType.STONE);
    public static final BlockFactory CLAY = new BlockFactory(BlockType.DEFAULT, "clay", Material.CLAY, MaterialColor.CLAY, SoundType.GRASS);
    public static final BlockFactory SAND = new BlockFactory(BlockType.SAND, "sand", Material.SAND, MaterialColor.SAND, SoundType.SAND);
    public static final BlockFactory RED_SAND = new BlockFactory(BlockType.RED_SAND, "red_sand", Material.SAND, MaterialColor.SAND, SoundType.SAND);
    public static final BlockFactory GRAVEL = new BlockFactory(BlockType.GRAVEL, "gravel", Material.SAND, MaterialColor.STONE, SoundType.GRASS);
    public static final BlockFactory SANDSTONE = new BlockFactory(BlockType.DEFAULT, "sandstone", Material.STONE, MaterialColor.SAND, SoundType.STONE);
    public static final BlockFactory RED_SANDSTONE = new BlockFactory(BlockType.DEFAULT, "red_sandstone", Material.STONE, MaterialColor.SAND, SoundType.STONE);
    public static final BlockFactory COAL_ORE = new BlockFactory(BlockType.DEFAULT, "coal_ore", Material.STONE, null, SoundType.STONE);
    public static final BlockFactory IRON_ORE = new BlockFactory(BlockType.DEFAULT, "iron_ore", Material.STONE, null, SoundType.STONE);
    public static final BlockFactory GOLD_ORE = new BlockFactory(BlockType.DEFAULT, "gold_ore", Material.STONE, null, SoundType.STONE);
    public static final BlockFactory NETHER_GOLD_ORE = new BlockFactory(BlockType.DEFAULT, "nether_gold_ore", Material.STONE, MaterialColor.NETHER, SoundType.STONE);
    public static final BlockFactory NETHER_QUARTZ_ORE = new BlockFactory(BlockType.DEFAULT, "nether_quartz_ore", Material.STONE, MaterialColor.NETHER, SoundType.STONE);
    public static final BlockFactory LAPIS_ORE = new BlockFactory(BlockType.DEFAULT, "lapis_ore", Material.STONE, null, SoundType.STONE);
    public static final BlockFactory EMERALD_ORE = new BlockFactory(BlockType.DEFAULT, "emerald_ore", Material.STONE, null, SoundType.STONE);
    public static final BlockFactory REDSTONE_ORE = new BlockFactory(BlockType.DEFAULT, "redstone_ore", Material.STONE, null, SoundType.STONE);
    public static final BlockFactory DIAMOND_ORE = new BlockFactory(BlockType.DEFAULT, "diamond_ore", Material.STONE, null, SoundType.STONE);
    public static final BlockFactory IRON_BLOCK = new BlockFactory(BlockType.DEFAULT, "iron_block", Material.METAL, MaterialColor.METAL, SoundType.METAL);
    public static final BlockFactory GOLD_BLOCK = new BlockFactory(BlockType.DEFAULT, "gold_block", Material.METAL, MaterialColor.GOLD, SoundType.METAL);
    public static final BlockFactory DIAMOND_BLOCK = new BlockFactory(BlockType.DEFAULT, "diamond_block", Material.METAL, MaterialColor.DIAMOND, SoundType.METAL);
    public static final BlockFactory LAPIS_BLOCK = new BlockFactory(BlockType.DEFAULT, "lapis_block", Material.METAL, MaterialColor.LAPIS, SoundType.METAL);
    public static final BlockFactory EMERALD_BLOCK = new BlockFactory(BlockType.DEFAULT, "emerald_block", Material.METAL, MaterialColor.EMERALD, SoundType.METAL);
    public static final BlockFactory REDSTONE_BLOCK = new BlockFactory(BlockType.REDSTONE, "redstone_block", Material.METAL, MaterialColor.COLOR_RED, SoundType.METAL);
    public static final BlockFactory COAL_BLOCK = new BlockFactory(BlockType.DEFAULT, "coal_block", Material.STONE, MaterialColor.COLOR_BLACK, SoundType.STONE);
    public static final BlockFactory OBSIDIAN = new BlockFactory(BlockType.DEFAULT, "obsidian", Material.STONE, MaterialColor.COLOR_BLACK, SoundType.STONE);
    public static final BlockFactory SLIME_BLOCK = new BlockFactory(BlockType.SLIME, "slime_block", Material.CLAY, MaterialColor.GRASS, SoundType.SLIME_BLOCK);
    public static final BlockFactory BRICKS = new BlockFactory(BlockType.DEFAULT, "bricks", Material.STONE, MaterialColor.COLOR_RED, SoundType.STONE);
    public static final BlockFactory STONE_BRICKS = new BlockFactory(BlockType.DEFAULT, "stone_bricks", Material.STONE, null, SoundType.STONE);
    public static final BlockFactory NETHERRACK = new BlockFactory(BlockType.DEFAULT, "netherrack", Material.STONE, MaterialColor.NETHER, SoundType.NETHERRACK);
    public static final BlockFactory NETHER_BRICKS = new BlockFactory(BlockType.DEFAULT, "nether_bricks", Material.DIRT, MaterialColor.NETHER, SoundType.NETHER_BRICKS);
    public static final BlockFactory RED_NETHER_BRICKS = new BlockFactory(BlockType.DEFAULT, "red_nether_bricks", Material.DIRT, MaterialColor.NETHER, SoundType.NETHER_BRICKS);
    public static final BlockFactory NETHER_WART_BLOCK = new BlockFactory(BlockType.DEFAULT, "nether_wart_block", Material.GRASS, MaterialColor.COLOR_RED, SoundType.NETHER_WART);
    public static final BlockFactory WARPED_WART_BLOCK = new BlockFactory(BlockType.DEFAULT, "warped_wart_block", Material.GRASS, MaterialColor.WARPED_WART_BLOCK, SoundType.WART_BLOCK);
    public static final BlockFactory SOUL_SAND = new BlockFactory(BlockType.SOUL_SAND, "soul_sand", Material.SAND, MaterialColor.COLOR_BROWN, SoundType.SOUL_SAND);
    public static final BlockFactory SOUL_SOIL = new BlockFactory(BlockType.DEFAULT, "soul_soil", Material.DIRT, MaterialColor.COLOR_BROWN, SoundType.SOUL_SOIL);
    public static final BlockFactory END_STONE = new BlockFactory(BlockType.DEFAULT, "end_stone", Material.STONE, MaterialColor.SAND, SoundType.STONE);
    public static final BlockFactory END_STONE_BRICKS = new BlockFactory(BlockType.DEFAULT, "end_stone_bricks", Material.STONE, MaterialColor.SAND, SoundType.STONE);
    public static final BlockFactory PRISMARINE = new BlockFactory(BlockType.DEFAULT, "prismarine", Material.STONE, MaterialColor.COLOR_CYAN, SoundType.STONE);
    public static final BlockFactory PRISMARINE_BRICKS = new BlockFactory(BlockType.DEFAULT, "prismarine_bricks", Material.STONE, MaterialColor.DIAMOND, SoundType.STONE);
    public static final BlockFactory DARK_PRISMARINE = new BlockFactory(BlockType.DEFAULT, "dark_prismarine", Material.STONE, MaterialColor.DIAMOND, SoundType.STONE);
    public static final BlockFactory BLACKSTONE = new BlockFactory(BlockType.DEFAULT, "blackstone", Material.HEAVY_METAL, MaterialColor.COLOR_BLACK, SoundType.STONE);
    public static final BlockFactory WHITE_WOOL = new BlockFactory(BlockType.WOOL, "white_wool", Material.WOOL, MaterialColor.SNOW, SoundType.WOOL);
    public static final BlockFactory ORANGE_WOOL = new BlockFactory(BlockType.WOOL, "orange_wool", Material.WOOL, MaterialColor.COLOR_ORANGE, SoundType.WOOL);
    public static final BlockFactory MAGENTA_WOOL = new BlockFactory(BlockType.WOOL, "magenta_wool", Material.WOOL, MaterialColor.COLOR_MAGENTA, SoundType.WOOL);
    public static final BlockFactory LIGHT_BLUE_WOOL = new BlockFactory(BlockType.WOOL, "light_blue_wool", Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE, SoundType.WOOL);
    public static final BlockFactory YELLOW_WOOL = new BlockFactory(BlockType.WOOL, "yellow_wool", Material.WOOL, MaterialColor.COLOR_YELLOW, SoundType.WOOL);
    public static final BlockFactory LIME_WOOL = new BlockFactory(BlockType.WOOL, "lime_wool", Material.WOOL, MaterialColor.COLOR_LIGHT_GREEN, SoundType.WOOL);
    public static final BlockFactory PINK_WOOL = new BlockFactory(BlockType.WOOL, "pink_wool", Material.WOOL, MaterialColor.COLOR_PINK, SoundType.WOOL);
    public static final BlockFactory GRAY_WOOL = new BlockFactory(BlockType.WOOL, "gray_wool", Material.WOOL, MaterialColor.COLOR_GRAY, SoundType.WOOL);
    public static final BlockFactory LIGHT_GRAY_WOOL = new BlockFactory(BlockType.WOOL, "light_gray_wool", Material.WOOL, MaterialColor.COLOR_LIGHT_GRAY, SoundType.WOOL);
    public static final BlockFactory CYAN_WOOL = new BlockFactory(BlockType.WOOL, "cyan_wool", Material.WOOL, MaterialColor.COLOR_CYAN, SoundType.WOOL);
    public static final BlockFactory PURPLE_WOOL = new BlockFactory(BlockType.WOOL, "purple_wool", Material.WOOL, MaterialColor.COLOR_PURPLE, SoundType.WOOL);
    public static final BlockFactory BLUE_WOOL = new BlockFactory(BlockType.WOOL, "blue_wool", Material.WOOL, MaterialColor.COLOR_BLUE, SoundType.WOOL);
    public static final BlockFactory BROWN_WOOL = new BlockFactory(BlockType.WOOL, "brown_wool", Material.WOOL, MaterialColor.COLOR_BROWN, SoundType.WOOL);
    public static final BlockFactory GREEN_WOOL = new BlockFactory(BlockType.WOOL, "green_wool", Material.WOOL, MaterialColor.COLOR_GREEN, SoundType.WOOL);
    public static final BlockFactory RED_WOOL = new BlockFactory(BlockType.WOOL, "red_wool", Material.WOOL, MaterialColor.COLOR_RED, SoundType.WOOL);
    public static final BlockFactory BLACK_WOOL = new BlockFactory(BlockType.WOOL, "black_wool", Material.WOOL, MaterialColor.COLOR_BLACK, SoundType.WOOL);
    public static final BlockFactory TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "terracotta", Material.STONE, MaterialColor.COLOR_ORANGE, SoundType.STONE);
    public static final BlockFactory WHITE_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "white_terracotta", Material.STONE, MaterialColor.TERRACOTTA_WHITE, SoundType.STONE);
    public static final BlockFactory ORANGE_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "orange_terracotta", Material.STONE, MaterialColor.TERRACOTTA_ORANGE, SoundType.STONE);
    public static final BlockFactory MAGENTA_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "magenta_terracotta", Material.STONE, MaterialColor.TERRACOTTA_MAGENTA, SoundType.STONE);
    public static final BlockFactory LIGHT_BLUE_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "light_blue_terracotta", Material.STONE, MaterialColor.TERRACOTTA_LIGHT_BLUE, SoundType.STONE);
    public static final BlockFactory YELLOW_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "yellow_terracotta", Material.STONE, MaterialColor.TERRACOTTA_YELLOW, SoundType.STONE);
    public static final BlockFactory LIME_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "lime_terracotta", Material.STONE, MaterialColor.TERRACOTTA_LIGHT_GREEN, SoundType.STONE);
    public static final BlockFactory PINK_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "pink_terracotta", Material.STONE, MaterialColor.TERRACOTTA_PINK, SoundType.STONE);
    public static final BlockFactory GRAY_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "gray_terracotta", Material.STONE, MaterialColor.TERRACOTTA_GRAY, SoundType.STONE);
    public static final BlockFactory LIGHT_GRAY_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "light_gray_terracotta", Material.STONE, MaterialColor.TERRACOTTA_LIGHT_GRAY, SoundType.STONE);
    public static final BlockFactory CYAN_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "cyan_terracotta", Material.STONE, MaterialColor.TERRACOTTA_CYAN, SoundType.STONE);
    public static final BlockFactory PURPLE_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "purple_terracotta", Material.STONE, MaterialColor.TERRACOTTA_PURPLE, SoundType.STONE);
    public static final BlockFactory BLUE_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "blue_terracotta", Material.STONE, MaterialColor.TERRACOTTA_BLUE, SoundType.STONE);
    public static final BlockFactory BROWN_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "brown_terracotta", Material.STONE, MaterialColor.TERRACOTTA_BROWN, SoundType.STONE);
    public static final BlockFactory GREEN_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "green_terracotta", Material.STONE, MaterialColor.TERRACOTTA_GREEN, SoundType.STONE);
    public static final BlockFactory RED_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "red_terracotta", Material.STONE, MaterialColor.TERRACOTTA_RED, SoundType.STONE);
    public static final BlockFactory BLACK_TERRACOTTA = new BlockFactory(BlockType.DEFAULT, "black_terracotta", Material.STONE, MaterialColor.TERRACOTTA_BLACK, SoundType.STONE);
    public static final BlockFactory WHITE_CONCRETE = new BlockFactory(BlockType.DEFAULT, "white_concrete", Material.STONE, MaterialColor.SNOW, SoundType.STONE);
    public static final BlockFactory ORANGE_CONCRETE = new BlockFactory(BlockType.DEFAULT, "orange_concrete", Material.STONE, DyeColor.ORANGE.getMaterialColor(), SoundType.STONE);
    public static final BlockFactory MAGENTA_CONCRETE = new BlockFactory(BlockType.DEFAULT, "magenta_concrete", Material.STONE, MaterialColor.COLOR_MAGENTA, SoundType.STONE);
    public static final BlockFactory LIGHT_BLUE_CONCRETE = new BlockFactory(BlockType.DEFAULT, "light_blue_concrete", Material.STONE, MaterialColor.COLOR_LIGHT_BLUE, SoundType.STONE);
    public static final BlockFactory YELLOW_CONCRETE = new BlockFactory(BlockType.DEFAULT, "yellow_concrete", Material.STONE, MaterialColor.COLOR_YELLOW, SoundType.STONE);
    public static final BlockFactory LIME_CONCRETE = new BlockFactory(BlockType.DEFAULT, "lime_concrete", Material.STONE, DyeColor.LIME.getMaterialColor(), SoundType.STONE);
    public static final BlockFactory PINK_CONCRETE = new BlockFactory(BlockType.DEFAULT, "pink_concrete", Material.STONE, MaterialColor.COLOR_PINK, SoundType.STONE);
    public static final BlockFactory GRAY_CONCRETE = new BlockFactory(BlockType.DEFAULT, "gray_concrete", Material.STONE, MaterialColor.COLOR_GRAY, SoundType.STONE);
    public static final BlockFactory LIGHT_GRAY_CONCRETE = new BlockFactory(BlockType.DEFAULT, "light_gray_concrete", Material.STONE, MaterialColor.COLOR_LIGHT_GRAY, SoundType.STONE);
    public static final BlockFactory CYAN_CONCRETE = new BlockFactory(BlockType.DEFAULT, "cyan_concrete", Material.STONE, MaterialColor.COLOR_CYAN, SoundType.STONE);
    public static final BlockFactory PURPLE_CONCRETE = new BlockFactory(BlockType.DEFAULT, "purple_concrete", Material.STONE, MaterialColor.COLOR_PURPLE, SoundType.STONE);
    public static final BlockFactory BLUE_CONCRETE = new BlockFactory(BlockType.DEFAULT, "blue_concrete", Material.STONE, MaterialColor.COLOR_BLUE, SoundType.STONE);
    public static final BlockFactory BROWN_CONCRETE = new BlockFactory(BlockType.DEFAULT, "brown_concrete", Material.STONE, MaterialColor.COLOR_BROWN, SoundType.STONE);
    public static final BlockFactory GREEN_CONCRETE = new BlockFactory(BlockType.DEFAULT, "green_concrete", Material.STONE, MaterialColor.COLOR_GREEN, SoundType.STONE);
    public static final BlockFactory RED_CONCRETE = new BlockFactory(BlockType.DEFAULT, "red_concrete", Material.STONE, MaterialColor.COLOR_RED, SoundType.STONE);
    public static final BlockFactory BLACK_CONCRETE = new BlockFactory(BlockType.DEFAULT, "black_concrete", Material.STONE, MaterialColor.COLOR_BLACK, SoundType.STONE);
    public static final BlockFactory ROTTEN_FLESH_BLOCK = new BlockFactory(BlockType.FLESH, "rotten_flesh_block", Material.CLAY, MaterialColor.COLOR_RED, SoundType.SLIME_BLOCK);
    public static final BlockFactory FLINT_BLOCK = new BlockFactory(BlockType.DEFAULT, "flint_block", Material.STONE, MaterialColor.COLOR_GRAY, SoundType.STONE);
    public static final BlockFactory GUNPOWDER_BLOCK = new BlockFactory(BlockType.SAND, "gunpowder_block", 5000268, Material.SAND, MaterialColor.COLOR_GRAY, SoundType.SAND);
    public static final BlockFactory NETHERITE_BLOCK = new BlockFactory(BlockType.DEFAULT, "netherite_block", Material.METAL, MaterialColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);
    public static final BlockFactory ANCIENT_DEBRIS = new BlockFactory(BlockType.DEFAULT, "ancient_debris", Material.METAL, MaterialColor.COLOR_BLACK, SoundType.ANCIENT_DEBRIS)
            .setCustomTexture("ancient_debris_side", "ancient_debris_side", "ancient_debris_top")
            .hasRotation();
    public static final BlockFactory OAK_LOG = new BlockFactory(BlockType.DEFAULT, "oak_log", Material.WOOD, SoundType.WOOD)
            .setCustomTexture("oak_log", "oak_log", "oak_log_top")
            .setMaterialColor(MaterialColor.WOOD, MaterialColor.PODZOL)
            .hasRotation()
            .isLogBlock();
    public static final BlockFactory SPRUCE_LOG = new BlockFactory(BlockType.DEFAULT, "spruce_log", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD)
            .setCustomTexture("spruce_log", "spruce_log", "spruce_log_top")
            .setMaterialColor(MaterialColor.PODZOL, MaterialColor.COLOR_BROWN)
            .hasRotation()
            .isLogBlock();
    public static final BlockFactory BIRCH_LOG = new BlockFactory(BlockType.DEFAULT, "birch_log", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD)
            .setCustomTexture("birch_log", "birch_log", "birch_log_top")
            .setMaterialColor(MaterialColor.SAND, MaterialColor.QUARTZ)
            .hasRotation()
            .isLogBlock();
    public static final BlockFactory JUNGLE_LOG = new BlockFactory(BlockType.DEFAULT, "jungle_log", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD)
            .setCustomTexture("jungle_log", "jungle_log", "jungle_log_top")
            .setMaterialColor(MaterialColor.DIRT, MaterialColor.PODZOL)
            .hasRotation()
            .isLogBlock();
    public static final BlockFactory ACACIA_LOG = new BlockFactory(BlockType.DEFAULT, "acacia_log", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD)
            .setCustomTexture("acacia_log", "acacia_log", "acacia_log_top")
            .setMaterialColor(MaterialColor.COLOR_ORANGE, MaterialColor.STONE)
            .hasRotation()
            .isLogBlock();
    public static final BlockFactory DARK_OAK_LOG = new BlockFactory(BlockType.DEFAULT, "dark_oak_log", Material.NETHER_WOOD, MaterialColor.NETHER, SoundType.WOOD)
            .setCustomTexture("dark_oak_log", "dark_oak_log", "dark_oak_log_top")
            .setMaterialColor(MaterialColor.COLOR_BROWN, MaterialColor.COLOR_BROWN)
            .hasRotation()
            .isLogBlock();
    public static final BlockFactory WARPED_STEM = new BlockFactory(BlockType.DEFAULT, "warped_stem", Material.NETHER_WOOD, MaterialColor.WARPED_STEM, SoundType.STEM)
            .setCustomTexture("warped_stem", "warped_stem", "warped_stem_top")
            .hasRotation();
    public static final BlockFactory CRIMSON_STEM = new BlockFactory(BlockType.DEFAULT, "crimson_stem", Material.NETHER_WOOD, MaterialColor.CRIMSON_STEM, SoundType.STEM)
            .setCustomTexture("crimson_stem", "crimson_stem", "crimson_stem_top")
            .hasRotation();
    public static final BlockFactory OAK_PLANKS = new BlockFactory(BlockType.DEFAULT, "oak_planks", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD);
    public static final BlockFactory SPRUCE_PLANKS = new BlockFactory(BlockType.DEFAULT, "spruce_planks", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD);
    public static final BlockFactory BIRCH_PLANKS = new BlockFactory(BlockType.DEFAULT, "birch_planks", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD);
    public static final BlockFactory JUNGLE_PLANKS = new BlockFactory(BlockType.DEFAULT, "jungle_planks", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD);
    public static final BlockFactory ACACIA_PLANKS = new BlockFactory(BlockType.DEFAULT, "acacia_planks", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD);
    public static final BlockFactory DARK_OAK_PLANKS = new BlockFactory(BlockType.DEFAULT, "dark_oak_planks", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD);
    public static final BlockFactory WARPED_PLANKS = new BlockFactory(BlockType.DEFAULT, "warped_planks", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD);
    public static final BlockFactory CRIMSON_PLANKS = new BlockFactory(BlockType.DEFAULT, "crimson_planks", Material.WOOD, MaterialColor.WOOD, SoundType.WOOD);
    public static final BlockFactory PURPUR_BLOCK = new BlockFactory(BlockType.DEFAULT, "purpur_block", Material.STONE, MaterialColor.COLOR_PURPLE, SoundType.STONE);
    public static final BlockFactory PURPUR_PILLAR = new BlockFactory(BlockType.DEFAULT, "purpur_pillar", Material.STONE, MaterialColor.COLOR_PURPLE, SoundType.STONE);
    public static final BlockFactory BASALT = new BlockFactory(BlockType.DEFAULT, "basalt", Material.STONE, MaterialColor.COLOR_BLACK, SoundType.STONE)
            .setCustomTexture("basalt_side", "basalt_side", "basalt_top")
            .hasRotation();
    public static final BlockFactory POLISHED_BASALT = new BlockFactory(BlockType.DEFAULT, "polished_basalt", Material.STONE, MaterialColor.COLOR_PURPLE, SoundType.STONE)
            .setCustomTexture("polished_basalt_side", "polished_basalt_side", "polished_basalt_top")
            .hasRotation();
    public static final BlockFactory QUARTZ_BLOCK = new BlockFactory(BlockType.DEFAULT, "quartz_block", Material.STONE, MaterialColor.COLOR_PURPLE, SoundType.STONE)
            .setCustomTexture("quartz_block_side", "quartz_block_side", "quartz_block_top")
            .hasRotation();
    public static final BlockFactory HAY_BLOCK = new BlockFactory(BlockType.DEFAULT, "hay_block", Material.GRASS, MaterialColor.COLOR_YELLOW, SoundType.GRASS)
            .setCustomTexture("hay_block_side", "hay_block_side", "hay_block_top")
            .hasRotation();
    public static final BlockFactory GLASS = new BlockFactory(BlockType.GLASS, "glass", Material.GLASS, MaterialColor.NONE, SoundType.GLASS);
    public static final BlockFactory MAGMA_BLOCK = new BlockFactory(BlockType.MAGMA, "magma_block", Material.STONE, MaterialColor.NETHER, SoundType.STONE);

    public static void populate() {
        blockList.add(STONE);
        blockList.add(GRANITE);
        blockList.add(DIORITE);
        blockList.add(ANDESITE);
        blockList.add(DIRT);
        blockList.add(GRASS_BLOCK);
        blockList.add(COARSE_DIRT);
        blockList.add(CRIMSON_NYLIUM);
        blockList.add(WARPED_NYLIUM);
        blockList.add(COBBLESTONE);
        blockList.add(MOSSY_COBBLESTONE);
        blockList.add(CLAY);
        blockList.add(SAND);
        blockList.add(RED_SAND);
        blockList.add(GRAVEL);
        blockList.add(SANDSTONE);
        blockList.add(RED_SANDSTONE);
        blockList.add(COAL_ORE);
        blockList.add(IRON_ORE);
        blockList.add(GOLD_ORE);
        blockList.add(NETHER_GOLD_ORE);
        blockList.add(NETHER_QUARTZ_ORE);
        blockList.add(LAPIS_ORE);
        blockList.add(EMERALD_ORE);
        blockList.add(REDSTONE_ORE);
        blockList.add(DIAMOND_ORE);
        blockList.add(IRON_BLOCK);
        blockList.add(GOLD_BLOCK);
        blockList.add(DIAMOND_BLOCK);
        blockList.add(LAPIS_BLOCK);
        blockList.add(EMERALD_BLOCK);
        blockList.add(REDSTONE_BLOCK);
        blockList.add(COAL_BLOCK);
        blockList.add(OBSIDIAN);
        blockList.add(SLIME_BLOCK);
        blockList.add(BRICKS);
        blockList.add(STONE_BRICKS);
        blockList.add(NETHERRACK);
        blockList.add(NETHER_BRICKS);
        blockList.add(RED_NETHER_BRICKS);
        blockList.add(NETHER_WART_BLOCK);
        blockList.add(WARPED_WART_BLOCK);
        blockList.add(SOUL_SAND);
        blockList.add(SOUL_SOIL);
        blockList.add(END_STONE);
        blockList.add(END_STONE_BRICKS);
        blockList.add(PRISMARINE);
        blockList.add(PRISMARINE_BRICKS);
        blockList.add(DARK_PRISMARINE);
        blockList.add(BLACKSTONE);
        blockList.add(WHITE_WOOL);
        blockList.add(ORANGE_WOOL);
        blockList.add(MAGENTA_WOOL);
        blockList.add(LIGHT_BLUE_WOOL);
        blockList.add(YELLOW_WOOL);
        blockList.add(LIME_WOOL);
        blockList.add(PINK_WOOL);
        blockList.add(GRAY_WOOL);
        blockList.add(LIGHT_GRAY_WOOL);
        blockList.add(CYAN_WOOL);
        blockList.add(PURPLE_WOOL);
        blockList.add(BLUE_WOOL);
        blockList.add(BROWN_WOOL);
        blockList.add(GREEN_WOOL);
        blockList.add(RED_WOOL);
        blockList.add(BLACK_WOOL);
        blockList.add(TERRACOTTA);
        blockList.add(WHITE_TERRACOTTA);
        blockList.add(ORANGE_TERRACOTTA);
        blockList.add(MAGENTA_TERRACOTTA);
        blockList.add(LIGHT_BLUE_TERRACOTTA);
        blockList.add(YELLOW_TERRACOTTA);
        blockList.add(LIME_TERRACOTTA);
        blockList.add(PINK_TERRACOTTA);
        blockList.add(GRAY_TERRACOTTA);
        blockList.add(LIGHT_GRAY_TERRACOTTA);
        blockList.add(CYAN_TERRACOTTA);
        blockList.add(PURPLE_TERRACOTTA);
        blockList.add(BLUE_TERRACOTTA);
        blockList.add(BROWN_TERRACOTTA);
        blockList.add(GREEN_TERRACOTTA);
        blockList.add(RED_TERRACOTTA);
        blockList.add(BLACK_TERRACOTTA);
        blockList.add(WHITE_CONCRETE);
        blockList.add(ORANGE_CONCRETE);
        blockList.add(MAGENTA_CONCRETE);
        blockList.add(LIGHT_BLUE_CONCRETE);
        blockList.add(YELLOW_CONCRETE);
        blockList.add(LIME_CONCRETE);
        blockList.add(PINK_CONCRETE);
        blockList.add(GRAY_CONCRETE);
        blockList.add(LIGHT_GRAY_CONCRETE);
        blockList.add(CYAN_CONCRETE);
        blockList.add(PURPLE_CONCRETE);
        blockList.add(BLUE_CONCRETE);
        blockList.add(BROWN_CONCRETE);
        blockList.add(GREEN_CONCRETE);
        blockList.add(RED_CONCRETE);
        blockList.add(BLACK_CONCRETE);
        blockList.add(ROTTEN_FLESH_BLOCK);
        blockList.add(FLINT_BLOCK);
        blockList.add(GUNPOWDER_BLOCK);
        blockList.add(NETHERITE_BLOCK);
        blockList.add(ANCIENT_DEBRIS);
        blockList.add(OAK_LOG);
        blockList.add(SPRUCE_LOG);
        blockList.add(BIRCH_LOG);
        blockList.add(JUNGLE_LOG);
        blockList.add(ACACIA_LOG);
        blockList.add(DARK_OAK_LOG);
        blockList.add(WARPED_STEM);
        blockList.add(CRIMSON_STEM);
        blockList.add(OAK_PLANKS);
        blockList.add(SPRUCE_PLANKS);
        blockList.add(BIRCH_PLANKS);
        blockList.add(JUNGLE_PLANKS);
        blockList.add(ACACIA_PLANKS);
        blockList.add(DARK_OAK_PLANKS);
        blockList.add(WARPED_PLANKS);
        blockList.add(CRIMSON_PLANKS);
        blockList.add(PURPUR_BLOCK);
        blockList.add(PURPUR_PILLAR);
        blockList.add(BASALT);
        blockList.add(POLISHED_BASALT);
        blockList.add(QUARTZ_BLOCK);
        blockList.add(HAY_BLOCK);
        blockList.add(GLASS);
        blockList.add(MAGMA_BLOCK);

        HARDNESS.add(0, 8.0f);
        HARDNESS.add(1, 10.5f);
        HARDNESS.add(2, 15.0f);
        HARDNESS.add(3, 20.0f);
        HARDNESS.add(4, 25.0f);
        HARDNESS.add(5, 35.0f);
        HARDNESS.add(6, 40.0f);
        HARDNESS.add(7, 45.0f);
        HARDNESS.add(8, 50.0f);
        HARDNESS.add(9, 55.0f);

        RESISTANCE.add(0, 35.0f);
        RESISTANCE.add(1, 40.0f);
        RESISTANCE.add(2, 40.0f);
        RESISTANCE.add(3, 50.0f);
        RESISTANCE.add(4, 50.0f);
        RESISTANCE.add(5, 50.0f);
        RESISTANCE.add(6, 75.0f);
        RESISTANCE.add(7, 125.0f);
        RESISTANCE.add(8, 150.0f);
        RESISTANCE.add(9, 200.0f);

        HARVEST_LEVEL.add(0, 1);
        HARVEST_LEVEL.add(1, 1);
        HARVEST_LEVEL.add(2, 1);
        HARVEST_LEVEL.add(3, 2);
        HARVEST_LEVEL.add(4, 2);
        HARVEST_LEVEL.add(5, 2);
        HARVEST_LEVEL.add(6, 3);
        HARVEST_LEVEL.add(7, 3);
        HARVEST_LEVEL.add(8, 4);
        HARVEST_LEVEL.add(9, 4);

        ITEMS.add("apples");
        ITEMS.add("arrows");
        ITEMS.add("beetroots");
        ITEMS.add("beetroot_seeds");
        ITEMS.add("blaze_powder");
        ITEMS.add("blaze_rods");
        ITEMS.add("bones");
        ITEMS.add("carrots");
        ITEMS.add("eggs");
        ITEMS.add("ender_eyes");
        ITEMS.add("ender_pearls");
        ITEMS.add("feathers");
        ITEMS.add("leather");
        ITEMS.add("melons");
        ITEMS.add("potatoes");
        ITEMS.add("sugar_canes");
        ITEMS.add("melon_seeds");
        ITEMS.add("pumpkin");
        ITEMS.add("pumpkin_seeds");
        ITEMS.add("wheat_seeds");
        ITEMS.add("spider_eyes");
        ITEMS.add("strings");
        ITEMS.add("sticks");
        ITEMS.add("sugar");
    }
}