package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

final class zzfd extends TimeoutException {
    /* synthetic */ zzfd(String str, zzfe zzfe) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
