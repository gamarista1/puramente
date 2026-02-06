package x2;

import android.view.Surface;
import r2.l;
import r2.m;

public class j extends l {

    /* renamed from: d  reason: collision with root package name */
    public final int f28291d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28292e;

    public j(Throwable th2, m mVar, Surface surface) {
        super(th2, mVar);
        boolean z10;
        this.f28291d = System.identityHashCode(surface);
        if (surface == null || surface.isValid()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28292e = z10;
    }
}
