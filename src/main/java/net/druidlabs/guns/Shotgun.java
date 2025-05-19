package net.druidlabs.guns;

public class Shotgun extends Weapon {

    private WeaponPrimary weapon;

    private final String gunClass = "Shotgun";

    public Shotgun(@Shotty WeaponPrimary weaponName) {
        super(weaponName);

        this.weapon = weaponName;
        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(Shotty.class)) {
                throw new IncorrectWeaponTypeException(gunClass, weaponName);
            }
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public String getDamage() {
        return weapon.getShotgunDamage();
    }
}
