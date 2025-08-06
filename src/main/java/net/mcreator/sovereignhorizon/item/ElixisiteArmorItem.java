
package net.mcreator.sovereignhorizon.item;

import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class ElixisiteArmorItem extends ArmorItem {

	public ElixisiteArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 30;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{4, 10, 12, 4}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SovereignHorizonModItems.ELIXIS.get()));
			}

			@Override
			public String getName() {
				return "elixite_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends ElixisiteArmorItem {

		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sovereign_horizon:textures/models/armor/elixisite_layer_1.png";
		}

	}

	public static class Chestplate extends ElixisiteArmorItem {

		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sovereign_horizon:textures/models/armor/elixisite_layer_1.png";
		}

	}

	public static class Leggings extends ElixisiteArmorItem {

		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sovereign_horizon:textures/models/armor/elixisite_layer_2.png";
		}

	}

	public static class Boots extends ElixisiteArmorItem {

		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sovereign_horizon:textures/models/armor/elixisite_layer_1.png";
		}

	}

}
