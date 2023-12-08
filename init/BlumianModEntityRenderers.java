
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.iansjava.init;

import net.mcreator.iansjava.client.renderer.GymgoerRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class BlumianModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(BlumianModEntities.GYMGOER, GymgoerRenderer::new);
	}
}
