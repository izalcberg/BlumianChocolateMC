
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.iansjava.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.iansjava.potion.TeeeMobEffect;
import net.mcreator.iansjava.BlumianMod;

public class BlumianModMobEffects {
	public static MobEffect TEEE;

	public static void load() {
		TEEE = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(BlumianMod.MODID, "teee"), new TeeeMobEffect());
	}
}
