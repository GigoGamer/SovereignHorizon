package net.mcreator.sovereignhorizon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class BoundstonePlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double particleRadius = 0;
		double particleAmount = 0;
		itemstack.shrink(1);
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 1.5), (entity.getDeltaMovement().z())));
		particleAmount = 8;
		particleRadius = 4;
		for (int index0 = 0; index0 < (int) particleAmount; index0++) {
			world.addParticle(ParticleTypes.SONIC_BOOM, (x + 0 + Mth.nextDouble(RandomSource.create(), -0.1, 0.1) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), 0, 5) * particleRadius),
					(z + 0 + Mth.nextDouble(RandomSource.create(), -0.1, 0.1) * particleRadius), 0, 0, 0);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.hurt")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.hurt")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
	}
}
