package net.druidlabs.weapons.primary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.WeaponPrimary;
import net.druidlabs.weapons.annotations.LMG;

/**
 * The class for a {@code Light Machine Gun}.
 *
 * @author Andrew Jones
 * @version 2.0
 * @since 1.0
 */

public final class LightMachineGun extends PrimaryGun {

    private final String gunClass = "Light machine gun";

    /**
     * Get an object of this class that holds the data of the given weapon.
     *
     * @param weaponName the name of the light machine gun. Must be a {@link WeaponPrimary} annotated with {@link LMG}.
     * @throws IncorrectWeaponTypeException if the weapon passed in is not an LMG.
     * @since 1.0
     */

    public LightMachineGun(@LMG WeaponPrimary weaponName) {
        super(weaponName);

        checkPrimaryWeaponAnnotation(weaponName, LMG.class, gunClass);
    }

    @Override
    public String getGunClass() {
        return gunClass;
    }
}
