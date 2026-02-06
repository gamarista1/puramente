package m3;

import Ug.C5600w0;
import Ug.C5605z;
import Ug.K;
import Ug.M;
import Wg.u;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6491m;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6525i;
import lf.C6535s;
import lf.w;
import m3.C2224x;
import m3.r;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;
import yf.r;

/* renamed from: m3.y  reason: case insensitive filesystem */
public final class C2225y {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f24174a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f24175b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C2200E f24176c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C2209h f24177d = new C2209h((Object) null, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C2209h f24178e = new C2209h((Object) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private final C5694f f24179f;

    /* renamed from: m3.y$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C2226z f24180a;

        /* renamed from: b  reason: collision with root package name */
        private final M f24181b;

        /* renamed from: c  reason: collision with root package name */
        private final C5600w0 f24182c;

        public a(C2226z zVar, M m10, C5600w0 w0Var) {
            C6496s.h(zVar, "snapshot");
            C6496s.h(w0Var, "job");
            this.f24180a = zVar;
            this.f24181b = m10;
            this.f24182c = w0Var;
        }

        public final C5600w0 a() {
            return this.f24182c;
        }

        public final C2226z b() {
            return this.f24180a;
        }

        public final M c() {
            return this.f24181b;
        }
    }

    /* renamed from: m3.y$b */
    public final class b implements C2216o {

        /* renamed from: a  reason: collision with root package name */
        private final C2226z f24183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2225y f24184b;

        public b(C2225y yVar, C2226z zVar) {
            C6496s.h(zVar, "pageFetcherSnapshot");
            this.f24184b = yVar;
            this.f24183a = zVar;
        }

        public void a(Z z10) {
            C6496s.h(z10, "viewportHint");
            this.f24183a.o(z10);
        }
    }

    /* renamed from: m3.y$c */
    public final class c implements X {

        /* renamed from: a  reason: collision with root package name */
        private final C2209h f24185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2225y f24186b;

        public c(C2225y yVar, C2209h hVar) {
            C6496s.h(hVar, "retryEventBus");
            this.f24186b = yVar;
            this.f24185a = hVar;
        }

        public void a() {
            this.f24185a.b(C6514M.f71813a);
        }

        public void b() {
            this.f24186b.l();
        }
    }

    /* renamed from: m3.y$d */
    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f24187a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f24188b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2225y f24189c;

        /* renamed from: m3.y$d$a */
        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f24190a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f24191b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ P f24192c;

            a(P p10, C6658d dVar) {
                super(2, dVar);
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f24192c, dVar);
                aVar.f24191b = obj;
                return aVar;
            }

