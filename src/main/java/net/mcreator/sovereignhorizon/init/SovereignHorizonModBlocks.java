
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.sovereignhorizon.block.TestBlock;
import net.mcreator.sovereignhorizon.block.SparseDeepLichenCoveredSodaliteBlock;
import net.mcreator.sovereignhorizon.block.SoverignHorizonPortalBlock;
import net.mcreator.sovereignhorizon.block.SodaliteWallBlock;
import net.mcreator.sovereignhorizon.block.SodaliteStairsBlock;
import net.mcreator.sovereignhorizon.block.SodaliteSlabBlock;
import net.mcreator.sovereignhorizon.block.SodalitePressurePlateBlock;
import net.mcreator.sovereignhorizon.block.SodaliteButtonBlock;
import net.mcreator.sovereignhorizon.block.SodaliteBlock;
import net.mcreator.sovereignhorizon.block.DeepLichenCoveredSodaliteBlock;
import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class SovereignHorizonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SovereignHorizonMod.MODID);
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	public static final RegistryObject<Block> SOVERIGN_HORIZON_PORTAL = REGISTRY.register("soverign_horizon_portal", () -> new SoverignHorizonPortalBlock());
	public static final RegistryObject<Block> SODALITE = REGISTRY.register("sodalite", () -> new SodaliteBlock());
	public static final RegistryObject<Block> SODALITE_STAIRS = REGISTRY.register("sodalite_stairs", () -> new SodaliteStairsBlock());
	public static final RegistryObject<Block> SODALITE_SLAB = REGISTRY.register("sodalite_slab", () -> new SodaliteSlabBlock());
	public static final RegistryObject<Block> SODALITE_WALL = REGISTRY.register("sodalite_wall", () -> new SodaliteWallBlock());
	public static final RegistryObject<Block> SODALITE_PRESSURE_PLATE = REGISTRY.register("sodalite_pressure_plate", () -> new SodalitePressurePlateBlock());
	public static final RegistryObject<Block> SODALITE_BUTTON = REGISTRY.register("sodalite_button", () -> new SodaliteButtonBlock());
	public static final RegistryObject<Block> SPARSE_DEEP_LICHEN_COVERED_SODALITE = REGISTRY.register("sparse_deep_lichen_covered_sodalite", () -> new SparseDeepLichenCoveredSodaliteBlock());
	public static final RegistryObject<Block> DEEP_LICHEN_COVERED_SODALITE = REGISTRY.register("deep_lichen_covered_sodalite", () -> new DeepLichenCoveredSodaliteBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
