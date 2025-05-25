package net.druidlabs.weapons.mastery;

import net.druidlabs.weapons.Weapon;

/**
 * Thrown when a weapon's mastery name is blank or equals {@code MasteryCollection.NOT_MASTERED}.
 *
 * @author Andrew Jones
 * @since 2.0
 */

public class NotMasteredException extends NullPointerException {

    private final Weapon weapon;

    /**
     * Throw this exception specifying which weapon is not mastered.
     * @param weapon the weapon that is not mastered.
     * */

    public NotMasteredException(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getMessage() {
        return weapon.getName() + " is not mastered; has no mastery name.";
    }
}
