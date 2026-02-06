package com.google.android.gms.internal.play_billing;

import com.amazon.a.a.o.b;
import com.amazon.a.a.o.b.f;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class zzdy<V> extends zzfi implements zzeu<V> {
    static final boolean zza;
    static final zzet zzb;
    /* access modifiers changed from: private */
    public static final zza zzc;
    private static final Object zzd = new Object();
    /* access modifiers changed from: private */
    public volatile zzd listeners;
    /* access modifiers changed from: private */
    public volatile Object value;
    /* access modifiers changed from: private */
    public volatile zzk waiters;

    abstract class zza {
        /* synthetic */ zza(zzeb zzeb) {
        }

        /* access modifiers changed from: package-private */
        public abstract zzd zza(zzdy zzdy, zzd zzd);

        /* access modifiers changed from: package-private */
        public abstract zzk zzb(zzdy zzdy, zzk zzk);

        /* access modifiers changed from: package-private */
        public abstract void zzc(zzk zzk, zzk zzk2);

        /* access modifiers changed from: package-private */
        public abstract void zzd(zzk zzk, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean zze(zzdy zzdy, zzd zzd, zzd zzd2);

        /* access modifiers changed from: package-private */
        public abstract boolean zzf(zzdy zzdy, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean zzg(zzdy zzdy, zzk zzk, zzk zzk2);
    }

    final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzdy.zza) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, (Throwable) null);
            zza = new zzb(true, (Throwable) null);
        }

        zzb(boolean z10, Throwable th2) {
            this.zzc = z10;
            this.zzd = th2;
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th2) {
            th2.getClass();
            this.zzb = th2;
        }
    }

    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<? super zzdy<?>, zzk> zzc;
        final AtomicReferenceFieldUpdater<? super zzdy<?>, zzd> zzd;
        final AtomicReferenceFieldUpdater<? super zzdy<?>, Object> zze;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super((zzeb) null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public final zzd zza(zzdy zzdy, zzd zzd2) {
            return this.zzd.getAndSet(zzdy, zzd2);
        }

        /* access modifiers changed from: package-private */
        public final zzk zzb(zzdy zzdy, zzk zzk) {
            return this.zzc.getAndSet(zzdy, zzk);
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, zzk zzk2) {
            this.zzb.lazySet(zzk, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            this.zza.lazySet(zzk, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzdy zzdy, zzd zzd2, zzd zzd3) {
            return zzdz.zza(this.zzd, zzdy, zzd2, zzd3);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzdy zzdy, Object obj, Object obj2) {
            return zzdz.zza(this.zze, zzdy, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzdy zzdy, zzk zzk, zzk zzk2) {
            return zzdz.zza(this.zzc, zzdy, zzk, zzk2);
        }
    }

    final class zzf<V> implements Runnable {
        final zzdy<V> zza;
        final zzeu<? extends V> zzb;

        zzf(zzdy zzdy, zzeu zzeu) {
            this.zza = zzdy;
            this.zzb = zzeu;
        }

        public final void run() {
            if (this.zza.value == this) {
                zzeu<? extends V> zzeu = this.zzb;
                if (zzdy.zzc.zzf(this.zza, this, zzdy.zzr(zzeu))) {
                    zzdy.zzw(this.zza, false);
                }
            }
        }
    }

    final class zzg extends zza {
        private zzg() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public final zzd zza(zzdy zzdy, zzd zzd) {
            zzd zzc;
            synchronized (zzdy) {
                try {
                    zzc = zzdy.listeners;
                    if (zzc != zzd) {
                        zzdy.listeners = zzd;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzc;
        }

        /* access modifiers changed from: package-private */
        public final zzk zzb(zzdy zzdy, zzk zzk) {
            zzk zzd;
            synchronized (zzdy) {
                try {
                    zzd = zzdy.waiters;
                    if (zzd != zzk) {
                        zzdy.waiters = zzk;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzd;
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, zzk zzk2) {
            zzk.next = zzk2;
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            zzk.thread = thread;
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzdy zzdy, zzd zzd, zzd zzd2) {
            synchronized (zzdy) {
                try {
                    if (zzdy.listeners != zzd) {
                        return false;
                    }
                    zzdy.listeners = zzd2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzdy zzdy, Object obj, Object obj2) {
            synchronized (zzdy) {
                try {
                    if (zzdy.value != obj) {
                        return false;
                    }
                    zzdy.value = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzdy zzdy, zzk zzk, zzk zzk2) {
            synchronized (zzdy) {
                try {
                    if (zzdy.waiters != zzk) {
                        return false;
                    }
                    zzdy.waiters = zzk2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* synthetic */ zzg(zzeb zzeb) {
            super((zzeb) null);
        }
    }

    interface zzh<V> extends zzeu<V> {
    }

    abstract class zzi<V> extends zzdy<V> implements zzh<V> {
        zzi() {
        }
    }

    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.play_billing.zzdy.zzj.AnonymousClass1());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.android.gms.internal.play_billing.zzdy$zzk> r0 = com.google.android.gms.internal.play_billing.zzdy.zzk.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.android.gms.internal.play_billing.zzdy$zzj$1 r1 = new com.google.android.gms.internal.play_billing.zzdy$zzj$1     // Catch:{ PrivilegedActionException -> 0x005a }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005a }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005a }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005a }
            L_0x0012:
                java.lang.Class<com.google.android.gms.internal.play_billing.zzdy> r2 = com.google.android.gms.internal.play_billing.zzdy.class
                java.lang.String r3 = "waiters"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ NoSuchFieldException -> 0x0053 }
                zzc = r3     // Catch:{ NoSuchFieldException -> 0x0053 }
                java.lang.String r3 = "listeners"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ NoSuchFieldException -> 0x0053 }
                zzb = r3     // Catch:{ NoSuchFieldException -> 0x0053 }
                java.lang.String r3 = "value"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0053 }
                zzd = r2     // Catch:{ NoSuchFieldException -> 0x0053 }
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0053 }
                zze = r2     // Catch:{ NoSuchFieldException -> 0x0053 }
                java.lang.String r2 = "next"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x0053 }
                zzf = r2     // Catch:{ NoSuchFieldException -> 0x0053 }
                zza = r1     // Catch:{ NoSuchFieldException -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005a:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Could not initialize intrinsics"
                java.lang.Throwable r0 = r0.getCause()
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdy.zzj.<clinit>():void");
        }

        private zzj() {
            throw null;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        final com.google.android.gms.internal.play_billing.zzdy.zzd zza(com.google.android.gms.internal.play_billing.zzdy r3, com.google.android.gms.internal.play_billing.zzdy.zzd r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.play_billing.zzdy$zzd r0 = r3.listeners
                if (r4 != r0) goto L_0x0007
                goto L_0x000d
            L_0x0007:
                boolean r1 = r2.zze(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
            L_0x000d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdy.zzj.zza(com.google.android.gms.internal.play_billing.zzdy, com.google.android.gms.internal.play_billing.zzdy$zzd):com.google.android.gms.internal.play_billing.zzdy$zzd");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        final com.google.android.gms.internal.play_billing.zzdy.zzk zzb(com.google.android.gms.internal.play_billing.zzdy r3, com.google.android.gms.internal.play_billing.zzdy.zzk r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.play_billing.zzdy$zzk r0 = r3.waiters
                if (r4 != r0) goto L_0x0007
                goto L_0x000d
            L_0x0007:
                boolean r1 = r2.zzg(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
            L_0x000d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdy.zzj.zzb(com.google.android.gms.internal.play_billing.zzdy, com.google.android.gms.internal.play_billing.zzdy$zzk):com.google.android.gms.internal.play_billing.zzdy$zzk");
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, zzk zzk2) {
            zza.putObject(zzk, zzf, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            zza.putObject(zzk, zze, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzdy zzdy, zzd zzd2, zzd zzd3) {
            return zzea.zza(zza, zzdy, zzb, zzd2, zzd3);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzdy zzdy, Object obj, Object obj2) {
            return zzea.zza(zza, zzdy, zzd, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzdy zzdy, zzk zzk, zzk zzk2) {
            return zzea.zza(zza, zzdy, zzc, zzk, zzk2);
        }

        /* synthetic */ zzj(zzeb zzeb) {
            super((zzeb) null);
        }
    }

    final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        zzk(boolean z10) {
        }

        zzk() {
            zzdy.zzc.zzd(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        zza zza2;
        Class<zzk> cls = zzk.class;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", b.f37476ag));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zza = z10;
        Class<zzdy> cls2 = zzdy.class;
        zzb = new zzet(cls2);
        try {
            zza2 = new zzj((zzeb) null);
            th3 = null;
            th2 = null;
        } catch (Error | Exception e10) {
            try {
                th2 = null;
                th3 = e10;
                zza2 = new zze(AtomicReferenceFieldUpdater.newUpdater(cls, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(cls, cls, "next"), AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "waiters"), AtomicReferenceFieldUpdater.newUpdater(cls2, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(cls2, Object.class, "value"));
            } catch (Error | Exception e11) {
                th2 = e11;
                th3 = e10;
                zza2 = new zzg((zzeb) null);
            }
        }
        zzc = zza2;
        if (th2 != null) {
            zzet zzet = zzb;
            Logger zza3 = zzet.zza();
            Level level = Level.SEVERE;
            zza3.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            zzet.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    protected zzdy() {
    }

    /* access modifiers changed from: private */
    public static Object zzr(zzeu zzeu) {
        Throwable zzh2;
        if (zzeu instanceof zzh) {
            Object obj = ((zzdy) zzeu).value;
            if (obj instanceof zzb) {
                zzb zzb2 = (zzb) obj;
                if (zzb2.zzc) {
                    Throwable th2 = zzb2.zzd;
                    obj = th2 != null ? new zzb(false, th2) : zzb.zzb;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((zzeu instanceof zzfi) && (zzh2 = ((zzfi) zzeu).zzh()) != null) {
            return new zzc(zzh2);
        } else {
            boolean isCancelled = zzeu.isCancelled();
            if ((!zza) && isCancelled) {
                zzb zzb3 = zzb.zzb;
                Objects.requireNonNull(zzb3);
                return zzb3;
            }
            try {
                Object zzs = zzs(zzeu);
                if (isCancelled) {
                    String valueOf = String.valueOf(zzeu);
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
                } else if (zzs == null) {
                    return zzd;
                } else {
                    return zzs;
                }
            } catch (ExecutionException e10) {
                if (isCancelled) {
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzeu)), e10));
                }
                return new zzc(e10.getCause());
            } catch (CancellationException e11) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzeu)), e11));
                }
                return new zzb(false, e11);
            } catch (Exception e12) {
                e = e12;
                return new zzc(e);
            } catch (Error e13) {
                e = e13;
                return new zzc(e);
            }
        }
    }

    private static Object zzs(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzt(StringBuilder sb2) {
        try {
            Object zzs = zzs(this);
            sb2.append("SUCCESS, result=[");
            if (zzs == null) {
                sb2.append("null");
            } else if (zzs == this) {
                sb2.append("this future");
            } else {
                sb2.append(zzs.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(zzs)));
            }
            sb2.append("]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private final void zzu(StringBuilder sb2) {
        String str;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb2.append(", setFuture=[");
            zzv(sb2, ((zzf) obj).zzb);
            sb2.append("]");
        } else {
            try {
                str = zzg();
                if (str == null || str.isEmpty()) {
                    str = null;
                }
            } catch (Exception | StackOverflowError e10) {
                str = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (str != null) {
                sb2.append(", info=[");
                sb2.append(str);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            zzt(sb2);
        }
    }

    private final void zzv(StringBuilder sb2, Object obj) {
        if (obj == this) {
            try {
                sb2.append("this future");
            } catch (Exception e10) {
                e = e10;
                sb2.append("Exception thrown from implementation: ");
                sb2.append(e.getClass());
            } catch (StackOverflowError e11) {
                e = e11;
                sb2.append("Exception thrown from implementation: ");
                sb2.append(e.getClass());
            }
        } else {
            sb2.append(obj);
        }
    }

    /* access modifiers changed from: private */
    public static void zzw(zzdy<V> zzdy, boolean z10) {
        zzd zzd2 = null;
        while (true) {
            for (zzk zzb2 = zzc.zzb(zzdy, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzdy.zzm();
            zzd zzd3 = zzd2;
            zzd zza2 = zzc.zza(zzdy, zzd.zza);
            zzd zzd4 = zzd3;
            while (zza2 != null) {
                zzd zzd5 = zza2.next;
                zza2.next = zzd4;
                zzd4 = zza2;
                zza2 = zzd5;
            }
            while (zzd4 != null) {
                Runnable runnable = zzd4.zzb;
                zzd zzd6 = zzd4.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzf2 = (zzf) runnable2;
                    zzdy = zzf2.zza;
                    if (zzdy.value == zzf2) {
                        if (zzc.zzf(zzdy, zzf2, zzr(zzf2.zzb))) {
                            zzd2 = zzd6;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzd4.zzc;
                    Objects.requireNonNull(executor);
                    zzx(runnable2, executor);
                }
                zzd4 = zzd6;
            }
            return;
        }
    }

    private static void zzx(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger zza2 = zzb.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, e10);
        }
    }

    private final void zzy(zzk zzk2) {
        zzk2.thread = null;
        while (true) {
            zzk zzk3 = this.waiters;
            if (zzk3 != zzk.zza) {
                zzk zzk4 = null;
                while (zzk3 != null) {
                    zzk zzk5 = zzk3.next;
                    if (zzk3.thread != null) {
                        zzk4 = zzk3;
                    } else if (zzk4 != null) {
                        zzk4.next = zzk5;
                        if (zzk4.thread == null) {
                        }
                    } else if (!zzc.zzg(this, zzk3, zzk5)) {
                    }
                    zzk3 = zzk5;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzz(Object obj) {
        if (obj instanceof zzb) {
            Throwable th2 = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        } else if (obj == zzd) {
            return null;
        } else {
            return obj;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.android.gms.internal.play_billing.zzeu<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.play_billing.zzdy.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x000a
            r4 = r3
            goto L_0x000b
        L_0x000a:
            r4 = r2
        L_0x000b:
            r1 = r1 | r4
            if (r1 == 0) goto L_0x0060
            boolean r1 = zza
            if (r1 == 0) goto L_0x001f
            com.google.android.gms.internal.play_billing.zzdy$zzb r1 = new com.google.android.gms.internal.play_billing.zzdy$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.play_billing.zzdy$zzb r1 = com.google.android.gms.internal.play_billing.zzdy.zzb.zza
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.play_billing.zzdy$zzb r1 = com.google.android.gms.internal.play_billing.zzdy.zzb.zzb
        L_0x0026:
            java.util.Objects.requireNonNull(r1)
        L_0x0029:
            r4 = r7
            r5 = r2
        L_0x002b:
            com.google.android.gms.internal.play_billing.zzdy$zza r6 = zzc
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L_0x0059
            zzw(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.play_billing.zzdy.zzf
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.internal.play_billing.zzdy$zzf r0 = (com.google.android.gms.internal.play_billing.zzdy.zzf) r0
            com.google.android.gms.internal.play_billing.zzeu<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.play_billing.zzdy.zzh
            if (r4 == 0) goto L_0x0055
            r4 = r0
            com.google.android.gms.internal.play_billing.zzdy r4 = (com.google.android.gms.internal.play_billing.zzdy) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x004b
            r5 = r3
            goto L_0x004c
        L_0x004b:
            r5 = r2
        L_0x004c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.play_billing.zzdy.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0053
            r5 = r3
            goto L_0x002b
        L_0x0053:
            r2 = r3
            goto L_0x0060
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0053
        L_0x0059:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.play_billing.zzdy.zzf
            if (r6 != 0) goto L_0x002b
            r2 = r5
        L_0x0060:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdy.cancel(boolean):boolean");
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return zzz(obj2);
            }
            zzk zzk2 = this.waiters;
            if (zzk2 != zzk.zza) {
                zzk zzk3 = new zzk();
                do {
                    zza zza2 = zzc;
                    zza2.zzc(zzk3, zzk2);
                    if (zza2.zzg(this, zzk2, zzk3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzy(zzk3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzz(obj);
                    }
                    zzk2 = this.waiters;
                } while (zzk2 != zzk.zza);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return zzz(obj3);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    public final boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof zzf));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.value instanceof zzb) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzt(sb2);
        } else {
            zzu(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final void zzb(Runnable runnable, Executor executor) {
        zzd zzd2;
        zzbe.zzc(executor, "Executor was null.");
        if (isDone() || (zzd2 = this.listeners) == zzd.zza) {
            zzx(runnable, executor);
        }
        zzd zzd3 = new zzd(runnable, executor);
        do {
            zzd3.next = zzd2;
            if (!zzc.zze(this, zzd2, zzd3)) {
                zzd2 = this.listeners;
            } else {
                return;
            }
        } while (zzd2 != zzd.zza);
        zzx(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public String zzg() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        return "remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    public final Throwable zzh() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void zzm() {
    }

    /* access modifiers changed from: protected */
    public final boolean zzn(Object obj) {
        if (obj == null) {
            obj = zzd;
        }
        if (!zzc.zzf(this, (Object) null, obj)) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean zzo(Throwable th2) {
        if (!zzc.zzf(this, (Object) null, new zzc(th2))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean zzp(zzeu zzeu) {
        zzc zzc2;
        Object obj = this.value;
        if (obj == null) {
            if (zzeu.isDone()) {
                if (!zzc.zzf(this, (Object) null, zzr(zzeu))) {
                    return false;
                }
                zzw(this, false);
                return true;
            }
            zzf zzf2 = new zzf(this, zzeu);
            if (zzc.zzf(this, (Object) null, zzf2)) {
                try {
                    zzeu.zzb(zzf2, zzed.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        zzc2 = new zzc(th2);
                    } catch (Error | Exception unused) {
                        zzc2 = zzc.zza;
                    }
                    zzc.zzf(this, zzf2, zzc2);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzeu.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean zzq() {
        Object obj = this.value;
        if (!(obj instanceof zzb) || !((zzb) obj).zzc) {
            return false;
        }
        return true;
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z10 = true;
            if ((obj != null) && (!(obj instanceof zzf))) {
                return zzz(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                zzk zzk2 = this.waiters;
                if (zzk2 != zzk.zza) {
                    zzk zzk3 = new zzk();
                    do {
                        zza zza2 = zzc;
                        zza2.zzc(zzk3, zzk2);
                        if (zza2.zzg(this, zzk2, zzk3)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                        return zzz(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzy(zzk3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzy(zzk3);
                        } else {
                            zzk2 = this.waiters;
                        }
                    } while (zzk2 != zzk.zza);
                }
                Object obj3 = this.value;
                Objects.requireNonNull(obj3);
                return zzz(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                    return zzz(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzdy = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j11 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i10 != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (i10 > 0) {
                    String str2 = concat + convert + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + lowerCase;
                    if (z10) {
                        str2 = str2.concat(f.f37529a);
                    }
                    concat = str2.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
                if (z10) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + zzdy);
        }
        throw new InterruptedException();
    }
}
