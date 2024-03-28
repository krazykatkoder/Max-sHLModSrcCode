
package net.mcreator.hl.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.hl.procedures.BlackMesaResearchFacilityItemInInventoryTickProcedure;

public class BlackMesaResearchFacilityItem extends Item {
	public BlackMesaResearchFacilityItem() {
		super(new Item.Properties().durability(1000).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			BlackMesaResearchFacilityItemInInventoryTickProcedure.execute(entity, itemstack);
		BlackMesaResearchFacilityItemInInventoryTickProcedure.execute(entity, itemstack);
	}
}
