package androidx.compose.foundation;

import Y.C1500m;
import Y.C1506p;
import androidx.compose.ui.platform.B0;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import x.a0;
import yf.C6787a;
import yf.C6798l;
import yf.q;
import z.C2946d;
import z.n;

public abstract class m {

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f13074a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(0);
            this.f13074a = i10;
        }

        /* renamed from: a */
        public final o invoke() {
            return new o(this.f13074a);
        }
    }

    public static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13075a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f13076b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f13077c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f13078d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f13079e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(o oVar, boolean z10, n nVar, boolean z11, boolean z12) {
            super(1);
            this.f13075a = oVar;
            this.f13076b = z10;
            this.f13077c = nVar;
            this.f13078d = z11;
            this.f13079e = z12;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f13081b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f13082c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f13083d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f13084e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(o oVar, boolean z10, n nVar, boolean z11, boolean z12) {
            super(3);
            this.f13080a = oVar;
            this.f13081b = z10;
            this.f13082c = nVar;
            this.f13083d = z11;
            this.f13084e = z12;
        }

        public final i a(i iVar, C1500m mVar, int i10) {
            z.q qVar;
            mVar.T(1478351300);
            if (C1506p.H()) {
                C1506p.Q(1478351300, i10, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
            }
            i h10 = i.f23074a.h(new ScrollSemanticsElement(this.f13080a, this.f13081b, this.f13082c, this.f13083d, this.f13084e));
            o oVar = this.f13080a;
            if (this.f13084e) {
                qVar = z.q.Vertical;
            } else {
                qVar = z.q.Horizontal;
            }
            i h11 = a0.a(h10, oVar, qVar, this.f13083d, this.f13081b, this.f13082c, oVar.l(), (C2946d) null, mVar, 0, 64).h(new ScrollingLayoutElement(this.f13080a, this.f13081b, this.f13084e));
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return h11;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.o a(int r11, Y.C1500m r12, int r13, int r14) {
        /*
            r0 = 1
            r14 = r14 & r0
            r1 = 0
            if (r14 == 0) goto L_0x0006
            r11 = r1
        L_0x0006:
            boolean r14 = Y.C1506p.H()
            if (r14 == 0) goto L_0x0015
            r14 = -1
            java.lang.String r2 = "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)"
            r3 = -1464256199(0xffffffffa8b93939, float:-2.0563942E-14)
            Y.C1506p.Q(r3, r13, r14, r2)
        L_0x0015:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            androidx.compose.foundation.o$c r14 = androidx.compose.foundation.o.f13092i
            h0.j r5 = r14.a()
            r14 = r13 & 14
            r14 = r14 ^ 6
            r2 = 4
            if (r14 <= r2) goto L_0x002a
            boolean r14 = r12.d(r11)
            if (r14 != 0) goto L_0x0030
        L_0x002a:
            r13 = r13 & 6
            if (r13 != r2) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            java.lang.Object r13 = r12.A()
            if (r0 != 0) goto L_0x003e
            Y.m$a r14 = Y.C1500m.f10026a
            java.lang.Object r14 = r14.a()
            if (r13 != r14) goto L_0x0046
        L_0x003e:
            androidx.compose.foundation.m$a r13 = new androidx.compose.foundation.m$a
            r13.<init>(r11)
            r12.r(r13)
        L_0x0046:
            r7 = r13
            yf.a r7 = (yf.C6787a) r7
            r9 = 0
            r10 = 4
            r6 = 0
            r8 = r12
            java.lang.Object r11 = h0.C2018b.e(r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.foundation.o r11 = (androidx.compose.foundation.o) r11
            boolean r12 = Y.C1506p.H()
            if (r12 == 0) goto L_0x005c
            Y.C1506p.P()
        L_0x005c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.m.a(int, Y.m, int, int):androidx.compose.foundation.o");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: androidx.compose.foundation.m$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.m$b} */
    /* JADX WARNING: type inference failed for: r0v1, types: [yf.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final k0.i b(k0.i r8, androidx.compose.foundation.o r9, boolean r10, z.n r11, boolean r12, boolean r13) {
        /*
            boolean r0 = androidx.compose.ui.platform.C1676z0.b()
            if (r0 == 0) goto L_0x0012
            androidx.compose.foundation.m$b r0 = new androidx.compose.foundation.m$b
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0016
        L_0x0012:
            yf.l r0 = androidx.compose.ui.platform.C1676z0.a()
        L_0x0016:
            androidx.compose.foundation.m$c r7 = new androidx.compose.foundation.m$c
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            k0.i r8 = k0.h.b(r8, r0, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.m.b(k0.i, androidx.compose.foundation.o, boolean, z.n, boolean, boolean):k0.i");
    }

    public static final i c(i iVar, o oVar, boolean z10, n nVar, boolean z11) {
        return b(iVar, oVar, z11, nVar, z10, true);
    }

    public static /* synthetic */ i d(i iVar, o oVar, boolean z10, n nVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            nVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return c(iVar, oVar, z10, nVar, z11);
    }
}
