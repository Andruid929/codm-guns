package net.druidlabs.guns;


import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * This utility class provides all the primary weapons available to use in Call of Duty:Mobile.
 * <p>
 * Use the {@link #getAll()} method to get all primary weapons regardless of the gun category
 * <p>
 * If you would like to get guns in a specific gun category, you can use the method that returns
 * your desired gun category:
 * <p>
 * <p>  {@link #getAssaultRifles()} returns all weapons in the AR category
 * <p>  {@link #getSubMachineGuns()} returns all weapons in the SMG category
 * <p>  {@link #getShotguns()} returns all weapons in the Shotgun category
 * <p>  {@link #getSnipers()} returns all weapons in the Sniper category
 * <p>  {@link #getMarksmanRifles()} returns all weapons in the Marksman category
 * <p>  {@link #getLightMachineGuns()} returns all weapons in the LMG category
 *
 * @author Andrew Jones
 * @see SecondaryWeapons
 * @since 23
 */

public final class PrimaryWeapons {

    private static final Map<String, Weapon> PRIMARY_WEAPONS = new TreeMap<>();

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
     * Returns a {@code Set<Weapon>} of all the primary weapons.
     *
     * @see #get(String)
     */

    public static Set<Weapon> getAll() {
        try {
            addWeapons();
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return new LinkedHashSet<>(PRIMARY_WEAPONS.values());
    }

    /**
     * Returns the {@code Weapon} object of the weapon specified, make sure that the gun name you specify is exactly the gun's name in the game.
     * <p>
     * It's also case-sensitive so if you want to get {@code KRM-262}, be sure to specify {@code "KRM-262"}
     * hyphen and all.
     *
     * @param gunName The name of the gun in-game
     * @see #getAll()
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
     * Returns a {@code Set<Weapon>} of all the primary weapons in the Assault rifle category.
     */

    public static Set<Weapon> getAssaultRifles() {
        return WeaponCategory.getPrimaryCategory(AssaultRifle.class);
    }

    /**
     * Returns a {@code Set<Weapon>} of all the primary weapons in the Sniper category.
     */

    public static Set<Weapon> getSnipers() {
        return WeaponCategory.getPrimaryCategory(Sniper.class);
    }

    /**
     * Returns a {@code Set<Weapon>} of all the primary weapons in the Sub-machine gun category.
     */

    public static Set<Weapon> getSubMachineGuns() {
        return WeaponCategory.getPrimaryCategory(SubMachineGun.class);
    }

    /**
     * Returns a {@code Set<Weapon>} of all the primary weapons in the Light-machine gun category.
     */

    public static Set<Weapon> getLightMachineGuns() {
        return WeaponCategory.getPrimaryCategory(LightMachineGun.class);
    }

    /**
     * Returns a {@code Set<Weapon>} of all the primary weapons in the Shotgun category.
     */

    public static Set<Weapon> getShotguns() {
        return WeaponCategory.getPrimaryCategory(Shotgun.class);
    }

    /**
     * Returns a {@code Set<Weapon>} of all the primary weapons in the Marksman category.
     */

    public static Set<Weapon> getMarksmanRifles() {
        return WeaponCategory.getPrimaryCategory(Marksman.class);
    }
}
