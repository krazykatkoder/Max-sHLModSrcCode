
package net.mcreator.hl.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class IMPROBItem extends RecordItem {
	public IMPROBItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hlmod:impropable")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
