package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4536s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.r4  reason: case insensitive filesystem */
final class C4688r4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f55332a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f55333b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Bundle f55334c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f55335d;

    C4688r4(C4644k4 k4Var, AtomicReference atomicReference, E5 e52, Bundle bundle) {
        this.f55332a = atomicReference;
        this.f55333b = e52;
        this.f55334c = bundle;
        this.f55335d = k4Var;
    }

    public final void run() {
        synchronized (this.f55332a) {
            try {
                e w10 = this.f55335d.f55206d;
                if (w10 == null) {
                    this.f55335d.zzj().B().a("Failed to get trigger URIs; not connected to service");
                    this.f55332a.notify();
                    return;
                }
                C4536s.l(this.f55333b);
                this.f55332a.set(w10.f0(this.f55333b, this.f55334c));
                this.f55335d.g0();
                this.f55332a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f55335d.zzj().B().b("Failed to get trigger URIs; remote exception", e10);
                    this.f55332a.notify();
                } catch (Throwable th2) {
                    this.f55332a.notify();
                    throw th2;
                }
            }
        }
    }
}
