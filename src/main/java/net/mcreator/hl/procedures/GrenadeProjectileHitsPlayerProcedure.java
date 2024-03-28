package net.mcreator.hl.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import net.mcreator.hl.HlmodMod;

public class GrenadeProjectileHitsPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		HlmodMod.queueServerWork(100, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.TNT);
		});
	}
}
