package Xg;

import kotlin.jvm.internal.J;
import kotlin.jvm.internal.L;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import yf.p;

/* renamed from: Xg.q  reason: case insensitive filesystem */
abstract /* synthetic */ class C5705q {

    /* renamed from: Xg.q$a */
    public static final class a implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f66611a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f66612b;

        public a(C5694f fVar, int i10) {
            this.f66611a = fVar;
            this.f66612b = i10;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object collect = this.f66611a.collect(new b(new L(), this.f66612b, gVar), dVar);
            if (collect == C6680b.f()) {
                return collect;
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: Xg.q$b */
    static final class b implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L f66613a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f66614b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5695g f66615c;

        /* renamed from: Xg.q$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f66616a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f66617b;

            /* renamed from: c  reason: collision with root package name */
            int f66618c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, C6658d dVar) {
                super(dVar);
                this.f66617b = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66616a = obj;
                this.f66618c |= Integer.MIN_VALUE;
                return this.f66617b.emit((Object) null, this);
            }
        }

        b(L l10, int i10, C5695g gVar) {
            this.f66613a = l10;
            this.f66614b = i10;
            this.f66615c = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r6, qf.C6658d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Xg.C5705q.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                Xg.q$b$a r0 = (Xg.C5705q.b.a) r0
                int r1 = r0.f66618c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66618c = r1
                goto L_0x0018
            L_0x0013:
                Xg.q$b$a r0 = new Xg.q$b$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f66616a
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66618c
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                lf.w.b(r7)
                goto L_0x0047
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                lf.w.b(r7)
                kotlin.jvm.internal.L r7 = r5.f66613a
                int r2 = r7.f71757a
                int r4 = r5.f66614b
                if (r2 < r4) goto L_0x004a
                Xg.g r7 = r5.f66615c
                r0.f66618c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0047
                return r1
            L_0x0047:
                lf.M r6 = lf.C6514M.f71813a
                return r6
            L_0x004a:
                int r2 = r2 + r3
                r7.f71757a = r2
                lf.M r6 = lf.C6514M.f71813a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5705q.b.emit(java.lang.Object, qf.d):java.lang.Object");
        }
    }

    /* renamed from: Xg.q$c */
    public static final class c implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f66619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f66620b;

        public c(C5694f fVar, p pVar) {
            this.f66619a = fVar;
            this.f66620b = pVar;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object collect = this.f66619a.collect(new d(new J(), gVar, this.f66620b), dVar);
            if (collect == C6680b.f()) {
                return collect;
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: Xg.q$d */
    static final class d implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f66621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5695g f66622b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f66623c;

        /* renamed from: Xg.q$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f66624a;

            /* renamed from: b  reason: collision with root package name */
            Object f66625b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f66626c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ d f66627d;

            /* renamed from: e  reason: collision with root package name */
            int f66628e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, C6658d dVar2) {
                super(dVar2);
                this.f66627d = dVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66626c = obj;
                this.f66628e |= Integer.MIN_VALUE;
                return this.f66627d.emit((Object) null, this);
            }
        }

        d(J j10, C5695g gVar, p pVar) {
            this.f66621a = j10;
            this.f66622b = gVar;
            this.f66623c = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r7, qf.C6658d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof Xg.C5705q.d.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                Xg.q$d$a r0 = (Xg.C5705q.d.a) r0
                int r1 = r0.f66628e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66628e = r1
                goto L_0x0018
            L_0x0013:
                Xg.q$d$a r0 = new Xg.q$d$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f66626c
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66628e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 == r5) goto L_0x0041
                if (r2 == r4) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                lf.w.b(r8)
                goto L_0x0088
            L_0x002f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0037:
                java.lang.Object r7 = r0.f66625b
                java.lang.Object r2 = r0.f66624a
                Xg.q$d r2 = (Xg.C5705q.d) r2
                lf.w.b(r8)
                goto L_0x006c
            L_0x0041:
                lf.w.b(r8)
                goto L_0x0059
            L_0x0045:
                lf.w.b(r8)
                kotlin.jvm.internal.J r8 = r6.f66621a
                boolean r8 = r8.f71755a
                if (r8 == 0) goto L_0x005c
                Xg.g r8 = r6.f66622b
                r0.f66628e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0059
                return r1
            L_0x0059:
                lf.M r7 = lf.C6514M.f71813a
                return r7
            L_0x005c:
                yf.p r8 = r6.f66623c
                r0.f66624a = r6
                r0.f66625b = r7
                r0.f66628e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r2 = r6
            L_0x006c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x008b
                kotlin.jvm.internal.J r8 = r2.f66621a
                r8.f71755a = r5
                Xg.g r8 = r2.f66622b
                r2 = 0
                r0.f66624a = r2
                r0.f66625b = r2
                r0.f66628e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0088
                return r1
            L_0x0088:
                lf.M r7 = lf.C6514M.f71813a
                return r7
            L_0x008b:
                lf.M r7 = lf.C6514M.f71813a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5705q.d.emit(java.lang.Object, qf.d):java.lang.Object");
        }
    }

    /* renamed from: Xg.q$e */
    public static final class e implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f66629a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f66630b;

        /* renamed from: Xg.q$e$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f66631a;

            /* renamed from: b  reason: collision with root package name */
            int f66632b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f66633c;

            /* renamed from: d  reason: collision with root package name */
            Object f66634d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(e eVar, C6658d dVar) {
                super(dVar);
                this.f66633c = eVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66631a = obj;
                this.f66632b |= Integer.MIN_VALUE;
                return this.f66633c.collect((C5695g) null, this);
            }
        }

        public e(C5694f fVar, p pVar) {
            this.f66629a = fVar;
            this.f66630b = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(Xg.C5695g r6, qf.C6658d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Xg.C5705q.e.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                Xg.q$e$a r0 = (Xg.C5705q.e.a) r0
                int r1 = r0.f66632b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66632b = r1
                goto L_0x0018
            L_0x0013:
                Xg.q$e$a r0 = new Xg.q$e$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f66631a
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66632b
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r6 = r0.f66634d
                Xg.q$f r6 = (Xg.C5705q.f) r6
                lf.w.b(r7)     // Catch:{ a -> 0x002d }
                goto L_0x0053
            L_0x002d:
                r7 = move-exception
                goto L_0x0050
            L_0x002f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0037:
                lf.w.b(r7)
                Xg.f r7 = r5.f66629a
                Xg.q$f r2 = new Xg.q$f
                yf.p r4 = r5.f66630b
                r2.<init>(r4, r6)
                r0.f66634d = r2     // Catch:{ a -> 0x004e }
                r0.f66632b = r3     // Catch:{ a -> 0x004e }
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch:{ a -> 0x004e }
                if (r6 != r1) goto L_0x0053
                return r1
            L_0x004e:
                r7 = move-exception
                r6 = r2
            L_0x0050:
                Yg.p.a(r7, r6)
            L_0x0053:
                lf.M r6 = lf.C6514M.f71813a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5705q.e.collect(Xg.g, qf.d):java.lang.Object");
        }
    }

    /* renamed from: Xg.q$f */
    public static final class f implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f66635a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5695g f66636b;

        /* renamed from: Xg.q$f$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f66637a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f66638b;

            /* renamed from: c  reason: collision with root package name */
            int f66639c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f f66640d;

            /* renamed from: e  reason: collision with root package name */
            Object f66641e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f fVar, C6658d dVar) {
                super(dVar);
                this.f66640d = fVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66638b = obj;
                this.f66639c |= Integer.MIN_VALUE;
                return this.f66640d.emit((Object) null, this);
            }
        }

        public f(p pVar, C5695g gVar) {
            this.f66635a = pVar;
            this.f66636b = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r8, qf.C6658d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof Xg.C5705q.f.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                Xg.q$f$a r0 = (Xg.C5705q.f.a) r0
                int r1 = r0.f66639c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66639c = r1
                goto L_0x0018
            L_0x0013:
                Xg.q$f$a r0 = new Xg.q$f$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f66638b
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66639c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r8 = r0.f66637a
                Xg.q$f r8 = (Xg.C5705q.f) r8
                lf.w.b(r9)
                goto L_0x007c
            L_0x0030:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0038:
                java.lang.Object r8 = r0.f66641e
                java.lang.Object r2 = r0.f66637a
                Xg.q$f r2 = (Xg.C5705q.f) r2
                lf.w.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L_0x0063
            L_0x0046:
                lf.w.b(r9)
                yf.p r9 = r7.f66635a
                r0.f66637a = r7
                r0.f66641e = r8
                r0.f66639c = r4
                r2 = 6
                kotlin.jvm.internal.C6495q.a(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.C6495q.a(r2)
                if (r9 != r1) goto L_0x0060
                return r1
            L_0x0060:
                r2 = r9
                r9 = r8
                r8 = r7
            L_0x0063:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x007b
                Xg.g r2 = r8.f66636b
                r0.f66637a = r8
                r5 = 0
                r0.f66641e = r5
                r0.f66639c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L_0x007c
                return r1
            L_0x007b:
                r4 = 0
            L_0x007c:
                if (r4 == 0) goto L_0x0081
                lf.M r8 = lf.C6514M.f71813a
                return r8
            L_0x0081:
                Yg.a r9 = new Yg.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5705q.f.emit(java.lang.Object, qf.d):java.lang.Object");
        }
    }

    public static final C5694f a(C5694f fVar, int i10) {
        if (i10 >= 0) {
            return new a(fVar, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    public static final C5694f b(C5694f fVar, p pVar) {
        return new c(fVar, pVar);
    }

    public static final C5694f c(C5694f fVar, p pVar) {
        return new e(fVar, pVar);
    }
}
