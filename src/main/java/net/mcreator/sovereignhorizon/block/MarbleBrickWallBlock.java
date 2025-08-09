
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MarbleBrickWallBlock extends WallBlock {
	public MarbleBrickWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 8f).requiresCorrectToolForDrops().forceSolidOn());
	}
}