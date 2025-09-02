
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class TestSlabBlock extends SlabBlock {
	public TestSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(8f).requiresCorrectToolForDrops());
	}
}
