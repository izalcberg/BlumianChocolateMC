
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.iansjava.init;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.iansjava.BlumianMod;

public class BlumianModPaintings {
	public static void load() {
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BlumianMod.MODID, "credit"), new PaintingVariant(64, 64));
	}
}
