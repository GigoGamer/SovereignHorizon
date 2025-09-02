package net.mcreator.sovereignhorizon.procedures;

import net.minecraft.world.entity.Entity;

public class RivedGhastNaturalEntitySpawningConditionProcedure {
	public static void execute(double y, Entity entity) {
		if (entity == null)
			return;
		if (y >= 130 && y < 225) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
