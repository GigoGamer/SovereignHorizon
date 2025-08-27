
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SodaliteandLepidoliteTileStairsBlock extends StairBlock {
	public SodaliteandLepidoliteTileStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(5.25f, 12f));
	}

	@Override
	public float getExplosionResistance() {
		return 12f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}