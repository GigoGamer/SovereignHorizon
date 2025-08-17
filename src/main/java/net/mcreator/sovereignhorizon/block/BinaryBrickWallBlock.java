
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class BinaryBrickWallBlock extends WallBlock {
	public BinaryBrickWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.LODESTONE).strength(20f, 50f).forceSolidOn());
	}
}
