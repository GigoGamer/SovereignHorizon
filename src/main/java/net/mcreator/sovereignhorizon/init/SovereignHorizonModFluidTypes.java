
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.sovereignhorizon.fluid.types.LiquidVoidFluidType;
import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class SovereignHorizonModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SovereignHorizonMod.MODID);
	public static final RegistryObject<FluidType> LIQUID_VOID_TYPE = REGISTRY.register("liquid_void", () -> new LiquidVoidFluidType());
}
