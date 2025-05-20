package net.druidlabs.weapons;

import net.druidlabs.weapons.mastery.NoMasterySystemException;
import net.druidlabs.weapons.primary.*;
import net.druidlabs.weapons.secondary.Launcher;
import net.druidlabs.weapons.secondary.Melee;
import net.druidlabs.weapons.secondary.Pistol;
import net.druidlabs.weapons.secondary.SecondaryWeapon;

/**
 * Class that provides access to the information of each weapon in Call of Duty:Mobile.
 * <p>
 * Cannot be instantiated, instead use the different weapon categories available to create objects.
 *
 * @author Andrew Jones
 * @see AssaultRifle
 * @see SubMachineGun
 * @see LightMachineGun
 * @see Shotgun
 * @see Marksman
 * @see Sniper
 * @see Pistol
 * @see Melee
 * @see Launcher
 * @since 23
 */

public abstract class Weapon {

    protected final String name;
    protected String masteryName;

    protected final int damage;
    protected final int accuracy;
    protected final int fireRate;
    protected final int range;
    protected final int control;
    protected final int mobility;

    protected final FireMechanism fireMechanism;

    /**
     * Access information about the specified weapon
     *
     * @param weapon Either a {@link WeaponPrimary primary weapon} or a {@link WeaponSecondary secondary weapon}
     */

    public Weapon(@PrimaryWeapon @SecondaryWeapon WeaponAttr weapon) {
        this.name = weapon.getName();
        this.damage = weapon.getBaseDamage();
        this.accuracy = weapon.getBaseAccuracy();
        this.fireRate = weapon.getBaseFireRate();
        this.range = weapon.getBaseRange();
        this.control = weapon.getBaseControl();
        this.mobility = weapon.getBaseMobility();
        this.fireMechanism = weapon.getFireMechanism();
    }

    /**
     * If you have accumulated 3,500 or more weapon XP, you have gained access
     * to weapon rename aka mastery unless it's a secondary, of course.
     * You can mark up that weapon here if you'd like
     * <p>
     *
     * @param masteryName Your name for the weapon can be passed in here
     * @see #getMasteryName()
     */

    public void setMasteryName(String masteryName) {
        this.masteryName = masteryName;
    }

    /**
     * Get the actual name of the gun in-game
     */

    public String getName() {
        return name;
    }

    /**
     * Have a unique name for your weapon? Set it up with {@link #setMasteryName(String)}
     * <p>
     *
     * @return Mastery name if any.
     * @throws NoMasterySystemException If you attempt to assign a mastery name to a secondary weapon
     */

    public String getMasteryName() {
        if (masteryName != null) {
            return masteryName;
        }
        return "Not mastered";
    }

    /**
     * @return Weapon's default fire mode
     */

    public String getFireMechanism() {
        return fireMechanism.getMechanism();
    }

    /**
     * @return Weapon's default damage output or shotgun pellet damage
     */

    public String getDamage() {
        return String.valueOf(damage);
    }

    /**
     * @return Weapon's default accuracy
     */

    public int getAccuracy() {
        return accuracy;
    }

    /**
     * @return Weapon's default fire rate
     */

    public int getFireRate() {
        return fireRate;
    }

    /**
     * @return Weapon's default range
     */

    public int getRange() {
        return range;
    }

    /**
     * @return Weapon's default control
     */

    public int getControl() {
        return control;
    }

    /**
     * @return Weapon's default mobility
     */

    public int getMobility() {
        return mobility;
    }

    /**
     * @return Weapon's name and defaults
     */

    public String getInfo() {
        return name
                + "\nDamage: " + getDamage()
                + ", Accuracy: " + getAccuracy()
                + ", Fire rate: " + getFireRate()
                + ", Range: " + getRange()
                + ", Control: " + getControl()
                + ", Mobility: " + getMobility()
                + ", Fire mode: " + getFireMechanism() + "\n";
    }

}
