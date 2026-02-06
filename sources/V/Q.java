package V;

import B.l;
import H0.F;
import J0.C1241g;
import O0.g;
import O0.t;
import O0.v;
import W.u;
import X.C1465h;
import X.C1467j;
import X.r;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.M0;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.q;
import c1.h;
import k0.c;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import r0.g2;
import w.C2798j;
import w.q0;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class Q {

    /* renamed from: a  reason: collision with root package name */
    private static final float f6863a = h.j((float) 16);

    /* renamed from: b  reason: collision with root package name */
    private static final float f6864b = h.j((float) 12);

    /* renamed from: c  reason: collision with root package name */
    private static final float f6865c = h.j((float) 20);

    /* renamed from: d  reason: collision with root package name */
    private static final float f6866d = h.j((float) 80);

    /* renamed from: e  reason: collision with root package name */
    private static final k f6867e;

    /* renamed from: f  reason: collision with root package name */
    private static final i f6868f;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f6869a = new a();

        a() {
            super(1);
        }

        public final void a(v vVar) {
            t.g0(vVar, g.f4539b.a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f6870a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f6871b;

        static final class a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f6872a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(p pVar) {
                super(2);
                this.f6872a = pVar;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(-1771489750, i10, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:123)");
                    }
                    i.a aVar = k0.i.f23074a;
                    C1467j jVar = C1467j.f9106a;
                    k0.i a10 = q.a(aVar, jVar.e(), jVar.c());
                    k0.c e10 = k0.c.f23044a.e();
                    p pVar = this.f6872a;
                    F h10 = d.h(e10, false);
                    int a11 = C1494j.a(mVar, 0);
                    C1523y p10 = mVar.p();
                    k0.i e11 = k0.h.e(mVar, a10);
                    C1241g.a aVar2 = C1241g.f3853J;
                    C6787a a12 = aVar2.a();
                    if (mVar.j() == null) {
                        C1494j.c();
                    }
                    mVar.F();
                    if (mVar.f()) {
                        mVar.U(a12);
                    } else {
                        mVar.q();
                    }
                    C1500m a13 = F1.a(mVar);
                    F1.b(a13, h10, aVar2.c());
                    F1.b(a13, p10, aVar2.e());
                    p b10 = aVar2.b();
                    if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                        a13.r(Integer.valueOf(a11));
                        a13.V(Integer.valueOf(a11), b10);
                    }
                    F1.b(a13, e11, aVar2.d());
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(long j10, p pVar) {
            super(2);
            this.f6870a = j10;
            this.f6871b = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1249316354, i10, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:119)");
                }
                u.a(this.f6870a, Z0.c(C1465h.f9066a.a(), mVar, 6), g0.c.e(-1771489750, true, new a(this.f6871b), mVar, 54), mVar, 384);
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
        final /* synthetic */ C6787a f6873a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.i f6874b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g2 f6875c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f6876d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f6877e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ O f6878f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ l f6879g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f6880h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f6881i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f6882j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6787a aVar, k0.i iVar, g2 g2Var, long j10, long j11, O o10, l lVar, p pVar, int i10, int i11) {
            super(2);
            this.f6873a = aVar;
            this.f6874b = iVar;
            this.f6875c = g2Var;
            this.f6876d = j10;
            this.f6877e = j11;
            this.f6878f = o10;
            this.f6879g = lVar;
            this.f6880h = pVar;
            this.f6881i = i10;
            this.f6882j = i11;
        }

        public final void a(C1500m mVar, int i10) {
            Q.a(this.f6873a, this.f6874b, this.f6875c, this.f6876d, this.f6877e, this.f6878f, this.f6879g, this.f6880h, mVar, M0.a(this.f6881i | 1), this.f6882j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static {
        r rVar = r.f9331a;
        k q10 = androidx.compose.animation.g.q(C2798j.j(100, 0, rVar.b(), 2, (Object) null), 0.0f, 2, (Object) null);
        q0 j10 = C2798j.j(500, 0, rVar.a(), 2, (Object) null);
        c.a aVar = k0.c.f23044a;
        f6867e = q10.c(androidx.compose.animation.g.u(j10, aVar.k(), false, (C6798l) null, 12, (Object) null));
        f6868f = androidx.compose.animation.g.o(C2798j.i(200, 100, rVar.b()), 0.0f, 2, (Object) null).c(androidx.compose.animation.g.i(C2798j.j(500, 0, rVar.a(), 2, (Object) null), aVar.k(), false, (C6798l) null, 12, (Object) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(yf.C6787a r31, k0.i r32, r0.g2 r33, long r34, long r36, V.O r38, B.l r39, yf.p r40, Y.C1500m r41, int r42, int r43) {
        /*
            r10 = r40
            r11 = r42
            r12 = r43
            r0 = -731723913(0xffffffffd462c777, float:-3.89603629E12)
            r1 = r41
            Y.m r9 = r1.h(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r11 | 6
            r13 = r31
            goto L_0x002a
        L_0x0018:
            r1 = r11 & 6
            r13 = r31
            if (r1 != 0) goto L_0x0029
            boolean r1 = r9.C(r13)
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r11
            goto L_0x002a
        L_0x0029:
            r1 = r11
        L_0x002a:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0033
            r1 = r1 | 48
        L_0x0030:
            r3 = r32
            goto L_0x0045
        L_0x0033:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0030
            r3 = r32
            boolean r4 = r9.S(r3)
            if (r4 == 0) goto L_0x0042
            r4 = 32
            goto L_0x0044
        L_0x0042:
            r4 = 16
        L_0x0044:
            r1 = r1 | r4
        L_0x0045:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x005e
            r4 = r12 & 4
            if (r4 != 0) goto L_0x0058
            r4 = r33
            boolean r5 = r9.S(r4)
            if (r5 == 0) goto L_0x005a
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x0058:
            r4 = r33
        L_0x005a:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r1 = r1 | r5
            goto L_0x0060
        L_0x005e:
            r4 = r33
        L_0x0060:
            r5 = r11 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0079
            r5 = r12 & 8
            if (r5 != 0) goto L_0x0073
            r5 = r34
            boolean r7 = r9.e(r5)
            if (r7 == 0) goto L_0x0075
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0073:
            r5 = r34
        L_0x0075:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r1 = r1 | r7
            goto L_0x007b
        L_0x0079:
            r5 = r34
        L_0x007b:
            r7 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0094
            r7 = r12 & 16
            if (r7 != 0) goto L_0x008e
            r7 = r36
            boolean r14 = r9.e(r7)
            if (r14 == 0) goto L_0x0090
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x008e:
            r7 = r36
        L_0x0090:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r14
            goto L_0x0096
        L_0x0094:
            r7 = r36
        L_0x0096:
            r14 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00b0
            r14 = r12 & 32
            if (r14 != 0) goto L_0x00aa
            r14 = r38
            boolean r15 = r9.S(r14)
            if (r15 == 0) goto L_0x00ac
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00aa:
            r14 = r38
        L_0x00ac:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r1 = r1 | r15
            goto L_0x00b2
        L_0x00b0:
            r14 = r38
        L_0x00b2:
            r15 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bd
            r1 = r1 | r16
            r0 = r39
            goto L_0x00d0
        L_0x00bd:
            r16 = r11 & r16
            r0 = r39
            if (r16 != 0) goto L_0x00d0
            boolean r17 = r9.S(r0)
            if (r17 == 0) goto L_0x00cc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r1 = r1 | r17
        L_0x00d0:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00d9
            r1 = r1 | r17
            goto L_0x00e9
        L_0x00d9:
            r0 = r11 & r17
            if (r0 != 0) goto L_0x00e9
            boolean r0 = r9.C(r10)
            if (r0 == 0) goto L_0x00e6
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e8
        L_0x00e6:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e8:
            r1 = r1 | r0
        L_0x00e9:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0106
            boolean r0 = r9.i()
            if (r0 != 0) goto L_0x00f9
            goto L_0x0106
        L_0x00f9:
            r9.I()
            r2 = r32
            r11 = r39
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r14
            goto L_0x024c
        L_0x0106:
            r9.D()
            r0 = r11 & 1
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x013d
            boolean r0 = r9.L()
            if (r0 == 0) goto L_0x011a
            goto L_0x013d
        L_0x011a:
            r9.I()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0123
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0123:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0129
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0129:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x012f
            r1 = r1 & r18
        L_0x012f:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0135
            r1 = r1 & r17
        L_0x0135:
            r0 = r32
            r2 = r39
            r3 = r1
            r1 = r14
            goto L_0x01af
        L_0x013d:
            if (r2 == 0) goto L_0x0142
            k0.i$a r0 = k0.i.f23074a
            goto L_0x0144
        L_0x0142:
            r0 = r32
        L_0x0144:
            r2 = r12 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0154
            V.N r2 = V.N.f6763a
            r0.g2 r2 = r2.c(r9, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r19 = r2
            goto L_0x0156
        L_0x0154:
            r19 = r4
        L_0x0156:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0163
            V.N r2 = V.N.f6763a
            long r2 = r2.b(r9, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r2
        L_0x0163:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x0176
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = V.C1404s.c(r5, r9, r2)
            r1 = r1 & r18
            r18 = r1
            r20 = r2
            goto L_0x017a
        L_0x0176:
            r18 = r1
            r20 = r7
        L_0x017a:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0195
            V.N r1 = V.N.f6763a
            r7 = 24576(0x6000, float:3.4438E-41)
            r8 = 15
            r2 = 0
            r3 = 0
            r4 = 0
            r14 = 0
            r22 = r5
            r5 = r14
            r6 = r9
            V.O r1 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            r2 = r18 & r17
            r14 = r1
            r1 = r2
            goto L_0x0199
        L_0x0195:
            r22 = r5
            r1 = r18
        L_0x0199:
            if (r15 == 0) goto L_0x01a5
            r3 = r1
            r1 = r14
            r4 = r19
            r7 = r20
            r5 = r22
            r2 = 0
            goto L_0x01af
        L_0x01a5:
            r2 = r39
            r3 = r1
            r1 = r14
            r4 = r19
            r7 = r20
            r5 = r22
        L_0x01af:
            r9.v()
            boolean r14 = Y.C1506p.H()
            if (r14 == 0) goto L_0x01c1
            r14 = -1
            java.lang.String r15 = "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:106)"
            r11 = -731723913(0xffffffffd462c777, float:-3.89603629E12)
            Y.C1506p.Q(r11, r3, r14, r15)
        L_0x01c1:
            r11 = 519755085(0x1efad54d, float:2.6557999E-20)
            r9.T(r11)
            if (r2 != 0) goto L_0x01df
            java.lang.Object r11 = r9.A()
            Y.m$a r14 = Y.C1500m.f10026a
            java.lang.Object r14 = r14.a()
            if (r11 != r14) goto L_0x01dc
            B.l r11 = B.k.a()
            r9.r(r11)
        L_0x01dc:
            B.l r11 = (B.l) r11
            goto L_0x01e0
        L_0x01df:
            r11 = r2
        L_0x01e0:
            r9.M()
            r14 = 0
            V.Q$a r15 = V.Q.a.f6869a
            r32 = r2
            r2 = 1
            r12 = 0
            k0.i r14 = O0.m.d(r0, r14, r15, r2, r12)
            float r21 = r1.g()
            int r12 = r3 >> 12
            r12 = r12 & 112(0x70, float:1.57E-43)
            Y.A1 r12 = r1.f(r11, r9, r12)
            java.lang.Object r12 = r12.getValue()
            c1.h r12 = (c1.h) r12
            float r22 = r12.r()
            V.Q$b r12 = new V.Q$b
            r12.<init>(r7, r10)
            r15 = 54
            r30 = r0
            r0 = 1249316354(0x4a770e02, float:4047744.5)
            g0.a r25 = g0.c.e(r0, r2, r12, r9, r15)
            r0 = r3 & 14
            int r2 = r3 << 3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r3
            r27 = r0 | r2
            r28 = 6
            r29 = 260(0x104, float:3.64E-43)
            r15 = 0
            r23 = 0
            r13 = r31
            r16 = r4
            r17 = r5
            r19 = r7
            r24 = r11
            r26 = r9
            V.O0.b(r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0244
            Y.C1506p.P()
        L_0x0244:
            r11 = r32
            r3 = r4
            r4 = r5
            r6 = r7
            r2 = r30
            r8 = r1
        L_0x024c:
            Y.Y0 r13 = r9.k()
            if (r13 == 0) goto L_0x0264
            V.Q$c r14 = new V.Q$c
            r0 = r14
            r1 = r31
            r9 = r11
            r10 = r40
            r11 = r42
            r12 = r43
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0264:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.Q.a(yf.a, k0.i, r0.g2, long, long, V.O, B.l, yf.p, Y.m, int, int):void");
    }
}
