package net.mcreator.sovereignhorizon.client.renderer;

import com.mojang.math.Axis;

public class ElixiteProjectileRenderer extends EntityRenderer<ElixiteProjectileEntity> {

	private static final ResourceLocation texture = new ResourceLocation("sovereign_horizon:textures/entities/elixite_projectile.png");

	private final Modelelixite_projectile model;

	public ElixiteProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelelixite_projectile(context.bakeLayer(Modelelixite_projectile.LAYER_LOCATION));
	}

	@Override
	public void render(ElixiteProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(ElixiteProjectileEntity entity) {
		return texture;
	}

}
