
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
import net.mcreator.sovereignhorizon.block.SodaliteTilesBlock;
import net.mcreator.sovereignhorizon.block.SodaliteTileWallBlock;
import net.mcreator.sovereignhorizon.block.SodaliteTileStairsBlock;
import net.mcreator.sovereignhorizon.block.SodaliteTileSlabBlock;
import net.mcreator.sovereignhorizon.block.SodaliteStairsBlock;
import net.mcreator.sovereignhorizon.block.SodaliteSlabBlock;
import net.mcreator.sovereignhorizon.block.SodalitePressurePlateBlock;
import net.mcreator.sovereignhorizon.block.SodaliteButtonBlock;
import net.mcreator.sovereignhorizon.block.SodaliteBricksBlock;
import net.mcreator.sovereignhorizon.block.SodaliteBrickWallBlock;
import net.mcreator.sovereignhorizon.block.SodaliteBrickStairsBlock;
import net.mcreator.sovereignhorizon.block.SodaliteBrickSlabBlock;
import net.mcreator.sovereignhorizon.block.SodaliteBlock;
import net.mcreator.sovereignhorizon.block.PolishedSodaliteWallBlock;
import net.mcreator.sovereignhorizon.block.PolishedSodaliteStairsBlock;
import net.mcreator.sovereignhorizon.block.PolishedSodaliteSlabBlock;
import net.mcreator.sovereignhorizon.block.PolishedSodaliteBlock;
import net.mcreator.sovereignhorizon.block.InfusionTableBlock;
import net.mcreator.sovereignhorizon.block.DeepLichenCoveredSodaliteBlock;
import net.mcreator.sovereignhorizon.block.CrackedSodaliteTilesBlock;
import net.mcreator.sovereignhorizon.block.CrackedSodaliteBricksBlock;
import net.mcreator.sovereignhorizon.block.CobbledSodaliteWallBlock;
import net.mcreator.sovereignhorizon.block.CobbledSodaliteStairsBlock;
import net.mcreator.sovereignhorizon.block.CobbledSodaliteSlabBlock;
import net.mcreator.sovereignhorizon.block.CobbledSodaliteBlock;
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
	public static final RegistryObject<Block> COBBLED_SODALITE = REGISTRY.register("cobbled_sodalite", () -> new CobbledSodaliteBlock());
	public static final RegistryObject<Block> COBBLED_SODALITE_STAIRS = REGISTRY.register("cobbled_sodalite_stairs", () -> new CobbledSodaliteStairsBlock());
	public static final RegistryObject<Block> COBBLED_SODALITE_SLAB = REGISTRY.register("cobbled_sodalite_slab", () -> new CobbledSodaliteSlabBlock());
	public static final RegistryObject<Block> COBBLED_SODALITE_WALL = REGISTRY.register("cobbled_sodalite_wall", () -> new CobbledSodaliteWallBlock());
	public static final RegistryObject<Block> POLISHED_SODALITE = REGISTRY.register("polished_sodalite", () -> new PolishedSodaliteBlock());
	public static final RegistryObject<Block> POLISHED_SODALITE_STAIRS = REGISTRY.register("polished_sodalite_stairs", () -> new PolishedSodaliteStairsBlock());
	public static final RegistryObject<Block> POLISHED_SODALITE_SLAB = REGISTRY.register("polished_sodalite_slab", () -> new PolishedSodaliteSlabBlock());
	public static final RegistryObject<Block> POLISHED_SODALITE_WALL = REGISTRY.register("polished_sodalite_wall", () -> new PolishedSodaliteWallBlock());
	public static final RegistryObject<Block> SODALITE_BRICKS = REGISTRY.register("sodalite_bricks", () -> new SodaliteBricksBlock());
	public static final RegistryObject<Block> SODALITE_BRICK_STAIRS = REGISTRY.register("sodalite_brick_stairs", () -> new SodaliteBrickStairsBlock());
	public static final RegistryObject<Block> SODALITE_BRICK_SLAB = REGISTRY.register("sodalite_brick_slab", () -> new SodaliteBrickSlabBlock());
	public static final RegistryObject<Block> SODALITE_BRICK_WALL = REGISTRY.register("sodalite_brick_wall", () -> new SodaliteBrickWallBlock());
	public static final RegistryObject<Block> CRACKED_SODALITE_BRICKS = REGISTRY.register("cracked_sodalite_bricks", () -> new CrackedSodaliteBricksBlock());
	public static final RegistryObject<Block> SODALITE_TILES = REGISTRY.register("sodalite_tiles", () -> new SodaliteTilesBlock());
	public static final RegistryObject<Block> SODALITE_TILE_STAIRS = REGISTRY.register("sodalite_tile_stairs", () -> new SodaliteTileStairsBlock());
	public static final RegistryObject<Block> SODALITE_TILE_SLAB = REGISTRY.register("sodalite_tile_slab", () -> new SodaliteTileSlabBlock());
	public static final RegistryObject<Block> SODALITE_TILE_WALL = REGISTRY.register("sodalite_tile_wall", () -> new SodaliteTileWallBlock());
	public static final RegistryObject<Block> CRACKED_SODALITE_TILES = REGISTRY.register("cracked_sodalite_tiles", () -> new CrackedSodaliteTilesBlock());
	public static final RegistryObject<Block> INFUSION_TABLE = REGISTRY.register("infusion_table", () -> new InfusionTableBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
