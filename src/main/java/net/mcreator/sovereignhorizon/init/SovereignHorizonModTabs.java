
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class SovereignHorizonModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SovereignHorizonMod.MODID);
	public static final RegistryObject<CreativeModeTab> SOVEREIGN_HORIZON = REGISTRY.register("sovereign_horizon",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sovereign_horizon.sovereign_horizon")).icon(() -> new ItemStack(SovereignHorizonModBlocks.SODALITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SovereignHorizonModItems.CATECHISM_SPAWN_EGG.get());
				tabData.accept(SovereignHorizonModBlocks.SODALITE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_PRESSURE_PLATE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_BUTTON.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SPARSE_DEEP_LICHEN_COVERED_SODALITE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.DEEP_LICHEN_COVERED_SODALITE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.COBBLED_SODALITE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.COBBLED_SODALITE_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.COBBLED_SODALITE_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.COBBLED_SODALITE_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_SODALITE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_SODALITE_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_SODALITE_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_SODALITE_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_BRICKS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_BRICK_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_BRICK_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_BRICK_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.CRACKED_SODALITE_BRICKS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_TILES.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_TILE_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_TILE_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_TILE_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.CRACKED_SODALITE_TILES.get().asItem());
				tabData.accept(SovereignHorizonModItems.ELIXIS_SHARD.get());
				tabData.accept(SovereignHorizonModItems.ELIXIS_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(SovereignHorizonModItems.ELIXITE_ARMOR_HELMET.get());
				tabData.accept(SovereignHorizonModItems.ELIXITE_ARMOR_CHESTPLATE.get());
				tabData.accept(SovereignHorizonModItems.ELIXITE_ARMOR_LEGGINGS.get());
				tabData.accept(SovereignHorizonModItems.ELIXITE_ARMOR_BOOTS.get());
				tabData.accept(SovereignHorizonModItems.CATECHISM_WING.get());
				tabData.accept(SovereignHorizonModBlocks.INFUSION_TABLE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.LARIMAR.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.LEPIDOLITE.get().asItem());
				tabData.accept(SovereignHorizonModItems.RIVED_GHAST_SPAWN_EGG.get());
				tabData.accept(SovereignHorizonModBlocks.ASH.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_QUARTZ_ORE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.BLOCKOF_ELIXIS_SHARDS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_EMERALD_ORE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_LAPIS_LAZULI_ORE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_REDSTONE_ORE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.SODALITE_DIAMOND_ORE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.THULITE.get().asItem());
				tabData.accept(SovereignHorizonModItems.BLUESKIN.get());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_RAW_MARBLE_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_BRICK_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_BRICK_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_MARBLE_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_BRICKS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.CRACKED_RAW_MARBLE_TILES.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_RAW_MARBLE_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_TILE_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.CRACKED_RAW_MARBLE_BRICKS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_PILLAR.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_TILE_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_MARBLE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_BRICK_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_MARBLE_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_TILE_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.CRACKED_MARBLE_TILES.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_PILLAR.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_MARBLE_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_TILES.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_TILE_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_BRICK_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_TILE_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_RAW_MARBLE_SLAB.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.POLISHED_RAW_MARBLE.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_BRICK_STAIRS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_TILE_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_BRICK_WALL.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.MARBLE_BRICKS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.CRACKED_MARBLE_BRICKS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.RAW_MARBLE_TILES.get().asItem());
				tabData.accept(SovereignHorizonModItems.LIQUID_VOID_BUCKET.get());
				tabData.accept(SovereignHorizonModBlocks.REACHFLOWER.get().asItem());
				tabData.accept(SovereignHorizonModItems.DESOLATE_CREEPER_SPAWN_EGG.get());
				tabData.accept(SovereignHorizonModBlocks.DEPTH_SPROUT.get().asItem());
				tabData.accept(SovereignHorizonModItems.ELIXITE_GOLEM_SPAWN_EGG.get());
				tabData.accept(SovereignHorizonModItems.CORRUPTED_PEARL.get());
				tabData.accept(SovereignHorizonModItems.ELIXIS_CORRUPTED_ENDERMAN_SPAWN_EGG.get());
				tabData.accept(SovereignHorizonModBlocks.ASHEN_FLOWER.get().asItem());
				tabData.accept(SovereignHorizonModItems.BLUESKIN_BOOTS_BOOTS.get());
				tabData.accept(SovereignHorizonModItems.ASHY_FLESH.get());
				tabData.accept(SovereignHorizonModBlocks.SHORT_SPROUTS.get().asItem());
				tabData.accept(SovereignHorizonModBlocks.CREEPMINE.get().asItem());
				tabData.accept(SovereignHorizonModItems.TOTEMOF_CHANCE.get());
				tabData.accept(SovereignHorizonModItems.COOKED_CORRUPTED_FLESH.get());
				tabData.accept(SovereignHorizonModBlocks.GLOWWEED.get().asItem());
				tabData.accept(SovereignHorizonModItems.RAW_CORRUPTED_FLESH.get());
				tabData.accept(SovereignHorizonModItems.ASH_CRAWLER_SPAWN_EGG.get());
				tabData.accept(SovereignHorizonModItems.RECORD_SUNRISE.get());
				tabData.accept(SovereignHorizonModBlocks.KEYSTONE.get().asItem());
			}).build());
}
