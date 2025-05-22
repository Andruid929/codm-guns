package net.druidlabs.weapons.primary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponPrimary;
import net.druidlabs.weapons.annotations.Snipes;
import net.druidlabs.weapons.mastery.Mastery;
import net.druidlabs.weapons.mastery.NotMasteredException;

/**
 * The class for a {@code Sniper Rifle}.
 *
 * @author Andrew Jones
 * @version 2.0
 * @since 1.0
 */

public final class Sniper extends PrimaryGun {

    private final String gunClass = "Sniper";

    /**
     * Get an object of this class that holds the data of the given weapon.
     *
     * @param weaponName the name of the sniper rifle. Must be a {@link WeaponPrimary} annotated with {@link Snipes}.
     * @throws IncorrectWeaponTypeException if the weapon passed in is not a sniper.
     * @since 1.0
     */

    public Sniper(@Snipes WeaponPrimary weaponName) {
        super(weaponName);

        checkPrimaryWeaponAnnotation(weaponName, Snipes.class, gunClass);
    }

    @Override
    public String getGunClass() {
        return gunClass;
    }
}
