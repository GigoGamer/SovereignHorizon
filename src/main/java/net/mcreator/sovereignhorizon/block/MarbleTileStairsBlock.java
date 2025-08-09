
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MarbleTileStairsBlock extends StairBlock {
	public MarbleTileStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 8f).requiresCorrectToolForDrops());
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