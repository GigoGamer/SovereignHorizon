
package net.mcreator.sovereignhorizon.item;

public class ElixisiteSmithingTemplateItem extends Item {
	public ElixisiteSmithingTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.sovereign_horizon.elixisite_smithing_template.description_0"));
		list.add(Component.translatable("item.sovereign_horizon.elixisite_smithing_template.description_1"));
		list.add(Component.translatable("item.sovereign_horizon.elixisite_smithing_template.description_2"));
		list.add(Component.translatable("item.sovereign_horizon.elixisite_smithing_template.description_3"));
		list.add(Component.translatable("item.sovereign_horizon.elixisite_smithing_template.description_4"));
		list.add(Component.translatable("item.sovereign_horizon.elixisite_smithing_template.description_5"));
	}
}