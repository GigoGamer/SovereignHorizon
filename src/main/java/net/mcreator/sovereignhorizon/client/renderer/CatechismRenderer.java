
package net.mcreator.sovereignhorizon.client.renderer;

public class CatechismRenderer extends MobRenderer<CatechismEntity, ModelCustomModel<CatechismEntity>> {
	public CatechismRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCustomModel<CatechismEntity>(context.bakeLayer(ModelCustomModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CatechismEntity entity) {
		return new ResourceLocation("sovereign_horizon:textures/entities/catechism.png");
	}
}