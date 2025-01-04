package net.druidlabs.guns;

public class AssaultRifle extends Weapon {

    private final String gunClass = "Assault rifle";

    public AssaultRifle(@AR WeaponPrimary weaponName) {
        super(weaponName);

        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(AR.class)) {
                throw new IncorrectWeaponTypeException(gunClass, weaponName);
            }
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }
    }
}
