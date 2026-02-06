package x;

import H0.C1187h;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import O0.g;
import O0.t;
import O0.v;
import Y.C1500m;
import Y.M0;
import java.util.List;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import r0.C2547y0;
import w0.C2817c;
import yf.C6798l;
import yf.p;

/* renamed from: x.F  reason: case insensitive filesystem */
public abstract class C2842F {

    /* renamed from: x.F$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2817c f27834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27835b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f27836c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k0.c f27837d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1187h f27838e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f27839f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C2547y0 f27840g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f27841h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f27842i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2817c cVar, String str, i iVar, k0.c cVar2, C1187h hVar, float f10, C2547y0 y0Var, int i10, int i11) {
            super(2);
            this.f27834a = cVar;
            this.f27835b = str;
            this.f27836c = iVar;
            this.f27837d = cVar2;
            this.f27838e = hVar;
            this.f27839f = f10;
            this.f27840g = y0Var;
            this.f27841h = i10;
            this.f27842i = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2842F.a(this.f27834a, this.f27835b, this.f27836c, this.f27837d, this.f27838e, this.f27839f, this.f27840g, mVar, M0.a(this.f27841h | 1), this.f27842i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: x.F$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27843a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f27843a = str;
        }

        public final void a(v vVar) {
            t.Y(vVar, this.f27843a);
            t.g0(vVar, g.f4539b.d());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(w0.C2817c r19, java.lang.String r20, k0.i r21, k0.c r22, H0.C1187h r23, float r24, r0.C2547y0 r25, Y.C1500m r26, int r27, int r28) {
        /*
            r2 = r20
            r8 = r27
            r0 = 1142754848(0x441d0e20, float:628.2207)
            r1 = r26
            Y.m r1 = r1.h(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0017
            r3 = r8 | 6
            r4 = r3
            r3 = r19
            goto L_0x002b
        L_0x0017:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r19
            boolean r4 = r1.C(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r8
            goto L_0x002b
        L_0x0028:
            r3 = r19
            r4 = r8
        L_0x002b:
            r5 = r28 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
            goto L_0x0042
        L_0x0032:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x0042
            boolean r5 = r1.S(r2)
            if (r5 == 0) goto L_0x003f
            r5 = 32
            goto L_0x0041
        L_0x003f:
            r5 = 16
        L_0x0041:
            r4 = r4 | r5
        L_0x0042:
            r5 = r28 & 4
            if (r5 == 0) goto L_0x004b
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0048:
            r7 = r21
            goto L_0x005d
        L_0x004b:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0048
            r7 = r21
            boolean r9 = r1.S(r7)
            if (r9 == 0) goto L_0x005a
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r4 = r4 | r9
        L_0x005d:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0066
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0063:
            r10 = r22
            goto L_0x0078
        L_0x0066:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0063
            r10 = r22
            boolean r11 = r1.S(r10)
            if (r11 == 0) goto L_0x0075
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r4 = r4 | r11
        L_0x0078:
            r11 = r28 & 16
            if (r11 == 0) goto L_0x0081
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x007e:
            r12 = r23
            goto L_0x0093
        L_0x0081:
            r12 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x007e
            r12 = r23
            boolean r13 = r1.S(r12)
            if (r13 == 0) goto L_0x0090
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r4 = r4 | r13
        L_0x0093:
            r13 = r28 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009d
            r4 = r4 | r14
        L_0x009a:
            r14 = r24
            goto L_0x00ae
        L_0x009d:
            r14 = r14 & r8
            if (r14 != 0) goto L_0x009a
            r14 = r24
            boolean r15 = r1.c(r14)
            if (r15 == 0) goto L_0x00ab
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r4 = r4 | r15
        L_0x00ae:
            r15 = r28 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00b9
            r4 = r4 | r16
            r6 = r25
            goto L_0x00cc
        L_0x00b9:
            r16 = r8 & r16
            r6 = r25
            if (r16 != 0) goto L_0x00cc
            boolean r16 = r1.S(r6)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r4 = r4 | r16
        L_0x00cc:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r4 & r16
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r3) goto L_0x00e7
            boolean r0 = r1.i()
            if (r0 != 0) goto L_0x00dd
            goto L_0x00e7
        L_0x00dd:
            r1.I()
            r3 = r7
            r4 = r10
            r5 = r12
            r7 = r6
            r6 = r14
            goto L_0x01f1
        L_0x00e7:
            if (r5 == 0) goto L_0x00ec
            k0.i$a r0 = k0.i.f23074a
            r7 = r0
        L_0x00ec:
            if (r9 == 0) goto L_0x00f5
            k0.c$a r0 = k0.c.f23044a
            k0.c r0 = r0.e()
            goto L_0x00f6
        L_0x00f5:
            r0 = r10
        L_0x00f6:
            if (r11 == 0) goto L_0x00ff
            H0.h$a r3 = H0.C1187h.f2609a
            H0.h r3 = r3.d()
            goto L_0x0100
        L_0x00ff:
            r3 = r12
        L_0x0100:
            if (r13 == 0) goto L_0x0105
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0106
        L_0x0105:
            r5 = r14
        L_0x0106:
            r9 = 0
            if (r15 == 0) goto L_0x010a
            r6 = r9
        L_0x010a:
            boolean r10 = Y.C1506p.H()
            if (r10 == 0) goto L_0x0119
            r10 = -1
            java.lang.String r11 = "androidx.compose.foundation.Image (Image.kt:243)"
            r12 = 1142754848(0x441d0e20, float:628.2207)
            Y.C1506p.Q(r12, r4, r10, r11)
        L_0x0119:
            r15 = 0
            if (r2 == 0) goto L_0x014e
            r10 = 1040258775(0x3e0116d7, float:0.12606369)
            r1.T(r10)
            k0.i$a r10 = k0.i.f23074a
            r4 = r4 & 112(0x70, float:1.57E-43)
            r11 = 1
            r12 = 32
            if (r4 != r12) goto L_0x012d
            r4 = r11
            goto L_0x012e
        L_0x012d:
            r4 = r15
        L_0x012e:
            java.lang.Object r12 = r1.A()
            if (r4 != 0) goto L_0x013c
            Y.m$a r4 = Y.C1500m.f10026a
            java.lang.Object r4 = r4.a()
            if (r12 != r4) goto L_0x0144
        L_0x013c:
            x.F$c r12 = new x.F$c
            r12.<init>(r2)
            r1.r(r12)
        L_0x0144:
            yf.l r12 = (yf.C6798l) r12
            k0.i r4 = O0.m.d(r10, r15, r12, r11, r9)
            r1.M()
            goto L_0x0159
        L_0x014e:
            r4 = 1040398089(0x3e033709, float:0.12813963)
            r1.T(r4)
            r1.M()
            k0.i$a r4 = k0.i.f23074a
        L_0x0159:
            k0.i r4 = r7.h(r4)
            k0.i r9 = o0.C2342e.b(r4)
            r16 = 2
            r17 = 0
            r11 = 0
            r10 = r19
            r12 = r0
            r13 = r3
            r14 = r5
            r4 = r15
            r15 = r6
            k0.i r9 = androidx.compose.ui.draw.d.b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            x.F$a r10 = x.C2842F.a.f27832a
            int r4 = Y.C1494j.a(r1, r4)
            k0.i r9 = k0.h.e(r1, r9)
            Y.y r11 = r1.p()
            J0.g$a r12 = J0.C1241g.f3853J
            yf.a r13 = r12.a()
            Y.f r14 = r1.j()
            if (r14 != 0) goto L_0x018e
            Y.C1494j.c()
        L_0x018e:
            r1.F()
            boolean r14 = r1.f()
            if (r14 == 0) goto L_0x019b
            r1.U(r13)
            goto L_0x019e
        L_0x019b:
            r1.q()
        L_0x019e:
            Y.m r13 = Y.F1.a(r1)
            yf.p r14 = r12.c()
            Y.F1.b(r13, r10, r14)
            yf.p r10 = r12.e()
            Y.F1.b(r13, r11, r10)
            yf.p r10 = r12.d()
            Y.F1.b(r13, r9, r10)
            yf.p r9 = r12.b()
            boolean r10 = r13.f()
            if (r10 != 0) goto L_0x01cf
            java.lang.Object r10 = r13.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r10 = kotlin.jvm.internal.C6496s.c(r10, r11)
            if (r10 != 0) goto L_0x01dd
        L_0x01cf:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r13.r(r10)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13.V(r4, r9)
        L_0x01dd:
            r1.u()
            boolean r4 = Y.C1506p.H()
            if (r4 == 0) goto L_0x01e9
            Y.C1506p.P()
        L_0x01e9:
            r4 = r0
            r18 = r5
            r5 = r3
            r3 = r7
            r7 = r6
            r6 = r18
        L_0x01f1:
            Y.Y0 r10 = r1.k()
            if (r10 == 0) goto L_0x0208
            x.F$b r11 = new x.F$b
            r0 = r11
            r1 = r19
            r2 = r20
            r8 = r27
            r9 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0208:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2842F.a(w0.c, java.lang.String, k0.i, k0.c, H0.h, float, r0.y0, Y.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: w0.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(r0.H1 r16, java.lang.String r17, k0.i r18, k0.c r19, H0.C1187h r20, float r21, r0.C2547y0 r22, int r23, Y.C1500m r24, int r25, int r26) {
        /*
            r7 = r24
            r0 = r25
            r1 = r26
            r2 = r1 & 4
            if (r2 == 0) goto L_0x000d
            k0.i$a r2 = k0.i.f23074a
            goto L_0x000f
        L_0x000d:
            r2 = r18
        L_0x000f:
            r3 = r1 & 8
            if (r3 == 0) goto L_0x001a
            k0.c$a r3 = k0.c.f23044a
            k0.c r3 = r3.e()
            goto L_0x001c
        L_0x001a:
            r3 = r19
        L_0x001c:
            r4 = r1 & 16
            if (r4 == 0) goto L_0x0027
            H0.h$a r4 = H0.C1187h.f2609a
            H0.h r4 = r4.d()
            goto L_0x0029
        L_0x0027:
            r4 = r20
        L_0x0029:
            r5 = r1 & 32
            if (r5 == 0) goto L_0x0030
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0032
        L_0x0030:
            r5 = r21
        L_0x0032:
            r6 = r1 & 64
            if (r6 == 0) goto L_0x0038
            r6 = 0
            goto L_0x003a
        L_0x0038:
            r6 = r22
        L_0x003a:
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0046
            t0.f$a r1 = t0.C2605f.f25940d0
            int r1 = r1.b()
            r13 = r1
            goto L_0x0048
        L_0x0046:
            r13 = r23
        L_0x0048:
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x0057
            r1 = -1
            java.lang.String r8 = "androidx.compose.foundation.Image (Image.kt:152)"
            r9 = -1396260732(0xffffffffacc6c084, float:-5.648872E-12)
            Y.C1506p.Q(r9, r0, r1, r8)
        L_0x0057:
            r1 = r16
            boolean r8 = r7.S(r1)
            java.lang.Object r9 = r24.A()
            if (r8 != 0) goto L_0x006b
            Y.m$a r8 = Y.C1500m.f10026a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x007a
        L_0x006b:
            r14 = 6
            r15 = 0
            r9 = 0
            r11 = 0
            r8 = r16
            w0.a r9 = w0.C2816b.b(r8, r9, r11, r13, r14, r15)
            r7.r(r9)
        L_0x007a:
            r1 = r9
            w0.a r1 = (w0.C2815a) r1
            r8 = 4194288(0x3ffff0, float:5.87745E-39)
            r8 = r8 & r0
            r9 = 0
            r0 = r1
            r1 = r17
            r7 = r24
            a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0093
            Y.C1506p.P()
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2842F.b(r0.H1, java.lang.String, k0.i, k0.c, H0.h, float, r0.y0, int, Y.m, int, int):void");
    }

    /* renamed from: x.F$a */
    static final class a implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final a f27832a = new a();

        a() {
        }

        public final G j(H h10, List list, long j10) {
            return H.N(h10, c1.b.n(j10), c1.b.m(j10), (Map) null, C0465a.f27833a, 4, (Object) null);
        }

        /* renamed from: x.F$a$a  reason: collision with other inner class name */
        static final class C0465a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0465a f27833a = new C0465a();

            C0465a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }

            public final void a(U.a aVar) {
            }
        }
    }
}
