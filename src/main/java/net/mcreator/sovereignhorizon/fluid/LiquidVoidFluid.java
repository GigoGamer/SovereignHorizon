
package net.mcreator.sovereignhorizon.fluid;

public abstract class LiquidVoidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> SovereignHorizonModFluidTypes.LIQUID_VOID_TYPE.get(), () -> SovereignHorizonModFluids.LIQUID_VOID.get(),
			() -> SovereignHorizonModFluids.FLOWING_LIQUID_VOID.get()).explosionResistance(100f).tickRate(15).levelDecreasePerBlock(3).bucket(() -> SovereignHorizonModItems.LIQUID_VOID_BUCKET.get())
			.block(() -> (LiquidBlock) SovereignHorizonModBlocks.LIQUID_VOID.get());

	private LiquidVoidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRAGON_BREATH;
	}

	public static class Source extends LiquidVoidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidVoidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
