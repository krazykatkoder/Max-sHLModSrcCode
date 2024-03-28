
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.hl.world.features.ores.XenianmassFeature;
import net.mcreator.hl.world.features.ores.XenCrystalFeature;
import net.mcreator.hl.world.features.RuinedlabFeature;
import net.mcreator.hl.world.features.AmsFeature;
import net.mcreator.hl.HlmodMod;

@Mod.EventBusSubscriber
public class HlmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, HlmodMod.MODID);
	public static final RegistryObject<Feature<?>> XEN_CRYSTAL = REGISTRY.register("xen_crystal", XenCrystalFeature::new);
	public static final RegistryObject<Feature<?>> XENIANMASS = REGISTRY.register("xenianmass", XenianmassFeature::new);
	public static final RegistryObject<Feature<?>> RUINEDLAB = REGISTRY.register("ruinedlab", RuinedlabFeature::new);
	public static final RegistryObject<Feature<?>> AMS = REGISTRY.register("ams", AmsFeature::new);
}
