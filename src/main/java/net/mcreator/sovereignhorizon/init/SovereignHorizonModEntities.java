
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sovereignhorizon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.sovereignhorizon.entity.RivedGhastEntity;
import net.mcreator.sovereignhorizon.entity.ElixisCorruptedEndermanEntity;
import net.mcreator.sovereignhorizon.entity.DesolateCreeperEntity;
import net.mcreator.sovereignhorizon.entity.CatechismEntity;
import net.mcreator.sovereignhorizon.SovereignHorizonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SovereignHorizonModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SovereignHorizonMod.MODID);
	public static final RegistryObject<EntityType<CatechismEntity>> CATECHISM = register("catechism", EntityType.Builder.<CatechismEntity>of(CatechismEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(CatechismEntity::new).fireImmune().sized(0.8f, 0.4f));
	public static final RegistryObject<EntityType<RivedGhastEntity>> RIVED_GHAST = register("rived_ghast",
			EntityType.Builder.<RivedGhastEntity>of(RivedGhastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RivedGhastEntity::new)

					.sized(4f, 4f));
	public static final RegistryObject<EntityType<DesolateCreeperEntity>> DESOLATE_CREEPER = register("desolate_creeper",
			EntityType.Builder.<DesolateCreeperEntity>of(DesolateCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DesolateCreeperEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ElixisCorruptedEndermanEntity>> ELIXIS_CORRUPTED_ENDERMAN = register("elixis_corrupted_enderman",
			EntityType.Builder.<ElixisCorruptedEndermanEntity>of(ElixisCorruptedEndermanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ElixisCorruptedEndermanEntity::new)

					.sized(0.6f, 3f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CatechismEntity.init();
			RivedGhastEntity.init();
			DesolateCreeperEntity.init();
			ElixisCorruptedEndermanEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CATECHISM.get(), CatechismEntity.createAttributes().build());
		event.put(RIVED_GHAST.get(), RivedGhastEntity.createAttributes().build());
		event.put(DESOLATE_CREEPER.get(), DesolateCreeperEntity.createAttributes().build());
		event.put(ELIXIS_CORRUPTED_ENDERMAN.get(), ElixisCorruptedEndermanEntity.createAttributes().build());
	}
}
