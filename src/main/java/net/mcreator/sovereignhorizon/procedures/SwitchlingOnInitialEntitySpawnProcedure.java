package net.mcreator.sovereignhorizon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.sovereignhorizon.init.SovereignHorizonModBlocks;
import net.mcreator.sovereignhorizon.entity.SwitchlingEntity;

public class SwitchlingOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -6;
		found = false;
		for (int index0 = 0; index0 < 12; index0++) {
			sy = -6;
			for (int index1 = 0; index1 < 12; index1++) {
				sz = -6;
				for (int index2 = 0; index2 < 12; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SovereignHorizonModBlocks.KEYSTONE.get()) {
						found = true;
						if (entity instanceof SwitchlingEntity _datEntSetI)
							_datEntSetI.getEntityData().set(SwitchlingEntity.DATA_KeystoneX, (int) Math.floor(x + sx));
						if (entity instanceof SwitchlingEntity _datEntSetI)
							_datEntSetI.getEntityData().set(SwitchlingEntity.DATA_KeystoneY, (int) Math.floor(y + sy));
						if (entity instanceof SwitchlingEntity _datEntSetI)
							_datEntSetI.getEntityData().set(SwitchlingEntity.DATA_KeystoneZ, (int) Math.floor(z + sz));
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == false) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
