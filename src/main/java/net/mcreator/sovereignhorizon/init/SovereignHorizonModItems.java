
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.sovereignhorizon.item.SoverignHorizonItem;
import net.mcreator.sovereignhorizon.item.ElixiteArmorItem;
import net.mcreator.sovereignhorizon.item.ElixisUpgradeSmithingTemplateItem;
import net.mcreator.sovereignhorizon.item.ElixisShardItem;
import net.mcreator.sovereignhorizon.item.CatechismWingItem;
import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class SovereignHorizonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SovereignHorizonMod.MODID);
	public static final RegistryObject<Item> TEST = block(SovereignHorizonModBlocks.TEST);
	public static final RegistryObject<Item> SOVERIGN_HORIZON = REGISTRY.register("soverign_horizon", () -> new SoverignHorizonItem());
	public static final RegistryObject<Item> CATECHISM_SPAWN_EGG = REGISTRY.register("catechism_spawn_egg", () -> new ForgeSpawnEggItem(SovereignHorizonModEntities.CATECHISM, -10092442, -65281, new Item.Properties()));
	public static final RegistryObject<Item> SODALITE = block(SovereignHorizonModBlocks.SODALITE);
	public static final RegistryObject<Item> SODALITE_STAIRS = block(SovereignHorizonModBlocks.SODALITE_STAIRS);
	public static final RegistryObject<Item> SODALITE_SLAB = block(SovereignHorizonModBlocks.SODALITE_SLAB);
	public static final RegistryObject<Item> SODALITE_WALL = block(SovereignHorizonModBlocks.SODALITE_WALL);
	public static final RegistryObject<Item> SODALITE_PRESSURE_PLATE = block(SovereignHorizonModBlocks.SODALITE_PRESSURE_PLATE);
	public static final RegistryObject<Item> SODALITE_BUTTON = block(SovereignHorizonModBlocks.SODALITE_BUTTON);
	public static final RegistryObject<Item> SPARSE_DEEP_LICHEN_COVERED_SODALITE = block(SovereignHorizonModBlocks.SPARSE_DEEP_LICHEN_COVERED_SODALITE);
	public static final RegistryObject<Item> DEEP_LICHEN_COVERED_SODALITE = block(SovereignHorizonModBlocks.DEEP_LICHEN_COVERED_SODALITE);
	public static final RegistryObject<Item> COBBLED_SODALITE = block(SovereignHorizonModBlocks.COBBLED_SODALITE);
	public static final RegistryObject<Item> COBBLED_SODALITE_STAIRS = block(SovereignHorizonModBlocks.COBBLED_SODALITE_STAIRS);
	public static final RegistryObject<Item> COBBLED_SODALITE_SLAB = block(SovereignHorizonModBlocks.COBBLED_SODALITE_SLAB);
	public static final RegistryObject<Item> COBBLED_SODALITE_WALL = block(SovereignHorizonModBlocks.COBBLED_SODALITE_WALL);
	public static final RegistryObject<Item> POLISHED_SODALITE = block(SovereignHorizonModBlocks.POLISHED_SODALITE);
	public static final RegistryObject<Item> POLISHED_SODALITE_STAIRS = block(SovereignHorizonModBlocks.POLISHED_SODALITE_STAIRS);
	public static final RegistryObject<Item> POLISHED_SODALITE_SLAB = block(SovereignHorizonModBlocks.POLISHED_SODALITE_SLAB);
	public static final RegistryObject<Item> POLISHED_SODALITE_WALL = block(SovereignHorizonModBlocks.POLISHED_SODALITE_WALL);
	public static final RegistryObject<Item> SODALITE_BRICKS = block(SovereignHorizonModBlocks.SODALITE_BRICKS);
	public static final RegistryObject<Item> SODALITE_BRICK_STAIRS = block(SovereignHorizonModBlocks.SODALITE_BRICK_STAIRS);
	public static final RegistryObject<Item> SODALITE_BRICK_SLAB = block(SovereignHorizonModBlocks.SODALITE_BRICK_SLAB);
	public static final RegistryObject<Item> SODALITE_BRICK_WALL = block(SovereignHorizonModBlocks.SODALITE_BRICK_WALL);
	public static final RegistryObject<Item> CRACKED_SODALITE_BRICKS = block(SovereignHorizonModBlocks.CRACKED_SODALITE_BRICKS);
	public static final RegistryObject<Item> SODALITE_TILES = block(SovereignHorizonModBlocks.SODALITE_TILES);
	public static final RegistryObject<Item> SODALITE_TILE_STAIRS = block(SovereignHorizonModBlocks.SODALITE_TILE_STAIRS);
	public static final RegistryObject<Item> SODALITE_TILE_SLAB = block(SovereignHorizonModBlocks.SODALITE_TILE_SLAB);
	public static final RegistryObject<Item> SODALITE_TILE_WALL = block(SovereignHorizonModBlocks.SODALITE_TILE_WALL);
	public static final RegistryObject<Item> CRACKED_SODALITE_TILES = block(SovereignHorizonModBlocks.CRACKED_SODALITE_TILES);
	public static final RegistryObject<Item> ELIXIS_SHARD = REGISTRY.register("elixis_shard", () -> new ElixisShardItem());
	public static final RegistryObject<Item> ELIXIS_UPGRADE_SMITHING_TEMPLATE = REGISTRY.register("elixis_upgrade_smithing_template", () -> new ElixisUpgradeSmithingTemplateItem());
	public static final RegistryObject<Item> ELIXITE_ARMOR_HELMET = REGISTRY.register("elixite_armor_helmet", () -> new ElixiteArmorItem.Helmet());
	public static final RegistryObject<Item> ELIXITE_ARMOR_CHESTPLATE = REGISTRY.register("elixite_armor_chestplate", () -> new ElixiteArmorItem.Chestplate());
	public static final RegistryObject<Item> ELIXITE_ARMOR_LEGGINGS = REGISTRY.register("elixite_armor_leggings", () -> new ElixiteArmorItem.Leggings());
	public static final RegistryObject<Item> ELIXITE_ARMOR_BOOTS = REGISTRY.register("elixite_armor_boots", () -> new ElixiteArmorItem.Boots());
	public static final RegistryObject<Item> INFUSION_TABLE = block(SovereignHorizonModBlocks.INFUSION_TABLE);
	public static final RegistryObject<Item> CATECHISM_WING = REGISTRY.register("catechism_wing", () -> new CatechismWingItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
