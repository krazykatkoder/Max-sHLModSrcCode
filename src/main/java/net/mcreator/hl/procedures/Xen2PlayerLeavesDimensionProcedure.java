package net.mcreator.hl.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class Xen2PlayerLeavesDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.SLOW_FALLING);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.JUMP);
	}
}
