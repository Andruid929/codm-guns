package net.druidlabs.weapons.mastery;

/**
 * This class outlines what primary weapons should have for proper
 * mastery implementation,
 * when a weapon has over 3,500 XP, it is considered as mastered.
 * Only primary weapons have this system as of May 2025.
 *
 * @since 2.0
 * @version 1.0
 * @author Andrew Jones
 * */

public interface Mastery {

    /**
     * You could have a mastered gun but have not decided on what to name it yet,
     * pass this constant as a placeholder.
     *
     * @since 2.0
     * */

    String NOT_NAMED = "No custom name";

    /**
     * Set a custom name for the weapon, only available when the weapon is mastered.
     *
     * @param masteryName the custom name if the gun was named.
     *                    If it was not named but it is mastered, use {@link #NOT_NAMED} as a placeholder.
     * @throws NotMasteredException if the {@code masteryName} is blank.
     * */

    void setMasteryName(String masteryName);

    /**
     * @return the mastery name of the current weapon.
     * If a placeholder was used, this will return {@code "No name"}.
     * @throws NotMasteredException if no mastery name was set for this weapon beforehand.
     * @since 2.0
     * */

    String getMasteryName();

    /**
     * Clear the custom name for that weapon,
     * this will reset the name to the value of {@link #NOT_NAMED}.
     *
     * @since 1.0
     * */

    void clearMasteryName();
}