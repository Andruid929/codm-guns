package net.druidlabs.weapons.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This class is responsible
 * for marking fields as being related to a{@link net.druidlabs.weapons.primary.LightMachineGun light machine gun}.
 *
 * @since 1.0
 * @version 1.0
 * @author Andrew Jones
 * @see SMG
 * @see AR
 * @see Marksmen
 * @see Shotty
 * @see Snipes
 * */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface LMG {
}
