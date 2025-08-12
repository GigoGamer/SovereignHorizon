
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BinaryBrickStairsBlock extends StairBlock {
	public BinaryBrickStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.LODESTONE).strength(20f, 50f));
	}

	@Override
	public float getExplosionResistance() {
		return 50f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}