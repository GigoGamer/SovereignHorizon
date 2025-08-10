package net.mcreator.sovereignhorizon.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BlueskinBootsBootsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 0, false, false));
	}
}
