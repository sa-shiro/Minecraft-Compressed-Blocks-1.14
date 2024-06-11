package net.sashiro.compressedblocks.block;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.util.Compression;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public class CBBlock extends Block {
    private final Compression compressor = new Compression();

    public CBBlock(Properties properties, int compressionLevel, boolean isLesser) {
        super(properties);
        compressor.setCompressionLevel(compressionLevel, isLesser);
    }

    @Override
    @ParametersAreNonnullByDefault
    public void appendHoverText(ItemStack is, @Nullable BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
        super.appendHoverText(is, bg, lC, ttf);
        lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
    }

    /**
     * Function to get the compressor of the block
     *
     * @return Compressor
     */
    public Compression getCompressor() {
        return compressor;
    }
}
