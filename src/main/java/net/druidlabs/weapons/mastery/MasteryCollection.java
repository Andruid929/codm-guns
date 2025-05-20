package net.druidlabs.weapons.mastery;

import net.druidlabs.weapons.Weapon;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Collect all your mastered guns.
 * Secondary weapons don't have a mastery system.
 * <p> Default collection is powered by a {@link Set Set<Weapon>}.
 *
 * @author Andrew Jones
 * @version 2.0
 * @since 1.0
 */
public class MasteryCollection {

    /**
     * This is used to show that the current weapon is not mastered and has no
     * mastery name.
     * <p>If a weapon's {@code getMasteryName()} returns this,
     * the weapon will not be allowed in a {@code MasteryCollection} object.
     * {@code DO NOT USE THIS FOR A MASTERY NAME}.
     * <p>If the weapon is mastered but there's no custom name, use {@link #NOT_NAMED}.
     *
     * @since 2.0
     */

    public static final String NOT_MASTERED = "Not mastered";

    /**
     * Use this if the weapon is mastered but no custom name has been set.
     *
     * @since 2.0
     */

    public static final String NOT_NAMED = "Not named";

    private final Set<Weapon> WEAPON_COLLECTION;

    /**
     * Get a simple instance of the MasteryCollection from scratch.
     * <p>
     * <p>
     * If you have an existing collection of weapons,
     * you can use {@link #MasteryCollection(Collection)}  MasteryCollection(Collection<Weapon>)}.
     *
     * @since 1.0
     */

    public MasteryCollection() {
        WEAPON_COLLECTION = new HashSet<>();
    }

    /**
     * If you already have some sort of {@code Collection} with your weapons,
     * you can add them all into the collection.
     * <p>If not, use the {@link #MasteryCollection() no args constructor}
     *
     * @param weaponCollection any {@link Collection} of type {@link Weapon}.
     * @throws NotMasteredException if any weapon in the given collection is not mastered.
     * @since 1.0
     */
    public MasteryCollection(Collection<Weapon> weaponCollection) {
        WEAPON_COLLECTION = new HashSet<>();
        Weapon[] weapons = new Weapon[weaponCollection.size()];
        checkForMasteryNames(weaponCollection.toArray(weapons));
        WEAPON_COLLECTION.addAll(weaponCollection);
    }

    /**
     * Add a mastered weapon to this collection.
     *
     * @param weapon      the mastered weapon.
     * @param masteryName the assigned mastery name.
     * @return the same {@code MasteryCollection} object to enable method chaining.
     * @throws NotMasteredException if the given mastery name is blank or matches {@link #NOT_MASTERED}.
     * @since 1.0
     */

    public MasteryCollection addGun(Weapon weapon, String masteryName) {
        weapon.setMasteryName(masteryName);
        checkForMasteryNames(weapon);

        WEAPON_COLLECTION.add(weapon);

        return this;
    }

    /**
     * Add a mastered weapon to this collection.
     *
     * @param weapon the mastered weapon.
     * @return the same {@code MasteryCollection} object to enable method chaining.
     * @throws NotMasteredException if the weapon given is not mastered.
     * @since 1.0
     */

    public MasteryCollection addGun(Weapon weapon) {
        checkForMasteryNames(weapon);

        WEAPON_COLLECTION.add(weapon);
        return this;
    }

    /**
     * Completely clear the collection of all the weapons.
     *
     * @since 1.0
     */
    public void clearWeaponCollection() {
        WEAPON_COLLECTION.clear();
    }

    /**
     * Get all the registered masteries in this collection.
     *
     * @return all the weapons added to the collection if any.
     * @throws NullPointerException if the collection is empty.
     * @since 1.0
     */
    public Set<Weapon> getWeaponCollection() {
        if (WEAPON_COLLECTION.isEmpty()) {
            throw new NullPointerException("Weapon collection is empty");
        }

        return WEAPON_COLLECTION;
    }

    /**
     * Get only the mastery names of the weapons contained in the collection.
     *
     * @return all the weapon mastery names contained within this collection.
     * @throws NullPointerException if the collection is empty.
     */
    public Set<String> getMasteryNames() {
        return getWeaponCollection().stream().map(Weapon::getMasteryName).collect(Collectors.toSet());
    }

    /**
     * Check if the given collection of weapons has all the weapons mastered.
     * As a mastery collection, all weapons passed in have to be mastered even if no
     * custom name was assigned.
     *
     * @param weapons a collection of mastered weapons.
     * @throws NotMasteredException if any weapon in the given collection is not mastered.
     * @since 2.0
     */

    private void checkForMasteryNames(Weapon... weapons) {
        for (Weapon weapon : weapons) {
            String masteryName = weapon.getMasteryName();
            if (masteryName.equals(NOT_MASTERED) || masteryName.isBlank()) {
                throw new NotMasteredException(weapon);
            }
        }
    }

}