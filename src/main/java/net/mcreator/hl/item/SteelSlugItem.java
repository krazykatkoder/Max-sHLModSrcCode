
package net.mcreator.hl.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SteelSlugItem extends Item {
	public SteelSlugItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
