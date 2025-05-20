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

    public NoMasterySystemException() {
        super();
    }

    public NoMasterySystemException(String message) {
        super(message);
    }

    public NoMasterySystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMasterySystemException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return "Secondaries don't have a mastery system... yet";
    }
}
