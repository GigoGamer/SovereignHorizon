
package net.mcreator.sovereignhorizon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ElixisShardItem extends Item {
	public ElixisShardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
