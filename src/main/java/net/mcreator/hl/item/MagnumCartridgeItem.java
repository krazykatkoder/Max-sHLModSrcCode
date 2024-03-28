
package net.mcreator.hl.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagnumCartridgeItem extends Item {
	public MagnumCartridgeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
