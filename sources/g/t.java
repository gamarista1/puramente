package G;

import A.j;
import C.N;
import E.C1145n;
import E.M;
import E.x;
import Ef.m;
import H0.G;
import Ug.K;
import Y.C1510r0;
import androidx.compose.foundation.layout.n;
import c1.b;
import c1.o;
import i0.C2057k;
import java.util.List;
import k0.c;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.O;
import x.C2871j;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import z.q;

public abstract class t {

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C f2389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f2390b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f2391c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f2392d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f2393e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f2394f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6787a f2395g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6787a f2396h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c.C0368c f2397i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c.b f2398j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f2399k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ j f2400l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ K f2401m;

        /* renamed from: G.t$a$a  reason: collision with other inner class name */
        static final class C0038a extends C6498u implements yf.q {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x f2402a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f2403b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f2404c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f2405d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0038a(x xVar, long j10, int i10, int i11) {
                super(3);
                this.f2402a = xVar;
                this.f2403b = j10;
                this.f2404c = i10;
                this.f2405d = i11;
            }

            public final G a(int i10, int i11, C6798l lVar) {
                return this.f2402a.d1(c1.c.i(this.f2403b, i10 + this.f2404c), c1.c.h(this.f2403b, i11 + this.f2405d), O.i(), lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (C6798l) obj3);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C c10, q qVar, N n10, boolean z10, float f10, g gVar, C6787a aVar, C6787a aVar2, c.C0368c cVar, c.b bVar, int i10, j jVar, K k10) {
            super(2);
            this.f2389a = c10;
            this.f2390b = qVar;
            this.f2391c = n10;
            this.f2392d = z10;
            this.f2393e = f10;
            this.f2394f = gVar;
            this.f2395g = aVar;
            this.f2396h = aVar2;
            this.f2397i = cVar;
            this.f2398j = bVar;
            this.f2399k = i10;
            this.f2400l = jVar;
            this.f2401m = k10;
        }

