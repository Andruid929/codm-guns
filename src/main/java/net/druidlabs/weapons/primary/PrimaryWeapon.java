package net.druidlabs.weapons.primary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for all the weapons that are primary weapons.
 *
 * @since 1.0
 * @version 1.0
 * @author Andrew Jones
 * */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
public @interface PrimaryWeapon {
}
