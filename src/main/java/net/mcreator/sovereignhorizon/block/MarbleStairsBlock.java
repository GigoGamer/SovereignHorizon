
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MarbleStairsBlock extends StairBlock {
	public MarbleStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 7.5f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 7.5f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}