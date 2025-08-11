
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class SodaliteTileSlabBlock extends SlabBlock {
	public SodaliteTileSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(4.5f, 9f).requiresCorrectToolForDrops());
	}
}
