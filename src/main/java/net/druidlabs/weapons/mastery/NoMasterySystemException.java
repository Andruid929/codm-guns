package net.druidlabs.weapons.mastery;

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
