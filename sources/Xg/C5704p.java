package Xg;

import Ug.C5600w0;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;
import qf.C6658d;
import qf.g;
import yf.q;

/* renamed from: Xg.p  reason: case insensitive filesystem */
abstract /* synthetic */ class C5704p {

    /* renamed from: Xg.p$a */
    public static final class a implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f66595a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f66596b;

        /* renamed from: Xg.p$a$a  reason: collision with other inner class name */
        public static final class C0972a extends d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f66597a;

            /* renamed from: b  reason: collision with root package name */
            int f66598b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f66599c;

            /* renamed from: d  reason: collision with root package name */
            Object f66600d;

            /* renamed from: e  reason: collision with root package name */
            Object f66601e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0972a(a aVar, C6658d dVar) {
                super(dVar);
                this.f66599c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66597a = obj;
                this.f66598b |= Integer.MIN_VALUE;
                return this.f66599c.collect((C5695g) null, this);
            }
        }

        public a(C5694f fVar, q qVar) {
            this.f66595a = fVar;
            this.f66596b = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(Xg.C5695g r6, qf.C6658d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Xg.C5704p.a.C0972a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                Xg.p$a$a r0 = (Xg.C5704p.a.C0972a) r0
                int r1 = r0.f66598b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66598b = r1
                goto L_0x0018
            L_0x0013:
                Xg.p$a$a r0 = new Xg.p$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f66597a
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66598b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                lf.w.b(r7)
                goto L_0x006f
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                java.lang.Object r6 = r0.f66601e
                Xg.g r6 = (Xg.C5695g) r6
                java.lang.Object r2 = r0.f66600d
                Xg.p$a r2 = (Xg.C5704p.a) r2
                lf.w.b(r7)
                goto L_0x0053
            L_0x0040:
                lf.w.b(r7)
                Xg.f r7 = r5.f66595a
                r0.f66600d = r5
                r0.f66601e = r6
                r0.f66598b = r4
                java.lang.Object r7 = Xg.C5696h.g(r7, r6, r0)
                if (r7 != r1) goto L_0x0052
                return r1
            L_0x0052:
                r2 = r5
            L_0x0053:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x006f
                yf.q r2 = r2.f66596b
                r4 = 0
                r0.f66600d = r4
                r0.f66601e = r4
                r0.f66598b = r3
                r3 = 6
                kotlin.jvm.internal.C6495q.a(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.C6495q.a(r7)
                if (r6 != r1) goto L_0x006f
                return r1
            L_0x006f:
                lf.M r6 = lf.C6514M.f71813a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5704p.a.collect(Xg.g, qf.d):java.lang.Object");
        }
    }

    /* renamed from: Xg.p$b */
    static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f66602a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f66603b;

        /* renamed from: c  reason: collision with root package name */
        int f66604c;

        b(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f66603b = obj;
            this.f66604c |= Integer.MIN_VALUE;
            return C5696h.g((C5694f) null, (C5695g) null, this);
        }
    }

    /* renamed from: Xg.p$c */
    static final class c implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5695g f66605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f66606b;

        /* renamed from: Xg.p$c$a */
        static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            Object f66607a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f66608b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c f66609c;

            /* renamed from: d  reason: collision with root package name */
            int f66610d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, C6658d dVar) {
                super(dVar);
                this.f66609c = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66608b = obj;
                this.f66610d |= Integer.MIN_VALUE;
                return this.f66609c.emit((Object) null, this);
            }
        }

        c(C5695g gVar, N n10) {
            this.f66605a = gVar;
            this.f66606b = n10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r5, qf.C6658d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof Xg.C5704p.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                Xg.p$c$a r0 = (Xg.C5704p.c.a) r0
                int r1 = r0.f66610d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66610d = r1
                goto L_0x0018
            L_0x0013:
                Xg.p$c$a r0 = new Xg.p$c$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f66608b
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66610d
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.f66607a
                Xg.p$c r5 = (Xg.C5704p.c) r5
                lf.w.b(r6)     // Catch:{ all -> 0x002d }
                goto L_0x0047
            L_0x002d:
                r6 = move-exception
                goto L_0x004c
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                lf.w.b(r6)
                Xg.g r6 = r4.f66605a     // Catch:{ all -> 0x004a }
                r0.f66607a = r4     // Catch:{ all -> 0x004a }
                r0.f66610d = r3     // Catch:{ all -> 0x004a }
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch:{ all -> 0x004a }
                if (r5 != r1) goto L_0x0047
                return r1
            L_0x0047:
                lf.M r5 = lf.C6514M.f71813a
                return r5
            L_0x004a:
                r6 = move-exception
                r5 = r4
            L_0x004c:
                kotlin.jvm.internal.N r5 = r5.f66606b
                r5.f71759a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5704p.c.emit(java.lang.Object, qf.d):java.lang.Object");
        }
    }

    public static final C5694f a(C5694f fVar, q qVar) {
        return new a(fVar, qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(Xg.C5694f r4, Xg.C5695g r5, qf.C6658d r6) {
        /*
            boolean r0 = r6 instanceof Xg.C5704p.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Xg.p$b r0 = (Xg.C5704p.b) r0
            int r1 = r0.f66604c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66604c = r1
            goto L_0x0018
        L_0x0013:
            Xg.p$b r0 = new Xg.p$b
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f66603b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66604c
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.f66602a
            kotlin.jvm.internal.N r4 = (kotlin.jvm.internal.N) r4
            lf.w.b(r6)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            lf.w.b(r6)
            kotlin.jvm.internal.N r6 = new kotlin.jvm.internal.N
            r6.<init>()
            Xg.p$c r2 = new Xg.p$c     // Catch:{ all -> 0x0051 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0051 }
            r0.f66602a = r6     // Catch:{ all -> 0x0051 }
            r0.f66604c = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ all -> 0x0051 }
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = 0
            return r4
        L_0x0051:
            r5 = move-exception
            r4 = r6
        L_0x0053:
            java.lang.Object r4 = r4.f71759a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L_0x0076
            qf.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L_0x0076
            if (r4 != 0) goto L_0x006a
            return r5
        L_0x006a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x0072
            lf.C6523g.a(r4, r5)
            throw r4
        L_0x0072:
            lf.C6523g.a(r5, r4)
            throw r5
        L_0x0076:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.C5704p.b(Xg.f, Xg.g, qf.d):java.lang.Object");
    }

    private static final boolean c(Throwable th2, g gVar) {
        C5600w0 w0Var = (C5600w0) gVar.b(C5600w0.f65416O);
        if (w0Var == null || !w0Var.isCancelled()) {
            return false;
        }
        return d(th2, w0Var.M());
    }

    private static final boolean d(Throwable th2, Throwable th3) {
        if (th3 == null || !C6496s.c(th3, th2)) {
            return false;
        }
        return true;
    }
}
