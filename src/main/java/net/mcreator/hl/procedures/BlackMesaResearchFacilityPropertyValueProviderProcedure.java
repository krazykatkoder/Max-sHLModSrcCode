package net.mcreator.hl.procedures;

import net.minecraft.world.entity.Entity;

public class BlackMesaResearchFacilityPropertyValueProviderProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("cascade", "Yes");
	}
}
