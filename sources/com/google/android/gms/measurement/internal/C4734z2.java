package com.google.android.gms.measurement.internal;

import Ea.e;
import android.content.Context;
import com.google.android.gms.common.internal.C4536s;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.z2  reason: case insensitive filesystem */
public final class C4734z2 extends C4601e3 {
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicLong f55423l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public B2 f55424c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public B2 f55425d;

    /* renamed from: e  reason: collision with root package name */
    private final PriorityBlockingQueue f55426e = new PriorityBlockingQueue();

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue f55427f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f55428g = new A2(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f55429h = new A2(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Object f55430i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f55431j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f55432k;

    C4734z2(E2 e22) {
        super(e22);
    }

    private final void t(C2 c22) {
        synchronized (this.f55430i) {
            try {
                this.f55426e.add(c22);
                B2 b22 = this.f55424c;
                if (b22 == null) {
                    B2 b23 = new B2(this, "Measurement Worker", this.f55426e);
                    this.f55424c = b23;
                    b23.setUncaughtExceptionHandler(this.f55428g);
                    this.f55424c.start();
                } else {
                    b22.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void B(Runnable runnable) {
        k();
        C4536s.l(runnable);
        t(new C2(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean E() {
        if (Thread.currentThread() == this.f55424c) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ C4713w c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ R1 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C4614g2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ B5 f() {
        return super.f();
    }

    public final void g() {
        if (Thread.currentThread() != this.f55425d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final void i() {
        if (Thread.currentThread() != this.f55424c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean o() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = zzj().G();
        r3.a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = zzj().G();
        r3.a("Timed out waiting for " + r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.z2 r0 = r1.zzl()     // Catch:{ all -> 0x002c }
            r0.y(r6)     // Catch:{ all -> 0x002c }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x002e }
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x002b
            com.google.android.gms.measurement.internal.V1 r3 = r1.zzj()
            com.google.android.gms.measurement.internal.X1 r3 = r3.G()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Timed out waiting for "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.a(r4)
        L_0x002b:
            return r2
        L_0x002c:
            r3 = move-exception
            goto L_0x004a
        L_0x002e:
            com.google.android.gms.measurement.internal.V1 r3 = r1.zzj()     // Catch:{ all -> 0x002c }
            com.google.android.gms.measurement.internal.X1 r3 = r3.G()     // Catch:{ all -> 0x002c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002c }
            java.lang.String r6 = "Interrupted waiting for "
            r4.<init>(r6)     // Catch:{ all -> 0x002c }
            r4.append(r5)     // Catch:{ all -> 0x002c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x002c }
            r3.a(r4)     // Catch:{ all -> 0x002c }
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            r2 = 0
            return r2
        L_0x004a:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4734z2.q(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final Future r(Callable callable) {
        k();
        C4536s.l(callable);
        C2 c22 = new C2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f55424c) {
            if (!this.f55426e.isEmpty()) {
                zzj().G().a("Callable skipped the worker queue.");
            }
            c22.run();
        } else {
            t(c22);
        }
        return c22;
    }

    public final void u(Runnable runnable) {
        k();
        C4536s.l(runnable);
        C2 c22 = new C2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f55430i) {
            try {
                this.f55427f.add(c22);
                B2 b22 = this.f55425d;
                if (b22 == null) {
                    B2 b23 = new B2(this, "Measurement Network", this.f55427f);
                    this.f55425d = b23;
                    b23.setUncaughtExceptionHandler(this.f55429h);
                    this.f55425d.start();
                } else {
                    b22.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Future w(Callable callable) {
        k();
        C4536s.l(callable);
        C2 c22 = new C2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f55424c) {
            c22.run();
        } else {
            t(c22);
        }
        return c22;
    }

    public final void y(Runnable runnable) {
        k();
        C4536s.l(runnable);
        t(new C2(this, runnable, false, "Task exception on worker thread"));
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C4583c zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ V1 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ C4734z2 zzl() {
        return super.zzl();
    }
}
