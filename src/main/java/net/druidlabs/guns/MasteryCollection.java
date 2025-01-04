package net.druidlabs.guns;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Group all your mastered guns in an organised list that you can access at any time.
 *
 * @author Andrew Jones
 * @since 23
 */
public class MasteryCollection {

    private final Set<Weapon> WEAPON_COLLECTION = new HashSet<>();

    public MasteryCollection() {

    }

    /**
     * If you already have some sort of {@code Collection} with your weapons,
     * you can add them all into the collection.
     *
     * @param weaponCollection Can be a list, set or a map of weapons.
     */
    public MasteryCollection(Collection<Weapon> weaponCollection) {
        WEAPON_COLLECTION.addAll(weaponCollection);
    }

    /**
     * The gun you have mastered and the desired name for it
     *
     * @param weapon      The weapon of choice
     * @param masteryName The name of the weapon you'd like
     */
    public MasteryCollection addGun(Weapon weapon, String masteryName) {
        weapon.setMasteryName(masteryName);
        WEAPON_COLLECTION.add(weapon);
        return this;
    }

    /**
     * Completely clear the collection of all the weapons
     */
    public void clearWeaponCollection() {
        WEAPON_COLLECTION.clear();
    }

    /**
     * Here you can get all the weapons in the collection
     *
     * @return A {@code Set<Weapon>} containing the weapons added if any
     */
    public Set<Weapon> getWeaponCollection() {
        return WEAPON_COLLECTION;
    }

    /**
     * Here you can get all the weapons in the collection
     *
     * @return A {@code List<Weapon>} containing the weapons added if any
     */
    public List<Weapon> getWeaponCollectionAsList() {
        return CollectionFunctions.weaponsToList(getWeaponCollection());
    }

    /**
     * Get the individual gun mastery names
     *
     * @return {@code List<Weapon>} containing all the weapon mastery names
     */
    public List<String> getMasteryNames() {
        return CollectionFunctions.getMasteryNamesOnly(getWeaponCollection());
    }

}