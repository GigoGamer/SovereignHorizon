
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class MarbleWallBlock extends WallBlock {
	public MarbleWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 7.5f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
