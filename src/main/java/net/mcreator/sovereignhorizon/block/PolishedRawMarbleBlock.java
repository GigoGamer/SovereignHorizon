
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PolishedRawMarbleBlock extends Block {
	public PolishedRawMarbleBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 7.5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}