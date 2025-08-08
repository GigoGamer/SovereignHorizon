
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.sovereignhorizon.enchantment.ResilienceEnchantment;
import net.mcreator.sovereignhorizon.enchantment.BoundingEnchantment;
import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class SovereignHorizonModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SovereignHorizonMod.MODID);
	public static final RegistryObject<Enchantment> RESILIENCE = REGISTRY.register("resilience", () -> new ResilienceEnchantment());
	public static final RegistryObject<Enchantment> BOUNDING = REGISTRY.register("bounding", () -> new BoundingEnchantment());
}
