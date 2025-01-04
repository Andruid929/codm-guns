package net.druidlabs.guns;

import static net.druidlabs.guns.FireMechanism.*;
import static net.druidlabs.guns.FireMechanism.BURST;
import static net.druidlabs.guns.FireMechanism.FULL_AUTO;

@PrimaryWeapon
public enum WeaponPrimary implements WeaponAttr {
    /*
     * Assault rifles
     * WeaponPrimary type for the AssaultRifle class
     * */
    @AR
    TYPE_25("Type 25", 24, 85, 44, 83, 47, 46, FULL_AUTO),
    @AR
    M16("M16", 30, 82, 81, 83, 62, 68, BURST),
    @AR
    AK117("AK117", 25, 76, 62, 75, 47, 46, FULL_AUTO),
    @AR
    AK47("AK-47", 33, 54, 67, 74, 58, 44, FULL_AUTO),
    @AR
    ASM10("ASM10", 34, 54, 72, 68, 48, 52, FULL_AUTO),
    @AR
    M4("M4", 26, 68, 59, 81, 58, 54, FULL_AUTO),
    @AR
    BK57("BK57", 31, 65, 57, 83, 49, 69, FULL_AUTO),
    @AR
    LK24("LK-24", 28, 63, 61, 78, 54, 51, FULL_AUTO),
    @AR
    ICR_1("ICR-1", 30, 60, 69, 82, 54, 61, FULL_AUTO),
    @AR
    MAN_O_WAR("Man o War", 37, 50, 69, 69, 56, 53, FULL_AUTO),
    @AR
    KN_44("KN-44", 29, 62, 55, 80, 51, 58, FULL_AUTO),
    @AR
    HBRA3("HBRa3", 26, 69, 55, 80, 48, 52, FULL_AUTO),
    @AR
    HVK_30("HVK-30", 24, 71, 55, 76, 51, 58, FULL_AUTO),
    @AR
    DR_H("DR-H", 32, 57, 63, 79, 54, 57, FULL_AUTO),
    @AR
    PEACEKEEPER("Peacekeeper", 26, 65, 58, 82, 50, 54, FULL_AUTO),
    @AR
    FR_556("FR 556", 27, 66, 86, 68, 50, 45, FULL_AUTO),
    @AR
    AS_VAL("AS VAL", 28, 80, 44, 83, 50, 47, FULL_AUTO),
    @AR
    CR56_AMAX("CR-56 AMAX", 25, 70, 50, 76, 51, 51, FULL_AUTO),
    @AR
    M13("M13", 24, 88, 56, 72, 53, 43, FULL_AUTO),
    @AR
    SWORDFISH("Swordfish", 22, 99, 56, 72, 56, 43, BURST),
    @AR
    KILO_141("Kilo 141", 29, 68, 57, 79, 54, 55, FULL_AUTO),
    @AR
    ODEN("Oden", 48, 45, 56, 69, 64, 32, FULL_AUTO),
    @AR
    KRIG_6("Krig 6", 30, 65, 62, 79, 56, 56, FULL_AUTO),
    @AR
    EM2("EM2", 36, 53, 73, 75, 53, 73, FULL_AUTO),
    @AR
    MADDOX("Maddox", 28, 72, 48, 83, 48, 62, FULL_AUTO),
    @AR
    FFAR_1("FFAR 1", 24, 90, 42, 80, 52, 42, FULL_AUTO),
    @AR
    GRAU_556("Grau 5.56", 27, 73, 50, 85, 54, 59, FULL_AUTO),
    @AR
    GROZA("Groza", 26, 75, 51, 85, 46, 52, FULL_AUTO),
    @AR
    TYPE_19("Type 19", 28, 75, 54, 83, 53, 50, FULL_AUTO),
    @AR
    BP50("BP50", 24, 81, 54, 83, 53, 50, FULL_AUTO),
    @AR
    LAG_53("LAG 53", 45, 45, 54, 83, 53, 50, FULL_AUTO),

