package net.mcreator.hl.procedures;

import net.minecraft.world.level.LevelAccessor;

public class DetonatorRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		SatchelRedstoneOnProcedure.execute(world, x, y, z);
	}
}
