package androidx.compose.foundation.lazy.layout;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Y.C1510r0;
import Y.o1;
import c1.n;
import c1.o;
import com.google.android.gms.common.api.a;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import r0.F1;
import rf.C6680b;
import u0.C2673c;
import w.C2763G;
import w.C2782a;
import w.t0;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public final class b {

    /* renamed from: s  reason: collision with root package name */
    public static final a f12977s = new a((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f12978t = 8;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final long f12979u = o.a(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER);

    /* renamed from: a  reason: collision with root package name */
    private final K f12980a;

    /* renamed from: b  reason: collision with root package name */
    private final F1 f12981b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6787a f12982c;

    /* renamed from: d  reason: collision with root package name */
    private C2763G f12983d;

    /* renamed from: e  reason: collision with root package name */
    private C2763G f12984e;

    /* renamed from: f  reason: collision with root package name */
    private C2763G f12985f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f12986g;

    /* renamed from: h  reason: collision with root package name */
    private final C1510r0 f12987h;

    /* renamed from: i  reason: collision with root package name */
    private final C1510r0 f12988i;

    /* renamed from: j  reason: collision with root package name */
    private final C1510r0 f12989j;

    /* renamed from: k  reason: collision with root package name */
    private final C1510r0 f12990k;

    /* renamed from: l  reason: collision with root package name */
    private long f12991l;

    /* renamed from: m  reason: collision with root package name */
    private long f12992m;

    /* renamed from: n  reason: collision with root package name */
    private C2673c f12993n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C2782a f12994o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C2782a f12995p;

    /* renamed from: q  reason: collision with root package name */
    private final C1510r0 f12996q;

    /* renamed from: r  reason: collision with root package name */
    private long f12997r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f12979u;
        }

        private a() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.b$b  reason: collision with other inner class name */
    static final class C0244b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f12999b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0244b(b bVar, C6658d dVar) {
            super(2, dVar);
            this.f12999b = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new C0244b(this.f12999b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((C0244b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12998a;
            if (i10 == 0) {
                w.b(obj);
                C2782a d10 = this.f12999b.f12995p;
                Float b10 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                this.f12998a = 1;
                if (d10.t(b10, this) == f10) {
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

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f13000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f13001b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f13002c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2763G f13003d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2673c f13004e;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2673c f13005a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f13006b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2673c cVar, b bVar) {
                super(1);
                this.f13005a = cVar;
                this.f13006b = bVar;
            }

            public final void a(C2782a aVar) {
                this.f13005a.J(((Number) aVar.m()).floatValue());
                this.f13006b.f12982c.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2782a) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, b bVar, C2763G g10, C2673c cVar, C6658d dVar) {
            super(2, dVar);
            this.f13001b = z10;
            this.f13002c = bVar;
            this.f13003d = g10;
            this.f13004e = cVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f13001b, this.f13002c, this.f13003d, this.f13004e, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f13000a;
            if (i10 == 0) {
                w.b(obj);
                if (this.f13001b) {
                    C2782a d10 = this.f13002c.f12995p;
                    Float b10 = kotlin.coroutines.jvm.internal.b.b(0.0f);
                    this.f13000a = 1;
                    if (d10.t(b10, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else if (i10 == 2) {
                try {
                    w.b(obj);
                    this.f13002c.z(false);
                    return C6514M.f71813a;
                } catch (Throwable th2) {
                    this.f13002c.z(false);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2782a d11 = this.f13002c.f12995p;
            Float b11 = kotlin.coroutines.jvm.internal.b.b(1.0f);
            C2763G g10 = this.f13003d;
            a aVar = new a(this.f13004e, this.f13002c);
            this.f13000a = 2;
            if (C2782a.f(d11, b11, g10, (Object) null, aVar, this, 4, (Object) null) == f10) {
                return f10;
            }
            this.f13002c.z(false);
            return C6514M.f71813a;
        }
    }

    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f13007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13008b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2763G f13009c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2673c f13010d;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2673c f13011a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f13012b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2673c cVar, b bVar) {
                super(1);
                this.f13011a = cVar;
                this.f13012b = bVar;
            }

            public final void a(C2782a aVar) {
                this.f13011a.J(((Number) aVar.m()).floatValue());
                this.f13012b.f12982c.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2782a) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, C2763G g10, C2673c cVar, C6658d dVar) {
            super(2, dVar);
            this.f13008b = bVar;
            this.f13009c = g10;
            this.f13010d = cVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d(this.f13008b, this.f13009c, this.f13010d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f13007a;
            if (i10 == 0) {
                w.b(obj);
                C2782a d10 = this.f13008b.f12995p;
                Float b10 = kotlin.coroutines.jvm.internal.b.b(0.0f);
                C2763G g10 = this.f13009c;
                a aVar = new a(this.f13010d, this.f13008b);
                this.f13007a = 1;
                if (C2782a.f(d10, b10, g10, (Object) null, aVar, this, 4, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    w.b(obj);
                } catch (Throwable th2) {
                    this.f13008b.B(false);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f13008b.A(true);
            this.f13008b.B(false);
            return C6514M.f71813a;
        }
    }

    static final class e extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f13013a;

        /* renamed from: b  reason: collision with root package name */
        int f13014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f13015c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2763G f13016d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f13017e;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f13018a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f13019b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, long j10) {
                super(1);
                this.f13018a = bVar;
                this.f13019b = j10;
            }

            public final void a(C2782a aVar) {
                this.f13018a.H(n.m(((n) aVar.m()).p(), this.f13019b));
                this.f13018a.f12982c.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2782a) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C2763G g10, long j10, C6658d dVar) {
            super(2, dVar);
            this.f13015c = bVar;
            this.f13016d = g10;
            this.f13017e = j10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new e(this.f13015c, this.f13016d, this.f13017e, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9 A[Catch:{ CancellationException -> 0x00b5 }, RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r11.f13014b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0023
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                lf.w.b(r12)     // Catch:{ CancellationException -> 0x00b5 }
                goto L_0x00aa
            L_0x0013:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001b:
                java.lang.Object r1 = r11.f13013a
                w.G r1 = (w.C2763G) r1
                lf.w.b(r12)     // Catch:{ CancellationException -> 0x00b5 }
                goto L_0x0067
            L_0x0023:
                lf.w.b(r12)
                androidx.compose.foundation.lazy.layout.b r12 = r11.f13015c     // Catch:{ CancellationException -> 0x00b5 }
                w.a r12 = r12.f12994o     // Catch:{ CancellationException -> 0x00b5 }
                boolean r12 = r12.p()     // Catch:{ CancellationException -> 0x00b5 }
                if (r12 == 0) goto L_0x0041
                w.G r12 = r11.f13016d     // Catch:{ CancellationException -> 0x00b5 }
                boolean r1 = r12 instanceof w.C2795g0     // Catch:{ CancellationException -> 0x00b5 }
                if (r1 == 0) goto L_0x003b
                w.g0 r12 = (w.C2795g0) r12     // Catch:{ CancellationException -> 0x00b5 }
                goto L_0x003f
            L_0x003b:
                w.g0 r12 = E.C1147p.f1668a     // Catch:{ CancellationException -> 0x00b5 }
            L_0x003f:
                r1 = r12
                goto L_0x0044
            L_0x0041:
                w.G r12 = r11.f13016d     // Catch:{ CancellationException -> 0x00b5 }
                goto L_0x003f
            L_0x0044:
                androidx.compose.foundation.lazy.layout.b r12 = r11.f13015c     // Catch:{ CancellationException -> 0x00b5 }
                w.a r12 = r12.f12994o     // Catch:{ CancellationException -> 0x00b5 }
                boolean r12 = r12.p()     // Catch:{ CancellationException -> 0x00b5 }
                if (r12 != 0) goto L_0x0070
                androidx.compose.foundation.lazy.layout.b r12 = r11.f13015c     // Catch:{ CancellationException -> 0x00b5 }
                w.a r12 = r12.f12994o     // Catch:{ CancellationException -> 0x00b5 }
                long r4 = r11.f13017e     // Catch:{ CancellationException -> 0x00b5 }
                c1.n r4 = c1.n.b(r4)     // Catch:{ CancellationException -> 0x00b5 }
                r11.f13013a = r1     // Catch:{ CancellationException -> 0x00b5 }
                r11.f13014b = r3     // Catch:{ CancellationException -> 0x00b5 }
                java.lang.Object r12 = r12.t(r4, r11)     // Catch:{ CancellationException -> 0x00b5 }
                if (r12 != r0) goto L_0x0067
                return r0
            L_0x0067:
                androidx.compose.foundation.lazy.layout.b r12 = r11.f13015c     // Catch:{ CancellationException -> 0x00b5 }
                yf.a r12 = r12.f12982c     // Catch:{ CancellationException -> 0x00b5 }
                r12.invoke()     // Catch:{ CancellationException -> 0x00b5 }
            L_0x0070:
                r5 = r1
                androidx.compose.foundation.lazy.layout.b r12 = r11.f13015c     // Catch:{ CancellationException -> 0x00b5 }
                w.a r12 = r12.f12994o     // Catch:{ CancellationException -> 0x00b5 }
                java.lang.Object r12 = r12.m()     // Catch:{ CancellationException -> 0x00b5 }
                c1.n r12 = (c1.n) r12     // Catch:{ CancellationException -> 0x00b5 }
                long r3 = r12.p()     // Catch:{ CancellationException -> 0x00b5 }
                long r6 = r11.f13017e     // Catch:{ CancellationException -> 0x00b5 }
                long r3 = c1.n.m(r3, r6)     // Catch:{ CancellationException -> 0x00b5 }
                androidx.compose.foundation.lazy.layout.b r12 = r11.f13015c     // Catch:{ CancellationException -> 0x00b5 }
                w.a r12 = r12.f12994o     // Catch:{ CancellationException -> 0x00b5 }
                c1.n r1 = c1.n.b(r3)     // Catch:{ CancellationException -> 0x00b5 }
                androidx.compose.foundation.lazy.layout.b$e$a r7 = new androidx.compose.foundation.lazy.layout.b$e$a     // Catch:{ CancellationException -> 0x00b5 }
                androidx.compose.foundation.lazy.layout.b r6 = r11.f13015c     // Catch:{ CancellationException -> 0x00b5 }
                r7.<init>(r6, r3)     // Catch:{ CancellationException -> 0x00b5 }
                r3 = 0
                r11.f13013a = r3     // Catch:{ CancellationException -> 0x00b5 }
                r11.f13014b = r2     // Catch:{ CancellationException -> 0x00b5 }
                r6 = 0
                r9 = 4
                r10 = 0
                r3 = r12
                r4 = r1
                r8 = r11
                java.lang.Object r12 = w.C2782a.f(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ CancellationException -> 0x00b5 }
                if (r12 != r0) goto L_0x00aa
                return r0
            L_0x00aa:
                androidx.compose.foundation.lazy.layout.b r12 = r11.f13015c     // Catch:{ CancellationException -> 0x00b5 }
                r0 = 0
                r12.G(r0)     // Catch:{ CancellationException -> 0x00b5 }
                androidx.compose.foundation.lazy.layout.b r12 = r11.f13015c     // Catch:{ CancellationException -> 0x00b5 }
                r12.f12986g = r0     // Catch:{ CancellationException -> 0x00b5 }
            L_0x00b5:
                lf.M r12 = lf.C6514M.f71813a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class f extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f13020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13021b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C6658d dVar) {
            super(2, dVar);
            this.f13021b = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new f(this.f13021b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((f) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f13020a;
            if (i10 == 0) {
                w.b(obj);
                C2782a c10 = this.f13021b.f12994o;
                n b10 = n.b(n.f19226b.a());
                this.f13020a = 1;
                if (c10.t(b10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f13021b.H(n.f19226b.a());
            this.f13021b.G(false);
            return C6514M.f71813a;
        }
    }

    static final class g extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f13022a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13023b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, C6658d dVar) {
            super(2, dVar);
            this.f13023b = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new g(this.f13023b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((g) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f13022a;
            if (i10 == 0) {
                w.b(obj);
                C2782a c10 = this.f13023b.f12994o;
                this.f13022a = 1;
                if (c10.u(this) == f10) {
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

    static final class h extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f13024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13025b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, C6658d dVar) {
            super(2, dVar);
            this.f13025b = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new h(this.f13025b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((h) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f13024a;
            if (i10 == 0) {
                w.b(obj);
                C2782a d10 = this.f13025b.f12995p;
                this.f13024a = 1;
                if (d10.u(this) == f10) {
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

    static final class i extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f13026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f13027b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar, C6658d dVar) {
            super(2, dVar);
            this.f13027b = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new i(this.f13027b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((i) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f13026a;
            if (i10 == 0) {
                w.b(obj);
                C2782a d10 = this.f13027b.f12995p;
                this.f13026a = 1;
                if (d10.u(this) == f10) {
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

    public b(K k10, F1 f12, C6787a aVar) {
        C2673c cVar;
        F1 f13 = f12;
        this.f12980a = k10;
        this.f12981b = f13;
        this.f12982c = aVar;
        Boolean bool = Boolean.FALSE;
        this.f12987h = u1.d(bool, (o1) null, 2, (Object) null);
        this.f12988i = u1.d(bool, (o1) null, 2, (Object) null);
        this.f12989j = u1.d(bool, (o1) null, 2, (Object) null);
        this.f12990k = u1.d(bool, (o1) null, 2, (Object) null);
        long j10 = f12979u;
        this.f12991l = j10;
        n.a aVar2 = n.f19226b;
        this.f12992m = aVar2.a();
        if (f13 != null) {
            cVar = f12.b();
        } else {
            cVar = null;
        }
        this.f12993n = cVar;
        this.f12994o = new C2782a(n.b(aVar2.a()), t0.d(aVar2), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
        this.f12995p = new C2782a(Float.valueOf(1.0f), t0.f(C6490l.f71789a), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
        this.f12996q = u1.d(n.b(aVar2.a()), (o1) null, 2, (Object) null);
        this.f12997r = j10;
    }

    /* access modifiers changed from: private */
    public final void A(boolean z10) {
        this.f12990k.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final void B(boolean z10) {
        this.f12989j.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final void G(boolean z10) {
        this.f12987h.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final void H(long j10) {
        this.f12996q.setValue(n.b(j10));
    }

    /* access modifiers changed from: private */
    public final void z(boolean z10) {
        this.f12988i.setValue(Boolean.valueOf(z10));
    }

    public final void C(C2763G g10) {
        this.f12983d = g10;
    }

    public final void D(C2763G g10) {
        this.f12985f = g10;
    }

    public final void E(long j10) {
        this.f12992m = j10;
    }

    public final void F(long j10) {
        this.f12997r = j10;
    }

    public final void I(C2763G g10) {
        this.f12984e = g10;
    }

    public final void J(long j10) {
        this.f12991l = j10;
    }

    public final void k() {
        C2673c cVar = this.f12993n;
        C2763G g10 = this.f12983d;
        if (!t() && g10 != null && cVar != null) {
            z(true);
            boolean v10 = v();
            boolean z10 = !v10;
            if (!v10) {
                cVar.J(0.0f);
            }
            C5600w0 unused = C5576k.d(this.f12980a, (qf.g) null, (M) null, new c(z10, this, g10, cVar, (C6658d) null), 3, (Object) null);
        } else if (v()) {
            if (cVar != null) {
                cVar.J(1.0f);
            }
            C5600w0 unused2 = C5576k.d(this.f12980a, (qf.g) null, (M) null, new C0244b(this, (C6658d) null), 3, (Object) null);
        }
    }

    public final void l() {
        C2673c cVar = this.f12993n;
        C2763G g10 = this.f12985f;
        if (cVar != null && !v() && g10 != null) {
            B(true);
            C5600w0 unused = C5576k.d(this.f12980a, (qf.g) null, (M) null, new d(this, g10, cVar, (C6658d) null), 3, (Object) null);
        }
    }

    public final void m(long j10, boolean z10) {
        C2763G g10 = this.f12984e;
        if (g10 != null) {
            long m10 = n.m(r(), j10);
            H(m10);
            G(true);
            this.f12986g = z10;
            C5600w0 unused = C5576k.d(this.f12980a, (qf.g) null, (M) null, new e(this, g10, m10, (C6658d) null), 3, (Object) null);
        }
    }

    public final void n() {
        if (w()) {
            C5600w0 unused = C5576k.d(this.f12980a, (qf.g) null, (M) null, new f(this, (C6658d) null), 3, (Object) null);
        }
    }

    public final long o() {
        return this.f12992m;
    }

    public final C2673c p() {
        return this.f12993n;
    }

    public final long q() {
        return this.f12997r;
    }

    public final long r() {
        return ((n) this.f12996q.getValue()).p();
    }

    public final long s() {
        return this.f12991l;
    }

    public final boolean t() {
        return ((Boolean) this.f12988i.getValue()).booleanValue();
    }

    public final boolean u() {
        return ((Boolean) this.f12990k.getValue()).booleanValue();
    }

    public final boolean v() {
        return ((Boolean) this.f12989j.getValue()).booleanValue();
    }

    public final boolean w() {
        return ((Boolean) this.f12987h.getValue()).booleanValue();
    }

    public final boolean x() {
        return this.f12986g;
    }

    public final void y() {
        F1 f12;
        if (w()) {
            G(false);
            C5600w0 unused = C5576k.d(this.f12980a, (qf.g) null, (M) null, new g(this, (C6658d) null), 3, (Object) null);
        }
        if (t()) {
            z(false);
            C5600w0 unused2 = C5576k.d(this.f12980a, (qf.g) null, (M) null, new h(this, (C6658d) null), 3, (Object) null);
        }
        if (v()) {
            B(false);
            C5600w0 unused3 = C5576k.d(this.f12980a, (qf.g) null, (M) null, new i(this, (C6658d) null), 3, (Object) null);
        }
        this.f12986g = false;
        H(n.f19226b.a());
        this.f12991l = f12979u;
        C2673c cVar = this.f12993n;
        if (!(cVar == null || (f12 = this.f12981b) == null)) {
            f12.a(cVar);
        }
        this.f12993n = null;
        this.f12983d = null;
        this.f12985f = null;
        this.f12984e = null;
    }
}
