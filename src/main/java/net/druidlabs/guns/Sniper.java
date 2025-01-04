package net.druidlabs.guns;

public class Sniper extends Weapon {

    private final String gunClass = "Sniper";

    public Sniper(@Snipes WeaponPrimary weaponName) {
        super(weaponName);

        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(Snipes.class)) {
                throw new IncorrectWeaponTypeException(gunClass, weaponName);
            }
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }
    }
}
