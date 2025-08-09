
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SparseDeepLichenCoveredSodaliteBlock extends Block {
	public SparseDeepLichenCoveredSodaliteBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(4.75f, 9f).lightLevel(s -> 2).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}
}