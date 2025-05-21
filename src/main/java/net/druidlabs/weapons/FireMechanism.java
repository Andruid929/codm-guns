package net.druidlabs.weapons;

/**
 * This enum contains all the registered firing mechanisms in the game.
 *
 * @since 1.0
 * @author Andrew Jones
 * @version 1.0
 * */

public enum FireMechanism {

    FULL_AUTO("Full auto"),
    SEMI_AUTO("Semi auto"),
    BURST("Burst"),
    BOLT_ACTION("Bolt action"),
    LEVER_ACTION("Lever action"),
    DOUBLE_BARREL("Double barrel"),
    BOW_STRING("Bow string"),
    PUMP_ACTION("Pump action");

    private final String mechanism;

    FireMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    /**
     * @return this firing mechanism.
     * @since 1.0
     * */

    public String getMechanism(){
        return mechanism;
    }
}
