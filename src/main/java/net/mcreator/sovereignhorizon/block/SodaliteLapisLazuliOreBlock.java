
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SodaliteLapisLazuliOreBlock extends Block {
	public SodaliteLapisLazuliOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(5f, 9f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}