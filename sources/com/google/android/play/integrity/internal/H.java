package com.google.android.play.integrity.internal;

final class H extends D {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ C4741d f56559g;

    H(C4741d dVar) {
        this.f56559g = dVar;
    }

    public final void b() {
        synchronized (this.f56559g.f56572f) {
            try {
                if (this.f56559g.f56578l.get() > 0) {
                    if (this.f56559g.f56578l.decrementAndGet() > 0) {
                        this.f56559g.f56568b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                C4741d dVar = this.f56559g;
                if (dVar.f56580n != null) {
                    dVar.f56568b.c("Unbind from service.", new Object[0]);
                    C4741d dVar2 = this.f56559g;
                    dVar2.f56567a.unbindService(dVar2.f56579m);
                    this.f56559g.f56573g = false;
                    this.f56559g.f56580n = null;
                    this.f56559g.f56579m = null;
                }
                this.f56559g.x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
