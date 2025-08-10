
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CreepmineBlock extends PressurePlateBlock {
	public CreepmineBlock() {
		super(Sensitivity.MOBS, BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn(), BlockSetType.IRON);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			CreepmineEntityWalksOnTheBlockProcedure.execute();
		}
	}
}