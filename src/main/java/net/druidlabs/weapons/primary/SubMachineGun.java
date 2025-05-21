package net.druidlabs.weapons.primary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponPrimary;
import net.druidlabs.weapons.annotations.SMG;

/**
 * The class for a {@code Sub-machine gun}.
 *
 * @since 1.0
 * @version 2.0
 * @author Andrew Jones
 * */

public final class SubMachineGun extends Weapon {

    private final String gunClass = "Sub-machine gun";

    /**
     * Get an object of this class that holds the data of the given weapon.
     *
     * @param weaponName the name of the submachine gun. Must be a {@link WeaponPrimary} annotated with {@link SMG}.
     * @throws IncorrectWeaponTypeException if the weapon passed in is not a submachine gun.
     * @since 1.0
     * */

    public SubMachineGun(@SMG WeaponPrimary weaponName) {
        super(weaponName);

        checkPrimaryWeaponAnnotation(weaponName, SMG.class, gunClass);
    }

    @Override
    public String getGunClass() {
        return gunClass;
    }
}
