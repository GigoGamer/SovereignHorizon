
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class SodaliteTileWallBlock extends WallBlock {
	public SodaliteTileWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(4.5f, 9f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
