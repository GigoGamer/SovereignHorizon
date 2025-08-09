
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PolishedMarbleSlabBlock extends SlabBlock {
	public PolishedMarbleSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 7.5f).requiresCorrectToolForDrops());
	}
}