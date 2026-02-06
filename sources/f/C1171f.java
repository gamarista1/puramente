package F;

import C.C1085c;
import C.N;
import Y.C1500m;
import Y.C1506p;
import Y.M0;
import c1.d;
import c1.h;
import c1.t;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.p;
import z.n;

/* renamed from: F.f  reason: case insensitive filesystem */
public abstract class C1171f {

    /* renamed from: F.f$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f1975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f1976b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ E f1977c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ N f1978d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f1979e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f1980f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C1085c.e f1981g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n f1982h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f1983i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C6798l f1984j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f1985k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f1986l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(H h10, i iVar, E e10, N n10, boolean z10, float f10, C1085c.e eVar, n nVar, boolean z11, C6798l lVar, int i10, int i11) {
            super(2);
            this.f1975a = h10;
            this.f1976b = iVar;
            this.f1977c = e10;
            this.f1978d = n10;
            this.f1979e = z10;
            this.f1980f = f10;
            this.f1981g = eVar;
            this.f1982h = nVar;
            this.f1983i = z11;
            this.f1984j = lVar;
            this.f1985k = i10;
            this.f1986l = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1171f.a(this.f1975a, this.f1976b, this.f1977c, this.f1978d, this.f1979e, this.f1980f, this.f1981g, this.f1982h, this.f1983i, this.f1984j, mVar, M0.a(this.f1985k | 1), this.f1986l);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: F.f$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f1987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ H f1988b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1085c.e f1989c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(N n10, H h10, C1085c.e eVar) {
            super(2);
            this.f1987a = n10;
            this.f1988b = h10;
            this.f1989c = eVar;
        }

        public final C a(d dVar, long j10) {
            if (c1.b.l(j10) != Integer.MAX_VALUE) {
                N n10 = this.f1987a;
                t tVar = t.Ltr;
                int l10 = c1.b.l(j10) - dVar.E0(h.j(androidx.compose.foundation.layout.n.g(n10, tVar) + androidx.compose.foundation.layout.n.f(this.f1987a, tVar)));
                H h10 = this.f1988b;
                C1085c.e eVar = this.f1989c;
                int[] a10 = h10.a(dVar, l10, dVar.E0(eVar.m1getSpacingD9Ej5fM()));
                int[] iArr = new int[a10.length];
                eVar.a(dVar, l10, a10, tVar, iArr);
                return new C(iArr, a10);
            }
            throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((d) obj, ((c1.b) obj2).r());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(F.H r29, k0.i r30, F.E r31, C.N r32, boolean r33, float r34, C.C1085c.e r35, z.n r36, boolean r37, yf.C6798l r38, Y.C1500m r39, int r40, int r41) {
        /*
            r1 = r29
            r11 = r40
            r12 = r41
            r0 = 1695323794(0x650c9692, float:4.1494302E22)
            r2 = r39
            Y.m r2 = r2.h(r0)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r11 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.S(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r11
            goto L_0x0026
        L_0x0025:
            r3 = r11
        L_0x0026:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r5 = r30
            goto L_0x0041
        L_0x002f:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x002c
            r5 = r30
            boolean r6 = r2.S(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r3 = r3 | r6
        L_0x0041:
            r6 = r11 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005a
            r6 = r12 & 4
            if (r6 != 0) goto L_0x0054
            r6 = r31
            boolean r7 = r2.C(r6)
            if (r7 == 0) goto L_0x0056
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0054:
            r6 = r31
        L_0x0056:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r3 = r3 | r7
            goto L_0x005c
        L_0x005a:
            r6 = r31
        L_0x005c:
            r7 = r12 & 8
            if (r7 == 0) goto L_0x0065
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r8 = r32
            goto L_0x0077
        L_0x0065:
            r8 = r11 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0062
            r8 = r32
            boolean r9 = r2.S(r8)
            if (r9 == 0) goto L_0x0074
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r9
        L_0x0077:
            r9 = r12 & 16
            if (r9 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r10 = r33
            goto L_0x0092
        L_0x0080:
            r10 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x007d
            r10 = r33
            boolean r13 = r2.b(r10)
            if (r13 == 0) goto L_0x008f
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r13
        L_0x0092:
            r13 = r12 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009c
            r3 = r3 | r14
        L_0x0099:
            r14 = r34
            goto L_0x00ad
        L_0x009c:
            r14 = r14 & r11
            if (r14 != 0) goto L_0x0099
            r14 = r34
            boolean r15 = r2.c(r14)
            if (r15 == 0) goto L_0x00aa
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r3 = r3 | r15
        L_0x00ad:
            r15 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00b8
            r3 = r3 | r16
            r0 = r35
            goto L_0x00cb
        L_0x00b8:
            r16 = r11 & r16
            r0 = r35
            if (r16 != 0) goto L_0x00cb
            boolean r17 = r2.S(r0)
            if (r17 == 0) goto L_0x00c7
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c9
        L_0x00c7:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00c9:
            r3 = r3 | r17
        L_0x00cb:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x00e7
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e0
            r0 = r36
            boolean r17 = r2.S(r0)
            if (r17 == 0) goto L_0x00e2
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e4
        L_0x00e0:
            r0 = r36
        L_0x00e2:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e4:
            r3 = r3 | r17
            goto L_0x00e9
        L_0x00e7:
            r0 = r36
        L_0x00e9:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f4
            r3 = r3 | r17
            r5 = r37
            goto L_0x0107
        L_0x00f4:
            r17 = r11 & r17
            r5 = r37
            if (r17 != 0) goto L_0x0107
            boolean r17 = r2.b(r5)
            if (r17 == 0) goto L_0x0103
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0105
        L_0x0103:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0105:
            r3 = r3 | r17
        L_0x0107:
            r5 = r12 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r5 == 0) goto L_0x0112
            r3 = r3 | r17
        L_0x010f:
            r5 = r38
            goto L_0x0125
        L_0x0112:
            r5 = r11 & r17
            if (r5 != 0) goto L_0x010f
            r5 = r38
            boolean r17 = r2.C(r5)
            if (r17 == 0) goto L_0x0121
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0123
        L_0x0121:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0123:
            r3 = r3 | r17
        L_0x0125:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r3 & r17
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r6) goto L_0x0148
            boolean r5 = r2.i()
            if (r5 != 0) goto L_0x0136
            goto L_0x0148
        L_0x0136:
            r2.I()
            r4 = r30
            r3 = r31
            r9 = r36
            r7 = r8
            r5 = r10
            r6 = r14
            r8 = r35
            r10 = r37
            goto L_0x0247
        L_0x0148:
            r2.D()
            r5 = r11 & 1
            r6 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r5 == 0) goto L_0x0174
            boolean r5 = r2.L()
            if (r5 == 0) goto L_0x0159
            goto L_0x0174
        L_0x0159:
            r2.I()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0162
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0162:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0167
            r3 = r3 & r6
        L_0x0167:
            r4 = r30
            r5 = r31
            r6 = r35
            r9 = r36
            r0 = r37
            r7 = r8
            r8 = r14
            goto L_0x01cb
        L_0x0174:
            if (r4 == 0) goto L_0x0179
            k0.i$a r4 = k0.i.f23074a
            goto L_0x017b
        L_0x0179:
            r4 = r30
        L_0x017b:
            r5 = r12 & 4
            r6 = 0
            if (r5 == 0) goto L_0x0188
            r5 = 3
            F.E r5 = F.F.a(r6, r6, r2, r6, r5)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x018a
        L_0x0188:
            r5 = r31
        L_0x018a:
            if (r7 == 0) goto L_0x0196
            float r7 = (float) r6
            float r7 = c1.h.j(r7)
            C.N r7 = androidx.compose.foundation.layout.n.a(r7)
            goto L_0x0197
        L_0x0196:
            r7 = r8
        L_0x0197:
            if (r9 == 0) goto L_0x019a
            r10 = r6
        L_0x019a:
            if (r13 == 0) goto L_0x01a2
            float r8 = (float) r6
            float r8 = c1.h.j(r8)
            goto L_0x01a3
        L_0x01a2:
            r8 = r14
        L_0x01a3:
            if (r15 == 0) goto L_0x01b1
            C.c r9 = C.C1085c.f882a
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            C.c$f r6 = r9.n(r6)
            goto L_0x01b3
        L_0x01b1:
            r6 = r35
        L_0x01b3:
            r9 = r12 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01c3
            z.x r9 = z.x.f29064a
            r13 = 6
            z.n r9 = r9.a(r2, r13)
            r13 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r13
            goto L_0x01c5
        L_0x01c3:
            r9 = r36
        L_0x01c5:
            if (r0 == 0) goto L_0x01c9
            r0 = 1
            goto L_0x01cb
        L_0x01c9:
            r0 = r37
        L_0x01cb:
            r2.v()
            boolean r13 = Y.C1506p.H()
            if (r13 == 0) goto L_0x01dd
            r13 = -1
            java.lang.String r14 = "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:72)"
            r15 = 1695323794(0x650c9692, float:4.1494302E22)
            Y.C1506p.Q(r15, r3, r13, r14)
        L_0x01dd:
            z.q r14 = z.q.Vertical
            float r22 = r6.m1getSpacingD9Ej5fM()
            r13 = r3 & 14
            int r15 = r3 >> 15
            r15 = r15 & 112(0x70, float:1.57E-43)
            r13 = r13 | r15
            int r15 = r3 >> 3
            r11 = r15 & 896(0x380, float:1.256E-42)
            r11 = r11 | r13
            F.a r11 = b(r1, r6, r7, r2, r11)
            int r13 = r3 >> 6
            r13 = r13 & 14
            r13 = r13 | 48
            int r1 = r3 << 6
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r13
            int r13 = r3 << 3
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r13 & r16
            r1 = r1 | r16
            r16 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r16
            r1 = r1 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r15
            r1 = r1 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r15
            r1 = r1 | r13
            int r13 = r3 << 9
            r15 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r15
            r25 = r1 | r13
            int r1 = r3 >> 27
            r26 = r1 & 14
            r27 = 0
            r13 = r5
            r15 = r11
            r16 = r4
            r17 = r7
            r18 = r10
            r19 = r9
            r20 = r0
            r21 = r8
            r23 = r38
            r24 = r2
            F.o.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x023f
            Y.C1506p.P()
        L_0x023f:
            r3 = r5
            r5 = r10
            r10 = r0
            r28 = r8
            r8 = r6
            r6 = r28
        L_0x0247:
            Y.Y0 r13 = r2.k()
            if (r13 == 0) goto L_0x0263
            F.f$a r14 = new F.f$a
            r0 = r14
            r1 = r29
            r2 = r4
            r4 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0263:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F.C1171f.a(F.H, k0.i, F.E, C.N, boolean, float, C.c$e, z.n, boolean, yf.l, Y.m, int, int):void");
    }

    private static final C1166a b(H h10, C1085c.e eVar, N n10, C1500m mVar, int i10) {
        boolean z10;
        boolean z11;
        if (C1506p.H()) {
            C1506p.Q(-1267076841, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:94)");
        }
        boolean z12 = false;
        if ((((i10 & 14) ^ 6) <= 4 || !mVar.S(h10)) && (i10 & 6) != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((((i10 & 112) ^ 48) <= 32 || !mVar.S(eVar)) && (i10 & 48) != 32) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z13 = z10 | z11;
        if ((((i10 & 896) ^ 384) > 256 && mVar.S(n10)) || (i10 & 384) == 256) {
            z12 = true;
        }
        boolean z14 = z13 | z12;
        Object A10 = mVar.A();
        if (z14 || A10 == C1500m.f10026a.a()) {
            A10 = new B(new b(n10, h10, eVar));
            mVar.r(A10);
        }
        C1166a aVar = (C1166a) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return aVar;
    }
}