        /* JADX INFO: finally extract failed */
        public final u a(x xVar, long j10) {
            boolean z10;
            q qVar;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            long a10;
            int i15;
            int i16;
            C6798l lVar;
            x xVar2 = xVar;
            long j11 = j10;
            M.a(this.f2389a.D());
            q qVar2 = this.f2390b;
            q qVar3 = q.Vertical;
            if (qVar2 == qVar3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                qVar = qVar3;
            } else {
                qVar = q.Horizontal;
            }
            C2871j.a(j11, qVar);
            if (z10) {
                i10 = xVar2.E0(this.f2391c.c(xVar.getLayoutDirection()));
            } else {
                i10 = xVar2.E0(n.g(this.f2391c, xVar.getLayoutDirection()));
            }
            if (z10) {
                i11 = xVar2.E0(this.f2391c.b(xVar.getLayoutDirection()));
            } else {
                i11 = xVar2.E0(n.f(this.f2391c, xVar.getLayoutDirection()));
            }
            int E02 = xVar2.E0(this.f2391c.d());
            int E03 = xVar2.E0(this.f2391c.a());
            int i17 = E02 + E03;
            int i18 = i10 + i11;
            if (z10) {
                i12 = i17;
            } else {
                i12 = i18;
            }
            if (z10 && !this.f2392d) {
                i13 = E02;
            } else if (z10 && this.f2392d) {
                i13 = E03;
            } else if (z10 || this.f2392d) {
                i13 = i11;
            } else {
                i13 = i10;
            }
            int i19 = i12 - i13;
            long n10 = c1.c.n(j11, -i18, -i17);
            this.f2389a.c0(xVar2);
            int E04 = xVar2.E0(this.f2393e);
            if (z10) {
                i14 = b.k(j10) - i17;
            } else {
                i14 = b.l(j10) - i18;
            }
            if (!this.f2392d || i14 > 0) {
                a10 = o.a(i10, E02);
            } else {
                if (!z10) {
                    i10 += i14;
                }
                if (z10) {
                    E02 += i14;
                }
                a10 = o.a(i10, E02);
            }
            long j12 = a10;
            int d10 = m.d(this.f2394f.a(xVar2, i14, E04), 0);
            C c10 = this.f2389a;
            if (this.f2390b == qVar3) {
                i15 = b.l(n10);
            } else {
                i15 = d10;
            }
            if (this.f2390b != qVar3) {
                i16 = b.k(n10);
            } else {
                i16 = d10;
            }
            c10.d0(c1.c.b(0, i15, 0, i16, 5, (Object) null));
            r rVar = (r) this.f2395g.invoke();
            C2057k.a aVar = C2057k.f21728e;
            C c11 = this.f2389a;
            j jVar = this.f2400l;
            C2057k d11 = aVar.d();
            if (d11 != null) {
                lVar = d11.h();
            } else {
                lVar = null;
            }
            C2057k f10 = aVar.f(d11);
            try {
                int U10 = c11.U(rVar, c11.v());
                int d12 = m.d(jVar, i14, d10, E04, i13, i19, c11.v(), c11.w(), c11.F());
                C6514M m10 = C6514M.f71813a;
                aVar.m(d11, f10, lVar);
                List a11 = C1145n.a(rVar, this.f2389a.J(), this.f2389a.u());
                int intValue = ((Number) this.f2396h.invoke()).intValue();
                C1510r0 K10 = this.f2389a.K();
                q qVar4 = this.f2390b;
                c.C0368c cVar = this.f2397i;
                c.b bVar = this.f2398j;
                boolean z11 = this.f2392d;
                int i20 = this.f2399k;
                j jVar2 = this.f2400l;
                K k10 = this.f2401m;
                C0038a aVar2 = r2;
                C0038a aVar3 = new C0038a(xVar, j10, i18, i17);
                u h10 = s.h(xVar, intValue, rVar, i14, i13, i19, E04, U10, d12, n10, qVar4, cVar, bVar, z11, j12, d10, i20, a11, jVar2, K10, k10, aVar2);
                C.p(this.f2389a, h10, false, 2, (Object) null);
                return h10;
            } catch (Throwable th2) {
                aVar.m(d11, f10, lVar);
                throw th2;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((x) obj, ((b) obj2).r());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        if (r0.c(r27) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d8, code lost:
        if (r0.S(r28) == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r0.S(r22) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f1, code lost:
        if (r0.S(r31) == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x010a, code lost:
        if (r0.S(r33) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0127, code lost:
        if (r0.d(r26) == false) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final yf.p a(yf.C6787a r21, G.C r22, C.N r23, boolean r24, z.q r25, int r26, float r27, G.g r28, k0.c.b r29, k0.c.C0368c r30, A.j r31, Ug.K r32, yf.C6787a r33, Y.C1500m r34, int r35, int r36) {
        /*
            r0 = r34
            r1 = r35
            r2 = r36
            boolean r3 = Y.C1506p.H()
            if (r3 == 0) goto L_0x0014
            r3 = 1391419623(0x52ef60e7, float:5.14061468E11)
            java.lang.String r4 = "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)"
            Y.C1506p.Q(r3, r1, r2, r4)
        L_0x0014:
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L_0x0025
            r3 = r22
            boolean r7 = r0.S(r3)
            if (r7 != 0) goto L_0x002b
            goto L_0x0027
        L_0x0025:
            r3 = r22
        L_0x0027:
            r7 = r1 & 48
            if (r7 != r4) goto L_0x002d
        L_0x002b:
            r4 = 1
            goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            r7 = r1 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            r10 = r23
            if (r7 <= r8) goto L_0x003e
            boolean r7 = r0.S(r10)
            if (r7 != 0) goto L_0x0042
        L_0x003e:
            r7 = r1 & 384(0x180, float:5.38E-43)
            if (r7 != r8) goto L_0x0044
        L_0x0042:
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            r4 = r4 | r7
            r7 = r1 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 ^ 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            r11 = r24
            if (r7 <= r9) goto L_0x0056
            boolean r7 = r0.b(r11)
            if (r7 != 0) goto L_0x005a
        L_0x0056:
            r7 = r1 & 3072(0xc00, float:4.305E-42)
            if (r7 != r9) goto L_0x005c
        L_0x005a:
            r7 = 1
            goto L_0x005d
        L_0x005c:
            r7 = 0
        L_0x005d:
            r4 = r4 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r1
            r7 = r7 ^ 24576(0x6000, float:3.4438E-41)
            r9 = 16384(0x4000, float:2.2959E-41)
            r12 = r25
            if (r7 <= r9) goto L_0x0070
            boolean r7 = r0.S(r12)
            if (r7 != 0) goto L_0x0074
        L_0x0070:
            r7 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r7 != r9) goto L_0x0076
        L_0x0074:
            r7 = 1
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            r4 = r4 | r7
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r1
            r9 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r7 ^ r9
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            r15 = r29
            if (r7 <= r13) goto L_0x008a
            boolean r7 = r0.S(r15)
            if (r7 != 0) goto L_0x008e
        L_0x008a:
            r7 = r1 & r9
            if (r7 != r13) goto L_0x0090
        L_0x008e:
            r7 = 1
            goto L_0x0091
        L_0x0090:
            r7 = 0
        L_0x0091:
            r4 = r4 | r7
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r7 & r1
            r9 = 805306368(0x30000000, float:4.656613E-10)
            r7 = r7 ^ r9
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            r14 = r30
            if (r7 <= r13) goto L_0x00a4
            boolean r7 = r0.S(r14)
            if (r7 != 0) goto L_0x00a8
        L_0x00a4:
            r7 = r1 & r9
            if (r7 != r13) goto L_0x00aa
        L_0x00a8:
            r7 = 1
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            r4 = r4 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r1
            r9 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 ^ r9
            r13 = 1048576(0x100000, float:1.469368E-39)
            if (r7 <= r13) goto L_0x00bf
            r7 = r27
            boolean r16 = r0.c(r7)
            if (r16 != 0) goto L_0x00c4
            goto L_0x00c1
        L_0x00bf:
            r7 = r27
        L_0x00c1:
            r9 = r9 & r1
            if (r9 != r13) goto L_0x00c6
        L_0x00c4:
            r9 = 1
            goto L_0x00c7
        L_0x00c6:
            r9 = 0
        L_0x00c7:
            r4 = r4 | r9
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r1
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            r9 = r9 ^ r13
            r5 = 8388608(0x800000, float:1.17549435E-38)
            if (r9 <= r5) goto L_0x00db
            r9 = r28
            boolean r17 = r0.S(r9)
            if (r17 != 0) goto L_0x00e0
            goto L_0x00dd
        L_0x00db:
            r9 = r28
        L_0x00dd:
            r13 = r13 & r1
            if (r13 != r5) goto L_0x00e2
        L_0x00e0:
            r5 = 1
            goto L_0x00e3
        L_0x00e2:
            r5 = 0
        L_0x00e3:
            r4 = r4 | r5
            r5 = r2 & 14
            r5 = r5 ^ 6
            r13 = 4
            if (r5 <= r13) goto L_0x00f4
            r5 = r31
            boolean r17 = r0.S(r5)
            if (r17 != 0) goto L_0x00fa
            goto L_0x00f6
        L_0x00f4:
            r5 = r31
        L_0x00f6:
            r6 = r2 & 6
            if (r6 != r13) goto L_0x00fc
        L_0x00fa:
            r6 = 1
            goto L_0x00fd
        L_0x00fc:
            r6 = 0
        L_0x00fd:
            r4 = r4 | r6
            r6 = r2 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            if (r6 <= r8) goto L_0x010d
            r6 = r33
            boolean r13 = r0.S(r6)
            if (r13 != 0) goto L_0x0113
            goto L_0x010f
        L_0x010d:
            r6 = r33
        L_0x010f:
            r2 = r2 & 384(0x180, float:5.38E-43)
            if (r2 != r8) goto L_0x0115
        L_0x0113:
            r2 = 1
            goto L_0x0116
        L_0x0115:
            r2 = 0
        L_0x0116:
            r2 = r2 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r1
            r8 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 ^ r8
            r13 = 131072(0x20000, float:1.83671E-40)
            if (r4 <= r13) goto L_0x012a
            r4 = r26
            boolean r13 = r0.d(r4)
            if (r13 != 0) goto L_0x0131
            goto L_0x012c
        L_0x012a:
            r4 = r26
        L_0x012c:
            r1 = r1 & r8
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r8) goto L_0x0134
        L_0x0131:
            r16 = 1
            goto L_0x0136
        L_0x0134:
            r16 = 0
        L_0x0136:
            r1 = r2 | r16
            r2 = r32
            boolean r8 = r0.S(r2)
            r1 = r1 | r8
            java.lang.Object r8 = r34.A()
            if (r1 != 0) goto L_0x014d
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r8 != r1) goto L_0x0171
        L_0x014d:
            G.t$a r1 = new G.t$a
            r7 = r1
            r8 = r22
            r9 = r25
            r10 = r23
            r11 = r24
            r12 = r27
            r13 = r28
            r14 = r21
            r15 = r33
            r16 = r30
            r17 = r29
            r18 = r26
            r19 = r31
            r20 = r32
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.r(r1)
            r8 = r1
        L_0x0171:
            yf.p r8 = (yf.p) r8
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x017c
            Y.C1506p.P()
        L_0x017c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: G.t.a(yf.a, G.C, C.N, boolean, z.q, int, float, G.g, k0.c$b, k0.c$c, A.j, Ug.K, yf.a, Y.m, int, int):yf.p");
    }
}
