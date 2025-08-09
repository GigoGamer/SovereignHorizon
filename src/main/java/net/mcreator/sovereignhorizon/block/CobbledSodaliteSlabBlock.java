
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class CobbledSodaliteSlabBlock extends SlabBlock {
	public CobbledSodaliteSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(5f, 9f).requiresCorrectToolForDrops());
	}
}
