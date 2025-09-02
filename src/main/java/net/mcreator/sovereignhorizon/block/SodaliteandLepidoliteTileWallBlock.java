
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class SodaliteandLepidoliteTileWallBlock extends WallBlock {
	public SodaliteandLepidoliteTileWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(5.25f, 12f).forceSolidOn());
	}
}
