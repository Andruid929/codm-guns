package net.druidlabs.weapons;

import net.druidlabs.weapons.primary.PrimaryWeapons;
import net.druidlabs.weapons.secondary.SecondaryWeapons;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * There are two weapons per loadout, primary and secondary.
 * This interface separates the weapons into their respective category.
 *
 * @author Andrew Jones
 * @version 1.0
 * @since 1.0
 */

public interface WeaponCategory {

    /**
     * Get all the weapons in a specific primary gun class.
     * @param weaponClass the desired weapon class to be got.
     * @return all primary weapons in the specific weapon class.
     * @since 1.0
     */

    static Set<Weapon> getPrimaryCategory(Class<? extends Weapon> weaponClass) {
        return PrimaryWeapons.getAll().stream().filter(weapon -> weapon.getClass().equals(weaponClass)).collect(Collectors.toSet());
    }

    /**
     * Get all the weapons in a specific secondary weapon class.
     * @param weaponClass the desired weapon class to be got.
     * @return all secondary weapons in the specific weapon class.
     * @since 1.0
     */

    static Set<Weapon> getSecondaryCategory(Class<? extends Weapon> weaponClass) {
        return SecondaryWeapons.getAll().stream().filter(weapon -> weapon.getClass().equals(weaponClass)).collect(Collectors.toSet());
    }

}
