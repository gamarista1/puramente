package w;

import c1.h;
import c1.j;
import c1.n;
import c1.o;
import c1.r;
import c1.s;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.r;
import lf.C6502A;
import mf.O;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;
import q0.C2427m;
import q0.C2428n;

public abstract class G0 {

    /* renamed from: a  reason: collision with root package name */
    private static final C2423i f27186a = new C2423i(0.5f, 0.5f, 0.5f, 0.5f);

    /* renamed from: b  reason: collision with root package name */
    private static final Map f27187b;

    static {
        Float valueOf = Float.valueOf(0.5f);
        r0 g10 = t0.g(r.f71790a);
        Float valueOf2 = Float.valueOf(1.0f);
        Pair a10 = C6502A.a(g10, valueOf2);
        Pair a11 = C6502A.a(t0.e(c1.r.f19235b), valueOf2);
        Pair a12 = C6502A.a(t0.d(n.f19226b), valueOf2);
        Pair a13 = C6502A.a(t0.f(C6490l.f71789a), Float.valueOf(0.01f));
        Pair a14 = C6502A.a(t0.i(C2423i.f25325e), valueOf);
        Pair a15 = C6502A.a(t0.j(C2427m.f25341b), valueOf);
        Pair a16 = C6502A.a(t0.h(C2421g.f25320b), valueOf);
        r0 b10 = t0.b(h.f19213b);
        Float valueOf3 = Float.valueOf(0.1f);
        f27187b = O.l(a10, a11, a12, a13, a14, a15, a16, C6502A.a(b10, valueOf3), C6502A.a(t0.c(j.f19218b), valueOf3));
    }

    public static final float a(h.a aVar) {
        return h.j(0.1f);
    }

    public static final int b(r rVar) {
        return 1;
    }

    public static final long c(n.a aVar) {
        return o.a(1, 1);
    }

    public static final long d(r.a aVar) {
        return s.a(1, 1);
    }

    public static final long e(C2421g.a aVar) {
        return C2422h.a(0.5f, 0.5f);
    }

    public static final long f(C2427m.a aVar) {
        return C2428n.a(0.5f, 0.5f);
    }

    public static final C2423i g(C2423i.a aVar) {
        return f27186a;
    }

    public static final Map h() {
        return f27187b;
    }
}
