
package net.mcreator.sovereignhorizon.item;

import net.minecraft.network.chat.Component;

public class LiquidVoidItem extends BucketItem {

	public LiquidVoidItem() {
		super(SovereignHorizonModFluids.LIQUID_VOID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}

}
