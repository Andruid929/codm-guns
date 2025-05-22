package net.druidlabs.weapons.primary;

import net.druidlabs.weapons.Weapon;
import net.druidlabs.weapons.WeaponAttr;
import net.druidlabs.weapons.mastery.Mastery;
import net.druidlabs.weapons.mastery.NotMasteredException;

public abstract class PrimaryGun extends Weapon implements Mastery {

    private String masteryName;
    private boolean isMastered;

    public PrimaryGun(WeaponAttr weapon) {
        super(weapon);
        isMastered = false;
    }

    @Override
    public void setMasteryName(String masteryName) {
        this.masteryName = masteryName;
        isMastered = true;
    }

    @Override
    public String getMasteryName() {
        if (masteryName == null) {
            throw new NotMasteredException(this);
        }
        return masteryName;
    }

    @Override
    public void clearMasteryName() {
        if (isMastered) {
            masteryName = Mastery.NOT_NAMED;
        }
    }
}
