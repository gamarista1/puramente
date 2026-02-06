package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4536s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.v4  reason: case insensitive filesystem */
final class C4712v4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f55375a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f55376b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f55377c;

    C4712v4(C4644k4 k4Var, AtomicReference atomicReference, E5 e52) {
        this.f55375a = atomicReference;
        this.f55376b = e52;
        this.f55377c = k4Var;
    }

    public final void run() {
        synchronized (this.f55375a) {
            try {
                if (!this.f55377c.e().H().B()) {
                    this.f55377c.zzj().H().a("Analytics storage consent denied; will not get app instance id");
                    this.f55377c.m().S0((String) null);
                    this.f55377c.e().f55095i.b((String) null);
                    this.f55375a.set((Object) null);
                    this.f55375a.notify();
                    return;
                }
                e w10 = this.f55377c.f55206d;
                if (w10 == null) {
                    this.f55377c.zzj().B().a("Failed to get app instance id");
                    this.f55375a.notify();
                    return;
                }
                C4536s.l(this.f55376b);
                this.f55375a.set(w10.F0(this.f55376b));
                String str = (String) this.f55375a.get();
                if (str != null) {
                    this.f55377c.m().S0(str);
                    this.f55377c.e().f55095i.b(str);
                }
                this.f55377c.g0();
                this.f55375a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f55377c.zzj().B().b("Failed to get app instance id", e10);
                    this.f55375a.notify();
                } catch (Throwable th2) {
                    this.f55375a.notify();
                    throw th2;
                }
            }
        }
    }
}
