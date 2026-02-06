package b8;

public final class b extends RuntimeException {
    public b(Exception exc) {
        super("An exception was thrown by an Executor", exc);
    }
}
