package net.druidlabs.guns;

public class Melee extends Weapon {

    private final String gunClass = "Melee";

    public Melee(@Meleeee WeaponSecondary weapon) {
        super(weapon);

        try {
            if (!weapon.getClass().getField(weapon.name()).isAnnotationPresent(Meleeee.class)) {
                throw new IncorrectWeaponTypeException(gunClass, weapon);
            }
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void setMasteryName(String masteryName) {
    }

    @Override
    public String getMasteryName() {
        throw new NoMasterySystemException();
    }

    @Override
    public String getFireMechanism() {
        return "Swinging";
    }
}
