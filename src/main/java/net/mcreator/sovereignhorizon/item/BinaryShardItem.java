
package net.mcreator.sovereignhorizon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BinaryShardItem extends Item {
	public BinaryShardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
