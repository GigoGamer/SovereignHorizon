
package net.mcreator.sovereignhorizon.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class RecordSunriseItem extends RecordItem {
	public RecordSunriseItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sovereign_horizon:record.sunrise")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2160);
	}
}
