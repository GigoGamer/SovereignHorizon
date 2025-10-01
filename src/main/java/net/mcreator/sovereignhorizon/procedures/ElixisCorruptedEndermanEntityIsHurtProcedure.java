package net.mcreator.sovereignhorizon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ElixisCorruptedEndermanEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			{
				Entity _ent = entity;
				_ent.teleportTo((Math.sin(sourceentity.getLookAngle().y * (Math.PI / 180) * (-5)) + sourceentity.getX()), y, (Math.cos(sourceentity.getLookAngle().y * (Math.PI / 180) * (-5)) + sourceentity.getZ()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((Math.sin(sourceentity.getLookAngle().y * (Math.PI / 180) * (-5)) + sourceentity.getX()), y, (Math.cos(sourceentity.getLookAngle().y * (Math.PI / 180) * (-5)) + sourceentity.getZ()),
							_ent.getYRot(), _ent.getXRot());
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
		}
	}
}
