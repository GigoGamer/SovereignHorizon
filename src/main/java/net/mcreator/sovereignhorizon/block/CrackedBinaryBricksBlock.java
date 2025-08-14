
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class CrackedBinaryBricksBlock extends Block {
	public CrackedBinaryBricksBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.LODESTONE).strength(20f, 50f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
