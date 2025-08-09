
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AshBlock extends Block {
	public AshBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(0.1f, 0f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}