package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class GenLanguageProvider extends LanguageProvider {
    public GenLanguageProvider(DataGenerator gen, String locale) {
        super(gen, CompressedBlocks.MOD_ID, locale);
    }

    private static String stringFormat(String formatString) {
        formatString = formatString.replace("_", " ");
        String[] words = formatString.split("\\s");
        StringBuilder stringFormat = new StringBuilder();
        for (String str : words) {
            String first = str.substring(0, 1);
            String afterFirst = str.substring(1);
            stringFormat.append(first.toUpperCase()).append(afterFirst).append(" ");
        }
        return stringFormat.toString().trim();
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.compressed_blocks", "Compressed Blocks");
        add("item.compressedblocks.hardened_wooden_pickaxe", "\u00A74\u0028removed\u0029\u00A7f Hardened Wooden Pickaxe");
        add("item.compressedblocks.hardened_wooden_axe", "\u00A74\u0028removed\u0029\u00A7f Hardened Wooden Axe");
        add("item.compressedblocks.hardened_wooden_shovel", "\u00A74\u0028removed\u0029\u00A7f Hardened Wooden Shovel");
        add("item.compressedblocks.hardened_wooden_hoe", "\u00A74\u0028removed\u0029\u00A7f Hardened Wooden Hoe");
        add("item.compressedblocks.hardened_wooden_sword", "\u00A74\u0028removed\u0029\u00A7f Hardened Wooden Sword");
        add("item.compressedblocks.hardened_pickaxe", "\u00A74\u0028removed\u0029\u00A7f Hardened Pickaxe");
        add("item.compressedblocks.hardened_axe", "\u00A74\u0028removed\u0029\u00A7f Hardened Axe");
        add("item.compressedblocks.hardened_shovel", "\u00A74\u0028removed\u0029\u00A7f Hardened Shovel");
        add("item.compressedblocks.hardened_hoe", "\u00A74\u0028removed\u0029\u00A7f Hardened Hoe");
        add("item.compressedblocks.hardened_sword", "\u00A74\u0028removed\u0029\u00A7f Hardened Sword");
        add("item.compressedblocks.hardened_iron_pickaxe", "\u00A74\u0028removed\u0029\u00A7f Hardened Iron Pickaxe");
        add("item.compressedblocks.hardened_iron_axe", "\u00A74\u0028removed\u0029\u00A7f Hardened Iron Axe");
        add("item.compressedblocks.hardened_iron_shovel", "\u00A74\u0028removed\u0029\u00A7f Hardened Iron Shovel");
        add("item.compressedblocks.hardened_iron_hoe", "\u00A74\u0028removed\u0029\u00A7f Hardened Iron Hoe");
        add("item.compressedblocks.hardened_iron_sword", "\u00A74\u0028removed\u0029\u00A7f Hardened Iron Sword");
        add("item.compressedblocks.hardened_golden_pickaxe", "\u00A74\u0028removed\u0029\u00A7f Hardened Golden Pickaxe");
        add("item.compressedblocks.hardened_golden_axe", "\u00A74\u0028removed\u0029\u00A7f Hardened Golden Axe");
        add("item.compressedblocks.hardened_golden_shovel", "\u00A74\u0028removed\u0029\u00A7f Hardened Golden Shovel");
        add("item.compressedblocks.hardened_golden_hoe", "\u00A74\u0028removed\u0029\u00A7f Hardened Golden Hoe");
        add("item.compressedblocks.hardened_golden_sword", "\u00A74\u0028removed\u0029\u00A7f Hardened Golden Sword");
        add("item.compressedblocks.hardened_diamond_pickaxe", "\u00A74\u0028removed\u0029\u00A7f Hardened Diamond Pickaxe");
        add("item.compressedblocks.hardened_diamond_axe", "\u00A74\u0028removed\u0029\u00A7f Hardened Diamond Axe");
        add("item.compressedblocks.hardened_diamond_shovel", "\u00A74\u0028removed\u0029\u00A7f Hardened Diamond Shovel");
        add("item.compressedblocks.hardened_diamond_hoe", "\u00A74\u0028removed\u0029\u00A7f Hardened Diamond Hoe");
        add("item.compressedblocks.hardened_diamond_sword", "\u00A74\u0028removed\u0029\u00A7f Hardened Diamond Sword");
        add("item.compressedblocks.compressed_stick", "\u00A74\u0028removed\u0029\u00A7f Hardened Stick");
        add("item.compressedblocks.compressed_wood", "\u00A74\u0028removed\u0029\u00A7f Hardened Wood");
        add("item.compressedblocks.compressed_iron", "\u00A74\u0028removed\u0029\u00A7f Hardened Iron");
        add("item.compressedblocks.compressed_gold", "\u00A74\u0028removed\u0029\u00A7f Hardened Gold");
        add("item.compressedblocks.compressed_diamond", "\u00A74\u0028removed\u0029\u00A7f Hardened Diamond");
        add("item.compressedblocks.ender_pearl_bag", "\u00A74\u0028removed\u0029\u00A7f Sack of Ender Pearls");
        add("item.compressedblocks.huge_ender_pearl_bag", "\u00A74\u0028removed\u0029\u00A7f Huge Sack of Ender Pearls");
        add("item.compressedblocks.ender_eye_bag", "\u00A74\u0028removed\u0029\u00A7f Sack of Ender Eyes");
        add("item.compressedblocks.huge_ender_eye_bag", "\u00A74\u0028removed\u0029\u00A7f Huge Sack of Ender Eyes");
        add("item.compressedblocks.egg_bag", "\u00A74\u0028removed\u0029\u00A7f Sack of Eggs");
        add("item.compressedblocks.huge_egg_bag", "\u00A74\u0028removed\u0029\u00A7f Huge Sack of Eggs");
        add("block.compressedblocks.logo_block", "Logo Block (This Block has no use and is only used as the Creative Tab Logo)");

        for (BlockFactory factory : Lists.blockList) {
            add("block.compressedblocks.c0_" + factory.getRegistryName(), "Compressed " + stringFormat(factory.getRegistryName()));
            add("block.compressedblocks.c1_" + factory.getRegistryName(), "Double Compressed " + stringFormat(factory.getRegistryName()));
            add("block.compressedblocks.c2_" + factory.getRegistryName(), "Triple Compressed " + stringFormat(factory.getRegistryName()));
            add("block.compressedblocks.c3_" + factory.getRegistryName(), "Quadruple Compressed " + stringFormat(factory.getRegistryName()));
            add("block.compressedblocks.c4_" + factory.getRegistryName(), "Quintuple Compressed " + stringFormat(factory.getRegistryName()));
            add("block.compressedblocks.c5_" + factory.getRegistryName(), "Sextuple Compressed " + stringFormat(factory.getRegistryName()));
            add("block.compressedblocks.c6_" + factory.getRegistryName(), "Septuple Compressed " + stringFormat(factory.getRegistryName()));
            add("block.compressedblocks.c7_" + factory.getRegistryName(), "Octuple Compressed " + stringFormat(factory.getRegistryName()));
            add("block.compressedblocks.c8_" + factory.getRegistryName(), "Mega Compressed " + stringFormat(factory.getRegistryName()));
            add("block.compressedblocks.c9_" + factory.getRegistryName(), "Giga Compressed " + stringFormat(factory.getRegistryName()));
        }

        for (String s : Lists.ITEMS) {
            add("item.compressedblocks.crated_" + s.toLowerCase(), "Crate of " + stringFormat(s));
            add("item.compressedblocks.double_crated_" + s.toLowerCase(), "Double Crate of " + stringFormat(s));
            add("item.compressedblocks.triple_crated_" + s.toLowerCase(), "Triple Crate of " + stringFormat(s));
            add("item.compressedblocks.quadruple_crated_" + s.toLowerCase(), "Quadruple Crate of " + stringFormat(s));
            add("item.compressedblocks.quintuple_crated_" + s.toLowerCase(), "Quintuple Crate of " + stringFormat(s));
            add("item.compressedblocks.sextuple_crated_" + s.toLowerCase(), "Sextuple Crate of " + stringFormat(s));
            add("item.compressedblocks.septuple_crated_" + s.toLowerCase(), "Septuple Crate of " + stringFormat(s));
            add("item.compressedblocks.octuple_crated_" + s.toLowerCase(), "Octuple Crate of " + stringFormat(s));
            add("item.compressedblocks.mega_crated_" + s.toLowerCase(), "Mega Crate of " + stringFormat(s));
            add("item.compressedblocks.giga_crated_" + s.toLowerCase(), "Giga Crate of " + stringFormat(s));
        }
    }
}