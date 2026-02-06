package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

enum zzed implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
