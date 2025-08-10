
package net.mcreator.sovereignhorizon.client.renderer;

public class ElixiteGolemRenderer extends MobRenderer<ElixiteGolemEntity, Modelelixite_golem<ElixiteGolemEntity>> {
	public ElixiteGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelixite_golem<ElixiteGolemEntity>(context.bakeLayer(Modelelixite_golem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElixiteGolemEntity entity) {
		return new ResourceLocation("sovereign_horizon:textures/entities/elixite_golem.png");
	}
}