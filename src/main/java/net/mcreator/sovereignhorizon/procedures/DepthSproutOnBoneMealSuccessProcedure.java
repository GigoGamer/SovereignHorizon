package net.mcreator.sovereignhorizon.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DepthSproutOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(SovereignHorizonModBlocks.DEPTH_SPROUT.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
