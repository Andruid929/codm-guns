package net.druidlabs.weapons;

import net.druidlabs.weapons.secondary.Launcher;
import net.druidlabs.weapons.secondary.Melee;
import net.druidlabs.weapons.secondary.Pistol;
import net.druidlabs.weapons.secondary.SecondaryWeapons;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class SecondaryWeaponsTest {

    @Test
    void get() {
        assertEquals(new Melee(WeaponSecondary.SAI).getInfo(), SecondaryWeapons.get("Sai").getInfo());
    }

    @Test
    void getPistols() {
        assertInstanceOf(Pistol.class, SecondaryWeapons.getPistols().stream().toList().getFirst());
    }

    @Test
    void getMelee() {
        assertInstanceOf(Melee.class, SecondaryWeapons.getMelee().stream().toList().getFirst());
    }

    @Test
    void getLaunchers() {
        assertInstanceOf(Launcher.class, SecondaryWeapons.getLaunchers().stream().toList().getFirst());
    }
}