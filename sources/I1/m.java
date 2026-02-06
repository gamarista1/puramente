package I1;

import Ug.C5599w;
import Ug.C5600w0;
import Ug.C5603y;
import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import Xg.N;
import Xg.x;
import dh.C5817a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import lf.C6514M;
import lf.C6531o;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;

public final class m implements f {

    /* renamed from: k  reason: collision with root package name */
    public static final a f2713k = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Set f2714l = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Object f2715m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C6787a f2716a;

    /* renamed from: b  reason: collision with root package name */
    private final k f2717b;

    /* renamed from: c  reason: collision with root package name */
    private final b f2718c;

    /* renamed from: d  reason: collision with root package name */
    private final K f2719d;

    /* renamed from: e  reason: collision with root package name */
    private final C5694f f2720e = C5696h.y(new g(this, (C6658d) null));

    /* renamed from: f  reason: collision with root package name */
    private final String f2721f = ".tmp";

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f2722g = C6531o.b(new h(this));
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final x f2723h = N.a(o.f2812a);

    /* renamed from: i  reason: collision with root package name */
    private List f2724i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final l f2725j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return m.f2714l;
        }

        public final Object b() {
            return m.f2715m;
        }

        private a() {
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final n f2726a;

            public a(n nVar) {
                super((DefaultConstructorMarker) null);
                this.f2726a = nVar;
            }

            public n a() {
                return this.f2726a;
            }
        }

        /* renamed from: I1.m$b$b  reason: collision with other inner class name */
        public static final class C0047b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final yf.p f2727a;

            /* renamed from: b  reason: collision with root package name */
            private final C5599w f2728b;

            /* renamed from: c  reason: collision with root package name */
            private final n f2729c;

            /* renamed from: d  reason: collision with root package name */
            private final qf.g f2730d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0047b(yf.p pVar, C5599w wVar, n nVar, qf.g gVar) {
                super((DefaultConstructorMarker) null);
                C6496s.h(pVar, "transform");
                C6496s.h(wVar, "ack");
                C6496s.h(gVar, "callerContext");
                this.f2727a = pVar;
                this.f2728b = wVar;
                this.f2729c = nVar;
                this.f2730d = gVar;
            }

            public final C5599w a() {
                return this.f2728b;
            }

            public final qf.g b() {
                return this.f2730d;
            }

            public n c() {
                return this.f2729c;
            }

            public final yf.p d() {
                return this.f2727a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final FileOutputStream f2731a;

        public c(FileOutputStream fileOutputStream) {
            C6496s.h(fileOutputStream, "fileOutputStream");
            this.f2731a = fileOutputStream;
        }

        public void flush() {
            this.f2731a.flush();
        }

        public void write(int i10) {
            this.f2731a.write(i10);
        }

        public void write(byte[] bArr) {
            C6496s.h(bArr, "b");
            this.f2731a.write(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) {
            C6496s.h(bArr, "bytes");
            this.f2731a.write(bArr, i10, i11);
        }

        public void close() {
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f2732a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(m mVar) {
            super(1);
            this.f2732a = mVar;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                this.f2732a.f2723h.setValue(new h(th2));
            }
            a aVar = m.f2713k;
            Object b10 = aVar.b();
            m mVar = this.f2732a;
            synchronized (b10) {
                aVar.a().remove(mVar.q().getAbsolutePath());
                C6514M m10 = C6514M.f71813a;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        public static final e f2733a = new e();

        e() {
            super(2);
        }

        public final void a(b bVar, Throwable th2) {
            C6496s.h(bVar, "msg");
            if (bVar instanceof b.C0047b) {
                C5599w a10 = ((b.C0047b) bVar).a();
                if (th2 == null) {
                    th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a10.f(th2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((b) obj, (Throwable) obj2);
            return C6514M.f71813a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f2734a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f2735b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f2736c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(m mVar, C6658d dVar) {
            super(2, dVar);
            this.f2736c = mVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            f fVar = new f(this.f2736c, dVar);
            fVar.f2735b = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(b bVar, C6658d dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f2734a;
            if (i10 == 0) {
                w.b(obj);
                b bVar = (b) this.f2735b;
                if (bVar instanceof b.a) {
                    this.f2734a = 1;
                    if (this.f2736c.r((b.a) bVar, this) == f10) {
                        return f10;
                    }
                } else if (bVar instanceof b.C0047b) {
                    this.f2734a = 2;
                    if (this.f2736c.s((b.C0047b) bVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f2737a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f2738b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f2739c;

        static final class a extends kotlin.coroutines.jvm.internal.l implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            int f2740a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f2741b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ n f2742c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n nVar, C6658d dVar) {
                super(2, dVar);
                this.f2742c = nVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f2742c, dVar);
                aVar.f2741b = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(n nVar, C6658d dVar) {
                return ((a) create(nVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                C6680b.f();
                if (this.f2740a == 0) {
                    w.b(obj);
                    n nVar = (n) this.f2741b;
                    n nVar2 = this.f2742c;
                    boolean z10 = false;
                    if (!(nVar2 instanceof c) && !(nVar2 instanceof h) && nVar == nVar2) {
                        z10 = true;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public static final class b implements C5694f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5694f f2743a;

            public static final class a implements C5695g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C5695g f2744a;

                /* renamed from: I1.m$g$b$a$a  reason: collision with other inner class name */
                public static final class C0048a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f2745a;

                    /* renamed from: b  reason: collision with root package name */
                    int f2746b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ a f2747c;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0048a(a aVar, C6658d dVar) {
                        super(dVar);
                        this.f2747c = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f2745a = obj;
                        this.f2746b |= Integer.MIN_VALUE;
                        return this.f2747c.emit((Object) null, this);
                    }
                }

                public a(C5695g gVar) {
                    this.f2744a = gVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r5, qf.C6658d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof I1.m.g.b.a.C0048a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        I1.m$g$b$a$a r0 = (I1.m.g.b.a.C0048a) r0
                        int r1 = r0.f2746b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f2746b = r1
                        goto L_0x0018
                    L_0x0013:
                        I1.m$g$b$a$a r0 = new I1.m$g$b$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f2745a
                        java.lang.Object r1 = rf.C6680b.f()
                        int r2 = r0.f2746b
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        lf.w.b(r6)
                        goto L_0x0053
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        lf.w.b(r6)
                        Xg.g r6 = r4.f2744a
                        I1.n r5 = (I1.n) r5
                        boolean r2 = r5 instanceof I1.j
                        if (r2 != 0) goto L_0x006f
                        boolean r2 = r5 instanceof I1.h
                        if (r2 != 0) goto L_0x0068
                        boolean r2 = r5 instanceof I1.c
                        if (r2 == 0) goto L_0x0056
                        I1.c r5 = (I1.c) r5
                        java.lang.Object r5 = r5.b()
                        r0.f2746b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0053
                        return r1
                    L_0x0053:
                        lf.M r5 = lf.C6514M.f71813a
                        return r5
                    L_0x0056:
                        boolean r5 = r5 instanceof I1.o
                        if (r5 == 0) goto L_0x0062
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L_0x0062:
                        lf.s r5 = new lf.s
                        r5.<init>()
                        throw r5
                    L_0x0068:
                        I1.h r5 = (I1.h) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L_0x006f:
                        I1.j r5 = (I1.j) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: I1.m.g.b.a.emit(java.lang.Object, qf.d):java.lang.Object");
                }
            }

            public b(C5694f fVar) {
                this.f2743a = fVar;
            }

            public Object collect(C5695g gVar, C6658d dVar) {
                Object collect = this.f2743a.collect(new a(gVar), dVar);
                if (collect == C6680b.f()) {
                    return collect;
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(m mVar, C6658d dVar) {
            super(2, dVar);
            this.f2739c = mVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            g gVar = new g(this.f2739c, dVar);
            gVar.f2738b = obj;
            return gVar;
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((g) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f2737a;
            if (i10 == 0) {
                w.b(obj);
                C5695g gVar = (C5695g) this.f2738b;
                n nVar = (n) this.f2739c.f2723h.getValue();
                if (!(nVar instanceof c)) {
                    this.f2739c.f2725j.e(new b.a(nVar));
                }
                b bVar = new b(C5696h.p(this.f2739c.f2723h, new a(nVar, (C6658d) null)));
                this.f2737a = 1;
                if (C5696h.r(gVar, bVar, this) == f10) {
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

    static final class h extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f2748a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(m mVar) {
            super(0);
            this.f2748a = mVar;
        }

        /* renamed from: a */
        public final File invoke() {
            File file = (File) this.f2748a.f2716a.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = m.f2713k;
            synchronized (aVar.b()) {
                if (!aVar.a().contains(absolutePath)) {
                    Set a10 = aVar.a();
                    C6496s.g(absolutePath, "it");
                    a10.add(absolutePath);
                } else {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
            }
            return file;
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f2749a;

        /* renamed from: b  reason: collision with root package name */
        Object f2750b;

        /* renamed from: c  reason: collision with root package name */
        Object f2751c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f2752d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f2753e;

        /* renamed from: f  reason: collision with root package name */
        int f2754f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(m mVar, C6658d dVar) {
            super(dVar);
            this.f2753e = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f2752d = obj;
            this.f2754f |= Integer.MIN_VALUE;
            return this.f2753e.s((b.C0047b) null, this);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f2755a;

        /* renamed from: b  reason: collision with root package name */
        Object f2756b;

        /* renamed from: c  reason: collision with root package name */
        Object f2757c;

        /* renamed from: d  reason: collision with root package name */
        Object f2758d;

        /* renamed from: e  reason: collision with root package name */
        Object f2759e;

        /* renamed from: f  reason: collision with root package name */
        Object f2760f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f2761g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m f2762h;

        /* renamed from: i  reason: collision with root package name */
        int f2763i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(m mVar, C6658d dVar) {
            super(dVar);
            this.f2762h = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f2761g = obj;
            this.f2763i |= Integer.MIN_VALUE;
            return this.f2762h.t(this);
        }
    }

    public static final class k implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5817a f2764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ J f2765b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f2766c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f2767d;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f2768a;

            /* renamed from: b  reason: collision with root package name */
            Object f2769b;

            /* renamed from: c  reason: collision with root package name */
            Object f2770c;

            /* renamed from: d  reason: collision with root package name */
            Object f2771d;

            /* renamed from: e  reason: collision with root package name */
            Object f2772e;

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f2773f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ k f2774g;

            /* renamed from: h  reason: collision with root package name */
            int f2775h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar, C6658d dVar) {
                super(dVar);
                this.f2774g = kVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f2773f = obj;
                this.f2775h |= Integer.MIN_VALUE;
                return this.f2774g.a((yf.p) null, this);
            }
        }

        k(C5817a aVar, J j10, kotlin.jvm.internal.N n10, m mVar) {
            this.f2764a = aVar;
            this.f2765b = j10;
            this.f2766c = n10;
            this.f2767d = mVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[Catch:{ all -> 0x00d7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba A[Catch:{ all -> 0x0056 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[Catch:{ all -> 0x003b }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00da A[SYNTHETIC, Splitter:B:49:0x00da] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(yf.p r11, qf.C6658d r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof I1.m.k.a
                if (r0 == 0) goto L_0x0013
                r0 = r12
                I1.m$k$a r0 = (I1.m.k.a) r0
                int r1 = r0.f2775h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f2775h = r1
                goto L_0x0018
            L_0x0013:
                I1.m$k$a r0 = new I1.m$k$a
                r0.<init>(r10, r12)
            L_0x0018:
                java.lang.Object r12 = r0.f2773f
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f2775h
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0076
                if (r2 == r5) goto L_0x005a
                if (r2 == r4) goto L_0x0046
                if (r2 != r3) goto L_0x003e
                java.lang.Object r11 = r0.f2770c
                java.lang.Object r1 = r0.f2769b
                kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                java.lang.Object r0 = r0.f2768a
                dh.a r0 = (dh.C5817a) r0
                lf.w.b(r12)     // Catch:{ all -> 0x003b }
                goto L_0x00cc
            L_0x003b:
                r11 = move-exception
                goto L_0x00e2
            L_0x003e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0046:
                java.lang.Object r11 = r0.f2770c
                I1.m r11 = (I1.m) r11
                java.lang.Object r2 = r0.f2769b
                kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
                java.lang.Object r4 = r0.f2768a
                dh.a r4 = (dh.C5817a) r4
                lf.w.b(r12)     // Catch:{ all -> 0x0056 }
                goto L_0x00b2
            L_0x0056:
                r11 = move-exception
                r0 = r4
                goto L_0x00e2
            L_0x005a:
                java.lang.Object r11 = r0.f2772e
                I1.m r11 = (I1.m) r11
                java.lang.Object r2 = r0.f2771d
                kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
                java.lang.Object r5 = r0.f2770c
                kotlin.jvm.internal.J r5 = (kotlin.jvm.internal.J) r5
                java.lang.Object r7 = r0.f2769b
                dh.a r7 = (dh.C5817a) r7
                java.lang.Object r8 = r0.f2768a
                yf.p r8 = (yf.p) r8
                lf.w.b(r12)
                r12 = r7
                r9 = r8
                r8 = r11
                r11 = r9
                goto L_0x0096
            L_0x0076:
                lf.w.b(r12)
                dh.a r12 = r10.f2764a
                kotlin.jvm.internal.J r2 = r10.f2765b
                kotlin.jvm.internal.N r7 = r10.f2766c
                I1.m r8 = r10.f2767d
                r0.f2768a = r11
                r0.f2769b = r12
                r0.f2770c = r2
                r0.f2771d = r7
                r0.f2772e = r8
                r0.f2775h = r5
                java.lang.Object r5 = r12.a(r6, r0)
                if (r5 != r1) goto L_0x0094
                return r1
            L_0x0094:
                r5 = r2
                r2 = r7
            L_0x0096:
                boolean r5 = r5.f71755a     // Catch:{ all -> 0x00d7 }
                if (r5 != 0) goto L_0x00da
                java.lang.Object r5 = r2.f71759a     // Catch:{ all -> 0x00d7 }
                r0.f2768a = r12     // Catch:{ all -> 0x00d7 }
                r0.f2769b = r2     // Catch:{ all -> 0x00d7 }
                r0.f2770c = r8     // Catch:{ all -> 0x00d7 }
                r0.f2771d = r6     // Catch:{ all -> 0x00d7 }
                r0.f2772e = r6     // Catch:{ all -> 0x00d7 }
                r0.f2775h = r4     // Catch:{ all -> 0x00d7 }
                java.lang.Object r11 = r11.invoke(r5, r0)     // Catch:{ all -> 0x00d7 }
                if (r11 != r1) goto L_0x00af
                return r1
            L_0x00af:
                r4 = r12
                r12 = r11
                r11 = r8
            L_0x00b2:
                java.lang.Object r5 = r2.f71759a     // Catch:{ all -> 0x0056 }
                boolean r5 = kotlin.jvm.internal.C6496s.c(r12, r5)     // Catch:{ all -> 0x0056 }
                if (r5 != 0) goto L_0x00d0
                r0.f2768a = r4     // Catch:{ all -> 0x0056 }
                r0.f2769b = r2     // Catch:{ all -> 0x0056 }
                r0.f2770c = r12     // Catch:{ all -> 0x0056 }
                r0.f2775h = r3     // Catch:{ all -> 0x0056 }
                java.lang.Object r11 = r11.z(r12, r0)     // Catch:{ all -> 0x0056 }
                if (r11 != r1) goto L_0x00c9
                return r1
            L_0x00c9:
                r11 = r12
                r1 = r2
                r0 = r4
            L_0x00cc:
                r1.f71759a = r11     // Catch:{ all -> 0x003b }
                r2 = r1
                goto L_0x00d1
            L_0x00d0:
                r0 = r4
            L_0x00d1:
                java.lang.Object r11 = r2.f71759a     // Catch:{ all -> 0x003b }
                r0.e(r6)
                return r11
            L_0x00d7:
                r11 = move-exception
                r0 = r12
                goto L_0x00e2
            L_0x00da:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d7 }
                java.lang.String r0 = "InitializerApi.updateData should not be called after initialization is complete."
                r11.<init>(r0)     // Catch:{ all -> 0x00d7 }
                throw r11     // Catch:{ all -> 0x00d7 }
            L_0x00e2:
                r0.e(r6)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: I1.m.k.a(yf.p, qf.d):java.lang.Object");
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f2776a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f2777b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f2778c;

        /* renamed from: d  reason: collision with root package name */
        int f2779d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(m mVar, C6658d dVar) {
            super(dVar);
            this.f2778c = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f2777b = obj;
            this.f2779d |= Integer.MIN_VALUE;
            return this.f2778c.u(this);
        }
    }

    /* renamed from: I1.m$m  reason: collision with other inner class name */
    static final class C0049m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f2780a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f2781b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f2782c;

        /* renamed from: d  reason: collision with root package name */
        int f2783d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0049m(m mVar, C6658d dVar) {
            super(dVar);
            this.f2782c = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f2781b = obj;
            this.f2783d |= Integer.MIN_VALUE;
            return this.f2782c.v(this);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f2784a;

        /* renamed from: b  reason: collision with root package name */
        Object f2785b;

        /* renamed from: c  reason: collision with root package name */
        Object f2786c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f2787d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f2788e;

        /* renamed from: f  reason: collision with root package name */
        int f2789f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(m mVar, C6658d dVar) {
            super(dVar);
            this.f2788e = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f2787d = obj;
            this.f2789f |= Integer.MIN_VALUE;
            return this.f2788e.w(this);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f2790a;

        /* renamed from: b  reason: collision with root package name */
        Object f2791b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f2792c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f2793d;

        /* renamed from: e  reason: collision with root package name */
        int f2794e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(m mVar, C6658d dVar) {
            super(dVar);
            this.f2793d = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f2792c = obj;
            this.f2794e |= Integer.MIN_VALUE;
            return this.f2793d.x(this);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f2795a;

        /* renamed from: b  reason: collision with root package name */
        Object f2796b;

        /* renamed from: c  reason: collision with root package name */
        Object f2797c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f2798d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f2799e;

        /* renamed from: f  reason: collision with root package name */
        int f2800f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(m mVar, C6658d dVar) {
            super(dVar);
            this.f2799e = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f2798d = obj;
            this.f2800f |= Integer.MIN_VALUE;
            return this.f2799e.y((yf.p) null, (qf.g) null, this);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f2801a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ yf.p f2802b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f2803c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(yf.p pVar, Object obj, C6658d dVar) {
            super(2, dVar);
            this.f2802b = pVar;
            this.f2803c = obj;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new q(this.f2802b, this.f2803c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((q) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f2801a;
            if (i10 == 0) {
                w.b(obj);
                yf.p pVar = this.f2802b;
                Object obj2 = this.f2803c;
                this.f2801a = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f2804a;

        /* renamed from: b  reason: collision with root package name */
        Object f2805b;

        /* renamed from: c  reason: collision with root package name */
        Object f2806c;

        /* renamed from: d  reason: collision with root package name */
        Object f2807d;

        /* renamed from: e  reason: collision with root package name */
        Object f2808e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f2809f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m f2810g;

        /* renamed from: h  reason: collision with root package name */
        int f2811h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(m mVar, C6658d dVar) {
            super(dVar);
            this.f2810g = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f2809f = obj;
            this.f2811h |= Integer.MIN_VALUE;
            return this.f2810g.z((Object) null, this);
        }
    }

    public m(C6787a aVar, k kVar, List list, b bVar, K k10) {
        C6496s.h(aVar, "produceFile");
        C6496s.h(kVar, "serializer");
        C6496s.h(list, "initTasksList");
        C6496s.h(bVar, "corruptionHandler");
        C6496s.h(k10, "scope");
        this.f2716a = aVar;
        this.f2717b = kVar;
        this.f2718c = bVar;
        this.f2719d = k10;
        this.f2724i = C6565s.e1(list);
        this.f2725j = new l(k10, new d(this), e.f2733a, new f(this, (C6658d) null));
    }

    private final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(C6496s.o("Unable to create parent directories of ", file));
            }
        }
    }

    /* access modifiers changed from: private */
    public final File q() {
        return (File) this.f2722g.getValue();
    }

    /* access modifiers changed from: private */
    public final Object r(b.a aVar, C6658d dVar) {
        n nVar = (n) this.f2723h.getValue();
        if (!(nVar instanceof c)) {
            if (nVar instanceof j) {
                if (nVar == aVar.a()) {
                    Object v10 = v(dVar);
                    if (v10 == C6680b.f()) {
                        return v10;
                    }
                    return C6514M.f71813a;
                }
            } else if (C6496s.c(nVar, o.f2812a)) {
                Object v11 = v(dVar);
                if (v11 == C6680b.f()) {
                    return v11;
                }
                return C6514M.f71813a;
            } else if (nVar instanceof h) {
                throw new IllegalStateException("Can't read in final state.");
            }
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(I1.m.b.C0047b r9, qf.C6658d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof I1.m.i
            if (r0 == 0) goto L_0x0013
            r0 = r10
            I1.m$i r0 = (I1.m.i) r0
            int r1 = r0.f2754f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2754f = r1
            goto L_0x0018
        L_0x0013:
            I1.m$i r0 = new I1.m$i
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f2752d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f2754f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x0051
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r9 = r0.f2749a
            Ug.w r9 = (Ug.C5599w) r9
        L_0x002f:
            lf.w.b(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x00be
        L_0x0034:
            r10 = move-exception
            goto L_0x00db
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            java.lang.Object r9 = r0.f2751c
            Ug.w r9 = (Ug.C5599w) r9
            java.lang.Object r2 = r0.f2750b
            I1.m r2 = (I1.m) r2
            java.lang.Object r4 = r0.f2749a
            I1.m$b$b r4 = (I1.m.b.C0047b) r4
            lf.w.b(r10)     // Catch:{ all -> 0x0034 }
            r10 = r9
            r9 = r4
            goto L_0x00a6
        L_0x0051:
            java.lang.Object r9 = r0.f2749a
            Ug.w r9 = (Ug.C5599w) r9
            goto L_0x002f
        L_0x0056:
            lf.w.b(r10)
            Ug.w r10 = r9.a()
            lf.v$a r2 = lf.v.f71841b     // Catch:{ all -> 0x0082 }
            Xg.x r2 = r8.f2723h     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0082 }
            I1.n r2 = (I1.n) r2     // Catch:{ all -> 0x0082 }
            boolean r6 = r2 instanceof I1.c     // Catch:{ all -> 0x0082 }
            if (r6 == 0) goto L_0x0087
            yf.p r2 = r9.d()     // Catch:{ all -> 0x0082 }
            qf.g r9 = r9.b()     // Catch:{ all -> 0x0082 }
            r0.f2749a = r10     // Catch:{ all -> 0x0082 }
            r0.f2754f = r5     // Catch:{ all -> 0x0082 }
            java.lang.Object r9 = r8.y(r2, r9, r0)     // Catch:{ all -> 0x0082 }
            if (r9 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00be
        L_0x0082:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00db
        L_0x0087:
            boolean r6 = r2 instanceof I1.j     // Catch:{ all -> 0x0082 }
            if (r6 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            boolean r5 = r2 instanceof I1.o     // Catch:{ all -> 0x0082 }
        L_0x008e:
            if (r5 == 0) goto L_0x00ca
            I1.n r5 = r9.c()     // Catch:{ all -> 0x0082 }
            if (r2 != r5) goto L_0x00c3
            r0.f2749a = r9     // Catch:{ all -> 0x0082 }
            r0.f2750b = r8     // Catch:{ all -> 0x0082 }
            r0.f2751c = r10     // Catch:{ all -> 0x0082 }
            r0.f2754f = r4     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r8.u(r0)     // Catch:{ all -> 0x0082 }
            if (r2 != r1) goto L_0x00a5
            return r1
        L_0x00a5:
            r2 = r8
        L_0x00a6:
            yf.p r4 = r9.d()     // Catch:{ all -> 0x0082 }
            qf.g r9 = r9.b()     // Catch:{ all -> 0x0082 }
            r0.f2749a = r10     // Catch:{ all -> 0x0082 }
            r5 = 0
            r0.f2750b = r5     // Catch:{ all -> 0x0082 }
            r0.f2751c = r5     // Catch:{ all -> 0x0082 }
            r0.f2754f = r3     // Catch:{ all -> 0x0082 }
            java.lang.Object r9 = r2.y(r4, r9, r0)     // Catch:{ all -> 0x0082 }
            if (r9 != r1) goto L_0x007e
            return r1
        L_0x00be:
            java.lang.Object r10 = lf.v.b(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x00e5
        L_0x00c3:
            I1.j r2 = (I1.j) r2     // Catch:{ all -> 0x0082 }
            java.lang.Throwable r9 = r2.a()     // Catch:{ all -> 0x0082 }
            throw r9     // Catch:{ all -> 0x0082 }
        L_0x00ca:
            boolean r9 = r2 instanceof I1.h     // Catch:{ all -> 0x0082 }
            if (r9 == 0) goto L_0x00d5
            I1.h r2 = (I1.h) r2     // Catch:{ all -> 0x0082 }
            java.lang.Throwable r9 = r2.a()     // Catch:{ all -> 0x0082 }
            throw r9     // Catch:{ all -> 0x0082 }
        L_0x00d5:
            lf.s r9 = new lf.s     // Catch:{ all -> 0x0082 }
            r9.<init>()     // Catch:{ all -> 0x0082 }
            throw r9     // Catch:{ all -> 0x0082 }
        L_0x00db:
            lf.v$a r0 = lf.v.f71841b
            java.lang.Object r10 = lf.w.a(r10)
            java.lang.Object r10 = lf.v.b(r10)
        L_0x00e5:
            Ug.C5603y.c(r9, r10)
            lf.M r9 = lf.C6514M.f71813a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.m.s(I1.m$b$b, qf.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(qf.C6658d r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof I1.m.j
            if (r0 == 0) goto L_0x0013
            r0 = r14
            I1.m$j r0 = (I1.m.j) r0
            int r1 = r0.f2763i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2763i = r1
            goto L_0x0018
        L_0x0013:
            I1.m$j r0 = new I1.m$j
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f2761g
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f2763i
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x007b
            if (r2 == r6) goto L_0x0067
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r1 = r0.f2758d
            dh.a r1 = (dh.C5817a) r1
            java.lang.Object r2 = r0.f2757c
            kotlin.jvm.internal.J r2 = (kotlin.jvm.internal.J) r2
            java.lang.Object r3 = r0.f2756b
            kotlin.jvm.internal.N r3 = (kotlin.jvm.internal.N) r3
            java.lang.Object r0 = r0.f2755a
            I1.m r0 = (I1.m) r0
            lf.w.b(r14)
            goto L_0x0117
        L_0x0042:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x004a:
            java.lang.Object r2 = r0.f2760f
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r8 = r0.f2759e
            I1.m$k r8 = (I1.m.k) r8
            java.lang.Object r9 = r0.f2758d
            kotlin.jvm.internal.J r9 = (kotlin.jvm.internal.J) r9
            java.lang.Object r10 = r0.f2757c
            kotlin.jvm.internal.N r10 = (kotlin.jvm.internal.N) r10
            java.lang.Object r11 = r0.f2756b
            dh.a r11 = (dh.C5817a) r11
            java.lang.Object r12 = r0.f2755a
            I1.m r12 = (I1.m) r12
            lf.w.b(r14)
            goto L_0x00d8
        L_0x0067:
            java.lang.Object r2 = r0.f2758d
            kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
            java.lang.Object r8 = r0.f2757c
            kotlin.jvm.internal.N r8 = (kotlin.jvm.internal.N) r8
            java.lang.Object r9 = r0.f2756b
            dh.a r9 = (dh.C5817a) r9
            java.lang.Object r10 = r0.f2755a
            I1.m r10 = (I1.m) r10
            lf.w.b(r14)
            goto L_0x00b8
        L_0x007b:
            lf.w.b(r14)
            Xg.x r14 = r13.f2723h
            java.lang.Object r14 = r14.getValue()
            I1.o r2 = I1.o.f2812a
            boolean r14 = kotlin.jvm.internal.C6496s.c(r14, r2)
            if (r14 != 0) goto L_0x0099
            Xg.x r14 = r13.f2723h
            java.lang.Object r14 = r14.getValue()
            boolean r14 = r14 instanceof I1.j
            if (r14 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r14 = r5
            goto L_0x009a
        L_0x0099:
            r14 = r6
        L_0x009a:
            if (r14 == 0) goto L_0x0138
            dh.a r9 = dh.c.b(r5, r6, r7)
            kotlin.jvm.internal.N r2 = new kotlin.jvm.internal.N
            r2.<init>()
            r0.f2755a = r13
            r0.f2756b = r9
            r0.f2757c = r2
            r0.f2758d = r2
            r0.f2763i = r6
            java.lang.Object r14 = r13.x(r0)
            if (r14 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r10 = r13
            r8 = r2
        L_0x00b8:
            r2.f71759a = r14
            kotlin.jvm.internal.J r14 = new kotlin.jvm.internal.J
            r14.<init>()
            I1.m$k r2 = new I1.m$k
            r2.<init>(r9, r14, r8, r10)
            java.util.List r11 = r10.f2724i
            if (r11 != 0) goto L_0x00cc
            r2 = r14
            r14 = r0
            r0 = r10
            goto L_0x00fe
        L_0x00cc:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r11
            r11 = r9
            r9 = r14
        L_0x00d8:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00f9
            java.lang.Object r14 = r2.next()
            yf.p r14 = (yf.p) r14
            r0.f2755a = r12
            r0.f2756b = r11
            r0.f2757c = r10
            r0.f2758d = r9
            r0.f2759e = r8
            r0.f2760f = r2
            r0.f2763i = r4
            java.lang.Object r14 = r14.invoke(r8, r0)
            if (r14 != r1) goto L_0x00d8
            return r1
        L_0x00f9:
            r14 = r0
            r2 = r9
            r8 = r10
            r9 = r11
            r0 = r12
        L_0x00fe:
            r0.f2724i = r7
            r14.f2755a = r0
            r14.f2756b = r8
            r14.f2757c = r2
            r14.f2758d = r9
            r14.f2759e = r7
            r14.f2760f = r7
            r14.f2763i = r3
            java.lang.Object r14 = r9.a(r7, r14)
            if (r14 != r1) goto L_0x0115
            return r1
        L_0x0115:
            r3 = r8
            r1 = r9
        L_0x0117:
            r2.f71755a = r6     // Catch:{ all -> 0x0133 }
            lf.M r14 = lf.C6514M.f71813a     // Catch:{ all -> 0x0133 }
            r1.e(r7)
            Xg.x r14 = r0.f2723h
            I1.c r0 = new I1.c
            java.lang.Object r1 = r3.f71759a
            if (r1 == 0) goto L_0x012a
            int r5 = r1.hashCode()
        L_0x012a:
            r0.<init>(r1, r5)
            r14.setValue(r0)
            lf.M r14 = lf.C6514M.f71813a
            return r14
        L_0x0133:
            r14 = move-exception
            r1.e(r7)
            throw r14
        L_0x0138:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.m.t(qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(qf.C6658d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof I1.m.l
            if (r0 == 0) goto L_0x0013
            r0 = r5
            I1.m$l r0 = (I1.m.l) r0
            int r1 = r0.f2779d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2779d = r1
            goto L_0x0018
        L_0x0013:
            I1.m$l r0 = new I1.m$l
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f2777b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f2779d
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f2776a
            I1.m r0 = (I1.m) r0
            lf.w.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r5 = move-exception
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            lf.w.b(r5)
            r0.f2776a = r4     // Catch:{ all -> 0x0048 }
            r0.f2779d = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r4.t(r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            lf.M r5 = lf.C6514M.f71813a
            return r5
        L_0x0048:
            r5 = move-exception
            r0 = r4
        L_0x004a:
            Xg.x r0 = r0.f2723h
            I1.j r1 = new I1.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.m.u(qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(qf.C6658d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof I1.m.C0049m
            if (r0 == 0) goto L_0x0013
            r0 = r5
            I1.m$m r0 = (I1.m.C0049m) r0
            int r1 = r0.f2783d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2783d = r1
            goto L_0x0018
        L_0x0013:
            I1.m$m r0 = new I1.m$m
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f2781b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f2783d
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f2780a
            I1.m r0 = (I1.m) r0
            lf.w.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0051
        L_0x002d:
            r5 = move-exception
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            lf.w.b(r5)
            r0.f2780a = r4     // Catch:{ all -> 0x0045 }
            r0.f2783d = r3     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r4.t(r0)     // Catch:{ all -> 0x0045 }
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0045:
            r5 = move-exception
            r0 = r4
        L_0x0047:
            Xg.x r0 = r0.f2723h
            I1.j r1 = new I1.j
            r1.<init>(r5)
            r0.setValue(r1)
        L_0x0051:
            lf.M r5 = lf.C6514M.f71813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.m.v(qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        wf.C6763c.a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007f, code lost:
        return r0.f2717b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        throw r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:23:0x005f, B:29:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(qf.C6658d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof I1.m.n
            if (r0 == 0) goto L_0x0013
            r0 = r6
            I1.m$n r0 = (I1.m.n) r0
            int r1 = r0.f2789f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2789f = r1
            goto L_0x0018
        L_0x0013:
            I1.m$n r0 = new I1.m$n
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f2787d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f2789f
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f2786c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f2785b
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f2784a
            I1.m r0 = (I1.m) r0
            lf.w.b(r6)     // Catch:{ all -> 0x0035 }
            goto L_0x005f
        L_0x0035:
            r6 = move-exception
            goto L_0x0067
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003f:
            lf.w.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006d }
            java.io.File r6 = r5.q()     // Catch:{ FileNotFoundException -> 0x006d }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x006d }
            I1.k r6 = r5.f2717b     // Catch:{ all -> 0x0065 }
            r0.f2784a = r5     // Catch:{ all -> 0x0065 }
            r0.f2785b = r2     // Catch:{ all -> 0x0065 }
            r4 = 0
            r0.f2786c = r4     // Catch:{ all -> 0x0065 }
            r0.f2789f = r3     // Catch:{ all -> 0x0065 }
            java.lang.Object r6 = r6.b(r2, r0)     // Catch:{ all -> 0x0065 }
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r0 = r5
            r1 = r4
        L_0x005f:
            wf.C6763c.a(r2, r1)     // Catch:{ FileNotFoundException -> 0x0063 }
            return r6
        L_0x0063:
            r6 = move-exception
            goto L_0x006f
        L_0x0065:
            r6 = move-exception
            r0 = r5
        L_0x0067:
            throw r6     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r1 = move-exception
            wf.C6763c.a(r2, r6)     // Catch:{ FileNotFoundException -> 0x0063 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0063 }
        L_0x006d:
            r6 = move-exception
            r0 = r5
        L_0x006f:
            java.io.File r1 = r0.q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0080
            I1.k r6 = r0.f2717b
            java.lang.Object r6 = r6.a()
            return r6
        L_0x0080:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.m.w(qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(qf.C6658d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof I1.m.o
            if (r0 == 0) goto L_0x0013
            r0 = r8
            I1.m$o r0 = (I1.m.o) r0
            int r1 = r0.f2794e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2794e = r1
            goto L_0x0018
        L_0x0013:
            I1.m$o r0 = new I1.m$o
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f2792c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f2794e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f2791b
            java.lang.Object r0 = r0.f2790a
            I1.a r0 = (I1.a) r0
            lf.w.b(r8)     // Catch:{ IOException -> 0x0035 }
            goto L_0x0087
        L_0x0035:
            r8 = move-exception
            goto L_0x008a
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            java.lang.Object r2 = r0.f2791b
            I1.a r2 = (I1.a) r2
            java.lang.Object r4 = r0.f2790a
            I1.m r4 = (I1.m) r4
            lf.w.b(r8)
            goto L_0x0079
        L_0x004b:
            java.lang.Object r2 = r0.f2790a
            I1.m r2 = (I1.m) r2
            lf.w.b(r8)     // Catch:{ a -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r8 = move-exception
            goto L_0x0066
        L_0x0055:
            lf.w.b(r8)
            r0.f2790a = r7     // Catch:{ a -> 0x0064 }
            r0.f2794e = r5     // Catch:{ a -> 0x0064 }
            java.lang.Object r8 = r7.w(r0)     // Catch:{ a -> 0x0064 }
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r8
        L_0x0064:
            r8 = move-exception
            r2 = r7
        L_0x0066:
            I1.b r5 = r2.f2718c
            r0.f2790a = r2
            r0.f2791b = r8
            r0.f2794e = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L_0x0079:
            r0.f2790a = r2     // Catch:{ IOException -> 0x0088 }
            r0.f2791b = r8     // Catch:{ IOException -> 0x0088 }
            r0.f2794e = r3     // Catch:{ IOException -> 0x0088 }
            java.lang.Object r0 = r4.z(r8, r0)     // Catch:{ IOException -> 0x0088 }
            if (r0 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r1 = r8
        L_0x0087:
            return r1
        L_0x0088:
            r8 = move-exception
            r0 = r2
        L_0x008a:
            lf.C6523g.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.m.x(qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(yf.p r8, qf.g r9, qf.C6658d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof I1.m.p
            if (r0 == 0) goto L_0x0013
            r0 = r10
            I1.m$p r0 = (I1.m.p) r0
            int r1 = r0.f2800f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2800f = r1
            goto L_0x0018
        L_0x0013:
            I1.m$p r0 = new I1.m$p
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f2798d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f2800f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r8 = r0.f2796b
            java.lang.Object r9 = r0.f2795a
            I1.m r9 = (I1.m) r9
            lf.w.b(r10)
            goto L_0x008e
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.f2797c
            java.lang.Object r9 = r0.f2796b
            I1.c r9 = (I1.c) r9
            java.lang.Object r2 = r0.f2795a
            I1.m r2 = (I1.m) r2
            lf.w.b(r10)
            goto L_0x0073
        L_0x0049:
            lf.w.b(r10)
            Xg.x r10 = r7.f2723h
            java.lang.Object r10 = r10.getValue()
            I1.c r10 = (I1.c) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            I1.m$q r6 = new I1.m$q
            r6.<init>(r8, r2, r3)
            r0.f2795a = r7
            r0.f2796b = r10
            r0.f2797c = r2
            r0.f2800f = r5
            java.lang.Object r8 = Ug.C5572i.g(r9, r6, r0)
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L_0x0073:
            r9.a()
            boolean r9 = kotlin.jvm.internal.C6496s.c(r8, r10)
            if (r9 == 0) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            r0.f2795a = r2
            r0.f2796b = r10
            r0.f2797c = r3
            r0.f2800f = r4
            java.lang.Object r8 = r2.z(r10, r0)
            if (r8 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r8 = r10
            r9 = r2
        L_0x008e:
            Xg.x r9 = r9.f2723h
            I1.c r10 = new I1.c
            if (r8 == 0) goto L_0x0099
            int r0 = r8.hashCode()
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        L_0x00a0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.m.y(yf.p, qf.g, qf.d):java.lang.Object");
    }

    public Object a(yf.p pVar, C6658d dVar) {
        C5599w b10 = C5603y.b((C5600w0) null, 1, (Object) null);
        this.f2725j.e(new b.C0047b(pVar, b10, (n) this.f2723h.getValue(), dVar.getContext()));
        return b10.y(dVar);
    }

    public C5694f getData() {
        return this.f2720e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bf, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c4, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        wf.C6763c.a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c8, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r9.delete();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:25:0x0092, B:37:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2 A[SYNTHETIC, Splitter:B:30:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(java.lang.Object r8, qf.C6658d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof I1.m.r
            if (r0 == 0) goto L_0x0013
            r0 = r9
            I1.m$r r0 = (I1.m.r) r0
            int r1 = r0.f2811h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2811h = r1
            goto L_0x0018
        L_0x0013:
            I1.m$r r0 = new I1.m$r
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f2809f
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f2811h
            r3 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r8 = r0.f2808e
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f2807d
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f2806c
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f2805b
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f2804a
            I1.m r0 = (I1.m) r0
            lf.w.b(r9)     // Catch:{ all -> 0x003d }
            goto L_0x0089
        L_0x003d:
            r8 = move-exception
            goto L_0x00c3
        L_0x0040:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0048:
            lf.w.b(r9)
            java.io.File r9 = r7.q()
            r7.p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.q()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f2721f
            java.lang.String r2 = kotlin.jvm.internal.C6496s.o(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c9 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x00c9 }
            I1.k r4 = r7.f2717b     // Catch:{ all -> 0x00c1 }
            I1.m$c r5 = new I1.m$c     // Catch:{ all -> 0x00c1 }
            r5.<init>(r2)     // Catch:{ all -> 0x00c1 }
            r0.f2804a = r7     // Catch:{ all -> 0x00c1 }
            r0.f2805b = r9     // Catch:{ all -> 0x00c1 }
            r0.f2806c = r2     // Catch:{ all -> 0x00c1 }
            r6 = 0
            r0.f2807d = r6     // Catch:{ all -> 0x00c1 }
            r0.f2808e = r2     // Catch:{ all -> 0x00c1 }
            r0.f2811h = r3     // Catch:{ all -> 0x00c1 }
            java.lang.Object r8 = r4.c(r8, r5, r0)     // Catch:{ all -> 0x00c1 }
            if (r8 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L_0x0089:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch:{ all -> 0x003d }
            r8.sync()     // Catch:{ all -> 0x003d }
            lf.M r8 = lf.C6514M.f71813a     // Catch:{ all -> 0x003d }
            wf.C6763c.a(r2, r1)     // Catch:{ IOException -> 0x00be }
            java.io.File r8 = r0.q()     // Catch:{ IOException -> 0x00be }
            boolean r8 = r3.renameTo(r8)     // Catch:{ IOException -> 0x00be }
            if (r8 == 0) goto L_0x00a2
            lf.M r8 = lf.C6514M.f71813a
            return r8
        L_0x00a2:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x00be }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00be }
            r9.<init>()     // Catch:{ IOException -> 0x00be }
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch:{ IOException -> 0x00be }
            r9.append(r3)     // Catch:{ IOException -> 0x00be }
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch:{ IOException -> 0x00be }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x00be }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00be }
            throw r8     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            r8 = move-exception
            r9 = r3
            goto L_0x00ca
        L_0x00c1:
            r8 = move-exception
            r3 = r9
        L_0x00c3:
            throw r8     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r9 = move-exception
            wf.C6763c.a(r2, r8)     // Catch:{ IOException -> 0x00be }
            throw r9     // Catch:{ IOException -> 0x00be }
        L_0x00c9:
            r8 = move-exception
        L_0x00ca:
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x00d3
            r9.delete()
        L_0x00d3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.m.z(java.lang.Object, qf.d):java.lang.Object");
    }
}
