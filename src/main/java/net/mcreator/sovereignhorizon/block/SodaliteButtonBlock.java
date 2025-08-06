
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;

public class SodaliteButtonBlock extends ButtonBlock {
	public SodaliteButtonBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.5f, 0.75f).requiresCorrectToolForDrops(), BlockSetType.STONE, 20, false);
	}
}
