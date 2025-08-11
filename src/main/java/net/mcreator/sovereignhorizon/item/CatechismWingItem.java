
package net.mcreator.sovereignhorizon.item;

public class CatechismWingItem extends Item {
	public CatechismWingItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(2.5f).meat().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		CatechismWingPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}