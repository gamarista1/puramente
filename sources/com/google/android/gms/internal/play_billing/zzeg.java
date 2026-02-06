package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class zzeg extends zzcf implements Future {
    protected zzeg() {
    }

    public boolean cancel(boolean z10) {
        return zzc().cancel(z10);
    }

    public final Object get() {
        return zzc().get();
    }

    public final boolean isCancelled() {
        return zzc().isCancelled();
    }

    public final boolean isDone() {
        return zzc().isDone();
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract Future zzc();

    public final Object get(long j10, TimeUnit timeUnit) {
        return zzc().get(j10, timeUnit);
    }
}