    /*
     * Sniper rifles
     * WeaponPrimary type for the SniperRifle class
     * */
    @Snipes
    XPR_50("XPR-50", 80, 37, 73, 51, 90, 40, SEMI_AUTO),
    @Snipes
    ARCTIC_50("Arctic .50", 85, 31, 59, 33, 95, 68, SEMI_AUTO),
    @Snipes
    M21_EBR("M21 EBR", 91, 37, 59, 43, 90, 40, SEMI_AUTO),
    @Snipes
    DL_Q33("DL Q33", 90, 27, 59, 32, 99, 32, BOLT_ACTION),
    @Snipes
    LOCUS("Locus", 95, 28, 59, 35, 95, 34, BOLT_ACTION),
    @Snipes
    NA_45("NA-45", 30, 37, 54, 37, 95, 34, SEMI_AUTO),
    @Snipes
    OUTLAW("Outlaw", 91, 28, 71, 41, 90, 41, BOLT_ACTION),
    @Snipes
    RYTEC_AMR("Rytec AMR", 80, 31, 62, 24, 92, 32, SEMI_AUTO),
    @Snipes
    SVD("SVD", 78, 34, 59, 42, 92, 40, SEMI_AUTO),
    @Snipes
    KOSHKA("Koshka", 90, 28, 62, 34, 62, 40, BOLT_ACTION),
    @Snipes
    ZRG_20MM("ZRG 20mm", 95, 27, 62, 35, 74, 40, BOLT_ACTION),
    @Snipes
    HDR("HDR", 91, 27, 70, 33, 54, 32, BOLT_ACTION),
    @Snipes
    LW3_TUNDRA("LW3 Tundra", 91, 27, 68, 35, 48, 32, BOLT_ACTION),

    /*
     * Light-machine guns
     * WeaponPrimary type for the LightMachineGun class
     * */
    @LMG
    S36("S36", 30, 75, 45, 61, 51, 47, FULL_AUTO),
    @LMG
    UL736("UL736", 28, 61, 58, 66, 70, 65, FULL_AUTO),
    @LMG
    RPD("RPD", 31, 65, 61, 52, 60, 47, FULL_AUTO),
    @LMG
    M4LMG("M4LMG", 32, 63, 61, 57, 58, 59, FULL_AUTO),
    @LMG
    CHOPPER("Chopper", 30, 75, 46, 53, 46, 50, FULL_AUTO),
    @LMG
    HOLGER_26("Holger 26", 31, 70, 53, 59, 60, 59, FULL_AUTO),
    @LMG
    HADES("Hades", 29, 65, 57, 58, 53, 60, FULL_AUTO),
    @LMG
    PKM("PKM", 33, 63, 64, 31, 58, 49, FULL_AUTO),
    @LMG
    DINGO("Dingo", 28, 72, 54, 53, 49, 54, FULL_AUTO),
    @LMG
    BRUEN_MK9("Bruen MK9", 30, 75, 49, 53, 50, 58, FULL_AUTO),
    @LMG
    MG42("MG42", 22, 103, 40, 49, 54, 40, FULL_AUTO),
    @LMG
    RAAL_MG("Raal MG", 34, 57, 72, 32, 68, 65, FULL_AUTO),

    /*
     * Submachine guns
     * WeaponPrimary type for the SubMachineGun class
     * */
    @SMG
    RUS_79U("RUS-79U", 28, 76, 51, 98, 46, 50, FULL_AUTO),
    @SMG
    CHICOM("Chicom", 32, 80, 63, 105, 43, 57, BURST),
    @SMG
    PDW_57("PDW-57", 27, 75, 54, 100, 44, 50, FULL_AUTO),
    @SMG
    RAZORBACK("Razorback", 33, 62, 60, 94, 47, 57, FULL_AUTO),
    @SMG
    MSMC("MSMC", 26, 92, 37, 113, 41, 27, FULL_AUTO),
    @SMG
    HG_40("HG 40", 29, 66, 59, 100, 48, 50, FULL_AUTO),
    @SMG
    PHARO("Pharo", 34, 88, 49, 102, 43, 39, BURST),
    @SMG
    GKS("GKS", 33, 60, 62, 95, 50, 59, FULL_AUTO),
    @SMG
    CORDITE("Cordite", 24, 80, 46, 93, 53, 44, FULL_AUTO),
    @SMG
    QQ9("QQ9", 28, 83, 40, 102, 42, 42, FULL_AUTO),
    @SMG
    FENNEC("Fennec", 23, 111, 29, 108, 41, 24, FULL_AUTO),
    @SMG
    AGR_556("AGR 556", 25, 75, 37, 98, 47, 47, FULL_AUTO),
    @SMG
    QXR("QXR", 23, 86, 57, 101, 47, 40, FULL_AUTO),
    @SMG
    PP19_BIZON("PP19 Bizon", 30, 65, 62, 102, 52, 64, FULL_AUTO),
    @SMG
    MX9("MX9", 27, 85, 45, 95, 41, 40, FULL_AUTO),
    @SMG
    CBR4("CBR4", 24, 80, 43, 94, 47, 42, FULL_AUTO),
    @SMG
    PPSH_41("PPSh-41", 24, 82, 42, 88, 46, 43, FULL_AUTO),
    @SMG
    MAC_10("Mac-10", 24, 120, 31, 107, 44, 26, FULL_AUTO),
    @SMG
    KSP_45("KSP 45", 34, 71, 49, 107, 46, 41, BURST),
    @SMG
    SWITCHBLADE_X9("Switchblade X9", 27, 84, 48, 107, 42, 37, FULL_AUTO),
    @SMG
    LAPA("Lapa", 31, 69, 56, 104, 48, 57, FULL_AUTO),
    @SMG
    OTS_9("OTs9", 27, 85, 43, 102, 43, 42, FULL_AUTO),
    @SMG
    STRIKER_45("Striker 45", 34, 60, 54, 76, 44, 57, FULL_AUTO),
    @SMG
    CX9("CX-9", 24, 103, 35, 101, 41, 32, FULL_AUTO),
    @SMG
    TEC_9("TEC-9", 31, 48, 117, 109, 50, 98, SEMI_AUTO),
    @SMG
    ISO("ISO", 25, 88, 38, 100, 100, 33, FULL_AUTO),
    @SMG
    USS9("USS-9", 34, 60, 68, 99, 45, 69, FULL_AUTO),

