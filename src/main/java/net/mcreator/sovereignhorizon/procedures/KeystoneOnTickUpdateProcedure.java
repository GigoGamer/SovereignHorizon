package net.mcreator.sovereignhorizon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.sovereignhorizon.init.SovereignHorizonModParticleTypes;
import net.mcreator.sovereignhorizon.init.SovereignHorizonModEntities;
import net.mcreator.sovereignhorizon.entity.SwitchlingEntity;

public class KeystoneOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock().getStateDefinition().getProperty("active") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1)) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (SovereignHorizonModParticleTypes.KEYSTONE_MAGIC.get()), (x + 0.5), (y + 1), (z + 0.5), 5, 0.2, 0, 0.2, 1);
			if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DOMOBSPAWNING) && Mth.nextInt(RandomSource.create(), 1, 10) > 1
					&& !(!world.getEntitiesOfClass(SwitchlingEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty())) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = SovereignHorizonModEntities.SWITCHLING.get().spawn(_level, BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -2, 2), y, z + Mth.nextInt(RandomSource.create(), -2, 2)), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		}
	}
}
