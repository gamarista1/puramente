package Xg;

import Yg.C5708a;
import kotlin.jvm.internal.N;
import qf.C6658d;
import yf.p;

/* renamed from: Xg.s  reason: case insensitive filesystem */
abstract /* synthetic */ class C5706s {

    /* renamed from: Xg.s$a */
    public static final class a implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f66647a;

        public a(N n10) {
            this.f66647a = n10;
        }

        public Object emit(Object obj, C6658d dVar) {
            this.f66647a.f71759a = obj;
            throw new C5708a(this);
        }
    }

    /* renamed from: Xg.s$b */
    public static final class b implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f66648a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f66649b;

        /* renamed from: Xg.s$b$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f66650a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f66651b;

            /* renamed from: c  reason: collision with root package name */
            int f66652c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b f66653d;

            /* renamed from: e  reason: collision with root package name */
            Object f66654e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, C6658d dVar) {
                super(dVar);
                this.f66653d = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66651b = obj;
                this.f66652c |= Integer.MIN_VALUE;
                return this.f66653d.emit((Object) null, this);
            }
        }

        public b(p pVar, N n10) {
            this.f66648a = pVar;
            this.f66649b = n10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r5, qf.C6658d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof Xg.C5706s.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                Xg.s$b$a r0 = (Xg.C5706s.b.a) r0
                int r1 = r0.f66652c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66652c = r1
                goto L_0x0018
            L_0x0013:
                Xg.s$b$a r0 = new Xg.s$b$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f66651b
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66652c
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.f66654e
                java.lang.Object r0 = r0.f66650a
                Xg.s$b r0 = (Xg.C5706s.b) r0
                lf.w.b(r6)
                goto L_0x0052
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                lf.w.b(r6)
                yf.p r6 = r4.f66648a
                r0.f66650a = r4
                r0.f66654e = r5
                r0.f66652c = r3
                r2 = 6
                kotlin.jvm.internal.C6495q.a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.C6495q.a(r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                r0 = r4
            L_0x0052:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L_0x005d
                lf.M r5 = lf.C6514M.f71813a
                return r5
            L_0x005d:
                kotlin.jvm.internal.N r6 = r0.f66649b
                r6.f71759a = r5
                Yg.a r5 = new Yg.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5706s.b.emit(java.lang.Object, qf.d):java.lang.Object");
        }
    }

    /* renamed from: Xg.s$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f66655a;

        /* renamed from: b  reason: collision with root package name */
        Object f66656b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f66657c;

        /* renamed from: d  reason: collision with root package name */
        int f66658d;

        c(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f66657c = obj;
            this.f66658d |= Integer.MIN_VALUE;
            return C5696h.u((C5694f) null, this);
        }
    }

    /* renamed from: Xg.s$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f66659a;

        /* renamed from: b  reason: collision with root package name */
        Object f66660b;

        /* renamed from: c  reason: collision with root package name */
        Object f66661c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f66662d;

        /* renamed from: e  reason: collision with root package name */
        int f66663e;

        d(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f66662d = obj;
            this.f66663e |= Integer.MIN_VALUE;
            return C5696h.v((C5694f) null, (p) null, this);
        }
    }

    /* renamed from: Xg.s$e */
    public static final class e implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f66664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f66665b;

        /* renamed from: Xg.s$e$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f66666a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f66667b;

            /* renamed from: c  reason: collision with root package name */
            int f66668c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ e f66669d;

            /* renamed from: e  reason: collision with root package name */
            Object f66670e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(e eVar, C6658d dVar) {
                super(dVar);
                this.f66669d = eVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66667b = obj;
                this.f66668c |= Integer.MIN_VALUE;
                return this.f66669d.emit((Object) null, this);
            }
        }

        public e(p pVar, N n10) {
            this.f66664a = pVar;
            this.f66665b = n10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r5, qf.C6658d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof Xg.C5706s.e.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                Xg.s$e$a r0 = (Xg.C5706s.e.a) r0
                int r1 = r0.f66668c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66668c = r1
                goto L_0x0018
            L_0x0013:
                Xg.s$e$a r0 = new Xg.s$e$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f66667b
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66668c
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.f66670e
                java.lang.Object r0 = r0.f66666a
                Xg.s$e r0 = (Xg.C5706s.e) r0
                lf.w.b(r6)
                goto L_0x0052
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                lf.w.b(r6)
                yf.p r6 = r4.f66664a
                r0.f66666a = r4
                r0.f66670e = r5
                r0.f66668c = r3
                r2 = 6
                kotlin.jvm.internal.C6495q.a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.C6495q.a(r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                r0 = r4
            L_0x0052:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L_0x005d
                lf.M r5 = lf.C6514M.f71813a
                return r5
            L_0x005d:
                kotlin.jvm.internal.N r6 = r0.f66665b
                r6.f71759a = r5
                Yg.a r5 = new Yg.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5706s.e.emit(java.lang.Object, qf.d):java.lang.Object");
        }
    }

    /* renamed from: Xg.s$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f66671a;

        /* renamed from: b  reason: collision with root package name */
        Object f66672b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f66673c;

        /* renamed from: d  reason: collision with root package name */
        int f66674d;

        f(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f66673c = obj;
            this.f66674d |= Integer.MIN_VALUE;
            return C5696h.w((C5694f) null, (p) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(Xg.C5694f r4, qf.C6658d r5) {
        /*
            boolean r0 = r5 instanceof Xg.C5706s.c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            Xg.s$c r0 = (Xg.C5706s.c) r0
            int r1 = r0.f66658d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66658d = r1
            goto L_0x0018
        L_0x0013:
            Xg.s$c r0 = new Xg.s$c
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f66657c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66658d
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f66656b
            Xg.s$a r4 = (Xg.C5706s.a) r4
            java.lang.Object r0 = r0.f66655a
            kotlin.jvm.internal.N r0 = (kotlin.jvm.internal.N) r0
            lf.w.b(r5)     // Catch:{ a -> 0x0031 }
            goto L_0x0062
        L_0x0031:
            r5 = move-exception
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            lf.w.b(r5)
            kotlin.jvm.internal.N r5 = new kotlin.jvm.internal.N
            r5.<init>()
            Zg.G r2 = Yg.t.f66850a
            r5.f71759a = r2
            Xg.s$a r2 = new Xg.s$a
            r2.<init>(r5)
            r0.f66655a = r5     // Catch:{ a -> 0x005b }
            r0.f66656b = r2     // Catch:{ a -> 0x005b }
            r0.f66658d = r3     // Catch:{ a -> 0x005b }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ a -> 0x005b }
            if (r4 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r5
            goto L_0x0062
        L_0x005b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005f:
            Yg.p.a(r5, r4)
        L_0x0062:
            java.lang.Object r4 = r0.f71759a
            Zg.G r5 = Yg.t.f66850a
            if (r4 == r5) goto L_0x0069
            return r4
        L_0x0069:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.C5706s.a(Xg.f, qf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(Xg.C5694f r4, yf.p r5, qf.C6658d r6) {
        /*
            boolean r0 = r6 instanceof Xg.C5706s.d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Xg.s$d r0 = (Xg.C5706s.d) r0
            int r1 = r0.f66663e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66663e = r1
            goto L_0x0018
        L_0x0013:
            Xg.s$d r0 = new Xg.s$d
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f66662d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66663e
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r4 = r0.f66661c
            Xg.s$b r4 = (Xg.C5706s.b) r4
            java.lang.Object r5 = r0.f66660b
            kotlin.jvm.internal.N r5 = (kotlin.jvm.internal.N) r5
            java.lang.Object r0 = r0.f66659a
            yf.p r0 = (yf.p) r0
            lf.w.b(r6)     // Catch:{ a -> 0x0035 }
            goto L_0x006a
        L_0x0035:
            r6 = move-exception
            goto L_0x0067
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003f:
            lf.w.b(r6)
            kotlin.jvm.internal.N r6 = new kotlin.jvm.internal.N
            r6.<init>()
            Zg.G r2 = Yg.t.f66850a
            r6.f71759a = r2
            Xg.s$b r2 = new Xg.s$b
            r2.<init>(r5, r6)
            r0.f66659a = r5     // Catch:{ a -> 0x0062 }
            r0.f66660b = r6     // Catch:{ a -> 0x0062 }
            r0.f66661c = r2     // Catch:{ a -> 0x0062 }
            r0.f66663e = r3     // Catch:{ a -> 0x0062 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ a -> 0x0062 }
            if (r4 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r0 = r5
            r5 = r6
            goto L_0x006a
        L_0x0062:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L_0x0067:
            Yg.p.a(r6, r4)
        L_0x006a:
            java.lang.Object r4 = r5.f71759a
            Zg.G r5 = Yg.t.f66850a
            if (r4 == r5) goto L_0x0071
            return r4
        L_0x0071:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.C5706s.b(Xg.f, yf.p, qf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(Xg.C5694f r4, yf.p r5, qf.C6658d r6) {
        /*
            boolean r0 = r6 instanceof Xg.C5706s.f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Xg.s$f r0 = (Xg.C5706s.f) r0
            int r1 = r0.f66674d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66674d = r1
            goto L_0x0018
        L_0x0013:
            Xg.s$f r0 = new Xg.s$f
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f66673c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66674d
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f66672b
            Xg.s$e r4 = (Xg.C5706s.e) r4
            java.lang.Object r5 = r0.f66671a
            kotlin.jvm.internal.N r5 = (kotlin.jvm.internal.N) r5
            lf.w.b(r6)     // Catch:{ a -> 0x0031 }
            goto L_0x005e
        L_0x0031:
            r6 = move-exception
            goto L_0x005b
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            lf.w.b(r6)
            kotlin.jvm.internal.N r6 = new kotlin.jvm.internal.N
            r6.<init>()
            Xg.s$e r2 = new Xg.s$e
            r2.<init>(r5, r6)
            r0.f66671a = r6     // Catch:{ a -> 0x0057 }
            r0.f66672b = r2     // Catch:{ a -> 0x0057 }
            r0.f66674d = r3     // Catch:{ a -> 0x0057 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ a -> 0x0057 }
            if (r4 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r5 = r6
            goto L_0x005e
        L_0x0057:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L_0x005b:
            Yg.p.a(r6, r4)
        L_0x005e:
            java.lang.Object r4 = r5.f71759a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.C5706s.c(Xg.f, yf.p, qf.d):java.lang.Object");
    }
}
