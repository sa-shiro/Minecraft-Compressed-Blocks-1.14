package net.sashiro.compressedblocks.block;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.util.Compression;

import java.util.List;

public class CBBlock extends Block {
    private final Compression compressor = new Compression();

    public CBBlock(Properties properties, int compressionLevel) {
        super(properties);
        compressor.setCompressionLevel(compressionLevel);
    }

    @Override
    public void appendHoverText(ItemStack is, BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
        super.appendHoverText(is, bg, lC, ttf);
        lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
    }
}
