package net.mcreator.sovereignhorizon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.sovereignhorizon.init.SovereignHorizonModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ApplyPressureDamageProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("inSH") == true) {
			if (entity.getY() < 32) {
				if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(SovereignHorizonModEnchantments.RESILIENCE.get()) >= 3)) {
					if (Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("sovereign_horizon:pressure")))), 2);
					}
				}
			} else {
				if (entity.getY() < 128) {
					if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(SovereignHorizonModEnchantments.RESILIENCE.get()) >= 2)) {
						if (Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("sovereign_horizon:pressure")))), (float) 1.5);
						}
					}
				} else {
					if (entity.getY() < 224) {
						if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(SovereignHorizonModEnchantments.RESILIENCE.get()) >= 1)) {
							if (Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
								entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("sovereign_horizon:pressure")))), 1);
							}
						}
					}
				}
			}
		}
	}
}
