
package net.mcreator.hl.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GluonFireItem extends Item {
	public GluonFireItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
