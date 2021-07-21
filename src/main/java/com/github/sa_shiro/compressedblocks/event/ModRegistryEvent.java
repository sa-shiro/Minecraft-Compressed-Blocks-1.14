package com.github.sa_shiro.compressedblocks.event;

import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.github.sa_shiro.compressedblocks.block.CompressedBlock;
import com.github.sa_shiro.compressedblocks.block.ICompressedBlock;
import com.github.sa_shiro.compressedblocks.item.BagItem;
import com.github.sa_shiro.compressedblocks.util.ItemGroups;
import com.github.sa_shiro.compressedblocks.util.JSONConfig;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;

public class ModRegistryEvent {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    private static final Item.Properties PROPERTIES = new Item.Properties().tab(ItemGroups.compressedBlockGroup);
    private static int INDEX = 0;

    public static void register() {
        ModRegistryObjects.BLOCKS.register(eventBus);
        ModRegistryObjects.BLOCKS2.register(eventBus);
        ModRegistryObjects.ITEMS.register(eventBus);
        ModRegistryObjects.BLOCKS2.register("logo_block", ModRegistryObjects.LOGO_BLOCK::getBlock);
        ModRegistryObjects.ITEMS.register("logo_block", () -> new BlockItem(ModRegistryObjects.LOGO_BLOCK, PROPERTIES));
        registerBlocks();
        registerItems();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> FMLJavaModLoadingContext.get().getModEventBus().addListener(ModRegistryEvent::translucentRender));
    }

    // fixme: !!! ADDING BLOCKS DYNAMICALLY IS NOT RECOMMENDED AND STRICTLY DISCOURAGED BY THE FORGE TEAM !!!
    // however for now i will not remove this feature (also the reason why i updated
    // the config to json format, instead of toml format), but keep in mind that it's likely to be removed in the next major update!
    // This feature will be completely removed with the 1.17 update.
    private static void registerBlocks() {
        for (BlockFactory factory : Lists.blockList) {
            for (JSONConfig.BlockManager manager : JSONConfig.INSTANCE.blocks) {
                if (factory.getRegistryName().equals(manager.getBlockName())) {
                    for (int level = 0; level <= manager.getMaxCompressionLevel(); level++) {
                        // Registering default non-rotational blocks
                        if (!factory.getHasRotation()) {
                            registerBlock(
                                    CompressedBlock.createBlock(
                                            factory.getType(),
                                            level,
                                            factory.getMaterial(),
                                            factory.getMaterialColor(),
                                            factory.getSoundType(),
                                            Lists.HARDNESS.get(level),
                                            Lists.RESISTANCE.get(level),
                                            Lists.HARVEST_LEVEL.get(level)),
                                    factory.getRegistryName(), level, manager.isEnabled());
                        }
                        // Registering rotational log blocks
                        else if (factory.getIsLogBlock()) {
                            registerBlock(
                                    CompressedBlock.createRotationalBlock(
                                            level,
                                            factory.getMaterial(),
                                            factory.getMaterialColorSide(),
                                            factory.getMaterialColorEnd(),
                                            factory.getSoundType(),
                                            Lists.HARDNESS.get(level),
                                            Lists.RESISTANCE.get(level),
                                            Lists.HARVEST_LEVEL.get(level)),
                                    factory.getRegistryName(), level, manager.isEnabled());

                        }
                        // Registering rotational blocks (excluding log blocks)
                        else if (factory.getHasRotation() && !factory.getIsLogBlock()) {
                            registerBlock(
                                    CompressedBlock.createRotationalBlock(
                                            level,
                                            factory.getMaterial(),
                                            factory.getMaterialColor(),
                                            factory.getSoundType(),
                                            Lists.HARDNESS.get(level),
                                            Lists.RESISTANCE.get(level),
                                            Lists.HARVEST_LEVEL.get(level)),
                                    factory.getRegistryName(), level, manager.isEnabled());

                        }
                    }
                }
            }
        }
        LOGGER.info("Registration finished.");
    }

    private static void translucentRender(final FMLCommonSetupEvent e) {
        e.setPhase(EventPriority.NORMAL);
        final RenderType TRANSLUCENT = RenderType.translucent();
        for (RegistryObject<Block> registryObject : ModRegistryObjects.BLOCK_REGISTRY) {
            RenderTypeLookup.setRenderLayer(registryObject.get(), TRANSLUCENT);
        }
    }

    @ParametersAreNonnullByDefault
    private static void registerBlock(ICompressedBlock blockIn, String registryName, int compressionLevel, boolean isEnabled) {
        if (isEnabled) {
            int index2 = INDEX; // required for ITEMS.register()

            ModRegistryObjects.BLOCK_REGISTRY.add(INDEX, ModRegistryObjects.BLOCKS.register("c" + compressionLevel + "_" + registryName, blockIn::getBlock));
            ModRegistryObjects.ITEMS.register("c" + compressionLevel + "_" + registryName, () -> new BlockItem(ModRegistryObjects.BLOCK_REGISTRY.get(index2).get(), PROPERTIES));
            INDEX++;
        }
    }

    private static void registerCrateItems(ArrayList<RegistryObject<Item>> array, String registryName) {
        array.add(1, ModRegistryObjects.ITEMS.register("crated_" + registryName, () -> new BagItem(0, stringFormat(registryName))));
        array.add(2, ModRegistryObjects.ITEMS.register("double_crated_" + registryName, () -> new BagItem(1, stringFormat(registryName))));
        array.add(3, ModRegistryObjects.ITEMS.register("triple_crated_" + registryName, () -> new BagItem(2, stringFormat(registryName))));
        array.add(4, ModRegistryObjects.ITEMS.register("quadruple_crated_" + registryName, () -> new BagItem(3, stringFormat(registryName))));
        array.add(5, ModRegistryObjects.ITEMS.register("quintuple_crated_" + registryName, () -> new BagItem(4, stringFormat(registryName))));
        array.add(6, ModRegistryObjects.ITEMS.register("sextuple_crated_" + registryName, () -> new BagItem(5, stringFormat(registryName))));
        array.add(7, ModRegistryObjects.ITEMS.register("septuple_crated_" + registryName, () -> new BagItem(6, stringFormat(registryName))));
        array.add(8, ModRegistryObjects.ITEMS.register("octuple_crated_" + registryName, () -> new BagItem(7, stringFormat(registryName))));
        array.add(9, ModRegistryObjects.ITEMS.register("mega_crated_" + registryName, () -> new BagItem(8, stringFormat(registryName))));
        array.add(10, ModRegistryObjects.ITEMS.register("giga_crated_" + registryName, () -> new BagItem(9, stringFormat(registryName))));
    }

    private static void registerItems() {
        registerCrateItems(ModRegistryObjects.APPLES, "apples");
        registerCrateItems(ModRegistryObjects.ARROWS, "arrows");
        registerCrateItems(ModRegistryObjects.BEETROOT, "beetroots");
        registerCrateItems(ModRegistryObjects.BEETROOT_SEEDS, "beetroot_seeds");
        registerCrateItems(ModRegistryObjects.BLAZE_POWDER, "blaze_powder");
        registerCrateItems(ModRegistryObjects.BLAZE_RODS, "blaze_rods");
        registerCrateItems(ModRegistryObjects.BONES, "bones");
        registerCrateItems(ModRegistryObjects.CARROTS, "carrots");
        registerCrateItems(ModRegistryObjects.EGGS, "eggs");
        registerCrateItems(ModRegistryObjects.ENDER_EYES, "ender_eyes");
        registerCrateItems(ModRegistryObjects.ENDER_PEARLS, "ender_pearls");
        registerCrateItems(ModRegistryObjects.FEATHERS, "feathers");
        registerCrateItems(ModRegistryObjects.LEATHER, "leather");
        registerCrateItems(ModRegistryObjects.MELONS, "melons");
        registerCrateItems(ModRegistryObjects.POTATOES, "potatoes");
        registerCrateItems(ModRegistryObjects.SUGAR_CANE, "sugar_canes");
        registerCrateItems(ModRegistryObjects.MELON_SEEDS, "melon_seeds");
        registerCrateItems(ModRegistryObjects.PUMPKIN, "pumpkin");
        registerCrateItems(ModRegistryObjects.PUMPKIN_SEEDS, "pumpkin_seeds");
        registerCrateItems(ModRegistryObjects.WHEAT_SEEDS, "wheat_seeds");
        registerCrateItems(ModRegistryObjects.SPIDER_EYES, "spider_eyes");
        registerCrateItems(ModRegistryObjects.STRINGS, "strings");
        registerCrateItems(ModRegistryObjects.STICKS, "sticks");
        registerCrateItems(ModRegistryObjects.SUGAR, "sugar");
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
}