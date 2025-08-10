
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class CobbledSodaliteWallBlock extends WallBlock {
	public CobbledSodaliteWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(5f, 9f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
