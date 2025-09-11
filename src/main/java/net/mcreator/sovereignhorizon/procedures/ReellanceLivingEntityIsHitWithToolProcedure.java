package net.mcreator.sovereignhorizon.procedures;

import net.minecraft.world.entity.Entity;

public class ReellanceLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.push(((sourceentity.getX() - entity.getX()) * 0.3), ((sourceentity.getY() - entity.getY()) * 0.6), ((sourceentity.getZ() - entity.getZ()) * 0.3));
	}
}
