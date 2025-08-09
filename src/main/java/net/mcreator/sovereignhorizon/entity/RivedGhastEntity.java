
package net.mcreator.sovereignhorizon.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class RivedGhastEntity extends Monster {

	public RivedGhastEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(SovereignHorizonModEntities.RIVED_GHAST.get(), world);
	}

	public RivedGhastEntity(EntityType<RivedGhastEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0f);
		xpReward = 10;
		setNoAi(false);

		this.moveControl = new FlyingMoveControl(this, 10, true);

	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.goalSelector.addGoal(2, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (RivedGhastEntity.this.getTarget() != null && !RivedGhastEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return RivedGhastEntity.this.getMoveControl().hasWanted() && RivedGhastEntity.this.getTarget() != null && RivedGhastEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = RivedGhastEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				RivedGhastEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 2);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = RivedGhastEntity.this.getTarget();
				if (RivedGhastEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					RivedGhastEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = RivedGhastEntity.this.distanceToSqr(livingentity);
					if (d0 < 16) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						RivedGhastEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 2);
					}
				}
			}
		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8, 20) {

			@Override
			protected Vec3 getPosition() {
				RandomSource random = RivedGhastEntity.this.getRandom();
				double dir_x = RivedGhastEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = RivedGhastEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = RivedGhastEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

		});
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(5, new HurtByTargetGoal(this));

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.death"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {

		return false;
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		Entity sourceentity = damagesource.getEntity();
		Entity immediatesourceentity = damagesource.getDirectEntity();

		RivedGhastEntityIsHurtProcedure.execute();
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.FALLING_ANVIL))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();

		this.setNoGravity(true);
	}

	public static void init() {
		SpawnPlacements.register(SovereignHorizonModEntities.RIVED_GHAST.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.7);
		builder = builder.add(Attributes.MAX_HEALTH, 35);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.FLYING_SPEED, 0.7);

		return builder;
	}

}
