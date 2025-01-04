package net.druidlabs.guns;

public class Launcher extends Weapon {

    private final String gunClass = "Launcher";

    public Launcher(@Launchy WeaponSecondary weapon) {
        super(weapon);

        try {
            if (!weapon.getClass().getField(weapon.name()).isAnnotationPresent(Launchy.class)) {
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
        return "Launcher mechanism";
    }
}
