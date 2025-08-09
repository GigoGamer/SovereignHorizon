
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class PolishedSodaliteStairsBlock extends StairBlock {
	public PolishedSodaliteStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(4.5f, 9f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 9f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
