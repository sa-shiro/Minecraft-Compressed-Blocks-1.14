package com.github.sa_shiro.compressedblocks.block;

import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;

public class Compression {
    private String blockCount;
    private Style style;

    public Compression() {
        style = Style.EMPTY;
    }

    /**
     * @param compressionLevel Level of compression. <br>Min: 0<br> Max: 9
     */
    public void setCompressionLevel(int compressionLevel) {
        if (compressionLevel < 0) compressionLevel = 0;
        if (compressionLevel > 9) compressionLevel = 9;
        switch (compressionLevel) {
            default:
            case 0:
                this.blockCount = "9";
                this.style = style.applyFormat(TextFormatting.WHITE);
                break;
            case 1:
                this.blockCount = "81";
                this.style = style.applyFormat(TextFormatting.YELLOW);
                break;
            case 2:
                this.blockCount = "729";
                this.style = style.applyFormat(TextFormatting.YELLOW);
                break;
            case 3:
                this.blockCount = "6.561";
                this.style = style.applyFormat(TextFormatting.YELLOW);
                break;
            case 4:
                this.blockCount = "59.049";
                this.style = style.applyFormat(TextFormatting.AQUA);
                break;
            case 5:
                this.blockCount = "531.441";
                this.style = style.applyFormat(TextFormatting.AQUA);
                break;
            case 6:
                this.blockCount = "4.782.969";
                this.style = style.applyFormat(TextFormatting.LIGHT_PURPLE);
                break;
            case 7:
                this.blockCount = "43.046.721";
                this.style = style.applyFormat(TextFormatting.DARK_PURPLE);
                break;
            case 8:
                this.blockCount = "387.420.489";
                this.style = style.applyFormat(TextFormatting.RED);
                break;
            case 9:
                this.blockCount = "3.486.784.101";
                this.style = style.applyFormat(TextFormatting.DARK_RED);
                break;
        }
    }

    /**
     * Function to get the current Block Count
     *
     * @return Block Count
     */
    public String getBlockCount() {
        return this.blockCount;
    }

    /**
     * Function to get the current Style
     *
     * @return Style
     */
    public Style getStyle() {
        return this.style;
    }
}