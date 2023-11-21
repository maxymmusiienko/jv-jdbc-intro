package mate.academy.service;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException (String message) {
        super(message);
    }

    public DataProcessingException (String message, Throwable ex) {
        super(message, ex);
    }
}