package pikaplaysgames.Splatting.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;

public class SpawnStationBlock extends HorizontalFacingBlock{

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;


    public SpawnStationBlock(Settings settings) {
        super(settings);
    }
    
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {

        return super.getPlacementState(ctx);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {

        return super.rotate(state, rotation);
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {

        return super.mirror(state, mirror);
    }


    @Override
    protected void appendProperties(Builder<Block, BlockState> builder) {
   
        super.appendProperties(builder);
        builder.add(FACING);
    }
}
