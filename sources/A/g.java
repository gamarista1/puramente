package A;

import k0.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.K;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import w.C2758B;
import w.C2797i;
import w.C2799k;
import w.C2800l;
import w.C2814z;
import yf.C6798l;
import yf.p;
import z.C2939C;
import z.v;

public final class g implements C2939C {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final i f374a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C2814z f375b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C2797i f376c;

    /* renamed from: d  reason: collision with root package name */
    private l f377d = androidx.compose.foundation.gestures.d.e();

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f378a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f379b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f380c;

        /* renamed from: d  reason: collision with root package name */
        int f381d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, C6658d dVar) {
            super(dVar);
            this.f380c = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f379b = obj;
            this.f381d |= Integer.MIN_VALUE;
            return this.f380c.i((v) null, 0.0f, (C6798l) null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f382a;

        /* renamed from: b  reason: collision with root package name */
        int f383b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f384c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f385d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f386e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f387f;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ K f388a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C6798l f389b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10, C6798l lVar) {
                super(1);
                this.f388a = k10;
                this.f389b = lVar;
            }

            public final void a(float f10) {
                K k10 = this.f388a;
                float f11 = k10.f71756a - f10;
                k10.f71756a = f11;
                this.f389b.invoke(Float.valueOf(f11));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).floatValue());
                return C6514M.f71813a;
            }
        }

        /* renamed from: A.g$b$b  reason: collision with other inner class name */
        static final class C0000b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ K f390a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C6798l f391b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0000b(K k10, C6798l lVar) {
                super(1);
                this.f390a = k10;
                this.f391b = lVar;
            }

            public final void a(float f10) {
                K k10 = this.f390a;
                float f11 = k10.f71756a - f10;
                k10.f71756a = f11;
                this.f391b.invoke(Float.valueOf(f11));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).floatValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, float f10, C6798l lVar, v vVar, C6658d dVar) {
            super(2, dVar);
            this.f384c = gVar;
            this.f385d = f10;
            this.f386e = lVar;
            this.f387f = vVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f384c, this.f385d, this.f386e, this.f387f, dVar);
        }

        public final Object invoke(Ug.K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            K k10;
            Object f10 = C6680b.f();
            int i10 = this.f383b;
            if (i10 == 0) {
                w.b(obj);
                float b10 = this.f384c.f374a.b(this.f385d, C2758B.a(this.f384c.f375b, 0.0f, this.f385d));
                if (!Float.isNaN(b10)) {
                    k10 = new K();
                    float abs = Math.abs(b10) * Math.signum(this.f385d);
                    k10.f71756a = abs;
                    this.f386e.invoke(kotlin.coroutines.jvm.internal.b.b(abs));
                    g gVar = this.f384c;
                    v vVar = this.f387f;
                    float f11 = k10.f71756a;
                    float f12 = this.f385d;
                    C0000b bVar = new C0000b(k10, this.f386e);
                    this.f382a = k10;
                    this.f383b = 1;
                    obj = gVar.l(vVar, f11, f12, bVar, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else {
                    throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
                }
            } else if (i10 == 1) {
                k10 = (K) this.f382a;
                w.b(obj);
            } else if (i10 == 2) {
                w.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2799k kVar = (C2799k) obj;
            float a10 = this.f384c.f374a.a(((Number) kVar.n()).floatValue());
            if (!Float.isNaN(a10)) {
                k10.f71756a = a10;
                v vVar2 = this.f387f;
                C2799k g10 = C2800l.g(kVar, 0.0f, 0.0f, 0, 0, false, 30, (Object) null);
                C2797i f13 = this.f384c.f376c;
                a aVar = new a(k10, this.f386e);
                this.f382a = null;
                this.f383b = 2;
                obj = h.h(vVar2, a10, a10, g10, f13, aVar, this);
                if (obj == f10) {
                    return f10;
                }
                return obj;
            }
            throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f393b;

        /* renamed from: c  reason: collision with root package name */
        int f394c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, C6658d dVar) {
            super(dVar);
            this.f393b = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f392a = obj;
            this.f394c |= Integer.MIN_VALUE;
            return this.f393b.c((v) null, 0.0f, (C6798l) null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f396b;

        /* renamed from: c  reason: collision with root package name */
        int f397c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, C6658d dVar) {
            super(dVar);
            this.f396b = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f395a = obj;
            this.f397c |= Integer.MIN_VALUE;
            return this.f396b.l((v) null, 0.0f, 0.0f, (C6798l) null, this);
        }
    }

    public g(i iVar, C2814z zVar, C2797i iVar2) {
        this.f374a = iVar;
        this.f375b = zVar;
        this.f376c = iVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: yf.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(z.v r11, float r12, yf.C6798l r13, qf.C6658d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof A.g.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            A.g$a r0 = (A.g.a) r0
            int r1 = r0.f381d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f381d = r1
            goto L_0x0018
        L_0x0013:
            A.g$a r0 = new A.g$a
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f379b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f381d
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r11 = r0.f378a
            r13 = r11
            yf.l r13 = (yf.C6798l) r13
            lf.w.b(r14)
            goto L_0x0051
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            lf.w.b(r14)
            k0.l r14 = r10.f377d
            A.g$b r2 = new A.g$b
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f378a = r13
            r0.f381d = r3
            java.lang.Object r14 = Ug.C5572i.g(r14, r2, r0)
            if (r14 != r1) goto L_0x0051
            return r1
        L_0x0051:
            A.a r14 = (A.a) r14
            r11 = 0
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.b.b(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: A.g.i(z.v, float, yf.l, qf.d):java.lang.Object");
    }

    private final boolean j(float f10, float f11) {
        if (Math.abs(C2758B.a(this.f375b, 0.0f, f11)) >= Math.abs(f10)) {
            return true;
        }
        return false;
    }

    private final Object k(v vVar, float f10, float f11, C6798l lVar, C6658d dVar) {
        b lVar2;
        if (j(f10, f11)) {
            lVar2 = new c(this.f375b);
        } else {
            lVar2 = new l(this.f376c);
        }
        return h.i(vVar, f10, f11, lVar2, lVar, dVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(z.v r19, float r20, float r21, yf.C6798l r22, qf.C6658d r23) {
        /*
            r18 = this;
            r0 = r23
            boolean r1 = r0 instanceof A.g.d
            if (r1 == 0) goto L_0x0018
            r1 = r0
            A.g$d r1 = (A.g.d) r1
            int r2 = r1.f397c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f397c = r2
            r8 = r18
        L_0x0016:
            r7 = r1
            goto L_0x0020
        L_0x0018:
            A.g$d r1 = new A.g$d
            r8 = r18
            r1.<init>(r8, r0)
            goto L_0x0016
        L_0x0020:
            java.lang.Object r0 = r7.f395a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r7.f397c
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            lf.w.b(r0)
            goto L_0x0073
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            lf.w.b(r0)
            float r0 = java.lang.Math.abs(r20)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0046
            goto L_0x004e
        L_0x0046:
            float r0 = java.lang.Math.abs(r21)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0060
        L_0x004e:
            r16 = 28
            r17 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r9 = r20
            r10 = r21
            w.k r0 = w.C2800l.c(r9, r10, r11, r13, r15, r16, r17)
            goto L_0x0079
        L_0x0060:
            r7.f397c = r3
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            java.lang.Object r0 = r2.k(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L_0x0073
            return r1
        L_0x0073:
            A.a r0 = (A.a) r0
            w.k r0 = r0.c()
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A.g.l(z.v, float, float, yf.l, qf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(z.v r5, float r6, yf.C6798l r7, qf.C6658d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof A.g.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            A.g$c r0 = (A.g.c) r0
            int r1 = r0.f394c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f394c = r1
            goto L_0x0018
        L_0x0013:
            A.g$c r0 = new A.g$c
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f392a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f394c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            lf.w.b(r8)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            lf.w.b(r8)
            r0.f394c = r3
            java.lang.Object r8 = r4.i(r5, r6, r7, r0)
            if (r8 != r1) goto L_0x003d
            return r1
        L_0x003d:
            A.a r8 = (A.a) r8
            java.lang.Object r5 = r8.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            w.k r6 = r8.b()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            goto L_0x005d
        L_0x0053:
            java.lang.Object r5 = r6.n()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L_0x005d:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.b(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A.g.c(z.v, float, yf.l, qf.d):java.lang.Object");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!C6496s.c(gVar.f376c, this.f376c) || !C6496s.c(gVar.f375b, this.f375b) || !C6496s.c(gVar.f374a, this.f374a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f376c.hashCode() * 31) + this.f375b.hashCode()) * 31) + this.f374a.hashCode();
    }
}
