package com.google.android.gms.internal.play_billing;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class zzec extends AbstractExecutorService implements zzev {
    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzfh.zzr(runnable, obj);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (zzeu) super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzfh(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzeu) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (zzeu) super.submit(callable);
    }
}
