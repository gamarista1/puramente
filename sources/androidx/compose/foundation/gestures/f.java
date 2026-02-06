package androidx.compose.foundation.gestures;

import B0.a;
import D0.A;
import D0.C1124o;
import D0.C1126q;
import D0.C1127s;
import H0.C1197s;
import J0.C1242h;
import J0.C1243i;
import J0.C1245k;
import J0.h0;
import J0.i0;
import J0.w0;
import J0.x0;
import O0.v;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.focus.k;
import androidx.compose.ui.platform.C1644k0;
import c1.r;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import q0.C2421g;
import q0.C2422h;
import qf.C6658d;
import rf.C6680b;
import v.C2740w;
import x.C2848L;
import x.C2855T;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import z.C2937A;
import z.C2944b;
import z.C2946d;
import z.C2948f;
import z.C2950h;
import z.n;
import z.q;
import z.t;
import z.w;
import z.y;

final class f extends b implements h0, C1242h, p0.h, B0.e, w0 {

    /* renamed from: A  reason: collision with root package name */
    private final boolean f12694A;

    /* renamed from: B  reason: collision with root package name */
    private final C0.b f12695B;

    /* renamed from: C  reason: collision with root package name */
    private final w f12696C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final C2950h f12697D;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public final C2937A f12698E;

    /* renamed from: F  reason: collision with root package name */
    private final e f12699F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final C2948f f12700G;

    /* renamed from: H  reason: collision with root package name */
    private t f12701H;

    /* renamed from: I  reason: collision with root package name */
    private p f12702I;

    /* renamed from: X  reason: collision with root package name */
    private p f12703X;

    /* renamed from: y  reason: collision with root package name */
    private C2855T f12704y;

