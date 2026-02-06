package m3;

import Ug.C5600w0;
import Ug.C5605z;
import Ug.K;
import Ug.M;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import dh.C5817a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import m3.C2197B;
import m3.C2224x;
import m3.L;
import m3.r;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: m3.z  reason: case insensitive filesystem */
public final class C2226z {

    /* renamed from: a  reason: collision with root package name */
    private final Object f24241a;

    /* renamed from: b  reason: collision with root package name */
    private final L f24242b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C2200E f24243c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C5694f f24244d;

    /* renamed from: e  reason: collision with root package name */
    private final Q f24245e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final M f24246f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C6787a f24247g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C2214m f24248h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f24249i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Wg.d f24250j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C2197B.a f24251k;

    /* renamed from: l  reason: collision with root package name */
    private final C5605z f24252l;

    /* renamed from: m  reason: collision with root package name */
    private final C5694f f24253m;

    /* renamed from: m3.z$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24254a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                m3.t[] r0 = m3.C2220t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                m3.t r1 = m3.C2220t.REFRESH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                m3.t r1 = m3.C2220t.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                m3.t r1 = m3.C2220t.APPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f24254a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2226z.a.<clinit>():void");
        }
    }

    /* renamed from: m3.z$b */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f24255a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f24256b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f24257c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2226z f24258d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2220t f24259e;

        /* renamed from: f  reason: collision with root package name */
        Object f24260f;

