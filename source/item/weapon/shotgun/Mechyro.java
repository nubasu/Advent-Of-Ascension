package net.tslat.aoa3.item.weapon.shotgun;

import net.minecraft.util.SoundEvent;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.item.weapon.AdventWeapon;

import javax.annotation.Nullable;

public class Mechyro extends BaseShotgun {
	public Mechyro(final double dmg, final int pellets, final int durability, final int fireDelayTicks, final float knockbackFactor, final float recoil) {
		super(dmg, pellets, durability, fireDelayTicks, knockbackFactor, recoil);
		setTranslationKey("Mechyro");
		setRegistryName("aoa3:mechyro");
	}

	@Nullable
	@Override
	public SoundEvent getFiringSound() {
		return SoundsRegister.gunRevolver;
	}
}
