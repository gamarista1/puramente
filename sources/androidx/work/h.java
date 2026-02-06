package androidx.work;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;

public enum h implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        C6496s.h(runnable, "command");
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
