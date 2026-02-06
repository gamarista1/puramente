package ka;

import C9.m;
import C9.n;
import android.view.Surface;

public class g extends m {

    /* renamed from: c  reason: collision with root package name */
    public final int f45985c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f45986d;

    public g(Throwable th2, n nVar, Surface surface) {
        super(th2, nVar);
        boolean z10;
        this.f45985c = System.identityHashCode(surface);
        if (surface == null || surface.isValid()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45986d = z10;
    }
}
