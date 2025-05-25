package net.druidlabs.weapons.mastery;

/**
 * Thrown when there is an attempt to get mastery names for
 * secondary weapons which do not support the mastery system.
 *
 * @since 1.0
 * @author Andrew Jones
 * @see java.lang.UnsupportedOperationException
 * */

public class NoMasterySystemException extends UnsupportedOperationException {

    @Override
    public String getMessage() {
        return "Secondaries don't have a mastery system... yet";
    }
}
