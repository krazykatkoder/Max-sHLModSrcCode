
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.hl.HlmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HlmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HlmodMod.MODID);
	public static final RegistryObject<CreativeModeTab> HL = REGISTRY.register("hl",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hlmod.hl")).icon(() -> new ItemStack(HlmodModItems.HEV_ARMOR_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HlmodModItems.XEN.get());
				tabData.accept(HlmodModItems.HEV_ARMOR_HELMET.get());
				tabData.accept(HlmodModItems.HEV_ARMOR_CHESTPLATE.get());
				tabData.accept(HlmodModItems.HEV_ARMOR_LEGGINGS.get());
				tabData.accept(HlmodModItems.HEV_ARMOR_BOOTS.get());
				tabData.accept(HlmodModItems.APOTHEIOSIS.get());
				tabData.accept(HlmodModItems.XEN_2.get());
				tabData.accept(HlmodModBlocks.XENGRASS.get().asItem());
				tabData.accept(HlmodModBlocks.XEN_CRYSTAL.get().asItem());
				tabData.accept(HlmodModItems.PCV_VEST_HELMET.get());
				tabData.accept(HlmodModItems.PCV_VEST_CHESTPLATE.get());
				tabData.accept(HlmodModItems.PCV_VEST_LEGGINGS.get());
				tabData.accept(HlmodModItems.PCV_VEST_BOOTS.get());
				tabData.accept(HlmodModItems.SUITBATTERY.get());
				tabData.accept(HlmodModItems.IMPROB.get());
				tabData.accept(HlmodModItems.KEVLAR_ARMOR_HELMET.get());
				tabData.accept(HlmodModItems.KEVLAR_ARMOR_CHESTPLATE.get());
				tabData.accept(HlmodModItems.KEVLAR_ARMOR_LEGGINGS.get());
				tabData.accept(HlmodModItems.KEVLAR_ARMOR_BOOTS.get());
				tabData.accept(HlmodModItems.XENIAN_POCKET_DIMENSION.get());
				tabData.accept(HlmodModItems.COFFEE.get());
				tabData.accept(HlmodModItems.SPACE_COFFEE.get());
				tabData.accept(HlmodModBlocks.XENIUM_IDIODE.get().asItem());
				tabData.accept(HlmodModBlocks.SATCHEL.get().asItem());
				tabData.accept(HlmodModItems.IHATEYOU_DISC.get());
				tabData.accept(HlmodModItems.XEN_INSTDISC.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> HL_INGREDIENTS = REGISTRY.register("hl_ingredients",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hlmod.hl_ingredients")).icon(() -> new ItemStack(HlmodModItems.MP_5CASING.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HlmodModItems.BUCKSHOT.get());
				tabData.accept(HlmodModItems.SHOTGUN_SHELL_EMPTY.get());
				tabData.accept(HlmodModItems.PLASTIC.get());
				tabData.accept(HlmodModItems.LASER.get());
				tabData.accept(HlmodModItems.COIL.get());
				tabData.accept(HlmodModItems.BATTERY.get());
				tabData.accept(HlmodModItems.BLACKPLASTIC.get());
				tabData.accept(HlmodModItems.BULLET.get());
				tabData.accept(HlmodModItems.MP_5CASING.get());
				tabData.accept(HlmodModItems.URANIUMINGOT.get());
				tabData.accept(HlmodModItems.NEUTRONIUM.get());
				tabData.accept(HlmodModBlocks.U_235BLOCK.get().asItem());
				tabData.accept(HlmodModBlocks.PU_239.get().asItem());
				tabData.accept(HlmodModItems.PU_256_INGOT.get());
				tabData.accept(HlmodModItems.U_235_NUGGET.get());
				tabData.accept(HlmodModItems.URANIUM_BOX.get());
				tabData.accept(HlmodModItems.XEN_CRYSTAL_SHARD.get());
				tabData.accept(HlmodModItems.GRENADE_TEXURE.get());
				tabData.accept(HlmodModItems.HE_SHELL.get());
				tabData.accept(HlmodModItems.BUCK_SHOT_SHELL.get());
				tabData.accept(HlmodModItems.STEELSLUG_SHELL.get());
				tabData.accept(HlmodModItems.NUKE_CORE.get());
				tabData.accept(HlmodModItems.MAGNUM_CASING.get());
				tabData.accept(HlmodModItems.MAGNUM_BULLET.get());
				tabData.accept(HlmodModItems.STEEL_M_IX.get());
				tabData.accept(HlmodModItems.STEEL_INGOT.get());
				tabData.accept(HlmodModItems.CUP.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> HL_WEAPONS = REGISTRY.register("hl_weapons",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hlmod.hl_weapons")).icon(() -> new ItemStack(HlmodModItems.CROWBAR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HlmodModBlocks.W_33_WARHEAD.get().asItem());
				tabData.accept(HlmodModItems.CROWBAR.get());
				tabData.accept(HlmodModItems.SPAS_12.get());
				tabData.accept(HlmodModItems.MP_5.get());
				tabData.accept(HlmodModItems.TAU_CANNON.get());
				tabData.accept(HlmodModItems.M_203_GRENADE.get());
				tabData.accept(HlmodModItems.M_203_BUCK_SHOT_MOD.get());
				tabData.accept(HlmodModItems.M_203_STEEL_SLUG_MOD.get());
				tabData.accept(HlmodModItems.GLUON_GUN.get());
				tabData.accept(HlmodModItems.NINE_MM_PISTOL.get());
				tabData.accept(HlmodModItems.HIVEHAND.get());
				tabData.accept(HlmodModItems.MAGNUM_REVOLVER.get());
				tabData.accept(HlmodModItems.ROCKET_LAUNCHER.get());
				tabData.accept(HlmodModItems.RPGFRAGMOD.get());
				tabData.accept(HlmodModItems.SHOTGUN_SHELL_FULL.get());
				tabData.accept(HlmodModItems.MP_5_BULLET.get());
				tabData.accept(HlmodModItems.MAGNUM_CARTRIDGE.get());
				tabData.accept(HlmodModItems.RPGROCKET.get());
				tabData.accept(HlmodModItems.RPGFRAG.get());
				tabData.accept(HlmodModItems.M_203_GRENADE_AMMO.get());
				tabData.accept(HlmodModItems.M_203_BUCK_SHOT.get());
				tabData.accept(HlmodModItems.M_203_STEEL_SLUG.get());
				tabData.accept(HlmodModItems.GRENADE.get());
				tabData.accept(HlmodModItems.SNARK.get());
				tabData.accept(HlmodModItems.TRANQUILIZER_DART.get());
				tabData.accept(HlmodModItems.CROSSBOW.get());
				tabData.accept(HlmodModItems.DETONATOR.get());
				tabData.accept(HlmodModItems.FRAG_NADE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(HlmodModBlocks.XENIANMASS.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(HlmodModItems.BOOM_BOX.get());
		}
	}
}
