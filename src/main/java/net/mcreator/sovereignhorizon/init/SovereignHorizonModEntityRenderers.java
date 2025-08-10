
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sovereignhorizon.client.renderer.RivedGhastRenderer;
import net.mcreator.sovereignhorizon.client.renderer.ElixiteProjectileRenderer;
import net.mcreator.sovereignhorizon.client.renderer.ElixiteGolemRenderer;
import net.mcreator.sovereignhorizon.client.renderer.ElixisCorruptedEndermanRenderer;
import net.mcreator.sovereignhorizon.client.renderer.DesolateCreeperRenderer;
import net.mcreator.sovereignhorizon.client.renderer.CatechismRenderer;
import net.mcreator.sovereignhorizon.client.renderer.AshCrawlerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SovereignHorizonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SovereignHorizonModEntities.CATECHISM.get(), CatechismRenderer::new);
		event.registerEntityRenderer(SovereignHorizonModEntities.RIVED_GHAST.get(), RivedGhastRenderer::new);
		event.registerEntityRenderer(SovereignHorizonModEntities.DESOLATE_CREEPER.get(), DesolateCreeperRenderer::new);
		event.registerEntityRenderer(SovereignHorizonModEntities.ELIXIS_CORRUPTED_ENDERMAN.get(), ElixisCorruptedEndermanRenderer::new);
		event.registerEntityRenderer(SovereignHorizonModEntities.ELIXITE_GOLEM.get(), ElixiteGolemRenderer::new);
		event.registerEntityRenderer(SovereignHorizonModEntities.ELIXITE_PROJECTILE.get(), ElixiteProjectileRenderer::new);
		event.registerEntityRenderer(SovereignHorizonModEntities.ASH_CRAWLER.get(), AshCrawlerRenderer::new);
	}
}
