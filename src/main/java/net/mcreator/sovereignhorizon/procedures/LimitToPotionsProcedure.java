package net.mcreator.sovereignhorizon.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

public class LimitToPotionsProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.getItem() == Items.POTION) {
			return true;
		}
		return false;
	}
}
