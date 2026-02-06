package r0;

import q0.C2421g;
import q0.C2423i;
import q0.C2425k;

public interface S1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25454a = a.f25455a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f25455a = new a();

        private a() {
        }
    }

    public enum b {
        CounterClockwise,
        Clockwise
    }

    static /* synthetic */ void a(S1 s12, C2425k kVar, b bVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                bVar = b.CounterClockwise;
            }
            s12.r(kVar, bVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
    }

    static /* synthetic */ void h(S1 s12, C2423i iVar, b bVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                bVar = b.CounterClockwise;
            }
            s12.g(iVar, bVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
    }

    static /* synthetic */ void j(S1 s12, S1 s13, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                j10 = C2421g.f25320b.c();
            }
            s12.m(s13, j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
    }

    boolean b();

    void c(float f10, float f11);

    void close();

    void d(float f10, float f11, float f12, float f13, float f14, float f15);

    void e(int i10);

    void f(float f10, float f11, float f12, float f13);

    void g(C2423i iVar, b bVar);

    C2423i getBounds();

    void i(long j10);

    boolean isEmpty();

    void k(float f10, float f11, float f12, float f13);

    boolean l(S1 s12, S1 s13, int i10);

    void m(S1 s12, long j10);

    int n();

    void o();

    void p(float f10, float f11);

    void q(float f10, float f11, float f12, float f13, float f14, float f15);

    void r(C2425k kVar, b bVar);

    void reset();

    void s(float f10, float f11);

    void t(float f10, float f11);
}
