package Xg;

import kotlin.jvm.internal.L;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import yf.p;

abstract /* synthetic */ class u {

    public static final class a implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f66688a;

        /* renamed from: Xg.u$a$a  reason: collision with other inner class name */
        public static final class C0975a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5695g f66689a;

            /* renamed from: Xg.u$a$a$a  reason: collision with other inner class name */
            public static final class C0976a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f66690a;

                /* renamed from: b  reason: collision with root package name */
                int f66691b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C0975a f66692c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0976a(C0975a aVar, C6658d dVar) {
                    super(dVar);
                    this.f66692c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f66690a = obj;
                    this.f66691b |= Integer.MIN_VALUE;
                    return this.f66692c.emit((Object) null, this);
                }
            }

            public C0975a(C5695g gVar) {
                this.f66689a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, qf.C6658d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Xg.u.a.C0975a.C0976a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Xg.u$a$a$a r0 = (Xg.u.a.C0975a.C0976a) r0
                    int r1 = r0.f66691b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f66691b = r1
                    goto L_0x0018
                L_0x0013:
                    Xg.u$a$a$a r0 = new Xg.u$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f66690a
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f66691b
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    lf.w.b(r6)
                    goto L_0x0041
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    lf.w.b(r6)
                    Xg.g r6 = r4.f66689a
                    if (r5 == 0) goto L_0x0041
                    r0.f66691b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0041
                    return r1
                L_0x0041:
                    lf.M r5 = lf.C6514M.f71813a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Xg.u.a.C0975a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        public a(C5694f fVar) {
            this.f66688a = fVar;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object collect = this.f66688a.collect(new C0975a(gVar), dVar);
            if (collect == C6680b.f()) {
                return collect;
            }
            return C6514M.f71813a;
        }
    }

    public static final class b implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f66693a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f66694b;

        public static final class a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5695g f66695a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f66696b;

            /* renamed from: Xg.u$b$a$a  reason: collision with other inner class name */
            public static final class C0977a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f66697a;

                /* renamed from: b  reason: collision with root package name */
                int f66698b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a f66699c;

                /* renamed from: d  reason: collision with root package name */
                Object f66700d;

                /* renamed from: e  reason: collision with root package name */
                Object f66701e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0977a(a aVar, C6658d dVar) {
                    super(dVar);
                    this.f66699c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f66697a = obj;
                    this.f66698b |= Integer.MIN_VALUE;
                    return this.f66699c.emit((Object) null, this);
                }
            }

            public a(C5695g gVar, p pVar) {
                this.f66695a = gVar;
                this.f66696b = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, qf.C6658d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof Xg.u.b.a.C0977a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    Xg.u$b$a$a r0 = (Xg.u.b.a.C0977a) r0
                    int r1 = r0.f66698b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f66698b = r1
                    goto L_0x0018
                L_0x0013:
                    Xg.u$b$a$a r0 = new Xg.u$b$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f66697a
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f66698b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    lf.w.b(r7)
                    goto L_0x006a
                L_0x002c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0034:
                    java.lang.Object r6 = r0.f66701e
                    Xg.g r6 = (Xg.C5695g) r6
                    java.lang.Object r2 = r0.f66700d
                    lf.w.b(r7)
                    goto L_0x005c
                L_0x003e:
                    lf.w.b(r7)
                    Xg.g r7 = r5.f66695a
                    yf.p r2 = r5.f66696b
                    r0.f66700d = r6
                    r0.f66701e = r7
                    r0.f66698b = r4
                    r4 = 6
                    kotlin.jvm.internal.C6495q.a(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.C6495q.a(r4)
                    if (r2 != r1) goto L_0x005a
                    return r1
                L_0x005a:
                    r2 = r6
                    r6 = r7
                L_0x005c:
                    r7 = 0
                    r0.f66700d = r7
                    r0.f66701e = r7
                    r0.f66698b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L_0x006a
                    return r1
                L_0x006a:
                    lf.M r6 = lf.C6514M.f71813a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Xg.u.b.a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        public b(C5694f fVar, p pVar) {
            this.f66693a = fVar;
            this.f66694b = pVar;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object collect = this.f66693a.collect(new a(gVar, this.f66694b), dVar);
            if (collect == C6680b.f()) {
                return collect;
            }
            return C6514M.f71813a;
        }
    }

    public static final class c implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f66702a;

        public c(C5694f fVar) {
            this.f66702a = fVar;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object collect = this.f66702a.collect(new d(gVar, new L()), dVar);
            if (collect == C6680b.f()) {
                return collect;
            }
            return C6514M.f71813a;
        }
    }

    static final class d implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5695g f66703a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ L f66704b;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f66705a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f66706b;

            /* renamed from: c  reason: collision with root package name */
            int f66707c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, C6658d dVar2) {
                super(dVar2);
                this.f66706b = dVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66705a = obj;
                this.f66707c |= Integer.MIN_VALUE;
                return this.f66706b.emit((Object) null, this);
            }
        }

        d(C5695g gVar, L l10) {
            this.f66703a = gVar;
            this.f66704b = l10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r8, qf.C6658d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof Xg.u.d.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                Xg.u$d$a r0 = (Xg.u.d.a) r0
                int r1 = r0.f66707c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66707c = r1
                goto L_0x0018
            L_0x0013:
                Xg.u$d$a r0 = new Xg.u$d$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f66705a
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66707c
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                lf.w.b(r9)
                goto L_0x004e
            L_0x0029:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0031:
                lf.w.b(r9)
                Xg.g r9 = r7.f66703a
                mf.I r2 = new mf.I
                kotlin.jvm.internal.L r4 = r7.f66704b
                int r5 = r4.f71757a
                int r6 = r5 + 1
                r4.f71757a = r6
                if (r5 < 0) goto L_0x0051
                r2.<init>(r5, r8)
                r0.f66707c = r3
                java.lang.Object r8 = r9.emit(r2, r0)
                if (r8 != r1) goto L_0x004e
                return r1
            L_0x004e:
                lf.M r8 = lf.C6514M.f71813a
                return r8
            L_0x0051:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.u.d.emit(java.lang.Object, qf.d):java.lang.Object");
        }
    }

    public static final C5694f a(C5694f fVar) {
        return new a(fVar);
    }

    public static final C5694f b(C5694f fVar, p pVar) {
        return new b(fVar, pVar);
    }

    public static final C5694f c(C5694f fVar) {
        return new c(fVar);
    }
}
