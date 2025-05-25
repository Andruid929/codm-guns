package net.druidlabs.weapons;

import net.druidlabs.weapons.annotations.Shotty;

/**
 * This interface outlines what methods every {@link Weapon} object should have.
 *
 * @author Andrew Jones
 * @version 1.0
 * @since 1.0
 */

public interface WeaponAttr {

    /**
     * Get the name of the current weapon.
     *
     * @return name literal of this weapon.
     * @since 1.0
     */

    String getName();

    /**
     * Get the shotgun's damage value.
     *
     * @return the damage per pellet multiplied by the number of pellets.
     * @since 1.0
     */

    @Shotty
    String getShotgunDamage();

    /**
     * The amount of damage each bullet does.
     *
     * @return the base weapon damage.
     * @since 1.0
     */

    int getBaseDamage();

    /**
     * How fast the weapon fires.
     *
     * @return the base weapon damage.
     * @since 1.0
     */

    int getBaseFireRate();

    /**
     * The amount of damage each bullet does.
     *
     * @return the base weapon damage.
     * @since 1.0
     */

    int getBaseAccuracy();


    /**
     * The speed of moving when this weapon is in hand.
     *
     * @return the base mobility of this weapon.
     * @since 1.0
     */

    int getBaseMobility();

    /**
     * How far out the weapon maintains damage.
     *
     * @return the base range of this weapon.
     * @since 1.0
     */

    int getBaseRange();

    /**
     * This is the measure of how much recoil the weapon has.
     *
     * @return the base control of this weapon.
     * @since 1.0
     */

    int getBaseControl();


    /**
     * This how bullets are fired from the gun.
     *
     * @return the default fire mechanism of this weapon.
     * @see FireMechanism
     * @since 1.0
     */

    FireMechanism getFireMechanism();

}
