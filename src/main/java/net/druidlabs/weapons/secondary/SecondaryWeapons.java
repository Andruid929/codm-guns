package net.druidlabs.weapons.secondary;

import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponCategory;
import net.druidlabs.weapons.WeaponSecondary;
import net.druidlabs.weapons.annotations.Launchy;
import net.druidlabs.weapons.annotations.Meleeee;
import net.druidlabs.weapons.annotations.Pistola;
import net.druidlabs.weapons.primary.PrimaryWeapons;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * This utility class provides all the secondary weapons available to use in Call of Duty:Mobile.
 * <p>Use the {@link #getAll()} method to get all secondary weapons regardless of the category
 * <p>If you would like to get weapons in a specific category, you can use the method that returns
 * your desired category:
 * <p>  {@link #getPistols()} returns all weapons in the Pistol category
 * <p>  {@link #getMelee()} returns all weapons in the Melee category
 * <p>  {@link #getLaunchers()} returns all weapons in the Launcher category
 *
 * @author Andrew Jones
 * @see PrimaryWeapons
 * @since 1.0
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
     * Get all secondary weapons.
     * @return all the secondary weapon in a random order.
     * @see #get(String)
     * @since 1.0
     */

    public static Set<Weapon> getAll() {
        try {
            addWeapons();
        } catch (NoSuchFieldException e) {
            System.err.println(e.getMessage());
        }

        return Set.copyOf(SECONDARY_WEAPONS.values());
    }

    /**
     * Get the {@code Weapon} object of the weapon specified, make sure that the gun name you specify is exactly the gun's name in the game.
     * <p>It's also case-sensitive so if you want to get {@code FHJ-18}, be sure to specify {@code "FHJ-18"}
     * hyphen and all.
     *
     * @param gunName The name of the weapon in-game.
     * @return the weapon specified.
     * @see #getAll()
     * @since 1.0
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
     * Get all pistols.
     * @return all the secondary weapons in the Pistol category.
     * @since 1.0
     */

    public static Set<Weapon> getPistols() {
        return WeaponCategory.getSecondaryCategory(Pistol.class);
    }

    /**
     * Get all melee weapons.
     * @return all the secondary weapons in the Melee category.
     * @since 1.0
     */

    public static Set<Weapon> getMelee() {
        return WeaponCategory.getSecondaryCategory(Melee.class);
    }

    /**
     * Get all launchers.
     * @return all the secondary weapons in the Launcher category.
     * @since 1.0
     */

    public static Set<Weapon> getLaunchers() {
        return WeaponCategory.getSecondaryCategory(Launcher.class);
    }

}
