
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.hl.entity.TauCannonEntity;
import net.mcreator.hl.entity.Spas12Entity;
import net.mcreator.hl.entity.SnarkEntity;
import net.mcreator.hl.entity.RocketLauncherEntity;
import net.mcreator.hl.entity.RPGFRAGMODEntity;
import net.mcreator.hl.entity.NineMMPistolEntity;
import net.mcreator.hl.entity.Mp5Entity;
import net.mcreator.hl.entity.MagnumRevolverEntity;
import net.mcreator.hl.entity.M203SteelSlugModEntity;
import net.mcreator.hl.entity.M203GrenadeEntity;
import net.mcreator.hl.entity.M203BuckShotModEntity;
import net.mcreator.hl.entity.HIVEHANDEntity;
import net.mcreator.hl.entity.GrenadeEntity;
import net.mcreator.hl.entity.GluonGunEntity;
import net.mcreator.hl.entity.FragNadeEntity;
import net.mcreator.hl.entity.CrossbowEntity;
import net.mcreator.hl.HlmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HlmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HlmodMod.MODID);
	public static final RegistryObject<EntityType<Spas12Entity>> SPAS_12 = register("projectile_spas_12",
			EntityType.Builder.<Spas12Entity>of(Spas12Entity::new, MobCategory.MISC).setCustomClientFactory(Spas12Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Mp5Entity>> MP_5 = register("projectile_mp_5",
			EntityType.Builder.<Mp5Entity>of(Mp5Entity::new, MobCategory.MISC).setCustomClientFactory(Mp5Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TauCannonEntity>> TAU_CANNON = register("projectile_tau_cannon",
			EntityType.Builder.<TauCannonEntity>of(TauCannonEntity::new, MobCategory.MISC).setCustomClientFactory(TauCannonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<M203GrenadeEntity>> M_203_GRENADE = register("projectile_m_203_grenade",
			EntityType.Builder.<M203GrenadeEntity>of(M203GrenadeEntity::new, MobCategory.MISC).setCustomClientFactory(M203GrenadeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<M203BuckShotModEntity>> M_203_BUCK_SHOT_MOD = register("projectile_m_203_buck_shot_mod", EntityType.Builder.<M203BuckShotModEntity>of(M203BuckShotModEntity::new, MobCategory.MISC)
			.setCustomClientFactory(M203BuckShotModEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<M203SteelSlugModEntity>> M_203_STEEL_SLUG_MOD = register("projectile_m_203_steel_slug_mod", EntityType.Builder.<M203SteelSlugModEntity>of(M203SteelSlugModEntity::new, MobCategory.MISC)
			.setCustomClientFactory(M203SteelSlugModEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GluonGunEntity>> GLUON_GUN = register("projectile_gluon_gun",
			EntityType.Builder.<GluonGunEntity>of(GluonGunEntity::new, MobCategory.MISC).setCustomClientFactory(GluonGunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NineMMPistolEntity>> NINE_MM_PISTOL = register("projectile_nine_mm_pistol",
			EntityType.Builder.<NineMMPistolEntity>of(NineMMPistolEntity::new, MobCategory.MISC).setCustomClientFactory(NineMMPistolEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HIVEHANDEntity>> HIVEHAND = register("projectile_hivehand",
			EntityType.Builder.<HIVEHANDEntity>of(HIVEHANDEntity::new, MobCategory.MISC).setCustomClientFactory(HIVEHANDEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MagnumRevolverEntity>> MAGNUM_REVOLVER = register("projectile_magnum_revolver",
			EntityType.Builder.<MagnumRevolverEntity>of(MagnumRevolverEntity::new, MobCategory.MISC).setCustomClientFactory(MagnumRevolverEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RocketLauncherEntity>> ROCKET_LAUNCHER = register("projectile_rocket_launcher",
			EntityType.Builder.<RocketLauncherEntity>of(RocketLauncherEntity::new, MobCategory.MISC).setCustomClientFactory(RocketLauncherEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RPGFRAGMODEntity>> RPGFRAGMOD = register("projectile_rpgfragmod",
			EntityType.Builder.<RPGFRAGMODEntity>of(RPGFRAGMODEntity::new, MobCategory.MISC).setCustomClientFactory(RPGFRAGMODEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GrenadeEntity>> GRENADE = register("projectile_grenade",
			EntityType.Builder.<GrenadeEntity>of(GrenadeEntity::new, MobCategory.MISC).setCustomClientFactory(GrenadeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SnarkEntity>> SNARK = register("projectile_snark",
			EntityType.Builder.<SnarkEntity>of(SnarkEntity::new, MobCategory.MISC).setCustomClientFactory(SnarkEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrossbowEntity>> CROSSBOW = register("projectile_crossbow",
			EntityType.Builder.<CrossbowEntity>of(CrossbowEntity::new, MobCategory.MISC).setCustomClientFactory(CrossbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FragNadeEntity>> FRAG_NADE = register("projectile_frag_nade",
			EntityType.Builder.<FragNadeEntity>of(FragNadeEntity::new, MobCategory.MISC).setCustomClientFactory(FragNadeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
