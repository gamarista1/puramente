package T8;

import J0.u0;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.o1;
import androidx.compose.ui.platform.B0;
import c1.t;
import k0.i;
import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import q0.C2427m;
import q0.C2428n;
import r0.C2468U;
import r0.C2520p0;
import r0.C2547y0;
import r0.O1;
import r0.P1;
import r0.Q1;
import r0.a2;
import r0.g2;
import t0.C2602c;
import t0.C2605f;
import t0.C2606g;
import w.C2763G;
import w.C2769M;
import w.C2770N;
import w.C2771O;
import w.C2777V;
import w.C2795g0;
import w.C2798j;
import w.n0;
import w.o0;
import w.r0;
import w.t0;
import yf.C6798l;
import yf.q;

public abstract class d {

    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34211a = new a();

        a() {
            super(3);
        }

        public final C2795g0 a(n0.b bVar, C1500m mVar, int i10) {
            C6496s.h(bVar, "$this$null");
            mVar.z(87515116);
            if (C1506p.H()) {
                C1506p.Q(87515116, i10, -1, "com.google.accompanist.placeholder.placeholder.<anonymous> (Placeholder.kt:124)");
            }
            C2795g0 h10 = C2798j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.R();
            return h10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((n0.b) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    static final class b extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34212a = new b();

        b() {
            super(3);
        }

        public final C2795g0 a(n0.b bVar, C1500m mVar, int i10) {
            C6496s.h(bVar, "$this$null");
            mVar.z(-439090190);
            if (C1506p.H()) {
                C1506p.Q(-439090190, i10, -1, "com.google.accompanist.placeholder.placeholder.<anonymous> (Placeholder.kt:125)");
            }
            C2795g0 h10 = C2798j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.R();
            return h10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((n0.b) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    static final class c extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f34213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f34214b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f34215c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f34216d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f34217e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g2 f34218f;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Q1 f34219a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ u0 f34220b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ g2 f34221c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f34222d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f34223e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ u0 f34224f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ u0 f34225g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ A1 f34226h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ A1 f34227i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C1510r0 f34228j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Q1 q12, u0 u0Var, g2 g2Var, long j10, b bVar, u0 u0Var2, u0 u0Var3, A1 a12, A1 a13, C1510r0 r0Var) {
                super(1);
                this.f34219a = q12;
                this.f34220b = u0Var;
                this.f34221c = g2Var;
                this.f34222d = j10;
                this.f34223e = bVar;
                this.f34224f = u0Var2;
                this.f34225g = u0Var3;
                this.f34226h = a12;
                this.f34227i = a13;
                this.f34228j = r0Var;
            }

            public final void a(C2602c cVar) {
                C6496s.h(cVar, "$this$drawWithContent");
                float a10 = c.h(this.f34226h);
                if (0.01f <= a10 && a10 <= 0.99f) {
                    this.f34219a.c(c.h(this.f34226h));
                    Q1 q12 = this.f34219a;
                    C2520p0 f10 = cVar.w1().f();
                    f10.g(C2428n.c(cVar.d()), q12);
                    cVar.H1();
                    f10.h();
                } else if (c.h(this.f34226h) >= 0.99f) {
                    cVar.H1();
                }
                float c10 = c.l(this.f34227i);
                if (0.01f <= c10 && c10 <= 0.99f) {
                    this.f34219a.c(c.l(this.f34227i));
                    Q1 q13 = this.f34219a;
                    u0 u0Var = this.f34220b;
                    g2 g2Var = this.f34221c;
                    long j10 = this.f34222d;
                    b bVar = this.f34223e;
                    u0 u0Var2 = this.f34224f;
                    u0 u0Var3 = this.f34225g;
                    C1510r0 r0Var = this.f34228j;
                    C2520p0 f11 = cVar.w1().f();
                    f11.g(C2428n.c(cVar.d()), q13);
                    u0Var.b(d.b(cVar, g2Var, j10, bVar, c.i(r0Var), (O1) u0Var.a(), (t) u0Var2.a(), (C2427m) u0Var3.a()));
                    f11.h();
                } else if (c.l(this.f34227i) >= 0.99f) {
                    this.f34220b.b(d.b(cVar, this.f34221c, this.f34222d, this.f34223e, c.i(this.f34228j), (O1) this.f34220b.a(), (t) this.f34224f.a(), (C2427m) this.f34225g.a()));
                }
                this.f34225g.b(C2427m.c(cVar.d()));
                this.f34224f.b(cVar.getLayoutDirection());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2602c) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(q qVar, q qVar2, b bVar, boolean z10, long j10, g2 g2Var) {
            super(3);
            this.f34213a = qVar;
            this.f34214b = qVar2;
            this.f34215c = bVar;
            this.f34216d = z10;
            this.f34217e = j10;
            this.f34218f = g2Var;
        }

        /* access modifiers changed from: private */
        public static final float h(A1 a12) {
            return ((Number) a12.getValue()).floatValue();
        }

        /* access modifiers changed from: private */
        public static final float i(C1510r0 r0Var) {
            return ((Number) r0Var.getValue()).floatValue();
        }

        private static final void j(C1510r0 r0Var, float f10) {
            r0Var.setValue(Float.valueOf(f10));
        }

        /* access modifiers changed from: private */
        public static final float l(A1 a12) {
            return ((Number) a12.getValue()).floatValue();
        }

        public final i e(i iVar, C1500m mVar, int i10) {
            float f10;
            float f11;
            float f12;
            C2769M m10;
            C1510r0 r0Var;
            i iVar2 = iVar;
            C1500m mVar2 = mVar;
            C6496s.h(iVar2, "$this$composed");
            mVar2.z(-1214629560);
            if (C1506p.H()) {
                C1506p.Q(-1214629560, i10, -1, "com.google.accompanist.placeholder.placeholder.<anonymous> (Placeholder.kt:137)");
            }
            mVar2.z(804161266);
            Object A10 = mVar.A();
            C1500m.a aVar = C1500m.f10026a;
            if (A10 == aVar.a()) {
                A10 = new u0();
                mVar2.r(A10);
            }
            u0 u0Var = (u0) A10;
            mVar.R();
            mVar2.z(804161321);
            Object A11 = mVar.A();
            if (A11 == aVar.a()) {
                A11 = new u0();
                mVar2.r(A11);
            }
            u0 u0Var2 = (u0) A11;
            mVar.R();
            mVar2.z(804161379);
            Object A12 = mVar.A();
            if (A12 == aVar.a()) {
                A12 = new u0();
                mVar2.r(A12);
            }
            u0 u0Var3 = (u0) A12;
            mVar.R();
            mVar2.z(804161492);
            Object A13 = mVar.A();
            if (A13 == aVar.a()) {
                A13 = u1.d(Float.valueOf(0.0f), (o1) null, 2, (Object) null);
                mVar2.r(A13);
            }
            C1510r0 r0Var2 = (C1510r0) A13;
            mVar.R();
            mVar2.z(804161591);
            boolean z10 = this.f34216d;
            Object A14 = mVar.A();
            if (A14 == aVar.a()) {
                A14 = new C2777V(Boolean.valueOf(z10));
                mVar2.r(A14);
            }
            C2777V v10 = (C2777V) A14;
            mVar.R();
            v10.h(Boolean.valueOf(this.f34216d));
            n0 h10 = o0.h(v10, "placeholder_crossfade", mVar2, C2777V.f27247d | 48, 0);
            q qVar = this.f34213a;
            C6490l lVar = C6490l.f71789a;
            r0 f13 = t0.f(lVar);
            boolean booleanValue = ((Boolean) h10.i()).booleanValue();
            mVar2.z(-2085173843);
            if (C1506p.H()) {
                C1506p.Q(-2085173843, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:153)");
            }
            float f14 = 1.0f;
            if (booleanValue) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.R();
            Float valueOf = Float.valueOf(f10);
            boolean booleanValue2 = ((Boolean) h10.p()).booleanValue();
            mVar2.z(-2085173843);
            if (C1506p.H()) {
                C1506p.Q(-2085173843, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:153)");
            }
            if (booleanValue2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.R();
            C1510r0 r0Var3 = r0Var2;
            A1 d10 = o0.d(h10, valueOf, Float.valueOf(f11), (C2763G) qVar.invoke(h10.n(), mVar2, 0), f13, "placeholder_fade", mVar, 196608);
            q qVar2 = this.f34214b;
            r0 f15 = t0.f(lVar);
            boolean booleanValue3 = ((Boolean) h10.i()).booleanValue();
            mVar2.z(992792551);
            if (C1506p.H()) {
                C1506p.Q(992792551, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:158)");
            }
            if (booleanValue3) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.R();
            Float valueOf2 = Float.valueOf(f12);
            boolean booleanValue4 = ((Boolean) h10.p()).booleanValue();
            mVar2.z(992792551);
            if (C1506p.H()) {
                C1506p.Q(992792551, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:158)");
            }
            if (booleanValue4) {
                f14 = 0.0f;
            }
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.R();
            A1 d11 = o0.d(h10, valueOf2, Float.valueOf(f14), (C2763G) qVar2.invoke(h10.n(), mVar2, 0), f15, "content_fade", mVar, 196608);
            b bVar = this.f34215c;
            if (bVar != null) {
                m10 = bVar.b();
            } else {
                m10 = null;
            }
            mVar2.z(804162378);
            if (m10 == null || (!this.f34216d && l(d10) < 0.01f)) {
                r0Var = r0Var3;
            } else {
                r0Var = r0Var3;
                j(r0Var, ((Number) C2771O.a(C2771O.c((String) null, mVar2, 0, 1), 0.0f, 1.0f, m10, (String) null, mVar, C2770N.f27201f | 432 | (C2769M.f27197d << 9), 8).getValue()).floatValue());
            }
            mVar.R();
            mVar2.z(804162715);
            Object A15 = mVar.A();
            if (A15 == aVar.a()) {
                A15 = C2468U.a();
                mVar2.r(A15);
            }
            Q1 q12 = (Q1) A15;
            mVar.R();
            mVar2.z(804162740);
            boolean e10 = mVar2.e(this.f34217e) | mVar2.S(this.f34218f) | mVar2.S(this.f34215c);
            g2 g2Var = this.f34218f;
            long j10 = this.f34217e;
            b bVar2 = this.f34215c;
            Object A16 = mVar.A();
            if (e10 || A16 == aVar.a()) {
                A16 = androidx.compose.ui.draw.b.d(iVar2, new a(q12, u0Var3, g2Var, j10, bVar2, u0Var2, u0Var, d11, d10, r0Var));
                mVar2.r(A16);
            }
            i iVar3 = (i) A16;
            mVar.R();
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.R();
            return iVar3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return e((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: T8.d$d  reason: collision with other inner class name */
    public static final class C0557d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f34229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34230b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f34231c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g2 f34232d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0557d(boolean z10, long j10, b bVar, g2 g2Var) {
            super(1);
            this.f34229a = z10;
            this.f34230b = j10;
            this.f34231c = bVar;
            this.f34232d = g2Var;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public static final O1 b(C2605f fVar, g2 g2Var, long j10, b bVar, float f10, O1 o12, t tVar, C2427m mVar) {
        g2 g2Var2 = g2Var;
        b bVar2 = bVar;
        float f11 = f10;
        O1 o13 = null;
        if (g2Var2 == a2.a()) {
            C2605f.c0(fVar, j10, 0, 0, 0.0f, (C2606g) null, (C2547y0) null, 0, 126, (Object) null);
            if (bVar2 != null) {
                C2605f.c1(fVar, bVar2.a(f11, fVar.d()), 0, 0, bVar.c(f10), (C2606g) null, (C2547y0) null, 0, 118, (Object) null);
            }
            return null;
        }
        if (C2427m.g(fVar.d(), mVar) && fVar.getLayoutDirection() == tVar) {
            o13 = o12;
        }
        if (o13 == null) {
            o13 = g2Var2.m12createOutlinePq9zytI(fVar.d(), fVar.getLayoutDirection(), fVar);
        } else {
            C2605f fVar2 = fVar;
        }
        P1.e(fVar, o13, j10, 0.0f, (C2606g) null, (C2547y0) null, 0, 60, (Object) null);
        if (bVar2 != null) {
            P1.c(fVar, o13, bVar2.a(f11, fVar.d()), bVar.c(f10), (C2606g) null, (C2547y0) null, 0, 56, (Object) null);
        }
        return o13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: T8.d$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: T8.d$d} */
    /* JADX WARNING: type inference failed for: r1v5, types: [yf.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final k0.i c(k0.i r12, boolean r13, long r14, r0.g2 r16, T8.b r17, yf.q r18, yf.q r19) {
        /*
            r0 = r12
            java.lang.String r1 = "$this$placeholder"
            kotlin.jvm.internal.C6496s.h(r12, r1)
            java.lang.String r1 = "shape"
            r9 = r16
            kotlin.jvm.internal.C6496s.h(r9, r1)
            java.lang.String r1 = "placeholderFadeTransitionSpec"
            r8 = r18
            kotlin.jvm.internal.C6496s.h(r8, r1)
            java.lang.String r1 = "contentFadeTransitionSpec"
            r10 = r19
            kotlin.jvm.internal.C6496s.h(r10, r1)
            boolean r1 = androidx.compose.ui.platform.C1676z0.b()
            if (r1 == 0) goto L_0x002e
            T8.d$d r1 = new T8.d$d
            r2 = r1
            r3 = r13
            r4 = r14
            r6 = r17
            r7 = r16
            r2.<init>(r3, r4, r6, r7)
            goto L_0x0032
        L_0x002e:
            yf.l r1 = androidx.compose.ui.platform.C1676z0.a()
        L_0x0032:
            T8.d$c r11 = new T8.d$c
            r2 = r11
            r3 = r18
            r4 = r19
            r5 = r17
            r6 = r13
            r7 = r14
            r9 = r16
            r2.<init>(r3, r4, r5, r6, r7, r9)
            k0.i r0 = k0.h.b(r12, r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T8.d.c(k0.i, boolean, long, r0.g2, T8.b, yf.q, yf.q):k0.i");
    }

    public static /* synthetic */ i d(i iVar, boolean z10, long j10, g2 g2Var, b bVar, q qVar, q qVar2, int i10, Object obj) {
        g2 g2Var2;
        b bVar2;
        a aVar;
        b bVar3;
        if ((i10 & 4) != 0) {
            g2Var2 = a2.a();
        } else {
            g2Var2 = g2Var;
        }
        if ((i10 & 8) != 0) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        if ((i10 & 16) != 0) {
            aVar = a.f34211a;
        } else {
            aVar = qVar;
        }
        if ((i10 & 32) != 0) {
            bVar3 = b.f34212a;
        } else {
            bVar3 = qVar2;
        }
        return c(iVar, z10, j10, g2Var2, bVar2, aVar, bVar3);
    }
}
