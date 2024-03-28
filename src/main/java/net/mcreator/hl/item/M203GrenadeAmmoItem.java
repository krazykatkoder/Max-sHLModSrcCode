
package net.mcreator.hl.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class M203GrenadeAmmoItem extends Item {
	public M203GrenadeAmmoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
