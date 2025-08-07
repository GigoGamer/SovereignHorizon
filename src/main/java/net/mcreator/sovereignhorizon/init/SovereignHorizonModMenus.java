
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.sovereignhorizon.world.inventory.InfusionTableGUIMenu;
import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class SovereignHorizonModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SovereignHorizonMod.MODID);
	public static final RegistryObject<MenuType<InfusionTableGUIMenu>> INFUSION_TABLE_GUI = REGISTRY.register("infusion_table_gui", () -> IForgeMenuType.create(InfusionTableGUIMenu::new));
}
