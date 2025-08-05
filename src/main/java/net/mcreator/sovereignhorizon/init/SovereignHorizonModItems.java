
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
import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class SovereignHorizonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SovereignHorizonMod.MODID);
	public static final RegistryObject<Item> TEST = block(SovereignHorizonModBlocks.TEST);
	public static final RegistryObject<Item> SOVERIGN_HORIZON = REGISTRY.register("soverign_horizon", () -> new SoverignHorizonItem());
	public static final RegistryObject<Item> CATECHISM_SPAWN_EGG = REGISTRY.register("catechism_spawn_egg", () -> new ForgeSpawnEggItem(SovereignHorizonModEntities.CATECHISM, -10092442, -65281, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
