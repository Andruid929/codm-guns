package net.druidlabs.guns;

interface WeaponAttr {

    String getName();

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
