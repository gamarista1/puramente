package V;

import C.f0;
import C.h0;
import C.k0;
import C.l0;
import O0.t;
import O0.v;
import X.w;
import X.z;
import Y.C1500m;
import Y.C1506p;
import Y.M0;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.q;
import c1.h;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import r0.C2544x0;
import r0.g2;
import yf.C6798l;
import yf.p;

/* renamed from: V.i  reason: case insensitive filesystem */
public final class C1385i {

    /* renamed from: a  reason: collision with root package name */
    public static final C1385i f7527a = new C1385i();

    /* renamed from: b  reason: collision with root package name */
    private static final float f7528b = z.f9552a.f();

    /* renamed from: c  reason: collision with root package name */
    private static final float f7529c = h.j((float) 56);

    /* renamed from: d  reason: collision with root package name */
    private static final float f7530d = h.j((float) 640);

    /* renamed from: V.i$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7531a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f7531a = str;
        }

        public final void a(v vVar) {
            t.Y(vVar, this.f7531a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.i$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f7532a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f7533b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(float f10, float f11) {
            super(2);
            this.f7532a = f10;
            this.f7533b = f11;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1039573072, i10, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:336)");
                }
                d.a(q.o(i.f23074a, this.f7532a, this.f7533b), mVar, 0);
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

    /* renamed from: V.i$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1385i f7534a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f7535b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f7536c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f7537d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g2 f7538e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f7539f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f7540g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f7541h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C1385i iVar, i iVar2, float f10, float f11, g2 g2Var, long j10, int i10, int i11) {
            super(2);
            this.f7534a = iVar;
            this.f7535b = iVar2;
            this.f7536c = f10;
            this.f7537d = f11;
            this.f7538e = g2Var;
            this.f7539f = j10;
            this.f7540g = i10;
            this.f7541h = i11;
        }

        public final void a(C1500m mVar, int i10) {
            this.f7534a.a(this.f7535b, this.f7536c, this.f7537d, this.f7538e, this.f7539f, mVar, M0.a(this.f7540g | 1), this.f7541h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    private C1385i() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(k0.i r25, float r26, float r27, r0.g2 r28, long r29, Y.C1500m r31, int r32, int r33) {
        /*
            r24 = this;
            r8 = r32
            r0 = 2
            r1 = 4
            r2 = 6
            r3 = 16
            r4 = -1364277227(0xffffffffaeaec815, float:-7.9481456E-11)
            r5 = r31
            Y.m r5 = r5.h(r4)
            r6 = 1
            r7 = r33 & 1
            if (r7 == 0) goto L_0x001b
            r9 = r8 | 6
            r10 = r9
            r9 = r25
            goto L_0x002f
        L_0x001b:
            r9 = r8 & 6
            if (r9 != 0) goto L_0x002c
            r9 = r25
            boolean r10 = r5.S(r9)
            if (r10 == 0) goto L_0x0029
            r10 = r1
            goto L_0x002a
        L_0x0029:
            r10 = r0
        L_0x002a:
            r10 = r10 | r8
            goto L_0x002f
        L_0x002c:
            r9 = r25
            r10 = r8
        L_0x002f:
            r0 = r33 & 2
            if (r0 == 0) goto L_0x0038
            r10 = r10 | 48
        L_0x0035:
            r11 = r26
            goto L_0x0049
        L_0x0038:
            r11 = r8 & 48
            if (r11 != 0) goto L_0x0035
            r11 = r26
            boolean r12 = r5.c(r11)
            if (r12 == 0) goto L_0x0047
            r12 = 32
            goto L_0x0048
        L_0x0047:
            r12 = r3
        L_0x0048:
            r10 = r10 | r12
        L_0x0049:
            r1 = r33 & 4
            if (r1 == 0) goto L_0x0052
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r12 = r27
            goto L_0x0064
        L_0x0052:
            r12 = r8 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004f
            r12 = r27
            boolean r13 = r5.c(r12)
            if (r13 == 0) goto L_0x0061
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r13 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r10 = r10 | r13
        L_0x0064:
            r13 = r8 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x007d
            r13 = r33 & 8
            if (r13 != 0) goto L_0x0077
            r13 = r28
            boolean r14 = r5.S(r13)
            if (r14 == 0) goto L_0x0079
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0077:
            r13 = r28
        L_0x0079:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r10 = r10 | r14
            goto L_0x007f
        L_0x007d:
            r13 = r28
        L_0x007f:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0099
            r14 = r33 & 16
            if (r14 != 0) goto L_0x0092
            r14 = r29
            boolean r16 = r5.e(r14)
            if (r16 == 0) goto L_0x0094
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0092:
            r14 = r29
        L_0x0094:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r10 = r10 | r16
            goto L_0x009b
        L_0x0099:
            r14 = r29
        L_0x009b:
            r4 = r10 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r2) goto L_0x00b1
            boolean r2 = r5.i()
            if (r2 != 0) goto L_0x00a8
            goto L_0x00b1
        L_0x00a8:
            r5.I()
            r2 = r9
            r3 = r11
            r4 = r12
            r6 = r14
            goto L_0x019a
        L_0x00b1:
            r5.D()
            r2 = r8 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x00d7
            boolean r2 = r5.L()
            if (r2 == 0) goto L_0x00c2
            goto L_0x00d7
        L_0x00c2:
            r5.I()
            r0 = r33 & 8
            if (r0 == 0) goto L_0x00cb
            r10 = r10 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00cb:
            r0 = r33 & 16
            if (r0 == 0) goto L_0x00d0
            r10 = r10 & r4
        L_0x00d0:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r22 = r14
            goto L_0x0117
        L_0x00d7:
            if (r7 == 0) goto L_0x00dc
            k0.i$a r2 = k0.i.f23074a
            r9 = r2
        L_0x00dc:
            if (r0 == 0) goto L_0x00e5
            X.z r0 = X.z.f9552a
            float r0 = r0.e()
            r11 = r0
        L_0x00e5:
            if (r1 == 0) goto L_0x00ee
            X.z r0 = X.z.f9552a
            float r0 = r0.d()
            r12 = r0
        L_0x00ee:
            r0 = r33 & 8
            if (r0 == 0) goto L_0x0101
            V.X r0 = V.X.f7146a
            r1 = 6
            V.B0 r0 = r0.b(r5, r1)
            I.a r0 = r0.a()
            r10 = r10 & -7169(0xffffffffffffe3ff, float:NaN)
            r13 = r0
            goto L_0x0102
        L_0x0101:
            r1 = 6
        L_0x0102:
            r0 = r33 & 16
            if (r0 == 0) goto L_0x00d0
            X.z r0 = X.z.f9552a
            X.d r0 = r0.c()
            long r2 = V.C1404s.h(r0, r5, r1)
            r10 = r10 & r4
            r22 = r2
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
        L_0x0117:
            r5.v()
            boolean r4 = Y.C1506p.H()
            if (r4 == 0) goto L_0x0129
            r4 = -1
            java.lang.String r7 = "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:326)"
            r9 = -1364277227(0xffffffffaeaec815, float:-7.9481456E-11)
            Y.C1506p.Q(r9, r10, r4, r7)
        L_0x0129:
            W.v$a r4 = W.v.f8397a
            int r4 = V.C1402q0.f7954c
            int r4 = W.v.a(r4)
            r7 = 0
            java.lang.String r4 = W.w.a(r4, r5, r7)
            r9 = 0
            float r11 = V.D0.f6478a
            r12 = 0
            k0.i r9 = androidx.compose.foundation.layout.n.k(r0, r9, r11, r6, r12)
            boolean r11 = r5.S(r4)
            java.lang.Object r13 = r5.A()
            if (r11 != 0) goto L_0x0152
            Y.m$a r11 = Y.C1500m.f10026a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x015a
        L_0x0152:
            V.i$a r13 = new V.i$a
            r13.<init>(r4)
            r5.r(r13)
        L_0x015a:
            yf.l r13 = (yf.C6798l) r13
            k0.i r9 = O0.m.d(r9, r7, r13, r6, r12)
            V.i$b r4 = new V.i$b
            r4.<init>(r1, r2)
            r7 = 54
            r11 = -1039573072(0xffffffffc2095fb0, float:-34.343445)
            g0.a r18 = g0.c.e(r11, r6, r4, r5, r7)
            r4 = 6
            int r4 = r10 >> 6
            r6 = r4 & 112(0x70, float:1.57E-43)
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 | r7
            r4 = r4 & 896(0x380, float:1.256E-42)
            r20 = r6 | r4
            r21 = 120(0x78, float:1.68E-43)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r10 = r3
            r11 = r22
            r19 = r5
            V.O0.a(r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            boolean r4 = Y.C1506p.H()
            if (r4 == 0) goto L_0x0194
            Y.C1506p.P()
        L_0x0194:
            r4 = r2
            r13 = r3
            r6 = r22
            r2 = r0
            r3 = r1
        L_0x019a:
            Y.Y0 r10 = r5.k()
            if (r10 == 0) goto L_0x01b0
            V.i$c r11 = new V.i$c
            r0 = r11
            r1 = r24
            r5 = r13
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            r10.a(r11)
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1385i.a(k0.i, float, float, r0.g2, long, Y.m, int, int):void");
    }

    public final long b(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(433375448, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:299)");
        }
        long h10 = C1404s.h(z.f9552a.a(), mVar, 6);
        if (C1506p.H()) {
            C1506p.P();
        }
        return h10;
    }

    public final float c() {
        return f7528b;
    }

    public final g2 d(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1683783414, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:295)");
        }
        g2 d10 = C0.d(z.f9552a.b(), mVar, 6);
        if (C1506p.H()) {
            C1506p.P();
        }
        return d10;
    }

    public final long e(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-2040719176, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:306)");
        }
        long o10 = C2544x0.o(C1404s.h(w.f9526a.a(), mVar, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (C1506p.H()) {
            C1506p.P();
        }
        return o10;
    }

    public final float f() {
        return f7530d;
    }

    public final f0 g(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-511309409, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:316)");
        }
        f0 g10 = h0.g(l0.g(f0.f925a, mVar, 6), k0.f979a.e());
        if (C1506p.H()) {
            C1506p.P();
        }
        return g10;
    }
}
