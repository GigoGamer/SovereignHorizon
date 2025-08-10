
package net.mcreator.sovereignhorizon.item;

public class CookedCorruptedFleshItem extends Item {
	public CookedCorruptedFleshItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(9).saturationMod(1.8f).meat().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		CookedCorruptedFleshPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}