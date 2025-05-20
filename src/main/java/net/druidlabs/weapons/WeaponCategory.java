package net.druidlabs.weapons;

import net.druidlabs.weapons.primary.PrimaryWeapons;
import net.druidlabs.weapons.secondary.SecondaryWeapons;

import java.util.Set;
import java.util.stream.Collectors;

interface WeaponCategory {

    static Set<Weapon> getPrimaryCategory(Class<? extends Weapon> weaponClass) {
        return PrimaryWeapons.getAll().stream().filter(weapon -> weapon.getClass().equals(weaponClass)).collect(Collectors.toSet());
    }

    static Set<Weapon> getSecondaryCategory(Class<? extends Weapon> weaponClass) {
        return SecondaryWeapons.getAll().stream().filter(weapon -> weapon.getClass().equals(weaponClass)).collect(Collectors.toSet());
    }

}
