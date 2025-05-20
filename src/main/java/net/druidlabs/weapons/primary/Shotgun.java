package net.druidlabs.weapons.primary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponPrimary;
import net.druidlabs.weapons.annotations.Shotty;

public class Shotgun extends Weapon {

    private WeaponPrimary weapon;

    private final String gunClass = "Shotgun";

    public Shotgun(@Shotty WeaponPrimary weaponName) {
        super(weaponName);

        this.weapon = weaponName;
        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(Shotty.class)) {
                throw new IncorrectWeaponTypeException(gunClass, weaponName);
            }
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public String getDamage() {
        return weapon.getShotgunDamage();
    }
}
