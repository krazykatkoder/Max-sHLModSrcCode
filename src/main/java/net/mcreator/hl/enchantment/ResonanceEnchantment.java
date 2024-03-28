
package net.mcreator.hl.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

public class ResonanceEnchantment extends Enchantment {
	public ResonanceEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMinLevel() {
		return 30;
	}

	@Override
	public int getMaxLevel() {
		return 999;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 25;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
