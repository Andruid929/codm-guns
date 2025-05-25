package net.druidlabs.weapons.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is responsible for marking fields as related to
 * {@link net.druidlabs.weapons.secondary.Launcher launchers}.
 *
 * @author Andrew Jones
 * @since 1.0
 * @see Pistola
 * @see Meleeee
 * @version 1.0
 * */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface Launchy {
}
