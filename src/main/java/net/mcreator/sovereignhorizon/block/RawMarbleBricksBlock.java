
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RawMarbleBricksBlock extends Block {
	public RawMarbleBricksBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 8f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}