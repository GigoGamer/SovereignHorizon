
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SodaliteandLepidoliteTilesBlock extends Block {
	public SodaliteandLepidoliteTilesBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(5.25f, 12f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}