package net.druidlabs.weapons.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This class is responsible
 * for marking fields as being related to a {@link net.druidlabs.weapons.primary.Sniper sniper rifle}.
 *
 * @since 1.0
 * @version 1.0
 * @author Andrew Jones
 * @see SMG
 * @see LMG
 * @see Marksmen
 * @see Shotty
 * @see AR
 * */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface Snipes {
}
