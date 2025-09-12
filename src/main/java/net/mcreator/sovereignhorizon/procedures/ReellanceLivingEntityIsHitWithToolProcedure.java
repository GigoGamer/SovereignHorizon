package net.mcreator.sovereignhorizon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.sovereignhorizon.init.SovereignHorizonModEnchantments;

public class ReellanceLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		double amount = 0;
		amount = 0.2 + itemstack.getEnchantmentLevel(SovereignHorizonModEnchantments.REELING.get()) * 0.1;
		entity.push(((sourceentity.getX() - entity.getX()) * amount), ((sourceentity.getY() - entity.getY()) * amount * 1.5), ((sourceentity.getZ() - entity.getZ()) * amount));
	}
}
