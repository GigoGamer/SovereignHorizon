
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MarbleTileSlabBlock extends SlabBlock {
	public MarbleTileSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 8f).requiresCorrectToolForDrops());
	}
}
