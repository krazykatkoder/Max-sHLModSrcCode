package net.mcreator.hl.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;

public class W33WarheadOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Tastes like Radiation poisioning and concrete."), false);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 75, Level.ExplosionInteraction.TNT);
	}
}
