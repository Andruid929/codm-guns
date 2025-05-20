package net.druidlabs.weapons.primary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponPrimary;
import net.druidlabs.weapons.annotations.Marksmen;

/**
 * The class for a {@code Marksman rifle}.
 *
 * @since 1.0
 * @version 2.0
 * @author Andrew Jones
 * */

public class Marksman extends Weapon {

    private final String gunClass = "Marksman";

    /**
     * Get an object of this class that holds the data of the given weapon.
     *
     * @param weaponName the name of the marksman rifle. Must be a {@link WeaponPrimary} annotated with {@link Marksmen}.
     * @throws IncorrectWeaponTypeException if the weapon passed in is not a Marksman Rifle.
     * @since 1.0
     * */

    public Marksman(@Marksmen WeaponPrimary weaponName) {
        super(weaponName);

        checkPrimaryWeaponAnnotation(weaponName, Marksmen.class, gunClass);
    }

    @Override
    public String getGunClass() {
        return gunClass;
    }
}
