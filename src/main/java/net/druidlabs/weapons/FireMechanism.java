package net.druidlabs.weapons;

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

    public String getMechanism(){
        return mechanism;
    }
}
