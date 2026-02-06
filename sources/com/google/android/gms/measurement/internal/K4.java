package com.google.android.gms.measurement.internal;

import Pa.e;

final class K4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f54747a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ J4 f54748b;

    K4(J4 j42, e eVar) {
        this.f54747a = eVar;
        this.f54748b = j42;
    }

    public final void run() {
        synchronized (this.f54748b) {
            try {
                this.f54748b.f54735a = false;
                if (!this.f54748b.f54737c.a0()) {
                    this.f54748b.f54737c.zzj().A().a("Connected to remote service");
                    this.f54748b.f54737c.x(this.f54747a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
