
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.sovereignhorizon.SovereignHorizonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SovereignHorizonModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SovereignHorizonMod.MODID);
	public static final RegistryObject<CreativeModeTab> SOVEREIGN_HORIZON = REGISTRY.register("sovereign_horizon", () -> CreativeModeTab.builder().title(Component.translatable("item_group.sovereign_horizon.sovereign_horizon"))
			.icon(() -> new ItemStack(SovereignHorizonModBlocks.DEEP_LICHEN_COVERED_SODALITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SovereignHorizonModBlocks.TEST.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_BUTTON.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_PRESSURE_PLATE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SPARSE_DEEP_LICHEN_COVERED_SODALITE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.DEEP_LICHEN_COVERED_SODALITE.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SovereignHorizonModItems.SOVERIGN_HORIZON.get());
		}
	}
}
