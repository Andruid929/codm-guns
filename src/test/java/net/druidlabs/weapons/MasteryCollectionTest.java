package net.druidlabs.weapons;

import net.druidlabs.weapons.mastery.MasteryCollection;
import net.druidlabs.weapons.primary.AssaultRifle;
import net.druidlabs.weapons.primary.Sniper;
import net.druidlabs.weapons.primary.SubMachineGun;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MasteryCollectionTest {

    private final MasteryCollection guns = new MasteryCollection();

    private void addStuff() {
        guns.addGun(new Sniper(WeaponPrimary.DL_Q33), "Death Kiss")
                .addGun(new AssaultRifle(WeaponPrimary.AK47), "Minotaur")
                .addGun(new SubMachineGun(WeaponPrimary.FENNEC), "Eucalyptus");
    }

    @Test
    void getWeaponCollection() {
        addStuff();
        assertEquals(3, guns.getWeaponCollection().size());
    }

    @Test
    void getWeaponCollectionAsList() {
        assertInstanceOf(List.class, guns.getWeaponCollectionAsList());
    }

    @Test
    void getMasteryNames() {
        addStuff();
        assertTrue(new HashSet<>(guns.getMasteryNames()).contains("Minotaur"));
    }

    @Test
    void clearWeaponCollection() {
        addStuff();
        guns.clearWeaponCollection();
        assertEquals(0, guns.getWeaponCollection().size());
    }
}