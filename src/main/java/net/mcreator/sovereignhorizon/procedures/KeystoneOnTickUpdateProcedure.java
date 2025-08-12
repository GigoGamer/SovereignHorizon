package net.mcreator.sovereignhorizon.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.sovereignhorizon.init.SovereignHorizonModParticleTypes;

public class KeystoneOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock().getStateDefinition().getProperty("active") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1)) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (SovereignHorizonModParticleTypes.KEYSTONE_MAGIC.get()), (x + 0.5), (y + 1), (z + 0.5), 5, 0.2, 0, 0.2, 1);
		}
	}
}
