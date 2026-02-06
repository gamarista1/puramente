package x0;

import java.util.List;
import mf.C6565s;
import r0.C2490f0;
import r0.C2493g0;
import r0.C2544x0;
import r0.C2547y0;
import r0.U1;
import r0.i2;
import r0.j2;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private static final List f28182a = C6565s.n();

    /* renamed from: b  reason: collision with root package name */
    private static final int f28183b = i2.f25529a.a();

    /* renamed from: c  reason: collision with root package name */
    private static final int f28184c = j2.f25533a.b();

    /* renamed from: d  reason: collision with root package name */
    private static final int f28185d = C2490f0.f25500a.z();

    /* renamed from: e  reason: collision with root package name */
    private static final long f28186e = C2544x0.f25560b.g();

    /* renamed from: f  reason: collision with root package name */
    private static final int f28187f = U1.f25466a.b();

    public static final int a() {
        return f28187f;
    }

    public static final int b() {
        return f28183b;
    }

    public static final int c() {
        return f28184c;
    }

    public static final List d() {
        return f28182a;
    }

    public static final boolean e(long j10, long j11) {
        if (C2544x0.v(j10) == C2544x0.v(j11) && C2544x0.u(j10) == C2544x0.u(j11) && C2544x0.s(j10) == C2544x0.s(j11)) {
            return true;
        }
        return false;
    }

    public static final boolean f(C2547y0 y0Var) {
        if (y0Var instanceof C2493g0) {
            C2493g0 g0Var = (C2493g0) y0Var;
            int b10 = g0Var.b();
            C2490f0.a aVar = C2490f0.f25500a;
            if (C2490f0.E(b10, aVar.z()) || C2490f0.E(g0Var.b(), aVar.B())) {
                return true;
            }
        } else if (y0Var == null) {
            return true;
        }
        return false;
    }
}
