
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.hl.enchantment.ResonanceEnchantment;
import net.mcreator.hl.HlmodMod;

public class HlmodModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, HlmodMod.MODID);
	public static final RegistryObject<Enchantment> RESONANCE = REGISTRY.register("resonance", () -> new ResonanceEnchantment());
}
