
package net.mcreator.sovereignhorizon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sovereignhorizon.entity.AshCrawlerEntity;
import net.mcreator.sovereignhorizon.client.model.Modelash_crawler;

public class AshCrawlerRenderer extends MobRenderer<AshCrawlerEntity, Modelash_crawler<AshCrawlerEntity>> {
	public AshCrawlerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelash_crawler<AshCrawlerEntity>(context.bakeLayer(Modelash_crawler.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AshCrawlerEntity entity) {
		return new ResourceLocation("sovereign_horizon:textures/entities/ash_crawler_texture.png");
	}
}
