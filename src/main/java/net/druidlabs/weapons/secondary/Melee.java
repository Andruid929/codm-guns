package net.druidlabs.weapons.secondary;

import net.druidlabs.weapons.IncorrectWeaponTypeException;
import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponSecondary;
import net.druidlabs.weapons.annotations.Meleeee;
import net.druidlabs.weapons.mastery.NoMasterySystemException;

/**
 * The class for a {@code Melee weapon}.
 *
 * @since 1.0
 * @version 2.0
 * @author Andrew Jones
 * */

public class Melee extends Weapon {

    private final String gunClass = "Melee";

    /**
     * Get an object of this class that holds the data of the given weapon.
     *
     * @param weapon the name of the melee. Must be a {@link WeaponSecondary} annotated with {@link Meleeee}.
     * @throws IncorrectWeaponTypeException if the weapon passed in is not a melee.
     * @since 1.0
     * */

    public Melee(@Meleeee WeaponSecondary weapon) {
        super(weapon);

        checkSecondaryWeaponAnnotation(weapon, Meleeee.class, gunClass);
    }

    @Override
    public void setMasteryName(String masteryName) {
        throw new NoMasterySystemException();
    }

    @Override
    public String getMasteryName() {
        throw new NoMasterySystemException();
    }

    @Override
    public String getFireMechanism() {
        return "Swinging";
    }

    @Override
    public String getGunClass() {
        return gunClass;
    }
}
