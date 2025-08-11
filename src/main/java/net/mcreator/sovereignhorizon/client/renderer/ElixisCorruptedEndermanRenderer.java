
package net.mcreator.sovereignhorizon.client.renderer;

public class ElixisCorruptedEndermanRenderer extends MobRenderer<ElixisCorruptedEndermanEntity, Modelovergrown_enderman<ElixisCorruptedEndermanEntity>> {
	public ElixisCorruptedEndermanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelovergrown_enderman<ElixisCorruptedEndermanEntity>(context.bakeLayer(Modelovergrown_enderman.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<ElixisCorruptedEndermanEntity, Modelovergrown_enderman<ElixisCorruptedEndermanEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("sovereign_horizon:textures/entities/elixis_corrupted_enderman_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ElixisCorruptedEndermanEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ElixisCorruptedEndermanEntity entity) {
		return new ResourceLocation("sovereign_horizon:textures/entities/elixis_corrupted_enderman.png");
	}
}