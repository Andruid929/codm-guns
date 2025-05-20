package net.druidlabs.weapons.primary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponPrimary;
import net.druidlabs.weapons.annotations.Shotty;

/**
 * The class for a {@code Shotgun}.
 *
 * @since 1.0
 * @version 2.0
 * @author Andrew Jones
 * */

public class Shotgun extends Weapon {

    private final WeaponPrimary weapon;

    private final String gunClass = "Shotgun";

    /**
     * Get an object of this class that holds the data of the given weapon.
     *
     * @param weaponName the name of the shotgun. Must be a {@link WeaponPrimary} annotated with {@link Shotgun}.
     * @throws IncorrectWeaponTypeException if the weapon passed in is not an Assault Rifle.
     * @since 1.0
     * */

    public Shotgun(@Shotty WeaponPrimary weaponName) {
        super(weaponName);

        this.weapon = weaponName;
        checkPrimaryWeaponAnnotation(weaponName, Shotty.class, gunClass);

    }

    @Override
    public String getDamage() {
        return weapon.getShotgunDamage();
    }

    @Override
    public String getGunClass() {
        return gunClass;
    }
}
