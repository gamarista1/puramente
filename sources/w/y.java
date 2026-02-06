package W;

import C.N;
import H0.C1193n;
import H0.C1200v;
import H0.F;
import J0.C1241g;
import O0.t;
import O0.v;
import Q0.A;
import Q0.T;
import Q0.U;
import V.C1394m0;
import V.P0;
import W0.c0;
import Y.A1;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.C1521x;
import Y.C1523y;
import Y.F1;
import Y.J0;
import Y.M0;
import Y.Y0;
import Y.p1;
import b1.C1869a;
import b1.C1876h;
import b1.s;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.C6501x;
import lf.C6514M;
import o0.C2341d;
import o0.C2345h;
import q0.C2427m;
import q0.C2428n;
import r0.C2443E0;
import r0.C2544x0;
import r0.C2547y0;
import r0.O1;
import r0.P1;
import r0.e2;
import r0.g2;
import t0.C2605f;
import t0.C2606g;
import v.C2737t;
import w.C2760D;
import w.C2786c;
import w.C2798j;
import x.C2869h;
import yf.C6787a;
import yf.C6798l;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private static final long f8398a = c1.c.a(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    private static final float f8399b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f8400c = c1.h.j((float) 12);

    /* renamed from: d  reason: collision with root package name */
    private static final float f8401d = c1.h.j((float) 4);

    /* renamed from: e  reason: collision with root package name */
    private static final float f8402e = c1.h.j((float) 2);

    /* renamed from: f  reason: collision with root package name */
    private static final float f8403f = c1.h.j((float) 24);

    /* renamed from: g  reason: collision with root package name */
    private static final float f8404g;

    /* renamed from: h  reason: collision with root package name */
    private static final float f8405h;

    /* renamed from: i  reason: collision with root package name */
    private static final k0.i f8406i;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f8407a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1510r0 f8408b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(float f10, C1510r0 r0Var) {
            super(1);
            this.f8407a = f10;
            this.f8408b = r0Var;
        }

        public final void a(long j10) {
            float k10 = C2427m.k(j10) * this.f8407a;
            float i10 = C2427m.i(j10) * this.f8407a;
            if (C2427m.k(((C2427m) this.f8408b.getValue()).o()) != k10 || C2427m.i(((C2427m) this.f8408b.getValue()).o()) != i10) {
                this.f8408b.setValue(C2427m.c(C2428n.a(k10, i10)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C2427m) obj).o());
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1510r0 f8409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f8410b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ yf.p f8411c;

        /* synthetic */ class a extends C6501x {
            a(Object obj) {
                super(obj, C1510r0.class, "value", "getValue()Ljava/lang/Object;", 0);
            }

            public Object get() {
                return ((C1510r0) this.receiver).getValue();
            }

            public void set(Object obj) {
                ((C1510r0) this.receiver).setValue(obj);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1510r0 r0Var, N n10, yf.p pVar) {
            super(2);
            this.f8409a = r0Var;
            this.f8410b = n10;
            this.f8411c = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(157291737, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
                }
                k0.i i11 = C1394m0.i(androidx.compose.ui.layout.a.b(k0.i.f23074a, "Container"), new a(this.f8409a), this.f8410b);
                yf.p pVar = this.f8411c;
                F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), true);
                int a10 = C1494j.a(mVar, 0);
                C1523y p10 = mVar.p();
                k0.i e10 = k0.h.e(mVar, i11);
                C1241g.a aVar = C1241g.f3853J;
                C6787a a11 = aVar.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar.U(a11);
                } else {
                    mVar.q();
                }
                C1500m a12 = F1.a(mVar);
                F1.b(a12, h10, aVar.c());
                F1.b(a12, p10, aVar.e());
                yf.p b10 = aVar.b();
                if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                    a12.r(Integer.valueOf(a10));
                    a12.V(Integer.valueOf(a10), b10);
                }
                F1.b(a12, e10, aVar.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                pVar.invoke(mVar, 0);
                mVar.u();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ yf.p f8412a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(yf.p pVar) {
            super(2);
            this.f8412a = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1750327932, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
                }
                k0.i b10 = androidx.compose.ui.layout.a.b(k0.i.f23074a, "Container");
                yf.p pVar = this.f8412a;
                F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), true);
                int a10 = C1494j.a(mVar, 0);
                C1523y p10 = mVar.p();
                k0.i e10 = k0.h.e(mVar, b10);
                C1241g.a aVar = C1241g.f3853J;
                C6787a a11 = aVar.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar.U(a11);
                } else {
                    mVar.q();
                }
                C1500m a12 = F1.a(mVar);
                F1.b(a12, h10, aVar.c());
                F1.b(a12, p10, aVar.e());
                yf.p b11 = aVar.b();
                if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                    a12.r(Integer.valueOf(a10));
                    a12.V(Integer.valueOf(a10), b11);
                }
                F1.b(a12, e10, aVar.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                pVar.invoke(mVar, 0);
                mVar.u();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ T f8413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ T f8414b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f8415c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1 f8416d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ yf.p f8417e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f8418f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1 f8419g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(T t10, T t11, float f10, A1 a12, yf.p pVar, boolean z10, A1 a13) {
            super(2);
            this.f8413a = t10;
            this.f8414b = t11;
            this.f8415c = f10;
            this.f8416d = a12;
            this.f8417e = pVar;
            this.f8418f = z10;
            this.f8419g = a13;
        }

        public final void a(C1500m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1236585568, i11, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
                }
                T c10 = U.c(this.f8413a, this.f8414b, this.f8415c);
                boolean z10 = this.f8418f;
                A1 a12 = this.f8419g;
                if (z10) {
                    c10 = T.c(c10, ((C2544x0) a12.getValue()).y(), 0, (V0.p) null, (V0.n) null, (V0.o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (X0.e) null, 0, (b1.k) null, (e2) null, (C2606g) null, 0, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777214, (Object) null);
                }
                y.d(((C2544x0) this.f8416d.getValue()).y(), c10, this.f8417e, mVar, 0);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f8420a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ yf.p f8421b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(long j10, yf.p pVar) {
            super(2);
            this.f8420a = j10;
            this.f8421b = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-130107406, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
                }
                y.e(this.f8420a, this.f8421b, mVar, 0);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class f extends C6498u implements yf.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f8422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f8423b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f8424c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ yf.p f8425d;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f8426a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(A1 a12) {
                super(1);
                this.f8426a = a12;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.c(((Number) this.f8426a.getValue()).floatValue());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(A1 a12, long j10, T t10, yf.p pVar) {
            super(3);
            this.f8422a = a12;
            this.f8423b = j10;
            this.f8424c = t10;
            this.f8425d = pVar;
        }

        public final void a(k0.i iVar, C1500m mVar, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                if (mVar.S(iVar)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i10 |= i11;
            }
            if ((i10 & 19) != 18 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-660524084, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
                }
                boolean S10 = mVar.S(this.f8422a);
                A1 a12 = this.f8422a;
                Object A10 = mVar.A();
                if (S10 || A10 == C1500m.f10026a.a()) {
                    A10 = new a(a12);
                    mVar.r(A10);
                }
                k0.i a10 = androidx.compose.ui.graphics.b.a(iVar, (C6798l) A10);
                long j10 = this.f8423b;
                T t10 = this.f8424c;
                yf.p pVar = this.f8425d;
                F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                int a11 = C1494j.a(mVar, 0);
                C1523y p10 = mVar.p();
                k0.i e10 = k0.h.e(mVar, a10);
                C1241g.a aVar = C1241g.f3853J;
                C6787a a13 = aVar.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar.U(a13);
                } else {
                    mVar.q();
                }
                C1500m a14 = F1.a(mVar);
                F1.b(a14, h10, aVar.c());
                F1.b(a14, p10, aVar.e());
                yf.p b10 = aVar.b();
                if (a14.f() || !C6496s.c(a14.A(), Integer.valueOf(a11))) {
                    a14.r(Integer.valueOf(a11));
                    a14.V(Integer.valueOf(a11), b10);
                }
                F1.b(a14, e10, aVar.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                y.d(j10, t10, pVar, mVar, 0);
                mVar.u();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((k0.i) obj, (C1500m) obj2, ((Number) obj3).intValue());
            return C6514M.f71813a;
        }
    }

    static final class g extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f8427a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f8428b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f8429c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ yf.p f8430d;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f8431a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(A1 a12) {
                super(1);
                this.f8431a = a12;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.c(((Number) this.f8431a.getValue()).floatValue());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(A1 a12, long j10, T t10, yf.p pVar) {
            super(2);
            this.f8427a = a12;
            this.f8428b = j10;
            this.f8429c = t10;
            this.f8430d = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(274398694, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:178)");
                }
                i.a aVar = k0.i.f23074a;
                boolean S10 = mVar.S(this.f8427a);
                A1 a12 = this.f8427a;
                Object A10 = mVar.A();
                if (S10 || A10 == C1500m.f10026a.a()) {
                    A10 = new a(a12);
                    mVar.r(A10);
                }
                k0.i a10 = androidx.compose.ui.graphics.b.a(aVar, (C6798l) A10);
                long j10 = this.f8428b;
                T t10 = this.f8429c;
                yf.p pVar = this.f8430d;
                F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                int a11 = C1494j.a(mVar, 0);
                C1523y p10 = mVar.p();
                k0.i e10 = k0.h.e(mVar, a10);
                C1241g.a aVar2 = C1241g.f3853J;
                C6787a a13 = aVar2.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar.U(a13);
                } else {
                    mVar.q();
                }
                C1500m a14 = F1.a(mVar);
                F1.b(a14, h10, aVar2.c());
                F1.b(a14, p10, aVar2.e());
                yf.p b10 = aVar2.b();
                if (a14.f() || !C6496s.c(a14.A(), Integer.valueOf(a11))) {
                    a14.r(Integer.valueOf(a11));
                    a14.V(Integer.valueOf(a11), b10);
                }
                F1.b(a14, e10, aVar2.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                y.d(j10, t10, pVar, mVar, 0);
                mVar.u();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class h extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f8432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f8433b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f8434c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ yf.p f8435d;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f8436a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(A1 a12) {
                super(1);
                this.f8436a = a12;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.c(((Number) this.f8436a.getValue()).floatValue());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(A1 a12, long j10, T t10, yf.p pVar) {
            super(2);
            this.f8432a = a12;
            this.f8433b = j10;
            this.f8434c = t10;
            this.f8435d = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1526229403, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:192)");
                }
                i.a aVar = k0.i.f23074a;
                boolean S10 = mVar.S(this.f8432a);
                A1 a12 = this.f8432a;
                Object A10 = mVar.A();
                if (S10 || A10 == C1500m.f10026a.a()) {
                    A10 = new a(a12);
                    mVar.r(A10);
                }
                k0.i a10 = androidx.compose.ui.graphics.b.a(aVar, (C6798l) A10);
                long j10 = this.f8433b;
                T t10 = this.f8434c;
                yf.p pVar = this.f8435d;
                F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                int a11 = C1494j.a(mVar, 0);
                C1523y p10 = mVar.p();
                k0.i e10 = k0.h.e(mVar, a10);
                C1241g.a aVar2 = C1241g.f3853J;
                C6787a a13 = aVar2.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar.U(a13);
                } else {
                    mVar.q();
                }
                C1500m a14 = F1.a(mVar);
                F1.b(a14, h10, aVar2.c());
                F1.b(a14, p10, aVar2.e());
                yf.p b10 = aVar2.b();
                if (a14.f() || !C6496s.c(a14.A(), Integer.valueOf(a11))) {
                    a14.r(Integer.valueOf(a11));
                    a14.V(Integer.valueOf(a11), b10);
                }
                F1.b(a14, e10, aVar2.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                y.d(j10, t10, pVar, mVar, 0);
                mVar.u();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class i extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f8437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ T f8438b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ yf.p f8439c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(long j10, T t10, yf.p pVar) {
            super(2);
            this.f8437a = j10;
            this.f8438b = t10;
            this.f8439c = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1263707005, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
                }
                y.d(this.f8437a, this.f8438b, this.f8439c, mVar, 0);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class j extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f8440a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ yf.p f8441b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(long j10, yf.p pVar) {
            super(2);
            this.f8440a = j10;
            this.f8441b = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(2079816678, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
                }
                y.e(this.f8440a, this.f8441b, mVar, 0);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class k extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f8442a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(A1 a12) {
            super(0);
            this.f8442a = a12;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            boolean z10;
            if (((Number) this.f8442a.getValue()).floatValue() > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class l extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f8443a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(A1 a12) {
            super(0);
            this.f8443a = a12;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            boolean z10;
            if (((Number) this.f8443a.getValue()).floatValue() > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class m extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f8444a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8445b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ yf.p f8446c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c0 f8447d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ yf.p f8448e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ yf.p f8449f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ yf.p f8450g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ yf.p f8451h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ yf.p f8452i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ yf.p f8453j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ yf.p f8454k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f8455l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f8456m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f8457n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ B.j f8458o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ N f8459p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ P0 f8460q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ yf.p f8461r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f8462s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f8463t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f8464u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(E e10, String str, yf.p pVar, c0 c0Var, yf.p pVar2, yf.p pVar3, yf.p pVar4, yf.p pVar5, yf.p pVar6, yf.p pVar7, yf.p pVar8, boolean z10, boolean z11, boolean z12, B.j jVar, N n10, P0 p02, yf.p pVar9, int i10, int i11, int i12) {
            super(2);
            this.f8444a = e10;
            this.f8445b = str;
            this.f8446c = pVar;
            this.f8447d = c0Var;
            this.f8448e = pVar2;
            this.f8449f = pVar3;
            this.f8450g = pVar4;
            this.f8451h = pVar5;
            this.f8452i = pVar6;
            this.f8453j = pVar7;
            this.f8454k = pVar8;
            this.f8455l = z10;
            this.f8456m = z11;
            this.f8457n = z12;
            this.f8458o = jVar;
            this.f8459p = n10;
            this.f8460q = p02;
            this.f8461r = pVar9;
            this.f8462s = i10;
            this.f8463t = i11;
            this.f8464u = i12;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            E e10 = this.f8444a;
            E e11 = e10;
            y.a(e11, this.f8445b, this.f8446c, this.f8447d, this.f8448e, this.f8449f, this.f8450g, this.f8451h, this.f8452i, this.f8453j, this.f8454k, this.f8455l, this.f8456m, this.f8457n, this.f8458o, this.f8459p, this.f8460q, this.f8461r, mVar2, M0.a(this.f8462s | 1), M0.a(this.f8463t), this.f8464u);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class n extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f8465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ T f8466b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ yf.p f8467c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f8468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(long j10, T t10, yf.p pVar, int i10) {
            super(2);
            this.f8465a = j10;
            this.f8466b = t10;
            this.f8467c = pVar;
            this.f8468d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            y.d(this.f8465a, this.f8466b, this.f8467c, mVar, M0.a(this.f8468d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class o extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f8469a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ yf.p f8470b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8471c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(long j10, yf.p pVar, int i10) {
            super(2);
            this.f8469a = j10;
            this.f8470b = pVar;
            this.f8471c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            y.e(this.f8469a, this.f8470b, mVar, M0.a(this.f8471c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ class p {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8472a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f8473b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        static {
            /*
                W.E[] r0 = W.E.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                W.E r2 = W.E.Filled     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                W.E r3 = W.E.Outlined     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f8472a = r0
                W.m[] r0 = W.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                W.m r3 = W.m.Focused     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                W.m r1 = W.m.UnfocusedEmpty     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                W.m r1 = W.m.UnfocusedNotEmpty     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f8473b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: W.y.p.<clinit>():void");
        }
    }

    static final class q extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8474a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(1);
            this.f8474a = str;
        }

        public final void a(v vVar) {
            t.n(vVar, this.f8474a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    static final class r extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g2 f8475a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2443E0 f8476b;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ O1 f8477a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2443E0 f8478b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(O1 o12, C2443E0 e02) {
                super(1);
                this.f8477a = o12;
                this.f8478b = e02;
            }

            public final void a(C2605f fVar) {
                P1.e(fVar, this.f8477a, this.f8478b.a(), 0.0f, (C2606g) null, (C2547y0) null, 0, 60, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2605f) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(g2 g2Var, C2443E0 e02) {
            super(1);
            this.f8475a = g2Var;
            this.f8476b = e02;
        }

        /* renamed from: a */
        public final C2345h invoke(C2341d dVar) {
            return dVar.e(new a(this.f8475a.m12createOutlinePq9zytI(dVar.d(), dVar.getLayoutDirection(), dVar), this.f8476b));
        }
    }

    static {
        float f10 = (float) 16;
        f8399b = c1.h.j(f10);
        f8404g = c1.h.j(f10);
        f8405h = c1.h.j(f10);
        float f11 = (float) 48;
        f8406i = androidx.compose.foundation.layout.q.a(k0.i.f23074a, c1.h.j(f11), c1.h.j(f11));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: W0.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: w.r0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: w.r0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v67, resolved type: W0.a0} */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x04ad, code lost:
        if (r1 != false) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x04f7, code lost:
        if (r1 != false) goto L_0x04ef;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x060c  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0653  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0685  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0693  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x069b  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x06e2  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0729  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x074d  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0753  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x075a  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x079e  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x07a0  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x07d8  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x07fe  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x081a  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x082d  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x084d  */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x0869  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x0880  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x089a  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x08aa  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x08b2  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x08d4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x08dc  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0903  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x091f  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x09c8  */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x0a1b  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0a2f  */
    /* JADX WARNING: Removed duplicated region for block: B:498:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(W.E r48, java.lang.String r49, yf.p r50, W0.c0 r51, yf.p r52, yf.p r53, yf.p r54, yf.p r55, yf.p r56, yf.p r57, yf.p r58, boolean r59, boolean r60, boolean r61, B.j r62, C.N r63, V.P0 r64, yf.p r65, Y.C1500m r66, int r67, int r68, int r69) {
        /*
            r4 = r51
            r5 = r52
            r15 = r62
            r14 = r63
            r13 = r64
            r12 = r65
            r11 = r67
            r10 = r68
            r9 = r69
            java.lang.String r0 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)"
            java.lang.String r1 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)"
            r18 = 16
            r19 = 4
            r7 = 48
            r6 = 6
            r8 = 1514469103(0x5a44f6ef, float:1.38601504E16)
            r2 = r66
            Y.m r2 = r2.h(r8)
            r8 = 1
            r27 = r9 & 1
            r8 = 2
            if (r27 == 0) goto L_0x0033
            r27 = r11 | 6
            r6 = r48
            r28 = r27
            goto L_0x0049
        L_0x0033:
            r27 = r11 & 6
            r6 = r48
            if (r27 != 0) goto L_0x0047
            boolean r28 = r2.S(r6)
            if (r28 == 0) goto L_0x0042
            r28 = r19
            goto L_0x0044
        L_0x0042:
            r28 = r8
        L_0x0044:
            r28 = r11 | r28
            goto L_0x0049
        L_0x0047:
            r28 = r11
        L_0x0049:
            r29 = r9 & 2
            if (r29 == 0) goto L_0x0054
            r28 = r28 | 48
            r8 = r49
        L_0x0051:
            r7 = r28
            goto L_0x0068
        L_0x0054:
            r29 = r11 & 48
            r8 = r49
            if (r29 != 0) goto L_0x0051
            boolean r31 = r2.S(r8)
            if (r31 == 0) goto L_0x0063
            r31 = 32
            goto L_0x0065
        L_0x0063:
            r31 = r18
        L_0x0065:
            r28 = r28 | r31
            goto L_0x0051
        L_0x0068:
            r28 = r9 & 4
            if (r28 == 0) goto L_0x0071
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x006e:
            r3 = r50
            goto L_0x0084
        L_0x0071:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x006e
            r3 = r50
            boolean r31 = r2.C(r3)
            if (r31 == 0) goto L_0x0080
            r31 = 256(0x100, float:3.59E-43)
            goto L_0x0082
        L_0x0080:
            r31 = 128(0x80, float:1.794E-43)
        L_0x0082:
            r7 = r7 | r31
        L_0x0084:
            r31 = r9 & 8
            if (r31 == 0) goto L_0x008b
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x009b
        L_0x008b:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x009b
            boolean r3 = r2.S(r4)
            if (r3 == 0) goto L_0x0098
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x009a
        L_0x0098:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x009a:
            r7 = r7 | r3
        L_0x009b:
            r3 = r9 & 16
            if (r3 == 0) goto L_0x00a2
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b2
        L_0x00a2:
            r3 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00b2
            boolean r3 = r2.C(r5)
            if (r3 == 0) goto L_0x00af
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b1
        L_0x00af:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00b1:
            r7 = r7 | r3
        L_0x00b2:
            r3 = r9 & 32
            r33 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00bd
            r7 = r7 | r33
            r6 = r53
            goto L_0x00d0
        L_0x00bd:
            r34 = r11 & r33
            r6 = r53
            if (r34 != 0) goto L_0x00d0
            boolean r34 = r2.C(r6)
            if (r34 == 0) goto L_0x00cc
            r34 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ce
        L_0x00cc:
            r34 = 65536(0x10000, float:9.18355E-41)
        L_0x00ce:
            r7 = r7 | r34
        L_0x00d0:
            r34 = r9 & 64
            r35 = 1572864(0x180000, float:2.204052E-39)
            if (r34 == 0) goto L_0x00db
            r7 = r7 | r35
        L_0x00d8:
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x00ef
        L_0x00db:
            r36 = r11 & r35
            r6 = r54
            if (r36 != 0) goto L_0x00d8
            boolean r36 = r2.C(r6)
            if (r36 == 0) goto L_0x00ea
            r36 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ec
        L_0x00ea:
            r36 = 524288(0x80000, float:7.34684E-40)
        L_0x00ec:
            r7 = r7 | r36
            goto L_0x00d8
        L_0x00ef:
            r8 = r9 & 128(0x80, float:1.794E-43)
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L_0x00fc
            r7 = r7 | r28
        L_0x00f7:
            r25 = r0
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0110
        L_0x00fc:
            r36 = r11 & r28
            r6 = r55
            if (r36 != 0) goto L_0x00f7
            boolean r37 = r2.C(r6)
            if (r37 == 0) goto L_0x010b
            r37 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010d
        L_0x010b:
            r37 = 4194304(0x400000, float:5.877472E-39)
        L_0x010d:
            r7 = r7 | r37
            goto L_0x00f7
        L_0x0110:
            r0 = r9 & 256(0x100, float:3.59E-43)
            r37 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x011b
            r7 = r7 | r37
            r6 = r56
            goto L_0x012e
        L_0x011b:
            r37 = r11 & r37
            r6 = r56
            if (r37 != 0) goto L_0x012e
            boolean r38 = r2.C(r6)
            if (r38 == 0) goto L_0x012a
            r38 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012c
        L_0x012a:
            r38 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012c:
            r7 = r7 | r38
        L_0x012e:
            r6 = r9 & 512(0x200, float:7.175E-43)
            r38 = 805306368(0x30000000, float:4.656613E-10)
            if (r6 == 0) goto L_0x013b
        L_0x0134:
            r7 = r7 | r38
        L_0x0136:
            r24 = r1
            r11 = 1024(0x400, float:1.435E-42)
            goto L_0x014d
        L_0x013b:
            r38 = r11 & r38
            r11 = r57
            if (r38 != 0) goto L_0x0136
            boolean r38 = r2.C(r11)
            if (r38 == 0) goto L_0x014a
            r38 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0134
        L_0x014a:
            r38 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0134
        L_0x014d:
            r1 = r9 & 1024(0x400, float:1.435E-42)
            r27 = 6
            if (r1 == 0) goto L_0x0158
            r19 = r10 | 6
            r11 = r58
            goto L_0x016c
        L_0x0158:
            r38 = r10 & 6
            r11 = r58
            if (r38 != 0) goto L_0x016a
            boolean r39 = r2.C(r11)
            if (r39 == 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r19 = 2
        L_0x0167:
            r19 = r10 | r19
            goto L_0x016c
        L_0x016a:
            r19 = r10
        L_0x016c:
            r11 = r9 & 2048(0x800, float:2.87E-42)
            r32 = 48
            if (r11 == 0) goto L_0x0177
            r19 = r19 | 48
        L_0x0174:
            r5 = r19
            goto L_0x0188
        L_0x0177:
            r39 = r10 & 48
            r5 = r59
            if (r39 != 0) goto L_0x0174
            boolean r39 = r2.b(r5)
            if (r39 == 0) goto L_0x0185
            r18 = 32
        L_0x0185:
            r19 = r19 | r18
            goto L_0x0174
        L_0x0188:
            r4 = r9 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0195
            r5 = r5 | 384(0x180, float:5.38E-43)
            r18 = r4
        L_0x0190:
            r19 = r11
            r4 = 8192(0x2000, float:1.14794E-41)
            goto L_0x01ae
        L_0x0195:
            r18 = r4
            r4 = r10 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x01ab
            r4 = r60
            boolean r19 = r2.b(r4)
            if (r19 == 0) goto L_0x01a6
            r36 = 256(0x100, float:3.59E-43)
            goto L_0x01a8
        L_0x01a6:
            r36 = 128(0x80, float:1.794E-43)
        L_0x01a8:
            r5 = r5 | r36
            goto L_0x0190
        L_0x01ab:
            r4 = r60
            goto L_0x0190
        L_0x01ae:
            r11 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x01b9
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x01b4:
            r20 = r11
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01d0
        L_0x01b9:
            r4 = r10 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x01cd
            r4 = r61
            boolean r36 = r2.b(r4)
            if (r36 == 0) goto L_0x01c8
            r38 = 2048(0x800, float:2.87E-42)
            goto L_0x01ca
        L_0x01c8:
            r38 = 1024(0x400, float:1.435E-42)
        L_0x01ca:
            r5 = r5 | r38
            goto L_0x01b4
        L_0x01cd:
            r4 = r61
            goto L_0x01b4
        L_0x01d0:
            r11 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01d7
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01e5
        L_0x01d7:
            r11 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01e5
            boolean r11 = r2.S(r15)
            if (r11 == 0) goto L_0x01e2
            goto L_0x01e4
        L_0x01e2:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x01e4:
            r5 = r5 | r4
        L_0x01e5:
            r4 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r9
            if (r4 == 0) goto L_0x01f0
            r5 = r5 | r33
        L_0x01ed:
            r4 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0201
        L_0x01f0:
            r4 = r10 & r33
            if (r4 != 0) goto L_0x01ed
            boolean r4 = r2.S(r14)
            if (r4 == 0) goto L_0x01fd
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01ff
        L_0x01fd:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x01ff:
            r5 = r5 | r4
            goto L_0x01ed
        L_0x0201:
            r4 = r4 & r9
            if (r4 == 0) goto L_0x0209
            r5 = r5 | r35
        L_0x0206:
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x021a
        L_0x0209:
            r4 = r10 & r35
            if (r4 != 0) goto L_0x0206
            boolean r4 = r2.S(r13)
            if (r4 == 0) goto L_0x0216
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0218
        L_0x0216:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x0218:
            r5 = r5 | r4
            goto L_0x0206
        L_0x021a:
            r4 = r4 & r9
            if (r4 == 0) goto L_0x0220
            r5 = r5 | r28
            goto L_0x0230
        L_0x0220:
            r4 = r10 & r28
            if (r4 != 0) goto L_0x0230
            boolean r4 = r2.C(r12)
            if (r4 == 0) goto L_0x022d
            r4 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x022f
        L_0x022d:
            r4 = 4194304(0x400000, float:5.877472E-39)
        L_0x022f:
            r5 = r5 | r4
        L_0x0230:
            r4 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r4 & r7
            r11 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r11) goto L_0x0261
            r4 = 4793491(0x492493, float:6.717112E-39)
            r4 = r4 & r5
            r11 = 4793490(0x492492, float:6.71711E-39)
            if (r4 != r11) goto L_0x0261
            boolean r4 = r2.i()
            if (r4 != 0) goto L_0x0249
            goto L_0x0261
        L_0x0249:
            r2.I()
            r6 = r53
            r7 = r54
            r8 = r55
            r9 = r56
            r10 = r57
            r11 = r58
            r33 = r59
            r42 = r60
            r15 = r14
            r14 = r61
            goto L_0x0a29
        L_0x0261:
            if (r3 == 0) goto L_0x0265
            r3 = 0
            goto L_0x0267
        L_0x0265:
            r3 = r53
        L_0x0267:
            if (r34 == 0) goto L_0x026b
            r11 = 0
            goto L_0x026d
        L_0x026b:
            r11 = r54
        L_0x026d:
            if (r8 == 0) goto L_0x0271
            r8 = 0
            goto L_0x0273
        L_0x0271:
            r8 = r55
        L_0x0273:
            if (r0 == 0) goto L_0x0277
            r0 = 0
            goto L_0x0279
        L_0x0277:
            r0 = r56
        L_0x0279:
            if (r6 == 0) goto L_0x027d
            r6 = 0
            goto L_0x027f
        L_0x027d:
            r6 = r57
        L_0x027f:
            if (r1 == 0) goto L_0x0283
            r1 = 0
            goto L_0x0285
        L_0x0283:
            r1 = r58
        L_0x0285:
            if (r19 == 0) goto L_0x028a
            r33 = 0
            goto L_0x028c
        L_0x028a:
            r33 = r59
        L_0x028c:
            if (r18 == 0) goto L_0x0290
            r4 = 1
            goto L_0x0292
        L_0x0290:
            r4 = r60
        L_0x0292:
            if (r20 == 0) goto L_0x0296
            r9 = 0
            goto L_0x0298
        L_0x0296:
            r9 = r61
        L_0x0298:
            boolean r18 = Y.C1506p.H()
            if (r18 == 0) goto L_0x02a6
            java.lang.String r10 = "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)"
            r12 = 1514469103(0x5a44f6ef, float:1.38601504E16)
            Y.C1506p.Q(r12, r7, r5, r10)
        L_0x02a6:
            r10 = r7 & 112(0x70, float:1.57E-43)
            r12 = 32
            if (r10 != r12) goto L_0x02ae
            r10 = 1
            goto L_0x02af
        L_0x02ae:
            r10 = 0
        L_0x02af:
            r12 = r7 & 7168(0x1c00, float:1.0045E-41)
            r18 = r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r12 != r7) goto L_0x02b9
            r7 = 1
            goto L_0x02ba
        L_0x02b9:
            r7 = 0
        L_0x02ba:
            r7 = r7 | r10
            java.lang.Object r10 = r2.A()
            if (r7 != 0) goto L_0x02ce
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r10 != r7) goto L_0x02ca
            goto L_0x02ce
        L_0x02ca:
            r7 = r10
            r10 = r51
            goto L_0x02ee
        L_0x02ce:
            Q0.d r7 = new Q0.d
            r10 = 6
            r12 = 0
            r19 = 0
            r20 = 0
            r53 = r7
            r54 = r49
            r55 = r19
            r56 = r20
            r57 = r10
            r58 = r12
            r53.<init>(r54, r55, r56, r57, r58)
            r10 = r51
            W0.a0 r7 = r10.a(r7)
            r2.r(r7)
        L_0x02ee:
            W0.a0 r7 = (W0.a0) r7
            Q0.d r7 = r7.b()
            java.lang.String r7 = r7.j()
            int r12 = r5 >> 12
            r12 = r12 & 14
            Y.A1 r12 = B.f.a(r15, r2, r12)
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0311
            W.m r19 = W.m.Focused
        L_0x030e:
            r10 = r19
            goto L_0x031d
        L_0x0311:
            int r19 = r7.length()
            if (r19 != 0) goto L_0x031a
            W.m r19 = W.m.UnfocusedEmpty
            goto L_0x030e
        L_0x031a:
            W.m r19 = W.m.UnfocusedNotEmpty
            goto L_0x030e
        L_0x031d:
            long r19 = r13.m(r4, r9, r12)
            V.X r15 = V.X.f7146a
            r23 = r5
            r5 = 6
            V.Y0 r15 = r15.c(r2, r5)
            Q0.T r5 = r15.c()
            Q0.T r15 = r15.e()
            r34 = r0
            r35 = r1
            long r0 = r5.h()
            r0.x0$a r26 = r0.C2544x0.f25560b
            r36 = r6
            r61 = r7
            long r6 = r26.h()
            boolean r0 = r0.C2544x0.q(r0, r6)
            if (r0 == 0) goto L_0x0358
            long r0 = r15.h()
            long r6 = r26.h()
            boolean r0 = r0.C2544x0.q(r0, r6)
            if (r0 == 0) goto L_0x0374
        L_0x0358:
            long r0 = r5.h()
            long r6 = r26.h()
            boolean r0 = r0.C2544x0.q(r0, r6)
            if (r0 != 0) goto L_0x0376
            long r0 = r15.h()
            long r6 = r26.h()
            boolean r0 = r0.C2544x0.q(r0, r6)
            if (r0 == 0) goto L_0x0376
        L_0x0374:
            r0 = 1
            goto L_0x0377
        L_0x0376:
            r0 = 0
        L_0x0377:
            long r6 = r15.h()
            if (r0 == 0) goto L_0x0386
            r28 = 16
            int r1 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r1 == 0) goto L_0x0384
            goto L_0x0386
        L_0x0384:
            r6 = r19
        L_0x0386:
            long r28 = r5.h()
            if (r0 == 0) goto L_0x0395
            r37 = 16
            int r1 = (r28 > r37 ? 1 : (r28 == r37 ? 0 : -1))
            if (r1 == 0) goto L_0x0393
            goto L_0x0395
        L_0x0393:
            r28 = r19
        L_0x0395:
            r37 = r6
            if (r52 == 0) goto L_0x039b
            r1 = 1
            goto L_0x039c
        L_0x039b:
            r1 = 0
        L_0x039c:
            java.lang.String r6 = "TextFieldInputState"
            r7 = 0
            r14 = 48
            w.n0 r6 = w.o0.g(r10, r6, r2, r14, r7)
            W.A r7 = W.A.f8257a
            kotlin.jvm.internal.l r10 = kotlin.jvm.internal.C6490l.f71789a
            w.r0 r14 = w.t0.f(r10)
            java.lang.Object r31 = r6.i()
            W.m r31 = (W.m) r31
            r39 = r8
            r8 = -2036730335(0xffffffff8699f621, float:-5.791386E-35)
            r2.T(r8)
            boolean r40 = Y.C1506p.H()
            r8 = -1
            if (r40 == 0) goto L_0x03d2
            r40 = r11
            java.lang.String r11 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)"
            r41 = r3
            r42 = r4
            r3 = 0
            r4 = -2036730335(0xffffffff8699f621, float:-5.791386E-35)
            Y.C1506p.Q(r4, r3, r8, r11)
            goto L_0x03d8
        L_0x03d2:
            r41 = r3
            r42 = r4
            r40 = r11
        L_0x03d8:
            int[] r3 = W.y.p.f8473b
            int r4 = r31.ordinal()
            r4 = r3[r4]
            r11 = 3
            r43 = 1065353216(0x3f800000, float:1.0)
            r8 = 1
            if (r4 == r8) goto L_0x03eb
            r8 = 2
            if (r4 == r8) goto L_0x03f4
            if (r4 != r11) goto L_0x03ee
        L_0x03eb:
            r4 = r43
            goto L_0x03f5
        L_0x03ee:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x03f4:
            r4 = 0
        L_0x03f5:
            boolean r8 = Y.C1506p.H()
            if (r8 == 0) goto L_0x03fe
            Y.C1506p.P()
        L_0x03fe:
            r2.M()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r8 = r6.p()
            W.m r8 = (W.m) r8
            r11 = -2036730335(0xffffffff8699f621, float:-5.791386E-35)
            r2.T(r11)
            boolean r44 = Y.C1506p.H()
            if (r44 == 0) goto L_0x0423
            r44 = r9
            java.lang.String r9 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)"
            r45 = r12
            r12 = 0
            r13 = -1
            Y.C1506p.Q(r11, r12, r13, r9)
            goto L_0x0427
        L_0x0423:
            r44 = r9
            r45 = r12
        L_0x0427:
            int r8 = r8.ordinal()
            r8 = r3[r8]
            r9 = 1
            if (r8 == r9) goto L_0x0436
            r9 = 2
            if (r8 == r9) goto L_0x043f
            r9 = 3
            if (r8 != r9) goto L_0x0439
        L_0x0436:
            r8 = r43
            goto L_0x0440
        L_0x0439:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x043f:
            r8 = 0
        L_0x0440:
            boolean r9 = Y.C1506p.H()
            if (r9 == 0) goto L_0x0449
            Y.C1506p.P()
        L_0x0449:
            r2.M()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            w.n0$b r9 = r6.n()
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Object r7 = r7.invoke(r9, r2, r12)
            w.G r7 = (w.C2763G) r7
            java.lang.String r9 = "LabelProgress"
            r11 = 196608(0x30000, float:2.75506E-40)
            r53 = r6
            r54 = r4
            r55 = r8
            r56 = r7
            r57 = r14
            r58 = r9
            r59 = r2
            r60 = r11
            Y.A1 r4 = w.o0.d(r53, r54, r55, r56, r57, r58, r59, r60)
            W.C r7 = W.C.f8259a
            w.r0 r8 = w.t0.f(r10)
            java.lang.Object r9 = r6.i()
            W.m r9 = (W.m) r9
            r12 = 1435837472(0x55952420, float:2.04977985E13)
            r2.T(r12)
            boolean r13 = Y.C1506p.H()
            if (r13 == 0) goto L_0x0496
            java.lang.String r13 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)"
            r11 = -1
            r14 = 0
            Y.C1506p.Q(r12, r14, r11, r13)
        L_0x0496:
            int r9 = r9.ordinal()
            r9 = r3[r9]
            r11 = 1
            if (r9 == r11) goto L_0x04b0
            r11 = 2
            if (r9 == r11) goto L_0x04ad
            r11 = 3
            if (r9 != r11) goto L_0x04a7
        L_0x04a5:
            r9 = 0
            goto L_0x04b2
        L_0x04a7:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x04ad:
            if (r1 == 0) goto L_0x04b0
            goto L_0x04a5
        L_0x04b0:
            r9 = r43
        L_0x04b2:
            boolean r11 = Y.C1506p.H()
            if (r11 == 0) goto L_0x04bb
            Y.C1506p.P()
        L_0x04bb:
            r2.M()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object r11 = r6.p()
            W.m r11 = (W.m) r11
            r12 = 1435837472(0x55952420, float:2.04977985E13)
            r2.T(r12)
            boolean r13 = Y.C1506p.H()
            if (r13 == 0) goto L_0x04de
            java.lang.String r13 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)"
            r22 = r0
            r0 = -1
            r14 = 0
            Y.C1506p.Q(r12, r14, r0, r13)
            goto L_0x04e0
        L_0x04de:
            r22 = r0
        L_0x04e0:
            int r0 = r11.ordinal()
            r0 = r3[r0]
            r11 = 1
            if (r0 == r11) goto L_0x04fa
            r11 = 2
            if (r0 == r11) goto L_0x04f7
            r11 = 3
            if (r0 != r11) goto L_0x04f1
        L_0x04ef:
            r0 = 0
            goto L_0x04fc
        L_0x04f1:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x04f7:
            if (r1 == 0) goto L_0x04fa
            goto L_0x04ef
        L_0x04fa:
            r0 = r43
        L_0x04fc:
            boolean r11 = Y.C1506p.H()
            if (r11 == 0) goto L_0x0505
            Y.C1506p.P()
        L_0x0505:
            r2.M()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            w.n0$b r11 = r6.n()
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Object r7 = r7.invoke(r11, r2, r13)
            w.G r7 = (w.C2763G) r7
            java.lang.String r11 = "PlaceholderOpacity"
            r53 = r6
            r54 = r9
            r55 = r0
            r56 = r7
            r57 = r8
            r58 = r11
            r59 = r2
            r0 = 196608(0x30000, float:2.75506E-40)
            r60 = r0
            Y.A1 r0 = w.o0.d(r53, r54, r55, r56, r57, r58, r59, r60)
            W.D r7 = W.D.f8260a
            w.r0 r8 = w.t0.f(r10)
            java.lang.Object r9 = r6.i()
            W.m r9 = (W.m) r9
            r10 = 1128033978(0x433c6eba, float:188.43253)
            r2.T(r10)
            boolean r11 = Y.C1506p.H()
            if (r11 == 0) goto L_0x0552
            java.lang.String r11 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)"
            r12 = 0
            r13 = -1
            Y.C1506p.Q(r10, r12, r13, r11)
        L_0x0552:
            int r9 = r9.ordinal()
            r9 = r3[r9]
            r10 = 1
            if (r9 == r10) goto L_0x0561
            r10 = 2
            if (r9 == r10) goto L_0x056a
            r10 = 3
            if (r9 != r10) goto L_0x0564
        L_0x0561:
            r9 = r43
            goto L_0x056d
        L_0x0564:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x056a:
            if (r1 == 0) goto L_0x0561
            r9 = 0
        L_0x056d:
            boolean r10 = Y.C1506p.H()
            if (r10 == 0) goto L_0x0576
            Y.C1506p.P()
        L_0x0576:
            r2.M()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object r10 = r6.p()
            W.m r10 = (W.m) r10
            r11 = 1128033978(0x433c6eba, float:188.43253)
            r2.T(r11)
            boolean r12 = Y.C1506p.H()
            if (r12 == 0) goto L_0x0596
            java.lang.String r12 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)"
            r13 = 0
            r14 = -1
            Y.C1506p.Q(r11, r13, r14, r12)
        L_0x0596:
            int r10 = r10.ordinal()
            r10 = r3[r10]
            r11 = 1
            if (r10 == r11) goto L_0x05a5
            r11 = 2
            if (r10 == r11) goto L_0x05ae
            r11 = 3
            if (r10 != r11) goto L_0x05a8
        L_0x05a5:
            r11 = r43
            goto L_0x05b1
        L_0x05a8:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x05ae:
            if (r1 == 0) goto L_0x05a5
            r11 = 0
        L_0x05b1:
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x05ba
            Y.C1506p.P()
        L_0x05ba:
            r2.M()
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            w.n0$b r10 = r6.n()
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Object r7 = r7.invoke(r10, r2, r12)
            w.G r7 = (w.C2763G) r7
            java.lang.String r10 = "PrefixSuffixOpacity"
            r53 = r6
            r54 = r9
            r55 = r1
            r56 = r7
            r57 = r8
            r58 = r10
            r59 = r2
            r1 = 196608(0x30000, float:2.75506E-40)
            r60 = r1
            Y.A1 r1 = w.o0.d(r53, r54, r55, r56, r57, r58, r59, r60)
            W.B r7 = W.B.f8258a
            java.lang.Object r8 = r6.p()
            W.m r8 = (W.m) r8
            r9 = -107432127(0xfffffffff998b741, float:-9.911824E34)
            r2.T(r9)
            boolean r10 = Y.C1506p.H()
            r12 = r24
            if (r10 == 0) goto L_0x0603
            r10 = 0
            r11 = -1
            Y.C1506p.Q(r9, r10, r11, r12)
        L_0x0603:
            int r8 = r8.ordinal()
            r8 = r3[r8]
            r10 = 1
            if (r8 != r10) goto L_0x060f
            r10 = r37
            goto L_0x0611
        L_0x060f:
            r10 = r28
        L_0x0611:
            boolean r8 = Y.C1506p.H()
            if (r8 == 0) goto L_0x061a
            Y.C1506p.P()
        L_0x061a:
            r2.M()
            s0.c r8 = r0.C2544x0.t(r10)
            boolean r10 = r2.S(r8)
            java.lang.Object r11 = r2.A()
            if (r10 != 0) goto L_0x0633
            Y.m$a r10 = Y.C1500m.f10026a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x0641
        L_0x0633:
            yf.l r10 = v.C2725h.a(r26)
            java.lang.Object r8 = r10.invoke(r8)
            r11 = r8
            w.r0 r11 = (w.r0) r11
            r2.r(r11)
        L_0x0641:
            r8 = r11
            w.r0 r8 = (w.r0) r8
            java.lang.Object r10 = r6.i()
            W.m r10 = (W.m) r10
            r2.T(r9)
            boolean r11 = Y.C1506p.H()
            if (r11 == 0) goto L_0x0658
            r11 = 0
            r13 = -1
            Y.C1506p.Q(r9, r11, r13, r12)
        L_0x0658:
            int r10 = r10.ordinal()
            r10 = r3[r10]
            r11 = 1
            if (r10 != r11) goto L_0x0664
            r10 = r37
            goto L_0x0666
        L_0x0664:
            r10 = r28
        L_0x0666:
            boolean r13 = Y.C1506p.H()
            if (r13 == 0) goto L_0x066f
            Y.C1506p.P()
        L_0x066f:
            r2.M()
            r0.x0 r10 = r0.C2544x0.k(r10)
            java.lang.Object r11 = r6.p()
            W.m r11 = (W.m) r11
            r2.T(r9)
            boolean r13 = Y.C1506p.H()
            if (r13 == 0) goto L_0x068a
            r13 = 0
            r14 = -1
            Y.C1506p.Q(r9, r13, r14, r12)
        L_0x068a:
            int r9 = r11.ordinal()
            r3 = r3[r9]
            r9 = 1
            if (r3 != r9) goto L_0x0695
            r28 = r37
        L_0x0695:
            boolean r3 = Y.C1506p.H()
            if (r3 == 0) goto L_0x069e
            Y.C1506p.P()
        L_0x069e:
            r2.M()
            r0.x0 r3 = r0.C2544x0.k(r28)
            w.n0$b r9 = r6.n()
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Object r7 = r7.invoke(r9, r2, r12)
            w.G r7 = (w.C2763G) r7
            java.lang.String r9 = "LabelTextStyleColor"
            r53 = r6
            r54 = r10
            r55 = r3
            r56 = r7
            r57 = r8
            r58 = r9
            r59 = r2
            r3 = 196608(0x30000, float:2.75506E-40)
            r60 = r3
            Y.A1 r3 = w.o0.d(r53, r54, r55, r56, r57, r58, r59, r60)
            W.z r7 = W.z.f8479a
            java.lang.Object r8 = r6.p()
            W.m r8 = (W.m) r8
            r8 = 1023351670(0x3cff1b76, float:0.031141024)
            r2.T(r8)
            boolean r9 = Y.C1506p.H()
            r11 = r25
            if (r9 == 0) goto L_0x06e7
            r9 = 0
            r10 = -1
            Y.C1506p.Q(r8, r9, r10, r11)
        L_0x06e7:
            boolean r9 = Y.C1506p.H()
            if (r9 == 0) goto L_0x06f0
            Y.C1506p.P()
        L_0x06f0:
            r2.M()
            s0.c r9 = r0.C2544x0.t(r19)
            boolean r10 = r2.S(r9)
            java.lang.Object r12 = r2.A()
            if (r10 != 0) goto L_0x0709
            Y.m$a r10 = Y.C1500m.f10026a
            java.lang.Object r10 = r10.a()
            if (r12 != r10) goto L_0x0717
        L_0x0709:
            yf.l r10 = v.C2725h.a(r26)
            java.lang.Object r9 = r10.invoke(r9)
            r12 = r9
            w.r0 r12 = (w.r0) r12
            r2.r(r12)
        L_0x0717:
            r9 = r12
            w.r0 r9 = (w.r0) r9
            java.lang.Object r10 = r6.i()
            W.m r10 = (W.m) r10
            r2.T(r8)
            boolean r10 = Y.C1506p.H()
            if (r10 == 0) goto L_0x072e
            r10 = 0
            r12 = -1
            Y.C1506p.Q(r8, r10, r12, r11)
        L_0x072e:
            boolean r10 = Y.C1506p.H()
            if (r10 == 0) goto L_0x0737
            Y.C1506p.P()
        L_0x0737:
            r2.M()
            r0.x0 r10 = r0.C2544x0.k(r19)
            java.lang.Object r12 = r6.p()
            W.m r12 = (W.m) r12
            r2.T(r8)
            boolean r12 = Y.C1506p.H()
            if (r12 == 0) goto L_0x0753
            r12 = 0
            r13 = -1
            Y.C1506p.Q(r8, r12, r13, r11)
            goto L_0x0754
        L_0x0753:
            r12 = 0
        L_0x0754:
            boolean r8 = Y.C1506p.H()
            if (r8 == 0) goto L_0x075d
            Y.C1506p.P()
        L_0x075d:
            r2.M()
            r0.x0 r8 = r0.C2544x0.k(r19)
            w.n0$b r11 = r6.n()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r7 = r7.invoke(r11, r2, r12)
            w.G r7 = (w.C2763G) r7
            java.lang.String r11 = "LabelContentColor"
            r53 = r6
            r54 = r10
            r55 = r8
            r56 = r7
            r57 = r9
            r58 = r11
            r59 = r2
            r6 = 196608(0x30000, float:2.75506E-40)
            r60 = r6
            Y.A1 r6 = w.o0.d(r53, r54, r55, r56, r57, r58, r59, r60)
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r7 = -156998101(0xfffffffff6a4662b, float:-1.6672049E33)
            r2.T(r7)
            r7 = 54
            if (r52 != 0) goto L_0x07a0
            r3 = 0
            goto L_0x07bd
        L_0x07a0:
            W.y$d r8 = new W.y$d
            r53 = r8
            r54 = r5
            r55 = r15
            r56 = r4
            r57 = r6
            r58 = r52
            r59 = r22
            r60 = r3
            r53.<init>(r54, r55, r56, r57, r58, r59, r60)
            r3 = -1236585568(0xffffffffb64b33a0, float:-3.0279407E-6)
            r6 = 1
            g0.a r3 = g0.c.e(r3, r6, r8, r2, r7)
        L_0x07bd:
            r2.M()
            r13 = r64
            r6 = r42
            r8 = r44
            r9 = r45
            long r10 = r13.o(r6, r8, r9)
            java.lang.Object r12 = r2.A()
            Y.m$a r14 = Y.C1500m.f10026a
            java.lang.Object r7 = r14.a()
            if (r12 != r7) goto L_0x07e8
            Y.o1 r7 = Y.p1.q()
            W.y$k r12 = new W.y$k
            r12.<init>(r0)
            Y.A1 r12 = Y.p1.d(r7, r12)
            r2.r(r12)
        L_0x07e8:
            Y.A1 r12 = (Y.A1) r12
            r7 = -156965270(0xfffffffff6a4e66a, float:-1.6722852E33)
            r2.T(r7)
            if (r41 == 0) goto L_0x081a
            int r7 = r61.length()
            if (r7 != 0) goto L_0x081a
            boolean r7 = b(r12)
            if (r7 == 0) goto L_0x081a
            W.y$f r7 = new W.y$f
            r53 = r7
            r54 = r0
            r55 = r10
            r57 = r5
            r58 = r41
            r53.<init>(r54, r55, r57, r58)
            r0 = -660524084(0xffffffffd8a133cc, float:-1.4179507E15)
            r10 = 1
            r11 = 54
            g0.a r0 = g0.c.e(r0, r10, r7, r2, r11)
            r19 = r0
            goto L_0x081c
        L_0x081a:
            r19 = 0
        L_0x081c:
            r2.M()
            long r10 = r13.p(r6, r8, r9)
            java.lang.Object r0 = r2.A()
            java.lang.Object r7 = r14.a()
            if (r0 != r7) goto L_0x083d
            Y.o1 r0 = Y.p1.q()
            W.y$l r7 = new W.y$l
            r7.<init>(r1)
            Y.A1 r0 = Y.p1.d(r0, r7)
            r2.r(r0)
        L_0x083d:
            Y.A1 r0 = (Y.A1) r0
            r7 = -156940524(0xfffffffff6a54714, float:-1.6761145E33)
            r2.T(r7)
            if (r34 == 0) goto L_0x0869
            boolean r7 = c(r0)
            if (r7 == 0) goto L_0x0869
            W.y$g r7 = new W.y$g
            r53 = r7
            r54 = r1
            r55 = r10
            r57 = r5
            r58 = r34
            r53.<init>(r54, r55, r57, r58)
            r10 = 274398694(0x105afde6, float:4.3188516E-29)
            r11 = 1
            r12 = 54
            g0.a r7 = g0.c.e(r10, r11, r7, r2, r12)
            r22 = r7
            goto L_0x086b
        L_0x0869:
            r22 = 0
        L_0x086b:
            r2.M()
            long r10 = r13.q(r6, r8, r9)
            r7 = -156921964(0xfffffffff6a58f94, float:-1.6789865E33)
            r2.T(r7)
            if (r36 == 0) goto L_0x089a
            boolean r0 = c(r0)
            if (r0 == 0) goto L_0x089a
            W.y$h r0 = new W.y$h
            r53 = r0
            r54 = r1
            r55 = r10
            r57 = r5
            r58 = r36
            r53.<init>(r54, r55, r57, r58)
            r1 = -1526229403(0xffffffffa5079665, float:-1.1760339E-16)
            r5 = 1
            r7 = 54
            g0.a r0 = g0.c.e(r1, r5, r0, r2, r7)
            goto L_0x089b
        L_0x089a:
            r0 = 0
        L_0x089b:
            r2.M()
            long r10 = r13.n(r6, r8, r9)
            r1 = -156902962(0xfffffffff6a5d9ce, float:-1.681927E33)
            r2.T(r1)
            if (r40 != 0) goto L_0x08b2
            r5 = r40
            r10 = 1
            r11 = 54
            r20 = 0
            goto L_0x08c5
        L_0x08b2:
            W.y$e r1 = new W.y$e
            r5 = r40
            r1.<init>(r10, r5)
            r7 = -130107406(0xfffffffff83eb7f2, float:-1.5472926E34)
            r10 = 1
            r11 = 54
            g0.a r1 = g0.c.e(r7, r10, r1, r2, r11)
            r20 = r1
        L_0x08c5:
            r2.M()
            long r10 = r13.u(r6, r8, r9)
            r1 = -156893937(0xfffffffff6a5fd0f, float:-1.6833235E33)
            r2.T(r1)
            if (r39 != 0) goto L_0x08dc
            r7 = r39
            r11 = 1
            r12 = 54
            r21 = 0
            goto L_0x08ef
        L_0x08dc:
            W.y$j r1 = new W.y$j
            r7 = r39
            r1.<init>(r10, r7)
            r10 = 2079816678(0x7bf77be6, float:2.5700206E36)
            r11 = 1
            r12 = 54
            g0.a r1 = g0.c.e(r10, r11, r1, r2, r12)
            r21 = r1
        L_0x08ef:
            r2.M()
            long r9 = r13.r(r6, r8, r9)
            r1 = -156884470(0xfffffffff6a6220a, float:-1.6847884E33)
            r2.T(r1)
            if (r35 != 0) goto L_0x0903
            r10 = r11
            r11 = r35
            r1 = 0
            goto L_0x0912
        L_0x0903:
            W.y$i r1 = new W.y$i
            r11 = r35
            r1.<init>(r9, r15, r11)
            r9 = 1263707005(0x4b52a37d, float:1.3804413E7)
            r10 = 1
            g0.a r1 = g0.c.e(r9, r10, r1, r2, r12)
        L_0x0912:
            r2.M()
            int[] r9 = W.y.p.f8472a
            int r12 = r48.ordinal()
            r9 = r9[r12]
            if (r9 == r10) goto L_0x09c8
            r10 = 2
            if (r9 == r10) goto L_0x0939
            r0 = -565271199(0xffffffffde4ea561, float:-3.7226036E18)
            r2.T(r0)
            r2.M()
            lf.M r0 = lf.C6514M.f71813a
            r15 = r63
            r12 = r65
            r40 = r5
            r42 = r6
            r39 = r7
            goto L_0x0a15
        L_0x0939:
            r9 = -567018607(0xffffffffde33fb91, float:-3.24227975E18)
            r2.T(r9)
            java.lang.Object r9 = r2.A()
            java.lang.Object r10 = r14.a()
            if (r9 != r10) goto L_0x095c
            q0.m$a r9 = q0.C2427m.f25341b
            long r9 = r9.b()
            q0.m r9 = q0.C2427m.c(r9)
            r10 = 2
            r12 = 0
            Y.r0 r9 = Y.u1.d(r9, r12, r10, r12)
            r2.r(r9)
        L_0x095c:
            Y.r0 r9 = (Y.C1510r0) r9
            W.y$b r10 = new W.y$b
            r15 = r63
            r12 = r65
            r10.<init>(r9, r15, r12)
            r40 = r5
            r5 = 157291737(0x96014d9, float:2.6972822E-33)
            r42 = r6
            r39 = r7
            r6 = 1
            r7 = 54
            g0.a r5 = g0.c.e(r5, r6, r10, r2, r7)
            k0.i$a r16 = k0.i.f23074a
            boolean r6 = r2.c(r4)
            java.lang.Object r7 = r2.A()
            if (r6 != 0) goto L_0x0989
            java.lang.Object r6 = r14.a()
            if (r7 != r6) goto L_0x0991
        L_0x0989:
            W.y$a r7 = new W.y$a
            r7.<init>(r4, r9)
            r2.r(r7)
        L_0x0991:
            r26 = r7
            yf.l r26 = (yf.C6798l) r26
            r6 = 3
            int r6 = r18 >> 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r7 = 6
            r6 = r6 | r7
            int r9 = r23 << 21
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            r9 = r9 & r10
            r31 = r6 | r9
            int r6 = r23 >> 6
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r7 = 48
            r32 = r6 | 48
            r17 = r50
            r18 = r19
            r19 = r3
            r23 = r0
            r24 = r33
            r25 = r4
            r27 = r5
            r28 = r1
            r29 = r63
            r30 = r2
            V.C1394m0.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r2.M()
            lf.M r0 = lf.C6514M.f71813a
            goto L_0x0a15
        L_0x09c8:
            r15 = r63
            r12 = r65
            r40 = r5
            r42 = r6
            r39 = r7
            r5 = -568105095(0xffffffffde236779, float:-2.9436282E18)
            r2.T(r5)
            W.y$c r5 = new W.y$c
            r5.<init>(r12)
            r6 = 1750327932(0x6853e27c, float:4.002389E24)
            r7 = 1
            r9 = 54
            g0.a r26 = g0.c.e(r6, r7, r5, r2, r9)
            k0.i$a r16 = k0.i.f23074a
            r5 = 3
            int r5 = r18 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = 6
            r5 = r5 | r6
            int r7 = r23 << 21
            r9 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r9
            r30 = r5 | r7
            int r5 = r23 >> 9
            r5 = r5 & 896(0x380, float:1.256E-42)
            r31 = r5 | 6
            r17 = r50
            r18 = r3
            r23 = r0
            r24 = r33
            r25 = r4
            r27 = r1
            r28 = r63
            r29 = r2
            V.R0.b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.M()
            lf.M r0 = lf.C6514M.f71813a
        L_0x0a15:
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0a1e
            Y.C1506p.P()
        L_0x0a1e:
            r14 = r8
            r9 = r34
            r10 = r36
            r8 = r39
            r7 = r40
            r6 = r41
        L_0x0a29:
            Y.Y0 r5 = r2.k()
            if (r5 == 0) goto L_0x0a5c
            W.y$m r4 = new W.y$m
            r0 = r4
            r1 = r48
            r2 = r49
            r3 = r50
            r46 = r4
            r4 = r51
            r47 = r5
            r5 = r52
            r12 = r33
            r13 = r42
            r15 = r62
            r16 = r63
            r17 = r64
            r18 = r65
            r19 = r67
            r20 = r68
            r21 = r69
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r46
            r0 = r47
            r0.a(r1)
        L_0x0a5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W.y.a(W.E, java.lang.String, yf.p, W0.c0, yf.p, yf.p, yf.p, yf.p, yf.p, yf.p, yf.p, boolean, boolean, boolean, B.j, C.N, V.P0, yf.p, Y.m, int, int, int):void");
    }

    private static final boolean b(A1 a12) {
        return ((Boolean) a12.getValue()).booleanValue();
    }

    private static final boolean c(A1 a12) {
        return ((Boolean) a12.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void d(long j10, T t10, yf.p pVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(1208685580);
        if ((i10 & 6) == 0) {
            if (h10.e(j10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.S(t10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (h10.C(pVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(1208685580, i11, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            u.a(j10, t10, pVar, h10, i11 & 1022);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new n(j10, t10, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void e(long j10, yf.p pVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        C1500m h10 = mVar.h(660142980);
        if ((i10 & 6) == 0) {
            if (h10.e(j10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.C(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(660142980, i11, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            C1521x.a(V.A.a().d(C2544x0.k(j10)), pVar, h10, (i11 & 112) | J0.f9784i);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new o(j10, pVar, i10));
        }
    }

    public static final A1 h(boolean z10, boolean z11, boolean z12, P0 p02, float f10, float f11, C1500m mVar, int i10) {
        A1 o10;
        A1 a12;
        float f12;
        boolean z13 = z10;
        boolean z14 = z12;
        C1500m mVar2 = mVar;
        int i11 = i10;
        if (C1506p.H()) {
            C1506p.Q(2047013045, i11, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long l10 = p02.l(z13, z11, z14);
        if (z13) {
            mVar2.T(1023053998);
            o10 = C2737t.a(l10, C2798j.j(150, 0, (C2760D) null, 6, (Object) null), (String) null, (C6798l) null, mVar, 48, 12);
            mVar.M();
        } else {
            mVar2.T(1023165505);
            o10 = p1.o(C2544x0.k(l10), mVar2, 0);
            mVar.M();
        }
        A1 a13 = o10;
        if (z13) {
            mVar2.T(1023269417);
            if (z14) {
                f12 = f10;
            } else {
                f12 = f11;
            }
            a12 = C2786c.c(f12, C2798j.j(150, 0, (C2760D) null, 6, (Object) null), (String) null, (C6798l) null, mVar, 48, 12);
            mVar.M();
        } else {
            mVar2.T(1023478388);
            a12 = p1.o(c1.h.e(f11), mVar2, (i11 >> 15) & 14);
            mVar.M();
        }
        A1 o11 = p1.o(C2869h.a(((c1.h) a12.getValue()).r(), ((C2544x0) a13.getValue()).y()), mVar2, 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        return o11;
    }

    public static final k0.i i(k0.i iVar, boolean z10, String str) {
        if (z10) {
            return O0.m.d(iVar, false, new q(str), 1, (Object) null);
        }
        return iVar;
    }

    public static final float j() {
        return f8400c;
    }

    public static final k0.i k() {
        return f8406i;
    }

    public static final Object l(C1193n nVar) {
        C1200v vVar;
        Object a10 = nVar.a();
        if (a10 instanceof C1200v) {
            vVar = (C1200v) a10;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            return vVar.X0();
        }
        return null;
    }

    public static final float m() {
        return f8404g;
    }

    public static final float n() {
        return f8405h;
    }

    public static final float o() {
        return f8403f;
    }

    public static final float p() {
        return f8402e;
    }

    public static final float q() {
        return f8401d;
    }

    public static final float r() {
        return f8399b;
    }

    public static final long s() {
        return f8398a;
    }

    public static final int t(H0.U u10) {
        if (u10 != null) {
            return u10.R0();
        }
        return 0;
    }

    public static final k0.i u(k0.i iVar, C2443E0 e02, g2 g2Var) {
        return androidx.compose.ui.draw.b.c(iVar, new r(g2Var, e02));
    }

    public static final int v(H0.U u10) {
        if (u10 != null) {
            return u10.X0();
        }
        return 0;
    }
}
