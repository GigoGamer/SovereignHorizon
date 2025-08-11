
package net.mcreator.sovereignhorizon.client.renderer;

public class AshCrawlerRenderer extends MobRenderer<AshCrawlerEntity, Modelash_crawler<AshCrawlerEntity>> {
	public AshCrawlerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelash_crawler<AshCrawlerEntity>(context.bakeLayer(Modelash_crawler.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AshCrawlerEntity entity) {
		return new ResourceLocation("sovereign_horizon:textures/entities/ash_crawler_texture.png");
	}
}