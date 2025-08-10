
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class SodalitePressurePlateBlock extends PressurePlateBlock {
	public SodalitePressurePlateBlock() {
		super(Sensitivity.MOBS, BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.5f, 0.75f).requiresCorrectToolForDrops().forceSolidOn(), BlockSetType.IRON);
	}
}
