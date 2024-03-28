
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hl.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HlmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HlmodModEntities.SPAS_12.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.MP_5.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.TAU_CANNON.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.M_203_GRENADE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.M_203_BUCK_SHOT_MOD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.M_203_STEEL_SLUG_MOD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.GLUON_GUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.NINE_MM_PISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.HIVEHAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.MAGNUM_REVOLVER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.ROCKET_LAUNCHER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.RPGFRAGMOD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.GRENADE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.SNARK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.CROSSBOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HlmodModEntities.FRAG_NADE.get(), ThrownItemRenderer::new);
	}
}
