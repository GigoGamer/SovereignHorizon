package net.mcreator.sovereignhorizon.procedures;

import net.minecraftforge.eventbus.api.Event;

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
