
package net.mcreator.sovereignhorizon.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.sovereignhorizon.procedures.SwitchlingOnInitialEntitySpawnProcedure;
import net.mcreator.sovereignhorizon.procedures.SwitchlingOnEntityTickUpdateProcedure;
import net.mcreator.sovereignhorizon.procedures.NewEntityDiesProcedure;
import net.mcreator.sovereignhorizon.init.SovereignHorizonModEntities;

import javax.annotation.Nullable;

public class SwitchlingEntity extends Monster {
	public static final EntityDataAccessor<Integer> DATA_KeystoneX = SynchedEntityData.defineId(SwitchlingEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_KeystoneY = SynchedEntityData.defineId(SwitchlingEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_KeystoneZ = SynchedEntityData.defineId(SwitchlingEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_active = SynchedEntityData.defineId(SwitchlingEntity.class, EntityDataSerializers.BOOLEAN);

	public SwitchlingEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(SovereignHorizonModEntities.SWITCHLING.get(), world);
	}

	public SwitchlingEntity(EntityType<SwitchlingEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 2;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_KeystoneX, 0);
		this.entityData.define(DATA_KeystoneY, 0);
		this.entityData.define(DATA_KeystoneZ, 0);
		this.entityData.define(DATA_active, true);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, false, false));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		NewEntityDiesProcedure.execute(source.getEntity());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		SwitchlingOnInitialEntitySpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("DataKeystoneX", this.entityData.get(DATA_KeystoneX));
		compound.putInt("DataKeystoneY", this.entityData.get(DATA_KeystoneY));
		compound.putInt("DataKeystoneZ", this.entityData.get(DATA_KeystoneZ));
		compound.putBoolean("Dataactive", this.entityData.get(DATA_active));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DataKeystoneX"))
			this.entityData.set(DATA_KeystoneX, compound.getInt("DataKeystoneX"));
		if (compound.contains("DataKeystoneY"))
			this.entityData.set(DATA_KeystoneY, compound.getInt("DataKeystoneY"));
		if (compound.contains("DataKeystoneZ"))
			this.entityData.set(DATA_KeystoneZ, compound.getInt("DataKeystoneZ"));
		if (compound.contains("Dataactive"))
			this.entityData.set(DATA_active, compound.getBoolean("Dataactive"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		SwitchlingOnEntityTickUpdateProcedure.execute(this.level(), this);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 20);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		return builder;
	}
}
