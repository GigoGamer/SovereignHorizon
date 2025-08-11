
package net.mcreator.sovereignhorizon.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class GlowweedBlock extends FlowerBlock implements BonemealableBlock {
	public GlowweedBlock() {
		super(() -> MobEffects.MOVEMENT_SPEED, 100,
				BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().lightLevel(s -> 5).noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(SovereignHorizonModBlocks.SODALITE.get()) || groundState.is(SovereignHorizonModBlocks.RAW_MARBLE.get()) || groundState.is(SovereignHorizonModBlocks.SODALITE_EMERALD_ORE.get())
				|| groundState.is(SovereignHorizonModBlocks.SODALITE_DIAMOND_ORE.get()) || groundState.is(SovereignHorizonModBlocks.SODALITE_LAPIS_LAZULI_ORE.get()) || groundState.is(SovereignHorizonModBlocks.SODALITE_REDSTONE_ORE.get())
				|| groundState.is(SovereignHorizonModBlocks.SODALITE_QUARTZ_ORE.get()) || groundState.is(SovereignHorizonModBlocks.THULITE.get()) || groundState.is(SovereignHorizonModBlocks.LARIMAR.get())
				|| groundState.is(SovereignHorizonModBlocks.LEPIDOLITE.get()) || groundState.is(SovereignHorizonModBlocks.ASH.get()) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(Blocks.DIRT_PATH) || groundState.is(Blocks.MYCELIUM)
				|| groundState.is(Blocks.DIRT) || groundState.is(Blocks.COARSE_DIRT) || groundState.is(Blocks.PODZOL) || groundState.is(Blocks.ROOTED_DIRT) || groundState.is(Blocks.MUD)
				|| groundState.is(SovereignHorizonModBlocks.SPARSE_DEEP_LICHEN_COVERED_SODALITE.get()) || groundState.is(SovereignHorizonModBlocks.DEEP_LICHEN_COVERED_SODALITE.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate, boolean clientSide) {
		return true;
	}

	@Override
	public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
		return true;
	}

	@Override
	public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
		GlowweedOnBoneMealSuccessProcedure.execute();
	}
}