package net.druidlabs.weapons.primary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponPrimary;
import net.druidlabs.weapons.annotations.AR;

/**
 * The class for an {@code Assault rifle}.
 *
 * @since 1.0
 * @version 2.0
 * @author Andrew Jones
 * */

public final class AssaultRifle extends Weapon {

    private final String gunClass = "Assault rifle";

    /**
     * Get an object of this class that holds the data of the given weapon.
     *
     * @param weaponName the name of the assault rifle. Must be a {@link WeaponPrimary} annotated with {@link AR}.
     * @throws IncorrectWeaponTypeException if the weapon passed in is not an Assault Rifle.
     * @since 1.0
     * */

    public AssaultRifle(@AR WeaponPrimary weaponName) {
        super(weaponName);

        checkPrimaryWeaponAnnotation(weaponName, AR.class, gunClass);
    }

    @Override
    public String getGunClass() {
        return gunClass;
    }
}
