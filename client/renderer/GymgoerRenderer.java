package net.mcreator.iansjava.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.iansjava.entity.GymgoerEntity;

public class GymgoerRenderer extends MobRenderer<GymgoerEntity, VillagerModel<GymgoerEntity>> {
	public GymgoerRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel<>(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GymgoerEntity entity) {
		return new ResourceLocation("blumian:textures/entities/zombie-villager-planetminecraft-com-13779032.png");
	}
}
