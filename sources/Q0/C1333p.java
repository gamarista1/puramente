package Q0;

import b1.i;
import b1.k;
import java.util.List;
import q0.C2423i;
import r0.C2514n0;
import r0.C2520p0;
import r0.C2544x0;
import r0.S1;
import r0.e2;
import t0.C2605f;
import t0.C2606g;

/* renamed from: Q0.p  reason: case insensitive filesystem */
public interface C1333p {
    static /* synthetic */ void B(C1333p pVar, C2520p0 p0Var, long j10, e2 e2Var, k kVar, C2606g gVar, int i10, int i11, Object obj) {
        long j11;
        e2 e2Var2;
        k kVar2;
        int i12;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                j11 = C2544x0.f25560b.h();
            } else {
                j11 = j10;
            }
            C2606g gVar2 = null;
            if ((i11 & 4) != 0) {
                e2Var2 = null;
            } else {
                e2Var2 = e2Var;
            }
            if ((i11 & 8) != 0) {
                kVar2 = null;
            } else {
                kVar2 = kVar;
            }
            if ((i11 & 16) == 0) {
                gVar2 = gVar;
            }
            if ((i11 & 32) != 0) {
                i12 = C2605f.f25940d0.a();
            } else {
                i12 = i10;
            }
            pVar.c(p0Var, j11, e2Var2, kVar2, gVar2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
    }

    static /* synthetic */ void C(C1333p pVar, C2520p0 p0Var, C2514n0 n0Var, float f10, e2 e2Var, k kVar, C2606g gVar, int i10, int i11, Object obj) {
        float f11;
        e2 e2Var2;
        k kVar2;
        C2606g gVar2;
        int i12;
        if (obj == null) {
            if ((i11 & 4) != 0) {
                f11 = Float.NaN;
            } else {
                f11 = f10;
            }
            if ((i11 & 8) != 0) {
                e2Var2 = null;
            } else {
                e2Var2 = e2Var;
            }
            if ((i11 & 16) != 0) {
                kVar2 = null;
            } else {
                kVar2 = kVar;
            }
            if ((i11 & 32) != 0) {
                gVar2 = null;
            } else {
                gVar2 = gVar;
            }
            if ((i11 & 64) != 0) {
                i12 = C2605f.f25940d0.a();
            } else {
                i12 = i10;
            }
            pVar.p(p0Var, n0Var, f11, e2Var2, kVar2, gVar2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
    }

    float A(int i10);

    C2423i D(int i10);

    List E();

    float a();

    float b();

    void c(C2520p0 p0Var, long j10, e2 e2Var, k kVar, C2606g gVar, int i10);

    float d();

    float e();

    i f(int i10);

    float g(int i10);

    C2423i h(int i10);

    long i(int i10);

    float j();

    int k(long j10);

    int l(int i10);

    int m(int i10, boolean z10);

    int n();

    float o(int i10);

    void p(C2520p0 p0Var, C2514n0 n0Var, float f10, e2 e2Var, k kVar, C2606g gVar, int i10);

    boolean q();

    int r(float f10);

    S1 s(int i10, int i11);

    float t(int i10, boolean z10);

    long u(C2423i iVar, int i10, I i11);

    float v(int i10);

    void w(long j10, float[] fArr, int i10);

    float x();

    int y(int i10);

    i z(int i10);
}
