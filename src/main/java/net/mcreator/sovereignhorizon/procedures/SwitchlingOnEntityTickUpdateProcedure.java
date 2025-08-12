package net.mcreator.sovereignhorizon.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.sovereignhorizon.init.SovereignHorizonModBlocks;
import net.mcreator.sovereignhorizon.entity.SwitchlingEntity;

public class SwitchlingOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(entity instanceof SwitchlingEntity _datEntI ? _datEntI.getEntityData().get(SwitchlingEntity.DATA_KeystoneX) : 0,
				entity instanceof SwitchlingEntity _datEntI ? _datEntI.getEntityData().get(SwitchlingEntity.DATA_KeystoneY) : 0, entity instanceof SwitchlingEntity _datEntI ? _datEntI.getEntityData().get(SwitchlingEntity.DATA_KeystoneZ) : 0)))
				.getBlock() == SovereignHorizonModBlocks.KEYSTONE.get()) {
			if ((world.getBlockState(BlockPos.containing(entity instanceof SwitchlingEntity _datEntI ? _datEntI.getEntityData().get(SwitchlingEntity.DATA_KeystoneX) : 0,
					entity instanceof SwitchlingEntity _datEntI ? _datEntI.getEntityData().get(SwitchlingEntity.DATA_KeystoneY) : 0, entity instanceof SwitchlingEntity _datEntI ? _datEntI.getEntityData().get(SwitchlingEntity.DATA_KeystoneZ) : 0)))
					.getBlock().getStateDefinition().getProperty("active") instanceof BooleanProperty _getbp9
					&& (world.getBlockState(BlockPos.containing(entity instanceof SwitchlingEntity _datEntI ? _datEntI.getEntityData().get(SwitchlingEntity.DATA_KeystoneX) : 0,
							entity instanceof SwitchlingEntity _datEntI ? _datEntI.getEntityData().get(SwitchlingEntity.DATA_KeystoneY) : 0,
							entity instanceof SwitchlingEntity _datEntI ? _datEntI.getEntityData().get(SwitchlingEntity.DATA_KeystoneZ) : 0))).getValue(_getbp9)) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/data merge entity @s {NoAI:0b}");
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/data merge entity @s {NoAI:1b}");
					}
				}
			}
		} else {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
