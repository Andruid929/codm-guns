package net.druidlabs.weapons.primary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponPrimary;
import net.druidlabs.weapons.annotations.LMG;

/**
 * The class for a {@code Light Machine Gun}.
 *
 * @since 1.0
 * @version 2.0
 * @author Andrew Jones
 * */

public final class LightMachineGun extends Weapon {

    private final String gunClass = "Light machine gun";

    /**
     * Get an object of this class that holds the data of the given weapon.
     *
     * @param weaponName the name of the light machine gun. Must be a {@link WeaponPrimary} annotated with {@link LMG}.
     * @throws IncorrectWeaponTypeException if the weapon passed in is not an LMG.
     * @since 1.0
     * */

    public LightMachineGun(@LMG WeaponPrimary weaponName) {
        super(weaponName);

        checkPrimaryWeaponAnnotation(weaponName, LMG.class, gunClass);
    }

    @Override
    public String getGunClass() {
        return gunClass;
    }
}
