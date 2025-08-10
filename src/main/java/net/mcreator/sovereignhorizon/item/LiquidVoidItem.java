
package net.mcreator.sovereignhorizon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.sovereignhorizon.init.SovereignHorizonModFluids;

public class LiquidVoidItem extends BucketItem {
	public LiquidVoidItem() {
		super(SovereignHorizonModFluids.LIQUID_VOID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}
}
