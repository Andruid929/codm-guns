package net.druidlabs.guns;

class IncorrectWeaponTypeException extends RuntimeException {

    private String gunClass;
    private WeaponAttr weaponAttr;

    IncorrectWeaponTypeException() {
        super();
    }

    IncorrectWeaponTypeException(String message) {
        super(message);
    }

    IncorrectWeaponTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    IncorrectWeaponTypeException(Throwable cause) {
        super(cause);
    }

    IncorrectWeaponTypeException(String gunClass, WeaponAttr weaponAttr) {
        this.gunClass = gunClass;
        this.weaponAttr = weaponAttr;
    }

    protected IncorrectWeaponTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String getMessage() {
        if (gunClass.equals("Assault rifle")) {
            return weaponAttr.getName() + " is not an " + gunClass.toLowerCase();
        }

        return weaponAttr.getName() + " is not a " + gunClass.toLowerCase();
    }
}
