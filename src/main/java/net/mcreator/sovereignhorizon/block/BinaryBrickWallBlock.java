
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BinaryBrickWallBlock extends WallBlock {
	public BinaryBrickWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.LODESTONE).strength(20f, 50f).forceSolidOn());
	}
}