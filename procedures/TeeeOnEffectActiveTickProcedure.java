package net.mcreator.iansjava.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class TeeeOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ())).canOcclude()) {
			world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.REDSTONE_WIRE.defaultBlockState(), 3);
		}
	}
}
