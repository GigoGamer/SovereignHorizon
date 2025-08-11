package net.mcreator.sovereignhorizon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.sovereignhorizon.SovereignHorizonMod;

public class ElixisCorruptedEndermanOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("AI", (entity.getPersistentData().getDouble("AI") + 1));
		}
		if (entity.getPersistentData().getDouble("AI") == 150) {
			{
				Entity _ent = entity;
				_ent.teleportTo((Mth.nextDouble(RandomSource.create(), 1, 8) + x), y, (Mth.nextDouble(RandomSource.create(), 1, 8) + z));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), 1, 8) + x), y, (Mth.nextDouble(RandomSource.create(), 1, 8) + z), _ent.getYRot(), _ent.getXRot());
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			SovereignHorizonMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, (entity.getX()), (entity.getY()), (entity.getZ()), 20, 3, 3, 3, 1);
			});
		}
		if (entity.getPersistentData().getDouble("AI") == 250) {
			entity.getPersistentData().putDouble("AI", 0);
		}
		if (entity.isInWater()) {
			if (Math.random() < 0.1) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DROWN)), 1);
				{
					Entity _ent = entity;
					_ent.teleportTo((Mth.nextDouble(RandomSource.create(), 1, 3) + x), y, (Mth.nextDouble(RandomSource.create(), 1, 3) + z));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), 1, 3) + x), y, (Mth.nextDouble(RandomSource.create(), 1, 3) + z), _ent.getYRot(), _ent.getXRot());
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				SovereignHorizonMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, (entity.getX()), (entity.getY()), (entity.getZ()), 20, 3, 3, 3, 1);
				});
			}
		}
	}
}
