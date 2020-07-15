package com.ricsi.rubycraft.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class Oven extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 9, 15),
            Block.makeCuboidShape(1, 0, 15, 2, 2, 16),
            Block.makeCuboidShape(0, 0, 14, 1, 2, 15),
            Block.makeCuboidShape(0, 1, 15, 1, 3, 16),
            Block.makeCuboidShape(0, 0, 14, 1, 1, 15),
            Block.makeCuboidShape(0, 0, 1, 1, 2, 2),
            Block.makeCuboidShape(1, 0, 0, 2, 2, 1),
            Block.makeCuboidShape(0, 1, 0, 1, 3, 1),
            Block.makeCuboidShape(14, 0, 15, 15, 2, 16),
            Block.makeCuboidShape(15, 1, 15, 16, 3, 16),
            Block.makeCuboidShape(15, 0, 14, 16, 2, 15),
            Block.makeCuboidShape(14, 0, 0, 15, 2, 1),
            Block.makeCuboidShape(15, 1, 0, 16, 3, 1),
            Block.makeCuboidShape(15, 0, 1, 16, 2, 2),
            Block.makeCuboidShape(0, 9, 0, 16, 10, 16),
            Block.makeCuboidShape(1, 10, 1, 15, 11, 15),
            Block.makeCuboidShape(7, 10, 13, 10, 16, 16),
            Block.makeCuboidShape(8, 16, 14, 9, 17, 15)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 9, 15),
            Block.makeCuboidShape(0, 0, 1, 1, 2, 2),
            Block.makeCuboidShape(1, 0, 0, 2, 2, 1),
            Block.makeCuboidShape(0, 1, 0, 1, 3, 1),
            Block.makeCuboidShape(1, 0, 0, 2, 1, 1),
            Block.makeCuboidShape(14, 0, 0, 15, 2, 1),
            Block.makeCuboidShape(15, 0, 1, 16, 2, 2),
            Block.makeCuboidShape(15, 1, 0, 16, 3, 1),
            Block.makeCuboidShape(0, 0, 14, 1, 2, 15),
            Block.makeCuboidShape(0, 1, 15, 1, 3, 16),
            Block.makeCuboidShape(1, 0, 15, 2, 2, 16),
            Block.makeCuboidShape(15, 0, 14, 16, 2, 15),
            Block.makeCuboidShape(15, 1, 15, 16, 3, 16),
            Block.makeCuboidShape(14, 0, 15, 15, 2, 16),
            Block.makeCuboidShape(0, 9, 0, 16, 10, 16),
            Block.makeCuboidShape(1, 10, 1, 15, 11, 15),
            Block.makeCuboidShape(0, 10, 7, 3, 16, 10),
            Block.makeCuboidShape(1, 16, 8, 2, 17, 9)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 9, 15),
            Block.makeCuboidShape(14, 0, 0, 15, 2, 1),
            Block.makeCuboidShape(15, 0, 1, 16, 2, 2),
            Block.makeCuboidShape(15, 1, 0, 16, 3, 1),
            Block.makeCuboidShape(15, 0, 1, 16, 1, 2),
            Block.makeCuboidShape(15, 0, 14, 16, 2, 15),
            Block.makeCuboidShape(14, 0, 15, 15, 2, 16),
            Block.makeCuboidShape(15, 1, 15, 16, 3, 16),
            Block.makeCuboidShape(1, 0, 0, 2, 2, 1),
            Block.makeCuboidShape(0, 1, 0, 1, 3, 1),
            Block.makeCuboidShape(0, 0, 1, 1, 2, 2),
            Block.makeCuboidShape(1, 0, 15, 2, 2, 16),
            Block.makeCuboidShape(0, 1, 15, 1, 3, 16),
            Block.makeCuboidShape(0, 0, 14, 1, 2, 15),
            Block.makeCuboidShape(0, 9, 0, 16, 10, 16),
            Block.makeCuboidShape(1, 10, 1, 15, 11, 15),
            Block.makeCuboidShape(6, 10, 0, 9, 16, 3),
            Block.makeCuboidShape(7, 16, 1, 8, 17, 2)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 9, 15),
            Block.makeCuboidShape(15, 0, 14, 16, 2, 15),
            Block.makeCuboidShape(14, 0, 15, 15, 2, 16),
            Block.makeCuboidShape(15, 1, 15, 16, 3, 16),
            Block.makeCuboidShape(14, 0, 15, 15, 1, 16),
            Block.makeCuboidShape(1, 0, 15, 2, 2, 16),
            Block.makeCuboidShape(0, 0, 14, 1, 2, 15),
            Block.makeCuboidShape(0, 1, 15, 1, 3, 16),
            Block.makeCuboidShape(15, 0, 1, 16, 2, 2),
            Block.makeCuboidShape(15, 1, 0, 16, 3, 1),
            Block.makeCuboidShape(14, 0, 0, 15, 2, 1),
            Block.makeCuboidShape(0, 0, 1, 1, 2, 2),
            Block.makeCuboidShape(0, 1, 0, 1, 3, 1),
            Block.makeCuboidShape(1, 0, 0, 2, 2, 1),
            Block.makeCuboidShape(0, 9, 0, 16, 10, 16),
            Block.makeCuboidShape(1, 10, 1, 15, 11, 15),
            Block.makeCuboidShape(13, 10, 6, 16, 16, 9),
            Block.makeCuboidShape(14, 16, 7, 15, 17, 8)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public Oven() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(3.5F, 4.0F)
                .sound(SoundType.ANVIL)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
        );
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    /**Change the block shadow -- Lower return values = more shadow*/
    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0.6F;
    }
}