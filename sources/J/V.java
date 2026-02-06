package J;

import B.l;
import Q0.L;
import W0.Q;
import W0.a0;
import W0.c0;
import Y.A1;
import Y.C1500m;
import Y.p1;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C1676z0;
import c1.d;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6535s;
import o0.C2342e;
import q0.C2423i;
import qf.C6658d;
import x.C2848L;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;
import z.y;

public abstract class V {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2966a;

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
                f2966a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: J.V.a.<clinit>():void");
        }
    }

    public static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ W f2967a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f2968b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f2969c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(W w10, l lVar, boolean z10) {
            super(1);
            this.f2967a = w10;
            this.f2968b = lVar;
            this.f2969c = z10;
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
        final /* synthetic */ W f2970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f2971b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f2972c;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ W f2973a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(W w10) {
                super(1);
                this.f2973a = w10;
            }

            public final Float a(float f10) {
                float d10 = this.f2973a.d() + f10;
                if (d10 > this.f2973a.c()) {
                    f10 = this.f2973a.c() - this.f2973a.d();
                } else if (d10 < 0.0f) {
                    f10 = -this.f2973a.d();
                }
                W w10 = this.f2973a;
                w10.h(w10.d() + f10);
                return Float.valueOf(f10);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).floatValue());
            }
        }

        public static final class b implements y {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ y f2974a;

            /* renamed from: b  reason: collision with root package name */
            private final A1 f2975b;

            /* renamed from: c  reason: collision with root package name */
            private final A1 f2976c;

            static final class a extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ W f2977a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(W w10) {
                    super(0);
                    this.f2977a = w10;
                }

                /* renamed from: a */
                public final Boolean invoke() {
                    boolean z10;
                    if (this.f2977a.d() > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
            }

            /* renamed from: J.V$c$b$b  reason: collision with other inner class name */
            static final class C0061b extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ W f2978a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0061b(W w10) {
                    super(0);
                    this.f2978a = w10;
                }

                /* renamed from: a */
                public final Boolean invoke() {
                    boolean z10;
                    if (this.f2978a.d() < this.f2978a.c()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
            }

            b(y yVar, W w10) {
                this.f2974a = yVar;
                this.f2975b = p1.e(new C0061b(w10));
                this.f2976c = p1.e(new a(w10));
            }

            public boolean b() {
                return this.f2974a.b();
            }

            public boolean c() {
                return ((Boolean) this.f2976c.getValue()).booleanValue();
            }

            public boolean d() {
                return ((Boolean) this.f2975b.getValue()).booleanValue();
            }

            public Object e(C2848L l10, p pVar, C6658d dVar) {
                return this.f2974a.e(l10, pVar, dVar);
            }

            public float f(float f10) {
                return this.f2974a.f(f10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(W w10, boolean z10, l lVar) {
            super(3);
            this.f2970a = w10;
            this.f2971b = z10;
            this.f2972c = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: J.V$c$b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final k0.i a(k0.i r13, Y.C1500m r14, int r15) {
            /*
                r12 = this;
                r13 = 805428266(0x3001dc2a, float:4.72428E-10)
                r14.T(r13)
                boolean r0 = Y.C1506p.H()
                if (r0 == 0) goto L_0x0012
                r0 = -1
                java.lang.String r1 = "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)"
                Y.C1506p.Q(r13, r15, r0, r1)
            L_0x0012:
                Y.I0 r13 = androidx.compose.ui.platform.C1644k0.k()
                java.lang.Object r13 = r14.m(r13)
                c1.t r15 = c1.t.Rtl
                r0 = 1
                r1 = 0
                if (r13 != r15) goto L_0x0022
                r13 = r0
                goto L_0x0023
            L_0x0022:
                r13 = r1
            L_0x0023:
                J.W r15 = r12.f2970a
                z.q r15 = r15.f()
                z.q r2 = z.q.Vertical
                if (r15 == r2) goto L_0x0032
                if (r13 != 0) goto L_0x0030
                goto L_0x0032
            L_0x0030:
                r7 = r1
                goto L_0x0033
            L_0x0032:
                r7 = r0
            L_0x0033:
                J.W r13 = r12.f2970a
                boolean r13 = r14.S(r13)
                J.W r15 = r12.f2970a
                java.lang.Object r2 = r14.A()
                if (r13 != 0) goto L_0x0049
                Y.m$a r13 = Y.C1500m.f10026a
                java.lang.Object r13 = r13.a()
                if (r2 != r13) goto L_0x0051
            L_0x0049:
                J.V$c$a r2 = new J.V$c$a
                r2.<init>(r15)
                r14.r(r2)
            L_0x0051:
                yf.l r2 = (yf.C6798l) r2
                z.y r13 = z.z.b(r2, r14, r1)
                boolean r15 = r14.S(r13)
                J.W r2 = r12.f2970a
                boolean r2 = r14.S(r2)
                r15 = r15 | r2
                J.W r2 = r12.f2970a
                java.lang.Object r3 = r14.A()
                if (r15 != 0) goto L_0x0072
                Y.m$a r15 = Y.C1500m.f10026a
                java.lang.Object r15 = r15.a()
                if (r3 != r15) goto L_0x007a
            L_0x0072:
                J.V$c$b r3 = new J.V$c$b
                r3.<init>(r13, r2)
                r14.r(r3)
            L_0x007a:
                r4 = r3
                J.V$c$b r4 = (J.V.c.b) r4
                k0.i$a r3 = k0.i.f23074a
                J.W r13 = r12.f2970a
                z.q r5 = r13.f()
                boolean r13 = r12.f2971b
                if (r13 == 0) goto L_0x0097
                J.W r13 = r12.f2970a
                float r13 = r13.c()
                r15 = 0
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 != 0) goto L_0x0095
                goto L_0x0097
            L_0x0095:
                r6 = r0
                goto L_0x0098
            L_0x0097:
                r6 = r1
            L_0x0098:
                B.l r9 = r12.f2972c
                r10 = 16
                r11 = 0
                r8 = 0
                k0.i r13 = androidx.compose.foundation.gestures.d.i(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r15 = Y.C1506p.H()
                if (r15 == 0) goto L_0x00ab
                Y.C1506p.P()
            L_0x00ab:
                r14.M()
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: J.V.c.a(k0.i, Y.m, int):k0.i");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    /* access modifiers changed from: private */
    public static final C2423i b(d dVar, int i10, a0 a0Var, L l10, boolean z10, int i11) {
        C2423i a10;
        float i12;
        float f10;
        if (l10 == null || (a10 = l10.e(a0Var.a().b(i10))) == null) {
            a10 = C2423i.f25325e.a();
        }
        C2423i iVar = a10;
        int E02 = dVar.E0(L.b());
        if (z10) {
            i12 = (((float) i11) - iVar.i()) - ((float) E02);
        } else {
            i12 = iVar.i();
        }
        float f11 = i12;
        if (z10) {
            f10 = ((float) i11) - iVar.i();
        } else {
            f10 = iVar.i() + ((float) E02);
        }
        return C2423i.d(iVar, f11, 0.0f, f10, 0.0f, 10, (Object) null);
    }

    public static final i c(i iVar, W w10, Q q10, c0 c0Var, C6787a aVar) {
        i iVar2;
        z.q f10 = w10.f();
        int e10 = w10.e(q10.g());
        w10.i(q10.g());
        a0 c10 = p0.c(c0Var, q10.e());
        int i10 = a.f2966a[f10.ordinal()];
        if (i10 == 1) {
            iVar2 = new q0(w10, e10, c10, aVar);
        } else if (i10 == 2) {
            iVar2 = new C1219o(w10, e10, c10, aVar);
        } else {
            throw new C6535s();
        }
        return C2342e.b(iVar).h(iVar2);
    }

    public static final i d(i iVar, W w10, l lVar, boolean z10) {
        C6798l lVar2;
        if (C1676z0.b()) {
            lVar2 = new b(w10, lVar, z10);
        } else {
            lVar2 = C1676z0.a();
        }
        return h.b(iVar, lVar2, new c(w10, z10, lVar));
    }
}
