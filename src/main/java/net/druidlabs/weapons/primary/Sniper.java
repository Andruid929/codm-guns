package net.druidlabs.weapons.primary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponPrimary;
import net.druidlabs.weapons.annotations.Snipes;

/**
 * The class for a {@code Sniper Rifle}.
 *
 * @since 1.0
 * @version 2.0
 * @author Andrew Jones
 * */

public final class Sniper extends Weapon {

    private final String gunClass = "Sniper";

    /**
     * Get an object of this class that holds the data of the given weapon.
     *
     * @param weaponName the name of the sniper rifle. Must be a {@link WeaponPrimary} annotated with {@link Snipes}.
     * @throws IncorrectWeaponTypeException if the weapon passed in is not a sniper.
     * @since 1.0
     * */

    public Sniper(@Snipes WeaponPrimary weaponName) {
        super(weaponName);

        checkPrimaryWeaponAnnotation(weaponName, Snipes.class, gunClass);
    }

    @Override
    public String getGunClass() {
        return gunClass;
    }
}
