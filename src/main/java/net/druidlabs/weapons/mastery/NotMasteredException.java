package net.druidlabs.weapons.mastery;

import net.druidlabs.weapons.Weapon;

public class NotMasteredException extends NullPointerException {

    private final Weapon weapon;

    public NotMasteredException(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getMessage() {
        return weapon.getName() + " is not mastered; has no mastery name.";
    }
}
