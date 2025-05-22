package net.druidlabs.weapons;

import net.druidlabs.weapons.primary.*;
import net.druidlabs.weapons.secondary.Launcher;
import net.druidlabs.weapons.secondary.Melee;
import net.druidlabs.weapons.secondary.Pistol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeaponTest {

    @Test
    void getName() {
        assertEquals("HG 40", new SubMachineGun(WeaponPrimary.HG_40).getName());
    }

    @Test
    void getMasteryName() {
        PrimaryGun weapon = new Sniper(WeaponPrimary.DL_Q33);
        weapon.setMasteryName("Death kiss");

        assertEquals("Death kiss", weapon.getMasteryName());
    }

    @Test
    void getFireMechanism() {
        assertEquals("Bow string", new Pistol(WeaponSecondary.CROSSBOW).getFireMechanism());
    }

    @Test
    void getDamage() {
        assertEquals("48", new AssaultRifle(WeaponPrimary.ODEN).getDamage());
    }

    @Test
    void getSgDamage() {
        assertEquals("25x9", new Pistol(WeaponSecondary.SHORTY).getDamage());
    }

    @Test
    void getAccuracy() {
        assertEquals(70, new Melee(WeaponSecondary.KNIFE).getAccuracy());
    }

    @Test
    void getFireRate() {
        assertEquals(85, new AssaultRifle(WeaponPrimary.TYPE_25).getFireRate());
    }

    @Test
    void getRange() {
        assertEquals(36, new Shotgun(WeaponPrimary.ECHO).getRange());
    }

    @Test
    void getControl() {
        assertEquals(33, new SubMachineGun(WeaponPrimary.ISO).getControl());
    }

    @Test
    void getMobility() {
        assertEquals(33, new Sniper(WeaponPrimary.HDR).getMobility());
    }

    @Test
    void getInfo() {
        assertEquals("SMRS", new Launcher(WeaponSecondary.SMRS).getInfo().substring(0, 4));
    }
}