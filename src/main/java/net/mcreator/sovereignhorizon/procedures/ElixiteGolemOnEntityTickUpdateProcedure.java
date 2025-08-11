package net.mcreator.sovereignhorizon.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ElixiteGolemOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("AI", (entity.getPersistentData().getDouble("AI") + 1));
		}
		if (entity.getPersistentData().getDouble("AI") == 120) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 2));
			entity.getPersistentData().putDouble("AI", 0);
		}
	}
}
