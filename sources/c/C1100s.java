package C;

import C.C1085c;
import C.C1095m;
import C.C1099q;
import C.C1101t;
import Ef.m;
import H0.C1193n;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import Y.C1500m;
import Y.C1506p;
import Y.M0;
import a0.C1538b;
import androidx.collection.B;
import androidx.collection.C;
import androidx.collection.C1598l;
import androidx.collection.C1602p;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import k0.c;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import mf.C6559l;
import mf.C6565s;
import mf.L;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: C.s  reason: case insensitive filesystem */
public abstract class C1100s {

    /* renamed from: a  reason: collision with root package name */
    private static final C1095m f1025a;

    /* renamed from: b  reason: collision with root package name */
    private static final C1095m f1026b;

    /* renamed from: C.s$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f1027a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1085c.e f1028b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1085c.m f1029c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1030d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f1031e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C1106y f1032f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q f1033g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f1034h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f1035i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C1085c.e eVar, C1085c.m mVar, int i10, int i11, C1106y yVar, q qVar, int i12, int i13) {
            super(2);
            this.f1027a = iVar;
            this.f1028b = eVar;
            this.f1029c = mVar;
            this.f1030d = i10;
            this.f1031e = i11;
            this.f1032f = yVar;
            this.f1033g = qVar;
            this.f1034h = i12;
            this.f1035i = i13;
        }

        public final void a(C1500m mVar, int i10) {
            C1100s.a(this.f1027a, this.f1028b, this.f1029c, this.f1030d, this.f1031e, this.f1032f, this.f1033g, mVar, M0.a(this.f1034h | 1), this.f1035i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: C.s$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f1036a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar) {
            super(2);
            this.f1036a = qVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-139531073, i10, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                }
                this.f1036a.invoke(A.f825b, mVar, 6);
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

    /* renamed from: C.s$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f1037a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(N n10) {
            super(1);
            this.f1037a = n10;
        }

        public final void a(U u10) {
            this.f1037a.f71759a = u10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: C.s$d */
    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f1038a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(N n10) {
            super(1);
            this.f1038a = n10;
        }

        public final void a(U u10) {
            this.f1038a.f71759a = u10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: C.s$e */
    static final class e extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int[] f1039a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(int[] iArr) {
            super(3);
            this.f1039a = iArr;
        }

        public final Integer a(C1193n nVar, int i10, int i11) {
            return Integer.valueOf(this.f1039a[i10]);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C1193n) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* renamed from: C.s$f */
    static final class f extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int[] f1040a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int[] iArr) {
            super(3);
            this.f1040a = iArr;
        }

