package V;

import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.I0;
import Y.M0;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.p;

public abstract class Y {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f7148a = C1521x.f(a.f7149a);

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7149a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Y0 f7150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f7151b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Y0 y02, p pVar) {
            super(2);
            this.f7150a = y02;
            this.f7151b = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1066563262, i10, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:68)");
                }
                T0.a(this.f7150a.c(), this.f7151b, mVar, 0);
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
        final /* synthetic */ r f7152a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ B0 f7153b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Y0 f7154c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f7155d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7156e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f7157f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar, B0 b02, Y0 y02, p pVar, int i10, int i11) {
            super(2);
            this.f7152a = rVar;
            this.f7153b = b02;
            this.f7154c = y02;
            this.f7155d = pVar;
            this.f7156e = i10;
            this.f7157f = i11;
        }

        public final void a(C1500m mVar, int i10) {
            Y.a(this.f7152a, this.f7153b, this.f7154c, this.f7155d, mVar, M0.a(this.f7156e | 1), this.f7157f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008e, code lost:
        if ((r15 & 4) != 0) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(V.r r9, V.B0 r10, V.Y0 r11, yf.p r12, Y.C1500m r13, int r14, int r15) {
        /*
            r0 = -2127166334(0xffffffff81360482, float:-3.3431355E-38)
            Y.m r13 = r13.h(r0)
            r1 = r14 & 6
            if (r1 != 0) goto L_0x001a
            r1 = r15 & 1
            if (r1 != 0) goto L_0x0017
            boolean r1 = r13.S(r9)
            if (r1 == 0) goto L_0x0017
            r1 = 4
            goto L_0x0018
        L_0x0017:
            r1 = 2
        L_0x0018:
            r1 = r1 | r14
            goto L_0x001b
        L_0x001a:
            r1 = r14
        L_0x001b:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x002f
            r2 = r15 & 2
            if (r2 != 0) goto L_0x002c
            boolean r2 = r13.S(r10)
            if (r2 == 0) goto L_0x002c
            r2 = 32
            goto L_0x002e
        L_0x002c:
            r2 = 16
        L_0x002e:
            r1 = r1 | r2
        L_0x002f:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0043
            r2 = r15 & 4
            if (r2 != 0) goto L_0x0040
            boolean r2 = r13.S(r11)
            if (r2 == 0) goto L_0x0040
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0042
        L_0x0040:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r15 & 8
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x005a
        L_0x004a:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x005a
            boolean r2 = r13.C(r12)
            if (r2 == 0) goto L_0x0057
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0059
        L_0x0057:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0059:
            r1 = r1 | r2
        L_0x005a:
            r2 = r1 & 1171(0x493, float:1.641E-42)
            r3 = 1170(0x492, float:1.64E-42)
            if (r2 != r3) goto L_0x006f
            boolean r2 = r13.i()
            if (r2 != 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            r13.I()
        L_0x006a:
            r2 = r9
            r3 = r10
            r4 = r11
            goto L_0x012f
        L_0x006f:
            r13.D()
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0094
            boolean r2 = r13.L()
            if (r2 == 0) goto L_0x007d
            goto L_0x0094
        L_0x007d:
            r13.I()
            r2 = r15 & 1
            if (r2 == 0) goto L_0x0086
            r1 = r1 & -15
        L_0x0086:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x008c
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x008c:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0092
        L_0x0090:
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0092:
            r8 = r1
            goto L_0x00b8
        L_0x0094:
            r2 = r15 & 1
            r3 = 6
            if (r2 == 0) goto L_0x00a1
            V.X r9 = V.X.f7146a
            V.r r9 = r9.a(r13, r3)
            r1 = r1 & -15
        L_0x00a1:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x00ad
            V.X r10 = V.X.f7146a
            V.B0 r10 = r10.b(r13, r3)
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ad:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0092
            V.X r11 = V.X.f7146a
            V.Y0 r11 = r11.c(r13, r3)
            goto L_0x0090
        L_0x00b8:
            r13.v()
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x00c7
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:55)"
            Y.C1506p.Q(r0, r8, r1, r2)
        L_0x00c7:
            r6 = 0
            r7 = 7
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = r13
            x.G r0 = V.C1409u0.d(r1, r2, r3, r5, r6, r7)
            r1 = r8 & 14
            P.K r1 = b(r9, r13, r1)
            Y.I0 r2 = V.C1404s.g()
            Y.J0 r3 = r2.d(r9)
            Y.I0 r2 = androidx.compose.foundation.j.a()
            Y.J0 r4 = r2.d(r0)
            Y.I0 r0 = U.s.d()
            V.t r2 = V.C1406t.f8016b
            Y.J0 r5 = r0.d(r2)
            Y.I0 r0 = V.C0.c()
            Y.J0 r6 = r0.d(r10)
            Y.I0 r0 = P.L.b()
            Y.J0 r7 = r0.d(r1)
            Y.I0 r0 = V.Z0.b()
            Y.J0 r8 = r0.d(r11)
            Y.J0[] r0 = new Y.J0[]{r3, r4, r5, r6, r7, r8}
            V.Y$b r1 = new V.Y$b
            r1.<init>(r11, r12)
            r2 = 54
            r3 = -1066563262(0xffffffffc06d8942, float:-3.7115026)
            r4 = 1
            g0.a r1 = g0.c.e(r3, r4, r1, r13, r2)
            int r2 = Y.J0.f9784i
            r2 = r2 | 48
            Y.C1521x.b(r0, r1, r13, r2)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x006a
            Y.C1506p.P()
            goto L_0x006a
        L_0x012f:
            Y.Y0 r9 = r13.k()
            if (r9 == 0) goto L_0x0141
            V.Y$c r10 = new V.Y$c
            r1 = r10
            r5 = r12
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.Y.a(V.r, V.B0, V.Y0, yf.p, Y.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: P.K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: P.K} */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r13 == Y.C1500m.f10026a.a()) goto L_0x0025;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final P.K b(V.r r11, Y.C1500m r12, int r13) {
        /*
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:159)"
            r2 = 1866455512(0x6f3fd9d8, float:5.9374994E28)
            Y.C1506p.Q(r2, r13, r0, r1)
        L_0x000f:
            long r0 = r11.D()
            boolean r11 = r12.e(r0)
            java.lang.Object r13 = r12.A()
            if (r11 != 0) goto L_0x0025
            Y.m$a r11 = Y.C1500m.f10026a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x003e
        L_0x0025:
            P.K r13 = new P.K
            r9 = 14
            r10 = 0
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            long r6 = r0.C2544x0.o(r3, r5, r6, r7, r8, r9, r10)
            r8 = 0
            r3 = r13
            r4 = r0
            r3.<init>(r4, r6, r8)
            r12.r(r13)
        L_0x003e:
            P.K r13 = (P.K) r13
            boolean r11 = Y.C1506p.H()
            if (r11 == 0) goto L_0x0049
            Y.C1506p.P()
        L_0x0049:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: V.Y.b(V.r, Y.m, int):P.K");
    }
}
