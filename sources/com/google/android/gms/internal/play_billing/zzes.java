package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

abstract class zzes extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzeq((zzer) null);
    private static final Runnable zzb = new zzeq((zzer) null);

    zzes() {
    }

    private final void zzg(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzep zzep = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof zzep)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzep = (zzep) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (Thread.interrupted() || z10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    LockSupport.park(zzep);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean zzf = zzf();
            if (!zzf) {
                try {
                    obj = zza();
                } catch (Throwable th2) {
                    if (!compareAndSet(currentThread, zza)) {
                        zzg(currentThread);
                    }
                    zzd((Object) null);
                    throw th2;
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzg(currentThread);
            }
            if (!zzf) {
                zzd(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzep) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + zzb();
    }

    /* access modifiers changed from: package-private */
    public abstract Object zza();

    /* access modifiers changed from: package-private */
    public abstract String zzb();

    /* access modifiers changed from: package-private */
    public abstract void zzc(Throwable th2);

    /* access modifiers changed from: package-private */
    public abstract void zzd(Object obj);

    /* access modifiers changed from: package-private */
    public final void zze() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzep zzep = new zzep(this, (zzer) null);
            zzes.super.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzep)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract boolean zzf();
}
