package net.mcreator.sovereignhorizon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.sovereignhorizon.init.SovereignHorizonModBlocks;

public class KeystoneWorkaroundOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), SovereignHorizonModBlocks.KEYSTONE.get().defaultBlockState(), 3);
	}
}
