package androidx.work;

public enum D {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean b() {
        if (this == SUCCEEDED || this == FAILED || this == CANCELLED) {
            return true;
        }
        return false;
    }
}
