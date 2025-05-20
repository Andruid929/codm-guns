package net.druidlabs.weapons;

import net.druidlabs.weapons.annotations.Launchy;
import net.druidlabs.weapons.annotations.Meleeee;
import net.druidlabs.weapons.annotations.Pistola;
import net.druidlabs.weapons.secondary.SecondaryWeapon;

import static net.druidlabs.weapons.FireMechanism.*;

@SecondaryWeapon
public enum WeaponSecondary implements WeaponAttr {

    /*
     * Pistols
     * WeaponSecondary type for the Pistol class
     * */
    @Pistola
    J358("J358", 82, 35, 78, 87, 57, 77, SEMI_AUTO),
    @Pistola
    MW11("MW11", 35, 40, 62, 96, 50, 41, SEMI_AUTO),
    @Pistola
    GS_50(".50 GS", 70, 33, 88, 87, 50, 68, SEMI_AUTO),
    @Pistola
    RENETTI("Renetti", 28, 74, 64, 107, 42, 42, BURST),
    @Pistola
    SHORTY("Shorty", 25, 9, 35, 52, 105, 38, 40, DOUBLE_BARREL),
    @Pistola
    CROSSBOW("Crossbow", 80, 60, 48, 93, 66, 38, BOW_STRING),
    @Pistola
    LCAR9("L-CAR 9", 26, 72, 56, 111, 37, 25, FULL_AUTO),
    @Pistola
    DOBVRA("Dobvra", 30, 41, 93, 115, 40, 81, SEMI_AUTO),
    NAIL_GUN("Nail gun", 34, 52, 74, 111, 37, 79, SEMI_AUTO),
    @Pistola
    MACHINE_PISTOL("Machine pistol", 22, 89, 43, 114, 39, 47, FULL_AUTO),

    /*
     * Melee
     * WeaponSecondary type for the Melee class
     * */
    @Meleeee
    KNIFE("Knife", 200, 40, 70, 90, 10, 70),
    @Meleeee
    BASE_MELEE("Base melee", 200, 40, 70, 90, 10, 70),
    @Meleeee
    AXE("Axe", 200, 27, 70, 80, 15, 70),
    @Meleeee
    SHOVEL("Shovel", 200, 28, 70, 80, 10, 70),
    @Meleeee
    BASEBALL_BAT("Baseball bat", 200, 27, 70, 90, 10, 70),
    @Meleeee
    NUNCHUCKS("Baseball bat", 200, 27, 70, 90, 8, 70),
    @Meleeee
    KATANA("Katana", 200, 28, 70, 90, 8, 70),
    @Meleeee
    PRIZE_FIGHTERS("Prizefighters", 200, 40, 70, 90, 10, 70),
    @Meleeee
    WRENCH("Wrench", 200, 28, 70, 90, 10, 70),
    @Meleeee
    SICKLE("Sickle", 200, 28, 70, 90, 10, 70),
    @Meleeee
    MACHETE("Machete", 200, 28, 70, 90, 10, 70),
    @Meleeee
    KALI_STICKS("Kali sticks", 200, 45, 70, 90, 10, 70),
    @Meleeee
    BUTTERFLY_KNIFE("Butterfly knife", 200, 40, 70, 90, 10, 70),
    @Meleeee
    SAI("Sai", 200, 40, 70, 90, 10, 70),
    @Meleeee
    BALLISTIC_KNIFE("Ballistic knife", 200, 40, 70, 90, 10, 70),
    @Meleeee
    SPEAR("Spear", 200, 40, 70, 90, 10, 70),

    /*
     * Launchers
     * WeaponSecondary type for the Launcher class
     * */
    @Launchy
    FHJ_18("FHJ-18", 300, 40, 90, 40, 90, 20),
    @Launchy
    SMRS("SMRS", 300, 35, 70, 40, 80, 20),
    @Launchy
    THUMPER("Thumper", 150, 35, 50, 55, 50, 20),
    @Launchy
    D13_SECTOR("D13 Sector", 100, 60, 60, 60, 60, 30);

    private final String nameLiteral;

    private int pelletDamage;
    private int numberOfPellets;
    private int baseDamage;
    private final int baseFireRate;
    private final int baseAccuracy;
    private final int baseMobility;
    private final int baseRange;
    private final int baseControl;

    private FireMechanism fireMechanism;

    WeaponSecondary(String nameLiteral, int baseDamage, int baseFireRate, int baseAccuracy, int baseMobility, int baseRange, int baseControl, FireMechanism fireMechanism) {
        this.nameLiteral = nameLiteral;
        this.baseDamage = baseDamage;
        this.baseFireRate = baseFireRate;
        this.baseAccuracy = baseAccuracy;
        this.baseMobility = baseMobility;
        this.baseRange = baseRange;
        this.baseControl = baseControl;
        this.fireMechanism = fireMechanism;
    }

    WeaponSecondary(String nameLiteral, int baseDamage, int baseFireRate, int baseAccuracy, int baseMobility, int baseRange, int baseControl) {
        this.nameLiteral = nameLiteral;
        this.baseDamage = baseDamage;
        this.baseFireRate = baseFireRate;
        this.baseAccuracy = baseAccuracy;
        this.baseMobility = baseMobility;
        this.baseRange = baseRange;
        this.baseControl = baseControl;
    }

    WeaponSecondary(String nameLiteral, int pelletDamage, int numberOfPellets, int baseFireRate, int baseAccuracy, int baseMobility, int baseRange, int baseControl, FireMechanism fireMechanism) {
        this.nameLiteral = nameLiteral;
        this.pelletDamage = pelletDamage;
        this.numberOfPellets = numberOfPellets;
        this.baseFireRate = baseFireRate;
        this.baseAccuracy = baseAccuracy;
        this.baseMobility = baseMobility;
        this.baseRange = baseRange;
        this.baseControl = baseControl;
        this.fireMechanism = fireMechanism;
    }

    @Override
    public String getName() {
        return nameLiteral;
    }

    @Override
    public String getShotgunDamage() {
        return pelletDamage + "x" + numberOfPellets;
    }

    @Override
    public int getBaseDamage() {
        return baseDamage;
    }

    @Override
    public int getBaseFireRate() {
        return baseFireRate;
    }

    @Override
    public int getBaseAccuracy() {
        return baseAccuracy;
    }

    @Override
    public int getBaseMobility() {
        return baseMobility;
    }

    @Override
    public int getBaseRange() {
        return baseRange;
    }

    @Override
    public int getBaseControl() {
        return baseControl;
    }

    @Override
    public FireMechanism getFireMechanism() {
        return fireMechanism;
    }
}
