
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MarbleSlabBlock extends SlabBlock {
	public MarbleSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 7.5f).requiresCorrectToolForDrops());
	}
}
