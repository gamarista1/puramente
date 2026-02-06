package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class zzec implements ThreadFactory {
    private ThreadFactory zza = Executors.defaultThreadFactory();

    zzec(zzdq zzdq) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.zza.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