    /*
     * Shotgun
     * WeaponPrimary type for the Shotgun class
     * */
    @Shotty
    HS2126("HS2126", 16, 8, 48, 40, 71, 33, 38, BURST),
    @Shotty
    BY15("BY15", 25, 12, 29, 48, 71, 40, 42, PUMP_ACTION),
    @Shotty
    HS0405("HSO405", 26, 15, 27, 45, 74, 37, 42, PUMP_ACTION),
    @Shotty
    STRIKER("Striker", 20, 8, 38, 49, 73, 34, 42, SEMI_AUTO),
    @Shotty
    KRM_262("KRM-262", 26, 12, 28, 51, 73, 39, 42, PUMP_ACTION),
    @Shotty
    ECHO("Echo", 21, 9, 35, 49, 82, 36, 42, SEMI_AUTO),
    @Shotty
    R9_0("R9-0", 17, 12, 40, 49, 86, 38, 42, DOUBLE_BARREL),
    @Shotty
    JAK_12("JAK-12", 16, 12, 41, 49, 75, 33, 42, FULL_AUTO),
    @Shotty
    ARGUS("Argus", 28, 8, 28, 60, 81, 38, 42, PUMP_ACTION),

    /*
     * Marksman rifles
     * WeaponPrimary type for the Marksman class
     * */
    @Marksmen
    KILO_BOLT_ACTION("Kilo Bolt-Action", 85, 28, 59, 40, 90, 34, BOLT_ACTION),
    @Marksmen
    SKS("SKS", 60, 43, 82, 46, 62, 57, SEMI_AUTO),
    @Marksmen
    SP_R_208("SP-R 208", 72, 27, 63, 40, 56, 34, BOLT_ACTION),
    @Marksmen
    MK2("MK2", 80, 28, 54, 43, 74, 36, LEVER_ACTION),
    @Marksmen
    TYPE_63("Type 63", 63, 42, 70, 63, 60, 60, SEMI_AUTO);

    private final String nameLiteral;

    private int pelletDamage;
    private int numberOfPellets;
    private int baseDamage;
    private final int baseFireRate;
    private final int baseAccuracy;
    private final int baseMobility;
    private final int baseRange;
    private final int baseControl;

    private final FireMechanism fireMechanism;

    WeaponPrimary(String nameLiteral, int baseDamage, int baseFireRate, int baseAccuracy, int baseMobility, int baseRange, int baseControl, FireMechanism fireMechanism) {
        this.nameLiteral = nameLiteral;
        this.baseDamage = baseDamage;
        this.baseFireRate = baseFireRate;
        this.baseAccuracy = baseAccuracy;
        this.baseMobility = baseMobility;
        this.baseRange = baseRange;
        this.baseControl = baseControl;
        this.fireMechanism = fireMechanism;
    }

    WeaponPrimary(String nameLiteral, int pelletDamage, int numberOfPellets, int baseFireRate, int baseAccuracy, int baseMobility, int baseRange, int baseControl, FireMechanism fireMechanism) {
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

    @Shotty
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