package net.mcreator.sovereignhorizon.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DesolateCreeperPlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.HOSTILE, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.HOSTILE, 1, 1, false);
			}
		}
		if (!entity.level().isClientSide())
			entity.discard();
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.MOB);
	}
}
