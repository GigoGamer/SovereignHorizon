
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SodaliteandLepidoliteTileSlabBlock extends SlabBlock {
	public SodaliteandLepidoliteTileSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(5.25f, 12f));
	}
}