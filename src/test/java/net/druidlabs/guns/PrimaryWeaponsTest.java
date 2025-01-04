package net.druidlabs.guns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryWeaponsTest {

    @Test
    void getGun() {
        assertEquals(new AssaultRifle(WeaponPrimary.AK117).getInfo(), PrimaryWeapons.get("AK117").getInfo());
    }

    @Test
    void getsArType() {
        assertInstanceOf(AssaultRifle.class, PrimaryWeapons.getAssaultRifles().stream().toList().getFirst());
    }

    @Test
    void getsSmgType() {
        assertInstanceOf(SubMachineGun.class, PrimaryWeapons.getSubMachineGuns().stream().toList().getFirst());
    }

    @Test
    void getsLmgType() {
        assertInstanceOf(LightMachineGun.class, PrimaryWeapons.getLightMachineGuns().stream().toList().getFirst());
    }

    @Test
    void getsSgType() {
        assertInstanceOf(Shotgun.class, PrimaryWeapons.getShotguns().stream().toList().getFirst());
    }

    @Test
    void getsSrType() {
        assertInstanceOf(Sniper.class, PrimaryWeapons.getSnipers().stream().toList().getFirst());
    }

    @Test
    void getsMType() {
        assertInstanceOf(Marksman.class, PrimaryWeapons.getMarksmanRifles().stream().toList().getFirst());
    }

}