package U;

import c1.d;
import c1.h;
import q0.C2421g;
import q0.C2422h;
import q0.C2427m;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final float f6256a = h.j((float) 10);

    public static final float a(d dVar, boolean z10, long j10) {
        float k10 = C2421g.k(C2422h.a(C2427m.k(j10), C2427m.i(j10))) / 2.0f;
        if (z10) {
            return k10 + dVar.t1(f6256a);
        }
        return k10;
    }

    public static final float b(long j10) {
        return Math.max(C2427m.k(j10), C2427m.i(j10)) * 0.3f;
    }
}
