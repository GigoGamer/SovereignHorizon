
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.sovereignhorizon.fluid.LiquidVoidFluid;
import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class SovereignHorizonModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SovereignHorizonMod.MODID);
	public static final RegistryObject<FlowingFluid> LIQUID_VOID = REGISTRY.register("liquid_void", () -> new LiquidVoidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_VOID = REGISTRY.register("flowing_liquid_void", () -> new LiquidVoidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUID_VOID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_VOID.get(), RenderType.translucent());
		}
	}
}
