package net.druidlabs.weapons;

import net.druidlabs.weapons.annotations.AR;

/**
 * Thrown when the argument of a {@link Weapon} constructor does not
 * match the type of weapon the object.
 * <p>
 * For example {@code new Sniper(WeaponPrimary.AK117)} will throw this exception as
 * {@code WeaponPrimary.AK117} is annotated with {@link AR} meaning it can only
 * be used as an argument of {@code AssaultRifle}.
 *
 * @author Andrew Jones
 * @since 1.0
 * @version 1.0
 * */

public class IncorrectWeaponTypeException extends RuntimeException {

    /**
     * The weapon class of the incorrect weapon type.
     *
     * @since 1.0
     * */

    private final String gunClass;

    /**
     * The weapon object.
     *
     * @since 1.0
     * */
    private final WeaponAttr weaponAttr;

    /**
     * Throw a new exception with the stacktrace showing which weapon
     * was passed as the wrong weapon class.
     *
     * @param gunClass the class of the expected weapon.
     * @param weaponAttr the actual weapon object passed in.
     * @since 1.0
     * */

    public IncorrectWeaponTypeException(String gunClass, WeaponAttr weaponAttr) {
        this.gunClass = gunClass;
        this.weaponAttr = weaponAttr;
    }

    @Override
    public String getMessage() {
        if (gunClass.equals("Assault rifle")) {
            return weaponAttr.getName() + " is not an " + gunClass.toLowerCase();
        }

        return weaponAttr.getName() + " is not a " + gunClass.toLowerCase();
    }
}
