
package net.mcreator.sovereignhorizon.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class ElixiteGolemEntity extends Monster implements RangedAttackMob {

	public ElixiteGolemEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(SovereignHorizonModEntities.ELIXITE_GOLEM.get(), world);
	}

	public ElixiteGolemEntity(EntityType<ElixiteGolemEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0f);
		xpReward = 15;
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

		this.goalSelector.addGoal(1, new RandomStrollGoal(this, 0.8, 20) {

			@Override
			protected Vec3 getPosition() {
				RandomSource random = ElixiteGolemEntity.this.getRandom();
				double dir_x = ElixiteGolemEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = ElixiteGolemEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = ElixiteGolemEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.goalSelector.addGoal(3, new PanicGoal(this, 1.5));
		this.goalSelector.addGoal(4, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (ElixiteGolemEntity.this.getTarget() != null && !ElixiteGolemEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return ElixiteGolemEntity.this.getMoveControl().hasWanted() && ElixiteGolemEntity.this.getTarget() != null && ElixiteGolemEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = ElixiteGolemEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				ElixiteGolemEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = ElixiteGolemEntity.this.getTarget();
				if (ElixiteGolemEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					ElixiteGolemEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = ElixiteGolemEntity.this.distanceToSqr(livingentity);
					if (d0 < 16) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						ElixiteGolemEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
					}
				}
			}
		});
		this.goalSelector.addGoal(5, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(6, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));

		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.shulker.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.chime"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.break"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {

		return false;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		ElixiteGolemOnEntityTickUpdateProcedure.execute(this);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		ElixiteProjectileEntity.shoot(this, target);
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
		SpawnPlacements.register(SovereignHorizonModEntities.ELIXITE_GOLEM.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 1);
		builder = builder.add(Attributes.MAX_HEALTH, 50);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 48);

		builder = builder.add(Attributes.FLYING_SPEED, 1);

		return builder;
	}

}
