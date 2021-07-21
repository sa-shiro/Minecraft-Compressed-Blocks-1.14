package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.event.ModRegistryObjects;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroups {
    public static ItemGroup compressedBlockGroup = new ItemGroup("compressed_blocks") {
        @Override
        public ItemStack makeIcon() {
            Block icon = ModRegistryObjects.LOGO_BLOCK;
            return new ItemStack(icon);
        }

        @Override
        public boolean canScroll() {
            return true;
        }
    };
}