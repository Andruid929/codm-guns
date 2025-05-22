package net.druidlabs.weapons.secondary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponSecondary;
import net.druidlabs.weapons.annotations.Launchy;

/**
 * The class for a {@code Launcher}.
 *
 * @since 1.0
 * @version 2.0
 * @author Andrew Jones
 * */

public final class Launcher extends Weapon {

    private final String gunClass = "Launcher";

    /**
     * Get an object of this class that holds the data of the given weapon.
     *
     * @param weapon the name of the launcher. Must be a {@link WeaponSecondary} annotated with {@link Launchy}.
     * @throws IncorrectWeaponTypeException if the weapon passed in is not a launcher.
     * @since 1.0
     * */

    public Launcher(@Launchy WeaponSecondary weapon) {
        super(weapon);

        checkSecondaryWeaponAnnotation(weapon, Launchy.class, gunClass);
    }

    @Override
    public String getFireMechanism() {
        return "Launcher mechanism";
    }

    @Override
    public String getGunClass() {
        return gunClass;
    }
}
