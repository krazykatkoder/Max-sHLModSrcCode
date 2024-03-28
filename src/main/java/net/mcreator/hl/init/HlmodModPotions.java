
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.hl.HlmodMod;

public class HlmodModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, HlmodMod.MODID);
	public static final RegistryObject<Potion> FIRSTAID = REGISTRY.register("firstaid",
			() -> new Potion(new MobEffectInstance(MobEffects.HEAL, 3600, 255, false, true), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 100, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.JUMP, 3600, 5, false, true), new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 1, false, true), new MobEffectInstance(MobEffects.REGENERATION, 3600, 10, false, true),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 255, false, true), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 1, false, true), new MobEffectInstance(MobEffects.SLOW_FALLING, 3600, 1, false, true),
					new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 255, false, true), new MobEffectInstance(MobEffects.CONDUIT_POWER, 3600, 255, false, true), new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 5, false, true),
					new MobEffectInstance(MobEffects.ABSORPTION, 3600, 255, false, true), new MobEffectInstance(MobEffects.SATURATION, 3600, 255, false, true)));
}
