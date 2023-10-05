package net.promaster.mod.procedures;

import net.promaster.mod.VanilishendMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;

import java.util.Map;
import java.util.Collections;

public class EndPoisonOnEffectActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				VanilishendMod.LOGGER.warn("Failed to load dependency world for procedure EndPoisonOnEffectActiveTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				VanilishendMod.LOGGER.warn("Failed to load dependency x for procedure EndPoisonOnEffectActiveTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				VanilishendMod.LOGGER.warn("Failed to load dependency y for procedure EndPoisonOnEffectActiveTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				VanilishendMod.LOGGER.warn("Failed to load dependency z for procedure EndPoisonOnEffectActiveTick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VanilishendMod.LOGGER.warn("Failed to load dependency entity for procedure EndPoisonOnEffectActiveTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (true) {
			if (entity.getPersistentData().getDouble("DamageEndPoisonDelay") == 0) {
				entity.getPersistentData().putDouble("DamageEndPoisonDelay", 40);
			} else {
				entity.getPersistentData().putDouble("DamageEndPoisonDelay", (entity.getPersistentData().getDouble("DamageEndPoisonDelay") - 1));
			}
			if (entity.getPersistentData().getDouble("DamageEndPoisonDelay") == 0) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
			}
		}
		if (entity.getPersistentData().getDouble("TeleportEndPoisonDelay") == 0) {
			entity.getPersistentData().putDouble("TeleportEndPoisonDelay", 80);
		} else {
			entity.getPersistentData().putDouble("TeleportEndPoisonDelay", (entity.getPersistentData().getDouble("TeleportEndPoisonDelay") - 1));
		}
		if (entity.getPersistentData().getDouble("TeleportEndPoisonDelay") == 0) {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayerEntity) {
						return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
					} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
						NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection().getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
						return _npi != null && _npi.getGameType() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (Math.random() > 0.3) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((x + 3), y, z);
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 3), y, z, _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
						}
					}
				} else if (Math.random() > 0.3) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((x - 3), y, z);
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation((x - 3), y, z, _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
						}
					}
				} else if (Math.random() > 0.3) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate(x, y, (z + 3));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z + 3), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
						}
					}
				} else if (Math.random() > 0.3) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate(x, y, (z - 3));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z - 3), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
						}
					}
				} else if (Math.random() > 0.3) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((x - 3), y, (z - 3));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation((x - 3), y, (z - 3), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
						}
					}
				} else if (Math.random() > 0.3) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((x + 3), y, (z + 3));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 3), y, (z + 3), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
						}
					}
				} else if (Math.random() > 0.3) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((x - 3), y, (z + 3));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation((x - 3), y, (z + 3), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
						}
					}
				} else if (Math.random() > 0.3) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z), (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vanilishend:stepping_on_purpil_pytum")), SoundCategory.NEUTRAL, (float) 1,
								(float) 1);
					} else {
						((World) world).playSound(x, y, z, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vanilishend:stepping_on_purpil_pytum")), SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((x + 3), y, (z - 3));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 3), y, (z - 3), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
						}
					}
				}
			}
		}
	}
}
