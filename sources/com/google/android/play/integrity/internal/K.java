package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

final class K extends D {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ IBinder f56560g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ C4740c f56561h;

    K(C4740c cVar, IBinder iBinder) {
        this.f56561h = cVar;
        this.f56560g = iBinder;
    }

    public final void b() {
        C4741d dVar = this.f56561h.f56565a;
        dVar.f56580n = (IInterface) dVar.f56575i.a(this.f56560g);
        C4741d.r(this.f56561h.f56565a);
        this.f56561h.f56565a.f56573g = false;
        for (Runnable run : this.f56561h.f56565a.f56570d) {
            run.run();
        }
        this.f56561h.f56565a.f56570d.clear();
    }
}
