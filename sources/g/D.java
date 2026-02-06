package G;

import A.j;
import E.C1139h;
import Ef.m;
import H0.G;
import Ug.L;
import c1.h;
import c1.r;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import mf.O;
import qf.C6658d;
import rf.C6680b;
import w.C2797i;
import w.l0;
import yf.C6787a;
import yf.p;
import z.q;
import z.v;

public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    private static final float f2221a = h.j((float) 56);

    /* renamed from: b  reason: collision with root package name */
    private static final u f2222b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final b f2223c = new b();

    public static final class b implements c1.d {

        /* renamed from: a  reason: collision with root package name */
        private final float f2227a = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        private final float f2228b = 1.0f;

        b() {
        }

        public float getDensity() {
            return this.f2227a;
        }

        public float r1() {
            return this.f2228b;
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f2229a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f2230b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f2231c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2232d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1139h f2233e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f2234f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C2797i f2235g;

        static final class a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ K f2236a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f2237b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10, v vVar) {
                super(2);
                this.f2236a = k10;
                this.f2237b = vVar;
            }

            public final void a(float f10, float f11) {
                this.f2236a.f71756a += this.f2237b.a(f10 - this.f2236a.f71756a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar, int i10, C1139h hVar, float f10, C2797i iVar, C6658d dVar) {
            super(2, dVar);
            this.f2231c = pVar;
            this.f2232d = i10;
            this.f2233e = hVar;
            this.f2234f = f10;
            this.f2235g = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f2231c, this.f2232d, this.f2233e, this.f2234f, this.f2235g, dVar);
            cVar.f2230b = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(v vVar, C6658d dVar) {
            return ((c) create(vVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            int i10;
            Object f10 = C6680b.f();
            int i11 = this.f2229a;
            if (i11 == 0) {
                w.b(obj);
                v vVar = (v) this.f2230b;
                this.f2231c.invoke(vVar, kotlin.coroutines.jvm.internal.b.c(this.f2232d));
                if (this.f2232d > this.f2233e.g()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int b10 = (this.f2233e.b() - this.f2233e.g()) + 1;
                if (((z10 && this.f2232d > this.f2233e.b()) || (!z10 && this.f2232d < this.f2233e.g())) && Math.abs(this.f2232d - this.f2233e.g()) >= 3) {
                    if (z10) {
                        i10 = m.d(this.f2232d - b10, this.f2233e.g());
                    } else {
                        i10 = m.h(this.f2232d + b10, this.f2233e.g());
                    }
                    this.f2233e.d(vVar, i10, 0);
                }
                float c10 = this.f2233e.c(this.f2232d) + this.f2234f;
                K k10 = new K();
                C2797i iVar = this.f2235g;
                a aVar = new a(k10, vVar);
                this.f2229a = 1;
                if (l0.e(0.0f, c10, 0.0f, iVar, aVar, this, 4, (Object) null) == f10) {
                    return f10;
                }
            } else if (i11 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f2238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f2239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f2240c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(int i10, float f10, C6787a aVar) {
            super(0);
            this.f2238a = i10;
            this.f2239b = f10;
            this.f2240c = aVar;
        }

        /* renamed from: a */
        public final C1176b invoke() {
            return new C1176b(this.f2238a, this.f2239b, this.f2240c);
        }
    }

    static {
        List n10 = C6565s.n();
        q qVar = q.Horizontal;
        j.a aVar = j.a.f418a;
        a aVar2 = r0;
        a aVar3 = new a();
        f2222b = new u(n10, 0, 0, 0, qVar, 0, 0, false, 0, (C1179e) null, (C1179e) null, 0.0f, 0, false, aVar, aVar2, false, (List) null, (List) null, L.a(qf.h.f72645a), 393216, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final Object d(C1139h hVar, int i10, float f10, C2797i iVar, p pVar, C6658d dVar) {
        Object e10 = hVar.e(new c(pVar, i10, hVar, f10, iVar, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public static final Object e(C c10, C6658d dVar) {
        if (c10.v() + 1 >= c10.F()) {
            return C6514M.f71813a;
        }
        Object n10 = C.n(c10, c10.v() + 1, 0.0f, (C2797i) null, dVar, 6, (Object) null);
        if (n10 == C6680b.f()) {
            return n10;
        }
        return C6514M.f71813a;
    }

    public static final Object f(C c10, C6658d dVar) {
        if (c10.v() - 1 < 0) {
            return C6514M.f71813a;
        }
        Object n10 = C.n(c10, c10.v() - 1, 0.0f, (C2797i) null, dVar, 6, (Object) null);
        if (n10 == C6680b.f()) {
            return n10;
        }
        return C6514M.f71813a;
    }

    public static final long g(n nVar, int i10) {
        int i11;
        long l10 = (((long) i10) * ((long) (nVar.l() + nVar.i()))) + ((long) nVar.f()) + ((long) nVar.b());
        if (nVar.c() == q.Horizontal) {
            i11 = r.g(nVar.a());
        } else {
            i11 = r.f(nVar.a());
        }
        return m.e(l10 - ((long) (i11 - m.l(nVar.n().a(i11, nVar.i(), nVar.f(), nVar.b(), i10 - 1, i10), 0, i11))), 0);
    }

    /* access modifiers changed from: private */
    public static final long h(u uVar, int i10) {
        int i11;
        if (uVar.c() == q.Horizontal) {
            i11 = r.g(uVar.a());
        } else {
            i11 = r.f(uVar.a());
        }
        return (long) m.l(uVar.n().a(i11, uVar.i(), uVar.f(), uVar.b(), 0, i10), 0, i11);
    }

    public static final float i() {
        return f2221a;
    }

    public static final u j() {
        return f2222b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final G.C k(int r10, float r11, yf.C6787a r12, Y.C1500m r13, int r14, int r15) {
        /*
            r0 = r15 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0006
            r10 = r1
        L_0x0006:
            r15 = r15 & 2
            if (r15 == 0) goto L_0x000b
            r11 = 0
        L_0x000b:
            boolean r15 = Y.C1506p.H()
            if (r15 == 0) goto L_0x001a
            r15 = -1
            java.lang.String r0 = "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:86)"
            r2 = -1210768637(0xffffffffb7d52303, float:-2.5407882E-5)
            Y.C1506p.Q(r2, r14, r15, r0)
        L_0x001a:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            G.b$c r15 = G.C1176b.f2250L
            h0.j r4 = r15.a()
            r15 = r14 & 14
            r15 = r15 ^ 6
            r0 = 4
            r2 = 1
            if (r15 <= r0) goto L_0x0030
            boolean r15 = r13.d(r10)
            if (r15 != 0) goto L_0x0034
        L_0x0030:
            r15 = r14 & 6
            if (r15 != r0) goto L_0x0036
        L_0x0034:
            r15 = r2
            goto L_0x0037
        L_0x0036:
            r15 = r1
        L_0x0037:
            r0 = r14 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r5 = 32
            if (r0 <= r5) goto L_0x0045
            boolean r0 = r13.c(r11)
            if (r0 != 0) goto L_0x0049
        L_0x0045:
            r0 = r14 & 48
            if (r0 != r5) goto L_0x004b
        L_0x0049:
            r0 = r2
            goto L_0x004c
        L_0x004b:
            r0 = r1
        L_0x004c:
            r15 = r15 | r0
            r0 = r14 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r0 <= r5) goto L_0x005b
            boolean r0 = r13.S(r12)
            if (r0 != 0) goto L_0x005f
        L_0x005b:
            r14 = r14 & 384(0x180, float:5.38E-43)
            if (r14 != r5) goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            r14 = r15 | r1
            java.lang.Object r15 = r13.A()
            if (r14 != 0) goto L_0x0070
            Y.m$a r14 = Y.C1500m.f10026a
            java.lang.Object r14 = r14.a()
            if (r15 != r14) goto L_0x0078
        L_0x0070:
            G.D$d r15 = new G.D$d
            r15.<init>(r10, r11, r12)
            r13.r(r15)
        L_0x0078:
            r6 = r15
            yf.a r6 = (yf.C6787a) r6
            r8 = 0
            r9 = 4
            r5 = 0
            r7 = r13
            java.lang.Object r10 = h0.C2018b.e(r3, r4, r5, r6, r7, r8, r9)
            G.b r10 = (G.C1176b) r10
            Y.r0 r11 = r10.m0()
            r11.setValue(r12)
            boolean r11 = Y.C1506p.H()
            if (r11 == 0) goto L_0x0095
            Y.C1506p.P()
        L_0x0095:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: G.D.k(int, float, yf.a, Y.m, int, int):G.C");
    }

    public static final class a implements G {

        /* renamed from: a  reason: collision with root package name */
        private final int f2224a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2225b;

        /* renamed from: c  reason: collision with root package name */
        private final Map f2226c = O.i();

        a() {
        }

        public int d() {
            return this.f2225b;
        }

        public int e() {
            return this.f2224a;
        }

        public Map p() {
            return this.f2226c;
        }

        public void q() {
        }
    }
}
