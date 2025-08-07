
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class SovereignHorizonModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SovereignHorizonMod.MODID);
	public static final RegistryObject<SoundEvent> MUSIC_SH_SODALITEWASTES = REGISTRY.register("music.sh.sodalitewastes", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sovereign_horizon", "music.sh.sodalitewastes")));
}
