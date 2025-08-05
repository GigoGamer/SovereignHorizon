
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.sovereignhorizon.item.SoverignHorizonItem;
import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class SovereignHorizonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SovereignHorizonMod.MODID);
	public static final RegistryObject<Item> TEST = block(SovereignHorizonModBlocks.TEST);
	public static final RegistryObject<Item> SOVERIGN_HORIZON = REGISTRY.register("soverign_horizon", () -> new SoverignHorizonItem());
	public static final RegistryObject<Item> SODALITE = block(SovereignHorizonModBlocks.SODALITE);
	public static final RegistryObject<Item> SODALITE_SLAB = block(SovereignHorizonModBlocks.SODALITE_SLAB);
	public static final RegistryObject<Item> SODALITE_STAIRS = block(SovereignHorizonModBlocks.SODALITE_STAIRS);
	public static final RegistryObject<Item> SODALITE_BUTTON = block(SovereignHorizonModBlocks.SODALITE_BUTTON);
	public static final RegistryObject<Item> SODALITE_PRESSURE_PLATE = block(SovereignHorizonModBlocks.SODALITE_PRESSURE_PLATE);
	public static final RegistryObject<Item> SODALITE_WALL = block(SovereignHorizonModBlocks.SODALITE_WALL);
	public static final RegistryObject<Item> SPARSE_DEEP_LICHEN_COVERED_SODALITE = block(SovereignHorizonModBlocks.SPARSE_DEEP_LICHEN_COVERED_SODALITE);
	public static final RegistryObject<Item> DEEP_LICHEN_COVERED_SODALITE = block(SovereignHorizonModBlocks.DEEP_LICHEN_COVERED_SODALITE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
