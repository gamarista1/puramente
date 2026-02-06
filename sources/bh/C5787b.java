package bh;

import Ef.m;
import Ug.C5579l0;
import Ug.G;
import Zg.H;
import java.util.concurrent.Executor;
import qf.g;
import qf.h;

/* renamed from: bh.b  reason: case insensitive filesystem */
public final class C5787b extends C5579l0 implements Executor {

    /* renamed from: d  reason: collision with root package name */
    public static final C5787b f67297d = new C5787b();

    /* renamed from: e  reason: collision with root package name */
    private static final G f67298e = m.f67318c.C1(J.e("kotlinx.coroutines.io.parallelism", m.d(64, H.a()), 0, 0, 12, (Object) null));

    private C5787b() {
    }

    public void A1(g gVar, Runnable runnable) {
        f67298e.A1(gVar, runnable);
    }

    public G C1(int i10) {
        return m.f67318c.C1(i10);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public void execute(Runnable runnable) {
        z1(h.f72645a, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }

    public void z1(g gVar, Runnable runnable) {
        f67298e.z1(gVar, runnable);
    }
}