        public final Integer a(C1193n nVar, int i10, int i11) {
            return Integer.valueOf(this.f1040a[i10]);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C1193n) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* renamed from: C.s$g */
    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1538b f1041a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C1538b bVar) {
            super(1);
            this.f1041a = bVar;
        }

        public final void a(U.a aVar) {
            C1538b bVar = this.f1041a;
            int q10 = bVar.q();
            if (q10 > 0) {
                Object[] p10 = bVar.p();
                int i10 = 0;
                do {
                    ((G) p10[i10]).q();
                    i10++;
                } while (i10 < q10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    static {
        C1095m.b bVar = C1095m.f994a;
        c.a aVar = k0.c.f23044a;
        f1025a = bVar.b(aVar.l());
        f1026b = bVar.a(aVar.k());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: C.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x018c, code lost:
        if (r4 == Y.C1500m.f10026a.a()) goto L_0x018e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(k0.i r18, C.C1085c.e r19, C.C1085c.m r20, int r21, int r22, C.C1106y r23, yf.q r24, Y.C1500m r25, int r26, int r27) {
        /*
            r7 = r24
            r8 = r26
            r0 = 437853230(0x1a191c2e, float:3.1662422E-23)
            r1 = r25
            Y.m r1 = r1.h(r0)
            r2 = r27 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r8 | 6
            r4 = r3
            r3 = r18
            goto L_0x002b
        L_0x0017:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r18
            boolean r4 = r1.S(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r8
            goto L_0x002b
        L_0x0028:
            r3 = r18
            r4 = r8
        L_0x002b:
            r5 = r27 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r19
            goto L_0x0046
        L_0x0034:
            r6 = r8 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r19
            boolean r9 = r1.S(r6)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0045
        L_0x0043:
            r9 = 16
        L_0x0045:
            r4 = r4 | r9
        L_0x0046:
            r9 = r27 & 4
            if (r9 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r20
            goto L_0x0061
        L_0x004f:
            r10 = r8 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r20
            boolean r11 = r1.S(r10)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r11
        L_0x0061:
            r11 = r27 & 8
            if (r11 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r12 = r21
            goto L_0x007c
        L_0x006a:
            r12 = r8 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0067
            r12 = r21
            boolean r13 = r1.d(r12)
            if (r13 == 0) goto L_0x0079
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r13
        L_0x007c:
            r13 = r27 & 16
            if (r13 == 0) goto L_0x0085
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r14 = r22
            goto L_0x0097
        L_0x0085:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0082
            r14 = r22
            boolean r15 = r1.d(r14)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r4 = r4 | r15
        L_0x0097:
            r15 = r27 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x00a2
            r4 = r4 | r16
            r0 = r23
            goto L_0x00b5
        L_0x00a2:
            r16 = r8 & r16
            r0 = r23
            if (r16 != 0) goto L_0x00b5
            boolean r16 = r1.S(r0)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r4 = r4 | r16
        L_0x00b5:
            r16 = r27 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r4 = r4 | r17
            goto L_0x00cf
        L_0x00be:
            r16 = r8 & r17
            if (r16 != 0) goto L_0x00cf
            boolean r16 = r1.C(r7)
            if (r16 == 0) goto L_0x00cb
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r4 = r4 | r16
        L_0x00cf:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r4 & r16
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r3) goto L_0x00ec
            boolean r0 = r1.i()
            if (r0 != 0) goto L_0x00e0
            goto L_0x00ec
        L_0x00e0:
            r1.I()
            r2 = r18
            r9 = r23
            r3 = r10
            r4 = r12
            r5 = r14
            goto L_0x0251
        L_0x00ec:
            if (r2 == 0) goto L_0x00f1
            k0.i$a r0 = k0.i.f23074a
            goto L_0x00f3
        L_0x00f1:
            r0 = r18
        L_0x00f3:
            if (r5 == 0) goto L_0x00fc
            C.c r2 = C.C1085c.f882a
            C.c$e r2 = r2.f()
            r6 = r2
        L_0x00fc:
            if (r9 == 0) goto L_0x0105
            C.c r2 = C.C1085c.f882a
            C.c$m r2 = r2.g()
            goto L_0x0106
        L_0x0105:
            r2 = r10
        L_0x0106:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r11 == 0) goto L_0x010d
            r5 = r3
            goto L_0x010e
        L_0x010d:
            r5 = r12
        L_0x010e:
            if (r13 == 0) goto L_0x0111
            goto L_0x0112
        L_0x0111:
            r3 = r14
        L_0x0112:
            if (r15 == 0) goto L_0x011c
            C.y$a r9 = C.C1106y.f1103f
            C.y r9 = r9.a()
            r15 = r9
            goto L_0x011e
        L_0x011c:
            r15 = r23
        L_0x011e:
            boolean r9 = Y.C1506p.H()
            if (r9 == 0) goto L_0x012d
            r9 = -1
            java.lang.String r10 = "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:92)"
            r11 = 437853230(0x1a191c2e, float:3.1662422E-23)
            Y.C1506p.Q(r11, r4, r9, r10)
        L_0x012d:
            r9 = 458752(0x70000, float:6.42848E-40)
            r14 = r4 & r9
            r13 = 0
            r12 = 1
            r9 = 131072(0x20000, float:1.83671E-40)
            if (r14 != r9) goto L_0x0139
            r9 = r12
            goto L_0x013a
        L_0x0139:
            r9 = r13
        L_0x013a:
            java.lang.Object r10 = r1.A()
            if (r9 != 0) goto L_0x0148
            Y.m$a r9 = Y.C1500m.f10026a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x014f
        L_0x0148:
            C.u r10 = r15.b()
            r1.r(r10)
        L_0x014f:
            r11 = r10
            C.u r11 = (C.C1102u) r11
            int r9 = r4 >> 3
            r10 = r9 & 8190(0x1ffe, float:1.1477E-41)
            r9 = r6
            r16 = r10
            r10 = r2
            r18 = r11
            r11 = r5
            r19 = r2
            r2 = r12
            r12 = r3
            r13 = r18
            r2 = r14
            r14 = r1
            r20 = r3
            r3 = r15
            r15 = r16
            H0.K r9 = n(r9, r10, r11, r12, r13, r14, r15)
            r10 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r10) goto L_0x0174
            r13 = 1
            goto L_0x0175
        L_0x0174:
            r13 = 0
        L_0x0175:
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r4
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r2 != r4) goto L_0x017e
            r2 = 1
            goto L_0x017f
        L_0x017e:
            r2 = 0
        L_0x017f:
            r2 = r2 | r13
            java.lang.Object r4 = r1.A()
            if (r2 != 0) goto L_0x018e
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x01ab
        L_0x018e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            C.s$b r2 = new C.s$b
            r2.<init>(r7)
            r10 = -139531073(0xfffffffff7aeecbf, float:-7.0957925E33)
            r11 = 1
            g0.a r2 = g0.c.c(r10, r11, r2)
            r4.add(r2)
            r10 = r18
            r3.a(r10, r4)
            r1.r(r4)
        L_0x01ab:
            java.util.List r4 = (java.util.List) r4
            yf.p r2 = H0.C1202x.a(r4)
            boolean r4 = r1.S(r9)
            java.lang.Object r10 = r1.A()
            if (r4 != 0) goto L_0x01c3
            Y.m$a r4 = Y.C1500m.f10026a
            java.lang.Object r4 = r4.a()
            if (r10 != r4) goto L_0x01ca
        L_0x01c3:
            H0.F r10 = H0.M.a(r9)
            r1.r(r10)
        L_0x01ca:
            H0.F r10 = (H0.F) r10
            r4 = 0
            int r9 = Y.C1494j.a(r1, r4)
            Y.y r11 = r1.p()
            k0.i r12 = k0.h.e(r1, r0)
            J0.g$a r13 = J0.C1241g.f3853J
            yf.a r14 = r13.a()
            Y.f r15 = r1.j()
            if (r15 != 0) goto L_0x01e8
            Y.C1494j.c()
        L_0x01e8:
            r1.F()
            boolean r15 = r1.f()
            if (r15 == 0) goto L_0x01f5
            r1.U(r14)
            goto L_0x01f8
        L_0x01f5:
            r1.q()
        L_0x01f8:
            Y.m r14 = Y.F1.a(r1)
            yf.p r15 = r13.c()
            Y.F1.b(r14, r10, r15)
            yf.p r10 = r13.e()
            Y.F1.b(r14, r11, r10)
            yf.p r10 = r13.b()
            boolean r11 = r14.f()
            if (r11 != 0) goto L_0x0222
            java.lang.Object r11 = r14.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r15)
            if (r11 != 0) goto L_0x0230
        L_0x0222:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r14.r(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r14.V(r9, r10)
        L_0x0230:
            yf.p r9 = r13.d()
            Y.F1.b(r14, r12, r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.invoke(r1, r4)
            r1.u()
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x024a
            Y.C1506p.P()
        L_0x024a:
            r2 = r0
            r9 = r3
            r4 = r5
            r3 = r19
            r5 = r20
        L_0x0251:
            Y.Y0 r10 = r1.k()
            if (r10 == 0) goto L_0x0269
            C.s$a r11 = new C.s$a
            r0 = r11
            r1 = r2
            r2 = r6
            r6 = r9
            r7 = r24
            r8 = r26
            r9 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0269:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C.C1100s.a(k0.i, C.c$e, C.c$m, int, int, C.y, yf.q, Y.m, int, int):void");
    }

    public static final G e(H h10, C1104w wVar, Iterator it, float f10, float f11, long j10, int i10, int i11, C1102u uVar) {
        J j11;
        E e10;
        C1598l lVar;
        Integer num;
        long j12;
        Integer num2;
        B b10;
        C1538b bVar;
        B b11;
        int i12;
        int i13;
        boolean z10;
        E e11;
        ArrayList arrayList;
        long j13;
        N n10;
        C1099q.a aVar;
        int i14;
        int i15;
        int i16;
        int i17;
        E e12;
        Object obj;
        C1598l lVar2;
        Integer num3;
        Integer num4;
        C1598l lVar3;
        long j14;
        B b12;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        C1099q.a aVar2;
        B b13;
        boolean z11;
        Integer num5;
        boolean z12;
        H h11 = h10;
        C1104w wVar2 = wVar;
        Iterator it2 = it;
        C1538b bVar2 = new C1538b(new G[16], 0);
        int l10 = c1.b.l(j10);
        int n11 = c1.b.n(j10);
        int k10 = c1.b.k(j10);
        C b14 = C1602p.b();
        ArrayList arrayList2 = new ArrayList();
        int ceil = (int) ((float) Math.ceil((double) h11.t1(f10)));
        int ceil2 = (int) ((float) Math.ceil((double) h11.t1(f11)));
        long a10 = M.a(0, l10, 0, k10);
        long e13 = M.e(a10, 0, 0, 0, 0, 14, (Object) null);
        if (wVar.l()) {
            j11 = J.Horizontal;
        } else {
            j11 = J.Vertical;
        }
        long f12 = M.f(e13, j11);
        N n12 = new N();
        ArrayList arrayList3 = arrayList2;
        if (!it.hasNext()) {
            e10 = null;
        } else {
            e10 = o(it2, (C1103v) null);
        }
        if (e10 != null) {
            lVar = C1598l.a(k(e10, wVar2, f12, new d(n12)));
        } else {
            lVar = null;
        }
        if (lVar != null) {
            num = Integer.valueOf(C1598l.e(lVar.i()));
        } else {
            num = null;
        }
        if (lVar != null) {
            j12 = f12;
            num2 = Integer.valueOf(C1598l.f(lVar.i()));
        } else {
            j12 = f12;
            num2 = null;
        }
        int i23 = n11;
        B b15 = new B(0, 1, (DefaultConstructorMarker) null);
        B b16 = new B(0, 1, (DefaultConstructorMarker) null);
        C1099q qVar = new C1099q(i10, uVar, j10, i11, ceil, ceil2, (DefaultConstructorMarker) null);
        C1099q.b b17 = qVar.b(it.hasNext(), 0, C1598l.b(l10, k10), lVar, 0, 0, 0, false, false);
        if (b17.a()) {
            if (lVar != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            e11 = e10;
            n10 = n12;
            z10 = true;
            j13 = j12;
            b11 = b16;
            i13 = ceil2;
            i12 = ceil;
            b10 = b15;
            bVar = bVar2;
            arrayList = arrayList3;
            aVar = qVar.a(b17, z12, -1, 0, l10, 0);
        } else {
            b10 = b15;
            e11 = e10;
            n10 = n12;
            z10 = true;
            b11 = b16;
            bVar = bVar2;
            arrayList = arrayList3;
            j13 = j12;
            i13 = ceil2;
            i12 = ceil;
            aVar = null;
        }
        int i24 = l10;
        C1099q.a aVar3 = aVar;
        int i25 = k10;
        E e14 = e11;
        int i26 = i23;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (!b17.a() && e14 != null) {
            C6496s.e(num);
            int intValue = num.intValue();
            C6496s.e(num2);
            int i33 = k10;
            int i34 = i27 + intValue;
            int max = Math.max(i28, num2.intValue());
            int i35 = i24 - intValue;
            int i36 = i29 + 1;
            int i37 = l10;
            uVar.k(i36);
            arrayList.add(e14);
            b14.t(i29, n10.f71759a);
            int i38 = i36 - i30;
            if (!it.hasNext()) {
                obj = null;
                e12 = null;
            } else {
                obj = null;
                e12 = o(it2, (C1103v) null);
            }
            n10.f71759a = obj;
            if (e12 != null) {
                lVar2 = C1598l.a(k(e12, wVar2, j13, new c(n10)));
            } else {
                lVar2 = null;
            }
            if (lVar2 != null) {
                num3 = Integer.valueOf(C1598l.e(lVar2.i()) + i12);
            } else {
                num3 = null;
            }
            if (lVar2 != null) {
                num4 = Integer.valueOf(C1598l.f(lVar2.i()));
            } else {
                num4 = null;
            }
            boolean hasNext = it.hasNext();
            long b18 = C1598l.b(i35, i25);
            if (lVar2 == null) {
                lVar3 = null;
            } else {
                C6496s.e(num3);
                int intValue2 = num3.intValue();
                C6496s.e(num4);
                lVar3 = C1598l.a(C1598l.b(intValue2, num4.intValue()));
            }
            C1099q.b b19 = qVar.b(hasNext, i38, b18, lVar3, i32, i31, max, false, false);
            if (b19.b()) {
                int max2 = Math.max(i26, i34);
                int i39 = i37;
                int min = Math.min(max2, i39);
                int i40 = i31 + max;
                if (lVar2 != null) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                C1099q.a a11 = qVar.a(b19, z11, i32, i40, i35, i38);
                B b20 = b11;
                b20.h(max);
                int i41 = (i33 - i40) - i13;
                B b21 = b10;
                b21.h(i36);
                if (num3 != null) {
                    num5 = Integer.valueOf(num3.intValue() - i12);
                } else {
                    num5 = null;
                }
                i32++;
                i31 = i40 + i13;
                i22 = min;
                l10 = i39;
                i30 = i36;
                j14 = j13;
                num3 = num5;
                b12 = b20;
                i18 = i41;
                i20 = 0;
                aVar2 = a11;
                i19 = l10;
                b13 = b21;
                i21 = 0;
            } else {
                j14 = j13;
                l10 = i37;
                b12 = b11;
                b13 = b10;
                i18 = i25;
                i19 = i35;
                i20 = max;
                i21 = i34;
                i22 = i26;
                aVar2 = aVar3;
            }
            b17 = b19;
            b10 = b13;
            aVar3 = aVar2;
            i26 = i22;
            i27 = i21;
            i28 = i20;
            e14 = e12;
            i24 = i19;
            i29 = i36;
            i25 = i18;
            b11 = b12;
            j13 = j14;
            k10 = i33;
            num = num3;
            num2 = num4;
            it2 = it;
        }
        B b22 = b11;
        B b23 = b10;
        if (aVar3 != null) {
            arrayList.add(aVar3.a());
            b14.t(arrayList.size() - 1, aVar3.d());
            int i42 = b23.f12186b - 1;
            if (aVar3.c()) {
                b22.m(i42, Math.max(b22.a(i42), C1598l.f(aVar3.b())));
                b23.m(b23.b() - 1, b23.f() + 1);
            } else {
                b22.h(C1598l.f(aVar3.b()));
                b23.h(b23.f() + 1);
            }
        }
        int size = arrayList.size();
        U[] uArr = new U[size];
        for (int i43 = 0; i43 < size; i43++) {
            uArr[i43] = b14.c(i43);
        }
        int b24 = b23.b();
        int[] iArr = new int[b24];
        for (int i44 = 0; i44 < b24; i44++) {
            iArr[i44] = 0;
        }
        int b25 = b23.b();
        int[] iArr2 = new int[b25];
        for (int i45 = 0; i45 < b25; i45++) {
            iArr2[i45] = 0;
        }
        int[] iArr3 = b23.f12185a;
        int i46 = b23.f12186b;
        int i47 = i26;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        while (i48 < i46) {
            int i51 = iArr3[i48];
            int a12 = b22.a(i48);
            int i52 = i48;
            B b26 = b22;
            int i53 = i47;
            int i54 = i46;
            int[] iArr4 = iArr3;
            int i55 = i49;
            int[] iArr5 = iArr2;
            int[] iArr6 = iArr;
            U[] uArr2 = uArr;
            G a13 = U.a(wVar, i47, c1.b.m(a10), c1.b.l(a10), a12, i12, h10, arrayList, uArr, i55, i51, iArr, i52);
            if (wVar.l()) {
                i17 = a13.e();
                i16 = a13.d();
            } else {
                i17 = a13.d();
                i16 = a13.e();
            }
            iArr5[i52] = i16;
            i50 += i16;
            i47 = Math.max(i53, i17);
            bVar.b(a13);
            iArr2 = iArr5;
            i49 = i51;
            i46 = i54;
            iArr3 = iArr4;
            iArr = iArr6;
            uArr = uArr2;
            b22 = b26;
            i48 = i52 + 1;
        }
        int i56 = i47;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        C1538b bVar3 = bVar;
        if (bVar3.s()) {
            i15 = 0;
            i14 = 0;
        } else {
            i15 = i56;
            i14 = i50;
        }
        return m(h10, j10, i15, i14, iArr7, bVar3, wVar, iArr8);
    }

    public static final int f(C1193n nVar, boolean z10, int i10) {
        if (z10) {
            return nVar.e0(i10);
        }
        return nVar.s0(i10);
    }

    /* access modifiers changed from: private */
    public static final long g(List list, q qVar, q qVar2, int i10, int i11, int i12, int i13, int i14, C1102u uVar) {
        int i15;
        int i16;
        boolean z10;
        C1598l lVar;
        int i17;
        int i18;
        int i19;
        boolean z11;
        C1598l lVar2;
        int i20;
        int i21;
        boolean z12;
        int i22;
        List list2 = list;
        q qVar3 = qVar;
        q qVar4 = qVar2;
        int i23 = i10;
        int i24 = 0;
        if (list.isEmpty()) {
            return C1598l.b(0, 0);
        }
        C1099q qVar5 = new C1099q(i13, uVar, M.a(0, i23, 0, a.e.API_PRIORITY_OTHER), i14, i11, i12, (DefaultConstructorMarker) null);
        C1193n nVar = (C1193n) C6565s.r0(list2, 0);
        if (nVar != null) {
            i15 = ((Number) qVar4.invoke(nVar, 0, Integer.valueOf(i10))).intValue();
        } else {
            i15 = 0;
        }
        if (nVar != null) {
            i16 = ((Number) qVar3.invoke(nVar, 0, Integer.valueOf(i15))).intValue();
        } else {
            i16 = 0;
        }
        boolean z13 = true;
        if (list.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        long b10 = C1598l.b(i23, a.e.API_PRIORITY_OTHER);
        if (nVar == null) {
            lVar = null;
        } else {
            lVar = C1598l.a(C1598l.b(i16, i15));
        }
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        if (qVar5.b(z10, 0, b10, lVar, 0, 0, 0, false, false).a()) {
            C1102u uVar2 = uVar;
            if (nVar == null) {
                z13 = false;
            }
            C1598l f10 = uVar2.f(z13, 0, 0);
            if (f10 != null) {
                i22 = C1598l.f(f10.i());
            } else {
                i22 = 0;
            }
            return C1598l.b(i22, 0);
        }
        int size = list.size();
        int i28 = i23;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            if (i29 >= size) {
                i17 = i30;
                break;
            }
            int i32 = i28 - i16;
            i17 = i29 + 1;
            int max = Math.max(i27, i15);
            C1193n nVar2 = (C1193n) C6565s.r0(list2, i17);
            if (nVar2 != null) {
                i18 = ((Number) qVar4.invoke(nVar2, Integer.valueOf(i17), Integer.valueOf(i10))).intValue();
            } else {
                i18 = i24;
            }
            if (nVar2 != null) {
                i19 = ((Number) qVar3.invoke(nVar2, Integer.valueOf(i17), Integer.valueOf(i18))).intValue() + i11;
            } else {
                i19 = 0;
            }
            if (i29 + 2 < list.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i33 = i17 - i31;
            long b11 = C1598l.b(i32, a.e.API_PRIORITY_OTHER);
            if (nVar2 == null) {
                lVar2 = null;
            } else {
                lVar2 = C1598l.a(C1598l.b(i19, i18));
            }
            C1099q.b b12 = qVar5.b(z11, i33, b11, lVar2, i25, i26, max, false, false);
            if (b12.b()) {
                i26 += max + i12;
                if (nVar2 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C1099q.a a10 = qVar5.a(b12, z12, i25, i26, i32, i33);
                int i34 = i19 - i11;
                i25++;
                if (!b12.a()) {
                    i20 = i23;
                    i21 = i34;
                    i31 = i17;
                    i27 = 0;
                } else if (a10 != null) {
                    long b13 = a10.b();
                    if (!a10.c()) {
                        i26 += C1598l.f(b13) + i12;
                    }
                }
            } else {
                i27 = max;
                i20 = i32;
                i21 = i19;
            }
            i29 = i17;
            i30 = i29;
            i24 = 0;
            i28 = i20;
            i15 = i18;
        }
        return C1598l.b(i26 - i12, i17);
    }

    private static final long h(List list, int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, int i14, C1102u uVar) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return g(list, new e(iArr), new f(iArr2), i10, i11, i12, i13, i14, uVar);
    }

    public static final int i(C1193n nVar, boolean z10, int i10) {
        if (z10) {
            return nVar.s0(i10);
        }
        return nVar.e0(i10);
    }

    /* access modifiers changed from: private */
    public static final int j(List list, q qVar, int i10, int i11, int i12) {
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < size) {
            int intValue = ((Number) qVar.invoke((C1193n) list.get(i13), Integer.valueOf(i13), Integer.valueOf(i10))).intValue() + i11;
            int i17 = i13 + 1;
            if (i17 - i15 == i12 || i17 == list.size()) {
                i14 = Math.max(i14, (i16 + intValue) - i11);
                i16 = 0;
                i15 = i13;
            } else {
                i16 += intValue;
            }
            i13 = i17;
        }
        return i14;
    }

    public static final long k(E e10, C1104w wVar, long j10, C6798l lVar) {
        if (S.e(S.c(e10)) == 0.0f) {
            V c10 = S.c(e10);
            if (c10 != null) {
                c10.c();
            }
            U v02 = e10.v0(j10);
            lVar.invoke(v02);
            return C1598l.b(wVar.d(v02), wVar.i(v02));
        }
        int i10 = i(e10, wVar.l(), a.e.API_PRIORITY_OTHER);
        return C1598l.b(i10, f(e10, wVar.l(), i10));
    }

    /* access modifiers changed from: private */
    public static final int l(List list, q qVar, q qVar2, int i10, int i11, int i12, int i13, int i14, C1102u uVar) {
        int i15;
        int i16 = i10;
        int i17 = i13;
        int i18 = i14;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i19 = 0; i19 < size; i19++) {
            iArr[i19] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i20 = 0; i20 < size2; i20++) {
            iArr2[i20] = 0;
        }
        int size3 = list.size();
        for (int i21 = 0; i21 < size3; i21++) {
            C1193n nVar = (C1193n) list.get(i21);
            int intValue = ((Number) qVar.invoke(nVar, Integer.valueOf(i21), Integer.valueOf(i10))).intValue();
            iArr[i21] = intValue;
            iArr2[i21] = ((Number) qVar2.invoke(nVar, Integer.valueOf(i21), Integer.valueOf(intValue))).intValue();
        }
        List list2 = list;
        int i22 = a.e.API_PRIORITY_OTHER;
        if (!(i18 == Integer.MAX_VALUE || i17 == Integer.MAX_VALUE)) {
            i22 = i17 * i18;
        }
        if ((i22 >= list.size() || !(uVar.i() == C1101t.a.ExpandIndicator || uVar.i() == C1101t.a.ExpandOrCollapseIndicator)) && (i22 < list.size() || i18 < uVar.g() || uVar.i() != C1101t.a.ExpandOrCollapseIndicator)) {
            i15 = 0;
        } else {
            i15 = 1;
        }
        int min = Math.min(i22 - i15, list.size());
        int d12 = C6559l.d1(iArr) + ((list.size() - 1) * i11);
        if (size2 != 0) {
            int i23 = iArr2[0];
            L t10 = new Ef.i(1, C6559l.h0(iArr2)).iterator();
            while (t10.hasNext()) {
                int i24 = iArr2[t10.a()];
                if (i23 < i24) {
                    i23 = i24;
                }
            }
            if (size != 0) {
                int i25 = iArr[0];
                L t11 = new Ef.i(1, C6559l.h0(iArr)).iterator();
                while (t11.hasNext()) {
                    int i26 = iArr[t11.a()];
                    if (i25 < i26) {
                        i25 = i26;
                    }
                }
                int i27 = i25;
                int i28 = d12;
                while (i27 <= i28 && i23 != i16) {
                    int i29 = (i27 + i28) / 2;
                    int i30 = i28;
                    int i31 = i27;
                    long h10 = h(list, iArr, iArr2, i29, i11, i12, i13, i14, uVar);
                    i23 = C1598l.e(h10);
                    int f10 = C1598l.f(h10);
                    if (i23 > i16 || f10 < min) {
                        i27 = i29 + 1;
                        if (i27 > i30) {
                            return i27;
                        }
                        i28 = i30;
                        d12 = i29;
                        int i32 = i13;
                    } else if (i23 >= i16) {
                        return i29;
                    } else {
                        i28 = i29 - 1;
                        int i33 = i13;
                        d12 = i29;
                        i27 = i31;
                    }
                }
                return d12;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final G m(H h10, long j10, int i10, int i11, int[] iArr, C1538b bVar, C1104w wVar, int[] iArr2) {
        int i12;
        H h11 = h10;
        boolean l10 = wVar.l();
        C1085c.m p10 = wVar.p();
        C1085c.e n10 = wVar.n();
        if (!l10) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            if (n10 != null) {
                int l11 = m.l((h10.E0(n10.m1getSpacingD9Ej5fM()) * (bVar.q() - 1)) + i11, c1.b.m(j10), c1.b.k(j10));
                n10.a(h10, l11, iArr, h10.getLayoutDirection(), iArr2);
                i12 = l11;
            } else {
                throw new IllegalArgumentException("null horizontalArrangement");
            }
        } else if (p10 != null) {
            i12 = m.l((h10.E0(p10.m6getSpacingD9Ej5fM()) * (bVar.q() - 1)) + i11, c1.b.m(j10), c1.b.k(j10));
            int[] iArr5 = iArr;
            p10.arrange(h10, i12, iArr, iArr2);
        } else {
            throw new IllegalArgumentException("null verticalArrangement");
        }
        int i13 = i10;
        int l12 = m.l(i10, c1.b.n(j10), c1.b.l(j10));
        if (!l10) {
            int i14 = i12;
            i12 = l12;
            l12 = i14;
        }
        return H.N(h10, l12, i12, (Map) null, new g(bVar), 4, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: C.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: C.x} */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        if (r4 == Y.C1500m.f10026a.a()) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r0.S(r17) == false) goto L_0x0027;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final H0.K n(C.C1085c.e r17, C.C1085c.m r18, int r19, int r20, C.C1102u r21, Y.C1500m r22, int r23) {
        /*
            r0 = r22
            r1 = r23
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x0013
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)"
            r4 = -2134502475(0xffffffff80c613b5, float:-1.8190498E-38)
            Y.C1506p.Q(r4, r1, r2, r3)
        L_0x0013:
            r2 = r1 & 14
            r2 = r2 ^ 6
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0025
            r2 = r17
            boolean r6 = r0.S(r2)
            if (r6 != 0) goto L_0x002b
            goto L_0x0027
        L_0x0025:
            r2 = r17
        L_0x0027:
            r6 = r1 & 6
            if (r6 != r3) goto L_0x002d
        L_0x002b:
            r3 = r5
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            r6 = r1 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r7 = 32
            r9 = r18
            if (r6 <= r7) goto L_0x003e
            boolean r6 = r0.S(r9)
            if (r6 != 0) goto L_0x0042
        L_0x003e:
            r6 = r1 & 48
            if (r6 != r7) goto L_0x0044
        L_0x0042:
            r6 = r5
            goto L_0x0045
        L_0x0044:
            r6 = r4
        L_0x0045:
            r3 = r3 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r13 = r19
            if (r6 <= r7) goto L_0x0056
            boolean r6 = r0.d(r13)
            if (r6 != 0) goto L_0x005a
        L_0x0056:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != r7) goto L_0x005c
        L_0x005a:
            r6 = r5
            goto L_0x005d
        L_0x005c:
            r6 = r4
        L_0x005d:
            r3 = r3 | r6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 ^ 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            r14 = r20
            if (r6 <= r7) goto L_0x006e
            boolean r6 = r0.d(r14)
            if (r6 != 0) goto L_0x0072
        L_0x006e:
            r1 = r1 & 3072(0xc00, float:4.305E-42)
            if (r1 != r7) goto L_0x0073
        L_0x0072:
            r4 = r5
        L_0x0073:
            r1 = r3 | r4
            r3 = r21
            boolean r4 = r0.S(r3)
            r1 = r1 | r4
            java.lang.Object r4 = r22.A()
            if (r1 != 0) goto L_0x008a
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x00aa
        L_0x008a:
            float r10 = r17.m1getSpacingD9Ej5fM()
            C.m r11 = f1025a
            float r12 = r18.m6getSpacingD9Ej5fM()
            C.x r4 = new C.x
            r7 = 1
            r16 = 0
            r6 = r4
            r8 = r17
            r9 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.r(r4)
        L_0x00aa:
            C.x r4 = (C.C1105x) r4
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x00b5
            Y.C1506p.P()
        L_0x00b5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C.C1100s.n(C.c$e, C.c$m, int, int, C.u, Y.m, int):H0.K");
    }

    private static final E o(Iterator it, C1103v vVar) {
        try {
            return (E) it.next();
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
