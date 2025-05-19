package net.druidlabs.guns;

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
