package net.sashiro.compressedblocks.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.client.CompressedBlocksClient;

import static net.sashiro.compressedblocks.Constants.BLOCKS;
import static net.sashiro.compressedblocks.Constants.MOD_ID;
import static net.sashiro.compressedblocks.block.BlockList.*;

public class CBBlocksRegister {
    
    private static void registerBlock(String name, Block block) {
        FabricItemSettings fis = (FabricItemSettings) new FabricItemSettings().tab(CompressedBlocksClient.COMPRESSED_BLOCKS);
        Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name.toLowerCase()), block);
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name.toLowerCase()), new BlockItem(block, fis));
        BLOCKS.add(block);
    }
    
    public static void register() {
        // Dirt
        registerBlock("c0_" + "DIRT", DIRT_0);
        registerBlock("c1_" + "DIRT", DIRT_1);
        registerBlock("c2_" + "DIRT", DIRT_2);
        registerBlock("c3_" + "DIRT", DIRT_3);
        registerBlock("c4_" + "DIRT", DIRT_4);
        registerBlock("c5_" + "DIRT", DIRT_5);
        registerBlock("c6_" + "DIRT", DIRT_6);
        registerBlock("c7_" + "DIRT", DIRT_7);
        registerBlock("c8_" + "DIRT", DIRT_8);
        registerBlock("c9_" + "DIRT", DIRT_9);
        // Gravel
        registerBlock("c0_gravel", GRAVEL_0);
        registerBlock("c1_gravel", GRAVEL_1);
        registerBlock("c2_gravel", GRAVEL_2);
        registerBlock("c3_gravel", GRAVEL_3);
        registerBlock("c4_gravel", GRAVEL_4);
        registerBlock("c5_gravel", GRAVEL_5);
        registerBlock("c6_gravel", GRAVEL_6);
        registerBlock("c7_gravel", GRAVEL_7);
        registerBlock("c8_gravel", GRAVEL_8);
        registerBlock("c9_gravel", GRAVEL_9);
        // Cobblestone
        registerBlock("c0_cobblestone", COBBLESTONE_0);
        registerBlock("c1_cobblestone", COBBLESTONE_1);
        registerBlock("c2_cobblestone", COBBLESTONE_2);
        registerBlock("c3_cobblestone", COBBLESTONE_3);
        registerBlock("c4_cobblestone", COBBLESTONE_4);
        registerBlock("c5_cobblestone", COBBLESTONE_5);
        registerBlock("c6_cobblestone", COBBLESTONE_6);
        registerBlock("c7_cobblestone", COBBLESTONE_7);
        registerBlock("c8_cobblestone", COBBLESTONE_8);
        registerBlock("c9_cobblestone", COBBLESTONE_9);
        // Stone
        registerBlock("c0_stone", STONE_0);
        registerBlock("c1_stone", STONE_1);
        registerBlock("c2_stone", STONE_2);
        registerBlock("c3_stone", STONE_3);
        registerBlock("c4_stone", STONE_4);
        registerBlock("c5_stone", STONE_5);
        registerBlock("c6_stone", STONE_6);
        registerBlock("c7_stone", STONE_7);
        registerBlock("c8_stone", STONE_8);
        registerBlock("c9_stone", STONE_9);
        // Granite
        registerBlock("c0_granite", GRANITE_0);
        registerBlock("c1_granite", GRANITE_1);
        registerBlock("c2_granite", GRANITE_2);
        registerBlock("c3_granite", GRANITE_3);
        registerBlock("c4_granite", GRANITE_4);
        registerBlock("c5_granite", GRANITE_5);
        registerBlock("c6_granite", GRANITE_6);
        registerBlock("c7_granite", GRANITE_7);
        registerBlock("c8_granite", GRANITE_8);
        registerBlock("c9_granite", GRANITE_9);
        // Diorite
        registerBlock("c0_diorite", DIORITE_0);
        registerBlock("c1_diorite", DIORITE_1);
        registerBlock("c2_diorite", DIORITE_2);
        registerBlock("c3_diorite", DIORITE_3);
        registerBlock("c4_diorite", DIORITE_4);
        registerBlock("c5_diorite", DIORITE_5);
        registerBlock("c6_diorite", DIORITE_6);
        registerBlock("c7_diorite", DIORITE_7);
        registerBlock("c8_diorite", DIORITE_8);
        registerBlock("c9_diorite", DIORITE_9);
        // Andesite
        registerBlock("c0_andesite", ANDESITE_0);
        registerBlock("c1_andesite", ANDESITE_1);
        registerBlock("c2_andesite", ANDESITE_2);
        registerBlock("c3_andesite", ANDESITE_3);
        registerBlock("c4_andesite", ANDESITE_4);
        registerBlock("c5_andesite", ANDESITE_5);
        registerBlock("c6_andesite", ANDESITE_6);
        registerBlock("c7_andesite", ANDESITE_7);
        registerBlock("c8_andesite", ANDESITE_8);
        registerBlock("c9_andesite", ANDESITE_9);
        // Clay
        registerBlock("c0_clay", CLAY_0);
        registerBlock("c1_clay", CLAY_1);
        registerBlock("c2_clay", CLAY_2);
        registerBlock("c3_clay", CLAY_3);
        registerBlock("c4_clay", CLAY_4);
        registerBlock("c5_clay", CLAY_5);
        registerBlock("c6_clay", CLAY_6);
        registerBlock("c7_clay", CLAY_7);
        registerBlock("c8_clay", CLAY_8);
        registerBlock("c9_clay", CLAY_9);
        // Sand
        registerBlock("c0_sand", SAND_0);
        registerBlock("c1_sand", SAND_1);
        registerBlock("c2_sand", SAND_2);
        registerBlock("c3_sand", SAND_3);
        registerBlock("c4_sand", SAND_4);
        registerBlock("c5_sand", SAND_5);
        registerBlock("c6_sand", SAND_6);
        registerBlock("c7_sand", SAND_7);
        registerBlock("c8_sand", SAND_8);
        registerBlock("c9_sand", SAND_9);
        // Red Sand
        registerBlock("c0_red_sand", RED_SAND_0);
        registerBlock("c1_red_sand", RED_SAND_1);
        registerBlock("c2_red_sand", RED_SAND_2);
        registerBlock("c3_red_sand", RED_SAND_3);
        registerBlock("c4_red_sand", RED_SAND_4);
        registerBlock("c5_red_sand", RED_SAND_5);
        registerBlock("c6_red_sand", RED_SAND_6);
        registerBlock("c7_red_sand", RED_SAND_7);
        registerBlock("c8_red_sand", RED_SAND_8);
        registerBlock("c9_red_sand", RED_SAND_9);
        // Sandstone
        registerBlock("c0_sandstone", SANDSTONE_0);
        registerBlock("c1_sandstone", SANDSTONE_1);
        registerBlock("c2_sandstone", SANDSTONE_2);
        registerBlock("c3_sandstone", SANDSTONE_3);
        registerBlock("c4_sandstone", SANDSTONE_4);
        registerBlock("c5_sandstone", SANDSTONE_5);
        registerBlock("c6_sandstone", SANDSTONE_6);
        registerBlock("c7_sandstone", SANDSTONE_7);
        registerBlock("c8_sandstone", SANDSTONE_8);
        registerBlock("c9_sandstone", SANDSTONE_9);
        // Red Sandstone
        registerBlock("c0_red_sandstone", RED_SANDSTONE_0);
        registerBlock("c1_red_sandstone", RED_SANDSTONE_1);
        registerBlock("c2_red_sandstone", RED_SANDSTONE_2);
        registerBlock("c3_red_sandstone", RED_SANDSTONE_3);
        registerBlock("c4_red_sandstone", RED_SANDSTONE_4);
        registerBlock("c5_red_sandstone", RED_SANDSTONE_5);
        registerBlock("c6_red_sandstone", RED_SANDSTONE_6);
        registerBlock("c7_red_sandstone", RED_SANDSTONE_7);
        registerBlock("c8_red_sandstone", RED_SANDSTONE_8);
        registerBlock("c9_red_sandstone", RED_SANDSTONE_9);
        // Coal Ore
        registerBlock("c0_coal_ore", COAL_ORE_0);
        registerBlock("c1_coal_ore", COAL_ORE_1);
        registerBlock("c2_coal_ore", COAL_ORE_2);
        registerBlock("c3_coal_ore", COAL_ORE_3);
        registerBlock("c4_coal_ore", COAL_ORE_4);
        registerBlock("c5_coal_ore", COAL_ORE_5);
        registerBlock("c6_coal_ore", COAL_ORE_6);
        registerBlock("c7_coal_ore", COAL_ORE_7);
        registerBlock("c8_coal_ore", COAL_ORE_8);
        registerBlock("c9_coal_ore", COAL_ORE_9);
        // Iron Ore
        registerBlock("c0_iron_ore", IRON_ORE_0);
        registerBlock("c1_iron_ore", IRON_ORE_1);
        registerBlock("c2_iron_ore", IRON_ORE_2);
        registerBlock("c3_iron_ore", IRON_ORE_3);
        registerBlock("c4_iron_ore", IRON_ORE_4);
        registerBlock("c5_iron_ore", IRON_ORE_5);
        registerBlock("c6_iron_ore", IRON_ORE_6);
        registerBlock("c7_iron_ore", IRON_ORE_7);
        registerBlock("c8_iron_ore", IRON_ORE_8);
        registerBlock("c9_iron_ore", IRON_ORE_9);
        // Gold Ore
        registerBlock("c0_gold_ore", GOLD_ORE_0);
        registerBlock("c1_gold_ore", GOLD_ORE_1);
        registerBlock("c2_gold_ore", GOLD_ORE_2);
        registerBlock("c3_gold_ore", GOLD_ORE_3);
        registerBlock("c4_gold_ore", GOLD_ORE_4);
        registerBlock("c5_gold_ore", GOLD_ORE_5);
        registerBlock("c6_gold_ore", GOLD_ORE_6);
        registerBlock("c7_gold_ore", GOLD_ORE_7);
        registerBlock("c8_gold_ore", GOLD_ORE_8);
        registerBlock("c9_gold_ore", GOLD_ORE_9);
        // Nether Quartz Ore
        registerBlock("c0_nether_quartz_ore", NETHER_QUARTZ_ORE_0);
        registerBlock("c1_nether_quartz_ore", NETHER_QUARTZ_ORE_1);
        registerBlock("c2_nether_quartz_ore", NETHER_QUARTZ_ORE_2);
        registerBlock("c3_nether_quartz_ore", NETHER_QUARTZ_ORE_3);
        registerBlock("c4_nether_quartz_ore", NETHER_QUARTZ_ORE_4);
        registerBlock("c5_nether_quartz_ore", NETHER_QUARTZ_ORE_5);
        registerBlock("c6_nether_quartz_ore", NETHER_QUARTZ_ORE_6);
        registerBlock("c7_nether_quartz_ore", NETHER_QUARTZ_ORE_7);
        registerBlock("c8_nether_quartz_ore", NETHER_QUARTZ_ORE_8);
        registerBlock("c9_nether_quartz_ore", NETHER_QUARTZ_ORE_9);
        // Lapis Ore
        registerBlock("c0_lapis_ore", LAPIS_ORE_0);
        registerBlock("c1_lapis_ore", LAPIS_ORE_1);
        registerBlock("c2_lapis_ore", LAPIS_ORE_2);
        registerBlock("c3_lapis_ore", LAPIS_ORE_3);
        registerBlock("c4_lapis_ore", LAPIS_ORE_4);
        registerBlock("c5_lapis_ore", LAPIS_ORE_5);
        registerBlock("c6_lapis_ore", LAPIS_ORE_6);
        registerBlock("c7_lapis_ore", LAPIS_ORE_7);
        registerBlock("c8_lapis_ore", LAPIS_ORE_8);
        registerBlock("c9_lapis_ore", LAPIS_ORE_9);
        // Redstone Ore
        registerBlock("c0_redstone_ore", REDSTONE_ORE_0);
        registerBlock("c1_redstone_ore", REDSTONE_ORE_1);
        registerBlock("c2_redstone_ore", REDSTONE_ORE_2);
        registerBlock("c3_redstone_ore", REDSTONE_ORE_3);
        registerBlock("c4_redstone_ore", REDSTONE_ORE_4);
        registerBlock("c5_redstone_ore", REDSTONE_ORE_5);
        registerBlock("c6_redstone_ore", REDSTONE_ORE_6);
        registerBlock("c7_redstone_ore", REDSTONE_ORE_7);
        registerBlock("c8_redstone_ore", REDSTONE_ORE_8);
        registerBlock("c9_redstone_ore", REDSTONE_ORE_9);
        // Iron Block
        registerBlock("c0_iron_block", IRON_BLOCK_0);
        registerBlock("c1_iron_block", IRON_BLOCK_1);
        registerBlock("c2_iron_block", IRON_BLOCK_2);
        registerBlock("c3_iron_block", IRON_BLOCK_3);
        registerBlock("c4_iron_block", IRON_BLOCK_4);
        registerBlock("c5_iron_block", IRON_BLOCK_5);
        registerBlock("c6_iron_block", IRON_BLOCK_6);
        registerBlock("c7_iron_block", IRON_BLOCK_7);
        registerBlock("c8_iron_block", IRON_BLOCK_8);
        registerBlock("c9_iron_block", IRON_BLOCK_9);
        // Gold Block
        registerBlock("c0_gold_block", GOLD_BLOCK_0);
        registerBlock("c1_gold_block", GOLD_BLOCK_1);
        registerBlock("c2_gold_block", GOLD_BLOCK_2);
        registerBlock("c3_gold_block", GOLD_BLOCK_3);
        registerBlock("c4_gold_block", GOLD_BLOCK_4);
        registerBlock("c5_gold_block", GOLD_BLOCK_5);
        registerBlock("c6_gold_block", GOLD_BLOCK_6);
        registerBlock("c7_gold_block", GOLD_BLOCK_7);
        registerBlock("c8_gold_block", GOLD_BLOCK_8);
        registerBlock("c9_gold_block", GOLD_BLOCK_9);
        // Lapis Block
        registerBlock("c0_lapis_block", LAPIS_BLOCK_0);
        registerBlock("c1_lapis_block", LAPIS_BLOCK_1);
        registerBlock("c2_lapis_block", LAPIS_BLOCK_2);
        registerBlock("c3_lapis_block", LAPIS_BLOCK_3);
        registerBlock("c4_lapis_block", LAPIS_BLOCK_4);
        registerBlock("c5_lapis_block", LAPIS_BLOCK_5);
        registerBlock("c6_lapis_block", LAPIS_BLOCK_6);
        registerBlock("c7_lapis_block", LAPIS_BLOCK_7);
        registerBlock("c8_lapis_block", LAPIS_BLOCK_8);
        registerBlock("c9_lapis_block", LAPIS_BLOCK_9);
        // Redstone Block
        registerBlock("c0_redstone_block", REDSTONE_BLOCK_0);
        registerBlock("c1_redstone_block", REDSTONE_BLOCK_1);
        registerBlock("c2_redstone_block", REDSTONE_BLOCK_2);
        registerBlock("c3_redstone_block", REDSTONE_BLOCK_3);
        registerBlock("c4_redstone_block", REDSTONE_BLOCK_4);
        registerBlock("c5_redstone_block", REDSTONE_BLOCK_5);
        registerBlock("c6_redstone_block", REDSTONE_BLOCK_6);
        registerBlock("c7_redstone_block", REDSTONE_BLOCK_7);
        registerBlock("c8_redstone_block", REDSTONE_BLOCK_8);
        registerBlock("c9_redstone_block", REDSTONE_BLOCK_9);
        // Coal Block
        registerBlock("c0_coal_block", COAL_BLOCK_0);
        registerBlock("c1_coal_block", COAL_BLOCK_1);
        registerBlock("c2_coal_block", COAL_BLOCK_2);
        registerBlock("c3_coal_block", COAL_BLOCK_3);
        registerBlock("c4_coal_block", COAL_BLOCK_4);
        registerBlock("c5_coal_block", COAL_BLOCK_5);
        registerBlock("c6_coal_block", COAL_BLOCK_6);
        registerBlock("c7_coal_block", COAL_BLOCK_7);
        registerBlock("c8_coal_block", COAL_BLOCK_8);
        registerBlock("c9_coal_block", COAL_BLOCK_9);
        // Slime Block
        registerBlock("c0_slime_block", SLIME_BLOCK_0);
        registerBlock("c1_slime_block", SLIME_BLOCK_1);
        registerBlock("c2_slime_block", SLIME_BLOCK_2);
        registerBlock("c3_slime_block", SLIME_BLOCK_3);
        registerBlock("c4_slime_block", SLIME_BLOCK_4);
        registerBlock("c5_slime_block", SLIME_BLOCK_5);
        registerBlock("c6_slime_block", SLIME_BLOCK_6);
        registerBlock("c7_slime_block", SLIME_BLOCK_7);
        registerBlock("c8_slime_block", SLIME_BLOCK_8);
        registerBlock("c9_slime_block", SLIME_BLOCK_9);
        // Honey Block
        registerBlock("c0_honey_block", HONEY_BLOCK_0);
        registerBlock("c1_honey_block", HONEY_BLOCK_1);
        registerBlock("c2_honey_block", HONEY_BLOCK_2);
        registerBlock("c3_honey_block", HONEY_BLOCK_3);
        registerBlock("c4_honey_block", HONEY_BLOCK_4);
        registerBlock("c5_honey_block", HONEY_BLOCK_5);
        registerBlock("c6_honey_block", HONEY_BLOCK_6);
        registerBlock("c7_honey_block", HONEY_BLOCK_7);
        registerBlock("c8_honey_block", HONEY_BLOCK_8);
        registerBlock("c9_honey_block", HONEY_BLOCK_9);
        // Bricks
        registerBlock("c0_bricks", BRICKS_0);
        registerBlock("c1_bricks", BRICKS_1);
        registerBlock("c2_bricks", BRICKS_2);
        registerBlock("c3_bricks", BRICKS_3);
        registerBlock("c4_bricks", BRICKS_4);
        registerBlock("c5_bricks", BRICKS_5);
        registerBlock("c6_bricks", BRICKS_6);
        registerBlock("c7_bricks", BRICKS_7);
        registerBlock("c8_bricks", BRICKS_8);
        registerBlock("c9_bricks", BRICKS_9);
        // Stone Bricks
        registerBlock("c0_stone_bricks", STONE_BRICKS_0);
        registerBlock("c1_stone_bricks", STONE_BRICKS_1);
        registerBlock("c2_stone_bricks", STONE_BRICKS_2);
        registerBlock("c3_stone_bricks", STONE_BRICKS_3);
        registerBlock("c4_stone_bricks", STONE_BRICKS_4);
        registerBlock("c5_stone_bricks", STONE_BRICKS_5);
        registerBlock("c6_stone_bricks", STONE_BRICKS_6);
        registerBlock("c7_stone_bricks", STONE_BRICKS_7);
        registerBlock("c8_stone_bricks", STONE_BRICKS_8);
        registerBlock("c9_stone_bricks", STONE_BRICKS_9);
        // Netherrack
        registerBlock("c0_netherrack", NETHERRACK_0);
        registerBlock("c1_netherrack", NETHERRACK_1);
        registerBlock("c2_netherrack", NETHERRACK_2);
        registerBlock("c3_netherrack", NETHERRACK_3);
        registerBlock("c4_netherrack", NETHERRACK_4);
        registerBlock("c5_netherrack", NETHERRACK_5);
        registerBlock("c6_netherrack", NETHERRACK_6);
        registerBlock("c7_netherrack", NETHERRACK_7);
        registerBlock("c8_netherrack", NETHERRACK_8);
        registerBlock("c9_netherrack", NETHERRACK_9);
        // Nether Bricks
        registerBlock("c0_nether_bricks", NETHER_BRICKS_0);
        registerBlock("c1_nether_bricks", NETHER_BRICKS_1);
        registerBlock("c2_nether_bricks", NETHER_BRICKS_2);
        registerBlock("c3_nether_bricks", NETHER_BRICKS_3);
        registerBlock("c4_nether_bricks", NETHER_BRICKS_4);
        registerBlock("c5_nether_bricks", NETHER_BRICKS_5);
        registerBlock("c6_nether_bricks", NETHER_BRICKS_6);
        registerBlock("c7_nether_bricks", NETHER_BRICKS_7);
        registerBlock("c8_nether_bricks", NETHER_BRICKS_8);
        registerBlock("c9_nether_bricks", NETHER_BRICKS_9);
        // Red Nether Bricks
        registerBlock("c0_red_nether_bricks", RED_NETHER_BRICKS_0);
        registerBlock("c1_red_nether_bricks", RED_NETHER_BRICKS_1);
        registerBlock("c2_red_nether_bricks", RED_NETHER_BRICKS_2);
        registerBlock("c3_red_nether_bricks", RED_NETHER_BRICKS_3);
        registerBlock("c4_red_nether_bricks", RED_NETHER_BRICKS_4);
        registerBlock("c5_red_nether_bricks", RED_NETHER_BRICKS_5);
        registerBlock("c6_red_nether_bricks", RED_NETHER_BRICKS_6);
        registerBlock("c7_red_nether_bricks", RED_NETHER_BRICKS_7);
        registerBlock("c8_red_nether_bricks", RED_NETHER_BRICKS_8);
        registerBlock("c9_red_nether_bricks", RED_NETHER_BRICKS_9);
        // Nether Wart Block
        registerBlock("c0_nether_wart_block", NETHER_WART_BLOCK_0);
        registerBlock("c1_nether_wart_block", NETHER_WART_BLOCK_1);
        registerBlock("c2_nether_wart_block", NETHER_WART_BLOCK_2);
        registerBlock("c3_nether_wart_block", NETHER_WART_BLOCK_3);
        registerBlock("c4_nether_wart_block", NETHER_WART_BLOCK_4);
        registerBlock("c5_nether_wart_block", NETHER_WART_BLOCK_5);
        registerBlock("c6_nether_wart_block", NETHER_WART_BLOCK_6);
        registerBlock("c7_nether_wart_block", NETHER_WART_BLOCK_7);
        registerBlock("c8_nether_wart_block", NETHER_WART_BLOCK_8);
        registerBlock("c9_nether_wart_block", NETHER_WART_BLOCK_9);
        // Soul Sand
        registerBlock("c0_soul_sand", SOUL_SAND_0);
        registerBlock("c1_soul_sand", SOUL_SAND_1);
        registerBlock("c2_soul_sand", SOUL_SAND_2);
        registerBlock("c3_soul_sand", SOUL_SAND_3);
        registerBlock("c4_soul_sand", SOUL_SAND_4);
        registerBlock("c5_soul_sand", SOUL_SAND_5);
        registerBlock("c6_soul_sand", SOUL_SAND_6);
        registerBlock("c7_soul_sand", SOUL_SAND_7);
        registerBlock("c8_soul_sand", SOUL_SAND_8);
        registerBlock("c9_soul_sand", SOUL_SAND_9);
        // End Stone
        registerBlock("c0_end_stone", END_STONE_0);
        registerBlock("c1_end_stone", END_STONE_1);
        registerBlock("c2_end_stone", END_STONE_2);
        registerBlock("c3_end_stone", END_STONE_3);
        registerBlock("c4_end_stone", END_STONE_4);
        registerBlock("c5_end_stone", END_STONE_5);
        registerBlock("c6_end_stone", END_STONE_6);
        registerBlock("c7_end_stone", END_STONE_7);
        registerBlock("c8_end_stone", END_STONE_8);
        registerBlock("c9_end_stone", END_STONE_9);
        // End Stone Bricks
        registerBlock("c0_end_stone_bricks", END_STONE_BRICKS_0);
        registerBlock("c1_end_stone_bricks", END_STONE_BRICKS_1);
        registerBlock("c2_end_stone_bricks", END_STONE_BRICKS_2);
        registerBlock("c3_end_stone_bricks", END_STONE_BRICKS_3);
        registerBlock("c4_end_stone_bricks", END_STONE_BRICKS_4);
        registerBlock("c5_end_stone_bricks", END_STONE_BRICKS_5);
        registerBlock("c6_end_stone_bricks", END_STONE_BRICKS_6);
        registerBlock("c7_end_stone_bricks", END_STONE_BRICKS_7);
        registerBlock("c8_end_stone_bricks", END_STONE_BRICKS_8);
        registerBlock("c9_end_stone_bricks", END_STONE_BRICKS_9);
        // Obsidian
        registerBlock("c0_obsidian", OBSIDIAN_0);
        registerBlock("c1_obsidian", OBSIDIAN_1);
        registerBlock("c2_obsidian", OBSIDIAN_2);
        registerBlock("c3_obsidian", OBSIDIAN_3);
        registerBlock("c4_obsidian", OBSIDIAN_4);
        registerBlock("c5_obsidian", OBSIDIAN_5);
        registerBlock("c6_obsidian", OBSIDIAN_6);
        registerBlock("c7_obsidian", OBSIDIAN_7);
        registerBlock("c8_obsidian", OBSIDIAN_8);
        registerBlock("c9_obsidian", OBSIDIAN_9);
        // OAK_LOG
        registerBlock("c0_" + "OAK_LOG", OAK_LOG_0);
        registerBlock("c1_" + "OAK_LOG", OAK_LOG_1);
        registerBlock("c2_" + "OAK_LOG", OAK_LOG_2);
        registerBlock("c3_" + "OAK_LOG", OAK_LOG_3);
        registerBlock("c4_" + "OAK_LOG", OAK_LOG_4);
        registerBlock("c5_" + "OAK_LOG", OAK_LOG_5);
        registerBlock("c6_" + "OAK_LOG", OAK_LOG_6);
        registerBlock("c7_" + "OAK_LOG", OAK_LOG_7);
        registerBlock("c8_" + "OAK_LOG", OAK_LOG_8);
        registerBlock("c9_" + "OAK_LOG", OAK_LOG_9);
        // SPRUCE_LOG
        registerBlock("c0_" + "SPRUCE_LOG", SPRUCE_LOG_0);
        registerBlock("c1_" + "SPRUCE_LOG", SPRUCE_LOG_1);
        registerBlock("c2_" + "SPRUCE_LOG", SPRUCE_LOG_2);
        registerBlock("c3_" + "SPRUCE_LOG", SPRUCE_LOG_3);
        registerBlock("c4_" + "SPRUCE_LOG", SPRUCE_LOG_4);
        registerBlock("c5_" + "SPRUCE_LOG", SPRUCE_LOG_5);
        registerBlock("c6_" + "SPRUCE_LOG", SPRUCE_LOG_6);
        registerBlock("c7_" + "SPRUCE_LOG", SPRUCE_LOG_7);
        registerBlock("c8_" + "SPRUCE_LOG", SPRUCE_LOG_8);
        registerBlock("c9_" + "SPRUCE_LOG", SPRUCE_LOG_9);
        // BIRCH_LOG
        registerBlock("c0_" + "BIRCH_LOG", BIRCH_LOG_0);
        registerBlock("c1_" + "BIRCH_LOG", BIRCH_LOG_1);
        registerBlock("c2_" + "BIRCH_LOG", BIRCH_LOG_2);
        registerBlock("c3_" + "BIRCH_LOG", BIRCH_LOG_3);
        registerBlock("c4_" + "BIRCH_LOG", BIRCH_LOG_4);
        registerBlock("c5_" + "BIRCH_LOG", BIRCH_LOG_5);
        registerBlock("c6_" + "BIRCH_LOG", BIRCH_LOG_6);
        registerBlock("c7_" + "BIRCH_LOG", BIRCH_LOG_7);
        registerBlock("c8_" + "BIRCH_LOG", BIRCH_LOG_8);
        registerBlock("c9_" + "BIRCH_LOG", BIRCH_LOG_9);
        // JUNGLE_LOG
        registerBlock("c0_" + "JUNGLE_LOG", JUNGLE_LOG_0);
        registerBlock("c1_" + "JUNGLE_LOG", JUNGLE_LOG_1);
        registerBlock("c2_" + "JUNGLE_LOG", JUNGLE_LOG_2);
        registerBlock("c3_" + "JUNGLE_LOG", JUNGLE_LOG_3);
        registerBlock("c4_" + "JUNGLE_LOG", JUNGLE_LOG_4);
        registerBlock("c5_" + "JUNGLE_LOG", JUNGLE_LOG_5);
        registerBlock("c6_" + "JUNGLE_LOG", JUNGLE_LOG_6);
        registerBlock("c7_" + "JUNGLE_LOG", JUNGLE_LOG_7);
        registerBlock("c8_" + "JUNGLE_LOG", JUNGLE_LOG_8);
        registerBlock("c9_" + "JUNGLE_LOG", JUNGLE_LOG_9);
        // ACACIA_LOG
        registerBlock("c0_" + "ACACIA_LOG", ACACIA_LOG_0);
        registerBlock("c1_" + "ACACIA_LOG", ACACIA_LOG_1);
        registerBlock("c2_" + "ACACIA_LOG", ACACIA_LOG_2);
        registerBlock("c3_" + "ACACIA_LOG", ACACIA_LOG_3);
        registerBlock("c4_" + "ACACIA_LOG", ACACIA_LOG_4);
        registerBlock("c5_" + "ACACIA_LOG", ACACIA_LOG_5);
        registerBlock("c6_" + "ACACIA_LOG", ACACIA_LOG_6);
        registerBlock("c7_" + "ACACIA_LOG", ACACIA_LOG_7);
        registerBlock("c8_" + "ACACIA_LOG", ACACIA_LOG_8);
        registerBlock("c9_" + "ACACIA_LOG", ACACIA_LOG_9);
        // DARK_OAK_LOG
        registerBlock("c0_" + "DARK_OAK_LOG", DARK_OAK_LOG_0);
        registerBlock("c1_" + "DARK_OAK_LOG", DARK_OAK_LOG_1);
        registerBlock("c2_" + "DARK_OAK_LOG", DARK_OAK_LOG_2);
        registerBlock("c3_" + "DARK_OAK_LOG", DARK_OAK_LOG_3);
        registerBlock("c4_" + "DARK_OAK_LOG", DARK_OAK_LOG_4);
        registerBlock("c5_" + "DARK_OAK_LOG", DARK_OAK_LOG_5);
        registerBlock("c6_" + "DARK_OAK_LOG", DARK_OAK_LOG_6);
        registerBlock("c7_" + "DARK_OAK_LOG", DARK_OAK_LOG_7);
        registerBlock("c8_" + "DARK_OAK_LOG", DARK_OAK_LOG_8);
        registerBlock("c9_" + "DARK_OAK_LOG", DARK_OAK_LOG_9);
        // STRIPPED_OAK_LOG
        registerBlock("c0_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_0);
        registerBlock("c1_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_1);
        registerBlock("c2_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_2);
        registerBlock("c3_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_3);
        registerBlock("c4_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_4);
        registerBlock("c5_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_5);
        registerBlock("c6_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_6);
        registerBlock("c7_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_7);
        registerBlock("c8_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_8);
        registerBlock("c9_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_9);
        // STRIPPED_SPRUCE_LOG
        registerBlock("c0_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_0);
        registerBlock("c1_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_1);
        registerBlock("c2_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_2);
        registerBlock("c3_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_3);
        registerBlock("c4_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_4);
        registerBlock("c5_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_5);
        registerBlock("c6_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_6);
        registerBlock("c7_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_7);
        registerBlock("c8_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_8);
        registerBlock("c9_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_9);
        // STRIPPED_BIRCH_LOG
        registerBlock("c0_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_0);
        registerBlock("c1_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_1);
        registerBlock("c2_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_2);
        registerBlock("c3_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_3);
        registerBlock("c4_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_4);
        registerBlock("c5_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_5);
        registerBlock("c6_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_6);
        registerBlock("c7_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_7);
        registerBlock("c8_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_8);
        registerBlock("c9_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_9);
        // STRIPPED_JUNGLE_LOG
        registerBlock("c0_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_0);
        registerBlock("c1_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_1);
        registerBlock("c2_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_2);
        registerBlock("c3_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_3);
        registerBlock("c4_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_4);
        registerBlock("c5_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_5);
        registerBlock("c6_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_6);
        registerBlock("c7_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_7);
        registerBlock("c8_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_8);
        registerBlock("c9_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_9);
        // STRIPPED_ACACIA_LOG
        registerBlock("c0_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_0);
        registerBlock("c1_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_1);
        registerBlock("c2_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_2);
        registerBlock("c3_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_3);
        registerBlock("c4_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_4);
        registerBlock("c5_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_5);
        registerBlock("c6_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_6);
        registerBlock("c7_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_7);
        registerBlock("c8_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_8);
        registerBlock("c9_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_9);
        // STRIPPED_DARK_OAK_LOG
        registerBlock("c0_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_0);
        registerBlock("c1_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_1);
        registerBlock("c2_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_2);
        registerBlock("c3_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_3);
        registerBlock("c4_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_4);
        registerBlock("c5_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_5);
        registerBlock("c6_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_6);
        registerBlock("c7_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_7);
        registerBlock("c8_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_8);
        registerBlock("c9_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_9);
        // OAK_PLANKS
        registerBlock("c0_" + "OAK_PLANKS", OAK_PLANKS_0);
        registerBlock("c1_" + "OAK_PLANKS", OAK_PLANKS_1);
        registerBlock("c2_" + "OAK_PLANKS", OAK_PLANKS_2);
        registerBlock("c3_" + "OAK_PLANKS", OAK_PLANKS_3);
        registerBlock("c4_" + "OAK_PLANKS", OAK_PLANKS_4);
        registerBlock("c5_" + "OAK_PLANKS", OAK_PLANKS_5);
        registerBlock("c6_" + "OAK_PLANKS", OAK_PLANKS_6);
        registerBlock("c7_" + "OAK_PLANKS", OAK_PLANKS_7);
        registerBlock("c8_" + "OAK_PLANKS", OAK_PLANKS_8);
        registerBlock("c9_" + "OAK_PLANKS", OAK_PLANKS_9);
        // SPRUCE_PLANKS
        registerBlock("c0_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_0);
        registerBlock("c1_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_1);
        registerBlock("c2_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_2);
        registerBlock("c3_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_3);
        registerBlock("c4_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_4);
        registerBlock("c5_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_5);
        registerBlock("c6_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_6);
        registerBlock("c7_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_7);
        registerBlock("c8_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_8);
        registerBlock("c9_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_9);
        // BIRCH_PLANKS
        registerBlock("c0_" + "BIRCH_PLANKS", BIRCH_PLANKS_0);
        registerBlock("c1_" + "BIRCH_PLANKS", BIRCH_PLANKS_1);
        registerBlock("c2_" + "BIRCH_PLANKS", BIRCH_PLANKS_2);
        registerBlock("c3_" + "BIRCH_PLANKS", BIRCH_PLANKS_3);
        registerBlock("c4_" + "BIRCH_PLANKS", BIRCH_PLANKS_4);
        registerBlock("c5_" + "BIRCH_PLANKS", BIRCH_PLANKS_5);
        registerBlock("c6_" + "BIRCH_PLANKS", BIRCH_PLANKS_6);
        registerBlock("c7_" + "BIRCH_PLANKS", BIRCH_PLANKS_7);
        registerBlock("c8_" + "BIRCH_PLANKS", BIRCH_PLANKS_8);
        registerBlock("c9_" + "BIRCH_PLANKS", BIRCH_PLANKS_9);
        // JUNGLE_PLANKS
        registerBlock("c0_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_0);
        registerBlock("c1_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_1);
        registerBlock("c2_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_2);
        registerBlock("c3_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_3);
        registerBlock("c4_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_4);
        registerBlock("c5_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_5);
        registerBlock("c6_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_6);
        registerBlock("c7_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_7);
        registerBlock("c8_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_8);
        registerBlock("c9_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_9);
        // ACACIA_PLANKS
        registerBlock("c0_" + "ACACIA_PLANKS", ACACIA_PLANKS_0);
        registerBlock("c1_" + "ACACIA_PLANKS", ACACIA_PLANKS_1);
        registerBlock("c2_" + "ACACIA_PLANKS", ACACIA_PLANKS_2);
        registerBlock("c3_" + "ACACIA_PLANKS", ACACIA_PLANKS_3);
        registerBlock("c4_" + "ACACIA_PLANKS", ACACIA_PLANKS_4);
        registerBlock("c5_" + "ACACIA_PLANKS", ACACIA_PLANKS_5);
        registerBlock("c6_" + "ACACIA_PLANKS", ACACIA_PLANKS_6);
        registerBlock("c7_" + "ACACIA_PLANKS", ACACIA_PLANKS_7);
        registerBlock("c8_" + "ACACIA_PLANKS", ACACIA_PLANKS_8);
        registerBlock("c9_" + "ACACIA_PLANKS", ACACIA_PLANKS_9);
        // DARK_OAK_PLANKS
        registerBlock("c0_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_0);
        registerBlock("c1_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_1);
        registerBlock("c2_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_2);
        registerBlock("c3_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_3);
        registerBlock("c4_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_4);
        registerBlock("c5_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_5);
        registerBlock("c6_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_6);
        registerBlock("c7_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_7);
        registerBlock("c8_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_8);
        registerBlock("c9_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_9);
    }
}
