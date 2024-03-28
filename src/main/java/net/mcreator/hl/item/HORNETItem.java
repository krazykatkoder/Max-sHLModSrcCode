
package net.mcreator.hl.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HORNETItem extends Item {
	public HORNETItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