            public final Object invoke(C5695g gVar, C6658d dVar) {
                return ((a) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: Xg.g} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = rf.C6680b.f()
                    int r1 = r6.f24190a
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L_0x0023
                    if (r1 == r4) goto L_0x001b
                    if (r1 != r3) goto L_0x0013
                    lf.w.b(r7)
                    goto L_0x0053
                L_0x0013:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L_0x001b:
                    java.lang.Object r1 = r6.f24191b
                    Xg.g r1 = (Xg.C5695g) r1
                    lf.w.b(r7)
                    goto L_0x003a
                L_0x0023:
                    lf.w.b(r7)
                    java.lang.Object r7 = r6.f24191b
                    r1 = r7
                    Xg.g r1 = (Xg.C5695g) r1
                    m3.P r7 = r6.f24192c
                    if (r7 == 0) goto L_0x003d
                    r6.f24191b = r1
                    r6.f24190a = r4
                    java.lang.Object r7 = r7.e(r6)
                    if (r7 != r0) goto L_0x003a
                    return r0
                L_0x003a:
                    m3.O$a r7 = (m3.O.a) r7
                    goto L_0x003e
                L_0x003d:
                    r7 = r2
                L_0x003e:
                    m3.O$a r5 = m3.O.a.LAUNCH_INITIAL_REFRESH
                    if (r7 != r5) goto L_0x0043
                    goto L_0x0044
                L_0x0043:
                    r4 = 0
                L_0x0044:
                    java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
                    r6.f24191b = r2
                    r6.f24190a = r3
                    java.lang.Object r7 = r1.emit(r7, r6)
                    if (r7 != r0) goto L_0x0053
                    return r0
                L_0x0053:
                    lf.M r7 = lf.C6514M.f71813a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C2225y.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: m3.y$d$b */
        static final class b extends l implements q {

            /* renamed from: a  reason: collision with root package name */
            Object f24193a;

            /* renamed from: b  reason: collision with root package name */
            int f24194b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f24195c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ boolean f24196d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ P f24197e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C2225y f24198f;

            /* renamed from: m3.y$d$b$a */
            /* synthetic */ class a extends C6494p implements C6787a {
                a(Object obj) {
                    super(0, obj, C2225y.class, "refresh", "refresh()V", 0);
                }

                public final void invoke() {
                    ((C2225y) this.receiver).l();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(P p10, C2225y yVar, C6658d dVar) {
                super(3, dVar);
                this.f24198f = yVar;
            }

            public final Object i(a aVar, boolean z10, C6658d dVar) {
                b bVar = new b(this.f24197e, this.f24198f, dVar);
                bVar.f24195c = aVar;
                bVar.f24196d = z10;
                return bVar.invokeSuspend(C6514M.f71813a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return i((a) obj, ((Boolean) obj2).booleanValue(), (C6658d) obj3);
            }

            /* JADX WARNING: Removed duplicated region for block: B:34:0x007c  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x00a9  */
            /* JADX WARNING: Removed duplicated region for block: B:50:0x00ae  */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x00b1  */
            /* JADX WARNING: Removed duplicated region for block: B:60:0x00c7  */
            /* JADX WARNING: Removed duplicated region for block: B:62:0x00cf  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = rf.C6680b.f()
                    int r1 = r14.f24194b
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x002b
                    if (r1 == r3) goto L_0x0023
                    if (r1 != r2) goto L_0x001b
                    java.lang.Object r0 = r14.f24193a
                    m3.L r0 = (m3.L) r0
                    java.lang.Object r1 = r14.f24195c
                    m3.y$a r1 = (m3.C2225y.a) r1
                    lf.w.b(r15)
                    goto L_0x0074
                L_0x001b:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L_0x0023:
                    java.lang.Object r1 = r14.f24195c
                    m3.y$a r1 = (m3.C2225y.a) r1
                    lf.w.b(r15)
                    goto L_0x005b
                L_0x002b:
                    lf.w.b(r15)
                    java.lang.Object r15 = r14.f24195c
                    m3.y$a r15 = (m3.C2225y.a) r15
                    boolean r1 = r14.f24196d
                    if (r1 == 0) goto L_0x003d
                    m3.P r1 = r14.f24197e
                    if (r1 == 0) goto L_0x003d
                    r1.a()
                L_0x003d:
                    m3.y r1 = r14.f24198f
                    if (r15 == 0) goto L_0x004c
                    m3.z r5 = r15.b()
                    if (r5 == 0) goto L_0x004c
                    m3.L r5 = r5.v()
                    goto L_0x004d
                L_0x004c:
                    r5 = r4
                L_0x004d:
                    r14.f24195c = r15
                    r14.f24194b = r3
                    java.lang.Object r1 = r1.h(r5, r14)
                    if (r1 != r0) goto L_0x0058
                    return r0
                L_0x0058:
                    r13 = r1
                    r1 = r15
                    r15 = r13
                L_0x005b:
                    m3.L r15 = (m3.L) r15
                    if (r1 == 0) goto L_0x0078
                    m3.z r5 = r1.b()
                    if (r5 == 0) goto L_0x0078
                    r14.f24195c = r1
                    r14.f24193a = r15
                    r14.f24194b = r2
                    java.lang.Object r2 = r5.r(r14)
                    if (r2 != r0) goto L_0x0072
                    return r0
                L_0x0072:
                    r0 = r15
                    r15 = r2
                L_0x0074:
                    m3.M r15 = (m3.M) r15
                    r7 = r0
                    goto L_0x007a
                L_0x0078:
                    r7 = r15
                    r15 = r4
                L_0x007a:
                    if (r15 == 0) goto L_0x0081
                    java.util.List r0 = r15.b()
                    goto L_0x0082
                L_0x0081:
                    r0 = r4
                L_0x0082:
                    java.util.Collection r0 = (java.util.Collection) r0
                    if (r0 == 0) goto L_0x008c
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L_0x00a7
                L_0x008c:
                    if (r1 == 0) goto L_0x00a7
                    m3.M r0 = r1.c()
                    if (r0 == 0) goto L_0x00a7
                    java.util.List r0 = r0.b()
                    if (r0 == 0) goto L_0x00a7
                    java.util.Collection r0 = (java.util.Collection) r0
                    boolean r0 = r0.isEmpty()
                    r0 = r0 ^ r3
                    if (r0 != r3) goto L_0x00a7
                    m3.M r15 = r1.c()
                L_0x00a7:
                    if (r15 == 0) goto L_0x00ae
                    java.lang.Integer r0 = r15.a()
                    goto L_0x00af
                L_0x00ae:
                    r0 = r4
                L_0x00af:
                    if (r0 != 0) goto L_0x00c5
                    if (r1 == 0) goto L_0x00be
                    m3.M r0 = r1.c()
                    if (r0 == 0) goto L_0x00be
                    java.lang.Integer r0 = r0.a()
                    goto L_0x00bf
                L_0x00be:
                    r0 = r4
                L_0x00bf:
                    if (r0 == 0) goto L_0x00c5
                    m3.M r15 = r1.c()
                L_0x00c5:
                    if (r15 != 0) goto L_0x00cf
                    m3.y r0 = r14.f24198f
                    java.lang.Object r0 = r0.f24175b
                L_0x00cd:
                    r6 = r0
                    goto L_0x00f9
                L_0x00cf:
                    java.lang.Object r0 = r7.getRefreshKey(r15)
                    m3.K r2 = m3.K.f23844a
                    r5 = 3
                    boolean r6 = r2.a(r5)
                    if (r6 == 0) goto L_0x00cd
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r8 = "Refresh key "
                    r6.append(r8)
                    r6.append(r0)
                    java.lang.String r8 = " returned from PagingSource "
                    r6.append(r8)
                    r6.append(r7)
                    java.lang.String r6 = r6.toString()
                    r2.b(r5, r6, r4)
                    goto L_0x00cd
                L_0x00f9:
                    if (r1 == 0) goto L_0x0104
                    m3.z r0 = r1.b()
                    if (r0 == 0) goto L_0x0104
                    r0.p()
                L_0x0104:
                    if (r1 == 0) goto L_0x010f
                    Ug.w0 r0 = r1.a()
                    if (r0 == 0) goto L_0x010f
                    Ug.C5600w0.a.a(r0, r4, r3, r4)
                L_0x010f:
                    m3.y$a r0 = new m3.y$a
                    m3.y r1 = r14.f24198f
                    m3.E r8 = r1.f24176c
                    m3.y r1 = r14.f24198f
                    m3.h r1 = r1.f24178e
                    Xg.f r9 = r1.a()
                    m3.y$d$b$a r12 = new m3.y$d$b$a
                    m3.y r1 = r14.f24198f
                    r12.<init>(r1)
                    m3.z r1 = new m3.z
                    m3.P r10 = r14.f24197e
                    r5 = r1
                    r11 = r15
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                    Ug.z r2 = Ug.C0.b(r4, r3, r4)
                    r0.<init>(r1, r15, r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C2225y.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: m3.y$d$c */
        static final class c extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f24199a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f24200b;

            c(C6658d dVar) {
                super(2, dVar);
            }

            public final C6658d create(Object obj, C6658d dVar) {
                c cVar = new c(dVar);
                cVar.f24200b = obj;
                return cVar;
            }

            /* renamed from: i */
            public final Object invoke(C2224x xVar, C6658d dVar) {
                return ((c) create(xVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                C6680b.f();
                if (this.f24199a == 0) {
                    w.b(obj);
                    C2224x xVar = (C2224x) this.f24200b;
                    K k10 = K.f23844a;
                    if (k10.a(2)) {
                        k10.b(2, "Sent " + xVar, (Throwable) null);
                    }
                    return C6514M.f71813a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: m3.y$d$d  reason: collision with other inner class name */
        /* synthetic */ class C0405d implements C5695g, C6491m {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ T f24201a;

            C0405d(T t10) {
                this.f24201a = t10;
            }

            /* renamed from: a */
            public final Object emit(C2201F f10, C6658d dVar) {
                Object k10 = this.f24201a.k(f10, dVar);
                if (k10 == C6680b.f()) {
                    return k10;
                }
                return C6514M.f71813a;
            }

            public final C6525i d() {
                return new C6494p(2, this.f24201a, T.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C5695g) || !(obj instanceof C6491m)) {
                    return false;
                }
                return C6496s.c(d(), ((C6491m) obj).d());
            }

            public final int hashCode() {
                return d().hashCode();
            }
        }

        /* renamed from: m3.y$d$e */
        public static final class e extends l implements q {

            /* renamed from: a  reason: collision with root package name */
            int f24202a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f24203b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f24204c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C2225y f24205d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ P f24206e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(C6658d dVar, C2225y yVar, P p10) {
                super(3, dVar);
                this.f24205d = yVar;
            }

            public final Object invoke(C5695g gVar, Object obj, C6658d dVar) {
                e eVar = new e(dVar, this.f24205d, this.f24206e);
                eVar.f24203b = gVar;
                eVar.f24204c = obj;
                return eVar.invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f24202a;
                if (i10 == 0) {
                    w.b(obj);
                    a aVar = (a) this.f24204c;
                    C5694f G10 = C5696h.G(this.f24205d.j(aVar.b(), aVar.a(), this.f24206e), new c((C6658d) null));
                    C2225y yVar = this.f24205d;
                    C2201F f11 = new C2201F(G10, new c(yVar, yVar.f24178e), new b(this.f24205d, aVar.b()), (C6787a) null, 8, (DefaultConstructorMarker) null);
                    this.f24202a = 1;
                    if (((C5695g) this.f24203b).emit(f11, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(O o10, C2225y yVar, C6658d dVar) {
            super(2, dVar);
            this.f24189c = yVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            d dVar2 = new d((O) null, this.f24189c, dVar);
            dVar2.f24188b = obj;
            return dVar2;
        }

        /* renamed from: i */
        public final Object invoke(T t10, C6658d dVar) {
            return ((d) create(t10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f24187a;
            if (i10 == 0) {
                w.b(obj);
                C5694f d10 = C2212k.d(C5696h.t(C2212k.c(C5696h.H(this.f24189c.f24177d.a(), new a((P) null, (C6658d) null)), (Object) null, new b((P) null, this.f24189c, (C6658d) null))), new e((C6658d) null, this.f24189c, (P) null));
                C0405d dVar = new C0405d((T) this.f24188b);
                this.f24187a = 1;
                if (d10.collect(dVar, this) == f10) {
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

    /* renamed from: m3.y$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f24207a;

        /* renamed from: b  reason: collision with root package name */
        Object f24208b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f24209c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2225y f24210d;

        /* renamed from: e  reason: collision with root package name */
        int f24211e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C2225y yVar, C6658d dVar) {
            super(dVar);
            this.f24210d = yVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24209c = obj;
            this.f24211e |= Integer.MIN_VALUE;
            return this.f24210d.h((L) null, this);
        }
    }

    /* renamed from: m3.y$f */
    /* synthetic */ class f extends C6494p implements C6787a {
        f(Object obj) {
            super(0, obj, C2225y.class, "invalidate", "invalidate()V", 0);
        }

        public final void invoke() {
            ((C2225y) this.receiver).k();
        }
    }

    /* renamed from: m3.y$g */
    /* synthetic */ class g extends C6494p implements C6787a {
        g(Object obj) {
            super(0, obj, C2225y.class, "invalidate", "invalidate()V", 0);
        }

        public final void invoke() {
            ((C2225y) this.receiver).k();
        }
    }

    /* renamed from: m3.y$h */
    static final class h extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f24212a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f24213b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ P f24214c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2226z f24215d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2223w f24216e;

        /* renamed from: m3.y$h$a */
        static final class a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ T f24217a;

            a(T t10) {
                this.f24217a = t10;
            }

            /* renamed from: a */
            public final Object emit(C2224x xVar, C6658d dVar) {
                Object k10 = this.f24217a.k(xVar, dVar);
                if (k10 == C6680b.f()) {
                    return k10;
                }
                return C6514M.f71813a;
            }
        }

        /* renamed from: m3.y$h$b */
        public static final class b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f24218a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f24219b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5694f f24220c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5694f f24221d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C2223w f24222e;

            /* renamed from: m3.y$h$b$a */
            public static final class a extends l implements r {

                /* renamed from: a  reason: collision with root package name */
                int f24223a;

                /* renamed from: b  reason: collision with root package name */
                /* synthetic */ Object f24224b;

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f24225c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f24226d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ T f24227e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C2223w f24228f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(T t10, C6658d dVar, C2223w wVar) {
                    super(4, dVar);
                    this.f24228f = wVar;
                    this.f24227e = t10;
                }

                /* renamed from: i */
                public final Object invoke(Object obj, Object obj2, C2207f fVar, C6658d dVar) {
                    a aVar = new a(this.f24227e, dVar, this.f24228f);
                    aVar.f24224b = obj;
                    aVar.f24225c = obj2;
                    aVar.f24226d = fVar;
                    return aVar.invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f24223a;
                    if (i10 == 0) {
                        w.b(obj);
                        Object obj2 = this.f24224b;
                        Object obj3 = this.f24225c;
                        C2207f fVar = (C2207f) this.f24226d;
                        T t10 = this.f24227e;
                        Object obj4 = (C2224x) obj3;
                        C2219s sVar = (C2219s) obj2;
                        if (fVar == C2207f.RECEIVER) {
                            obj4 = new C2224x.c(this.f24228f.d(), sVar);
                        } else if (obj4 instanceof C2224x.b) {
                            C2224x.b bVar = (C2224x.b) obj4;
                            this.f24228f.b(bVar.k());
                            obj4 = C2224x.b.e(bVar, (C2220t) null, (List) null, 0, 0, bVar.k(), sVar, 15, (Object) null);
                        } else if (obj4 instanceof C2224x.a) {
                            this.f24228f.c(((C2224x.a) obj4).c(), r.c.f24097b.b());
                        } else if (obj4 instanceof C2224x.c) {
                            C2224x.c cVar = (C2224x.c) obj4;
                            this.f24228f.b(cVar.d());
                            obj4 = new C2224x.c(cVar.d(), sVar);
                        } else if (obj4 instanceof C2224x.d) {
                            throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                        } else {
                            throw new C6535s();
                        }
                        this.f24223a = 1;
                        if (t10.k(obj4, this) == f10) {
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

            /* renamed from: m3.y$h$b$b  reason: collision with other inner class name */
            public static final class C0406b extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f24229a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ T f24230b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C5694f f24231c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ AtomicInteger f24232d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ Y f24233e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ int f24234f;

                /* renamed from: m3.y$h$b$b$a */
                public static final class a implements C5695g {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ Y f24235a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ int f24236b;

                    /* renamed from: m3.y$h$b$b$a$a  reason: collision with other inner class name */
                    static final class C0407a extends kotlin.coroutines.jvm.internal.d {

                        /* renamed from: a  reason: collision with root package name */
                        /* synthetic */ Object f24237a;

                        /* renamed from: b  reason: collision with root package name */
                        int f24238b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ a f24239c;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C0407a(a aVar, C6658d dVar) {
                            super(dVar);
                            this.f24239c = aVar;
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.f24237a = obj;
                            this.f24238b |= Integer.MIN_VALUE;
                            return this.f24239c.emit((Object) null, this);
                        }
                    }

                    public a(Y y10, int i10) {
                        this.f24235a = y10;
                        this.f24236b = i10;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
                    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object emit(java.lang.Object r6, qf.C6658d r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof m3.C2225y.h.b.C0406b.a.C0407a
                            if (r0 == 0) goto L_0x0013
                            r0 = r7
                            m3.y$h$b$b$a$a r0 = (m3.C2225y.h.b.C0406b.a.C0407a) r0
                            int r1 = r0.f24238b
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.f24238b = r1
                            goto L_0x0018
                        L_0x0013:
                            m3.y$h$b$b$a$a r0 = new m3.y$h$b$b$a$a
                            r0.<init>(r5, r7)
                        L_0x0018:
                            java.lang.Object r7 = r0.f24237a
                            java.lang.Object r1 = rf.C6680b.f()
                            int r2 = r0.f24238b
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L_0x0038
                            if (r2 == r4) goto L_0x0034
                            if (r2 != r3) goto L_0x002c
                            lf.w.b(r7)
                            goto L_0x0051
                        L_0x002c:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L_0x0034:
                            lf.w.b(r7)
                            goto L_0x0048
                        L_0x0038:
                            lf.w.b(r7)
                            m3.Y r7 = r5.f24235a
                            int r2 = r5.f24236b
                            r0.f24238b = r4
                            java.lang.Object r6 = r7.a(r2, r6, r0)
                            if (r6 != r1) goto L_0x0048
                            return r1
                        L_0x0048:
                            r0.f24238b = r3
                            java.lang.Object r6 = Ug.k1.a(r0)
                            if (r6 != r1) goto L_0x0051
                            return r1
                        L_0x0051:
                            lf.M r6 = lf.C6514M.f71813a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: m3.C2225y.h.b.C0406b.a.emit(java.lang.Object, qf.d):java.lang.Object");
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0406b(C5694f fVar, AtomicInteger atomicInteger, T t10, Y y10, int i10, C6658d dVar) {
                    super(2, dVar);
                    this.f24231c = fVar;
                    this.f24232d = atomicInteger;
                    this.f24233e = y10;
                    this.f24234f = i10;
                    this.f24230b = t10;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0406b(this.f24231c, this.f24232d, this.f24230b, this.f24233e, this.f24234f, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0406b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f24229a;
                    if (i10 == 0) {
                        w.b(obj);
                        C5694f fVar = this.f24231c;
                        a aVar = new a(this.f24233e, this.f24234f);
                        this.f24229a = 1;
                        if (fVar.collect(aVar, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        try {
                            w.b(obj);
                        } catch (Throwable th2) {
                            if (this.f24232d.decrementAndGet() == 0) {
                                u.a.a(this.f24230b, (Throwable) null, 1, (Object) null);
                            }
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (this.f24232d.decrementAndGet() == 0) {
                        u.a.a(this.f24230b, (Throwable) null, 1, (Object) null);
                    }
                    return C6514M.f71813a;
                }
            }

            /* renamed from: m3.y$h$b$c */
            public static final class c extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C5605z f24240a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public c(C5605z zVar) {
                    super(0);
                    this.f24240a = zVar;
                }

                public final void invoke() {
                    C5600w0.a.a(this.f24240a, (CancellationException) null, 1, (Object) null);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C5694f fVar, C5694f fVar2, C6658d dVar, C2223w wVar) {
                super(2, dVar);
                this.f24220c = fVar;
                this.f24221d = fVar2;
                this.f24222e = wVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                b bVar = new b(this.f24220c, this.f24221d, dVar, this.f24222e);
                bVar.f24219b = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(T t10, C6658d dVar) {
                return ((b) create(t10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                int i10 = 0;
                Object f10 = C6680b.f();
                int i11 = this.f24218a;
                if (i11 == 0) {
                    w.b(obj);
                    T t10 = (T) this.f24219b;
                    AtomicInteger atomicInteger = new AtomicInteger(2);
                    Y y10 = new Y(new a(t10, (C6658d) null, this.f24222e));
                    C5605z b10 = C0.b((C5600w0) null, 1, (Object) null);
                    C5694f[] fVarArr = {this.f24220c, this.f24221d};
                    int i12 = 0;
                    while (i10 < 2) {
                        C5600w0 unused = C5576k.d(t10, b10, (M) null, new C0406b(fVarArr[i10], atomicInteger, t10, y10, i12, (C6658d) null), 2, (Object) null);
                        i10++;
                        i12++;
                        fVarArr = fVarArr;
                    }
                    c cVar = new c(b10);
                    this.f24218a = 1;
                    if (t10.g0(cVar, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(P p10, C2226z zVar, C2223w wVar, C6658d dVar) {
            super(2, dVar);
            this.f24215d = zVar;
            this.f24216e = wVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            h hVar = new h(this.f24214c, this.f24215d, this.f24216e, dVar);
            hVar.f24213b = obj;
            return hVar;
        }

        /* renamed from: i */
        public final Object invoke(T t10, C6658d dVar) {
            return ((h) create(t10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f24212a;
            if (i10 == 0) {
                w.b(obj);
                C5694f a10 = S.a(new b(this.f24214c.getState(), this.f24215d.u(), (C6658d) null, this.f24216e));
                a aVar = new a((T) this.f24213b);
                this.f24212a = 1;
                if (a10.collect(aVar, this) == f10) {
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

    public C2225y(C6798l lVar, Object obj, C2200E e10, O o10) {
        C6496s.h(lVar, "pagingSourceFactory");
        C6496s.h(e10, "config");
        this.f24174a = lVar;
        this.f24175b = obj;
        this.f24176c = e10;
        this.f24179f = S.a(new d(o10, this, (C6658d) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(m3.L r5, qf.C6658d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m3.C2225y.e
            if (r0 == 0) goto L_0x0013
            r0 = r6
            m3.y$e r0 = (m3.C2225y.e) r0
            int r1 = r0.f24211e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24211e = r1
            goto L_0x0018
        L_0x0013:
            m3.y$e r0 = new m3.y$e
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f24209c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f24211e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.f24208b
            m3.L r5 = (m3.L) r5
            java.lang.Object r0 = r0.f24207a
            m3.y r0 = (m3.C2225y) r0
            lf.w.b(r6)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            lf.w.b(r6)
            yf.l r6 = r4.f24174a
            r0.f24207a = r4
            r0.f24208b = r5
            r0.f24211e = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            m3.L r6 = (m3.L) r6
            if (r6 == r5) goto L_0x0086
            m3.y$f r1 = new m3.y$f
            r1.<init>(r0)
            r6.registerInvalidatedCallback(r1)
            if (r5 == 0) goto L_0x0062
            m3.y$g r1 = new m3.y$g
            r1.<init>(r0)
            r5.unregisterInvalidatedCallback(r1)
        L_0x0062:
            if (r5 == 0) goto L_0x0067
            r5.invalidate()
        L_0x0067:
            m3.K r5 = m3.K.f23844a
            r0 = 3
            boolean r1 = r5.a(r0)
            if (r1 == 0) goto L_0x0085
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Generated new PagingSource "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r5.b(r0, r1, r2)
        L_0x0085:
            return r6
        L_0x0086:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C2225y.h(m3.L, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final C5694f j(C2226z zVar, C5600w0 w0Var, P p10) {
        if (p10 == null) {
            return zVar.u();
        }
        return C2205d.a(w0Var, new h(p10, zVar, new C2223w(), (C6658d) null));
    }

    /* access modifiers changed from: private */
    public final void k() {
        this.f24177d.b(Boolean.FALSE);
    }

    public final C5694f i() {
        return this.f24179f;
    }

    public final void l() {
        this.f24177d.b(Boolean.TRUE);
    }
}
