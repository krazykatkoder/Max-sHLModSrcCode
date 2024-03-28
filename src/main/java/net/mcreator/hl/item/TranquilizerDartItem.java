
package net.mcreator.hl.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TranquilizerDartItem extends Item {
	public TranquilizerDartItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
