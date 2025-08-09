
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class RawMarbleBrickWallBlock extends WallBlock {
	public RawMarbleBrickWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 8f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
