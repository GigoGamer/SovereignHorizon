
package net.mcreator.sovereignhorizon.item;

public class AshyFleshItem extends Item {
	public AshyFleshItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(6f).meat().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		AshyFleshPlayerFinishesUsingItemProcedure.execute();
		return retval;
	}
}