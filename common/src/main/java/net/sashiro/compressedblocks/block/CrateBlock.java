package net.sashiro.compressedblocks.block;

import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.sashiro.compressedblocks.util.Compression;

import java.util.List;

public class CrateBlock extends HorizontalDirectionalBlock {
    private final Compression compressor = new Compression();
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    protected CrateBlock(Properties properties, int compressionLevel) {
        super(properties);
        compressor.setCompressionLevel(compressionLevel);
        this.registerDefaultState(super.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public BlockState rotate(BlockState blockState, Rotation rotation) {
        return super.rotate(blockState, rotation);
    }

    @Override
    public BlockState mirror(BlockState blockState, Mirror mirror) {
        return super.mirror(blockState, mirror);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> blockStateBuilder) {
        blockStateBuilder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public void appendHoverText(ItemStack is, BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
        super.appendHoverText(is, bg, lC, ttf);
        lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
    }
}
