package net.mcreator.sovereignhorizon.procedures;

import net.minecraft.world.entity.Entity;

public class SoverignHorizonPlayerLeavesDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("inSH", false);
	}
}
