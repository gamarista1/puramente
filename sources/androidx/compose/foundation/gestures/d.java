package androidx.compose.foundation.gestures;

import D0.A;
import D0.O;
import k0.i;
import k0.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.K;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import w.C2797i;
import w.l0;
import x.C2855T;
import yf.C6798l;
import yf.p;
import z.C2937A;
import z.C2946d;
import z.n;
import z.q;
import z.v;
import z.y;

public abstract class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C6798l f12671a = a.f12675a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final v f12672b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final l f12673c = new b();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C0240d f12674d = new C0240d();

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12675a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(A a10) {
            return Boolean.valueOf(!O.g(a10.n(), O.f1413a.b()));
        }
    }

    public static final class b implements l {
        b() {
        }

        public g R0(g.c cVar) {
            return l.a.c(this, cVar);
        }

        public float U() {
            return 1.0f;
        }

        public g.b b(g.c cVar) {
            return l.a.b(this, cVar);
        }

        public Object f0(Object obj, p pVar) {
            return l.a.a(this, obj, pVar);
        }

        public g n1(g gVar) {
            return l.a.d(this, gVar);
        }
    }

    public static final class c implements v {
        c() {
        }

        public float a(float f10) {
            return f10;
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.d$d  reason: collision with other inner class name */
    public static final class C0240d implements c1.d {
        C0240d() {
        }

        public float getDensity() {
            return 1.0f;
        }

        public float r1() {
            return 1.0f;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f12676a;

        /* renamed from: b  reason: collision with root package name */
        Object f12677b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f12678c;

        /* renamed from: d  reason: collision with root package name */
        int f12679d;

        e(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f12678c = obj;
            this.f12679d |= Integer.MIN_VALUE;
            return d.j((C2937A) null, 0, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12680a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f12681b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2937A f12682c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f12683d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f12684e;

        static final class a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ K f12685a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2937A f12686b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z.p f12687c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10, C2937A a10, z.p pVar) {
                super(2);
                this.f12685a = k10;
                this.f12686b = a10;
                this.f12687c = pVar;
            }

            public final void a(float f10, float f11) {
                float f12 = f10 - this.f12685a.f71756a;
                C2937A a10 = this.f12686b;
                this.f12685a.f71756a += a10.t(a10.A(this.f12687c.b(a10.B(a10.t(f12)), C0.e.f1131a.b())));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C2937A a10, long j10, K k10, C6658d dVar) {
            super(2, dVar);
            this.f12682c = a10;
            this.f12683d = j10;
            this.f12684e = k10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            f fVar = new f(this.f12682c, this.f12683d, this.f12684e, dVar);
            fVar.f12681b = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(z.p pVar, C6658d dVar) {
            return ((f) create(pVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12680a;
            if (i10 == 0) {
                w.b(obj);
                float A10 = this.f12682c.A(this.f12683d);
                a aVar = new a(this.f12684e, this.f12682c, (z.p) this.f12681b);
                this.f12680a = 1;
                if (l0.e(0.0f, A10, 0.0f, (C2797i) null, aVar, this, 12, (Object) null) == f10) {
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

    public static final l e() {
        return f12673c;
    }

    public static final i f(i iVar, y yVar, q qVar, C2855T t10, boolean z10, boolean z11, n nVar, B.l lVar, C2946d dVar) {
        i iVar2 = iVar;
        return iVar.h(new ScrollableElement(yVar, qVar, t10, z10, z11, nVar, lVar, dVar));
    }

    public static final i g(i iVar, y yVar, q qVar, boolean z10, boolean z11, n nVar, B.l lVar) {
        return h(iVar, yVar, qVar, (C2855T) null, z10, z11, nVar, lVar, (C2946d) null, 128, (Object) null);
    }

    public static /* synthetic */ i h(i iVar, y yVar, q qVar, C2855T t10, boolean z10, boolean z11, n nVar, B.l lVar, C2946d dVar, int i10, Object obj) {
        boolean z12;
        boolean z13;
        n nVar2;
        B.l lVar2;
        C2946d dVar2;
        int i11 = i10;
        if ((i11 & 8) != 0) {
            z12 = true;
        } else {
            z12 = z10;
        }
        if ((i11 & 16) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        if ((i11 & 32) != 0) {
            nVar2 = null;
        } else {
            nVar2 = nVar;
        }
        if ((i11 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if ((i11 & 128) != 0) {
            dVar2 = null;
        } else {
            dVar2 = dVar;
        }
        return f(iVar, yVar, qVar, t10, z12, z13, nVar2, lVar2, dVar2);
    }

    public static /* synthetic */ i i(i iVar, y yVar, q qVar, boolean z10, boolean z11, n nVar, B.l lVar, int i10, Object obj) {
        n nVar2;
        B.l lVar2;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            nVar2 = null;
        } else {
            nVar2 = nVar;
        }
        if ((i10 & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return g(iVar, yVar, qVar, z12, z13, nVar2, lVar2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(z.C2937A r11, long r12, qf.C6658d r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.d.e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.d$e r0 = (androidx.compose.foundation.gestures.d.e) r0
            int r1 = r0.f12679d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12679d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.d$e r0 = new androidx.compose.foundation.gestures.d$e
            r0.<init>(r14)
        L_0x0018:
            java.lang.Object r14 = r0.f12678c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f12679d
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r11 = r0.f12677b
            kotlin.jvm.internal.K r11 = (kotlin.jvm.internal.K) r11
            java.lang.Object r12 = r0.f12676a
            z.A r12 = (z.C2937A) r12
            lf.w.b(r14)
            r14 = r11
            r11 = r12
            goto L_0x005c
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003b:
            lf.w.b(r14)
            kotlin.jvm.internal.K r14 = new kotlin.jvm.internal.K
            r14.<init>()
            x.L r2 = x.C2848L.Default
            androidx.compose.foundation.gestures.d$f r10 = new androidx.compose.foundation.gestures.d$f
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r4.<init>(r5, r6, r8, r9)
            r0.f12676a = r11
            r0.f12677b = r14
            r0.f12679d = r3
            java.lang.Object r12 = r11.v(r2, r10, r0)
            if (r12 != r1) goto L_0x005c
            return r1
        L_0x005c:
            float r12 = r14.f71756a
            long r11 = r11.B(r12)
            q0.g r11 = q0.C2421g.d(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.j(z.A, long, qf.d):java.lang.Object");
    }
}
