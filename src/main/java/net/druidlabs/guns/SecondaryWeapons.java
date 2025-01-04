package net.druidlabs.guns;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * This utility class provides all the secondary weapons available to use in Call of Duty:Mobile.
 * <p>
 * Use the {@link #getAll()} method to get all secondary weapons regardless of the category
 * <p>
 * If you would like to get weapons in a specific category, you can use the method that returns
 * your desired category:
 * <p>
 * <p>  {@link #getPistols()} returns all weapons in the Pistol category
 * <p>  {@link #getMelee()} returns all weapons in the Melee category
 * <p>  {@link #getLaunchers()} returns all weapons in the Launcher category
 *
 * @author Andrew Jones
 * @see PrimaryWeapons
 * @since 23
 */

public final class SecondaryWeapons {

    private static final Map<String, Weapon> SECONDARY_WEAPONS = new TreeMap<>();

    private SecondaryWeapons() {
    }

    private static void addWeapons() throws NoSuchFieldException {
        for (WeaponSecondary weaponSecondary : WeaponSecondary.values()) {
            if (weaponSecondary.getClass().getField(weaponSecondary.name()).isAnnotationPresent(Pistola.class)) {
                SECONDARY_WEAPONS.put(weaponSecondary.getName(), new Pistol(weaponSecondary));
            }

            if (weaponSecondary.getClass().getField(weaponSecondary.name()).isAnnotationPresent(Meleeee.class)) {
                SECONDARY_WEAPONS.put(weaponSecondary.getName(), new Melee(weaponSecondary));
            }

            if (weaponSecondary.getClass().getField(weaponSecondary.name()).isAnnotationPresent(Launchy.class)) {
                SECONDARY_WEAPONS.put(weaponSecondary.getName(), new Launcher(weaponSecondary));
            }
        }
    }

    /**
     * Returns a {@code Set<Weapon>} of all the secondary weapons.
     *
     * @see #get(String)
     */

    public static Set<Weapon> getAll() {
        try {
            addWeapons();
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }

        return new LinkedHashSet<>(SECONDARY_WEAPONS.values());
    }

    /**
     * Returns the {@code Weapon} object of the weapon specified, make sure that the gun name you specify is exactly the gun's name in the game.
     * <p>
     * It's also case-sensitive so if you want to get {@code FHJ-18}, be sure to specify {@code "FHJ-18"}
     * hyphen and all.
     *
     * @param gunName The name of the weapon in-game
     * @see #getAll()
     */

    public static Weapon get(String gunName) {
        try {
            addWeapons();
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }

        return SECONDARY_WEAPONS.get(gunName);
    }

    /**
     * Returns a {@code Set<Weapon>} of all the secondary weapons in the Pistol category.
     */

    public static Set<Weapon> getPistols() {
        return WeaponCategory.getSecondaryCategory(Pistol.class);
    }

    /**
     * Returns a {@code Set<Weapon>} of all the secondary weapons in the Melee category.
     */

    public static Set<Weapon> getMelee() {
        return WeaponCategory.getSecondaryCategory(Melee.class);
    }

    /**
     * Returns a {@code Set<Weapon>} of all the secondary weapons in the Launcher category.
     */

    public static Set<Weapon> getLaunchers() {
        return WeaponCategory.getSecondaryCategory(Launcher.class);
    }

}
