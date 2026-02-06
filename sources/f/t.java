package F;

import C.N;
import E.C1145n;
import E.M;
import E.x;
import Ug.K;
import androidx.compose.foundation.layout.n;
import c1.c;
import c1.h;
import c1.o;
import kotlin.jvm.internal.C6498u;
import lf.C6535s;
import r0.F1;
import x.C2871j;
import yf.C6787a;
import yf.p;
import z.q;

public abstract class t {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2054a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                z.q[] r0 = z.q.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                z.q r1 = z.q.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                z.q r1 = z.q.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f2054a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: F.t.a.<clinit>():void");
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f2055a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f2056b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1166a f2057c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6787a f2058d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ N f2059e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f2060f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f2061g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ K f2062h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ F1 f2063i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(E e10, q qVar, C1166a aVar, C6787a aVar2, N n10, boolean z10, float f10, K k10, F1 f12) {
            super(2);
            this.f2055a = e10;
            this.f2056b = qVar;
            this.f2057c = aVar;
            this.f2058d = aVar2;
            this.f2059e = n10;
            this.f2060f = z10;
            this.f2061g = f10;
            this.f2062h = k10;
            this.f2063i = f12;
        }

        public final v a(x xVar, long j10) {
            boolean z10;
            int i10;
            long a10;
            x xVar2 = xVar;
            long j11 = j10;
            M.a(this.f2055a.x());
            C2871j.a(j11, this.f2056b);
            C a11 = this.f2057c.a(xVar2, j11);
            if (this.f2056b == q.Vertical) {
                z10 = true;
            } else {
                z10 = false;
            }
            j jVar = (j) this.f2058d.invoke();
            int E02 = xVar2.E0(t.e(this.f2059e, this.f2056b, this.f2060f, xVar.getLayoutDirection()));
            int E03 = xVar2.E0(t.d(this.f2059e, this.f2056b, this.f2060f, xVar.getLayoutDirection()));
            int E04 = xVar2.E0(t.g(this.f2059e, this.f2056b, xVar.getLayoutDirection()));
            if (z10) {
                i10 = c1.b.k(j10);
            } else {
                i10 = c1.b.l(j10);
            }
            int i11 = (i10 - E02) - E03;
            if (z10) {
                a10 = o.a(E04, E02);
            } else {
                a10 = o.a(E02, E04);
            }
            long j12 = a10;
            N n10 = this.f2059e;
            int E05 = xVar2.E0(h.j(n.g(n10, xVar.getLayoutDirection()) + n.f(n10, xVar.getLayoutDirection())));
            N n11 = this.f2059e;
            int E06 = xVar2.E0(h.j(n11.d() + n11.a()));
            int i12 = E02;
            j jVar2 = jVar;
            v k10 = s.k(xVar, this.f2055a, C1145n.a(jVar, this.f2055a.A(), this.f2055a.q()), jVar2, a11, c1.b.d(j10, c.i(j11, E05), 0, c.h(j11, E06), 0, 10, (Object) null), z10, this.f2060f, j12, i11, xVar2.E0(this.f2061g), i12, E03, this.f2062h, this.f2063i);
            E.l(this.f2055a, k10, false, 2, (Object) null);
            return k10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((x) obj, ((c1.b) obj2).r());
        }
    }

    /* access modifiers changed from: private */
    public static final float d(N n10, q qVar, boolean z10, c1.t tVar) {
        int i10 = a.f2054a[qVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new C6535s();
            } else if (z10) {
                return n.g(n10, tVar);
            } else {
                return n.f(n10, tVar);
            }
        } else if (z10) {
            return n10.d();
        } else {
            return n10.a();
        }
    }

    /* access modifiers changed from: private */
    public static final float e(N n10, q qVar, boolean z10, c1.t tVar) {
        int i10 = a.f2054a[qVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new C6535s();
            } else if (z10) {
                return n.f(n10, tVar);
            } else {
                return n.g(n10, tVar);
            }
        } else if (z10) {
            return n10.a();
        } else {
            return n10.d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00de, code lost:
        if (r5 == Y.C1500m.f10026a.a()) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r0.S(r16) == false) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final yf.p f(F.E r15, yf.C6787a r16, C.N r17, boolean r18, z.q r19, float r20, float r21, Ug.K r22, F.C1166a r23, r0.F1 r24, Y.C1500m r25, int r26) {
        /*
            r0 = r25
            r1 = r26
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x0013
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)"
            r4 = 1630140849(0x6129f9b1, float:1.9596824E20)
            Y.C1506p.Q(r4, r1, r2, r3)
        L_0x0013:
            r2 = r15
            boolean r3 = r0.S(r15)
            r4 = r1 & 112(0x70, float:1.57E-43)
            r4 = r4 ^ 48
            r5 = 32
            r6 = 0
            r7 = 1
            if (r4 <= r5) goto L_0x002b
            r4 = r16
            boolean r8 = r0.S(r4)
            if (r8 != 0) goto L_0x0031
            goto L_0x002d
        L_0x002b:
            r4 = r16
        L_0x002d:
            r8 = r1 & 48
            if (r8 != r5) goto L_0x0033
        L_0x0031:
            r5 = r7
            goto L_0x0034
        L_0x0033:
            r5 = r6
        L_0x0034:
            r3 = r3 | r5
            r5 = r1 & 896(0x380, float:1.256E-42)
            r5 = r5 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            r10 = r17
            if (r5 <= r8) goto L_0x0045
            boolean r5 = r0.S(r10)
            if (r5 != 0) goto L_0x0049
        L_0x0045:
            r5 = r1 & 384(0x180, float:5.38E-43)
            if (r5 != r8) goto L_0x004b
        L_0x0049:
            r5 = r7
            goto L_0x004c
        L_0x004b:
            r5 = r6
        L_0x004c:
            r3 = r3 | r5
            r5 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 ^ 3072(0xc00, float:4.305E-42)
            r8 = 2048(0x800, float:2.87E-42)
            r11 = r18
            if (r5 <= r8) goto L_0x005d
            boolean r5 = r0.b(r11)
            if (r5 != 0) goto L_0x0061
        L_0x005d:
            r5 = r1 & 3072(0xc00, float:4.305E-42)
            if (r5 != r8) goto L_0x0063
        L_0x0061:
            r5 = r7
            goto L_0x0064
        L_0x0063:
            r5 = r6
        L_0x0064:
            r3 = r3 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r1
            r5 = r5 ^ 24576(0x6000, float:3.4438E-41)
            r8 = 16384(0x4000, float:2.2959E-41)
            r9 = r19
            if (r5 <= r8) goto L_0x0077
            boolean r5 = r0.S(r9)
            if (r5 != 0) goto L_0x007b
        L_0x0077:
            r5 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r5 != r8) goto L_0x007d
        L_0x007b:
            r5 = r7
            goto L_0x007e
        L_0x007d:
            r5 = r6
        L_0x007e:
            r3 = r3 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r1
            r8 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 ^ r8
            r12 = 131072(0x20000, float:1.83671E-40)
            r13 = r20
            if (r5 <= r12) goto L_0x0091
            boolean r5 = r0.c(r13)
            if (r5 != 0) goto L_0x0095
        L_0x0091:
            r5 = r1 & r8
            if (r5 != r12) goto L_0x0097
        L_0x0095:
            r5 = r7
            goto L_0x0098
        L_0x0097:
            r5 = r6
        L_0x0098:
            r3 = r3 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r1
            r8 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 ^ r8
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r5 <= r12) goto L_0x00ab
            r5 = r21
            boolean r5 = r0.c(r5)
            if (r5 != 0) goto L_0x00af
        L_0x00ab:
            r5 = r1 & r8
            if (r5 != r12) goto L_0x00b1
        L_0x00af:
            r5 = r7
            goto L_0x00b2
        L_0x00b1:
            r5 = r6
        L_0x00b2:
            r3 = r3 | r5
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r1
            r8 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 ^ r8
            r12 = 67108864(0x4000000, float:1.5046328E-36)
            r14 = r23
            if (r5 <= r12) goto L_0x00c5
            boolean r5 = r0.S(r14)
            if (r5 != 0) goto L_0x00c8
        L_0x00c5:
            r1 = r1 & r8
            if (r1 != r12) goto L_0x00c9
        L_0x00c8:
            r6 = r7
        L_0x00c9:
            r1 = r3 | r6
            r3 = r24
            boolean r5 = r0.S(r3)
            r1 = r1 | r5
            java.lang.Object r5 = r25.A()
            if (r1 != 0) goto L_0x00e0
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r5 != r1) goto L_0x00fa
        L_0x00e0:
            F.t$b r1 = new F.t$b
            r5 = r1
            r6 = r15
            r7 = r19
            r8 = r23
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r20
            r13 = r22
            r14 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.r(r1)
        L_0x00fa:
            yf.p r5 = (yf.p) r5
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0105
            Y.C1506p.P()
        L_0x0105:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: F.t.f(F.E, yf.a, C.N, boolean, z.q, float, float, Ug.K, F.a, r0.F1, Y.m, int):yf.p");
    }

    /* access modifiers changed from: private */
    public static final float g(N n10, q qVar, c1.t tVar) {
        int i10 = a.f2054a[qVar.ordinal()];
        if (i10 == 1) {
            return n.g(n10, tVar);
        }
        if (i10 == 2) {
            return n10.d();
        }
        throw new C6535s();
    }
}
