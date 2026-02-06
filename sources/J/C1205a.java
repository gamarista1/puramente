package J;

import C.a0;
import H0.F;
import J0.C1241g;
import O0.v;
import P.C1285a;
import P.C1293i;
import P.K;
import P.L;
import P.u;
import P.w;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.q;
import c1.k;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import o0.C2341d;
import o0.C2345h;
import q0.C2421g;
import q0.C2427m;
import r0.C2547y0;
import r0.H1;
import t0.C2602c;
import t0.C2603d;
import t0.C2605f;
import t0.C2606g;
import t0.C2607h;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: J.a  reason: case insensitive filesystem */
public abstract class C1205a {

    /* renamed from: a  reason: collision with root package name */
    private static final float f2997a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f2998b;

    /* renamed from: J.a$a  reason: collision with other inner class name */
    static final class C0064a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f2999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f3000b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0064a(long j10, i iVar) {
            super(2);
            this.f2999a = j10;
            this.f3000b = iVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1653527038, i10, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:64)");
                }
                if (this.f2999a != 9205357640488583168L) {
                    mVar.T(1828881000);
                    i m10 = q.m(this.f3000b, k.h(this.f2999a), k.g(this.f2999a), 0.0f, 0.0f, 12, (Object) null);
                    F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.m(), false);
                    int a10 = C1494j.a(mVar, 0);
                    C1523y p10 = mVar.p();
                    i e10 = h.e(mVar, m10);
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
                    C1205a.b((i) null, mVar, 0, 1);
                    mVar.u();
                    mVar.M();
                } else {
                    mVar.T(1829217412);
                    C1205a.b(this.f3000b, mVar, 0, 0);
                    mVar.M();
                }
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

    /* renamed from: J.a$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1293i f3001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f3002b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f3003c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3004d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f3005e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1293i iVar, i iVar2, long j10, int i10, int i11) {
            super(2);
            this.f3001a = iVar;
            this.f3002b = iVar2;
            this.f3003c = j10;
            this.f3004d = i10;
            this.f3005e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1205a.a(this.f3001a, this.f3002b, this.f3003c, mVar, M0.a(this.f3004d | 1), this.f3005e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.a$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1293i f3006a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C1293i iVar) {
            super(1);
            this.f3006a = iVar;
        }

        public final void a(v vVar) {
            vVar.a(w.d(), new P.v(C1216l.Cursor, this.f3006a.a(), u.Middle, true, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.a$d */
    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f3007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3008b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f3009c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, int i10, int i11) {
            super(2);
            this.f3007a = iVar;
            this.f3008b = i10;
            this.f3009c = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1205a.b(this.f3007a, mVar, M0.a(this.f3008b | 1), this.f3009c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.a$e */
    static final class e extends C6498u implements yf.q {

        /* renamed from: a  reason: collision with root package name */
        public static final e f3010a = new e();

        /* renamed from: J.a$e$a  reason: collision with other inner class name */
        static final class C0065a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f3011a;

            /* renamed from: J.a$e$a$a  reason: collision with other inner class name */
            static final class C0066a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ float f3012a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ H1 f3013b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C2547y0 f3014c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0066a(float f10, H1 h12, C2547y0 y0Var) {
                    super(1);
                    this.f3012a = f10;
                    this.f3013b = h12;
                    this.f3014c = y0Var;
                }

                public final void a(C2602c cVar) {
                    cVar.H1();
                    float f10 = this.f3012a;
                    H1 h12 = this.f3013b;
                    C2547y0 y0Var = this.f3014c;
                    C2603d w12 = cVar.w1();
                    long d10 = w12.d();
                    w12.f().q();
                    try {
                        C2607h e10 = w12.e();
                        C2607h.h(e10, f10, 0.0f, 2, (Object) null);
                        e10.f(45.0f, C2421g.f25320b.c());
                        C2605f.a1(cVar, h12, 0, 0.0f, (C2606g) null, y0Var, 0, 46, (Object) null);
                    } finally {
                        w12.f().h();
                        w12.h(d10);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((C2602c) obj);
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0065a(long j10) {
                super(1);
                this.f3011a = j10;
            }

            /* renamed from: a */
            public final C2345h invoke(C2341d dVar) {
                float k10 = C2427m.k(dVar.d()) / 2.0f;
                return dVar.o(new C0066a(k10, C1285a.d(dVar, k10), C2547y0.a.c(C2547y0.f25576b, this.f3011a, 0, 2, (Object) null)));
            }
        }

        e() {
            super(3);
        }

        public final i a(i iVar, C1500m mVar, int i10) {
            mVar.T(-2126899193);
            if (C1506p.H()) {
                C1506p.Q(-2126899193, i10, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
            }
            long b10 = ((K) mVar.m(L.b())).b();
            i.a aVar = i.f23074a;
            boolean e10 = mVar.e(b10);
            Object A10 = mVar.A();
            if (e10 || A10 == C1500m.f10026a.a()) {
                A10 = new C0065a(b10);
                mVar.r(A10);
            }
            i h10 = iVar.h(androidx.compose.ui.draw.b.c(aVar, (C6798l) A10));
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return h10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    static {
        float j10 = c1.h.j((float) 25);
        f2997a = j10;
        f2998b = c1.h.j(c1.h.j(j10 * 2.0f) / 2.4142137f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
        if ((r14 & 4) != 0) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(P.C1293i r8, k0.i r9, long r10, Y.C1500m r12, int r13, int r14) {
        /*
            r0 = 1776202187(0x69deb1cb, float:3.3652642E25)
            Y.m r12 = r12.h(r0)
            r1 = r14 & 1
            r2 = 4
            if (r1 == 0) goto L_0x000f
            r1 = r13 | 6
            goto L_0x0028
        L_0x000f:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0027
            r1 = r13 & 8
            if (r1 != 0) goto L_0x001c
            boolean r1 = r12.S(r8)
            goto L_0x0020
        L_0x001c:
            boolean r1 = r12.C(r8)
        L_0x0020:
            if (r1 == 0) goto L_0x0024
            r1 = r2
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r13
            goto L_0x0028
        L_0x0027:
            r1 = r13
        L_0x0028:
            r3 = r14 & 2
            if (r3 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x003f
        L_0x002f:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x003f
            boolean r3 = r12.S(r9)
            if (r3 == 0) goto L_0x003c
            r3 = 32
            goto L_0x003e
        L_0x003c:
            r3 = 16
        L_0x003e:
            r1 = r1 | r3
        L_0x003f:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0053
            r3 = r14 & 4
            if (r3 != 0) goto L_0x0050
            boolean r3 = r12.e(r10)
            if (r3 == 0) goto L_0x0050
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0052
        L_0x0050:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0052:
            r1 = r1 | r3
        L_0x0053:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x0066
            boolean r3 = r12.i()
            if (r3 != 0) goto L_0x0060
            goto L_0x0066
        L_0x0060:
            r12.I()
        L_0x0063:
            r4 = r10
            goto L_0x00ed
        L_0x0066:
            r12.D()
            r3 = r13 & 1
            if (r3 == 0) goto L_0x007e
            boolean r3 = r12.L()
            if (r3 == 0) goto L_0x0074
            goto L_0x007e
        L_0x0074:
            r12.I()
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0089
        L_0x007b:
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0089
        L_0x007e:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0089
            c1.k$a r10 = c1.k.f19222b
            long r10 = r10.a()
            goto L_0x007b
        L_0x0089:
            r12.v()
            boolean r3 = Y.C1506p.H()
            if (r3 == 0) goto L_0x0098
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)"
            Y.C1506p.Q(r0, r1, r3, r4)
        L_0x0098:
            r0 = r1 & 14
            r3 = 0
            r4 = 1
            if (r0 == r2) goto L_0x00ab
            r1 = r1 & 8
            if (r1 == 0) goto L_0x00a9
            boolean r1 = r12.C(r8)
            if (r1 == 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r1 = r3
            goto L_0x00ac
        L_0x00ab:
            r1 = r4
        L_0x00ac:
            java.lang.Object r2 = r12.A()
            if (r1 != 0) goto L_0x00ba
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x00c2
        L_0x00ba:
            J.a$c r2 = new J.a$c
            r2.<init>(r8)
            r12.r(r2)
        L_0x00c2:
            yf.l r2 = (yf.C6798l) r2
            r1 = 0
            k0.i r1 = O0.m.d(r9, r3, r2, r4, r1)
            k0.c$a r2 = k0.c.f23044a
            k0.c r2 = r2.m()
            J.a$a r3 = new J.a$a
            r3.<init>(r10, r1)
            r1 = 54
            r5 = -1653527038(0xffffffff9d712e02, float:-3.191987E-21)
            g0.a r1 = g0.c.e(r5, r4, r3, r12, r1)
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            P.C1285a.a(r8, r2, r1, r12, r0)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0063
            Y.C1506p.P()
            goto L_0x0063
        L_0x00ed:
            Y.Y0 r10 = r12.k()
            if (r10 == 0) goto L_0x0100
            J.a$b r11 = new J.a$b
            r1 = r11
            r2 = r8
            r3 = r9
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r6, r7)
            r10.a(r11)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C1205a.a(P.i, k0.i, long, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void b(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        C1500m h10 = mVar.h(694251107);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (h10.S(iVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) != 2 || !h10.i()) {
            if (i14 != 0) {
                iVar = i.f23074a;
            }
            if (C1506p.H()) {
                C1506p.Q(694251107, i12, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            a0.a(d(q.o(iVar, f2998b, f2997a)), h10, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(iVar, i10, i11));
        }
    }

    private static final i d(i iVar) {
        return h.c(iVar, (C6798l) null, e.f3010a, 1, (Object) null);
    }
}
