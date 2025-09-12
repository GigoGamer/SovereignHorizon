package net.mcreator.sovereignhorizon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.sovereignhorizon.init.SovereignHorizonModParticleTypes;
import net.mcreator.sovereignhorizon.SovereignHorizonMod;

import java.util.List;
import java.util.Comparator;

public class InverstonePlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		double i = 0;
		itemstack.shrink(1);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.lodestone_compass.lock")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.lodestone_compass.lock")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		i = 0;
		for (int index0 = 0; index0 < 40; index0++) {
			i = i + 1;
			world.addParticle((SimpleParticleType) (SovereignHorizonModParticleTypes.KEYSTONE_MAGIC.get()), (x + 3 * Math.cos(i)), (y + 1), (z + 3 * Math.sin(i)), 0, 100, 0);
		}
		SovereignHorizonMod.queueServerWork(5, () -> {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 60, 5, true, false));
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.lodestone_compass.lock")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.lodestone_compass.lock")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
		});
	}
}
