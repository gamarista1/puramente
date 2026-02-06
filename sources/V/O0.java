package V;

import D0.J;
import D0.T;
import H0.F;
import J0.C1241g;
import O0.g;
import O0.m;
import O0.t;
import O0.v;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.C1523y;
import Y.F1;
import Y.I0;
import Y.J0;
import Y.o1;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.platform.C1644k0;
import c1.d;
import c1.h;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import o0.C2342e;
import qf.C6658d;
import r0.C2544x0;
import r0.a2;
import r0.b2;
import r0.g2;
import rf.C6680b;
import x.C2866e;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class O0 {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f6782a = C1521x.d((o1) null, a.f6783a, 1, (Object) null);

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f6783a = new a();

        a() {
            super(0);
        }

        public final float a() {
            return h.j((float) 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return h.e(a());
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f6784a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g2 f6785b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f6786c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f6787d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2868g f6788e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f6789f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f6790g;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f6791a = new a();

            a() {
                super(1);
            }

            public final void a(v vVar) {
                t.X(vVar, true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((v) obj);
                return C6514M.f71813a;
            }
        }

        /* renamed from: V.O0$b$b  reason: collision with other inner class name */
        static final class C0158b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f6792a;

            C0158b(C6658d dVar) {
                super(2, dVar);
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0158b(dVar);
            }

            public final Object invoke(J j10, C6658d dVar) {
                return ((C0158b) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                C6680b.f();
                if (this.f6792a == 0) {
                    w.b(obj);
                    return C6514M.f71813a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, g2 g2Var, long j10, float f10, C2868g gVar, float f11, p pVar) {
            super(2);
            this.f6784a = iVar;
            this.f6785b = g2Var;
            this.f6786c = j10;
            this.f6787d = f10;
            this.f6788e = gVar;
            this.f6789f = f11;
            this.f6790g = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-70914509, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
                }
                i d10 = T.d(m.c(O0.e(this.f6784a, this.f6785b, O0.f(this.f6786c, this.f6787d, mVar, 0), this.f6788e, ((d) mVar.m(C1644k0.e())).t1(this.f6789f)), false, a.f6791a), C6514M.f71813a, new C0158b((C6658d) null));
                p pVar = this.f6790g;
                F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), true);
                int a10 = C1494j.a(mVar, 0);
                C1523y p10 = mVar.p();
                i e10 = k0.h.e(mVar, d10);
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
                p b10 = aVar.b();
                if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                    a12.r(Integer.valueOf(a10));
                    a12.V(Integer.valueOf(a10), b10);
                }
                F1.b(a12, e10, aVar.d());
                f fVar = f.f12848a;
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

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f6793a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g2 f6794b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f6795c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f6796d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2868g f6797e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ B.l f6798f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f6799g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6787a f6800h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f6801i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p f6802j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, g2 g2Var, long j10, float f10, C2868g gVar, B.l lVar, boolean z10, C6787a aVar, float f11, p pVar) {
            super(2);
            this.f6793a = iVar;
            this.f6794b = g2Var;
            this.f6795c = j10;
            this.f6796d = f10;
            this.f6797e = gVar;
            this.f6798f = lVar;
            this.f6799g = z10;
            this.f6800h = aVar;
            this.f6801i = f11;
            this.f6802j = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1279702876, i11, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
                }
                i b10 = androidx.compose.foundation.d.b(O0.e(W.b(this.f6793a), this.f6794b, O0.f(this.f6795c, this.f6796d, mVar2, 0), this.f6797e, ((d) mVar2.m(C1644k0.e())).t1(this.f6801i)), this.f6798f, C1409u0.d(false, 0.0f, 0, mVar, 0, 7), this.f6799g, (String) null, (g) null, this.f6800h, 24, (Object) null);
                p pVar = this.f6802j;
                F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), true);
                int a10 = C1494j.a(mVar2, 0);
                C1523y p10 = mVar.p();
                i e10 = k0.h.e(mVar2, b10);
                C1241g.a aVar = C1241g.f3853J;
                C6787a a11 = aVar.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar2.U(a11);
                } else {
                    mVar.q();
                }
                C1500m a12 = F1.a(mVar);
                F1.b(a12, h10, aVar.c());
                F1.b(a12, p10, aVar.e());
                p b11 = aVar.b();
                if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                    a12.r(Integer.valueOf(a10));
                    a12.V(Integer.valueOf(a10), b11);
                }
                F1.b(a12, e10, aVar.d());
                f fVar = f.f12848a;
                pVar.invoke(mVar2, 0);
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

    public static final void a(i iVar, g2 g2Var, long j10, long j11, float f10, float f11, C2868g gVar, p pVar, C1500m mVar, int i10, int i11) {
        i iVar2;
        g2 g2Var2;
        long j12;
        long j13;
        float f12;
        float f13;
        C2868g gVar2;
        C1500m mVar2 = mVar;
        int i12 = i10;
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        if ((i11 & 2) != 0) {
            g2Var2 = a2.a();
        } else {
            g2Var2 = g2Var;
        }
        if ((i11 & 4) != 0) {
            j12 = X.f7146a.a(mVar2, 6).I();
        } else {
            j12 = j10;
        }
        if ((i11 & 8) != 0) {
            j13 = C1404s.c(j12, mVar2, (i12 >> 6) & 14);
        } else {
            j13 = j11;
        }
        if ((i11 & 16) != 0) {
            f12 = h.j((float) 0);
        } else {
            f12 = f10;
        }
        if ((i11 & 32) != 0) {
            f13 = h.j((float) 0);
        } else {
            f13 = f11;
        }
        if ((i11 & 64) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if (C1506p.H()) {
            C1506p.Q(-513881741, i12, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        I0 i02 = f6782a;
        float j14 = h.j(((h) mVar2.m(i02)).r() + f12);
        C1521x.b(new J0[]{A.a().d(C2544x0.k(j13)), i02.d(h.e(j14))}, g0.c.e(-70914509, true, new b(iVar2, g2Var2, j12, j14, gVar2, f13, pVar), mVar2, 54), mVar2, J0.f9784i | 48);
        if (C1506p.H()) {
            C1506p.P();
        }
    }

    public static final void b(C6787a aVar, i iVar, boolean z10, g2 g2Var, long j10, long j11, float f10, float f11, C2868g gVar, B.l lVar, p pVar, C1500m mVar, int i10, int i11, int i12) {
        i.a aVar2;
        boolean z11;
        g2 g2Var2;
        long j12;
        long j13;
        float f12;
        float f13;
        C2868g gVar2;
        C1500m mVar2 = mVar;
        int i13 = i10;
        int i14 = i12;
        if ((i14 & 2) != 0) {
            aVar2 = i.f23074a;
        } else {
            aVar2 = iVar;
        }
        if ((i14 & 4) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i14 & 8) != 0) {
            g2Var2 = a2.a();
        } else {
            g2Var2 = g2Var;
        }
        if ((i14 & 16) != 0) {
            j12 = X.f7146a.a(mVar2, 6).I();
        } else {
            j12 = j10;
        }
        if ((i14 & 32) != 0) {
            j13 = C1404s.c(j12, mVar2, (i13 >> 12) & 14);
        } else {
            j13 = j11;
        }
        if ((i14 & 64) != 0) {
            f12 = h.j((float) 0);
        } else {
            f12 = f10;
        }
        if ((i14 & 128) != 0) {
            f13 = h.j((float) 0);
        } else {
            f13 = f11;
        }
        B.l lVar2 = null;
        if ((i14 & 256) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if ((i14 & 512) == 0) {
            lVar2 = lVar;
        }
        if (C1506p.H()) {
            C1506p.Q(-789752804, i13, i11, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        I0 i02 = f6782a;
        float j14 = h.j(((h) mVar2.m(i02)).r() + f12);
        C1521x.b(new J0[]{A.a().d(C2544x0.k(j13)), i02.d(h.e(j14))}, g0.c.e(1279702876, true, new c(aVar2, g2Var2, j12, j14, gVar2, lVar2, z11, aVar, f13, pVar), mVar2, 54), mVar2, J0.f9784i | 48);
        if (C1506p.H()) {
            C1506p.P();
        }
    }

    /* access modifiers changed from: private */
    public static final i e(i iVar, g2 g2Var, long j10, C2868g gVar, float f10) {
        i iVar2;
        g2 g2Var2;
        i iVar3;
        g2 g2Var3 = g2Var;
        C2868g gVar2 = gVar;
        if (f10 > 0.0f) {
            iVar2 = androidx.compose.ui.graphics.b.c(i.f23074a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0, g2Var, false, (b2) null, 0, 0, 0, 124895, (Object) null);
        } else {
            iVar2 = i.f23074a;
        }
        i h10 = iVar.h(iVar2);
        C2868g gVar3 = gVar;
        if (gVar3 != null) {
            g2Var2 = g2Var;
            iVar3 = C2866e.e(i.f23074a, gVar3, g2Var2);
        } else {
            g2Var2 = g2Var;
            iVar3 = i.f23074a;
        }
        return C2342e.a(androidx.compose.foundation.b.c(h10.h(iVar3), j10, g2Var2), g2Var2);
    }

    /* access modifiers changed from: private */
    public static final long f(long j10, float f10, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-2079918090, i10, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long a10 = C1404s.a(X.f7146a.a(mVar, 6), j10, f10, mVar, (i10 << 3) & 1008);
        if (C1506p.H()) {
            C1506p.P();
        }
        return a10;
    }
}
