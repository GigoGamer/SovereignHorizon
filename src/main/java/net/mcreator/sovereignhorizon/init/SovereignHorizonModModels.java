
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sovereignhorizon.client.model.Modelrived_ghast;
import net.mcreator.sovereignhorizon.client.model.Modelovergrown_enderman;
import net.mcreator.sovereignhorizon.client.model.Modeldesolate_creep;
import net.mcreator.sovereignhorizon.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SovereignHorizonModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelrived_ghast.LAYER_LOCATION, Modelrived_ghast::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modeldesolate_creep.LAYER_LOCATION, Modeldesolate_creep::createBodyLayer);
		event.registerLayerDefinition(Modelovergrown_enderman.LAYER_LOCATION, Modelovergrown_enderman::createBodyLayer);
	}
}
