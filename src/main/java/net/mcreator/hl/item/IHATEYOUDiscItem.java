
package net.mcreator.hl.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class IHATEYOUDiscItem extends RecordItem {
	public IHATEYOUDiscItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hlmod:i_hate_you")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2240);
	}
}
