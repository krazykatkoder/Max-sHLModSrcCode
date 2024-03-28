package net.mcreator.hl.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class RPGFRAGPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Tastes like Gunpowder and Lead."), false);
	}
}
