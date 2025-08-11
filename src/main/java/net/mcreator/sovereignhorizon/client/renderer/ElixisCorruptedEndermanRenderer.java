
package net.mcreator.sovereignhorizon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sovereignhorizon.entity.ElixisCorruptedEndermanEntity;
import net.mcreator.sovereignhorizon.client.model.Modelovergrown_enderman;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

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
