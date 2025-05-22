package net.druidlabs.weapons.secondary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponSecondary;
import net.druidlabs.weapons.annotations.Pistola;

/**
 * The class for a {@code Pistol}.
 *
 * @author Andrew Jones
 * @version 2.0
 * @since 1.0
 */

public final class Pistol extends Weapon {

    private final WeaponSecondary weapon;
    private final String gunClass = "Pistol";

    /**
     * Get an object of this class that holds the data of the given weapon.
     *
     * @param weapon the name of the pistol. Must be a {@link WeaponSecondary} annotated with {@link Pistola}.
     * @throws IncorrectWeaponTypeException if the weapon passed in is not a pistol.
     * @since 1.0
     */

    public Pistol(@Pistola WeaponSecondary weapon) {
        super(weapon);
        this.weapon = weapon;

        checkSecondaryWeaponAnnotation(weapon, Pistola.class, gunClass);
    }

    @Override
    public String getDamage() {
        if (weapon.getName().equals("Shorty")) {
            return weapon.getShotgunDamage();
        }

        return String.valueOf(weapon.getBaseDamage());
    }

    @Override
    public String getGunClass() {
        return gunClass;
    }
}
