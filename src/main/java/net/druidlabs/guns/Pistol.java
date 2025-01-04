package net.druidlabs.guns;

public class Pistol extends Weapon {

    private final WeaponSecondary weapon;

    public Pistol(@Pistola WeaponSecondary weapon) {
        super(weapon);
        this.weapon = weapon;

        try {
            if (!weapon.getClass().getField(weapon.name()).isAnnotationPresent(Pistola.class)) {
                String GUN_CLASS = "Pistol";
                throw new IncorrectWeaponTypeException(GUN_CLASS, weapon);
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
    public String getDamage() {
        if (weapon.getName().equals("Shorty")) {
            return weapon.getShotgunDamage();
        }

        return String.valueOf(weapon.getBaseDamage());
    }
}