        /* renamed from: g  reason: collision with root package name */
        int f24261g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C6658d dVar, C2226z zVar, C2220t tVar) {
            super(3, dVar);
            this.f24258d = zVar;
            this.f24259e = tVar;
        }

        public final Object invoke(C5695g gVar, Object obj, C6658d dVar) {
            b bVar = new b(dVar, this.f24258d, this.f24259e);
            bVar.f24256b = gVar;
            bVar.f24257c = obj;
            return bVar.invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: Xg.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r11.f24255a
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x002e
                if (r1 == r3) goto L_0x001c
                if (r1 != r2) goto L_0x0014
                lf.w.b(r12)
                goto L_0x00c8
            L_0x0014:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001c:
                int r1 = r11.f24261g
                java.lang.Object r5 = r11.f24260f
                dh.a r5 = (dh.C5817a) r5
                java.lang.Object r6 = r11.f24257c
                m3.B$a r6 = (m3.C2197B.a) r6
                java.lang.Object r7 = r11.f24256b
                Xg.g r7 = (Xg.C5695g) r7
                lf.w.b(r12)
                goto L_0x0059
            L_0x002e:
                lf.w.b(r12)
                java.lang.Object r12 = r11.f24256b
                r7 = r12
                Xg.g r7 = (Xg.C5695g) r7
                java.lang.Object r12 = r11.f24257c
                java.lang.Number r12 = (java.lang.Number) r12
                int r1 = r12.intValue()
                m3.z r12 = r11.f24258d
                m3.B$a r6 = r12.f24251k
                dh.a r5 = r6.f23751b
                r11.f24256b = r7
                r11.f24257c = r6
                r11.f24260f = r5
                r11.f24261g = r1
                r11.f24255a = r3
                java.lang.Object r12 = r5.a(r4, r11)
                if (r12 != r0) goto L_0x0059
                return r0
            L_0x0059:
                m3.B r12 = r6.f23752c     // Catch:{ all -> 0x007e }
                m3.w r6 = r12.p()     // Catch:{ all -> 0x007e }
                m3.t r8 = r11.f24259e     // Catch:{ all -> 0x007e }
                m3.r r6 = r6.a(r8)     // Catch:{ all -> 0x007e }
                m3.r$c$a r8 = m3.r.c.f24097b     // Catch:{ all -> 0x007e }
                m3.r$c r9 = r8.a()     // Catch:{ all -> 0x007e }
                boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r9)     // Catch:{ all -> 0x007e }
                r9 = 0
                if (r6 == 0) goto L_0x0080
                m3.l[] r12 = new m3.C2213l[r9]     // Catch:{ all -> 0x007e }
                Xg.f r12 = Xg.C5696h.B(r12)     // Catch:{ all -> 0x007e }
                r5.e(r4)
                goto L_0x00b9
            L_0x007e:
                r12 = move-exception
                goto L_0x00cb
            L_0x0080:
                m3.w r6 = r12.p()     // Catch:{ all -> 0x007e }
                m3.t r10 = r11.f24259e     // Catch:{ all -> 0x007e }
                m3.r r6 = r6.a(r10)     // Catch:{ all -> 0x007e }
                boolean r6 = r6 instanceof m3.r.a     // Catch:{ all -> 0x007e }
                if (r6 != 0) goto L_0x009b
                m3.w r12 = r12.p()     // Catch:{ all -> 0x007e }
                m3.t r6 = r11.f24259e     // Catch:{ all -> 0x007e }
                m3.r$c r8 = r8.b()     // Catch:{ all -> 0x007e }
                r12.c(r6, r8)     // Catch:{ all -> 0x007e }
            L_0x009b:
                lf.M r12 = lf.C6514M.f71813a     // Catch:{ all -> 0x007e }
                r5.e(r4)
                m3.z r12 = r11.f24258d
                m3.m r12 = r12.f24248h
                m3.t r5 = r11.f24259e
                Xg.f r12 = r12.c(r5)
                if (r1 != 0) goto L_0x00af
                r3 = r9
            L_0x00af:
                Xg.f r12 = Xg.C5696h.o(r12, r3)
                m3.z$e r3 = new m3.z$e
                r3.<init>(r12, r1)
                r12 = r3
            L_0x00b9:
                r11.f24256b = r4
                r11.f24257c = r4
                r11.f24260f = r4
                r11.f24255a = r2
                java.lang.Object r12 = Xg.C5696h.r(r7, r12, r11)
                if (r12 != r0) goto L_0x00c8
                return r0
            L_0x00c8:
                lf.M r12 = lf.C6514M.f71813a
                return r12
            L_0x00cb:
                r5.e(r4)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2226z.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: m3.z$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f24262a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f24263b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f24264c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2220t f24265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2220t tVar, C6658d dVar) {
            super(3, dVar);
            this.f24265d = tVar;
        }

        /* renamed from: i */
        public final Object invoke(C2213l lVar, C2213l lVar2, C6658d dVar) {
            c cVar = new c(this.f24265d, dVar);
            cVar.f24263b = lVar;
            cVar.f24264c = lVar2;
            return cVar.invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f24262a == 0) {
                w.b(obj);
                C2213l lVar = (C2213l) this.f24263b;
                C2213l lVar2 = (C2213l) this.f24264c;
                if (C2196A.a(lVar2, lVar, this.f24265d)) {
                    return lVar2;
                }
                return lVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: m3.z$d */
    static final class d implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2226z f24266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2220t f24267b;

        d(C2226z zVar, C2220t tVar) {
            this.f24266a = zVar;
            this.f24267b = tVar;
        }

        /* renamed from: a */
        public final Object emit(C2213l lVar, C6658d dVar) {
            Object c10 = this.f24266a.t(this.f24267b, lVar, dVar);
            if (c10 == C6680b.f()) {
                return c10;
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: m3.z$e */
    public static final class e implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f24268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f24269b;

        /* renamed from: m3.z$e$a */
        public static final class a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5695g f24270a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f24271b;

            /* renamed from: m3.z$e$a$a  reason: collision with other inner class name */
            public static final class C0408a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f24272a;

                /* renamed from: b  reason: collision with root package name */
                int f24273b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a f24274c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0408a(a aVar, C6658d dVar) {
                    super(dVar);
                    this.f24274c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24272a = obj;
                    this.f24273b |= Integer.MIN_VALUE;
                    return this.f24274c.emit((Object) null, this);
                }
            }

            public a(C5695g gVar, int i10) {
                this.f24270a = gVar;
                this.f24271b = i10;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, qf.C6658d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof m3.C2226z.e.a.C0408a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    m3.z$e$a$a r0 = (m3.C2226z.e.a.C0408a) r0
                    int r1 = r0.f24273b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f24273b = r1
                    goto L_0x0018
                L_0x0013:
                    m3.z$e$a$a r0 = new m3.z$e$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f24272a
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f24273b
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    lf.w.b(r7)
                    goto L_0x0048
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    lf.w.b(r7)
                    Xg.g r7 = r5.f24270a
                    m3.Z r6 = (m3.Z) r6
                    m3.l r2 = new m3.l
                    int r4 = r5.f24271b
                    r2.<init>(r4, r6)
                    r0.f24273b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    lf.M r6 = lf.C6514M.f71813a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C2226z.e.a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        public e(C5694f fVar, int i10) {
            this.f24268a = fVar;
            this.f24269b = i10;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object collect = this.f24268a.collect(new a(gVar, this.f24269b), dVar);
            if (collect == C6680b.f()) {
                return collect;
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: m3.z$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f24275a;

        /* renamed from: b  reason: collision with root package name */
        Object f24276b;

        /* renamed from: c  reason: collision with root package name */
        Object f24277c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f24278d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2226z f24279e;

        /* renamed from: f  reason: collision with root package name */
        int f24280f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C2226z zVar, C6658d dVar) {
            super(dVar);
            this.f24279e = zVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24278d = obj;
            this.f24280f |= Integer.MIN_VALUE;
            return this.f24279e.r(this);
        }
    }

    /* renamed from: m3.z$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f24281a;

        /* renamed from: b  reason: collision with root package name */
        Object f24282b;

        /* renamed from: c  reason: collision with root package name */
        Object f24283c;

        /* renamed from: d  reason: collision with root package name */
        Object f24284d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f24285e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C2226z f24286f;

        /* renamed from: g  reason: collision with root package name */
        int f24287g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C2226z zVar, C6658d dVar) {
            super(dVar);
            this.f24286f = zVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24285e = obj;
            this.f24287g |= Integer.MIN_VALUE;
            return this.f24286f.s(this);
        }
    }

    /* renamed from: m3.z$h */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f24288a;

        /* renamed from: b  reason: collision with root package name */
        Object f24289b;

        /* renamed from: c  reason: collision with root package name */
        Object f24290c;

        /* renamed from: d  reason: collision with root package name */
        Object f24291d;

        /* renamed from: e  reason: collision with root package name */
        Object f24292e;

        /* renamed from: f  reason: collision with root package name */
        Object f24293f;

        /* renamed from: g  reason: collision with root package name */
        Object f24294g;

        /* renamed from: h  reason: collision with root package name */
        Object f24295h;

        /* renamed from: i  reason: collision with root package name */
        Object f24296i;

        /* renamed from: j  reason: collision with root package name */
        Object f24297j;

        /* renamed from: k  reason: collision with root package name */
        Object f24298k;

        /* renamed from: l  reason: collision with root package name */
        int f24299l;

        /* renamed from: m  reason: collision with root package name */
        int f24300m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f24301n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C2226z f24302o;

        /* renamed from: p  reason: collision with root package name */
        int f24303p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C2226z zVar, C6658d dVar) {
            super(dVar);
            this.f24302o = zVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24301n = obj;
            this.f24303p |= Integer.MIN_VALUE;
            return this.f24302o.t((C2220t) null, (C2213l) null, this);
        }
    }

    /* renamed from: m3.z$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f24304a;

        /* renamed from: b  reason: collision with root package name */
        Object f24305b;

        /* renamed from: c  reason: collision with root package name */
        Object f24306c;

        /* renamed from: d  reason: collision with root package name */
        int f24307d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f24308e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C2226z f24309f;

        /* renamed from: m3.z$i$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f24310a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2226z f24311b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ T f24312c;

            /* renamed from: m3.z$i$a$a  reason: collision with other inner class name */
            static final class C0409a implements C5695g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ T f24313a;

                /* renamed from: m3.z$i$a$a$a  reason: collision with other inner class name */
                static final class C0410a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f24314a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C0409a f24315b;

                    /* renamed from: c  reason: collision with root package name */
                    int f24316c;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0410a(C0409a aVar, C6658d dVar) {
                        super(dVar);
                        this.f24315b = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f24314a = obj;
                        this.f24316c |= Integer.MIN_VALUE;
                        return this.f24315b.emit((C2224x) null, this);
                    }
                }

                C0409a(T t10) {
                    this.f24313a = t10;
                }

                /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(m3.C2224x r5, qf.C6658d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof m3.C2226z.i.a.C0409a.C0410a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        m3.z$i$a$a$a r0 = (m3.C2226z.i.a.C0409a.C0410a) r0
                        int r1 = r0.f24316c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f24316c = r1
                        goto L_0x0018
                    L_0x0013:
                        m3.z$i$a$a$a r0 = new m3.z$i$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f24314a
                        java.lang.Object r1 = rf.C6680b.f()
                        int r2 = r0.f24316c
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        lf.w.b(r6)     // Catch:{ n -> 0x003f }
                        goto L_0x003f
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        lf.w.b(r6)
                        m3.T r6 = r4.f24313a     // Catch:{ n -> 0x003f }
                        r0.f24316c = r3     // Catch:{ n -> 0x003f }
                        java.lang.Object r5 = r6.k(r5, r0)     // Catch:{ n -> 0x003f }
                        if (r5 != r1) goto L_0x003f
                        return r1
                    L_0x003f:
                        lf.M r5 = lf.C6514M.f71813a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: m3.C2226z.i.a.C0409a.emit(m3.x, qf.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2226z zVar, T t10, C6658d dVar) {
                super(2, dVar);
                this.f24311b = zVar;
                this.f24312c = t10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f24311b, this.f24312c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f24310a;
                if (i10 == 0) {
                    w.b(obj);
                    C5694f k10 = C5696h.k(this.f24311b.f24250j);
                    C0409a aVar = new C0409a(this.f24312c);
                    this.f24310a = 1;
                    if (k10.collect(aVar, this) == f10) {
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

        /* renamed from: m3.z$i$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f24317a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2226z f24318b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Wg.d f24319c;

            /* renamed from: m3.z$i$b$a */
            static final class a implements C5695g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Wg.d f24320a;

                a(Wg.d dVar) {
                    this.f24320a = dVar;
                }

                /* renamed from: a */
                public final Object emit(C6514M m10, C6658d dVar) {
                    this.f24320a.c(m10);
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C2226z zVar, Wg.d dVar, C6658d dVar2) {
                super(2, dVar2);
                this.f24318b = zVar;
                this.f24319c = dVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new b(this.f24318b, this.f24319c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f24317a;
                if (i10 == 0) {
                    w.b(obj);
                    C5694f j10 = this.f24318b.f24244d;
                    a aVar = new a(this.f24319c);
                    this.f24317a = 1;
                    if (j10.collect(aVar, this) == f10) {
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

        /* renamed from: m3.z$i$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f24321a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f24322b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Wg.d f24323c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C2226z f24324d;

            /* renamed from: m3.z$i$c$a */
            static final class a implements C5695g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2226z f24325a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ K f24326b;

                /* renamed from: m3.z$i$c$a$a  reason: collision with other inner class name */
                public /* synthetic */ class C0411a {

                    /* renamed from: a  reason: collision with root package name */
                    public static final /* synthetic */ int[] f24327a;

                    static {
                        int[] iArr = new int[C2220t.values().length];
                        try {
                            iArr[C2220t.REFRESH.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f24327a = iArr;
                    }
                }

                /* renamed from: m3.z$i$c$a$b */
                static final class b extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    Object f24328a;

                    /* renamed from: b  reason: collision with root package name */
                    Object f24329b;

                    /* renamed from: c  reason: collision with root package name */
                    Object f24330c;

                    /* renamed from: d  reason: collision with root package name */
                    Object f24331d;

                    /* renamed from: e  reason: collision with root package name */
                    Object f24332e;

                    /* renamed from: f  reason: collision with root package name */
                    Object f24333f;

                    /* renamed from: g  reason: collision with root package name */
                    Object f24334g;

                    /* renamed from: h  reason: collision with root package name */
                    Object f24335h;

                    /* renamed from: i  reason: collision with root package name */
                    /* synthetic */ Object f24336i;

                    /* renamed from: j  reason: collision with root package name */
                    final /* synthetic */ a f24337j;

                    /* renamed from: k  reason: collision with root package name */
                    int f24338k;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    b(a aVar, C6658d dVar) {
                        super(dVar);
                        this.f24337j = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f24336i = obj;
                        this.f24338k |= Integer.MIN_VALUE;
                        return this.f24337j.emit((C6514M) null, this);
                    }
                }

                a(C2226z zVar, K k10) {
                    this.f24325a = zVar;
                    this.f24326b = k10;
                }

                /* JADX INFO: finally extract failed */
                /* JADX WARNING: Code restructure failed: missing block: B:100:0x036b, code lost:
                    r15 = lf.C6514M.f71813a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:101:0x036d, code lost:
                    r1.e((java.lang.Object) null);
                    r8 = r5;
                    r1 = r6;
                    r10 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:104:0x0378, code lost:
                    r10 = r1;
                    r8 = r4;
                    r4 = r5;
                    r1 = r15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:106:0x0384, code lost:
                    if (m3.C2226z.i.c.a.C0411a.f24327a[r4.ordinal()] != 1) goto L_0x038a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:107:0x0386, code lost:
                    r5 = r1;
                    r15 = null;
                    r6 = r4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:108:0x038a, code lost:
                    r6 = m3.C2226z.k(r1);
                    r5 = r6.f23751b;
                    r14.f24328a = r10;
                    r14.f24329b = r1;
                    r14.f24330c = r8;
                    r14.f24331d = r4;
                    r14.f24332e = r6;
                    r14.f24333f = r5;
                    r14.f24334g = r4;
                    r14.f24335h = r1;
                    r14.f24338k = 9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:109:0x03aa, code lost:
                    if (r5.a((java.lang.Object) null, r14) != r0) goto L_0x03ad;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:110:0x03ac, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:111:0x03ad, code lost:
                    r9 = r1;
                    r7 = r4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
                    r15 = (m3.Z) r6.f23752c.k().get(r7);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:114:0x03bd, code lost:
                    r5.e((java.lang.Object) null);
                    r5 = r1;
                    r6 = r4;
                    r4 = r7;
                    r1 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:115:0x03c4, code lost:
                    r14.f24328a = r10;
                    r14.f24329b = r1;
                    r14.f24330c = r8;
                    r14.f24331d = r4;
                    r14.f24332e = null;
                    r14.f24333f = null;
                    r14.f24334g = null;
                    r14.f24335h = null;
                    r14.f24338k = 10;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:116:0x03dc, code lost:
                    if (m3.C2226z.l(r5, r6, r15, r14) != r0) goto L_0x03df;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:117:0x03de, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:118:0x03df, code lost:
                    r6 = r1;
                    r1 = r4;
                    r5 = r8;
                    r7 = r10;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:120:0x03e5, code lost:
                    if (r1 != m3.C2220t.REFRESH) goto L_0x041c;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:121:0x03e7, code lost:
                    r4 = m3.C2226z.k(r6);
                    r1 = r4.f23751b;
                    r14.f24328a = r7;
                    r14.f24329b = r6;
                    r14.f24330c = r5;
                    r14.f24331d = r4;
                    r14.f24332e = r1;
                    r14.f24338k = 11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:122:0x0401, code lost:
                    if (r1.a((java.lang.Object) null, r14) != r0) goto L_0x0404;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:123:0x0403, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
                    r15 = r4.f23752c.p().a(m3.C2220t.REFRESH);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:126:0x0412, code lost:
                    r1.e((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:127:0x0417, code lost:
                    if ((r15 instanceof m3.r.a) != false) goto L_0x041c;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:128:0x0419, code lost:
                    m3.C2226z.n(r6, r5);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:129:0x041c, code lost:
                    r4 = r5;
                    r15 = r6;
                    r1 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:130:0x0420, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:131:0x0421, code lost:
                    r1.e((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:132:0x0424, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:133:0x0425, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:134:0x0426, code lost:
                    r5.e((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:135:0x0429, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:136:0x042a, code lost:
                    r5 = m3.C2220t.APPEND;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:137:0x0432, code lost:
                    if ((r1.d() instanceof m3.r.a) == false) goto L_0x052b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:139:0x0436, code lost:
                    if (r5 == m3.C2220t.REFRESH) goto L_0x0481;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:140:0x0438, code lost:
                    r1 = m3.C2226z.k(r15);
                    r6 = r1.f23751b;
                    r14.f24328a = r15;
                    r14.f24329b = r4;
                    r14.f24330c = r5;
                    r14.f24331d = r1;
                    r14.f24332e = r6;
                    r14.f24338k = 12;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:141:0x0452, code lost:
                    if (r6.a((java.lang.Object) null, r14) != r0) goto L_0x0455;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:142:0x0454, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:143:0x0455, code lost:
                    r11 = r4;
                    r4 = r1;
                    r1 = r6;
                    r6 = r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
                    r4 = r4.f23752c;
                    r14.f24328a = r15;
                    r14.f24329b = r6;
                    r14.f24330c = r5;
                    r14.f24331d = r1;
                    r14.f24332e = null;
                    r14.f24338k = 13;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:146:0x046f, code lost:
                    if (m3.C2226z.m(r15, r4, r5, r14) != r0) goto L_0x0472;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:147:0x0471, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:148:0x0472, code lost:
                    r4 = r5;
                    r5 = r6;
                    r6 = r15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:149:0x0475, code lost:
                    r15 = lf.C6514M.f71813a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:150:0x0477, code lost:
                    r1.e((java.lang.Object) null);
                    r7 = r5;
                    r1 = r6;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:153:0x0481, code lost:
                    r1 = r15;
                    r7 = r4;
                    r4 = r5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:155:0x048c, code lost:
                    if (m3.C2226z.i.c.a.C0411a.f24327a[r4.ordinal()] != 1) goto L_0x0492;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:156:0x048e, code lost:
                    r2 = r1;
                    r15 = null;
                    r5 = r4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:157:0x0492, code lost:
                    r5 = m3.C2226z.k(r1);
                    r15 = r5.f23751b;
                    r14.f24328a = r1;
                    r14.f24329b = r7;
                    r14.f24330c = r4;
                    r14.f24331d = r5;
                    r14.f24332e = r15;
                    r14.f24333f = r4;
                    r14.f24334g = r1;
                    r14.f24338k = 14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:158:0x04b0, code lost:
                    if (r15.a((java.lang.Object) null, r14) != r0) goto L_0x04b3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:159:0x04b2, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:160:0x04b3, code lost:
                    r8 = r1;
                    r2 = r4;
                    r6 = r2;
                    r4 = r15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
                    r15 = (m3.Z) r5.f23752c.k().get(r6);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:163:0x04c5, code lost:
                    r4.e((java.lang.Object) null);
                    r5 = r2;
                    r4 = r6;
                    r2 = r1;
                    r1 = r8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:164:0x04cc, code lost:
                    r14.f24328a = r1;
                    r14.f24329b = r7;
                    r14.f24330c = r4;
                    r14.f24331d = null;
                    r14.f24332e = null;
                    r14.f24333f = null;
                    r14.f24334g = null;
                    r14.f24338k = 15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:165:0x04e2, code lost:
                    if (m3.C2226z.l(r2, r5, r15, r14) != r0) goto L_0x04e5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:166:0x04e4, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:167:0x04e5, code lost:
                    r2 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:169:0x04e8, code lost:
                    if (r4 != m3.C2220t.REFRESH) goto L_0x052b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:170:0x04ea, code lost:
                    r15 = m3.C2226z.k(r1);
                    r4 = r15.f23751b;
                    r14.f24328a = r1;
                    r14.f24329b = r2;
                    r14.f24330c = r15;
                    r14.f24331d = r4;
                    r14.f24338k = 16;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:171:0x0502, code lost:
                    if (r4.a((java.lang.Object) null, r14) != r0) goto L_0x0505;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:172:0x0504, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:173:0x0505, code lost:
                    r14 = r1;
                    r0 = r4;
                    r1 = r15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
                    r15 = r1.f23752c.p().a(m3.C2220t.REFRESH);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:176:0x0516, code lost:
                    r0.e((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:177:0x051b, code lost:
                    if ((r15 instanceof m3.r.a) != false) goto L_0x052b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:178:0x051d, code lost:
                    m3.C2226z.n(r14, r2);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:179:0x0521, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:180:0x0522, code lost:
                    r0.e((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:181:0x0525, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:182:0x0526, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:183:0x0527, code lost:
                    r4.e((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:184:0x052a, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:186:0x052d, code lost:
                    return lf.C6514M.f71813a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:187:0x052e, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:188:0x052f, code lost:
                    r1.e((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:189:0x0532, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:39:0x01e3, code lost:
                    r15 = lf.C6514M.f71813a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:40:0x01e5, code lost:
                    r1.e((java.lang.Object) null);
                    r8 = r5;
                    r1 = r6;
                    r10 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
                    r15 = r5.f23752c;
                    r15 = lf.C6502A.a(r15.p().d(), r15.g(m3.C2226z.e(r4).b()));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:50:0x0242, code lost:
                    r1.e((java.lang.Object) null);
                    r1 = (m3.C2219s) r15.a();
                    r15 = (m3.M) r15.b();
                    r4 = r6.f24325a.w();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:51:0x0257, code lost:
                    if (r4 == null) goto L_0x025e;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:52:0x0259, code lost:
                    r4.b(r15);
                    r15 = lf.C6514M.f71813a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:53:0x025e, code lost:
                    r15 = r6.f24325a;
                    r4 = r6.f24326b;
                    r5 = m3.C2220t.REFRESH;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:54:0x026a, code lost:
                    if ((r1.f() instanceof m3.r.a) == false) goto L_0x031b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:55:0x026c, code lost:
                    r10 = r1;
                    r8 = r4;
                    r4 = r5;
                    r1 = r15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:57:0x0278, code lost:
                    if (m3.C2226z.i.c.a.C0411a.f24327a[r4.ordinal()] != 1) goto L_0x027e;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:58:0x027a, code lost:
                    r5 = r1;
                    r15 = null;
                    r6 = r4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:59:0x027e, code lost:
                    r6 = m3.C2226z.k(r1);
                    r5 = r6.f23751b;
                    r14.f24328a = r10;
                    r14.f24329b = r1;
                    r14.f24330c = r8;
                    r14.f24331d = r4;
                    r14.f24332e = r6;
                    r14.f24333f = r5;
                    r14.f24334g = r4;
                    r14.f24335h = r1;
                    r14.f24338k = 4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:60:0x029d, code lost:
                    if (r5.a((java.lang.Object) null, r14) != r0) goto L_0x02a0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:61:0x029f, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:62:0x02a0, code lost:
                    r9 = r1;
                    r7 = r4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
                    r15 = (m3.Z) r6.f23752c.k().get(r7);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:65:0x02b0, code lost:
                    r5.e((java.lang.Object) null);
                    r5 = r1;
                    r6 = r4;
                    r4 = r7;
                    r1 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:66:0x02b7, code lost:
                    r14.f24328a = r10;
                    r14.f24329b = r1;
                    r14.f24330c = r8;
                    r14.f24331d = r4;
                    r14.f24332e = null;
                    r14.f24333f = null;
                    r14.f24334g = null;
                    r14.f24335h = null;
                    r14.f24338k = 5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:67:0x02ce, code lost:
                    if (m3.C2226z.l(r5, r6, r15, r14) != r0) goto L_0x02d1;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:68:0x02d0, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:69:0x02d1, code lost:
                    r6 = r1;
                    r1 = r4;
                    r5 = r8;
                    r7 = r10;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:71:0x02d7, code lost:
                    if (r1 != m3.C2220t.REFRESH) goto L_0x030d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:72:0x02d9, code lost:
                    r4 = m3.C2226z.k(r6);
                    r1 = r4.f23751b;
                    r14.f24328a = r7;
                    r14.f24329b = r6;
                    r14.f24330c = r5;
                    r14.f24331d = r4;
                    r14.f24332e = r1;
                    r14.f24338k = 6;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:73:0x02f2, code lost:
                    if (r1.a((java.lang.Object) null, r14) != r0) goto L_0x02f5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:74:0x02f4, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
                    r15 = r4.f23752c.p().a(m3.C2220t.REFRESH);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:77:0x0303, code lost:
                    r1.e((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:78:0x0308, code lost:
                    if ((r15 instanceof m3.r.a) != false) goto L_0x030d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:79:0x030a, code lost:
                    m3.C2226z.n(r6, r5);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:80:0x030d, code lost:
                    r4 = r5;
                    r15 = r6;
                    r1 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:81:0x0311, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:82:0x0312, code lost:
                    r1.e((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:83:0x0315, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:84:0x0316, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:85:0x0317, code lost:
                    r5.e((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:86:0x031a, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:87:0x031b, code lost:
                    r5 = m3.C2220t.PREPEND;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:88:0x0323, code lost:
                    if ((r1.e() instanceof m3.r.a) == false) goto L_0x042a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:90:0x0327, code lost:
                    if (r5 == m3.C2220t.REFRESH) goto L_0x0378;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:91:0x0329, code lost:
                    r6 = m3.C2226z.k(r15);
                    r7 = r6.f23751b;
                    r14.f24328a = r1;
                    r14.f24329b = r15;
                    r14.f24330c = r4;
                    r14.f24331d = r5;
                    r14.f24332e = r6;
                    r14.f24333f = r7;
                    r14.f24338k = 7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:92:0x0344, code lost:
                    if (r7.a((java.lang.Object) null, r14) != r0) goto L_0x0347;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:93:0x0346, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:94:0x0347, code lost:
                    r11 = r7;
                    r7 = r1;
                    r1 = r11;
                    r12 = r6;
                    r6 = r4;
                    r4 = r12;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
                    r4 = r4.f23752c;
                    r14.f24328a = r7;
                    r14.f24329b = r15;
                    r14.f24330c = r6;
                    r14.f24331d = r5;
                    r14.f24332e = r1;
                    r14.f24333f = null;
                    r14.f24338k = 8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:97:0x0365, code lost:
                    if (m3.C2226z.m(r15, r4, r5, r14) != r0) goto L_0x0368;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:98:0x0367, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:99:0x0368, code lost:
                    r4 = r5;
                    r5 = r6;
                    r6 = r15;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
                /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
                /* JADX WARNING: Removed duplicated region for block: B:13:0x0077  */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x008f  */
                /* JADX WARNING: Removed duplicated region for block: B:18:0x00a9  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x00c2  */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x00da  */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x00ff  */
                /* JADX WARNING: Removed duplicated region for block: B:25:0x011b  */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x013a  */
                /* JADX WARNING: Removed duplicated region for block: B:27:0x0153  */
                /* JADX WARNING: Removed duplicated region for block: B:28:0x016b  */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x0190  */
                /* JADX WARNING: Removed duplicated region for block: B:33:0x01aa  */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x01f1  */
                /* JADX WARNING: Removed duplicated region for block: B:44:0x0205  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(lf.C6514M r14, qf.C6658d r15) {
                    /*
                        r13 = this;
                        boolean r14 = r15 instanceof m3.C2226z.i.c.a.b
                        if (r14 == 0) goto L_0x0013
                        r14 = r15
                        m3.z$i$c$a$b r14 = (m3.C2226z.i.c.a.b) r14
                        int r0 = r14.f24338k
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r2 = r0 & r1
                        if (r2 == 0) goto L_0x0013
                        int r0 = r0 - r1
                        r14.f24338k = r0
                        goto L_0x0018
                    L_0x0013:
                        m3.z$i$c$a$b r14 = new m3.z$i$c$a$b
                        r14.<init>(r13, r15)
                    L_0x0018:
                        java.lang.Object r15 = r14.f24336i
                        java.lang.Object r0 = rf.C6680b.f()
                        int r1 = r14.f24338k
                        r2 = 1
                        r3 = 0
                        switch(r1) {
                            case 0: goto L_0x0205;
                            case 1: goto L_0x01f1;
                            case 2: goto L_0x01aa;
                            case 3: goto L_0x0190;
                            case 4: goto L_0x016b;
                            case 5: goto L_0x0153;
                            case 6: goto L_0x013a;
                            case 7: goto L_0x011b;
                            case 8: goto L_0x00ff;
                            case 9: goto L_0x00da;
                            case 10: goto L_0x00c2;
                            case 11: goto L_0x00a9;
                            case 12: goto L_0x008f;
                            case 13: goto L_0x0077;
                            case 14: goto L_0x0056;
                            case 15: goto L_0x0042;
                            case 16: goto L_0x002d;
                            default: goto L_0x0025;
                        }
                    L_0x0025:
                        java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                        java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                        r14.<init>(r15)
                        throw r14
                    L_0x002d:
                        java.lang.Object r0 = r14.f24331d
                        dh.a r0 = (dh.C5817a) r0
                        java.lang.Object r1 = r14.f24330c
                        m3.B$a r1 = (m3.C2197B.a) r1
                        java.lang.Object r2 = r14.f24329b
                        Ug.K r2 = (Ug.K) r2
                        java.lang.Object r14 = r14.f24328a
                        m3.z r14 = (m3.C2226z) r14
                        lf.w.b(r15)
                        goto L_0x0508
                    L_0x0042:
                        java.lang.Object r1 = r14.f24330c
                        m3.t r1 = (m3.C2220t) r1
                        java.lang.Object r2 = r14.f24329b
                        Ug.K r2 = (Ug.K) r2
                        java.lang.Object r4 = r14.f24328a
                        m3.z r4 = (m3.C2226z) r4
                        lf.w.b(r15)
                        r11 = r4
                        r4 = r1
                        r1 = r11
                        goto L_0x04e6
                    L_0x0056:
                        java.lang.Object r1 = r14.f24334g
                        m3.z r1 = (m3.C2226z) r1
                        java.lang.Object r2 = r14.f24333f
                        m3.t r2 = (m3.C2220t) r2
                        java.lang.Object r4 = r14.f24332e
                        dh.a r4 = (dh.C5817a) r4
                        java.lang.Object r5 = r14.f24331d
                        m3.B$a r5 = (m3.C2197B.a) r5
                        java.lang.Object r6 = r14.f24330c
                        m3.t r6 = (m3.C2220t) r6
                        java.lang.Object r7 = r14.f24329b
                        Ug.K r7 = (Ug.K) r7
                        java.lang.Object r8 = r14.f24328a
                        m3.z r8 = (m3.C2226z) r8
                        lf.w.b(r15)
                        goto L_0x04b7
                    L_0x0077:
                        java.lang.Object r1 = r14.f24331d
                        dh.a r1 = (dh.C5817a) r1
                        java.lang.Object r4 = r14.f24330c
                        m3.t r4 = (m3.C2220t) r4
                        java.lang.Object r5 = r14.f24329b
                        Ug.K r5 = (Ug.K) r5
                        java.lang.Object r6 = r14.f24328a
                        m3.z r6 = (m3.C2226z) r6
                        lf.w.b(r15)     // Catch:{ all -> 0x008c }
                        goto L_0x0475
                    L_0x008c:
                        r14 = move-exception
                        goto L_0x047d
                    L_0x008f:
                        java.lang.Object r1 = r14.f24332e
                        dh.a r1 = (dh.C5817a) r1
                        java.lang.Object r4 = r14.f24331d
                        m3.B$a r4 = (m3.C2197B.a) r4
                        java.lang.Object r5 = r14.f24330c
                        m3.t r5 = (m3.C2220t) r5
                        java.lang.Object r6 = r14.f24329b
                        Ug.K r6 = (Ug.K) r6
                        java.lang.Object r7 = r14.f24328a
                        m3.z r7 = (m3.C2226z) r7
                        lf.w.b(r15)
                        r15 = r7
                        goto L_0x0459
                    L_0x00a9:
                        java.lang.Object r1 = r14.f24332e
                        dh.a r1 = (dh.C5817a) r1
                        java.lang.Object r4 = r14.f24331d
                        m3.B$a r4 = (m3.C2197B.a) r4
                        java.lang.Object r5 = r14.f24330c
                        Ug.K r5 = (Ug.K) r5
                        java.lang.Object r6 = r14.f24329b
                        m3.z r6 = (m3.C2226z) r6
                        java.lang.Object r7 = r14.f24328a
                        m3.s r7 = (m3.C2219s) r7
                        lf.w.b(r15)
                        goto L_0x0404
                    L_0x00c2:
                        java.lang.Object r1 = r14.f24331d
                        m3.t r1 = (m3.C2220t) r1
                        java.lang.Object r4 = r14.f24330c
                        Ug.K r4 = (Ug.K) r4
                        java.lang.Object r5 = r14.f24329b
                        m3.z r5 = (m3.C2226z) r5
                        java.lang.Object r6 = r14.f24328a
                        m3.s r6 = (m3.C2219s) r6
                        lf.w.b(r15)
                        r7 = r6
                        r6 = r5
                        r5 = r4
                        goto L_0x03e3
                    L_0x00da:
                        java.lang.Object r1 = r14.f24335h
                        m3.z r1 = (m3.C2226z) r1
                        java.lang.Object r4 = r14.f24334g
                        m3.t r4 = (m3.C2220t) r4
                        java.lang.Object r5 = r14.f24333f
                        dh.a r5 = (dh.C5817a) r5
                        java.lang.Object r6 = r14.f24332e
                        m3.B$a r6 = (m3.C2197B.a) r6
                        java.lang.Object r7 = r14.f24331d
                        m3.t r7 = (m3.C2220t) r7
                        java.lang.Object r8 = r14.f24330c
                        Ug.K r8 = (Ug.K) r8
                        java.lang.Object r9 = r14.f24329b
                        m3.z r9 = (m3.C2226z) r9
                        java.lang.Object r10 = r14.f24328a
                        m3.s r10 = (m3.C2219s) r10
                        lf.w.b(r15)
                        goto L_0x03af
                    L_0x00ff:
                        java.lang.Object r1 = r14.f24332e
                        dh.a r1 = (dh.C5817a) r1
                        java.lang.Object r4 = r14.f24331d
                        m3.t r4 = (m3.C2220t) r4
                        java.lang.Object r5 = r14.f24330c
                        Ug.K r5 = (Ug.K) r5
                        java.lang.Object r6 = r14.f24329b
                        m3.z r6 = (m3.C2226z) r6
                        java.lang.Object r7 = r14.f24328a
                        m3.s r7 = (m3.C2219s) r7
                        lf.w.b(r15)     // Catch:{ all -> 0x0118 }
                        goto L_0x036b
                    L_0x0118:
                        r14 = move-exception
                        goto L_0x0374
                    L_0x011b:
                        java.lang.Object r1 = r14.f24333f
                        dh.a r1 = (dh.C5817a) r1
                        java.lang.Object r4 = r14.f24332e
                        m3.B$a r4 = (m3.C2197B.a) r4
                        java.lang.Object r5 = r14.f24331d
                        m3.t r5 = (m3.C2220t) r5
                        java.lang.Object r6 = r14.f24330c
                        Ug.K r6 = (Ug.K) r6
                        java.lang.Object r7 = r14.f24329b
                        m3.z r7 = (m3.C2226z) r7
                        java.lang.Object r8 = r14.f24328a
                        m3.s r8 = (m3.C2219s) r8
                        lf.w.b(r15)
                        r15 = r7
                        r7 = r8
                        goto L_0x034d
                    L_0x013a:
                        java.lang.Object r1 = r14.f24332e
                        dh.a r1 = (dh.C5817a) r1
                        java.lang.Object r4 = r14.f24331d
                        m3.B$a r4 = (m3.C2197B.a) r4
                        java.lang.Object r5 = r14.f24330c
                        Ug.K r5 = (Ug.K) r5
                        java.lang.Object r6 = r14.f24329b
                        m3.z r6 = (m3.C2226z) r6
                        java.lang.Object r7 = r14.f24328a
                        m3.s r7 = (m3.C2219s) r7
                        lf.w.b(r15)
                        goto L_0x02f5
                    L_0x0153:
                        java.lang.Object r1 = r14.f24331d
                        m3.t r1 = (m3.C2220t) r1
                        java.lang.Object r4 = r14.f24330c
                        Ug.K r4 = (Ug.K) r4
                        java.lang.Object r5 = r14.f24329b
                        m3.z r5 = (m3.C2226z) r5
                        java.lang.Object r6 = r14.f24328a
                        m3.s r6 = (m3.C2219s) r6
                        lf.w.b(r15)
                        r7 = r6
                        r6 = r5
                        r5 = r4
                        goto L_0x02d5
                    L_0x016b:
                        java.lang.Object r1 = r14.f24335h
                        m3.z r1 = (m3.C2226z) r1
                        java.lang.Object r4 = r14.f24334g
                        m3.t r4 = (m3.C2220t) r4
                        java.lang.Object r5 = r14.f24333f
                        dh.a r5 = (dh.C5817a) r5
                        java.lang.Object r6 = r14.f24332e
                        m3.B$a r6 = (m3.C2197B.a) r6
                        java.lang.Object r7 = r14.f24331d
                        m3.t r7 = (m3.C2220t) r7
                        java.lang.Object r8 = r14.f24330c
                        Ug.K r8 = (Ug.K) r8
                        java.lang.Object r9 = r14.f24329b
                        m3.z r9 = (m3.C2226z) r9
                        java.lang.Object r10 = r14.f24328a
                        m3.s r10 = (m3.C2219s) r10
                        lf.w.b(r15)
                        goto L_0x02a2
                    L_0x0190:
                        java.lang.Object r1 = r14.f24332e
                        dh.a r1 = (dh.C5817a) r1
                        java.lang.Object r4 = r14.f24331d
                        m3.t r4 = (m3.C2220t) r4
                        java.lang.Object r5 = r14.f24330c
                        Ug.K r5 = (Ug.K) r5
                        java.lang.Object r6 = r14.f24329b
                        m3.z r6 = (m3.C2226z) r6
                        java.lang.Object r7 = r14.f24328a
                        m3.s r7 = (m3.C2219s) r7
                        lf.w.b(r15)     // Catch:{ all -> 0x01a8 }
                        goto L_0x01e3
                    L_0x01a8:
                        r14 = move-exception
                        goto L_0x01ed
                    L_0x01aa:
                        java.lang.Object r1 = r14.f24333f
                        dh.a r1 = (dh.C5817a) r1
                        java.lang.Object r4 = r14.f24332e
                        m3.B$a r4 = (m3.C2197B.a) r4
                        java.lang.Object r5 = r14.f24331d
                        m3.t r5 = (m3.C2220t) r5
                        java.lang.Object r6 = r14.f24330c
                        Ug.K r6 = (Ug.K) r6
                        java.lang.Object r7 = r14.f24329b
                        m3.z r7 = (m3.C2226z) r7
                        java.lang.Object r8 = r14.f24328a
                        m3.s r8 = (m3.C2219s) r8
                        lf.w.b(r15)
                        m3.B r15 = r4.f23752c     // Catch:{ all -> 0x01a8 }
                        r14.f24328a = r8     // Catch:{ all -> 0x01a8 }
                        r14.f24329b = r7     // Catch:{ all -> 0x01a8 }
                        r14.f24330c = r6     // Catch:{ all -> 0x01a8 }
                        r14.f24331d = r5     // Catch:{ all -> 0x01a8 }
                        r14.f24332e = r1     // Catch:{ all -> 0x01a8 }
                        r14.f24333f = r3     // Catch:{ all -> 0x01a8 }
                        r4 = 3
                        r14.f24338k = r4     // Catch:{ all -> 0x01a8 }
                        java.lang.Object r15 = r7.C(r15, r5, r14)     // Catch:{ all -> 0x01a8 }
                        if (r15 != r0) goto L_0x01df
                        return r0
                    L_0x01df:
                        r4 = r5
                        r5 = r6
                        r6 = r7
                        r7 = r8
                    L_0x01e3:
                        lf.M r15 = lf.C6514M.f71813a     // Catch:{ all -> 0x01a8 }
                        r1.e(r3)
                        r8 = r5
                        r1 = r6
                        r10 = r7
                        goto L_0x0270
                    L_0x01ed:
                        r1.e(r3)
                        throw r14
                    L_0x01f1:
                        java.lang.Object r1 = r14.f24331d
                        dh.a r1 = (dh.C5817a) r1
                        java.lang.Object r4 = r14.f24330c
                        m3.z r4 = (m3.C2226z) r4
                        java.lang.Object r5 = r14.f24329b
                        m3.B$a r5 = (m3.C2197B.a) r5
                        java.lang.Object r6 = r14.f24328a
                        m3.z$i$c$a r6 = (m3.C2226z.i.c.a) r6
                        lf.w.b(r15)
                        goto L_0x0226
                    L_0x0205:
                        lf.w.b(r15)
                        m3.z r15 = r13.f24325a
                        m3.B$a r5 = r15.f24251k
                        m3.z r4 = r13.f24325a
                        dh.a r1 = r5.f23751b
                        r14.f24328a = r13
                        r14.f24329b = r5
                        r14.f24330c = r4
                        r14.f24331d = r1
                        r14.f24338k = r2
                        java.lang.Object r15 = r1.a(r3, r14)
                        if (r15 != r0) goto L_0x0225
                        return r0
                    L_0x0225:
                        r6 = r13
                    L_0x0226:
                        m3.B r15 = r5.f23752c     // Catch:{ all -> 0x052e }
                        m3.w r5 = r15.p()     // Catch:{ all -> 0x052e }
                        m3.s r5 = r5.d()     // Catch:{ all -> 0x052e }
                        m3.m r4 = r4.f24248h     // Catch:{ all -> 0x052e }
                        m3.Z$a r4 = r4.b()     // Catch:{ all -> 0x052e }
                        m3.M r15 = r15.g(r4)     // Catch:{ all -> 0x052e }
                        kotlin.Pair r15 = lf.C6502A.a(r5, r15)     // Catch:{ all -> 0x052e }
                        r1.e(r3)
                        java.lang.Object r1 = r15.a()
                        m3.s r1 = (m3.C2219s) r1
                        java.lang.Object r15 = r15.b()
                        m3.M r15 = (m3.M) r15
                        m3.z r4 = r6.f24325a
                        m3.Q r4 = r4.w()
                        if (r4 == 0) goto L_0x025e
                        r4.b(r15)
                        lf.M r15 = lf.C6514M.f71813a
                    L_0x025e:
                        m3.z r15 = r6.f24325a
                        Ug.K r4 = r6.f24326b
                        m3.t r5 = m3.C2220t.REFRESH
                        m3.r r6 = r1.f()
                        boolean r6 = r6 instanceof m3.r.a
                        if (r6 == 0) goto L_0x031b
                        r10 = r1
                        r8 = r4
                        r4 = r5
                        r1 = r15
                    L_0x0270:
                        int[] r15 = m3.C2226z.i.c.a.C0411a.f24327a
                        int r5 = r4.ordinal()
                        r15 = r15[r5]
                        if (r15 != r2) goto L_0x027e
                        r5 = r1
                        r15 = r3
                        r6 = r4
                        goto L_0x02b7
                    L_0x027e:
                        m3.B$a r6 = r1.f24251k
                        dh.a r5 = r6.f23751b
                        r14.f24328a = r10
                        r14.f24329b = r1
                        r14.f24330c = r8
                        r14.f24331d = r4
                        r14.f24332e = r6
                        r14.f24333f = r5
                        r14.f24334g = r4
                        r14.f24335h = r1
                        r15 = 4
                        r14.f24338k = r15
                        java.lang.Object r15 = r5.a(r3, r14)
                        if (r15 != r0) goto L_0x02a0
                        return r0
                    L_0x02a0:
                        r9 = r1
                        r7 = r4
                    L_0x02a2:
                        m3.B r15 = r6.f23752c     // Catch:{ all -> 0x0316 }
                        java.util.Map r15 = r15.k()     // Catch:{ all -> 0x0316 }
                        java.lang.Object r15 = r15.get(r7)     // Catch:{ all -> 0x0316 }
                        m3.Z r15 = (m3.Z) r15     // Catch:{ all -> 0x0316 }
                        r5.e(r3)
                        r5 = r1
                        r6 = r4
                        r4 = r7
                        r1 = r9
                    L_0x02b7:
                        r14.f24328a = r10
                        r14.f24329b = r1
                        r14.f24330c = r8
                        r14.f24331d = r4
                        r14.f24332e = r3
                        r14.f24333f = r3
                        r14.f24334g = r3
                        r14.f24335h = r3
                        r7 = 5
                        r14.f24338k = r7
                        java.lang.Object r15 = r5.A(r6, r15, r14)
                        if (r15 != r0) goto L_0x02d1
                        return r0
                    L_0x02d1:
                        r6 = r1
                        r1 = r4
                        r5 = r8
                        r7 = r10
                    L_0x02d5:
                        m3.t r15 = m3.C2220t.REFRESH
                        if (r1 != r15) goto L_0x030d
                        m3.B$a r4 = r6.f24251k
                        dh.a r1 = r4.f23751b
                        r14.f24328a = r7
                        r14.f24329b = r6
                        r14.f24330c = r5
                        r14.f24331d = r4
                        r14.f24332e = r1
                        r15 = 6
                        r14.f24338k = r15
                        java.lang.Object r15 = r1.a(r3, r14)
                        if (r15 != r0) goto L_0x02f5
                        return r0
                    L_0x02f5:
                        m3.B r15 = r4.f23752c     // Catch:{ all -> 0x0311 }
                        m3.w r15 = r15.p()     // Catch:{ all -> 0x0311 }
                        m3.t r4 = m3.C2220t.REFRESH     // Catch:{ all -> 0x0311 }
                        m3.r r15 = r15.a(r4)     // Catch:{ all -> 0x0311 }
                        r1.e(r3)
                        boolean r15 = r15 instanceof m3.r.a
                        if (r15 != 0) goto L_0x030d
                        r6.D(r5)
                    L_0x030d:
                        r4 = r5
                        r15 = r6
                        r1 = r7
                        goto L_0x031b
                    L_0x0311:
                        r14 = move-exception
                        r1.e(r3)
                        throw r14
                    L_0x0316:
                        r14 = move-exception
                        r5.e(r3)
                        throw r14
                    L_0x031b:
                        m3.t r5 = m3.C2220t.PREPEND
                        m3.r r6 = r1.e()
                        boolean r6 = r6 instanceof m3.r.a
                        if (r6 == 0) goto L_0x042a
                        m3.t r6 = m3.C2220t.REFRESH
                        if (r5 == r6) goto L_0x0378
                        m3.B$a r6 = r15.f24251k
                        dh.a r7 = r6.f23751b
                        r14.f24328a = r1
                        r14.f24329b = r15
                        r14.f24330c = r4
                        r14.f24331d = r5
                        r14.f24332e = r6
                        r14.f24333f = r7
                        r8 = 7
                        r14.f24338k = r8
                        java.lang.Object r8 = r7.a(r3, r14)
                        if (r8 != r0) goto L_0x0347
                        return r0
                    L_0x0347:
                        r11 = r7
                        r7 = r1
                        r1 = r11
                        r12 = r6
                        r6 = r4
                        r4 = r12
                    L_0x034d:
                        m3.B r4 = r4.f23752c     // Catch:{ all -> 0x0118 }
                        r14.f24328a = r7     // Catch:{ all -> 0x0118 }
                        r14.f24329b = r15     // Catch:{ all -> 0x0118 }
                        r14.f24330c = r6     // Catch:{ all -> 0x0118 }
                        r14.f24331d = r5     // Catch:{ all -> 0x0118 }
                        r14.f24332e = r1     // Catch:{ all -> 0x0118 }
                        r14.f24333f = r3     // Catch:{ all -> 0x0118 }
                        r8 = 8
                        r14.f24338k = r8     // Catch:{ all -> 0x0118 }
                        java.lang.Object r4 = r15.C(r4, r5, r14)     // Catch:{ all -> 0x0118 }
                        if (r4 != r0) goto L_0x0368
                        return r0
                    L_0x0368:
                        r4 = r5
                        r5 = r6
                        r6 = r15
                    L_0x036b:
                        lf.M r15 = lf.C6514M.f71813a     // Catch:{ all -> 0x0118 }
                        r1.e(r3)
                        r8 = r5
                        r1 = r6
                        r10 = r7
                        goto L_0x037c
                    L_0x0374:
                        r1.e(r3)
                        throw r14
                    L_0x0378:
                        r10 = r1
                        r8 = r4
                        r4 = r5
                        r1 = r15
                    L_0x037c:
                        int[] r15 = m3.C2226z.i.c.a.C0411a.f24327a
                        int r5 = r4.ordinal()
                        r15 = r15[r5]
                        if (r15 != r2) goto L_0x038a
                        r5 = r1
                        r15 = r3
                        r6 = r4
                        goto L_0x03c4
                    L_0x038a:
                        m3.B$a r6 = r1.f24251k
                        dh.a r5 = r6.f23751b
                        r14.f24328a = r10
                        r14.f24329b = r1
                        r14.f24330c = r8
                        r14.f24331d = r4
                        r14.f24332e = r6
                        r14.f24333f = r5
                        r14.f24334g = r4
                        r14.f24335h = r1
                        r15 = 9
                        r14.f24338k = r15
                        java.lang.Object r15 = r5.a(r3, r14)
                        if (r15 != r0) goto L_0x03ad
                        return r0
                    L_0x03ad:
                        r9 = r1
                        r7 = r4
                    L_0x03af:
                        m3.B r15 = r6.f23752c     // Catch:{ all -> 0x0425 }
                        java.util.Map r15 = r15.k()     // Catch:{ all -> 0x0425 }
                        java.lang.Object r15 = r15.get(r7)     // Catch:{ all -> 0x0425 }
                        m3.Z r15 = (m3.Z) r15     // Catch:{ all -> 0x0425 }
                        r5.e(r3)
                        r5 = r1
                        r6 = r4
                        r4 = r7
                        r1 = r9
                    L_0x03c4:
                        r14.f24328a = r10
                        r14.f24329b = r1
                        r14.f24330c = r8
                        r14.f24331d = r4
                        r14.f24332e = r3
                        r14.f24333f = r3
                        r14.f24334g = r3
                        r14.f24335h = r3
                        r7 = 10
                        r14.f24338k = r7
                        java.lang.Object r15 = r5.A(r6, r15, r14)
                        if (r15 != r0) goto L_0x03df
                        return r0
                    L_0x03df:
                        r6 = r1
                        r1 = r4
                        r5 = r8
                        r7 = r10
                    L_0x03e3:
                        m3.t r15 = m3.C2220t.REFRESH
                        if (r1 != r15) goto L_0x041c
                        m3.B$a r4 = r6.f24251k
                        dh.a r1 = r4.f23751b
                        r14.f24328a = r7
                        r14.f24329b = r6
                        r14.f24330c = r5
                        r14.f24331d = r4
                        r14.f24332e = r1
                        r15 = 11
                        r14.f24338k = r15
                        java.lang.Object r15 = r1.a(r3, r14)
                        if (r15 != r0) goto L_0x0404
                        return r0
                    L_0x0404:
                        m3.B r15 = r4.f23752c     // Catch:{ all -> 0x0420 }
                        m3.w r15 = r15.p()     // Catch:{ all -> 0x0420 }
                        m3.t r4 = m3.C2220t.REFRESH     // Catch:{ all -> 0x0420 }
                        m3.r r15 = r15.a(r4)     // Catch:{ all -> 0x0420 }
                        r1.e(r3)
                        boolean r15 = r15 instanceof m3.r.a
                        if (r15 != 0) goto L_0x041c
                        r6.D(r5)
                    L_0x041c:
                        r4 = r5
                        r15 = r6
                        r1 = r7
                        goto L_0x042a
                    L_0x0420:
                        r14 = move-exception
                        r1.e(r3)
                        throw r14
                    L_0x0425:
                        r14 = move-exception
                        r5.e(r3)
                        throw r14
                    L_0x042a:
                        m3.t r5 = m3.C2220t.APPEND
                        m3.r r1 = r1.d()
                        boolean r1 = r1 instanceof m3.r.a
                        if (r1 == 0) goto L_0x052b
                        m3.t r1 = m3.C2220t.REFRESH
                        if (r5 == r1) goto L_0x0481
                        m3.B$a r1 = r15.f24251k
                        dh.a r6 = r1.f23751b
                        r14.f24328a = r15
                        r14.f24329b = r4
                        r14.f24330c = r5
                        r14.f24331d = r1
                        r14.f24332e = r6
                        r7 = 12
                        r14.f24338k = r7
                        java.lang.Object r7 = r6.a(r3, r14)
                        if (r7 != r0) goto L_0x0455
                        return r0
                    L_0x0455:
                        r11 = r4
                        r4 = r1
                        r1 = r6
                        r6 = r11
                    L_0x0459:
                        m3.B r4 = r4.f23752c     // Catch:{ all -> 0x008c }
                        r14.f24328a = r15     // Catch:{ all -> 0x008c }
                        r14.f24329b = r6     // Catch:{ all -> 0x008c }
                        r14.f24330c = r5     // Catch:{ all -> 0x008c }
                        r14.f24331d = r1     // Catch:{ all -> 0x008c }
                        r14.f24332e = r3     // Catch:{ all -> 0x008c }
                        r7 = 13
                        r14.f24338k = r7     // Catch:{ all -> 0x008c }
                        java.lang.Object r4 = r15.C(r4, r5, r14)     // Catch:{ all -> 0x008c }
                        if (r4 != r0) goto L_0x0472
                        return r0
                    L_0x0472:
                        r4 = r5
                        r5 = r6
                        r6 = r15
                    L_0x0475:
                        lf.M r15 = lf.C6514M.f71813a     // Catch:{ all -> 0x008c }
                        r1.e(r3)
                        r7 = r5
                        r1 = r6
                        goto L_0x0484
                    L_0x047d:
                        r1.e(r3)
                        throw r14
                    L_0x0481:
                        r1 = r15
                        r7 = r4
                        r4 = r5
                    L_0x0484:
                        int[] r15 = m3.C2226z.i.c.a.C0411a.f24327a
                        int r5 = r4.ordinal()
                        r15 = r15[r5]
                        if (r15 != r2) goto L_0x0492
                        r2 = r1
                        r15 = r3
                        r5 = r4
                        goto L_0x04cc
                    L_0x0492:
                        m3.B$a r5 = r1.f24251k
                        dh.a r15 = r5.f23751b
                        r14.f24328a = r1
                        r14.f24329b = r7
                        r14.f24330c = r4
                        r14.f24331d = r5
                        r14.f24332e = r15
                        r14.f24333f = r4
                        r14.f24334g = r1
                        r2 = 14
                        r14.f24338k = r2
                        java.lang.Object r2 = r15.a(r3, r14)
                        if (r2 != r0) goto L_0x04b3
                        return r0
                    L_0x04b3:
                        r8 = r1
                        r2 = r4
                        r6 = r2
                        r4 = r15
                    L_0x04b7:
                        m3.B r15 = r5.f23752c     // Catch:{ all -> 0x0526 }
                        java.util.Map r15 = r15.k()     // Catch:{ all -> 0x0526 }
                        java.lang.Object r15 = r15.get(r6)     // Catch:{ all -> 0x0526 }
                        m3.Z r15 = (m3.Z) r15     // Catch:{ all -> 0x0526 }
                        r4.e(r3)
                        r5 = r2
                        r4 = r6
                        r2 = r1
                        r1 = r8
                    L_0x04cc:
                        r14.f24328a = r1
                        r14.f24329b = r7
                        r14.f24330c = r4
                        r14.f24331d = r3
                        r14.f24332e = r3
                        r14.f24333f = r3
                        r14.f24334g = r3
                        r6 = 15
                        r14.f24338k = r6
                        java.lang.Object r15 = r2.A(r5, r15, r14)
                        if (r15 != r0) goto L_0x04e5
                        return r0
                    L_0x04e5:
                        r2 = r7
                    L_0x04e6:
                        m3.t r15 = m3.C2220t.REFRESH
                        if (r4 != r15) goto L_0x052b
                        m3.B$a r15 = r1.f24251k
                        dh.a r4 = r15.f23751b
                        r14.f24328a = r1
                        r14.f24329b = r2
                        r14.f24330c = r15
                        r14.f24331d = r4
                        r5 = 16
                        r14.f24338k = r5
                        java.lang.Object r14 = r4.a(r3, r14)
                        if (r14 != r0) goto L_0x0505
                        return r0
                    L_0x0505:
                        r14 = r1
                        r0 = r4
                        r1 = r15
                    L_0x0508:
                        m3.B r15 = r1.f23752c     // Catch:{ all -> 0x0521 }
                        m3.w r15 = r15.p()     // Catch:{ all -> 0x0521 }
                        m3.t r1 = m3.C2220t.REFRESH     // Catch:{ all -> 0x0521 }
                        m3.r r15 = r15.a(r1)     // Catch:{ all -> 0x0521 }
                        r0.e(r3)
                        boolean r15 = r15 instanceof m3.r.a
                        if (r15 != 0) goto L_0x052b
                        r14.D(r2)
                        goto L_0x052b
                    L_0x0521:
                        r14 = move-exception
                        r0.e(r3)
                        throw r14
                    L_0x0526:
                        r14 = move-exception
                        r4.e(r3)
                        throw r14
                    L_0x052b:
                        lf.M r14 = lf.C6514M.f71813a
                        return r14
                    L_0x052e:
                        r14 = move-exception
                        r1.e(r3)
                        throw r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: m3.C2226z.i.c.a.emit(lf.M, qf.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(Wg.d dVar, C2226z zVar, C6658d dVar2) {
                super(2, dVar2);
                this.f24323c = dVar;
                this.f24324d = zVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                c cVar = new c(this.f24323c, this.f24324d, dVar);
                cVar.f24322b = obj;
                return cVar;
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f24321a;
                if (i10 == 0) {
                    w.b(obj);
                    C5694f k10 = C5696h.k(this.f24323c);
                    a aVar = new a(this.f24324d, (K) this.f24322b);
                    this.f24321a = 1;
                    if (k10.collect(aVar, this) == f10) {
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
        i(C2226z zVar, C6658d dVar) {
            super(2, dVar);
            this.f24309f = zVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            i iVar = new i(this.f24309f, dVar);
            iVar.f24308e = obj;
            return iVar;
        }

        /* renamed from: i */
        public final Object invoke(T t10, C6658d dVar) {
            return ((i) create(t10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00dc A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00f5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x010d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r14.f24307d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0049
                if (r1 == r4) goto L_0x0035
                if (r1 == r3) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                java.lang.Object r0 = r14.f24305b
                dh.a r0 = (dh.C5817a) r0
                java.lang.Object r1 = r14.f24304a
                m3.B$a r1 = (m3.C2197B.a) r1
                java.lang.Object r2 = r14.f24308e
                m3.T r2 = (m3.T) r2
                lf.w.b(r15)
                goto L_0x00f8
            L_0x0023:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x002b:
                java.lang.Object r1 = r14.f24308e
                m3.T r1 = (m3.T) r1
                lf.w.b(r15)
                r15 = r1
                goto L_0x00dd
            L_0x0035:
                java.lang.Object r1 = r14.f24306c
                dh.a r1 = (dh.C5817a) r1
                java.lang.Object r4 = r14.f24305b
                m3.B$a r4 = (m3.C2197B.a) r4
                java.lang.Object r6 = r14.f24304a
                m3.Q r6 = (m3.Q) r6
                java.lang.Object r7 = r14.f24308e
                m3.T r7 = (m3.T) r7
                lf.w.b(r15)
                goto L_0x00b3
            L_0x0049:
                lf.w.b(r15)
                java.lang.Object r15 = r14.f24308e
                m3.T r15 = (m3.T) r15
                m3.z r1 = r14.f24309f
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.f24249i
                r12 = 0
                boolean r1 = r1.compareAndSet(r12, r4)
                if (r1 == 0) goto L_0x011a
                m3.z$i$a r9 = new m3.z$i$a
                m3.z r1 = r14.f24309f
                r9.<init>(r1, r15, r5)
                r10 = 3
                r11 = 0
                r7 = 0
                r8 = 0
                r6 = r15
                Ug.C5600w0 unused = Ug.C5576k.d(r6, r7, r8, r9, r10, r11)
                r1 = 6
                Wg.d r1 = Wg.g.b(r12, r5, r5, r1, r5)
                m3.z$i$b r9 = new m3.z$i$b
                m3.z r6 = r14.f24309f
                r9.<init>(r6, r1, r5)
                r6 = r15
                Ug.C5600w0 unused = Ug.C5576k.d(r6, r7, r8, r9, r10, r11)
                m3.z$i$c r9 = new m3.z$i$c
                m3.z r6 = r14.f24309f
                r9.<init>(r1, r6, r5)
                r6 = r15
                Ug.C5600w0 unused = Ug.C5576k.d(r6, r7, r8, r9, r10, r11)
                m3.z r1 = r14.f24309f
                m3.Q r6 = r1.w()
                if (r6 == 0) goto L_0x00ca
                m3.z r1 = r14.f24309f
                m3.M r7 = r1.f24246f
                if (r7 != 0) goto L_0x00c7
                m3.B$a r1 = r1.f24251k
                dh.a r7 = r1.f23751b
                r14.f24308e = r15
                r14.f24304a = r6
                r14.f24305b = r1
                r14.f24306c = r7
                r14.f24307d = r4
                java.lang.Object r4 = r7.a(r5, r14)
                if (r4 != r0) goto L_0x00b0
                return r0
            L_0x00b0:
                r4 = r1
                r1 = r7
                r7 = r15
            L_0x00b3:
                m3.B r15 = r4.f23752c     // Catch:{ all -> 0x00c2 }
                m3.M r15 = r15.g(r5)     // Catch:{ all -> 0x00c2 }
                r1.e(r5)
                r13 = r7
                r7 = r15
                r15 = r13
                goto L_0x00c7
            L_0x00c2:
                r15 = move-exception
                r1.e(r5)
                throw r15
            L_0x00c7:
                r6.d(r7)
            L_0x00ca:
                m3.z r1 = r14.f24309f
                r14.f24308e = r15
                r14.f24304a = r5
                r14.f24305b = r5
                r14.f24306c = r5
                r14.f24307d = r3
                java.lang.Object r1 = r1.s(r14)
                if (r1 != r0) goto L_0x00dd
                return r0
            L_0x00dd:
                m3.z r1 = r14.f24309f
                m3.B$a r1 = r1.f24251k
                dh.a r3 = r1.f23751b
                r14.f24308e = r15
                r14.f24304a = r1
                r14.f24305b = r3
                r14.f24307d = r2
                java.lang.Object r2 = r3.a(r5, r14)
                if (r2 != r0) goto L_0x00f6
                return r0
            L_0x00f6:
                r2 = r15
                r0 = r3
            L_0x00f8:
                m3.B r15 = r1.f23752c     // Catch:{ all -> 0x0115 }
                m3.w r15 = r15.p()     // Catch:{ all -> 0x0115 }
                m3.t r1 = m3.C2220t.REFRESH     // Catch:{ all -> 0x0115 }
                m3.r r15 = r15.a(r1)     // Catch:{ all -> 0x0115 }
                r0.e(r5)
                boolean r15 = r15 instanceof m3.r.a
                if (r15 != 0) goto L_0x0112
                m3.z r15 = r14.f24309f
                r15.D(r2)
            L_0x0112:
                lf.M r15 = lf.C6514M.f71813a
                return r15
            L_0x0115:
                r15 = move-exception
                r0.e(r5)
                throw r15
            L_0x011a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"
                r15.<init>(r0)
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2226z.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: m3.z$j */
    static final class j extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f24339a;

        /* renamed from: b  reason: collision with root package name */
        Object f24340b;

        /* renamed from: c  reason: collision with root package name */
        int f24341c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f24342d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2226z f24343e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C2226z zVar, C6658d dVar) {
            super(2, dVar);
            this.f24343e = zVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            j jVar = new j(this.f24343e, dVar);
            jVar.f24342d = obj;
            return jVar;
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((j) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX INFO: finally extract failed */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: Xg.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r6.f24341c
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L_0x002b
                if (r1 == r2) goto L_0x001b
                if (r1 != r3) goto L_0x0013
                lf.w.b(r7)
                goto L_0x0070
            L_0x0013:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001b:
                java.lang.Object r1 = r6.f24340b
                Xg.g r1 = (Xg.C5695g) r1
                java.lang.Object r2 = r6.f24339a
                dh.a r2 = (dh.C5817a) r2
                java.lang.Object r5 = r6.f24342d
                m3.B$a r5 = (m3.C2197B.a) r5
                lf.w.b(r7)
                goto L_0x004d
            L_0x002b:
                lf.w.b(r7)
                java.lang.Object r7 = r6.f24342d
                r1 = r7
                Xg.g r1 = (Xg.C5695g) r1
                m3.z r7 = r6.f24343e
                m3.B$a r5 = r7.f24251k
                dh.a r7 = r5.f23751b
                r6.f24342d = r5
                r6.f24339a = r7
                r6.f24340b = r1
                r6.f24341c = r2
                java.lang.Object r2 = r7.a(r4, r6)
                if (r2 != r0) goto L_0x004c
                return r0
            L_0x004c:
                r2 = r7
            L_0x004d:
                m3.B r7 = r5.f23752c     // Catch:{ all -> 0x0073 }
                m3.w r7 = r7.p()     // Catch:{ all -> 0x0073 }
                m3.s r7 = r7.d()     // Catch:{ all -> 0x0073 }
                r2.e(r4)
                m3.x$c r2 = new m3.x$c
                r2.<init>(r7, r4, r3, r4)
                r6.f24342d = r4
                r6.f24339a = r4
                r6.f24340b = r4
                r6.f24341c = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L_0x0070
                return r0
            L_0x0070:
                lf.M r7 = lf.C6514M.f71813a
                return r7
            L_0x0073:
                r7 = move-exception
                r2.e(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2226z.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: m3.z$k */
    static final class k extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f24344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2226z f24345b;

        /* renamed from: m3.z$k$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f24346a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f24347b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C2226z f24348c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2226z zVar, C6658d dVar) {
                super(2, dVar);
                this.f24348c = zVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f24348c, dVar);
                aVar.f24347b = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(Z z10, C6658d dVar) {
                return ((a) create(z10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                boolean z10;
                C6680b.f();
                if (this.f24346a == 0) {
                    w.b(obj);
                    Z z11 = (Z) this.f24347b;
                    if (z11.d() * -1 > this.f24348c.f24243c.f23774f || z11.c() * -1 > this.f24348c.f24243c.f23774f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C2226z zVar, C6658d dVar) {
            super(2, dVar);
            this.f24345b = zVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new k(this.f24345b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((k) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f24344a;
            if (i10 == 0) {
                w.b(obj);
                C5694f E10 = C5696h.E(this.f24345b.f24248h.c(C2220t.APPEND), this.f24345b.f24248h.c(C2220t.PREPEND));
                a aVar = new a(this.f24345b, (C6658d) null);
                this.f24344a = 1;
                obj = C5696h.w(E10, aVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z z10 = (Z) obj;
            if (z10 != null) {
                C2226z zVar = this.f24345b;
                K k10 = K.f23844a;
                if (k10.a(3)) {
                    k10.b(3, "Jump triggered on PagingSource " + zVar.v() + " by " + z10, (Throwable) null);
                }
                this.f24345b.f24247g.invoke();
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: m3.z$l */
    static final class l extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f24349a;

        /* renamed from: b  reason: collision with root package name */
        Object f24350b;

        /* renamed from: c  reason: collision with root package name */
        Object f24351c;

        /* renamed from: d  reason: collision with root package name */
        int f24352d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2226z f24353e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C2226z zVar, C6658d dVar) {
            super(2, dVar);
            this.f24353e = zVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new l(this.f24353e, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((l) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX INFO: finally extract failed */
        public final Object invokeSuspend(Object obj) {
            C2197B.a aVar;
            C5817a aVar2;
            C2226z zVar;
            Object f10 = C6680b.f();
            int i10 = this.f24352d;
            if (i10 == 0) {
                w.b(obj);
                zVar = this.f24353e;
                aVar = zVar.f24251k;
                C5817a a10 = aVar.f23751b;
                this.f24349a = aVar;
                this.f24350b = a10;
                this.f24351c = zVar;
                this.f24352d = 1;
                if (a10.a((Object) null, this) == f10) {
                    return f10;
                }
                aVar2 = a10;
            } else if (i10 == 1) {
                zVar = (C2226z) this.f24351c;
                aVar2 = (C5817a) this.f24350b;
                aVar = (C2197B.a) this.f24349a;
                w.b(obj);
            } else if (i10 == 2) {
                w.b(obj);
                return C6514M.f71813a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C5694f f11 = aVar.f23752c.f();
                aVar2.e((Object) null);
                C2220t tVar = C2220t.PREPEND;
                this.f24349a = null;
                this.f24350b = null;
                this.f24351c = null;
                this.f24352d = 2;
                if (zVar.q(f11, tVar, this) == f10) {
                    return f10;
                }
                return C6514M.f71813a;
            } catch (Throwable th2) {
                aVar2.e((Object) null);
                throw th2;
            }
        }
    }

    /* renamed from: m3.z$m */
    static final class m extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f24354a;

        /* renamed from: b  reason: collision with root package name */
        Object f24355b;

        /* renamed from: c  reason: collision with root package name */
        Object f24356c;

        /* renamed from: d  reason: collision with root package name */
        int f24357d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2226z f24358e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C2226z zVar, C6658d dVar) {
            super(2, dVar);
            this.f24358e = zVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new m(this.f24358e, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((m) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX INFO: finally extract failed */
        public final Object invokeSuspend(Object obj) {
            C2197B.a aVar;
            C5817a aVar2;
            C2226z zVar;
            Object f10 = C6680b.f();
            int i10 = this.f24357d;
            if (i10 == 0) {
                w.b(obj);
                zVar = this.f24358e;
                aVar = zVar.f24251k;
                C5817a a10 = aVar.f23751b;
                this.f24354a = aVar;
                this.f24355b = a10;
                this.f24356c = zVar;
                this.f24357d = 1;
                if (a10.a((Object) null, this) == f10) {
                    return f10;
                }
                aVar2 = a10;
            } else if (i10 == 1) {
                zVar = (C2226z) this.f24356c;
                aVar2 = (C5817a) this.f24355b;
                aVar = (C2197B.a) this.f24354a;
                w.b(obj);
            } else if (i10 == 2) {
                w.b(obj);
                return C6514M.f71813a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C5694f e10 = aVar.f23752c.e();
                aVar2.e((Object) null);
                C2220t tVar = C2220t.APPEND;
                this.f24354a = null;
                this.f24355b = null;
                this.f24356c = null;
                this.f24357d = 2;
                if (zVar.q(e10, tVar, this) == f10) {
                    return f10;
                }
                return C6514M.f71813a;
            } catch (Throwable th2) {
                aVar2.e((Object) null);
                throw th2;
            }
        }
    }

    public C2226z(Object obj, L l10, C2200E e10, C5694f fVar, Q q10, M m10, C6787a aVar) {
        C6496s.h(l10, "pagingSource");
        C6496s.h(e10, "config");
        C6496s.h(fVar, "retryFlow");
        C6496s.h(aVar, "jumpCallback");
        this.f24241a = obj;
        this.f24242b = l10;
        this.f24243c = e10;
        this.f24244d = fVar;
        this.f24246f = m10;
        this.f24247g = aVar;
        if (e10.f23774f == Integer.MIN_VALUE || l10.getJumpingSupported()) {
            this.f24248h = new C2214m();
            this.f24249i = new AtomicBoolean(false);
            this.f24250j = Wg.g.b(-2, (Wg.a) null, (C6798l) null, 6, (Object) null);
            this.f24251k = new C2197B.a(e10);
            C5605z b10 = C0.b((C5600w0) null, 1, (Object) null);
            this.f24252l = b10;
            this.f24253m = C5696h.H(C2205d.a(b10, new i(this, (C6658d) null)), new j(this, (C6658d) null));
            return;
        }
        throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
    }

    /* access modifiers changed from: private */
    public final Object A(C2220t tVar, Z z10, C6658d dVar) {
        if (a.f24254a[tVar.ordinal()] == 1) {
            Object s10 = s(dVar);
            if (s10 == C6680b.f()) {
                return s10;
            }
            return C6514M.f71813a;
        } else if (z10 != null) {
            this.f24248h.a(tVar, z10);
            return C6514M.f71813a;
        } else {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
    }

    private final Object B(C2197B b10, C2220t tVar, r.a aVar, C6658d dVar) {
        if (C6496s.c(b10.p().a(tVar), aVar)) {
            return C6514M.f71813a;
        }
        b10.p().c(tVar, aVar);
        Object k10 = this.f24250j.k(new C2224x.c(b10.p().d(), (C2219s) null), dVar);
        if (k10 == C6680b.f()) {
            return k10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public final Object C(C2197B b10, C2220t tVar, C6658d dVar) {
        r a10 = b10.p().a(tVar);
        r.b bVar = r.b.f24096b;
        if (C6496s.c(a10, bVar)) {
            return C6514M.f71813a;
        }
        b10.p().c(tVar, bVar);
        Object k10 = this.f24250j.k(new C2224x.c(b10.p().d(), (C2219s) null), dVar);
        if (k10 == C6680b.f()) {
            return k10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public final void D(K k10) {
        if (this.f24243c.f23774f != Integer.MIN_VALUE) {
            C5600w0 unused = C5576k.d(k10, (qf.g) null, (M) null, new k(this, (C6658d) null), 3, (Object) null);
        }
        C5600w0 unused2 = C5576k.d(k10, (qf.g) null, (M) null, new l(this, (C6658d) null), 3, (Object) null);
        C5600w0 unused3 = C5576k.d(k10, (qf.g) null, (M) null, new m(this, (C6658d) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object q(C5694f fVar, C2220t tVar, C6658d dVar) {
        Object collect = C5696h.j(C2212k.b(C2212k.d(fVar, new b((C6658d) null, this, tVar)), new c(tVar, (C6658d) null))).collect(new d(this, tVar), dVar);
        if (collect == C6680b.f()) {
            return collect;
        }
        return C6514M.f71813a;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x027a, code lost:
        r1.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x027d, code lost:
        throw r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x027e, code lost:
        r2.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0281, code lost:
        throw r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0284, code lost:
        if ((r15 instanceof m3.L.b.a) == false) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0286, code lost:
        r2 = m3.K.f23844a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x028c, code lost:
        if (r2.a(2) == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x028e, code lost:
        r2.b(2, r6.y(m3.C2220t.REFRESH, r6.f24241a, r15), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0299, code lost:
        r3 = r6.f24251k;
        r2 = r3.f23751b;
        r0.f24281a = r6;
        r0.f24282b = r15;
        r0.f24283c = r3;
        r0.f24284d = r2;
        r0.f24287g = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02af, code lost:
        if (r2.a((java.lang.Object) null, r0) != r1) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02b1, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b2, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r15 = r3.f23752c;
        r3 = new m3.r.a(((m3.L.b.a) r4).a());
        r4 = m3.C2220t.REFRESH;
        r0.f24281a = r2;
        r0.f24282b = null;
        r0.f24283c = null;
        r0.f24284d = null;
        r0.f24287g = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02d4, code lost:
        if (r6.B(r15, r4, r3, r0) != r1) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02d6, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02d7, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r15 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02da, code lost:
        r0.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02df, code lost:
        return lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02e0, code lost:
        r15 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02e1, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e2, code lost:
        r0.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e5, code lost:
        throw r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e8, code lost:
        return lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r15 = r6.f23752c;
        r6 = m3.C2220t.REFRESH;
        r0.f24281a = r7;
        r0.f24282b = r2;
        r0.f24283c = null;
        r0.f24287g = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f8, code lost:
        if (r7.C(r15, r6, r0) != r1) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fa, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fb, code lost:
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fc, code lost:
        r15 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        r2.e((java.lang.Object) null);
        r15 = r6.x(m3.C2220t.REFRESH, r6.f24241a);
        r2 = m3.K.f23844a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010f, code lost:
        if (r2.a(3) == false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
        r2.b(3, "Start REFRESH with loadKey " + r6.f24241a + " on " + r6.f24242b, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0131, code lost:
        r2 = r6.f24242b;
        r0.f24281a = r6;
        r0.f24282b = null;
        r0.f24287g = 3;
        r15 = r2.load(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013d, code lost:
        if (r15 != r1) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0140, code lost:
        r15 = (m3.L.b) r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0144, code lost:
        if ((r15 instanceof m3.L.b.C0385b) == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0146, code lost:
        r2 = r6.f24251k;
        r7 = r2.f23751b;
        r0.f24281a = r6;
        r0.f24282b = r15;
        r0.f24283c = r2;
        r0.f24284d = r7;
        r0.f24287g = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015b, code lost:
        if (r7.a((java.lang.Object) null, r0) != r1) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015e, code lost:
        r8 = r6;
        r6 = r2;
        r2 = r7;
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r15 = r6.f23752c;
        r6 = m3.C2220t.REFRESH;
        r9 = r15.r(0, r6, (m3.L.b.C0385b) r7);
        r10 = r15.p();
        r11 = m3.r.c.f24097b;
        r10.c(r6, r11.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0184, code lost:
        if (((m3.L.b.C0385b) r7).n() != null) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0186, code lost:
        r15.p().c(m3.C2220t.PREPEND, r11.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0194, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019e, code lost:
        if (((m3.L.b.C0385b) r7).k() != null) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a0, code lost:
        r15.p().c(m3.C2220t.APPEND, r11.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ad, code lost:
        r2.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b0, code lost:
        if (r9 == false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b2, code lost:
        r15 = m3.K.f23844a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b8, code lost:
        if (r15.a(3) == false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ba, code lost:
        r15.b(3, r8.y(r6, r8.f24241a, r7), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c3, code lost:
        r3 = r8.f24251k;
        r15 = r3.f23751b;
        r0.f24281a = r8;
        r0.f24282b = r7;
        r0.f24283c = r3;
        r0.f24284d = r15;
        r0.f24287g = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d8, code lost:
        if (r15.a((java.lang.Object) null, r0) != r1) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01da, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01db, code lost:
        r2 = r15;
        r4 = r7;
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r15 = r3.f23752c;
        r3 = r6.f24250j;
        r15 = r15.u((m3.L.b.C0385b) r4, m3.C2220t.REFRESH);
        r0.f24281a = r6;
        r0.f24282b = r4;
        r0.f24283c = r2;
        r0.f24284d = null;
        r0.f24287g = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01fc, code lost:
        if (r3.k(r15, r0) != r1) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01fe, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ff, code lost:
        r3 = r4;
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0201, code lost:
        r15 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0203, code lost:
        r2.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x020b, code lost:
        r15 = m3.K.f23844a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0211, code lost:
        if (r15.a(2) == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0213, code lost:
        r15.b(2, r8.y(r6, r8.f24241a, (m3.L.b) null), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x021c, code lost:
        r3 = r7;
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0220, code lost:
        if (r4.f24245e == null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0222, code lost:
        r15 = (m3.L.b.C0385b) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        if (r15.n() == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x022f, code lost:
        if (r15.k() != null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0231, code lost:
        r2 = r4.f24251k;
        r15 = r2.f23751b;
        r0.f24281a = r4;
        r0.f24282b = r3;
        r0.f24283c = r2;
        r0.f24284d = r15;
        r0.f24287g = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0246, code lost:
        if (r15.a((java.lang.Object) null, r0) != r1) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0248, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0249, code lost:
        r1 = r15;
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r15 = r2.f23752c.g(r0.f24248h.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0259, code lost:
        r1.e((java.lang.Object) null);
        r3 = (m3.L.b.C0385b) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0262, code lost:
        if (r3.n() != null) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0264, code lost:
        r0.f24245e.c(m3.C2220t.PREPEND, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x026f, code lost:
        if (r3.k() != null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0271, code lost:
        r0.f24245e.c(m3.C2220t.APPEND, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0279, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(qf.C6658d r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof m3.C2226z.g
            if (r0 == 0) goto L_0x0013
            r0 = r15
            m3.z$g r0 = (m3.C2226z.g) r0
            int r1 = r0.f24287g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24287g = r1
            goto L_0x0018
        L_0x0013:
            m3.z$g r0 = new m3.z$g
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f24285e
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f24287g
            r3 = 3
            r4 = 2
            r5 = 0
            switch(r2) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00bb;
                case 2: goto L_0x00ac;
                case 3: goto L_0x00a2;
                case 4: goto L_0x008d;
                case 5: goto L_0x0078;
                case 6: goto L_0x0064;
                case 7: goto L_0x004f;
                case 8: goto L_0x003a;
                case 9: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x002e:
            java.lang.Object r0 = r0.f24281a
            dh.a r0 = (dh.C5817a) r0
            lf.w.b(r15)     // Catch:{ all -> 0x0037 }
            goto L_0x02d8
        L_0x0037:
            r15 = move-exception
            goto L_0x02e2
        L_0x003a:
            java.lang.Object r2 = r0.f24284d
            dh.a r2 = (dh.C5817a) r2
            java.lang.Object r3 = r0.f24283c
            m3.B$a r3 = (m3.C2197B.a) r3
            java.lang.Object r4 = r0.f24282b
            m3.L$b r4 = (m3.L.b) r4
            java.lang.Object r6 = r0.f24281a
            m3.z r6 = (m3.C2226z) r6
            lf.w.b(r15)
            goto L_0x02b3
        L_0x004f:
            java.lang.Object r1 = r0.f24284d
            dh.a r1 = (dh.C5817a) r1
            java.lang.Object r2 = r0.f24283c
            m3.B$a r2 = (m3.C2197B.a) r2
            java.lang.Object r3 = r0.f24282b
            m3.L$b r3 = (m3.L.b) r3
            java.lang.Object r0 = r0.f24281a
            m3.z r0 = (m3.C2226z) r0
            lf.w.b(r15)
            goto L_0x024b
        L_0x0064:
            java.lang.Object r2 = r0.f24283c
            dh.a r2 = (dh.C5817a) r2
            java.lang.Object r3 = r0.f24282b
            m3.L$b r3 = (m3.L.b) r3
            java.lang.Object r4 = r0.f24281a
            m3.z r4 = (m3.C2226z) r4
            lf.w.b(r15)     // Catch:{ all -> 0x0075 }
            goto L_0x0201
        L_0x0075:
            r15 = move-exception
            goto L_0x0207
        L_0x0078:
            java.lang.Object r2 = r0.f24284d
            dh.a r2 = (dh.C5817a) r2
            java.lang.Object r3 = r0.f24283c
            m3.B$a r3 = (m3.C2197B.a) r3
            java.lang.Object r4 = r0.f24282b
            m3.L$b r4 = (m3.L.b) r4
            java.lang.Object r6 = r0.f24281a
            m3.z r6 = (m3.C2226z) r6
            lf.w.b(r15)
            goto L_0x01de
        L_0x008d:
            java.lang.Object r2 = r0.f24284d
            dh.a r2 = (dh.C5817a) r2
            java.lang.Object r6 = r0.f24283c
            m3.B$a r6 = (m3.C2197B.a) r6
            java.lang.Object r7 = r0.f24282b
            m3.L$b r7 = (m3.L.b) r7
            java.lang.Object r8 = r0.f24281a
            m3.z r8 = (m3.C2226z) r8
            lf.w.b(r15)
            goto L_0x0162
        L_0x00a2:
            java.lang.Object r2 = r0.f24281a
            m3.z r2 = (m3.C2226z) r2
            lf.w.b(r15)
            r6 = r2
            goto L_0x0140
        L_0x00ac:
            java.lang.Object r2 = r0.f24282b
            dh.a r2 = (dh.C5817a) r2
            java.lang.Object r6 = r0.f24281a
            m3.z r6 = (m3.C2226z) r6
            lf.w.b(r15)     // Catch:{ all -> 0x00b8 }
            goto L_0x00fc
        L_0x00b8:
            r15 = move-exception
            goto L_0x02e9
        L_0x00bb:
            java.lang.Object r2 = r0.f24283c
            dh.a r2 = (dh.C5817a) r2
            java.lang.Object r6 = r0.f24282b
            m3.B$a r6 = (m3.C2197B.a) r6
            java.lang.Object r7 = r0.f24281a
            m3.z r7 = (m3.C2226z) r7
            lf.w.b(r15)
            goto L_0x00e6
        L_0x00cb:
            lf.w.b(r15)
            m3.B$a r6 = r14.f24251k
            dh.a r15 = r6.f23751b
            r0.f24281a = r14
            r0.f24282b = r6
            r0.f24283c = r15
            r2 = 1
            r0.f24287g = r2
            java.lang.Object r2 = r15.a(r5, r0)
            if (r2 != r1) goto L_0x00e4
            return r1
        L_0x00e4:
            r7 = r14
            r2 = r15
        L_0x00e6:
            m3.B r15 = r6.f23752c     // Catch:{ all -> 0x00b8 }
            m3.t r6 = m3.C2220t.REFRESH     // Catch:{ all -> 0x00b8 }
            r0.f24281a = r7     // Catch:{ all -> 0x00b8 }
            r0.f24282b = r2     // Catch:{ all -> 0x00b8 }
            r0.f24283c = r5     // Catch:{ all -> 0x00b8 }
            r0.f24287g = r4     // Catch:{ all -> 0x00b8 }
            java.lang.Object r15 = r7.C(r15, r6, r0)     // Catch:{ all -> 0x00b8 }
            if (r15 != r1) goto L_0x00fb
            return r1
        L_0x00fb:
            r6 = r7
        L_0x00fc:
            lf.M r15 = lf.C6514M.f71813a     // Catch:{ all -> 0x00b8 }
            r2.e(r5)
            m3.t r15 = m3.C2220t.REFRESH
            java.lang.Object r2 = r6.f24241a
            m3.L$a r15 = r6.x(r15, r2)
            m3.K r2 = m3.K.f23844a
            boolean r7 = r2.a(r3)
            if (r7 == 0) goto L_0x0131
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Start REFRESH with loadKey "
            r7.append(r8)
            java.lang.Object r8 = r6.f24241a
            r7.append(r8)
            java.lang.String r8 = " on "
            r7.append(r8)
            m3.L r8 = r6.f24242b
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.b(r3, r7, r5)
        L_0x0131:
            m3.L r2 = r6.f24242b
            r0.f24281a = r6
            r0.f24282b = r5
            r0.f24287g = r3
            java.lang.Object r15 = r2.load(r15, r0)
            if (r15 != r1) goto L_0x0140
            return r1
        L_0x0140:
            m3.L$b r15 = (m3.L.b) r15
            boolean r2 = r15 instanceof m3.L.b.C0385b
            if (r2 == 0) goto L_0x0282
            m3.B$a r2 = r6.f24251k
            dh.a r7 = r2.f23751b
            r0.f24281a = r6
            r0.f24282b = r15
            r0.f24283c = r2
            r0.f24284d = r7
            r8 = 4
            r0.f24287g = r8
            java.lang.Object r8 = r7.a(r5, r0)
            if (r8 != r1) goto L_0x015e
            return r1
        L_0x015e:
            r8 = r6
            r6 = r2
            r2 = r7
            r7 = r15
        L_0x0162:
            m3.B r15 = r6.f23752c     // Catch:{ all -> 0x0194 }
            m3.t r6 = m3.C2220t.REFRESH     // Catch:{ all -> 0x0194 }
            r9 = r7
            m3.L$b$b r9 = (m3.L.b.C0385b) r9     // Catch:{ all -> 0x0194 }
            r10 = 0
            boolean r9 = r15.r(r10, r6, r9)     // Catch:{ all -> 0x0194 }
            m3.w r10 = r15.p()     // Catch:{ all -> 0x0194 }
            m3.r$c$a r11 = m3.r.c.f24097b     // Catch:{ all -> 0x0194 }
            m3.r$c r12 = r11.b()     // Catch:{ all -> 0x0194 }
            r10.c(r6, r12)     // Catch:{ all -> 0x0194 }
            r10 = r7
            m3.L$b$b r10 = (m3.L.b.C0385b) r10     // Catch:{ all -> 0x0194 }
            java.lang.Object r10 = r10.n()     // Catch:{ all -> 0x0194 }
            if (r10 != 0) goto L_0x0197
            m3.w r10 = r15.p()     // Catch:{ all -> 0x0194 }
            m3.t r12 = m3.C2220t.PREPEND     // Catch:{ all -> 0x0194 }
            m3.r$c r13 = r11.a()     // Catch:{ all -> 0x0194 }
            r10.c(r12, r13)     // Catch:{ all -> 0x0194 }
            goto L_0x0197
        L_0x0194:
            r15 = move-exception
            goto L_0x027e
        L_0x0197:
            r10 = r7
            m3.L$b$b r10 = (m3.L.b.C0385b) r10     // Catch:{ all -> 0x0194 }
            java.lang.Object r10 = r10.k()     // Catch:{ all -> 0x0194 }
            if (r10 != 0) goto L_0x01ad
            m3.w r15 = r15.p()     // Catch:{ all -> 0x0194 }
            m3.t r10 = m3.C2220t.APPEND     // Catch:{ all -> 0x0194 }
            m3.r$c r11 = r11.a()     // Catch:{ all -> 0x0194 }
            r15.c(r10, r11)     // Catch:{ all -> 0x0194 }
        L_0x01ad:
            r2.e(r5)
            if (r9 == 0) goto L_0x020b
            m3.K r15 = m3.K.f23844a
            boolean r2 = r15.a(r3)
            if (r2 == 0) goto L_0x01c3
            java.lang.Object r2 = r8.f24241a
            java.lang.String r2 = r8.y(r6, r2, r7)
            r15.b(r3, r2, r5)
        L_0x01c3:
            m3.B$a r3 = r8.f24251k
            dh.a r15 = r3.f23751b
            r0.f24281a = r8
            r0.f24282b = r7
            r0.f24283c = r3
            r0.f24284d = r15
            r2 = 5
            r0.f24287g = r2
            java.lang.Object r2 = r15.a(r5, r0)
            if (r2 != r1) goto L_0x01db
            return r1
        L_0x01db:
            r2 = r15
            r4 = r7
            r6 = r8
        L_0x01de:
            m3.B r15 = r3.f23752c     // Catch:{ all -> 0x0075 }
            Wg.d r3 = r6.f24250j     // Catch:{ all -> 0x0075 }
            r7 = r4
            m3.L$b$b r7 = (m3.L.b.C0385b) r7     // Catch:{ all -> 0x0075 }
            m3.t r8 = m3.C2220t.REFRESH     // Catch:{ all -> 0x0075 }
            m3.x r15 = r15.u(r7, r8)     // Catch:{ all -> 0x0075 }
            r0.f24281a = r6     // Catch:{ all -> 0x0075 }
            r0.f24282b = r4     // Catch:{ all -> 0x0075 }
            r0.f24283c = r2     // Catch:{ all -> 0x0075 }
            r0.f24284d = r5     // Catch:{ all -> 0x0075 }
            r7 = 6
            r0.f24287g = r7     // Catch:{ all -> 0x0075 }
            java.lang.Object r15 = r3.k(r15, r0)     // Catch:{ all -> 0x0075 }
            if (r15 != r1) goto L_0x01ff
            return r1
        L_0x01ff:
            r3 = r4
            r4 = r6
        L_0x0201:
            lf.M r15 = lf.C6514M.f71813a     // Catch:{ all -> 0x0075 }
            r2.e(r5)
            goto L_0x021e
        L_0x0207:
            r2.e(r5)
            throw r15
        L_0x020b:
            m3.K r15 = m3.K.f23844a
            boolean r2 = r15.a(r4)
            if (r2 == 0) goto L_0x021c
            java.lang.Object r2 = r8.f24241a
            java.lang.String r2 = r8.y(r6, r2, r5)
            r15.b(r4, r2, r5)
        L_0x021c:
            r3 = r7
            r4 = r8
        L_0x021e:
            m3.Q r15 = r4.f24245e
            if (r15 == 0) goto L_0x02e6
            r15 = r3
            m3.L$b$b r15 = (m3.L.b.C0385b) r15
            java.lang.Object r2 = r15.n()
            if (r2 == 0) goto L_0x0231
            java.lang.Object r15 = r15.k()
            if (r15 != 0) goto L_0x02e6
        L_0x0231:
            m3.B$a r2 = r4.f24251k
            dh.a r15 = r2.f23751b
            r0.f24281a = r4
            r0.f24282b = r3
            r0.f24283c = r2
            r0.f24284d = r15
            r6 = 7
            r0.f24287g = r6
            java.lang.Object r0 = r15.a(r5, r0)
            if (r0 != r1) goto L_0x0249
            return r1
        L_0x0249:
            r1 = r15
            r0 = r4
        L_0x024b:
            m3.B r15 = r2.f23752c     // Catch:{ all -> 0x0279 }
            m3.m r2 = r0.f24248h     // Catch:{ all -> 0x0279 }
            m3.Z$a r2 = r2.b()     // Catch:{ all -> 0x0279 }
            m3.M r15 = r15.g(r2)     // Catch:{ all -> 0x0279 }
            r1.e(r5)
            m3.L$b$b r3 = (m3.L.b.C0385b) r3
            java.lang.Object r1 = r3.n()
            if (r1 != 0) goto L_0x026b
            m3.Q r1 = r0.f24245e
            m3.t r2 = m3.C2220t.PREPEND
            r1.c(r2, r15)
        L_0x026b:
            java.lang.Object r1 = r3.k()
            if (r1 != 0) goto L_0x02e6
            m3.Q r0 = r0.f24245e
            m3.t r1 = m3.C2220t.APPEND
            r0.c(r1, r15)
            goto L_0x02e6
        L_0x0279:
            r15 = move-exception
            r1.e(r5)
            throw r15
        L_0x027e:
            r2.e(r5)
            throw r15
        L_0x0282:
            boolean r2 = r15 instanceof m3.L.b.a
            if (r2 == 0) goto L_0x02e6
            m3.K r2 = m3.K.f23844a
            boolean r3 = r2.a(r4)
            if (r3 == 0) goto L_0x0299
            m3.t r3 = m3.C2220t.REFRESH
            java.lang.Object r7 = r6.f24241a
            java.lang.String r3 = r6.y(r3, r7, r15)
            r2.b(r4, r3, r5)
        L_0x0299:
            m3.B$a r3 = r6.f24251k
            dh.a r2 = r3.f23751b
            r0.f24281a = r6
            r0.f24282b = r15
            r0.f24283c = r3
            r0.f24284d = r2
            r4 = 8
            r0.f24287g = r4
            java.lang.Object r4 = r2.a(r5, r0)
            if (r4 != r1) goto L_0x02b2
            return r1
        L_0x02b2:
            r4 = r15
        L_0x02b3:
            m3.B r15 = r3.f23752c     // Catch:{ all -> 0x02e0 }
            m3.r$a r3 = new m3.r$a     // Catch:{ all -> 0x02e0 }
            m3.L$b$a r4 = (m3.L.b.a) r4     // Catch:{ all -> 0x02e0 }
            java.lang.Throwable r4 = r4.a()     // Catch:{ all -> 0x02e0 }
            r3.<init>(r4)     // Catch:{ all -> 0x02e0 }
            m3.t r4 = m3.C2220t.REFRESH     // Catch:{ all -> 0x02e0 }
            r0.f24281a = r2     // Catch:{ all -> 0x02e0 }
            r0.f24282b = r5     // Catch:{ all -> 0x02e0 }
            r0.f24283c = r5     // Catch:{ all -> 0x02e0 }
            r0.f24284d = r5     // Catch:{ all -> 0x02e0 }
            r7 = 9
            r0.f24287g = r7     // Catch:{ all -> 0x02e0 }
            java.lang.Object r15 = r6.B(r15, r4, r3, r0)     // Catch:{ all -> 0x02e0 }
            if (r15 != r1) goto L_0x02d7
            return r1
        L_0x02d7:
            r0 = r2
        L_0x02d8:
            lf.M r15 = lf.C6514M.f71813a     // Catch:{ all -> 0x0037 }
            r0.e(r5)
            lf.M r15 = lf.C6514M.f71813a
            return r15
        L_0x02e0:
            r15 = move-exception
            r0 = r2
        L_0x02e2:
            r0.e(r5)
            throw r15
        L_0x02e6:
            lf.M r15 = lf.C6514M.f71813a
            return r15
        L_0x02e9:
            r2.e(r5)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C2226z.s(qf.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: m3.L$b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v56, resolved type: dh.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v95, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v57, resolved type: dh.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v63, resolved type: m3.B$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v65, resolved type: dh.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v66, resolved type: dh.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v69, resolved type: dh.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v70, resolved type: dh.a} */
    /* JADX WARNING: type inference failed for: r3v17, types: [java.lang.Throwable, m3.L$b, java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03cc, code lost:
        if (r2 != 3) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03ce, code lost:
        r2 = ((m3.L.b.C0385b) r6).k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03db, code lost:
        throw new java.lang.IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03dc, code lost:
        r2 = ((m3.L.b.C0385b) r6).n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03e9, code lost:
        if (r9.f24242b.getKeyReuseSupported() != false) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03f1, code lost:
        if (kotlin.jvm.internal.C6496s.c(r2, r10.f71759a) != false) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03f6, code lost:
        if (r13 != m3.C2220t.PREPEND) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03f8, code lost:
        r0 = "prevKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03fb, code lost:
        r0 = "nextKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x042c, code lost:
        throw new java.lang.IllegalStateException(Sg.p.h("The same value, " + r10.f71759a + ", was passed as the " + r0 + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ", (java.lang.String) null, 1, (java.lang.Object) null).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x042d, code lost:
        r3 = r9.f24251k;
        r2 = r3.f23751b;
        r4.f24288a = r9;
        r4.f24289b = r13;
        r4.f24290c = r12;
        r4.f24291d = r11;
        r4.f24292e = r10;
        r4.f24293f = r0;
        r4.f24294g = r8;
        r4.f24295h = r6;
        r4.f24296i = r3;
        r4.f24297j = r2;
        r4.f24303p = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x044f, code lost:
        if (r2.a((java.lang.Object) null, r4) != r5) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0451, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0452, code lost:
        r14 = r9;
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0467, code lost:
        if (r3.f23752c.r(r12.a(), r13, (m3.L.b.C0385b) r6) != false) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0469, code lost:
        r0 = m3.K.f23844a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0470, code lost:
        if (r0.a(2) == false) goto L_0x06dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0472, code lost:
        r0.b(2, r14.y(r13, r10.f71759a, r3), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x047d, code lost:
        r0 = m3.K.f23844a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0484, code lost:
        if (r0.a(3) == false) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0486, code lost:
        r0.b(3, r14.y(r13, r10.f71759a, r6), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x048f, code lost:
        r2 = (m3.L.b.C0385b) r6;
        r11.f71757a += r2.a().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x04a1, code lost:
        if (r13 != m3.C2220t.PREPEND) goto L_0x04ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x04a7, code lost:
        if (r2.n() == null) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x04ae, code lost:
        if (r13 != m3.C2220t.APPEND) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04b4, code lost:
        if (r2.k() != null) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x04b7, code lost:
        r9.f71755a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04bb, code lost:
        r0 = r9;
        r9 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x04bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04c0, code lost:
        r2.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04c4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04ca, code lost:
        if ((r6 instanceof m3.L.b.a) == false) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04cc, code lost:
        r0 = m3.K.f23844a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04d3, code lost:
        if (r0.a(2) == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04d5, code lost:
        r0.b(2, r9.y(r13, r10.f71759a, r6), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04de, code lost:
        r3 = r9.f24251k;
        r0 = r3.f23751b;
        r4.f24288a = r9;
        r4.f24289b = r13;
        r4.f24290c = r12;
        r4.f24291d = r6;
        r4.f24292e = r3;
        r4.f24293f = r0;
        r4.f24294g = null;
        r4.f24303p = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04f9, code lost:
        if (r0.a((java.lang.Object) null, r4) != r5) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04fb, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04fc, code lost:
        r2 = r0;
        r0 = r4;
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r3 = r3.f23752c;
        r7 = new m3.r.a(((m3.L.b.a) r6).a());
        r0.f24288a = r4;
        r0.f24289b = r12;
        r0.f24290c = r2;
        r0.f24291d = r3;
        r0.f24292e = null;
        r0.f24293f = null;
        r0.f24303p = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0522, code lost:
        if (r9.B(r3, r4, r7, r0) != r5) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0524, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0525, code lost:
        r0 = r3;
        r5 = r12;
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
        r0 = th;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r0.k().put(r4, r5.b());
        r0 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0535, code lost:
        r3.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x053b, code lost:
        return lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x053c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x053d, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0540, code lost:
        r3.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0543, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x054d, code lost:
        if (m3.C2226z.a.f24254a[r13.ordinal()] != 2) goto L_0x0552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x054f, code lost:
        r2 = m3.C2220t.APPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0552, code lost:
        r2 = m3.C2220t.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0554, code lost:
        r3 = r9.f24251k;
        r14 = r3.f23751b;
        r4.f24288a = r9;
        r4.f24289b = r13;
        r4.f24290c = r12;
        r4.f24291d = r11;
        r4.f24292e = r10;
        r4.f24293f = r0;
        r4.f24294g = r8;
        r4.f24295h = r6;
        r4.f24296i = r2;
        r4.f24297j = r3;
        r4.f24298k = r14;
        r4.f24303p = 8;
        r19 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x057b, code lost:
        if (r14.a((java.lang.Object) null, r4) != r5) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x057d, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x057e, code lost:
        r0 = r12;
        r15 = r13;
        r12 = r10;
        r13 = r11;
        r11 = r19;
        r10 = r8;
        r8 = r2;
        r16 = r6;
        r6 = r3;
        r3 = r9;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x058c, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r2 = r6.f23752c;
        r6 = r2.i(r8, r0.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0598, code lost:
        if (r6 == null) goto L_0x05d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x059a, code lost:
        r2.h(r6);
        r8 = r3.f24250j;
        r4.f24288a = r3;
        r4.f24289b = r15;
        r4.f24290c = r0;
        r4.f24291d = r13;
        r4.f24292e = r12;
        r4.f24293f = r11;
        r4.f24294g = r10;
        r4.f24295h = r9;
        r4.f24296i = r14;
        r4.f24297j = r2;
        r4.f24298k = null;
        r4.f24303p = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05be, code lost:
        if (r8.k(r6, r4) != r5) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05c0, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x05c1, code lost:
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r6 = r14;
        r14 = r15;
        r13 = r0;
        r0 = r2;
        r15 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x05cb, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r1 = lf.C6514M.f71813a;
        r2 = r0;
        r0 = r13;
        r3 = r15;
        r13 = r12;
        r15 = r14;
        r12 = r11;
        r11 = r10;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x05d5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x05d6, code lost:
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05d9, code lost:
        r8 = r9;
        r9 = r10;
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x05dc, code lost:
        r1 = r3.z(r2, r15, r0.a(), r0.b().e(r15) + r13.f71757a);
        r12.f71759a = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x05f1, code lost:
        if (r1 != null) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x05fd, code lost:
        if ((r2.p().a(r15) instanceof m3.r.a) != false) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05ff, code lost:
        r1 = r2.p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0605, code lost:
        if (r11.f71755a == false) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0607, code lost:
        r10 = m3.r.c.f24097b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x060e, code lost:
        r10 = m3.r.c.f24097b.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0614, code lost:
        r1.c(r15, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0617, code lost:
        r1 = r2.u((m3.L.b.C0385b) r8, r15);
        r2 = r3.f24250j;
        r4.f24288a = r3;
        r4.f24289b = r15;
        r4.f24290c = r0;
        r4.f24291d = r13;
        r4.f24292e = r12;
        r4.f24293f = r11;
        r4.f24294g = r9;
        r4.f24295h = r8;
        r4.f24296i = r6;
        r4.f24297j = null;
        r4.f24298k = null;
        r4.f24303p = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x063f, code lost:
        if (r2.k(r1, r4) != r5) goto L_0x0642;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0641, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0642, code lost:
        r10 = r0;
        r14 = r3;
        r0 = r8;
        r8 = r9;
        r9 = r11;
        r11 = r15;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0648, code lost:
        r1 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x064a, code lost:
        r6.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0650, code lost:
        if ((r8 instanceof m3.L.a.c) == false) goto L_0x065d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0659, code lost:
        if (((m3.L.b.C0385b) r0).n() != null) goto L_0x065d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x065b, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x065d, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0660, code lost:
        if ((r8 instanceof m3.L.a.C0383a) == false) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0668, code lost:
        if (((m3.L.b.C0385b) r0).k() != null) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x066a, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x066c, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x066f, code lost:
        if (r14.f24245e == null) goto L_0x06d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0671, code lost:
        if (r6 != 0) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0673, code lost:
        if (r0 == 0) goto L_0x06d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0675, code lost:
        r1 = r14.f24251k;
        r2 = r1.f23751b;
        r4.f24288a = r14;
        r4.f24289b = r11;
        r4.f24290c = r10;
        r4.f24291d = r13;
        r4.f24292e = r12;
        r4.f24293f = r9;
        r4.f24294g = r1;
        r4.f24295h = r2;
        r4.f24296i = null;
        r4.f24299l = r6;
        r4.f24300m = r0;
        r4.f24303p = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x069a, code lost:
        if (r2.a((java.lang.Object) null, r4) != r5) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x069c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x069d, code lost:
        r8 = r12;
        r12 = r14;
        r14 = r9;
        r9 = r13;
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        r1 = r13.f23752c.g(r12.f24248h.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x06b4, code lost:
        if (r6 == 0) goto L_0x06bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x06b6, code lost:
        r12.f24245e.c(m3.C2220t.PREPEND, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x06bd, code lost:
        if (r0 == 0) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x06bf, code lost:
        r12.f24245e.c(m3.C2220t.APPEND, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x06c6, code lost:
        r1 = r18;
        r0 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x06cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x06cc, code lost:
        r2.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06d0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x06d1, code lost:
        r1 = r18;
        r0 = r9;
        r8 = r12;
        r9 = r13;
        r12 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x06df, code lost:
        return lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x06e0, code lost:
        r6.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06e3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x06e9, code lost:
        throw new java.lang.IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x06ea, code lost:
        r2.e((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x06ed, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r3 = r3.f23752c;
        r9 = m3.C2226z.a.f24254a[r0.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0230, code lost:
        if (r9 == 1) goto L_0x06e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0233, code lost:
        if (r9 == 2) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0236, code lost:
        if (r9 == 3) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x023a, code lost:
        r9 = (r3.l() + r8.b().b()) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0248, code lost:
        if (r9 >= 0) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x024a, code lost:
        r6.f71757a += r10.f24243c.f23769a * (-r9);
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0257, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x025b, code lost:
        r11 = mf.C6565s.p(r3.m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0263, code lost:
        if (r9 > r11) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0265, code lost:
        r6.f71757a += ((m3.L.b.C0385b) r3.m().get(r9)).a().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x027c, code lost:
        if (r9 == r11) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x027e, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0281, code lost:
        r9 = (r3.l() + r8.b().a()) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0298, code lost:
        if (r9 <= mf.C6565s.p(r3.m())) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x029a, code lost:
        r6.f71757a += r10.f24243c.f23769a * (r9 - mf.C6565s.p(r3.m()));
        r9 = mf.C6565s.p(r3.m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02b5, code lost:
        if (r9 < 0) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02b7, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02b8, code lost:
        r6.f71757a += ((m3.L.b.C0385b) r3.m().get(r11)).a().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02cf, code lost:
        if (r11 == r9) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02d1, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02d4, code lost:
        r3 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02d6, code lost:
        r2.e((java.lang.Object) null);
        r2 = new kotlin.jvm.internal.N();
        r3 = r10.f24251k;
        r9 = r3.f23751b;
        r4.f24288a = r10;
        r4.f24289b = r0;
        r4.f24290c = r8;
        r4.f24291d = r6;
        r4.f24292e = r2;
        r4.f24293f = r3;
        r4.f24294g = r9;
        r4.f24295h = r2;
        r4.f24303p = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02fd, code lost:
        if (r9.a((java.lang.Object) null, r4) != r5) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02ff, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0300, code lost:
        r11 = r0;
        r0 = r2;
        r12 = r10;
        r10 = r8;
        r8 = r0;
        r16 = r6;
        r6 = r3;
        r3 = r9;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r2 = r6.f23752c;
        r6 = r12.z(r2, r11, r10.a(), r10.b().e(r11) + r9.f71757a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0322, code lost:
        if (r6 == null) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0324, code lost:
        r4.f24288a = r12;
        r4.f24289b = r11;
        r4.f24290c = r10;
        r4.f24291d = r9;
        r4.f24292e = r8;
        r4.f24293f = r3;
        r4.f24294g = r6;
        r4.f24295h = r0;
        r4.f24303p = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x033b, code lost:
        if (r12.C(r2, r11, r4) != r5) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x033d, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x033e, code lost:
        r16 = r6;
        r6 = r3;
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0343, code lost:
        r2 = r3;
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0347, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0348, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x034b, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x034d, code lost:
        r3.e((java.lang.Object) null);
        r0.f71759a = r2;
        r0 = new kotlin.jvm.internal.J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0357, code lost:
        r2 = r8.f71759a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0359, code lost:
        if (r2 == null) goto L_0x06dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x035b, code lost:
        r2 = r12.x(r11, r2);
        r3 = m3.K.f23844a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0366, code lost:
        if (r3.a(3) == false) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0368, code lost:
        r14 = null;
        r3.b(3, "Start " + r11 + " with loadKey " + r8.f71759a + " on " + r12.f24242b, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0393, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0394, code lost:
        r3 = r12.f24242b;
        r4.f24288a = r12;
        r4.f24289b = r11;
        r4.f24290c = r10;
        r4.f24291d = r9;
        r4.f24292e = r8;
        r4.f24293f = r0;
        r4.f24294g = r2;
        r4.f24295h = r14;
        r4.f24296i = r14;
        r4.f24303p = 4;
        r3 = r3.load(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x03af, code lost:
        if (r3 != r5) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03b1, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03b2, code lost:
        r13 = r11;
        r11 = r9;
        r9 = r12;
        r12 = r10;
        r10 = r8;
        r8 = r2;
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03b9, code lost:
        r6 = (m3.L.b) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03be, code lost:
        if ((r6 instanceof m3.L.b.C0385b) == false) goto L_0x04c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03c0, code lost:
        r2 = m3.C2226z.a.f24254a[r13.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03c9, code lost:
        if (r2 == 2) goto L_0x03dc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(m3.C2220t r19, m3.C2213l r20, qf.C6658d r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r21
            boolean r4 = r2 instanceof m3.C2226z.h
            if (r4 == 0) goto L_0x0019
            r4 = r2
            m3.z$h r4 = (m3.C2226z.h) r4
            int r5 = r4.f24303p
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0019
            int r5 = r5 - r6
            r4.f24303p = r5
            goto L_0x001e
        L_0x0019:
            m3.z$h r4 = new m3.z$h
            r4.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r4.f24301n
            java.lang.Object r5 = rf.C6680b.f()
            int r6 = r4.f24303p
            java.lang.String r7 = "Use doInitialLoad for LoadType == REFRESH"
            switch(r6) {
                case 0: goto L_0x01f7;
                case 1: goto L_0x01d9;
                case 2: goto L_0x01b4;
                case 3: goto L_0x018d;
                case 4: goto L_0x0165;
                case 5: goto L_0x0137;
                case 6: goto L_0x0116;
                case 7: goto L_0x00fd;
                case 8: goto L_0x00c7;
                case 9: goto L_0x009a;
                case 10: goto L_0x0062;
                case 11: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0033:
            int r0 = r4.f24300m
            int r6 = r4.f24299l
            java.lang.Object r12 = r4.f24295h
            dh.a r12 = (dh.C5817a) r12
            java.lang.Object r13 = r4.f24294g
            m3.B$a r13 = (m3.C2197B.a) r13
            java.lang.Object r14 = r4.f24293f
            kotlin.jvm.internal.J r14 = (kotlin.jvm.internal.J) r14
            java.lang.Object r15 = r4.f24292e
            kotlin.jvm.internal.N r15 = (kotlin.jvm.internal.N) r15
            java.lang.Object r8 = r4.f24291d
            kotlin.jvm.internal.L r8 = (kotlin.jvm.internal.L) r8
            java.lang.Object r9 = r4.f24290c
            m3.l r9 = (m3.C2213l) r9
            java.lang.Object r10 = r4.f24289b
            m3.t r10 = (m3.C2220t) r10
            java.lang.Object r11 = r4.f24288a
            m3.z r11 = (m3.C2226z) r11
            lf.w.b(r2)
            r2 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r15
            goto L_0x06a2
        L_0x0062:
            java.lang.Object r0 = r4.f24296i
            r6 = r0
            dh.a r6 = (dh.C5817a) r6
            java.lang.Object r0 = r4.f24295h
            m3.L$b r0 = (m3.L.b) r0
            java.lang.Object r8 = r4.f24294g
            m3.L$a r8 = (m3.L.a) r8
            java.lang.Object r9 = r4.f24293f
            kotlin.jvm.internal.J r9 = (kotlin.jvm.internal.J) r9
            java.lang.Object r10 = r4.f24292e
            kotlin.jvm.internal.N r10 = (kotlin.jvm.internal.N) r10
            java.lang.Object r11 = r4.f24291d
            kotlin.jvm.internal.L r11 = (kotlin.jvm.internal.L) r11
            java.lang.Object r12 = r4.f24290c
            m3.l r12 = (m3.C2213l) r12
            java.lang.Object r13 = r4.f24289b
            m3.t r13 = (m3.C2220t) r13
            java.lang.Object r14 = r4.f24288a
            m3.z r14 = (m3.C2226z) r14
            lf.w.b(r2)     // Catch:{ all -> 0x0096 }
            r16 = r12
            r12 = r10
            r10 = r16
            r17 = r13
            r13 = r11
            r11 = r17
            goto L_0x0648
        L_0x0096:
            r0 = move-exception
        L_0x0097:
            r1 = 0
            goto L_0x06d9
        L_0x009a:
            java.lang.Object r0 = r4.f24297j
            m3.B r0 = (m3.C2197B) r0
            java.lang.Object r6 = r4.f24296i
            dh.a r6 = (dh.C5817a) r6
            java.lang.Object r8 = r4.f24295h
            m3.L$b r8 = (m3.L.b) r8
            java.lang.Object r9 = r4.f24294g
            m3.L$a r9 = (m3.L.a) r9
            java.lang.Object r10 = r4.f24293f
            kotlin.jvm.internal.J r10 = (kotlin.jvm.internal.J) r10
            java.lang.Object r11 = r4.f24292e
            kotlin.jvm.internal.N r11 = (kotlin.jvm.internal.N) r11
            java.lang.Object r12 = r4.f24291d
            kotlin.jvm.internal.L r12 = (kotlin.jvm.internal.L) r12
            java.lang.Object r13 = r4.f24290c
            m3.l r13 = (m3.C2213l) r13
            java.lang.Object r14 = r4.f24289b
            m3.t r14 = (m3.C2220t) r14
            java.lang.Object r15 = r4.f24288a
            m3.z r15 = (m3.C2226z) r15
            lf.w.b(r2)     // Catch:{ all -> 0x0096 }
            goto L_0x05cb
        L_0x00c7:
            java.lang.Object r0 = r4.f24298k
            dh.a r0 = (dh.C5817a) r0
            java.lang.Object r6 = r4.f24297j
            m3.B$a r6 = (m3.C2197B.a) r6
            java.lang.Object r8 = r4.f24296i
            m3.t r8 = (m3.C2220t) r8
            java.lang.Object r9 = r4.f24295h
            m3.L$b r9 = (m3.L.b) r9
            java.lang.Object r10 = r4.f24294g
            m3.L$a r10 = (m3.L.a) r10
            java.lang.Object r11 = r4.f24293f
            kotlin.jvm.internal.J r11 = (kotlin.jvm.internal.J) r11
            java.lang.Object r12 = r4.f24292e
            kotlin.jvm.internal.N r12 = (kotlin.jvm.internal.N) r12
            java.lang.Object r13 = r4.f24291d
            kotlin.jvm.internal.L r13 = (kotlin.jvm.internal.L) r13
            java.lang.Object r14 = r4.f24290c
            m3.l r14 = (m3.C2213l) r14
            java.lang.Object r15 = r4.f24289b
            m3.t r15 = (m3.C2220t) r15
            java.lang.Object r3 = r4.f24288a
            m3.z r3 = (m3.C2226z) r3
            lf.w.b(r2)
            r16 = r14
            r14 = r0
            r0 = r16
            goto L_0x058c
        L_0x00fd:
            java.lang.Object r0 = r4.f24291d
            m3.B r0 = (m3.C2197B) r0
            java.lang.Object r3 = r4.f24290c
            dh.a r3 = (dh.C5817a) r3
            java.lang.Object r5 = r4.f24289b
            m3.l r5 = (m3.C2213l) r5
            java.lang.Object r4 = r4.f24288a
            m3.t r4 = (m3.C2220t) r4
            lf.w.b(r2)     // Catch:{ all -> 0x0112 }
            goto L_0x0528
        L_0x0112:
            r0 = move-exception
        L_0x0113:
            r2 = 0
            goto L_0x0540
        L_0x0116:
            java.lang.Object r0 = r4.f24293f
            dh.a r0 = (dh.C5817a) r0
            java.lang.Object r3 = r4.f24292e
            m3.B$a r3 = (m3.C2197B.a) r3
            java.lang.Object r6 = r4.f24291d
            m3.L$b r6 = (m3.L.b) r6
            java.lang.Object r7 = r4.f24290c
            m3.l r7 = (m3.C2213l) r7
            java.lang.Object r8 = r4.f24289b
            m3.t r8 = (m3.C2220t) r8
            java.lang.Object r9 = r4.f24288a
            m3.z r9 = (m3.C2226z) r9
            lf.w.b(r2)
            r2 = r0
            r0 = r4
            r12 = r7
            r4 = r8
            goto L_0x04ff
        L_0x0137:
            java.lang.Object r0 = r4.f24297j
            dh.a r0 = (dh.C5817a) r0
            java.lang.Object r3 = r4.f24296i
            m3.B$a r3 = (m3.C2197B.a) r3
            java.lang.Object r6 = r4.f24295h
            m3.L$b r6 = (m3.L.b) r6
            java.lang.Object r8 = r4.f24294g
            m3.L$a r8 = (m3.L.a) r8
            java.lang.Object r9 = r4.f24293f
            kotlin.jvm.internal.J r9 = (kotlin.jvm.internal.J) r9
            java.lang.Object r10 = r4.f24292e
            kotlin.jvm.internal.N r10 = (kotlin.jvm.internal.N) r10
            java.lang.Object r11 = r4.f24291d
            kotlin.jvm.internal.L r11 = (kotlin.jvm.internal.L) r11
            java.lang.Object r12 = r4.f24290c
            m3.l r12 = (m3.C2213l) r12
            java.lang.Object r13 = r4.f24289b
            m3.t r13 = (m3.C2220t) r13
            java.lang.Object r14 = r4.f24288a
            m3.z r14 = (m3.C2226z) r14
            lf.w.b(r2)
            r2 = r0
            goto L_0x0454
        L_0x0165:
            java.lang.Object r0 = r4.f24294g
            m3.L$a r0 = (m3.L.a) r0
            java.lang.Object r3 = r4.f24293f
            kotlin.jvm.internal.J r3 = (kotlin.jvm.internal.J) r3
            java.lang.Object r6 = r4.f24292e
            kotlin.jvm.internal.N r6 = (kotlin.jvm.internal.N) r6
            java.lang.Object r8 = r4.f24291d
            kotlin.jvm.internal.L r8 = (kotlin.jvm.internal.L) r8
            java.lang.Object r9 = r4.f24290c
            m3.l r9 = (m3.C2213l) r9
            java.lang.Object r10 = r4.f24289b
            m3.t r10 = (m3.C2220t) r10
            java.lang.Object r11 = r4.f24288a
            m3.z r11 = (m3.C2226z) r11
            lf.w.b(r2)
            r12 = r9
            r13 = r10
            r9 = r11
            r10 = r6
            r11 = r8
            r8 = r0
            r0 = r3
            goto L_0x03b9
        L_0x018d:
            java.lang.Object r0 = r4.f24295h
            kotlin.jvm.internal.N r0 = (kotlin.jvm.internal.N) r0
            java.lang.Object r3 = r4.f24294g
            java.lang.Object r6 = r4.f24293f
            dh.a r6 = (dh.C5817a) r6
            java.lang.Object r8 = r4.f24292e
            kotlin.jvm.internal.N r8 = (kotlin.jvm.internal.N) r8
            java.lang.Object r9 = r4.f24291d
            kotlin.jvm.internal.L r9 = (kotlin.jvm.internal.L) r9
            java.lang.Object r10 = r4.f24290c
            m3.l r10 = (m3.C2213l) r10
            java.lang.Object r11 = r4.f24289b
            m3.t r11 = (m3.C2220t) r11
            java.lang.Object r12 = r4.f24288a
            m3.z r12 = (m3.C2226z) r12
            lf.w.b(r2)     // Catch:{ all -> 0x01b0 }
            goto L_0x0343
        L_0x01b0:
            r0 = move-exception
        L_0x01b1:
            r1 = 0
            goto L_0x06e0
        L_0x01b4:
            java.lang.Object r0 = r4.f24295h
            kotlin.jvm.internal.N r0 = (kotlin.jvm.internal.N) r0
            java.lang.Object r3 = r4.f24294g
            dh.a r3 = (dh.C5817a) r3
            java.lang.Object r6 = r4.f24293f
            m3.B$a r6 = (m3.C2197B.a) r6
            java.lang.Object r8 = r4.f24292e
            kotlin.jvm.internal.N r8 = (kotlin.jvm.internal.N) r8
            java.lang.Object r9 = r4.f24291d
            kotlin.jvm.internal.L r9 = (kotlin.jvm.internal.L) r9
            java.lang.Object r10 = r4.f24290c
            m3.l r10 = (m3.C2213l) r10
            java.lang.Object r11 = r4.f24289b
            m3.t r11 = (m3.C2220t) r11
            java.lang.Object r12 = r4.f24288a
            m3.z r12 = (m3.C2226z) r12
            lf.w.b(r2)
            goto L_0x030b
        L_0x01d9:
            java.lang.Object r0 = r4.f24293f
            dh.a r0 = (dh.C5817a) r0
            java.lang.Object r3 = r4.f24292e
            m3.B$a r3 = (m3.C2197B.a) r3
            java.lang.Object r6 = r4.f24291d
            kotlin.jvm.internal.L r6 = (kotlin.jvm.internal.L) r6
            java.lang.Object r8 = r4.f24290c
            m3.l r8 = (m3.C2213l) r8
            java.lang.Object r9 = r4.f24289b
            m3.t r9 = (m3.C2220t) r9
            java.lang.Object r10 = r4.f24288a
            m3.z r10 = (m3.C2226z) r10
            lf.w.b(r2)
            r2 = r0
            r0 = r9
            goto L_0x0223
        L_0x01f7:
            lf.w.b(r2)
            m3.t r2 = m3.C2220t.REFRESH
            if (r0 == r2) goto L_0x06ee
            kotlin.jvm.internal.L r6 = new kotlin.jvm.internal.L
            r6.<init>()
            m3.B$a r3 = r1.f24251k
            dh.a r2 = r3.f23751b
            r4.f24288a = r1
            r4.f24289b = r0
            r8 = r20
            r4.f24290c = r8
            r4.f24291d = r6
            r4.f24292e = r3
            r4.f24293f = r2
            r9 = 1
            r4.f24303p = r9
            r9 = 0
            java.lang.Object r10 = r2.a(r9, r4)
            if (r10 != r5) goto L_0x0222
            return r5
        L_0x0222:
            r10 = r1
        L_0x0223:
            m3.B r3 = r3.f23752c     // Catch:{ all -> 0x0257 }
            int[] r9 = m3.C2226z.a.f24254a     // Catch:{ all -> 0x0257 }
            int r11 = r0.ordinal()     // Catch:{ all -> 0x0257 }
            r9 = r9[r11]     // Catch:{ all -> 0x0257 }
            r11 = 1
            if (r9 == r11) goto L_0x06e4
            r12 = 2
            if (r9 == r12) goto L_0x0281
            r12 = 3
            if (r9 == r12) goto L_0x023a
            goto L_0x02d4
        L_0x023a:
            int r9 = r3.l()     // Catch:{ all -> 0x0257 }
            m3.Z r12 = r8.b()     // Catch:{ all -> 0x0257 }
            int r12 = r12.b()     // Catch:{ all -> 0x0257 }
            int r9 = r9 + r12
            int r9 = r9 + r11
            if (r9 >= 0) goto L_0x025b
            int r11 = r6.f71757a     // Catch:{ all -> 0x0257 }
            m3.E r12 = r10.f24243c     // Catch:{ all -> 0x0257 }
            int r12 = r12.f23769a     // Catch:{ all -> 0x0257 }
            int r9 = -r9
            int r12 = r12 * r9
            int r11 = r11 + r12
            r6.f71757a = r11     // Catch:{ all -> 0x0257 }
            r9 = 0
            goto L_0x025b
        L_0x0257:
            r0 = move-exception
            r1 = 0
            goto L_0x06ea
        L_0x025b:
            java.util.List r11 = r3.m()     // Catch:{ all -> 0x0257 }
            int r11 = mf.C6565s.p(r11)     // Catch:{ all -> 0x0257 }
            if (r9 > r11) goto L_0x02d4
        L_0x0265:
            int r12 = r6.f71757a     // Catch:{ all -> 0x0257 }
            java.util.List r13 = r3.m()     // Catch:{ all -> 0x0257 }
            java.lang.Object r13 = r13.get(r9)     // Catch:{ all -> 0x0257 }
            m3.L$b$b r13 = (m3.L.b.C0385b) r13     // Catch:{ all -> 0x0257 }
            java.util.List r13 = r13.a()     // Catch:{ all -> 0x0257 }
            int r13 = r13.size()     // Catch:{ all -> 0x0257 }
            int r12 = r12 + r13
            r6.f71757a = r12     // Catch:{ all -> 0x0257 }
            if (r9 == r11) goto L_0x02d4
            r12 = 1
            int r9 = r9 + r12
            goto L_0x0265
        L_0x0281:
            int r9 = r3.l()     // Catch:{ all -> 0x0257 }
            m3.Z r11 = r8.b()     // Catch:{ all -> 0x0257 }
            int r11 = r11.a()     // Catch:{ all -> 0x0257 }
            int r9 = r9 + r11
            r11 = 1
            int r9 = r9 - r11
            java.util.List r11 = r3.m()     // Catch:{ all -> 0x0257 }
            int r11 = mf.C6565s.p(r11)     // Catch:{ all -> 0x0257 }
            if (r9 <= r11) goto L_0x02b5
            int r11 = r6.f71757a     // Catch:{ all -> 0x0257 }
            m3.E r12 = r10.f24243c     // Catch:{ all -> 0x0257 }
            int r12 = r12.f23769a     // Catch:{ all -> 0x0257 }
            java.util.List r13 = r3.m()     // Catch:{ all -> 0x0257 }
            int r13 = mf.C6565s.p(r13)     // Catch:{ all -> 0x0257 }
            int r9 = r9 - r13
            int r12 = r12 * r9
            int r11 = r11 + r12
            r6.f71757a = r11     // Catch:{ all -> 0x0257 }
            java.util.List r9 = r3.m()     // Catch:{ all -> 0x0257 }
            int r9 = mf.C6565s.p(r9)     // Catch:{ all -> 0x0257 }
        L_0x02b5:
            if (r9 < 0) goto L_0x02d4
            r11 = 0
        L_0x02b8:
            int r12 = r6.f71757a     // Catch:{ all -> 0x0257 }
            java.util.List r13 = r3.m()     // Catch:{ all -> 0x0257 }
            java.lang.Object r13 = r13.get(r11)     // Catch:{ all -> 0x0257 }
            m3.L$b$b r13 = (m3.L.b.C0385b) r13     // Catch:{ all -> 0x0257 }
            java.util.List r13 = r13.a()     // Catch:{ all -> 0x0257 }
            int r13 = r13.size()     // Catch:{ all -> 0x0257 }
            int r12 = r12 + r13
            r6.f71757a = r12     // Catch:{ all -> 0x0257 }
            if (r11 == r9) goto L_0x02d4
            r12 = 1
            int r11 = r11 + r12
            goto L_0x02b8
        L_0x02d4:
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x0257 }
            r3 = 0
            r2.e(r3)
            kotlin.jvm.internal.N r2 = new kotlin.jvm.internal.N
            r2.<init>()
            m3.B$a r3 = r10.f24251k
            dh.a r9 = r3.f23751b
            r4.f24288a = r10
            r4.f24289b = r0
            r4.f24290c = r8
            r4.f24291d = r6
            r4.f24292e = r2
            r4.f24293f = r3
            r4.f24294g = r9
            r4.f24295h = r2
            r11 = 2
            r4.f24303p = r11
            r11 = 0
            java.lang.Object r12 = r9.a(r11, r4)
            if (r12 != r5) goto L_0x0300
            return r5
        L_0x0300:
            r11 = r0
            r0 = r2
            r12 = r10
            r10 = r8
            r8 = r0
            r16 = r6
            r6 = r3
            r3 = r9
            r9 = r16
        L_0x030b:
            m3.B r2 = r6.f23752c     // Catch:{ all -> 0x0347 }
            int r6 = r10.a()     // Catch:{ all -> 0x0347 }
            m3.Z r13 = r10.b()     // Catch:{ all -> 0x0347 }
            int r13 = r13.e(r11)     // Catch:{ all -> 0x0347 }
            int r14 = r9.f71757a     // Catch:{ all -> 0x0347 }
            int r13 = r13 + r14
            java.lang.Object r6 = r12.z(r2, r11, r6, r13)     // Catch:{ all -> 0x0347 }
            if (r6 == 0) goto L_0x034b
            r4.f24288a = r12     // Catch:{ all -> 0x0347 }
            r4.f24289b = r11     // Catch:{ all -> 0x0347 }
            r4.f24290c = r10     // Catch:{ all -> 0x0347 }
            r4.f24291d = r9     // Catch:{ all -> 0x0347 }
            r4.f24292e = r8     // Catch:{ all -> 0x0347 }
            r4.f24293f = r3     // Catch:{ all -> 0x0347 }
            r4.f24294g = r6     // Catch:{ all -> 0x0347 }
            r4.f24295h = r0     // Catch:{ all -> 0x0347 }
            r13 = 3
            r4.f24303p = r13     // Catch:{ all -> 0x0347 }
            java.lang.Object r2 = r12.C(r2, r11, r4)     // Catch:{ all -> 0x0347 }
            if (r2 != r5) goto L_0x033e
            return r5
        L_0x033e:
            r16 = r6
            r6 = r3
            r3 = r16
        L_0x0343:
            r2 = r3
            r3 = r6
        L_0x0345:
            r6 = 0
            goto L_0x034d
        L_0x0347:
            r0 = move-exception
            r6 = r3
            goto L_0x01b1
        L_0x034b:
            r2 = 0
            goto L_0x0345
        L_0x034d:
            r3.e(r6)
            r0.f71759a = r2
            kotlin.jvm.internal.J r0 = new kotlin.jvm.internal.J
            r0.<init>()
        L_0x0357:
            java.lang.Object r2 = r8.f71759a
            if (r2 == 0) goto L_0x06dd
            m3.L$a r2 = r12.x(r11, r2)
            m3.K r3 = m3.K.f23844a
            r6 = 3
            boolean r13 = r3.a(r6)
            if (r13 == 0) goto L_0x0393
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "Start "
            r6.append(r13)
            r6.append(r11)
            java.lang.String r13 = " with loadKey "
            r6.append(r13)
            java.lang.Object r13 = r8.f71759a
            r6.append(r13)
            java.lang.String r13 = " on "
            r6.append(r13)
            m3.L r13 = r12.f24242b
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            r13 = 3
            r14 = 0
            r3.b(r13, r6, r14)
            goto L_0x0394
        L_0x0393:
            r14 = 0
        L_0x0394:
            m3.L r3 = r12.f24242b
            r4.f24288a = r12
            r4.f24289b = r11
            r4.f24290c = r10
            r4.f24291d = r9
            r4.f24292e = r8
            r4.f24293f = r0
            r4.f24294g = r2
            r4.f24295h = r14
            r4.f24296i = r14
            r6 = 4
            r4.f24303p = r6
            java.lang.Object r3 = r3.load(r2, r4)
            if (r3 != r5) goto L_0x03b2
            return r5
        L_0x03b2:
            r13 = r11
            r11 = r9
            r9 = r12
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r3
        L_0x03b9:
            r6 = r2
            m3.L$b r6 = (m3.L.b) r6
            boolean r2 = r6 instanceof m3.L.b.C0385b
            if (r2 == 0) goto L_0x04c5
            int[] r2 = m3.C2226z.a.f24254a
            int r3 = r13.ordinal()
            r2 = r2[r3]
            r3 = 2
            if (r2 == r3) goto L_0x03dc
            r3 = 3
            if (r2 != r3) goto L_0x03d6
            r2 = r6
            m3.L$b$b r2 = (m3.L.b.C0385b) r2
            java.lang.Object r2 = r2.k()
            goto L_0x03e3
        L_0x03d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L_0x03dc:
            r2 = r6
            m3.L$b$b r2 = (m3.L.b.C0385b) r2
            java.lang.Object r2 = r2.n()
        L_0x03e3:
            m3.L r3 = r9.f24242b
            boolean r3 = r3.getKeyReuseSupported()
            if (r3 != 0) goto L_0x042d
            java.lang.Object r3 = r10.f71759a
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r3)
            if (r2 != 0) goto L_0x03f4
            goto L_0x042d
        L_0x03f4:
            m3.t r0 = m3.C2220t.PREPEND
            if (r13 != r0) goto L_0x03fb
            java.lang.String r0 = "prevKey"
            goto L_0x03fd
        L_0x03fb:
            java.lang.String r0 = "nextKey"
        L_0x03fd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The same value, "
            r2.append(r3)
            java.lang.Object r3 = r10.f71759a
            r2.append(r3)
            java.lang.String r3 = ", was passed as the "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            r3 = 1
            java.lang.String r0 = Sg.p.h(r0, r2, r3, r2)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x042d:
            m3.B$a r3 = r9.f24251k
            dh.a r2 = r3.f23751b
            r4.f24288a = r9
            r4.f24289b = r13
            r4.f24290c = r12
            r4.f24291d = r11
            r4.f24292e = r10
            r4.f24293f = r0
            r4.f24294g = r8
            r4.f24295h = r6
            r4.f24296i = r3
            r4.f24297j = r2
            r14 = 5
            r4.f24303p = r14
            r14 = 0
            java.lang.Object r15 = r2.a(r14, r4)
            if (r15 != r5) goto L_0x0452
            return r5
        L_0x0452:
            r14 = r9
            r9 = r0
        L_0x0454:
            m3.B r0 = r3.f23752c     // Catch:{ all -> 0x04bf }
            int r3 = r12.a()     // Catch:{ all -> 0x04bf }
            r15 = r6
            m3.L$b$b r15 = (m3.L.b.C0385b) r15     // Catch:{ all -> 0x04bf }
            boolean r0 = r0.r(r3, r13, r15)     // Catch:{ all -> 0x04bf }
            r3 = 0
            r2.e(r3)
            if (r0 != 0) goto L_0x047d
            m3.K r0 = m3.K.f23844a
            r2 = 2
            boolean r4 = r0.a(r2)
            if (r4 == 0) goto L_0x06dd
            java.lang.Object r4 = r10.f71759a
            java.lang.String r4 = r14.y(r13, r4, r3)
            r0.b(r2, r4, r3)
            goto L_0x06dd
        L_0x047d:
            m3.K r0 = m3.K.f23844a
            r15 = 3
            boolean r2 = r0.a(r15)
            if (r2 == 0) goto L_0x048f
            java.lang.Object r2 = r10.f71759a
            java.lang.String r2 = r14.y(r13, r2, r6)
            r0.b(r15, r2, r3)
        L_0x048f:
            int r0 = r11.f71757a
            r2 = r6
            m3.L$b$b r2 = (m3.L.b.C0385b) r2
            java.util.List r3 = r2.a()
            int r3 = r3.size()
            int r0 = r0 + r3
            r11.f71757a = r0
            m3.t r0 = m3.C2220t.PREPEND
            if (r13 != r0) goto L_0x04ac
            java.lang.Object r0 = r2.n()
            if (r0 == 0) goto L_0x04aa
            goto L_0x04ac
        L_0x04aa:
            r3 = 1
            goto L_0x04b7
        L_0x04ac:
            m3.t r0 = m3.C2220t.APPEND
            if (r13 != r0) goto L_0x04ba
            java.lang.Object r0 = r2.k()
            if (r0 != 0) goto L_0x04ba
            goto L_0x04aa
        L_0x04b7:
            r9.f71755a = r3
            goto L_0x04bb
        L_0x04ba:
            r3 = 1
        L_0x04bb:
            r0 = r9
            r9 = r14
            goto L_0x0544
        L_0x04bf:
            r0 = move-exception
            r14 = 0
            r2.e(r14)
            throw r0
        L_0x04c5:
            r3 = 1
            r14 = 0
            r15 = 3
            boolean r2 = r6 instanceof m3.L.b.a
            if (r2 == 0) goto L_0x0544
            m3.K r0 = m3.K.f23844a
            r2 = 2
            boolean r3 = r0.a(r2)
            if (r3 == 0) goto L_0x04de
            java.lang.Object r3 = r10.f71759a
            java.lang.String r3 = r9.y(r13, r3, r6)
            r0.b(r2, r3, r14)
        L_0x04de:
            m3.B$a r3 = r9.f24251k
            dh.a r0 = r3.f23751b
            r4.f24288a = r9
            r4.f24289b = r13
            r4.f24290c = r12
            r4.f24291d = r6
            r4.f24292e = r3
            r4.f24293f = r0
            r4.f24294g = r14
            r2 = 6
            r4.f24303p = r2
            java.lang.Object r2 = r0.a(r14, r4)
            if (r2 != r5) goto L_0x04fc
            return r5
        L_0x04fc:
            r2 = r0
            r0 = r4
            r4 = r13
        L_0x04ff:
            m3.B r3 = r3.f23752c     // Catch:{ all -> 0x053c }
            m3.r$a r7 = new m3.r$a     // Catch:{ all -> 0x053c }
            m3.L$b$a r6 = (m3.L.b.a) r6     // Catch:{ all -> 0x053c }
            java.lang.Throwable r6 = r6.a()     // Catch:{ all -> 0x053c }
            r7.<init>(r6)     // Catch:{ all -> 0x053c }
            r0.f24288a = r4     // Catch:{ all -> 0x053c }
            r0.f24289b = r12     // Catch:{ all -> 0x053c }
            r0.f24290c = r2     // Catch:{ all -> 0x053c }
            r0.f24291d = r3     // Catch:{ all -> 0x053c }
            r6 = 0
            r0.f24292e = r6     // Catch:{ all -> 0x053c }
            r0.f24293f = r6     // Catch:{ all -> 0x053c }
            r6 = 7
            r0.f24303p = r6     // Catch:{ all -> 0x053c }
            java.lang.Object r0 = r9.B(r3, r4, r7, r0)     // Catch:{ all -> 0x053c }
            if (r0 != r5) goto L_0x0525
            return r5
        L_0x0525:
            r0 = r3
            r5 = r12
            r3 = r2
        L_0x0528:
            java.util.Map r0 = r0.k()     // Catch:{ all -> 0x0112 }
            m3.Z r2 = r5.b()     // Catch:{ all -> 0x0112 }
            r0.put(r4, r2)     // Catch:{ all -> 0x0112 }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0112 }
            r2 = 0
            r3.e(r2)
            lf.M r0 = lf.C6514M.f71813a
            return r0
        L_0x053c:
            r0 = move-exception
            r3 = r2
            goto L_0x0113
        L_0x0540:
            r3.e(r2)
            throw r0
        L_0x0544:
            int[] r2 = m3.C2226z.a.f24254a
            int r14 = r13.ordinal()
            r2 = r2[r14]
            r14 = 2
            if (r2 != r14) goto L_0x0552
            m3.t r2 = m3.C2220t.APPEND
            goto L_0x0554
        L_0x0552:
            m3.t r2 = m3.C2220t.PREPEND
        L_0x0554:
            m3.B$a r3 = r9.f24251k
            dh.a r14 = r3.f23751b
            r4.f24288a = r9
            r4.f24289b = r13
            r4.f24290c = r12
            r4.f24291d = r11
            r4.f24292e = r10
            r4.f24293f = r0
            r4.f24294g = r8
            r4.f24295h = r6
            r4.f24296i = r2
            r4.f24297j = r3
            r4.f24298k = r14
            r15 = 8
            r4.f24303p = r15
            r19 = r0
            r15 = 0
            java.lang.Object r0 = r14.a(r15, r4)
            if (r0 != r5) goto L_0x057e
            return r5
        L_0x057e:
            r0 = r12
            r15 = r13
            r12 = r10
            r13 = r11
            r11 = r19
            r10 = r8
            r8 = r2
            r16 = r6
            r6 = r3
            r3 = r9
            r9 = r16
        L_0x058c:
            m3.B r2 = r6.f23752c     // Catch:{ all -> 0x05d5 }
            m3.Z r6 = r0.b()     // Catch:{ all -> 0x05d5 }
            m3.x$a r6 = r2.i(r8, r6)     // Catch:{ all -> 0x05d5 }
            if (r6 == 0) goto L_0x05d9
            r2.h(r6)     // Catch:{ all -> 0x05d5 }
            Wg.d r8 = r3.f24250j     // Catch:{ all -> 0x05d5 }
            r4.f24288a = r3     // Catch:{ all -> 0x05d5 }
            r4.f24289b = r15     // Catch:{ all -> 0x05d5 }
            r4.f24290c = r0     // Catch:{ all -> 0x05d5 }
            r4.f24291d = r13     // Catch:{ all -> 0x05d5 }
            r4.f24292e = r12     // Catch:{ all -> 0x05d5 }
            r4.f24293f = r11     // Catch:{ all -> 0x05d5 }
            r4.f24294g = r10     // Catch:{ all -> 0x05d5 }
            r4.f24295h = r9     // Catch:{ all -> 0x05d5 }
            r4.f24296i = r14     // Catch:{ all -> 0x05d5 }
            r4.f24297j = r2     // Catch:{ all -> 0x05d5 }
            r1 = 0
            r4.f24298k = r1     // Catch:{ all -> 0x05d5 }
            r1 = 9
            r4.f24303p = r1     // Catch:{ all -> 0x05d5 }
            java.lang.Object r1 = r8.k(r6, r4)     // Catch:{ all -> 0x05d5 }
            if (r1 != r5) goto L_0x05c1
            return r5
        L_0x05c1:
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r6 = r14
            r14 = r15
            r13 = r0
            r0 = r2
            r15 = r3
        L_0x05cb:
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x0096 }
            r2 = r0
            r0 = r13
            r3 = r15
            r13 = r12
            r15 = r14
            r12 = r11
            r11 = r10
            goto L_0x05dc
        L_0x05d5:
            r0 = move-exception
            r6 = r14
            goto L_0x0097
        L_0x05d9:
            r8 = r9
            r9 = r10
            r6 = r14
        L_0x05dc:
            int r1 = r0.a()     // Catch:{ all -> 0x0096 }
            m3.Z r10 = r0.b()     // Catch:{ all -> 0x0096 }
            int r10 = r10.e(r15)     // Catch:{ all -> 0x0096 }
            int r14 = r13.f71757a     // Catch:{ all -> 0x0096 }
            int r10 = r10 + r14
            java.lang.Object r1 = r3.z(r2, r15, r1, r10)     // Catch:{ all -> 0x0096 }
            r12.f71759a = r1     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0617
            m3.w r1 = r2.p()     // Catch:{ all -> 0x0096 }
            m3.r r1 = r1.a(r15)     // Catch:{ all -> 0x0096 }
            boolean r1 = r1 instanceof m3.r.a     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0617
            m3.w r1 = r2.p()     // Catch:{ all -> 0x0096 }
            boolean r10 = r11.f71755a     // Catch:{ all -> 0x0096 }
            if (r10 == 0) goto L_0x060e
            m3.r$c$a r10 = m3.r.c.f24097b     // Catch:{ all -> 0x0096 }
            m3.r$c r10 = r10.a()     // Catch:{ all -> 0x0096 }
            goto L_0x0614
        L_0x060e:
            m3.r$c$a r10 = m3.r.c.f24097b     // Catch:{ all -> 0x0096 }
            m3.r$c r10 = r10.b()     // Catch:{ all -> 0x0096 }
        L_0x0614:
            r1.c(r15, r10)     // Catch:{ all -> 0x0096 }
        L_0x0617:
            r1 = r8
            m3.L$b$b r1 = (m3.L.b.C0385b) r1     // Catch:{ all -> 0x0096 }
            m3.x r1 = r2.u(r1, r15)     // Catch:{ all -> 0x0096 }
            Wg.d r2 = r3.f24250j     // Catch:{ all -> 0x0096 }
            r4.f24288a = r3     // Catch:{ all -> 0x0096 }
            r4.f24289b = r15     // Catch:{ all -> 0x0096 }
            r4.f24290c = r0     // Catch:{ all -> 0x0096 }
            r4.f24291d = r13     // Catch:{ all -> 0x0096 }
            r4.f24292e = r12     // Catch:{ all -> 0x0096 }
            r4.f24293f = r11     // Catch:{ all -> 0x0096 }
            r4.f24294g = r9     // Catch:{ all -> 0x0096 }
            r4.f24295h = r8     // Catch:{ all -> 0x0096 }
            r4.f24296i = r6     // Catch:{ all -> 0x0096 }
            r10 = 0
            r4.f24297j = r10     // Catch:{ all -> 0x0096 }
            r4.f24298k = r10     // Catch:{ all -> 0x0096 }
            r10 = 10
            r4.f24303p = r10     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r2.k(r1, r4)     // Catch:{ all -> 0x0096 }
            if (r1 != r5) goto L_0x0642
            return r5
        L_0x0642:
            r10 = r0
            r14 = r3
            r0 = r8
            r8 = r9
            r9 = r11
            r11 = r15
        L_0x0648:
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x0096 }
            r1 = 0
            r6.e(r1)
            boolean r1 = r8 instanceof m3.L.a.c
            if (r1 == 0) goto L_0x065d
            r1 = r0
            m3.L$b$b r1 = (m3.L.b.C0385b) r1
            java.lang.Object r1 = r1.n()
            if (r1 != 0) goto L_0x065d
            r6 = 1
            goto L_0x065e
        L_0x065d:
            r6 = 0
        L_0x065e:
            boolean r1 = r8 instanceof m3.L.a.C0383a
            if (r1 == 0) goto L_0x066c
            m3.L$b$b r0 = (m3.L.b.C0385b) r0
            java.lang.Object r0 = r0.k()
            if (r0 != 0) goto L_0x066c
            r0 = 1
            goto L_0x066d
        L_0x066c:
            r0 = 0
        L_0x066d:
            m3.Q r1 = r14.f24245e
            if (r1 == 0) goto L_0x06d1
            if (r6 != 0) goto L_0x0675
            if (r0 == 0) goto L_0x06d1
        L_0x0675:
            m3.B$a r1 = r14.f24251k
            dh.a r2 = r1.f23751b
            r4.f24288a = r14
            r4.f24289b = r11
            r4.f24290c = r10
            r4.f24291d = r13
            r4.f24292e = r12
            r4.f24293f = r9
            r4.f24294g = r1
            r4.f24295h = r2
            r3 = 0
            r4.f24296i = r3
            r4.f24299l = r6
            r4.f24300m = r0
            r8 = 11
            r4.f24303p = r8
            java.lang.Object r8 = r2.a(r3, r4)
            if (r8 != r5) goto L_0x069d
            return r5
        L_0x069d:
            r8 = r12
            r12 = r14
            r14 = r9
            r9 = r13
            r13 = r1
        L_0x06a2:
            m3.B r1 = r13.f23752c     // Catch:{ all -> 0x06cb }
            m3.m r3 = r12.f24248h     // Catch:{ all -> 0x06cb }
            m3.Z$a r3 = r3.b()     // Catch:{ all -> 0x06cb }
            m3.M r1 = r1.g(r3)     // Catch:{ all -> 0x06cb }
            r3 = 0
            r2.e(r3)
            if (r6 == 0) goto L_0x06bd
            m3.Q r2 = r12.f24245e
            m3.t r3 = m3.C2220t.PREPEND
            r2.c(r3, r1)
        L_0x06bd:
            if (r0 == 0) goto L_0x06c6
            m3.Q r0 = r12.f24245e
            m3.t r2 = m3.C2220t.APPEND
            r0.c(r2, r1)
        L_0x06c6:
            r1 = r18
            r0 = r14
            goto L_0x0357
        L_0x06cb:
            r0 = move-exception
            r1 = 0
            r2.e(r1)
            throw r0
        L_0x06d1:
            r1 = r18
            r0 = r9
            r8 = r12
            r9 = r13
            r12 = r14
            goto L_0x0357
        L_0x06d9:
            r6.e(r1)
            throw r0
        L_0x06dd:
            lf.M r0 = lf.C6514M.f71813a
            return r0
        L_0x06e0:
            r6.e(r1)
            throw r0
        L_0x06e4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0257 }
            r0.<init>(r7)     // Catch:{ all -> 0x0257 }
            throw r0     // Catch:{ all -> 0x0257 }
        L_0x06ea:
            r2.e(r1)
            throw r0
        L_0x06ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C2226z.t(m3.t, m3.l, qf.d):java.lang.Object");
    }

    private final L.a x(C2220t tVar, Object obj) {
        int i10;
        L.a.b bVar = L.a.f23845c;
        if (tVar == C2220t.REFRESH) {
            i10 = this.f24243c.f23772d;
        } else {
            i10 = this.f24243c.f23769a;
        }
        return bVar.a(tVar, obj, i10, this.f24243c.f23771c);
    }

    private final String y(C2220t tVar, Object obj, L.b bVar) {
        if (bVar == null) {
            return "End " + tVar + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + tVar + " with loadKey " + obj + ". Returned " + bVar;
    }

    private final Object z(C2197B b10, C2220t tVar, int i10, int i11) {
        if (i10 != b10.j(tVar) || (b10.p().a(tVar) instanceof r.a) || i11 >= this.f24243c.f23770b) {
            return null;
        }
        if (tVar == C2220t.PREPEND) {
            return ((L.b.C0385b) C6565s.o0(b10.m())).n();
        }
        return ((L.b.C0385b) C6565s.z0(b10.m())).k();
    }

    public final void o(Z z10) {
        C6496s.h(z10, "viewportHint");
        this.f24248h.d(z10);
    }

    public final void p() {
        C5600w0.a.a(this.f24252l, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(qf.C6658d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof m3.C2226z.f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            m3.z$f r0 = (m3.C2226z.f) r0
            int r1 = r0.f24280f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24280f = r1
            goto L_0x0018
        L_0x0013:
            m3.z$f r0 = new m3.z$f
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f24278d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f24280f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r1 = r0.f24277c
            dh.a r1 = (dh.C5817a) r1
            java.lang.Object r2 = r0.f24276b
            m3.B$a r2 = (m3.C2197B.a) r2
            java.lang.Object r0 = r0.f24275a
            m3.z r0 = (m3.C2226z) r0
            lf.w.b(r6)
            goto L_0x0058
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003e:
            lf.w.b(r6)
            m3.B$a r2 = r5.f24251k
            dh.a r6 = r2.f23751b
            r0.f24275a = r5
            r0.f24276b = r2
            r0.f24277c = r6
            r0.f24280f = r3
            java.lang.Object r0 = r6.a(r4, r0)
            if (r0 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r0 = r5
            r1 = r6
        L_0x0058:
            m3.B r6 = r2.f23752c     // Catch:{ all -> 0x006a }
            m3.m r0 = r0.f24248h     // Catch:{ all -> 0x006a }
            m3.Z$a r0 = r0.b()     // Catch:{ all -> 0x006a }
            m3.M r6 = r6.g(r0)     // Catch:{ all -> 0x006a }
            r1.e(r4)
            return r6
        L_0x006a:
            r6 = move-exception
            r1.e(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C2226z.r(qf.d):java.lang.Object");
    }

    public final C5694f u() {
        return this.f24253m;
    }

    public final L v() {
        return this.f24242b;
    }

    public final Q w() {
        return this.f24245e;
    }
}
