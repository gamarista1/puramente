package r0;

import lf.C6535s;
import q0.C2415a;
import q0.C2416b;
import q0.C2422h;
import q0.C2423i;
import q0.C2425k;
import q0.C2428n;
import r0.O1;
import r0.S1;
import t0.C2605f;
import t0.C2606g;
import t0.C2609j;

public abstract class P1 {
    public static final void a(S1 s12, O1 o12) {
        if (o12 instanceof O1.b) {
            S1.h(s12, ((O1.b) o12).b(), (S1.b) null, 2, (Object) null);
        } else if (o12 instanceof O1.c) {
            S1.a(s12, ((O1.c) o12).b(), (S1.b) null, 2, (Object) null);
        } else if (o12 instanceof O1.a) {
            S1.j(s12, ((O1.a) o12).b(), 0, 2, (Object) null);
        } else {
            throw new C6535s();
        }
    }

    public static final void b(C2605f fVar, O1 o12, C2514n0 n0Var, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        S1 b10;
        O1 o13 = o12;
        if (o13 instanceof O1.b) {
            C2423i b11 = ((O1.b) o13).b();
            fVar.h0(n0Var, h(b11), f(b11), f10, gVar, y0Var, i10);
            return;
        }
        if (o13 instanceof O1.c) {
            O1.c cVar = (O1.c) o13;
            b10 = cVar.c();
            if (b10 == null) {
                C2425k b12 = cVar.b();
                C2605f fVar2 = fVar;
                C2514n0 n0Var2 = n0Var;
                fVar2.K(n0Var2, i(b12), g(b12), C2416b.b(C2415a.d(b12.b()), 0.0f, 2, (Object) null), f10, gVar, y0Var, i10);
                return;
            }
        } else if (o13 instanceof O1.a) {
            b10 = ((O1.a) o13).b();
        } else {
            throw new C6535s();
        }
        fVar.h1(b10, n0Var, f10, gVar, y0Var, i10);
    }

    public static /* synthetic */ void c(C2605f fVar, O1 o12, C2514n0 n0Var, float f10, C2606g gVar, C2547y0 y0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            gVar = C2609j.f25944a;
        }
        C2606g gVar2 = gVar;
        if ((i11 & 16) != 0) {
            y0Var = null;
        }
        C2547y0 y0Var2 = y0Var;
        if ((i11 & 32) != 0) {
            i10 = C2605f.f25940d0.a();
        }
        b(fVar, o12, n0Var, f11, gVar2, y0Var2, i10);
    }

    public static final void d(C2605f fVar, O1 o12, long j10, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        S1 b10;
        O1 o13 = o12;
        if (o13 instanceof O1.b) {
            C2423i b11 = ((O1.b) o13).b();
            fVar.u1(j10, h(b11), f(b11), f10, gVar, y0Var, i10);
            return;
        }
        if (o13 instanceof O1.c) {
            O1.c cVar = (O1.c) o13;
            b10 = cVar.c();
            if (b10 == null) {
                C2425k b12 = cVar.b();
                C2605f fVar2 = fVar;
                long j11 = j10;
                fVar2.X(j11, i(b12), g(b12), C2416b.b(C2415a.d(b12.b()), 0.0f, 2, (Object) null), gVar, f10, y0Var, i10);
                return;
            }
        } else if (o13 instanceof O1.a) {
            b10 = ((O1.a) o13).b();
        } else {
            throw new C6535s();
        }
        fVar.g1(b10, j10, f10, gVar, y0Var, i10);
    }

    public static /* synthetic */ void e(C2605f fVar, O1 o12, long j10, float f10, C2606g gVar, C2547y0 y0Var, int i10, int i11, Object obj) {
        float f11;
        C2609j jVar;
        C2547y0 y0Var2;
        int i12;
        if ((i11 & 4) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i11 & 8) != 0) {
            jVar = C2609j.f25944a;
        } else {
            jVar = gVar;
        }
        if ((i11 & 16) != 0) {
            y0Var2 = null;
        } else {
            y0Var2 = y0Var;
        }
        if ((i11 & 32) != 0) {
            i12 = C2605f.f25940d0.a();
        } else {
            i12 = i10;
        }
        d(fVar, o12, j10, f11, jVar, y0Var2, i12);
    }

    private static final long f(C2423i iVar) {
        return C2428n.a(iVar.n(), iVar.h());
    }

    private static final long g(C2425k kVar) {
        return C2428n.a(kVar.j(), kVar.d());
    }

    private static final long h(C2423i iVar) {
        return C2422h.a(iVar.i(), iVar.l());
    }

    private static final long i(C2425k kVar) {
        return C2422h.a(kVar.e(), kVar.g());
    }
}
