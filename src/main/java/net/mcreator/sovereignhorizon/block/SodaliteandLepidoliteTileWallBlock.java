
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SodaliteandLepidoliteTileWallBlock extends WallBlock {
	public SodaliteandLepidoliteTileWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(5.25f, 12f).forceSolidOn());
	}
}