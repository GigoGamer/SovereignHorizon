
package net.mcreator.sovereignhorizon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sovereignhorizon.entity.SwitchlingEntity;
import net.mcreator.sovereignhorizon.client.model.Modelswitchling;

public class SwitchlingRenderer extends MobRenderer<SwitchlingEntity, Modelswitchling<SwitchlingEntity>> {
	public SwitchlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelswitchling<SwitchlingEntity>(context.bakeLayer(Modelswitchling.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SwitchlingEntity entity) {
		return new ResourceLocation("sovereign_horizon:textures/entities/switchling.png");
	}
}
