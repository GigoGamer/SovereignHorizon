
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SodaliteEmeraldOreBlock extends Block {
	public SodaliteEmeraldOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(5.5f, 9f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		SodaliteEmeraldOreDestroyedProcedure.execute();
		return retval;
	}
}