
package net.mcreator.hl.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.hl.procedures.DadItemRightClickedOnBlockProcedure;

public class DadItemItem extends Item {
	public DadItemItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		DadItemRightClickedOnBlockProcedure.execute(context.getLevel());
		return InteractionResult.SUCCESS;
	}
}
