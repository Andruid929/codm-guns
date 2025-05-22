package net.druidlabs.weapons.primary;


import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponCategory;
import net.druidlabs.weapons.WeaponPrimary;
import net.druidlabs.weapons.annotations.*;
import net.druidlabs.weapons.secondary.SecondaryWeapons;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This utility class provides all the primary weapons available to use in Call of Duty:Mobile.
 * <p>Use the {@link #getAll()} method to get all primary weapons regardless of the gun category
 * <p>If you would like to get guns in a specific gun category, you can use the method that returns
 * your desired gun category:
 * <p>  {@link #getAssaultRifles()} returns all weapons in the AR category
 * <p>  {@link #getSubMachineGuns()} returns all weapons in the SMG category
 * <p>  {@link #getShotguns()} returns all weapons in the Shotgun category
 * <p>  {@link #getSnipers()} returns all weapons in the Sniper category
 * <p>  {@link #getMarksmanRifles()} returns all weapons in the Marksman category
 * <p>  {@link #getLightMachineGuns()} returns all weapons in the LMG category
 *
 * @author Andrew Jones
 * @version 1.0
 * @see SecondaryWeapons
 * @since 1.0
 */

public final class PrimaryWeapons {

    private static final Map<String, Weapon> PRIMARY_WEAPONS = new LinkedHashMap<>();

    private PrimaryWeapons() {
    }

    private static void addWeapons() throws NoSuchFieldException {
        for (WeaponPrimary weapon : WeaponPrimary.values()) {

            if (weapon.getClass().getField(weapon.name()).isAnnotationPresent(AR.class)) {
                PRIMARY_WEAPONS.put(weapon.getName(), new AssaultRifle(weapon));
            }

            if (weapon.getClass().getField(weapon.name()).isAnnotationPresent(Snipes.class)) {
                PRIMARY_WEAPONS.put(weapon.getName(), new Sniper(weapon));
            }

            if (weapon.getClass().getField(weapon.name()).isAnnotationPresent(LMG.class)) {
                PRIMARY_WEAPONS.put(weapon.getName(), new LightMachineGun(weapon));
            }

            if (weapon.getClass().getField(weapon.name()).isAnnotationPresent(SMG.class)) {
                PRIMARY_WEAPONS.put(weapon.getName(), new SubMachineGun(weapon));
            }

            if (weapon.getClass().getField(weapon.name()).isAnnotationPresent(Shotty.class)) {
                PRIMARY_WEAPONS.put(weapon.getName(), new Shotgun(weapon));
            }

            if (weapon.getClass().getField(weapon.name()).isAnnotationPresent(Marksmen.class)) {
                PRIMARY_WEAPONS.put(weapon.getName(), new Marksman(weapon));
            }
        }
    }

    /**
     * @return All primary weapons in the game.
     * @see #get(String)
     * @since 1.0
     */

    public static Set<Weapon> getAll() {
        try {
            addWeapons();
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return Set.copyOf(PRIMARY_WEAPONS.values());
    }

    /**
     * Get the {@code Weapon} object of the weapon specified, make sure that the gun name you specify is exactly the gun's name in the game.
     * <p>
     * It's also case-sensitive so if you want to get {@code KRM-262}, be sure to specify {@code "KRM-262"}
     * hyphen and all.
     *
     * @param gunName The name of the gun in-game.
     * @return the weapon specified.
     * @see #getAll()
     * @since 1.0
     */

    public static Weapon get(String gunName) {
        try {
            addWeapons();
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return PRIMARY_WEAPONS.get(gunName);
    }

    /**
     * @return all the primary weapons in the Assault rifle category.
     * @since 1.0
     */

    public static Set<Weapon> getAssaultRifles() {
        return WeaponCategory.getPrimaryCategory(AssaultRifle.class);
    }

    /**
     * @return all the primary weapons in the Sniper category.
     * @since 1.0
     */

    public static Set<Weapon> getSnipers() {
        return WeaponCategory.getPrimaryCategory(Sniper.class);
    }

    /**
     * @return all the primary weapons in the Sub-machine gun category.
     * @since 1.0
     */

    public static Set<Weapon> getSubMachineGuns() {
        return WeaponCategory.getPrimaryCategory(SubMachineGun.class);
    }

    /**
     * @return all the primary weapons in the Light-machine gun category.
     * @since 1.0
     */

    public static Set<Weapon> getLightMachineGuns() {
        return WeaponCategory.getPrimaryCategory(LightMachineGun.class);
    }

    /**
     * @return all the primary weapons in the Shotgun category.
     * @since 1.0
     */

    public static Set<Weapon> getShotguns() {
        return WeaponCategory.getPrimaryCategory(Shotgun.class);
    }

    /**
     * @return all the primary weapons in the Marksman category.
     * @since 1.0
     */

    public static Set<Weapon> getMarksmanRifles() {
        return WeaponCategory.getPrimaryCategory(Marksman.class);
    }
}
