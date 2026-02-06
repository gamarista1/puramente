package V;

import O0.g;
import O0.t;
import O0.v;
import X.o;
import Y.C1500m;
import Y.M0;
import androidx.compose.foundation.layout.q;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import q0.C2427m;
import w0.C2817c;
import x0.C2891d;
import yf.C6798l;
import yf.p;

public abstract class V {

    /* renamed from: a  reason: collision with root package name */
    private static final i f7121a = q.n(i.f23074a, o.f9252a.a());

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2891d f7122a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f7123b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f7124c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f7125d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7126e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f7127f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2891d dVar, String str, i iVar, long j10, int i10, int i11) {
            super(2);
            this.f7122a = dVar;
            this.f7123b = str;
            this.f7124c = iVar;
            this.f7125d = j10;
            this.f7126e = i10;
            this.f7127f = i11;
        }

        public final void a(C1500m mVar, int i10) {
            V.b(this.f7122a, this.f7123b, this.f7124c, this.f7125d, mVar, M0.a(this.f7126e | 1), this.f7127f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2817c f7128a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f7129b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f7130c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f7131d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7132e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f7133f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2817c cVar, String str, i iVar, long j10, int i10, int i11) {
            super(2);
            this.f7128a = cVar;
            this.f7129b = str;
            this.f7130c = iVar;
            this.f7131d = j10;
            this.f7132e = i10;
            this.f7133f = i11;
        }

        public final void a(C1500m mVar, int i10) {
            V.a(this.f7128a, this.f7129b, this.f7130c, this.f7131d, mVar, M0.a(this.f7132e | 1), this.f7133f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7134a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f7134a = str;
        }

        public final void a(v vVar) {
            t.Y(vVar, this.f7134a);
            t.g0(vVar, g.f4539b.d());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(w0.C2817c r20, java.lang.String r21, k0.i r22, long r23, Y.C1500m r25, int r26, int r27) {
        /*
            r9 = r20
            r10 = r21
            r11 = r26
            r0 = -2142239481(0xffffffff80500507, float:-7.348643E-39)
            r1 = r25
            Y.m r12 = r1.h(r0)
            r1 = r27 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r11 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r12.C(r9)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r11
            goto L_0x0026
        L_0x0025:
            r1 = r11
        L_0x0026:
            r2 = r27 & 2
            r3 = 32
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x003e
        L_0x002f:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x003e
            boolean r2 = r12.S(r10)
            if (r2 == 0) goto L_0x003b
            r2 = r3
            goto L_0x003d
        L_0x003b:
            r2 = 16
        L_0x003d:
            r1 = r1 | r2
        L_0x003e:
            r2 = r27 & 4
            if (r2 == 0) goto L_0x0047
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0044:
            r4 = r22
            goto L_0x0059
        L_0x0047:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0044
            r4 = r22
            boolean r5 = r12.S(r4)
            if (r5 == 0) goto L_0x0056
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r1 = r1 | r5
        L_0x0059:
            r5 = r11 & 3072(0xc00, float:4.305E-42)
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x0071
            r5 = r27 & 8
            r7 = r23
            if (r5 != 0) goto L_0x006d
            boolean r5 = r12.e(r7)
            if (r5 == 0) goto L_0x006d
            r5 = r6
            goto L_0x006f
        L_0x006d:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x006f:
            r1 = r1 | r5
            goto L_0x0073
        L_0x0071:
            r7 = r23
        L_0x0073:
            r5 = r1 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r5 != r13) goto L_0x0087
            boolean r5 = r12.i()
            if (r5 != 0) goto L_0x0080
            goto L_0x0087
        L_0x0080:
            r12.I()
            r3 = r4
            r4 = r7
            goto L_0x017f
        L_0x0087:
            r12.D()
            r5 = r11 & 1
            if (r5 == 0) goto L_0x00a0
            boolean r5 = r12.L()
            if (r5 == 0) goto L_0x0095
            goto L_0x00a0
        L_0x0095:
            r12.I()
            r2 = r27 & 8
            if (r2 == 0) goto L_0x009e
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x009e:
            r13 = r4
            goto L_0x00be
        L_0x00a0:
            if (r2 == 0) goto L_0x00a5
            k0.i$a r2 = k0.i.f23074a
            goto L_0x00a6
        L_0x00a5:
            r2 = r4
        L_0x00a6:
            r4 = r27 & 8
            if (r4 == 0) goto L_0x00bd
            Y.I0 r4 = V.A.a()
            java.lang.Object r4 = r12.m(r4)
            r0.x0 r4 = (r0.C2544x0) r4
            long r4 = r4.y()
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r13 = r2
            r7 = r4
            goto L_0x00be
        L_0x00bd:
            r13 = r2
        L_0x00be:
            r12.v()
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x00cd
            r2 = -1
            java.lang.String r4 = "androidx.compose.material3.Icon (Icon.kt:143)"
            Y.C1506p.Q(r0, r1, r2, r4)
        L_0x00cd:
            r0 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r5 = 0
            r2 = 1
            if (r0 <= r6) goto L_0x00db
            boolean r0 = r12.e(r7)
            if (r0 != 0) goto L_0x00df
        L_0x00db:
            r0 = r1 & 3072(0xc00, float:4.305E-42)
            if (r0 != r6) goto L_0x00e1
        L_0x00df:
            r0 = r2
            goto L_0x00e2
        L_0x00e1:
            r0 = r5
        L_0x00e2:
            java.lang.Object r4 = r12.A()
            r6 = 0
            if (r0 != 0) goto L_0x00f1
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x0110
        L_0x00f1:
            r0.x0$a r0 = r0.C2544x0.f25560b
            long r14 = r0.h()
            boolean r0 = r0.C2544x0.q(r7, r14)
            if (r0 == 0) goto L_0x00ff
            r4 = r6
            goto L_0x010d
        L_0x00ff:
            r0.y0$a r14 = r0.C2547y0.f25576b
            r18 = 2
            r19 = 0
            r17 = 0
            r15 = r7
            r0.y0 r0 = r0.C2547y0.a.c(r14, r15, r17, r18, r19)
            r4 = r0
        L_0x010d:
            r12.r(r4)
        L_0x0110:
            r14 = r4
            r0.y0 r14 = (r0.C2547y0) r14
            r0 = -2144891392(0xffffffff80278e00, float:-3.632524E-39)
            r12.T(r0)
            if (r10 == 0) goto L_0x0142
            k0.i$a r0 = k0.i.f23074a
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x0123
            r1 = r2
            goto L_0x0124
        L_0x0123:
            r1 = r5
        L_0x0124:
            java.lang.Object r3 = r12.A()
            if (r1 != 0) goto L_0x0132
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x013a
        L_0x0132:
            V.V$c r3 = new V.V$c
            r3.<init>(r10)
            r12.r(r3)
        L_0x013a:
            yf.l r3 = (yf.C6798l) r3
            k0.i r0 = O0.m.d(r0, r5, r3, r2, r6)
        L_0x0140:
            r15 = r0
            goto L_0x0145
        L_0x0142:
            k0.i$a r0 = k0.i.f23074a
            goto L_0x0140
        L_0x0145:
            r12.M()
            k0.i r0 = androidx.compose.ui.graphics.b.d(r13)
            k0.i r0 = c(r0, r9)
            H0.h$a r1 = H0.C1187h.f2609a
            H0.h r4 = r1.d()
            r16 = 22
            r17 = 0
            r2 = 0
            r3 = 0
            r6 = 0
            r1 = r20
            r5 = r6
            r6 = r14
            r18 = r7
            r7 = r16
            r8 = r17
            k0.i r0 = androidx.compose.ui.draw.d.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            k0.i r0 = r0.h(r15)
            r1 = 0
            androidx.compose.foundation.layout.d.a(r0, r12, r1)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x017c
            Y.C1506p.P()
        L_0x017c:
            r3 = r13
            r4 = r18
        L_0x017f:
            Y.Y0 r8 = r12.k()
            if (r8 == 0) goto L_0x0196
            V.V$b r12 = new V.V$b
            r0 = r12
            r1 = r20
            r2 = r21
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.a(r12)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.V.a(w0.c, java.lang.String, k0.i, long, Y.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(x0.C2891d r17, java.lang.String r18, k0.i r19, long r20, Y.C1500m r22, int r23, int r24) {
        /*
            r1 = r17
            r6 = r23
            r0 = -126890956(0xfffffffff86fcc34, float:-1.9454698E34)
            r2 = r22
            Y.m r2 = r2.h(r0)
            r3 = r24 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r6 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.S(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r6
            goto L_0x0024
        L_0x0023:
            r3 = r6
        L_0x0024:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r4 = r18
            goto L_0x003f
        L_0x002d:
            r4 = r6 & 48
            if (r4 != 0) goto L_0x002a
            r4 = r18
            boolean r5 = r2.S(r4)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r3 = r3 | r5
        L_0x003f:
            r5 = r24 & 4
            if (r5 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r7 = r19
            goto L_0x005a
        L_0x0048:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0045
            r7 = r19
            boolean r8 = r2.S(r7)
            if (r8 == 0) goto L_0x0057
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r8
        L_0x005a:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0073
            r8 = r24 & 8
            if (r8 != 0) goto L_0x006d
            r8 = r20
            boolean r10 = r2.e(r8)
            if (r10 == 0) goto L_0x006f
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006d:
            r8 = r20
        L_0x006f:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r3 = r3 | r10
            goto L_0x0075
        L_0x0073:
            r8 = r20
        L_0x0075:
            r10 = r3 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x0088
            boolean r10 = r2.i()
            if (r10 != 0) goto L_0x0082
            goto L_0x0088
        L_0x0082:
            r2.I()
            r3 = r7
            goto L_0x00f2
        L_0x0088:
            r2.D()
            r10 = r6 & 1
            if (r10 == 0) goto L_0x00a2
            boolean r10 = r2.L()
            if (r10 == 0) goto L_0x0096
            goto L_0x00a2
        L_0x0096:
            r2.I()
            r5 = r24 & 8
            if (r5 == 0) goto L_0x009f
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x009f:
            r5 = r7
        L_0x00a0:
            r15 = r8
            goto L_0x00bd
        L_0x00a2:
            if (r5 == 0) goto L_0x00a7
            k0.i$a r5 = k0.i.f23074a
            goto L_0x00a8
        L_0x00a7:
            r5 = r7
        L_0x00a8:
            r7 = r24 & 8
            if (r7 == 0) goto L_0x00a0
            Y.I0 r7 = V.A.a()
            java.lang.Object r7 = r2.m(r7)
            r0.x0 r7 = (r0.C2544x0) r7
            long r7 = r7.y()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r15 = r7
        L_0x00bd:
            r2.v()
            boolean r7 = Y.C1506p.H()
            if (r7 == 0) goto L_0x00cc
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.Icon (Icon.kt:70)"
            Y.C1506p.Q(r0, r3, r7, r8)
        L_0x00cc:
            r0 = r3 & 14
            x0.q r7 = x0.r.g(r1, r2, r0)
            int r0 = x0.q.f28188n
            r8 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r8
            r8 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r8
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r13 = r0 | r3
            r14 = 0
            r8 = r18
            r9 = r5
            r10 = r15
            r12 = r2
            a(r7, r8, r9, r10, r12, r13, r14)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x00f0
            Y.C1506p.P()
        L_0x00f0:
            r3 = r5
            r8 = r15
        L_0x00f2:
            Y.Y0 r10 = r2.k()
            if (r10 == 0) goto L_0x010a
            V.V$a r11 = new V.V$a
            r0 = r11
            r1 = r17
            r2 = r18
            r4 = r8
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r10.a(r11)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.V.b(x0.d, java.lang.String, k0.i, long, Y.m, int, int):void");
    }

    private static final i c(i iVar, C2817c cVar) {
        i iVar2;
        if (C2427m.h(cVar.k(), C2427m.f25341b.a()) || d(cVar.k())) {
            iVar2 = f7121a;
        } else {
            iVar2 = i.f23074a;
        }
        return iVar.h(iVar2);
    }

    private static final boolean d(long j10) {
        if (!Float.isInfinite(C2427m.k(j10)) || !Float.isInfinite(C2427m.i(j10))) {
            return false;
        }
        return true;
    }
}
