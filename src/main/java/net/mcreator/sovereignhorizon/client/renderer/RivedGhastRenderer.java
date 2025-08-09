
package net.mcreator.sovereignhorizon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sovereignhorizon.entity.RivedGhastEntity;
import net.mcreator.sovereignhorizon.client.model.Modelrived_ghast;

import com.mojang.blaze3d.vertex.PoseStack;

public class RivedGhastRenderer extends MobRenderer<RivedGhastEntity, Modelrived_ghast<RivedGhastEntity>> {
	public RivedGhastRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrived_ghast<RivedGhastEntity>(context.bakeLayer(Modelrived_ghast.LAYER_LOCATION)), 4f);
	}

	@Override
	protected void scale(RivedGhastEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(4f, 4f, 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(RivedGhastEntity entity) {
		return new ResourceLocation("sovereign_horizon:textures/entities/rived_ghast.png");
	}
}
