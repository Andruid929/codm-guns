package net.druidlabs.weapons.primary;

import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponAttr;
import net.druidlabs.weapons.WeaponPrimary;
import net.druidlabs.weapons.mastery.Mastery;
import net.druidlabs.weapons.mastery.NotMasteredException;

/**
 * This class is the parent class to the primary weapons only,
 * it takes all the qualities and fields of the {@link Weapon} class
 * and also adds the mastery system which the Weapon class does not have.
 * This was done to deny secondary weapons the mastery system.
 *
 * @author Andrew Jones
 * @version 1.0
 * @see Weapon
 * @see AssaultRifle
 * @see Sniper
 * @see LightMachineGun
 * @see SubMachineGun
 * @see Marksman
 * @see Shotgun
 * @since 2.0
 */

public abstract class PrimaryGun extends Weapon implements Mastery {

    /**
     * The custom name assigned to this weapon
     *
     * @since 2.0
     */

    private String masteryName;

    /**
     * Whether this weapon is mastered or not.
     * @since 2.0
     * */

    private boolean isMastered;

    /**
     * New instance of this with specified weapon attributes.
     *
     * @param weapon the weapon whose attributes to be taken.
     * @since 2.0
     * */

    public PrimaryGun(WeaponPrimary weapon) {
        super(weapon);
        isMastered = false;
    }

    @Override
    public void setMasteryName(String masteryName) {
        this.masteryName = masteryName;
        isMastered = true;
    }

    @Override
    public String getMasteryName() {
        if (masteryName == null) {
            throw new NotMasteredException(this);
        }
        return masteryName;
    }

    @Override
    public void clearMasteryName() {
        if (isMastered) {
            masteryName = Mastery.NOT_NAMED;
        }
    }
}
