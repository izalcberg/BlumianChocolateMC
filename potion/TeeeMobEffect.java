
package net.mcreator.iansjava.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.iansjava.procedures.TeeeOnEffectActiveTickProcedure;

public class TeeeMobEffect extends MobEffect {
	public TeeeMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3407821);
	}

	@Override
	public String getDescriptionId() {
		return "effect.blumian.teee";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TeeeOnEffectActiveTickProcedure.execute(world, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
