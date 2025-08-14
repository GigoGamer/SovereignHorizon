
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class TestWallBlock extends WallBlock {
	public TestWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(8f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
