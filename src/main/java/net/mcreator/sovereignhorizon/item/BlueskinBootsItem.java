
package net.mcreator.sovereignhorizon.item;

import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class BlueskinBootsItem extends ArmorItem {

	public BlueskinBootsItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 8;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{1, 0, 0, 0}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SovereignHorizonModItems.BLUESKIN.get()));
			}

			@Override
			public String getName() {
				return "blueskin_boots";
			}

			@Override
			public float getToughness() {
				return 0.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, type, properties);
	}

	public static class Boots extends BlueskinBootsItem {

		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sovereign_horizon:textures/models/armor/rived_layer_1.png";
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				BlueskinBootsBootsTickEventProcedure.execute();
			}
		}
	}

}
