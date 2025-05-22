package net.druidlabs.weapons;

import net.druidlabs.weapons.primary.*;
import net.druidlabs.weapons.secondary.Launcher;
import net.druidlabs.weapons.secondary.Melee;
import net.druidlabs.weapons.secondary.Pistol;
import net.druidlabs.weapons.secondary.SecondaryWeapon;

import java.lang.annotation.Annotation;

/**
 * Abstract class that provides access to the information of each weapon in Call of Duty Mobile.
 *
 * <p>This is the parent class to all the weapon classes.
 *
 * @author Andrew Jones
 * @version 1.0
 * @see PrimaryGun
 * @see AssaultRifle
 * @see SubMachineGun
 * @see LightMachineGun
 * @see Shotgun
 * @see Marksman
 * @see Sniper
 * @see Pistol
 * @see Melee
 * @see Launcher
 * @since 1.0
 */

public abstract class Weapon {

    /**
     * The name of the weapon.
     *
     * @since 1.0
     */

    protected final String name;

    /**
     * The weapon's base damage.
     *
     * @since 1.0
     */

    protected final int damage;

    /**
     * The weapon's base accuracy.
     *
     * @since 1.0
     */

    protected final int accuracy;

    /**
     * The weapon's base fire rate.
     *
     * @since 1.0
     */

    protected final int fireRate;

    /**
     * The weapon's base range.
     *
     * @since 1.0
     */

    protected final int range;

    /**
     * The weapon's base control.
     *
     * @since 1.0
     */

    protected final int control;

    /**
     * The weapon's base mobility.
     *
     * @since 1.0
     */

    protected final int mobility;

    /**
     * The weapon's default firing mechanism.
     *
     * @since 1.0
     */

    protected final FireMechanism fireMechanism;

    /**
     * Create a new weapon object taking in all the attributes of the argument.
     * <p>If you want a primary weapon object, use {@link PrimaryGun} for the declaration
     * because that object will support the mastery system.
     *
     * @param weapon either a {@link WeaponPrimary primary weapon} or a {@link WeaponSecondary secondary weapon}.
     * @since 1.0
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
     * The name of the weapon as defined in {@code WeaponPrimary}.
     *
     * @return the actual name of the gun in-game.
     * @since 1.0
     */

    public String getName() {
        return name;
    }

    /**
     * This is how the bullets are fired.
     *
     * @return weapon's default fire mode.
     * @since 1.0
     */

    public String getFireMechanism() {
        return fireMechanism.getMechanism();
    }

    /**
     * This returns how much damage each bullet does without body part multipliers.
     *
     * @return weapon's default damage output or shotgun pellet damage.
     * @since 1.0
     */

    public String getDamage() {
        return String.valueOf(damage);
    }

    /**
     * This is a measure of a gun's bullet spread accuracy.
     *
     * @return weapon's default accuracy.
     * @since 1.0
     */

    public int getAccuracy() {
        return accuracy;
    }

    /**
     * This is a measure of how fast bullets are ejected from the barrel.
     *
     * @return weapon's default fire rate.
     * @since 1.0
     */

    public int getFireRate() {
        return fireRate;
    }

    /**
     * This is how far out a bullet can maintain its damage.
     *
     * @return weapon's default range.
     * @since 1.0
     */

    public int getRange() {
        return range;
    }

    /**
     * This is a measure of how much a weapon kicks.
     *
     * @return weapon's default control.
     * @since 1.0
     */

    public int getControl() {
        return control;
    }

    /**
     * This is how slow or fast movement is while carrying this weapon.
     *
     * @return weapon's default mobility.
     * @since 1.0
     */

    public int getMobility() {
        return mobility;
    }

    /**
     * All this weapon's attributes in one place
     *
     * @return all this weapon's attributes
     * @since 1.0
     */

    public String getInfo() {
        return getName()
                + "\nDamage: " + getDamage()
                + ", Accuracy: " + getAccuracy()
                + ", Fire rate: " + getFireRate()
                + ", Range: " + getRange()
                + ", Control: " + getControl()
                + ", Mobility: " + getMobility()
                + ", Fire mode: " + getFireMechanism() + "\n";
    }

    /**
     * The classification of this weapon
     *
     * @return this weapon's gun class.
     * @since 2.0
     */

    public abstract String getGunClass();

    /**
     * Check if the weapon passed in matches the gun class.
     *
     * @param gunClass    the actual gun class.
     * @param weaponName  a primary weapon.
     * @param weaponClass the annotation to be checked.
     * @throws IncorrectWeaponTypeException if the {@code weaponName} is not annotated with the correct {@code weaponClass}.
     * @since 2.0
     */

    protected void checkPrimaryWeaponAnnotation(@PrimaryWeapon WeaponPrimary weaponName, Class<? extends Annotation> weaponClass, String gunClass) {
        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(weaponClass)) {
                throw new IncorrectWeaponTypeException(gunClass, weaponName);
            }
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Check if the weapon passed in matches the gun class.
     *
     * @param gunClass    the actual gun class.
     * @param weaponName  a secondary weapon.
     * @param weaponClass the annotation to be checked.
     * @throws IncorrectWeaponTypeException if the {@code weaponName} is not annotated with the correct {@code weaponClass}.
     * @since 2.0
     */

    protected void checkSecondaryWeaponAnnotation(@SecondaryWeapon WeaponSecondary weaponName, Class<? extends Annotation> weaponClass, String gunClass) {
        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(weaponClass)) {
                throw new IncorrectWeaponTypeException(gunClass, weaponName);
            }
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }
    }

}
