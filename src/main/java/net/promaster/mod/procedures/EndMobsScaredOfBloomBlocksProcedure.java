package net.promaster.mod.procedures;

import net.promaster.mod.VanilishendMod;

import net.minecraft.world.IWorld;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class EndMobsScaredOfBloomBlocksProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				VanilishendMod.LOGGER.warn("Failed to load dependency world for procedure EndMobsScaredOfBloomBlocks!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VanilishendMod.LOGGER.warn("Failed to load dependency entity for procedure EndMobsScaredOfBloomBlocks!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EndermanEntity || entity instanceof EndermiteEntity) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		}
	}
}
