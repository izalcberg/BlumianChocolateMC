
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.iansjava.init;

import net.mcreator.iansjava.procedures.TeeeOnEffectActiveTickProcedure;
import net.mcreator.iansjava.procedures.ChocolateBarPlayerFinishesUsingItemProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class BlumianModProcedures {
	public static void load() {
		new TeeeOnEffectActiveTickProcedure();
		new ChocolateBarPlayerFinishesUsingItemProcedure();
	}
}
