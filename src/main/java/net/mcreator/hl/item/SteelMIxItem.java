
package net.mcreator.hl.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SteelMIxItem extends Item {
	public SteelMIxItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
