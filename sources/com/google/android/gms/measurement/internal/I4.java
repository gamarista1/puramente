package com.google.android.gms.measurement.internal;

import Pa.e;

final class I4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f54723a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ J4 f54724b;

    I4(J4 j42, e eVar) {
        this.f54723a = eVar;
        this.f54724b = j42;
    }

    public final void run() {
        synchronized (this.f54724b) {
            try {
                this.f54724b.f54735a = false;
                if (!this.f54724b.f54737c.a0()) {
                    this.f54724b.f54737c.zzj().F().a("Connected to service");
                    this.f54724b.f54737c.x(this.f54723a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
