
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class TestStairsBlock extends StairBlock {
	public TestStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(8f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 8f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
