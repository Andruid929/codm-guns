package net.druidlabs.guns;

public class Marksman extends Weapon {

    private final String gunClass = "Marksman";

    public Marksman(@Marksmen WeaponPrimary weaponName) {
        super(weaponName);

        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(Marksmen.class)) {
                throw new IncorrectWeaponTypeException(gunClass, weaponName);
            }
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }
    }
}
