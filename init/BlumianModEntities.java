
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.iansjava.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.iansjava.entity.GymgoerEntity;
import net.mcreator.iansjava.BlumianMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class BlumianModEntities {
	public static EntityType<GymgoerEntity> GYMGOER;

	public static void load() {
		GYMGOER = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(BlumianMod.MODID, "gymgoer"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, GymgoerEntity::new).dimensions(new EntityDimensions(0.6f, 1.95f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		GymgoerEntity.init();
		FabricDefaultAttributeRegistry.register(GYMGOER, GymgoerEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
