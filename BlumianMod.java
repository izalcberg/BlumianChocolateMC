/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.iansjava;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.iansjava.init.BlumianModProcedures;
import net.mcreator.iansjava.init.BlumianModPaintings;
import net.mcreator.iansjava.init.BlumianModMobEffects;
import net.mcreator.iansjava.init.BlumianModItems;
import net.mcreator.iansjava.init.BlumianModEntities;

import net.fabricmc.api.ModInitializer;

public class BlumianMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "blumian";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing BlumianMod");

		BlumianModMobEffects.load();

		BlumianModEntities.load();

		BlumianModItems.load();

		BlumianModPaintings.load();
		BlumianModProcedures.load();

	}
}
