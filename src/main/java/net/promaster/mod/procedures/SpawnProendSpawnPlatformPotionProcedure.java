package net.promaster.mod.procedures;

import net.promaster.mod.VanilishendMod;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collections;

public class SpawnProendSpawnPlatformPotionProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				VanilishendMod.LOGGER.warn("Failed to load dependency world for procedure SpawnProendSpawnPlatformPotion!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				VanilishendMod.LOGGER.warn("Failed to load dependency x for procedure SpawnProendSpawnPlatformPotion!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				VanilishendMod.LOGGER.warn("Failed to load dependency z for procedure SpawnProendSpawnPlatformPotion!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VanilishendMod.LOGGER.warn("Failed to load dependency entity for procedure SpawnProendSpawnPlatformPotion!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("TeleportToVanilishEnd") == 0) {
			entity.getPersistentData().putDouble("TeleportToVanilishEnd", 5);
		} else {
			entity.getPersistentData().putDouble("TeleportToVanilishEnd", (entity.getPersistentData().getDouble("TeleportToVanilishEnd") - 1));
		}
		if (entity.getPersistentData().getDouble("TeleportToVanilishEnd") == 0) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager().getTemplateDefaulted(new ResourceLocation("vanilishend", "new_spawning_platform"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos(-3 + x, 94, -3 + z), new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false), ((World) world).rand);
				}
			}
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate(x, 98, z);
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, 98, z, _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
				}
			}
		}
	}
}
