package net.mcreator.sovereignhorizon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.sovereignhorizon.init.SovereignHorizonModBlocks;

public class LiquidVoidNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xoffset = 0;
		double yoffset = 0;
		double zoffset = 0;
		double i = 0;
		i = 0;
		for (int index0 = 0; index0 < 6; index0++) {
			if (i == 0) {
				xoffset = -1;
				yoffset = 0;
				zoffset = 0;
			} else if (i == 1) {
				xoffset = 1;
			} else if (i == 2) {
				xoffset = 0;
				yoffset = -1;
			} else if (i == 3) {
				yoffset = 1;
			} else if (i == 4) {
				yoffset = 0;
				zoffset = -1;
			} else if (i == 5) {
				zoffset = 1;
			}
			if ((world.getFluidState(BlockPos.containing(x + xoffset, y + yoffset, z + zoffset)).createLegacyBlock()) == Blocks.WATER.defaultBlockState()) {
				world.setBlock(BlockPos.containing(x + xoffset, y + yoffset, z + zoffset), SovereignHorizonModBlocks.SOLID_VOID.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
			} else if ((world.getFluidState(BlockPos.containing(x + xoffset, y + yoffset, z + zoffset)).createLegacyBlock()).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x + xoffset, y + yoffset, z + zoffset), SovereignHorizonModBlocks.SODALITE.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
			} else if ((world.getFluidState(BlockPos.containing(x + xoffset, y + yoffset, z + zoffset)).createLegacyBlock()) == Blocks.LAVA.defaultBlockState()) {
				world.setBlock(BlockPos.containing(x + xoffset, y + yoffset, z + zoffset), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
			} else if ((world.getFluidState(BlockPos.containing(x + xoffset, y + yoffset, z + zoffset)).createLegacyBlock()).getBlock() == Blocks.LAVA) {
				world.setBlock(BlockPos.containing(x + xoffset, y + yoffset, z + zoffset), SovereignHorizonModBlocks.THULITE.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
			}
			i = i + 1;
		}
	}
}
