
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.hl.block.XeniumIdiodeBlock;
import net.mcreator.hl.block.XenianmassBlock;
import net.mcreator.hl.block.XenianPocketDimensionPortalBlock;
import net.mcreator.hl.block.XengrassBlock;
import net.mcreator.hl.block.XenCrystalBlock;
import net.mcreator.hl.block.Xen2PortalBlock;
import net.mcreator.hl.block.W33WarheadBlock;
import net.mcreator.hl.block.U235blockBlock;
import net.mcreator.hl.block.SatchelBlock;
import net.mcreator.hl.block.Pu239Block;
import net.mcreator.hl.HlmodMod;

public class HlmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HlmodMod.MODID);
	public static final RegistryObject<Block> XEN_2_PORTAL = REGISTRY.register("xen_2_portal", () -> new Xen2PortalBlock());
	public static final RegistryObject<Block> XENGRASS = REGISTRY.register("xengrass", () -> new XengrassBlock());
	public static final RegistryObject<Block> XEN_CRYSTAL = REGISTRY.register("xen_crystal", () -> new XenCrystalBlock());
	public static final RegistryObject<Block> W_33_WARHEAD = REGISTRY.register("w_33_warhead", () -> new W33WarheadBlock());
	public static final RegistryObject<Block> XENIANMASS = REGISTRY.register("xenianmass", () -> new XenianmassBlock());
	public static final RegistryObject<Block> U_235BLOCK = REGISTRY.register("u_235block", () -> new U235blockBlock());
	public static final RegistryObject<Block> PU_239 = REGISTRY.register("pu_239", () -> new Pu239Block());
	public static final RegistryObject<Block> XENIAN_POCKET_DIMENSION_PORTAL = REGISTRY.register("xenian_pocket_dimension_portal", () -> new XenianPocketDimensionPortalBlock());
	public static final RegistryObject<Block> XENIUM_IDIODE = REGISTRY.register("xenium_idiode", () -> new XeniumIdiodeBlock());
	public static final RegistryObject<Block> SATCHEL = REGISTRY.register("satchel", () -> new SatchelBlock());
}
