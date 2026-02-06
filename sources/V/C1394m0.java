package V;

import C.N;
import Ef.m;
import H0.U;
import J0.C1241g;
import W.y;
import X.F;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.C1644k0;
import c1.h;
import c1.t;
import c1.v;
import c1.w;
import e1.C1943b;
import k0.c;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import pf.C6632a;
import q0.C2427m;
import r0.C2541w0;
import t0.C2602c;
import t0.C2603d;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: V.m0  reason: case insensitive filesystem */
public abstract class C1394m0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f7808a = h.j((float) 4);

    /* renamed from: b  reason: collision with root package name */
    private static final long f7809b;

    /* renamed from: V.m0$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f7810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f7811b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f7812c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f7813d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f7814e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f7815f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f7816g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f7817h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f7818i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f7819j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C6798l f7820k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p f7821l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p f7822m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ N f7823n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f7824o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f7825p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, p pVar, q qVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, boolean z10, float f10, C6798l lVar, p pVar7, p pVar8, N n10, int i10, int i11) {
            super(2);
            this.f7810a = iVar;
            this.f7811b = pVar;
            this.f7812c = qVar;
            this.f7813d = pVar2;
            this.f7814e = pVar3;
            this.f7815f = pVar4;
            this.f7816g = pVar5;
            this.f7817h = pVar6;
            this.f7818i = z10;
            this.f7819j = f10;
            this.f7820k = lVar;
            this.f7821l = pVar7;
            this.f7822m = pVar8;
            this.f7823n = n10;
            this.f7824o = i10;
            this.f7825p = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            i iVar = this.f7810a;
            i iVar2 = iVar;
            C1394m0.a(iVar2, this.f7811b, this.f7812c, this.f7813d, this.f7814e, this.f7815f, this.f7816g, this.f7817h, this.f7818i, this.f7819j, this.f7820k, this.f7821l, this.f7822m, this.f7823n, mVar2, M0.a(this.f7824o | 1), M0.a(this.f7825p));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.m0$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f7826a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f7827b;

        /* renamed from: V.m0$b$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f7828a;

            static {
                int[] iArr = new int[t.values().length];
                try {
                    iArr[t.Rtl.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f7828a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6787a aVar, N n10) {
            super(1);
            this.f7826a = aVar;
            this.f7827b = n10;
        }

        public final void a(C2602c cVar) {
            float c10;
            C2602c cVar2 = cVar;
            long o10 = ((C2427m) this.f7826a.invoke()).o();
            float k10 = C2427m.k(o10);
            if (k10 > 0.0f) {
                float t12 = cVar2.t1(C1394m0.f7808a);
                float t13 = cVar2.t1(this.f7827b.c(cVar.getLayoutDirection())) - t12;
                float f10 = (float) 2;
                float f11 = k10 + t13 + (t12 * f10);
                t layoutDirection = cVar.getLayoutDirection();
                int[] iArr = a.f7828a;
                if (iArr[layoutDirection.ordinal()] == 1) {
                    c10 = C2427m.k(cVar.d()) - f11;
                } else {
                    c10 = m.c(t13, 0.0f);
                }
                float f12 = c10;
                if (iArr[cVar.getLayoutDirection().ordinal()] == 1) {
                    f11 = C2427m.k(cVar.d()) - m.c(t13, 0.0f);
                }
                float f13 = f11;
                float i10 = C2427m.i(o10);
                float f14 = (-i10) / f10;
                float f15 = i10 / f10;
                int a10 = C2541w0.f25557a.a();
                C2603d w12 = cVar.w1();
                long d10 = w12.d();
                w12.f().q();
                try {
                    w12.e().c(f12, f14, f13, f15, a10);
                    cVar.H1();
                } finally {
                    w12.f().h();
                    w12.h(d10);
                }
            } else {
                cVar.H1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2602c) obj);
            return C6514M.f71813a;
        }
    }

    static {
        long l10 = F.f8795a.l();
        w.b(l10);
        f7809b = w.i(v.f(l10), v.h(l10) / ((float) 2));
    }

    public static final void a(i iVar, p pVar, q qVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, boolean z10, float f10, C6798l lVar, p pVar7, p pVar8, N n10, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        N n11;
        int i14;
        float f11;
        float f12;
        i iVar2 = iVar;
        p pVar9 = pVar;
        q qVar2 = qVar;
        p pVar10 = pVar2;
        p pVar11 = pVar3;
        p pVar12 = pVar4;
        p pVar13 = pVar5;
        p pVar14 = pVar6;
        boolean z11 = z10;
        float f13 = f10;
        C6798l lVar2 = lVar;
        p pVar15 = pVar7;
        p pVar16 = pVar8;
        N n12 = n10;
        int i15 = i10;
        int i16 = i11;
        C1500m h10 = mVar.h(1408290209);
        if ((i15 & 6) == 0) {
            i12 = i15 | (h10.S(iVar2) ? 4 : 2);
        } else {
            i12 = i15;
        }
        int i17 = 16;
        if ((i15 & 48) == 0) {
            i12 |= h10.C(pVar9) ? 32 : 16;
        }
        int i18 = 128;
        if ((i15 & 384) == 0) {
            i12 |= h10.C(qVar2) ? 256 : 128;
        }
        int i19 = 1024;
        if ((i15 & 3072) == 0) {
            i12 |= h10.C(pVar10) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i12 |= h10.C(pVar11) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i12 |= h10.C(pVar12) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i12 |= h10.C(pVar13) ? 1048576 : 524288;
        }
        if ((12582912 & i15) == 0) {
            i12 |= h10.C(pVar14) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i12 |= h10.b(z11) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i12 |= h10.c(f13) ? 536870912 : 268435456;
        }
        int i20 = i12;
        if ((i16 & 6) == 0) {
            i13 = i16 | (h10.C(lVar2) ? 4 : 2);
        } else {
            i13 = i16;
        }
        if ((i16 & 48) == 0) {
            if (h10.C(pVar15)) {
                i17 = 32;
            }
            i13 |= i17;
        }
        if ((i16 & 384) == 0) {
            if (h10.C(pVar8)) {
                i18 = 256;
            }
            i13 |= i18;
        } else {
            p pVar17 = pVar8;
        }
        if ((i16 & 3072) == 0) {
            n11 = n10;
            if (h10.S(n11)) {
                i19 = 2048;
            }
            i13 |= i19;
        } else {
            n11 = n10;
        }
        int i21 = i13;
        if ((i20 & 306783379) == 306783378 && (i21 & 1171) == 1170 && h10.i()) {
            h10.I();
            p pVar18 = pVar2;
            p pVar19 = pVar8;
        } else {
            if (C1506p.H()) {
                C1506p.Q(1408290209, i20, i21, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:468)");
            }
            boolean z12 = ((i21 & 14) == 4) | ((234881024 & i20) == 67108864) | ((1879048192 & i20) == 536870912) | ((i21 & 7168) == 2048);
            Object A10 = h10.A();
            if (z12 || A10 == C1500m.f10026a.a()) {
                A10 = new C1396n0(lVar2, z11, f13, n11);
                h10.r(A10);
            }
            C1396n0 n0Var = (C1396n0) A10;
            t tVar = (t) h10.m(C1644k0.k());
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, iVar2);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, n0Var, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            pVar15.invoke(h10, Integer.valueOf((i21 >> 3) & 14));
            h10.T(250370369);
            if (pVar11 != null) {
                i h11 = androidx.compose.ui.layout.a.b(i.f23074a, "Leading").h(y.k());
                H0.F h12 = d.h(c.f23044a.e(), false);
                int a13 = C1494j.a(h10, 0);
                C1523y p11 = h10.p();
                i e11 = k0.h.e(h10, h11);
                C6787a a14 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a14);
                } else {
                    h10.q();
                }
                C1500m a15 = F1.a(h10);
                F1.b(a15, h12, aVar.c());
                F1.b(a15, p11, aVar.e());
                p b11 = aVar.b();
                if (a15.f() || !C6496s.c(a15.A(), Integer.valueOf(a13))) {
                    a15.r(Integer.valueOf(a13));
                    a15.V(Integer.valueOf(a13), b11);
                }
                F1.b(a15, e11, aVar.d());
                f fVar = f.f12848a;
                pVar11.invoke(h10, Integer.valueOf((i20 >> 12) & 14));
                h10.u();
            }
            h10.M();
            h10.T(250379492);
            if (pVar12 != null) {
                i h13 = androidx.compose.ui.layout.a.b(i.f23074a, "Trailing").h(y.k());
                H0.F h14 = d.h(c.f23044a.e(), false);
                int a16 = C1494j.a(h10, 0);
                C1523y p12 = h10.p();
                i e12 = k0.h.e(h10, h13);
                C6787a a17 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a17);
                } else {
                    h10.q();
                }
                C1500m a18 = F1.a(h10);
                F1.b(a18, h14, aVar.c());
                F1.b(a18, p12, aVar.e());
                p b12 = aVar.b();
                if (a18.f() || !C6496s.c(a18.A(), Integer.valueOf(a16))) {
                    a18.r(Integer.valueOf(a16));
                    a18.V(Integer.valueOf(a16), b12);
                }
                F1.b(a18, e12, aVar.d());
                f fVar2 = f.f12848a;
                pVar12.invoke(h10, Integer.valueOf((i20 >> 15) & 14));
                h10.u();
            }
            h10.M();
            float g10 = n.g(n11, tVar);
            float f14 = n.f(n11, tVar);
            if (pVar11 != null) {
                i14 = 0;
                g10 = h.j(m.c(h.j(g10 - y.j()), h.j((float) 0)));
            } else {
                i14 = 0;
            }
            if (pVar12 != null) {
                f14 = h.j(m.c(h.j(f14 - y.j()), h.j((float) i14)));
            }
            h10.T(250410106);
            if (pVar13 != null) {
                i m10 = n.m(androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.k(androidx.compose.ui.layout.a.b(i.f23074a, "Prefix"), y.o(), 0.0f, 2, (Object) null), (c.C0368c) null, false, 3, (Object) null), g10, 0.0f, y.p(), 0.0f, 10, (Object) null);
                H0.F h15 = d.h(c.f23044a.o(), false);
                int a19 = C1494j.a(h10, 0);
                C1523y p13 = h10.p();
                i e13 = k0.h.e(h10, m10);
                C6787a a20 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a20);
                } else {
                    h10.q();
                }
                C1500m a21 = F1.a(h10);
                F1.b(a21, h15, aVar.c());
                F1.b(a21, p13, aVar.e());
                p b13 = aVar.b();
                if (a21.f() || !C6496s.c(a21.A(), Integer.valueOf(a19))) {
                    a21.r(Integer.valueOf(a19));
                    a21.V(Integer.valueOf(a19), b13);
                }
                F1.b(a21, e13, aVar.d());
                f fVar3 = f.f12848a;
                pVar13.invoke(h10, Integer.valueOf((i20 >> 18) & 14));
                h10.u();
            }
            h10.M();
            h10.T(250422072);
            if (pVar14 != null) {
                i m11 = n.m(androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.k(androidx.compose.ui.layout.a.b(i.f23074a, "Suffix"), y.o(), 0.0f, 2, (Object) null), (c.C0368c) null, false, 3, (Object) null), y.p(), 0.0f, f14, 0.0f, 10, (Object) null);
                H0.F h16 = d.h(c.f23044a.o(), false);
                int a22 = C1494j.a(h10, 0);
                C1523y p14 = h10.p();
                i e14 = k0.h.e(h10, m11);
                C6787a a23 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a23);
                } else {
                    h10.q();
                }
                C1500m a24 = F1.a(h10);
                f11 = g10;
                F1.b(a24, h16, aVar.c());
                F1.b(a24, p14, aVar.e());
                p b14 = aVar.b();
                if (a24.f() || !C6496s.c(a24.A(), Integer.valueOf(a22))) {
                    a24.r(Integer.valueOf(a22));
                    a24.V(Integer.valueOf(a22), b14);
                }
                F1.b(a24, e14, aVar.d());
                f fVar4 = f.f12848a;
                pVar14.invoke(h10, Integer.valueOf((i20 >> 21) & 14));
                h10.u();
            } else {
                f11 = g10;
            }
            h10.M();
            i.a aVar2 = i.f23074a;
            i v10 = androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.k(aVar2, y.o(), 0.0f, 2, (Object) null), (c.C0368c) null, false, 3, (Object) null);
            if (pVar13 == null) {
                f12 = f11;
            } else {
                f12 = h.j((float) 0);
            }
            if (pVar14 != null) {
                f14 = h.j((float) 0);
            }
            i m12 = n.m(v10, f12, 0.0f, f14, 0.0f, 10, (Object) null);
            h10.T(250444361);
            q qVar3 = qVar;
            if (qVar3 != null) {
                qVar3.invoke(androidx.compose.ui.layout.a.b(aVar2, "Hint").h(m12), h10, Integer.valueOf((i20 >> 3) & 112));
            }
            h10.M();
            i h17 = androidx.compose.ui.layout.a.b(aVar2, "TextField").h(m12);
            c.a aVar3 = c.f23044a;
            H0.F h18 = d.h(aVar3.o(), true);
            int a25 = C1494j.a(h10, 0);
            C1523y p15 = h10.p();
            i e15 = k0.h.e(h10, h17);
            C6787a a26 = aVar.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a26);
            } else {
                h10.q();
            }
            C1500m a27 = F1.a(h10);
            F1.b(a27, h18, aVar.c());
            F1.b(a27, p15, aVar.e());
            p b15 = aVar.b();
            if (a27.f() || !C6496s.c(a27.A(), Integer.valueOf(a25))) {
                a27.r(Integer.valueOf(a25));
                a27.V(Integer.valueOf(a25), b15);
            }
            F1.b(a27, e15, aVar.d());
            f fVar5 = f.f12848a;
            pVar.invoke(h10, Integer.valueOf((i20 >> 3) & 14));
            h10.u();
            h10.T(250455481);
            p pVar20 = pVar2;
            if (pVar20 != null) {
                i b16 = androidx.compose.ui.layout.a.b(androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.k(aVar2, c1.i.c(y.o(), y.m(), f13), 0.0f, 2, (Object) null), (c.C0368c) null, false, 3, (Object) null), "Label");
                H0.F h19 = d.h(aVar3.o(), false);
                int a28 = C1494j.a(h10, 0);
                C1523y p16 = h10.p();
                i e16 = k0.h.e(h10, b16);
                C6787a a29 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a29);
                } else {
                    h10.q();
                }
                C1500m a30 = F1.a(h10);
                F1.b(a30, h19, aVar.c());
                F1.b(a30, p16, aVar.e());
                p b17 = aVar.b();
                if (a30.f() || !C6496s.c(a30.A(), Integer.valueOf(a28))) {
                    a30.r(Integer.valueOf(a28));
                    a30.V(Integer.valueOf(a28), b17);
                }
                F1.b(a30, e16, aVar.d());
                pVar20.invoke(h10, Integer.valueOf((i20 >> 9) & 14));
                h10.u();
            }
            h10.M();
            h10.T(250473414);
            p pVar21 = pVar8;
            if (pVar21 != null) {
                i h20 = n.h(androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.k(androidx.compose.ui.layout.a.b(aVar2, "Supporting"), y.n(), 0.0f, 2, (Object) null), (c.C0368c) null, false, 3, (Object) null), Q0.q(Q0.f6883a, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null));
                H0.F h21 = d.h(aVar3.o(), false);
                int a31 = C1494j.a(h10, 0);
                C1523y p17 = h10.p();
                i e17 = k0.h.e(h10, h20);
                C6787a a32 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a32);
                } else {
                    h10.q();
                }
                C1500m a33 = F1.a(h10);
                F1.b(a33, h21, aVar.c());
                F1.b(a33, p17, aVar.e());
                p b18 = aVar.b();
                if (a33.f() || !C6496s.c(a33.A(), Integer.valueOf(a31))) {
                    a33.r(Integer.valueOf(a31));
                    a33.V(Integer.valueOf(a31), b18);
                }
                F1.b(a33, e17, aVar.d());
                pVar21.invoke(h10, Integer.valueOf((i21 >> 6) & 14));
                h10.u();
            }
            h10.M();
            h10.u();
            if (C1506p.H()) {
                C1506p.P();
            }
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            a aVar4 = r0;
            a aVar5 = new a(iVar, pVar, qVar, pVar2, pVar3, pVar4, pVar5, pVar6, z10, f10, lVar, pVar7, pVar8, n10, i10, i11);
            k10.a(aVar4);
        }
    }

    /* access modifiers changed from: private */
    public static final int g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, long j10, float f11, N n10) {
        int h10 = C6632a.h(i14, i16, i12, i13, C1943b.c(i15, 0, f10));
        float d10 = n10.d() * f11;
        return Math.max(c1.b.m(j10), Math.max(i10, Math.max(i11, Af.a.d(C1943b.b(d10, Math.max(d10, ((float) i15) / 2.0f), f10) + ((float) h10) + (n10.a() * f11)))) + i17);
    }

    /* access modifiers changed from: private */
    public static final int h(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, float f11, N n10) {
        int i17 = i12 + i13;
        int max = i10 + Math.max(i14 + i17, Math.max(i16 + i17, C1943b.c(i15, 0, f10))) + i11;
        t tVar = t.Ltr;
        return Math.max(max, Math.max(Af.a.d((((float) i15) + (h.j(n10.c(tVar) + n10.b(tVar)) * f11)) * f10), c1.b.n(j10)));
    }

    public static final i i(i iVar, C6787a aVar, N n10) {
        return androidx.compose.ui.draw.b.d(iVar, new b(aVar, n10));
    }

    /* access modifiers changed from: private */
    public static final void j(U.a aVar, int i10, int i11, U u10, U u11, U u12, U u13, U u14, U u15, U u16, U u17, U u18, float f10, boolean z10, float f11, t tVar, N n10) {
        int i12;
        float f12;
        U u19 = u12;
        U u20 = u13;
        U u21 = u15;
        U u22 = u16;
        float f13 = f10;
        boolean z11 = z10;
        U.a.j(aVar, u17, c1.n.f19226b.a(), 0.0f, 2, (Object) null);
        int t10 = i10 - y.t(u18);
        int d10 = Af.a.d(n10.d() * f11);
        int d11 = Af.a.d(n.g(n10, tVar) * f11);
        float j10 = y.j() * f11;
        if (u10 != null) {
            U.a.l(aVar, u10, 0, c.f23044a.i().a(u10.R0(), t10), 0.0f, 4, (Object) null);
        }
        if (u21 != null) {
            if (z11) {
                i12 = c.f23044a.i().a(u15.R0(), t10);
            } else {
                i12 = d10;
            }
            int c10 = C1943b.c(i12, -(u15.R0() / 2), f13);
            if (u10 == null) {
                f12 = 0.0f;
            } else {
                f12 = (((float) y.v(u10)) - j10) * (((float) 1) - f13);
            }
            U.a.l(aVar, u15, Af.a.d(f12) + d11, c10, 0.0f, 4, (Object) null);
        }
        if (u19 != null) {
            U.a.l(aVar, u12, y.v(u10), k(z11, t10, d10, u21, u19), 0.0f, 4, (Object) null);
        }
        int v10 = y.v(u10) + y.v(u12);
        U.a.l(aVar, u14, v10, k(z11, t10, d10, u21, u14), 0.0f, 4, (Object) null);
        if (u22 != null) {
            U.a.l(aVar, u16, v10, k(z11, t10, d10, u21, u22), 0.0f, 4, (Object) null);
        }
        if (u20 != null) {
            U.a.l(aVar, u13, (i11 - y.v(u11)) - u13.X0(), k(z11, t10, d10, u21, u20), 0.0f, 4, (Object) null);
        }
        if (u11 != null) {
            U.a.l(aVar, u11, i11 - u11.X0(), c.f23044a.i().a(u11.R0(), t10), 0.0f, 4, (Object) null);
        }
        if (u18 != null) {
            U.a.l(aVar, u18, 0, t10, 0.0f, 4, (Object) null);
        }
    }

    private static final int k(boolean z10, int i10, int i11, U u10, U u11) {
        if (z10) {
            i11 = c.f23044a.i().a(u11.R0(), i10);
        }
        return Math.max(i11, y.t(u10) / 2);
    }

    /* access modifiers changed from: private */
    public static final int l(int i10, int i11) {
        if (i10 == Integer.MAX_VALUE) {
            return i10;
        }
        return i10 - i11;
    }
}
