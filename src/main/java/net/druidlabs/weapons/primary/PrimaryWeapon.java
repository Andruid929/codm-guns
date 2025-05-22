package net.druidlabs.weapons.primary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for all the weapons that are primary weapons.
 *
 * @author Andrew Jones
 * @version 1.0
 * @since 1.0
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
public @interface PrimaryWeapon {
}
