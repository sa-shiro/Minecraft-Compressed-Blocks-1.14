package com.github.sa_shiro.compressedblocks.event;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.item.BagItem;
import com.github.sa_shiro.compressedblocks.item.EnumItemTier;
import com.github.sa_shiro.compressedblocks.item.ToolItems;
import com.github.sa_shiro.compressedblocks.util.ItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;

public class ModRegistryObjects {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedBlocks.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS2 = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedBlocks.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CompressedBlocks.MOD_ID);
    // removed in 1.17
    public static final RegistryObject<Item> HARDENED_DIAMOND_SWORD = ITEMS.register("hardened_diamond_sword", () -> new ToolItems.HardenedSword(EnumItemTier.HARDENED_DIAMOND, 5, -2.4F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_HOE = ITEMS.register("hardened_diamond_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_DIAMOND, 1, 0.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_SHOVEL = ITEMS.register("hardened_diamond_shovel", () -> new ToolItems.HardenedShovel(EnumItemTier.HARDENED_DIAMOND, 1.5F, -3.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_AXE = ITEMS.register("hardened_diamond_axe", () -> new ToolItems.HardenedAxe(EnumItemTier.HARDENED_DIAMOND, 7, -3.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_PICKAXE = ITEMS.register("hardened_diamond_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_DIAMOND, 1, -2.8F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_SWORD = ITEMS.register("hardened_golden_sword", () -> new ToolItems.HardenedSword(EnumItemTier.HARDENED_GOLD, 4, -2.4F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_HOE = ITEMS.register("hardened_golden_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_GOLD, 1, 0.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_SHOVEL = ITEMS.register("hardened_golden_shovel", () -> new ToolItems.HardenedShovel(EnumItemTier.HARDENED_GOLD, 1.5F, -3.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_AXE = ITEMS.register("hardened_golden_axe", () -> new ToolItems.HardenedAxe(EnumItemTier.HARDENED_GOLD, 6, -3.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_PICKAXE = ITEMS.register("hardened_golden_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_GOLD, 1, -2.8F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_SWORD = ITEMS.register("hardened_iron_sword", () -> new ToolItems.HardenedSword(EnumItemTier.HARDENED_IRON, 4, -2.4F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_HOE = ITEMS.register("hardened_iron_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_IRON, 1, 0.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_SHOVEL = ITEMS.register("hardened_iron_shovel", () -> new ToolItems.HardenedShovel(EnumItemTier.HARDENED_IRON, 1.5F, -3.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_AXE = ITEMS.register("hardened_iron_axe", () -> new ToolItems.HardenedAxe(EnumItemTier.HARDENED_IRON, 6, -3.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_PICKAXE = ITEMS.register("hardened_iron_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_IRON, 1, -2.8F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_SWORD = ITEMS.register("hardened_sword", () -> new ToolItems.HardenedSword(EnumItemTier.HARDENED_STONE, 4, -2.4F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_HOE = ITEMS.register("hardened_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_STONE, 1, 0.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_SHOVEL = ITEMS.register("hardened_shovel", () -> new ToolItems.HardenedShovel(EnumItemTier.HARDENED_STONE, 1.5F, -3.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_AXE = ITEMS.register("hardened_axe", () -> new ToolItems.HardenedAxe(EnumItemTier.HARDENED_STONE, 5, -3.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_PICKAXE = ITEMS.register("hardened_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_STONE, 1, -2.8F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_SWORD = ITEMS.register("hardened_wooden_sword", () -> new ToolItems.HardenedSword(EnumItemTier.HARDENED_WOOD, 3, -2.4F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_HOE = ITEMS.register("hardened_wooden_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_WOOD, 1, 0.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_SHOVEL = ITEMS.register("hardened_wooden_shovel", () -> new ToolItems.HardenedShovel(EnumItemTier.HARDENED_WOOD, 1.5F, -3.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_AXE = ITEMS.register("hardened_wooden_axe", () -> new ToolItems.HardenedAxe(EnumItemTier.HARDENED_WOOD, 5, -3.0F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_PICKAXE = ITEMS.register("hardened_wooden_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_WOOD, 1, -2.8F, (new Item.Properties()).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND = ITEMS.register("compressed_diamond", () -> new Item(new Item.Properties().stacksTo(64).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> COMPRESSED_GOLD = ITEMS.register("compressed_gold", () -> new Item(new Item.Properties().stacksTo(64).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> COMPRESSED_IRON = ITEMS.register("compressed_iron", () -> new Item(new Item.Properties().stacksTo(64).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> COMPRESSED_WOOD = ITEMS.register("compressed_wood", () -> new Item(new Item.Properties().stacksTo(64).tab(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> COMPRESSED_STICK = ITEMS.register("compressed_stick", () -> new Item(new Item.Properties().stacksTo(64).tab(ItemGroups.compressedBlockGroup)));
    public static final Block LOGO_BLOCK = new Block(AbstractBlock.Properties.of(Material.STONE));
    // ----------
    // fixme: deprecated
    public static final RegistryObject<Item> HUGE_EGG_BAG = ITEMS.register("huge_egg_bag", () -> new BagItem(1, "Eggs"));
    public static final RegistryObject<Item> EGG_BAG = ITEMS.register("egg_bag", () -> new BagItem(0, "Egg"));
    public static final RegistryObject<Item> HUGE_ENDER_EYE_BAG = ITEMS.register("huge_ender_eye_bag", () -> new BagItem(1, "Ender Eyes"));
    public static final RegistryObject<Item> ENDER_EYE_BAG = ITEMS.register("ender_eye_bag", () -> new BagItem(0, "Ender Eyes"));
    public static final RegistryObject<Item> HUGE_ENDER_PEARL_BAG = ITEMS.register("huge_ender_pearl_bag", () -> new BagItem(1, "Ender Pearls"));
    public static final RegistryObject<Item> ENDER_PEARL_BAG = ITEMS.register("ender_pearl_bag", () -> new BagItem(0, "Ender Pearls"));
    // ----------
    public static ArrayList<RegistryObject<Block>> BLOCK_REGISTRY = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> APPLES = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> ARROWS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> BEETROOT = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> BEETROOT_SEEDS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> BLAZE_POWDER = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> BLAZE_RODS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> BONES = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> CARROTS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> EGGS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> ENDER_EYES = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> ENDER_PEARLS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> FEATHERS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> LEATHER = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> MELONS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> POTATOES = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> SUGAR_CANE = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> MELON_SEEDS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> PUMPKIN = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> PUMPKIN_SEEDS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> WHEAT_SEEDS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> SPIDER_EYES = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> STRINGS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> STICKS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> SUGAR = new ArrayList<>();

    public static void populate() {
        APPLES.add(0, RegistryObject.of(new ResourceLocation("apple"), ForgeRegistries.ITEMS));
        ARROWS.add(0, RegistryObject.of(new ResourceLocation("arrow"), ForgeRegistries.ITEMS));
        BEETROOT.add(0, RegistryObject.of(new ResourceLocation("beetroot"), ForgeRegistries.ITEMS));
        BEETROOT_SEEDS.add(0, RegistryObject.of(new ResourceLocation("beetroot_seeds"), ForgeRegistries.ITEMS));
        BLAZE_POWDER.add(0, RegistryObject.of(new ResourceLocation("blaze_powder"), ForgeRegistries.ITEMS));
        BLAZE_RODS.add(0, RegistryObject.of(new ResourceLocation("blaze_rod"), ForgeRegistries.ITEMS));
        BONES.add(0, RegistryObject.of(new ResourceLocation("bone"), ForgeRegistries.ITEMS));
        CARROTS.add(0, RegistryObject.of(new ResourceLocation("carrot"), ForgeRegistries.ITEMS));
        EGGS.add(0, RegistryObject.of(new ResourceLocation("egg"), ForgeRegistries.ITEMS));
        ENDER_EYES.add(0, RegistryObject.of(new ResourceLocation("ender_eye"), ForgeRegistries.ITEMS));
        ENDER_PEARLS.add(0, RegistryObject.of(new ResourceLocation("ender_pearl"), ForgeRegistries.ITEMS));
        FEATHERS.add(0, RegistryObject.of(new ResourceLocation("feather"), ForgeRegistries.ITEMS));
        LEATHER.add(0, RegistryObject.of(new ResourceLocation("leather"), ForgeRegistries.ITEMS));
        MELONS.add(0, RegistryObject.of(new ResourceLocation("melon"), ForgeRegistries.ITEMS));
        POTATOES.add(0, RegistryObject.of(new ResourceLocation("potato"), ForgeRegistries.ITEMS));
        SUGAR_CANE.add(0, RegistryObject.of(new ResourceLocation("sugar_cane"), ForgeRegistries.ITEMS));
        MELON_SEEDS.add(0, RegistryObject.of(new ResourceLocation("melon_seeds"), ForgeRegistries.ITEMS));
        PUMPKIN.add(0, RegistryObject.of(new ResourceLocation("pumpkin"), ForgeRegistries.ITEMS));
        PUMPKIN_SEEDS.add(0, RegistryObject.of(new ResourceLocation("pumpkin_seeds"), ForgeRegistries.ITEMS));
        WHEAT_SEEDS.add(0, RegistryObject.of(new ResourceLocation("wheat_seeds"), ForgeRegistries.ITEMS));
        SPIDER_EYES.add(0, RegistryObject.of(new ResourceLocation("spider_eye"), ForgeRegistries.ITEMS));
        STRINGS.add(0, RegistryObject.of(new ResourceLocation("string"), ForgeRegistries.ITEMS));
        STICKS.add(0, RegistryObject.of(new ResourceLocation("stick"), ForgeRegistries.ITEMS));
        SUGAR.add(0, RegistryObject.of(new ResourceLocation("sugar"), ForgeRegistries.ITEMS));
    }
}
