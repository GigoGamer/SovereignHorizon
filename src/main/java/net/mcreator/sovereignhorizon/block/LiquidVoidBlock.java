
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.sovereignhorizon.procedures.LiquidVoidMobplayerCollidesBlockProcedure;
import net.mcreator.sovereignhorizon.init.SovereignHorizonModFluids;

public class LiquidVoidBlock extends LiquidBlock {
	public LiquidVoidBlock() {
		super(() -> SovereignHorizonModFluids.LIQUID_VOID.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		LiquidVoidMobplayerCollidesBlockProcedure.execute(pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}
