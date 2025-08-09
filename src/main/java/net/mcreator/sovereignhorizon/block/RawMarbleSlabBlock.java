
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class RawMarbleSlabBlock extends SlabBlock {
	public RawMarbleSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 7.5f).requiresCorrectToolForDrops());
	}
}
