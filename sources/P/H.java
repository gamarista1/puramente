package P;

import D0.J;
import Ef.m;
import H0.C1197s;
import J.B;
import J.C1216l;
import J.C1228y;
import J.I;
import J.K;
import J.a0;
import Q0.C1321d;
import Q0.L;
import Q0.Q;
import Y.C1500m;
import Y.M0;
import b1.i;
import c1.r;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public abstract class H {

    static final class a implements C1293i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f4804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f4805b;

        a(G g10, boolean z10) {
            this.f4804a = g10;
            this.f4805b = z10;
        }

        public final long a() {
            return this.f4804a.G(this.f4805b);
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f4806a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f4807b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f4808c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(K k10, C6658d dVar) {
            super(2, dVar);
            this.f4808c = k10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f4808c, dVar);
            bVar.f4807b = obj;
            return bVar;
        }

        public final Object invoke(J j10, C6658d dVar) {
            return ((b) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4806a;
            if (i10 == 0) {
                w.b(obj);
                K k10 = this.f4808c;
                this.f4806a = 1;
                if (B.c((J) this.f4807b, k10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f4809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f4810b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f4811c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f4812d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, i iVar, G g10, int i10) {
            super(2);
            this.f4809a = z10;
            this.f4810b = iVar;
            this.f4811c = g10;
            this.f4812d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            H.a(this.f4809a, this.f4810b, this.f4811c, mVar, M0.a(this.f4812d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4813a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                J.l[] r0 = J.C1216l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                J.l r1 = J.C1216l.Cursor     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                J.l r1 = J.C1216l.SelectionStart     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                J.l r1 = J.C1216l.SelectionEnd     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f4813a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: P.H.d.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: P.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r11, b1.i r12, P.G r13, Y.C1500m r14, int r15) {
        /*
            r0 = -1344558920(0xffffffffafdba8b8, float:-3.995575E-10)
            Y.m r14 = r14.h(r0)
            r1 = r15 & 6
            r2 = 4
            if (r1 != 0) goto L_0x0017
            boolean r1 = r14.b(r11)
            if (r1 == 0) goto L_0x0014
            r1 = r2
            goto L_0x0015
        L_0x0014:
            r1 = 2
        L_0x0015:
            r1 = r1 | r15
            goto L_0x0018
        L_0x0017:
            r1 = r15
        L_0x0018:
            r3 = r15 & 48
            if (r3 != 0) goto L_0x0028
            boolean r3 = r14.S(r12)
            if (r3 == 0) goto L_0x0025
            r3 = 32
            goto L_0x0027
        L_0x0025:
            r3 = 16
        L_0x0027:
            r1 = r1 | r3
        L_0x0028:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0038
            boolean r3 = r14.C(r13)
            if (r3 == 0) goto L_0x0035
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0037
        L_0x0035:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0037:
            r1 = r1 | r3
        L_0x0038:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x004a
            boolean r3 = r14.i()
            if (r3 != 0) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            r14.I()
            goto L_0x00e4
        L_0x004a:
            boolean r3 = Y.C1506p.H()
            if (r3 == 0) goto L_0x0056
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)"
            Y.C1506p.Q(r0, r1, r3, r4)
        L_0x0056:
            r0 = r1 & 14
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L_0x005e
            r5 = r4
            goto L_0x005f
        L_0x005e:
            r5 = r3
        L_0x005f:
            boolean r6 = r14.S(r13)
            r5 = r5 | r6
            java.lang.Object r6 = r14.A()
            if (r5 != 0) goto L_0x0072
            Y.m$a r5 = Y.C1500m.f10026a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0079
        L_0x0072:
            J.K r6 = r13.Q(r11)
            r14.r(r6)
        L_0x0079:
            J.K r6 = (J.K) r6
            boolean r5 = r14.C(r13)
            if (r0 != r2) goto L_0x0082
            r3 = r4
        L_0x0082:
            r0 = r5 | r3
            java.lang.Object r2 = r14.A()
            if (r0 != 0) goto L_0x0092
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x009a
        L_0x0092:
            P.H$a r2 = new P.H$a
            r2.<init>(r13, r11)
            r14.r(r2)
        L_0x009a:
            r0 = r2
            P.i r0 = (P.C1293i) r0
            W0.Q r2 = r13.O()
            long r2 = r2.g()
            boolean r4 = Q0.Q.m(r2)
            k0.i$a r2 = k0.i.f23074a
            boolean r3 = r14.C(r6)
            java.lang.Object r5 = r14.A()
            if (r3 != 0) goto L_0x00bd
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x00c6
        L_0x00bd:
            P.H$b r5 = new P.H$b
            r3 = 0
            r5.<init>(r6, r3)
            r14.r(r5)
        L_0x00c6:
            yf.p r5 = (yf.p) r5
            k0.i r7 = D0.T.d(r2, r6, r5)
            int r1 = r1 << 3
            r9 = r1 & 1008(0x3f0, float:1.413E-42)
            r10 = 16
            r5 = 0
            r1 = r0
            r2 = r11
            r3 = r12
            r8 = r14
            P.C1285a.b(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x00e4
            Y.C1506p.P()
        L_0x00e4:
            Y.Y0 r14 = r14.k()
            if (r14 == 0) goto L_0x00f2
            P.H$c r0 = new P.H$c
            r0.<init>(r11, r12, r13, r15)
            r14.a(r0)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.H.a(boolean, b1.i, P.G, Y.m, int):void");
    }

    public static final long b(G g10, long j10) {
        int i10;
        int i11;
        a0 j11;
        I v10;
        C1321d k10;
        C2421g A10 = g10.A();
        if (A10 == null) {
            return C2421g.f25320b.b();
        }
        long v11 = A10.v();
        C1321d N10 = g10.N();
        if (N10 == null || N10.length() == 0) {
            return C2421g.f25320b.b();
        }
        C1216l C10 = g10.C();
        if (C10 == null) {
            i10 = -1;
        } else {
            i10 = d.f4813a[C10.ordinal()];
        }
        if (i10 == -1) {
            return C2421g.f25320b.b();
        }
        if (i10 == 1 || i10 == 2) {
            i11 = Q.n(g10.O().g());
        } else if (i10 == 3) {
            i11 = Q.i(g10.O().g());
        } else {
            throw new C6535s();
        }
        C1228y L10 = g10.L();
        if (L10 == null || (j11 = L10.j()) == null) {
            return C2421g.f25320b.b();
        }
        C1228y L11 = g10.L();
        if (L11 == null || (v10 = L11.v()) == null || (k10 = v10.k()) == null) {
            return C2421g.f25320b.b();
        }
        int l10 = m.l(g10.J().b(i11), 0, k10.length());
        float m10 = C2421g.m(j11.j(v11));
        L f10 = j11.f();
        int q10 = f10.q(l10);
        float s10 = f10.s(q10);
        float t10 = f10.t(q10);
        float k11 = m.k(m10, Math.min(s10, t10), Math.max(s10, t10));
        if (!r.e(j10, r.f19235b.a()) && Math.abs(m10 - k11) > ((float) (r.g(j10) / 2))) {
            return C2421g.f25320b.b();
        }
        float v12 = f10.v(q10);
        return C2422h.a(k11, ((f10.m(q10) - v12) / ((float) 2)) + v12);
    }

    public static final boolean c(G g10, boolean z10) {
        C1197s i10;
        C2423i b10;
        C1228y L10 = g10.L();
        if (L10 == null || (i10 = L10.i()) == null || (b10 = A.b(i10)) == null) {
            return false;
        }
        return A.a(b10, g10.G(z10));
    }
}
