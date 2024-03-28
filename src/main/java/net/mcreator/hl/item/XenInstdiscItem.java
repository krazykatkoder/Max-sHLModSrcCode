
package net.mcreator.hl.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class XenInstdiscItem extends RecordItem {
	public XenInstdiscItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hlmod:xen_inst")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2660);
	}
}
