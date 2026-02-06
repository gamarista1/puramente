package V;

import C0.e;
import c1.d;
import c1.h;
import c1.y;
import kotlin.jvm.internal.C6498u;
import q0.C2421g;
import q0.C2422h;
import qf.C6658d;
import w.C2762F;
import w.C2797i;
import w.C2798j;
import yf.C6787a;
import yf.C6798l;
import z.q;

public abstract class D0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f6478a = h.j((float) 22);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C2797i f6479b = C2798j.j(300, 0, C2762F.d(), 2, (Object) null);

    public static final class a implements C0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E0 f6480a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f6481b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f6482c;

        a(E0 e02, C6798l lVar, q qVar) {
            this.f6480a = e02;
            this.f6481b = lVar;
            this.f6482c = qVar;
        }

        private final float a(long j10) {
            if (this.f6482c == q.Horizontal) {
                return C2421g.m(j10);
            }
            return C2421g.n(j10);
        }

        private final long b(float f10) {
            float f11;
            q qVar = this.f6482c;
            if (qVar == q.Horizontal) {
                f11 = f10;
            } else {
                f11 = 0.0f;
            }
            if (qVar != q.Vertical) {
                f10 = 0.0f;
            }
            return C2422h.a(f11, f10);
        }

        private final float c(long j10) {
            if (this.f6482c == q.Horizontal) {
                return y.h(j10);
            }
            return y.i(j10);
        }

        public Object D1(long j10, C6658d dVar) {
            float c10 = c(j10);
            float m10 = this.f6480a.m();
            float d10 = this.f6480a.d().o().d();
            if (c10 >= 0.0f || m10 <= d10) {
                j10 = y.f19251b.a();
            } else {
                this.f6481b.invoke(kotlin.coroutines.jvm.internal.b.b(c10));
            }
            return y.b(j10);
        }

        public long M0(long j10, long j11, int i10) {
            if (e.d(i10, e.f1131a.b())) {
                return b(this.f6480a.d().n(a(j11)));
            }
            return C2421g.f25320b.c();
        }

        public Object b0(long j10, long j11, C6658d dVar) {
            this.f6481b.invoke(kotlin.coroutines.jvm.internal.b.b(c(j11)));
            return y.b(j11);
        }

        public long q1(long j10, int i10) {
            float a10 = a(j10);
            if (a10 >= 0.0f || !e.d(i10, e.f1131a.b())) {
                return C2421g.f25320b.c();
            }
            return b(this.f6480a.d().n(a10));
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f6483a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(F0 f02) {
            return Boolean.TRUE;
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f6485b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F0 f6486c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f6487d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f6488e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, d dVar, F0 f02, C6798l lVar, boolean z11) {
            super(0);
            this.f6484a = z10;
            this.f6485b = dVar;
            this.f6486c = f02;
            this.f6487d = lVar;
            this.f6488e = z11;
        }

        /* renamed from: a */
        public final E0 invoke() {
            return new E0(this.f6484a, this.f6485b, this.f6486c, this.f6487d, this.f6488e);
        }
    }

    public static final C0.a a(E0 e02, q qVar, C6798l lVar) {
        return new a(e02, lVar, qVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: V.D0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: V.D0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: V.D0$c} */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ba, code lost:
        if (r2 == Y.C1500m.f10026a.a()) goto L_0x00bc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final V.E0 d(boolean r14, yf.C6798l r15, V.F0 r16, boolean r17, Y.C1500m r18, int r19, int r20) {
        /*
            r4 = r18
            r0 = r19
            r1 = r20 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r6 = r2
            goto L_0x000c
        L_0x000b:
            r6 = r14
        L_0x000c:
            r1 = r20 & 2
            if (r1 == 0) goto L_0x0014
            V.D0$b r1 = V.D0.b.f6483a
            r9 = r1
            goto L_0x0015
        L_0x0014:
            r9 = r15
        L_0x0015:
            r1 = r20 & 4
            if (r1 == 0) goto L_0x001d
            V.F0 r1 = V.F0.Hidden
            r8 = r1
            goto L_0x001f
        L_0x001d:
            r8 = r16
        L_0x001f:
            r1 = r20 & 8
            if (r1 == 0) goto L_0x0025
            r10 = r2
            goto L_0x0027
        L_0x0025:
            r10 = r17
        L_0x0027:
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x0036
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:407)"
            r5 = 1032784200(0x3d8f0948, float:0.06984192)
            Y.C1506p.Q(r5, r0, r1, r3)
        L_0x0036:
            Y.I0 r1 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r1 = r4.m(r1)
            r7 = r1
            c1.d r7 = (c1.d) r7
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r9, r3}
            V.E0$a r3 = V.E0.f6519d
            h0.j r3 = r3.a(r6, r9, r7, r10)
            r5 = r0 & 14
            r5 = r5 ^ 6
            r11 = 4
            r12 = 1
            if (r5 <= r11) goto L_0x0061
            boolean r5 = r4.b(r6)
            if (r5 != 0) goto L_0x0065
        L_0x0061:
            r5 = r0 & 6
            if (r5 != r11) goto L_0x0067
        L_0x0065:
            r5 = r12
            goto L_0x0068
        L_0x0067:
            r5 = r2
        L_0x0068:
            boolean r11 = r4.S(r7)
            r5 = r5 | r11
            r11 = r0 & 896(0x380, float:1.256E-42)
            r11 = r11 ^ 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r11 <= r13) goto L_0x007b
            boolean r11 = r4.S(r8)
            if (r11 != 0) goto L_0x007f
        L_0x007b:
            r11 = r0 & 384(0x180, float:5.38E-43)
            if (r11 != r13) goto L_0x0081
        L_0x007f:
            r11 = r12
            goto L_0x0082
        L_0x0081:
            r11 = r2
        L_0x0082:
            r5 = r5 | r11
            r11 = r0 & 112(0x70, float:1.57E-43)
            r11 = r11 ^ 48
            r13 = 32
            if (r11 <= r13) goto L_0x0091
            boolean r11 = r4.S(r9)
            if (r11 != 0) goto L_0x0095
        L_0x0091:
            r11 = r0 & 48
            if (r11 != r13) goto L_0x0097
        L_0x0095:
            r11 = r12
            goto L_0x0098
        L_0x0097:
            r11 = r2
        L_0x0098:
            r5 = r5 | r11
            r11 = r0 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 ^ 3072(0xc00, float:4.305E-42)
            r13 = 2048(0x800, float:2.87E-42)
            if (r11 <= r13) goto L_0x00a7
            boolean r11 = r4.b(r10)
            if (r11 != 0) goto L_0x00ab
        L_0x00a7:
            r0 = r0 & 3072(0xc00, float:4.305E-42)
            if (r0 != r13) goto L_0x00ac
        L_0x00ab:
            r2 = r12
        L_0x00ac:
            r0 = r5 | r2
            java.lang.Object r2 = r18.A()
            if (r0 != 0) goto L_0x00bc
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00c5
        L_0x00bc:
            V.D0$c r2 = new V.D0$c
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r4.r(r2)
        L_0x00c5:
            r5 = r2
            yf.a r5 = (yf.C6787a) r5
            r6 = 0
            r7 = 4
            r2 = 0
            r0 = r1
            r1 = r3
            r3 = r5
            r4 = r18
            r5 = r6
            r6 = r7
            java.lang.Object r0 = h0.C2018b.e(r0, r1, r2, r3, r4, r5, r6)
            V.E0 r0 = (V.E0) r0
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x00e1
            Y.C1506p.P()
        L_0x00e1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V.D0.d(boolean, yf.l, V.F0, boolean, Y.m, int, int):V.E0");
    }
}
