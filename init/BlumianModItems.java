/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.iansjava.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.iansjava.item.ChocolateBarItem;
import net.mcreator.iansjava.BlumianMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class BlumianModItems {
	public static Item GYMGOER_SPAWN_EGG;
	public static Item CHOCOLATE_BAR;

	public static void load() {
		GYMGOER_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(BlumianMod.MODID, "gymgoer_spawn_egg"), new SpawnEggItem(BlumianModEntities.GYMGOER, -16777216, -16764109, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(GYMGOER_SPAWN_EGG));
		CHOCOLATE_BAR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(BlumianMod.MODID, "chocolate_bar"), new ChocolateBarItem());
	}

	public static void clientLoad() {
	}
}
