package net.druidlabs.weapons;

public class IncorrectWeaponTypeException extends RuntimeException {

    private String gunClass;
    private WeaponAttr weaponAttr;

    public IncorrectWeaponTypeException() {
        super();
    }

    public IncorrectWeaponTypeException(String message) {
        super(message);
    }

    public IncorrectWeaponTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectWeaponTypeException(Throwable cause) {
        super(cause);
    }

    public IncorrectWeaponTypeException(String gunClass, WeaponAttr weaponAttr) {
        this.gunClass = gunClass;
        this.weaponAttr = weaponAttr;
    }

    @Override
    public String getMessage() {
        if (gunClass.equals("Assault rifle")) {
            return weaponAttr.getName() + " is not an " + gunClass.toLowerCase();
        }

        return weaponAttr.getName() + " is not a " + gunClass.toLowerCase();
    }
}
