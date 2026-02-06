package w;

import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.L;
import Y.M;
import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import w.C2770N;
import yf.C6787a;
import yf.C6798l;

/* renamed from: w.O  reason: case insensitive filesystem */
public abstract class C2771O {

    /* renamed from: w.O$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f27232a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2770N.a f27233b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f27234c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2769M f27235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Object obj, C2770N.a aVar, Object obj2, C2769M m10) {
            super(0);
            this.f27232a = obj;
            this.f27233b = aVar;
            this.f27234c = obj2;
            this.f27235d = m10;
        }

        public final void invoke() {
            if (!C6496s.c(this.f27232a, this.f27233b.g()) || !C6496s.c(this.f27234c, this.f27233b.k())) {
                this.f27233b.t(this.f27232a, this.f27234c, this.f27235d);
            }
        }
    }

    /* renamed from: w.O$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2770N f27236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2770N.a f27237b;

        /* renamed from: w.O$b$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2770N f27238a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2770N.a f27239b;

            public a(C2770N n10, C2770N.a aVar) {
                this.f27238a = n10;
                this.f27239b = aVar;
            }

            public void dispose() {
                this.f27238a.j(this.f27239b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2770N n10, C2770N.a aVar) {
            super(1);
            this.f27236a = n10;
            this.f27237b = aVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f27236a.f(this.f27237b);
            return new a(this.f27236a, this.f27237b);
        }
    }

    public static final A1 a(C2770N n10, float f10, float f11, C2769M m10, String str, C1500m mVar, int i10, int i11) {
        String str2;
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str2 = "FloatAnimation";
        } else {
            str2 = str;
        }
        if (C1506p.H()) {
            C1506p.Q(-644770905, i12, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i13 = i12 & 1022;
        int i14 = i12 << 3;
        C2770N n11 = n10;
        A1 b10 = b(n11, Float.valueOf(f10), Float.valueOf(f11), t0.f(C6490l.f71789a), m10, str2, mVar, i13 | (57344 & i14) | (i14 & 458752), 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        return b10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: w.N$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: w.N$a} */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Y.A1 b(w.C2770N r7, java.lang.Object r8, java.lang.Object r9, w.r0 r10, w.C2769M r11, java.lang.String r12, Y.C1500m r13, int r14, int r15) {
        /*
            r15 = r15 & 16
            if (r15 == 0) goto L_0x0006
            java.lang.String r12 = "ValueAnimation"
        L_0x0006:
            r6 = r12
            boolean r12 = Y.C1506p.H()
            if (r12 == 0) goto L_0x0016
            r12 = -1
            java.lang.String r15 = "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)"
            r0 = -1062847727(0xffffffffc0a63b11, float:-5.1947103)
            Y.C1506p.Q(r0, r14, r12, r15)
        L_0x0016:
            java.lang.Object r12 = r13.A()
            Y.m$a r15 = Y.C1500m.f10026a
            java.lang.Object r0 = r15.a()
            if (r12 != r0) goto L_0x0030
            w.N$a r12 = new w.N$a
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            r13.r(r12)
        L_0x0030:
            w.N$a r12 = (w.C2770N.a) r12
            r10 = r14 & 112(0x70, float:1.57E-43)
            r10 = r10 ^ 48
            r0 = 32
            r1 = 1
            r2 = 0
            if (r10 <= r0) goto L_0x0042
            boolean r10 = r13.C(r8)
            if (r10 != 0) goto L_0x0046
        L_0x0042:
            r10 = r14 & 48
            if (r10 != r0) goto L_0x0048
        L_0x0046:
            r10 = r1
            goto L_0x0049
        L_0x0048:
            r10 = r2
        L_0x0049:
            r0 = r14 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r0 <= r3) goto L_0x0057
            boolean r0 = r13.C(r9)
            if (r0 != 0) goto L_0x005b
        L_0x0057:
            r0 = r14 & 384(0x180, float:5.38E-43)
            if (r0 != r3) goto L_0x005d
        L_0x005b:
            r0 = r1
            goto L_0x005e
        L_0x005d:
            r0 = r2
        L_0x005e:
            r10 = r10 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r14
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r0 <= r3) goto L_0x006f
            boolean r0 = r13.C(r11)
            if (r0 != 0) goto L_0x0075
        L_0x006f:
            r14 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r14 != r3) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r1 = r2
        L_0x0075:
            r10 = r10 | r1
            java.lang.Object r14 = r13.A()
            if (r10 != 0) goto L_0x0082
            java.lang.Object r10 = r15.a()
            if (r14 != r10) goto L_0x008a
        L_0x0082:
            w.O$a r14 = new w.O$a
            r14.<init>(r8, r12, r9, r11)
            r13.r(r14)
        L_0x008a:
            yf.a r14 = (yf.C6787a) r14
            Y.P.h(r14, r13, r2)
            boolean r8 = r13.C(r7)
            java.lang.Object r9 = r13.A()
            if (r8 != 0) goto L_0x009f
            java.lang.Object r8 = r15.a()
            if (r9 != r8) goto L_0x00a7
        L_0x009f:
            w.O$b r9 = new w.O$b
            r9.<init>(r7, r12)
            r13.r(r9)
        L_0x00a7:
            yf.l r9 = (yf.C6798l) r9
            r7 = 6
            Y.P.c(r12, r9, r13, r7)
            boolean r7 = Y.C1506p.H()
            if (r7 == 0) goto L_0x00b6
            Y.C1506p.P()
        L_0x00b6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2771O.b(w.N, java.lang.Object, java.lang.Object, w.r0, w.M, java.lang.String, Y.m, int, int):Y.A1");
    }

    public static final C2770N c(String str, C1500m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (C1506p.H()) {
            C1506p.Q(1013651573, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object A10 = mVar.A();
        if (A10 == C1500m.f10026a.a()) {
            A10 = new C2770N(str);
            mVar.r(A10);
        }
        C2770N n10 = (C2770N) A10;
        n10.k(mVar, 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        return n10;
    }
}
