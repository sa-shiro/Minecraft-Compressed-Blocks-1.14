package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.github.sa_shiro.compressedblocks.event.ModRegistryObjects;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GenItemModelProvider extends ItemModelProvider {
    public GenItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CompressedBlocks.MOD_ID, existingFileHelper);
    }

    private String stringFormat(String loc) {
        return loc.replace("compressedblocks:", "");
    }

    @Override
    protected void registerModels() {
        for (BlockFactory factory : Lists.blockList) {
            for (int i = 0; i <= 9; i++) {
                withExistingParent("c" + i + "_" + factory.getRegistryName(), modLoc("block/" + "c" + i + "_" + factory.getRegistryName()));
            }
        }

        ModelFile.ExistingModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile.ExistingModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));

        assert false;

        for (String str : Lists.ITEMS) {
            for (int i = 0; i <= 9; i++) {
                builder(i, str, itemGenerated);
            }
        }

        builder(stringFormat(ModRegistryObjects.ENDER_PEARL_BAG.get().getRegistryName().toString()), itemGenerated);
        builder(stringFormat(ModRegistryObjects.HUGE_ENDER_PEARL_BAG.get().getRegistryName().toString()), itemGenerated);
        builder(stringFormat(ModRegistryObjects.ENDER_EYE_BAG.get().getRegistryName().toString()), itemGenerated);
        builder(stringFormat(ModRegistryObjects.HUGE_ENDER_EYE_BAG.get().getRegistryName().toString()), itemGenerated);
        builder(stringFormat(ModRegistryObjects.EGG_BAG.get().getRegistryName().toString()), itemGenerated);
        builder(stringFormat(ModRegistryObjects.HUGE_EGG_BAG.get().getRegistryName().toString()), itemGenerated);
        builder(stringFormat(ModRegistryObjects.COMPRESSED_STICK.get().getRegistryName().toString()), itemGenerated);
        builder(stringFormat(ModRegistryObjects.COMPRESSED_WOOD.get().getRegistryName().toString()), itemGenerated);
        builder(stringFormat(ModRegistryObjects.COMPRESSED_IRON.get().getRegistryName().toString()), itemGenerated);
        builder(stringFormat(ModRegistryObjects.COMPRESSED_GOLD.get().getRegistryName().toString()), itemGenerated);
        builder(stringFormat(ModRegistryObjects.COMPRESSED_DIAMOND.get().getRegistryName().toString()), itemGenerated);

        builder(stringFormat(ModRegistryObjects.HARDENED_WOODEN_PICKAXE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_WOODEN_AXE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_WOODEN_SHOVEL.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_WOODEN_HOE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_WOODEN_SWORD.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_PICKAXE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_AXE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_SHOVEL.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_HOE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_SWORD.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_IRON_PICKAXE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_IRON_AXE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_IRON_SHOVEL.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_IRON_HOE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_IRON_SWORD.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_GOLDEN_PICKAXE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_GOLDEN_AXE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_GOLDEN_SHOVEL.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_GOLDEN_HOE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_GOLDEN_SWORD.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_DIAMOND_PICKAXE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_DIAMOND_AXE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_DIAMOND_SHOVEL.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_DIAMOND_HOE.get().getRegistryName().toString()), itemHandheld);
        builder(stringFormat(ModRegistryObjects.HARDENED_DIAMOND_SWORD.get().getRegistryName().toString()), itemHandheld);
    }

    private void builder(String registryName, ModelFile.ExistingModelFile parentTexture) {
        getBuilder(registryName).parent(parentTexture).texture("layer0", "item/" + registryName);
    }

    private void builder(int level, String itemName, ModelFile.ExistingModelFile parentTexture) {
        String r = "";
        if (level == 1) r = "double_";
        else if (level == 2) r = "triple_";
        else if (level == 3) r = "quadruple_";
        else if (level == 4) r = "quintuple_";
        else if (level == 5) r = "sextuple_";
        else if (level == 6) r = "septuple_";
        else if (level == 7) r = "octuple_";
        else if (level == 8) r = "mega_";
        else if (level == 9) r = "giga_";
        getBuilder(r + "crated_" + itemName).parent(parentTexture).texture("layer0", "item/crate").texture("layer1", "item/" + itemName);
    }
}