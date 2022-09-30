package net.sashiro.compressedblocks.world.level.item;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import static net.sashiro.compressedblocks.world.level.block.CompressedBlocks.LOGO_BLOCK;

public class ItemGroups {
    @MethodsReturnNonnullByDefault
    public static final CreativeModeTab compressedBlockGroup = new CreativeModeTab("compressed_blocks") {
        @Override
        public ItemStack makeIcon() {
            Block icon = LOGO_BLOCK.get();
            return new ItemStack(icon);
        }

        @Override
        public boolean canScroll() {
            return true;
        }
    };

    // fixme: change icon to crate
    @MethodsReturnNonnullByDefault
    public static final CreativeModeTab compressedItemGroup = new CreativeModeTab("compressed_items") {
        @Override
        public ItemStack makeIcon() {
            Block icon = LOGO_BLOCK.get();
            return new ItemStack(icon);
        }

        @Override
        public boolean canScroll() {
            return true;
        }
    };
}