package net.mcreator.sovereignhorizon.procedures;

import net.minecraft.world.item.ItemStack;

public class ElixiteArmorSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		double colonIndex = 0;
		String unslicedString = "";
		unslicedString = itemstack.getOrCreateTag().getString("infusedPotion");
		if (!(unslicedString).equals("")) {
			colonIndex = (itemstack.getOrCreateTag().getString("infusedPotion")).indexOf(":", 0) + 1;
			unslicedString = (unslicedString.substring((int) (colonIndex + 0), (int) (colonIndex + 1))).toUpperCase() + "" + unslicedString.substring((int) (colonIndex + 1));
			unslicedString = unslicedString.replaceAll("_", " ");
			return "Infused with:" + "\n" + " \u00A75" + unslicedString;
		}
		return "";
	}
}
