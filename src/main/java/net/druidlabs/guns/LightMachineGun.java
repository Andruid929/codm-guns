package net.druidlabs.guns;

public class LightMachineGun extends Weapon {

    private final String gunClass = "Light machine gun";

    public LightMachineGun(@LMG WeaponPrimary weaponName) {
        super(weaponName);

        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(LMG.class)) {
                throw new IncorrectWeaponTypeException(gunClass, weaponName);
            }
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }
    }
}
