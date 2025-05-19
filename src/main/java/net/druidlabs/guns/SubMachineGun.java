package net.druidlabs.guns;

public class SubMachineGun extends Weapon {

    private final String gunClass = "Sub-machine gun";

    public SubMachineGun(@SMG WeaponPrimary weaponName) {
        super(weaponName);

        try {
            if (!weaponName.getClass().getField(weaponName.name()).isAnnotationPresent(SMG.class)) {
                throw new IncorrectWeaponTypeException(gunClass, weaponName);
            }
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }
    }
}
