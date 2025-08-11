
package net.mcreator.sovereignhorizon.enchantment;

public class BoundingEnchantment extends Enchantment {

	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.ARMOR_FEET;

	public BoundingEnchantment() {
		super(Enchantment.Rarity.COMMON, ENCHANTMENT_CATEGORY, new EquipmentSlot[]{EquipmentSlot.FEET});
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}

}
