
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class SovereignHorizonModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, SovereignHorizonMod.MODID);
	public static final RegistryObject<SimpleParticleType> KEYSTONE_MAGIC = REGISTRY.register("keystone_magic", () -> new SimpleParticleType(true));
}
