package net.druidlabs.weapons;

import java.time.DayOfWeek;

/**
 * This enum contains all the registered firing mechanisms in the game.
 *
 * @author Andrew Jones
 * @version 1.0
 * @since 1.0
 */

public enum FireMechanism {

    /**
     * Continuous fire as the trigger is pulled.
     */

    FULL_AUTO("Full auto"),

    /**
     * Each trigger pull fires a bullet and rechambers the gun.
     */

    SEMI_AUTO("Semi auto"),

    /**
     * A specific amount of bullets is fired with each pull of the trigger.
     */

    BURST("Burst"),

    /**
     * A bolt chambers each a new bullet after one is fired.
     */

    BOLT_ACTION("Bolt action"),

    /**
     * A lever chambers each a new bullet after one is fired.
     */

    LEVER_ACTION("Lever action"),

    /**
     * Two barrels fire rounds, one after the other.
     */

    DOUBLE_BARREL("Double barrel"),

    /**
     * The mechanism used for crossbows.
     */

    BOW_STRING("Bow string"),

    /**
     * Popular mechanism for single shot shotguns.
     */

    PUMP_ACTION("Pump action");

    /**
     * The fire mechanism used.
     *
     * @since 1.0
     */

    private final String mechanism;

    /**
     * Create a new fire mechanism.
     *
     * @param mechanism the name literal of this mechanism.
     * @since 1.0
     */

    FireMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    /**
     * Get the firing mechanism.
     *
     * @return the name literal for this fire mechanism.
     * @since 1.0
     */

    public String getMechanism() {
        return mechanism;
    }
}