    /* renamed from: z  reason: collision with root package name */
    private n f12705z;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12706a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(1);
            this.f12706a = fVar;
        }

        public final void a(C1197s sVar) {
            this.f12706a.f12700G.F2(sVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1197s) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12707a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f12708b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f12709c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2937A f12710d;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z.p f12711a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2937A f12712b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(z.p pVar, C2937A a10) {
                super(1);
                this.f12711a = pVar;
                this.f12712b = a10;
            }

            public final void a(a.b bVar) {
                this.f12711a.a(this.f12712b.x(bVar.a()), C0.e.f1131a.b());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.b) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar, C2937A a10, C6658d dVar) {
            super(2, dVar);
            this.f12709c = pVar;
            this.f12710d = a10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f12709c, this.f12710d, dVar);
            bVar.f12708b = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(z.p pVar, C6658d dVar) {
            return ((b) create(pVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12707a;
            if (i10 == 0) {
                lf.w.b(obj);
                p pVar = this.f12709c;
                a aVar = new a((z.p) this.f12708b, this.f12710d);
                this.f12707a = 1;
                if (pVar.invoke(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12713a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f12714b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f12715c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, long j10, C6658d dVar) {
            super(2, dVar);
            this.f12714b = fVar;
            this.f12715c = j10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f12714b, this.f12715c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12713a;
            if (i10 == 0) {
                lf.w.b(obj);
                C2937A O22 = this.f12714b.f12698E;
                long j10 = this.f12715c;
                this.f12713a = 1;
                if (O22.q(j10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12716a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f12717b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f12718c;

        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f12719a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f12720b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f12721c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(long j10, C6658d dVar) {
                super(2, dVar);
                this.f12721c = j10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f12721c, dVar);
                aVar.f12720b = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(z.p pVar, C6658d dVar) {
                return ((a) create(pVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                C6680b.f();
                if (this.f12719a == 0) {
                    lf.w.b(obj);
                    ((z.p) this.f12720b).b(this.f12721c, C0.e.f1131a.b());
                    return C6514M.f71813a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, long j10, C6658d dVar) {
            super(2, dVar);
            this.f12717b = fVar;
            this.f12718c = j10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d(this.f12717b, this.f12718c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12716a;
            if (i10 == 0) {
                lf.w.b(obj);
                C2937A O22 = this.f12717b.f12698E;
                C2848L l10 = C2848L.UserInput;
                a aVar = new a(this.f12718c, (C6658d) null);
                this.f12716a = 1;
                if (O22.v(l10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class e extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12722a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f12723b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f12724c;

        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f12725a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f12726b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f12727c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(long j10, C6658d dVar) {
                super(2, dVar);
                this.f12727c = j10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f12727c, dVar);
                aVar.f12726b = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(z.p pVar, C6658d dVar) {
                return ((a) create(pVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                C6680b.f();
                if (this.f12725a == 0) {
                    lf.w.b(obj);
                    ((z.p) this.f12726b).b(this.f12727c, C0.e.f1131a.b());
                    return C6514M.f71813a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, long j10, C6658d dVar) {
            super(2, dVar);
            this.f12723b = fVar;
            this.f12724c = j10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new e(this.f12723b, this.f12724c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12722a;
            if (i10 == 0) {
                lf.w.b(obj);
                C2937A O22 = this.f12723b.f12698E;
                C2848L l10 = C2848L.UserInput;
                a aVar = new a(this.f12724c, (C6658d) null);
                this.f12722a = 1;
                if (O22.v(l10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.f$f  reason: collision with other inner class name */
    static final class C0241f extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12728a;

        /* renamed from: androidx.compose.foundation.gestures.f$f$a */
        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f12729a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f12730b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f12731c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ float f12732d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar, float f10, float f11, C6658d dVar) {
                super(2, dVar);
                this.f12730b = fVar;
                this.f12731c = f10;
                this.f12732d = f11;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f12730b, this.f12731c, this.f12732d, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f12729a;
                if (i10 == 0) {
                    lf.w.b(obj);
                    C2937A O22 = this.f12730b.f12698E;
                    long a10 = C2422h.a(this.f12731c, this.f12732d);
                    this.f12729a = 1;
                    if (d.j(O22, a10, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    lf.w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0241f(f fVar) {
            super(2);
            this.f12728a = fVar;
        }

        public final Boolean a(float f10, float f11) {
            C5600w0 unused = C5576k.d(this.f12728a.L1(), (qf.g) null, (M) null, new a(this.f12728a, f10, f11, (C6658d) null), 3, (Object) null);
            return Boolean.TRUE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }
    }

    static final class g extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12733a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ long f12734b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f12735c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, C6658d dVar) {
            super(2, dVar);
            this.f12735c = fVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            g gVar = new g(this.f12735c, dVar);
            gVar.f12734b = ((C2421g) obj).v();
            return gVar;
        }

        public final Object i(long j10, C6658d dVar) {
            return ((g) create(C2421g.d(j10), dVar)).invokeSuspend(C6514M.f71813a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((C2421g) obj).v(), (C6658d) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12733a;
            if (i10 == 0) {
                lf.w.b(obj);
                long j10 = this.f12734b;
                C2937A O22 = this.f12735c.f12698E;
                this.f12733a = 1;
                obj = d.j(O22, j10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    static final class h extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12736a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar) {
            super(0);
            this.f12736a = fVar;
        }

        public final void invoke() {
            this.f12736a.f12697D.f(C2740w.c((c1.d) C1243i.a(this.f12736a, C1644k0.e())));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(z.y r13, x.C2855T r14, z.n r15, z.q r16, boolean r17, boolean r18, B.l r19, z.C2946d r20) {
        /*
            r12 = this;
            r0 = r12
            r8 = r16
            r9 = r17
            yf.l r1 = androidx.compose.foundation.gestures.d.f12671a
            r2 = r19
            r12.<init>(r1, r9, r2, r8)
            r1 = r14
            r0.f12704y = r1
            r1 = r15
            r0.f12705z = r1
            C0.b r10 = new C0.b
            r10.<init>()
            r0.f12695B = r10
            z.w r1 = new z.w
            r1.<init>(r9)
            J0.j r1 = r12.l2(r1)
            z.w r1 = (z.w) r1
            r0.f12696C = r1
            z.h r1 = new z.h
            androidx.compose.foundation.gestures.d$d r2 = androidx.compose.foundation.gestures.d.f12674d
            w.z r2 = v.C2740w.c(r2)
            r3 = 0
            r4 = 2
            r1.<init>(r2, r3, r4, r3)
            r0.f12697D = r1
            x.T r3 = r0.f12704y
            z.n r2 = r0.f12705z
            if (r2 != 0) goto L_0x0041
            r4 = r1
            goto L_0x0042
        L_0x0041:
            r4 = r2
        L_0x0042:
            z.A r11 = new z.A
            r1 = r11
            r2 = r13
            r5 = r16
            r6 = r18
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.f12698E = r11
            androidx.compose.foundation.gestures.e r1 = new androidx.compose.foundation.gestures.e
            r1.<init>(r11, r9)
            r0.f12699F = r1
            z.f r2 = new z.f
            r3 = r18
            r4 = r20
            r2.<init>(r8, r11, r3, r4)
            J0.j r2 = r12.l2(r2)
            z.f r2 = (z.C2948f) r2
            r0.f12700G = r2
            J0.j r1 = C0.d.a(r1, r10)
            r12.l2(r1)
            p0.n r1 = p0.o.a()
            r12.l2(r1)
            androidx.compose.foundation.relocation.f r1 = new androidx.compose.foundation.relocation.f
            r1.<init>(r2)
            r12.l2(r1)
            x.D r1 = new x.D
            androidx.compose.foundation.gestures.f$a r2 = new androidx.compose.foundation.gestures.f$a
            r2.<init>(r12)
            r1.<init>(r2)
            r12.l2(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.f.<init>(z.y, x.T, z.n, z.q, boolean, boolean, B.l, z.d):void");
    }

    private final void P2() {
        this.f12702I = null;
        this.f12703X = null;
    }

    private final void Q2(C1124o oVar, long j10) {
        List c10 = oVar.c();
        int size = c10.size();
        int i10 = 0;
        while (i10 < size) {
            if (!((A) c10.get(i10)).p()) {
                i10++;
            } else {
                return;
            }
        }
        t tVar = this.f12701H;
        C6496s.e(tVar);
        C5600w0 unused = C5576k.d(L1(), (qf.g) null, (M) null, new e(this, tVar.a(C1245k.i(this), oVar, j10), (C6658d) null), 3, (Object) null);
        List c11 = oVar.c();
        int size2 = c11.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((A) c11.get(i11)).a();
        }
    }

    private final void R2() {
        this.f12702I = new C0241f(this);
        this.f12703X = new g(this, (C6658d) null);
    }

    private final void T2() {
        i0.a(this, new h(this));
    }

    public void A0() {
        T2();
    }

    public Object A2(p pVar, C6658d dVar) {
        C2937A a10 = this.f12698E;
        Object v10 = a10.v(C2848L.UserInput, new b(pVar, a10, (C6658d) null), dVar);
        if (v10 == C6680b.f()) {
            return v10;
        }
        return C6514M.f71813a;
    }

    public void C0(C1124o oVar, C1126q qVar, long j10) {
        List c10 = oVar.c();
        int size = c10.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((Boolean) B2().invoke((A) c10.get(i10))).booleanValue()) {
                super.C0(oVar, qVar, j10);
                break;
            }
            i10++;
        }
        if (qVar == C1126q.Main && C1127s.i(oVar.f(), C1127s.f1491a.f())) {
            Q2(oVar, j10);
        }
    }

    public void E2(long j10) {
    }

    public void F2(long j10) {
        C5600w0 unused = C5576k.d(this.f12695B.e(), (qf.g) null, (M) null, new c(this, j10, (C6658d) null), 3, (Object) null);
    }

    public boolean J2() {
        return this.f12698E.w();
    }

    public boolean Q1() {
        return this.f12694A;
    }

    public final void S2(y yVar, q qVar, C2855T t10, boolean z10, boolean z11, n nVar, B.l lVar, C2946d dVar) {
        boolean z12;
        C2950h hVar;
        q qVar2;
        boolean z13 = z10;
        n nVar2 = nVar;
        if (C2() != z13) {
            this.f12699F.a(z13);
            this.f12696C.m2(z13);
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z14 = z12;
        if (nVar2 == null) {
            hVar = this.f12697D;
        } else {
            hVar = nVar2;
        }
        boolean C10 = this.f12698E.C(yVar, qVar, t10, z11, hVar, this.f12695B);
        this.f12700G.I2(qVar, z11, dVar);
        this.f12704y = t10;
        this.f12705z = nVar2;
        C6798l a10 = d.f12671a;
        if (this.f12698E.p()) {
            qVar2 = q.Vertical;
        } else {
            qVar2 = q.Horizontal;
        }
        L2(a10, z10, lVar, qVar2, C10);
        if (z14) {
            P2();
            x0.b(this);
        }
    }

    public boolean T0(KeyEvent keyEvent) {
        return false;
    }

    public void V1() {
        T2();
        this.f12701H = C2944b.a(this);
    }

    public void W(v vVar) {
        if (C2() && (this.f12702I == null || this.f12703X == null)) {
            R2();
        }
        p pVar = this.f12702I;
        if (pVar != null) {
            O0.t.S(vVar, (String) null, pVar, 1, (Object) null);
        }
        p pVar2 = this.f12703X;
        if (pVar2 != null) {
            O0.t.T(vVar, pVar2);
        }
    }

    public void b1(k kVar) {
        kVar.h(false);
    }

    public boolean e1(KeyEvent keyEvent) {
        long j10;
        float f10;
        float f11;
        if (C2()) {
            long a10 = B0.d.a(keyEvent);
            a.C0004a aVar = B0.a.f613b;
            if ((B0.a.p(a10, aVar.j()) || B0.a.p(B0.d.a(keyEvent), aVar.k())) && B0.c.e(B0.d.b(keyEvent), B0.c.f765a.a()) && !B0.d.e(keyEvent)) {
                if (this.f12698E.p()) {
                    int f12 = r.f(this.f12700G.B2());
                    if (B0.a.p(B0.d.a(keyEvent), aVar.k())) {
                        f11 = (float) f12;
                    } else {
                        f11 = -((float) f12);
                    }
                    j10 = C2422h.a(0.0f, f11);
                } else {
                    int g10 = r.g(this.f12700G.B2());
                    if (B0.a.p(B0.d.a(keyEvent), aVar.k())) {
                        f10 = (float) g10;
                    } else {
                        f10 = -((float) g10);
                    }
                    j10 = C2422h.a(f10, 0.0f);
                }
                C5600w0 unused = C5576k.d(L1(), (qf.g) null, (M) null, new d(this, j10, (C6658d) null), 3, (Object) null);
                return true;
            }
        }
        return false;
    }
}
