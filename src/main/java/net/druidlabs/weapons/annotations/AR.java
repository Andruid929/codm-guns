package net.druidlabs.weapons.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This class is responsible
 * for marking fields as being related to an{@link net.druidlabs.weapons.primary.AssaultRifle assault rifle}.
 *
 * @since 1.0
 * @version 1.0
 * @author Andrew Jones
 * @see SMG
 * @see LMG
 * @see Marksmen
 * @see Shotty
 * @see Snipes
 * */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
public @interface AR {

}
