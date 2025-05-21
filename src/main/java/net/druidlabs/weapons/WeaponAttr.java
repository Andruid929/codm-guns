package net.druidlabs.weapons;

import net.druidlabs.weapons.annotations.Shotty;

/**
 * This interface outlines what methods every {@link Weapon} object should have.
 *
 * @since 1.0
 * @author Andrew Jones
 * @version 1.0
 * */

public interface WeaponAttr {

    String getName();

    /**
     * Display the shotgun damage.
     * */

    @Shotty
    String getShotgunDamage();

    int getBaseDamage();

    int getBaseFireRate();

    int getBaseAccuracy();

    int getBaseMobility();

    int getBaseRange();

    int getBaseControl();

    FireMechanism getFireMechanism();

}
