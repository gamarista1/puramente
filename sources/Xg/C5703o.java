package Xg;

import kotlin.coroutines.jvm.internal.d;
import qf.C6658d;
import yf.p;
import yf.q;

/* renamed from: Xg.o  reason: case insensitive filesystem */
abstract /* synthetic */ class C5703o {

    /* renamed from: Xg.o$a */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f66577a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f66578b;

        /* renamed from: c  reason: collision with root package name */
        int f66579c;

        a(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f66578b = obj;
            this.f66579c |= Integer.MIN_VALUE;
            return C5703o.c((C5695g) null, (q) null, (Throwable) null, this);
        }
    }

    /* renamed from: Xg.o$b */
    public static final class b implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f66580a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f66581b;

        /* renamed from: Xg.o$b$a */
        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f66582a;

            /* renamed from: b  reason: collision with root package name */
            int f66583b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f66584c;

            /* renamed from: d  reason: collision with root package name */
            Object f66585d;

            /* renamed from: e  reason: collision with root package name */
            Object f66586e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, C6658d dVar) {
                super(dVar);
                this.f66584c = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66582a = obj;
                this.f66583b |= Integer.MIN_VALUE;
                return this.f66584c.collect((C5695g) null, this);
            }
        }

        public b(C5694f fVar, q qVar) {
            this.f66580a = fVar;
            this.f66581b = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(Xg.C5695g r9, qf.C6658d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof Xg.C5703o.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                Xg.o$b$a r0 = (Xg.C5703o.b.a) r0
                int r1 = r0.f66583b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66583b = r1
                goto L_0x0018
            L_0x0013:
                Xg.o$b$a r0 = new Xg.o$b$a
                r0.<init>(r8, r10)
            L_0x0018:
                java.lang.Object r10 = r0.f66582a
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66583b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0054
                if (r2 == r5) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r9 = r0.f66585d
                Yg.u r9 = (Yg.u) r9
                lf.w.b(r10)     // Catch:{ all -> 0x0034 }
                goto L_0x0088
            L_0x0034:
                r10 = move-exception
                goto L_0x0092
            L_0x0036:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L_0x003e:
                java.lang.Object r9 = r0.f66585d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                lf.w.b(r10)
                goto L_0x00ac
            L_0x0046:
                java.lang.Object r9 = r0.f66586e
                Xg.g r9 = (Xg.C5695g) r9
                java.lang.Object r2 = r0.f66585d
                Xg.o$b r2 = (Xg.C5703o.b) r2
                lf.w.b(r10)     // Catch:{ all -> 0x0052 }
                goto L_0x0067
            L_0x0052:
                r9 = move-exception
                goto L_0x0098
            L_0x0054:
                lf.w.b(r10)
                Xg.f r10 = r8.f66580a     // Catch:{ all -> 0x0096 }
                r0.f66585d = r8     // Catch:{ all -> 0x0096 }
                r0.f66586e = r9     // Catch:{ all -> 0x0096 }
                r0.f66583b = r5     // Catch:{ all -> 0x0096 }
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch:{ all -> 0x0096 }
                if (r10 != r1) goto L_0x0066
                return r1
            L_0x0066:
                r2 = r8
            L_0x0067:
                Yg.u r10 = new Yg.u
                qf.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                yf.q r9 = r2.f66581b     // Catch:{ all -> 0x008e }
                r0.f66585d = r10     // Catch:{ all -> 0x008e }
                r0.f66586e = r6     // Catch:{ all -> 0x008e }
                r0.f66583b = r3     // Catch:{ all -> 0x008e }
                r2 = 6
                kotlin.jvm.internal.C6495q.a(r2)     // Catch:{ all -> 0x008e }
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch:{ all -> 0x008e }
                r0 = 7
                kotlin.jvm.internal.C6495q.a(r0)     // Catch:{ all -> 0x008e }
                if (r9 != r1) goto L_0x0087
                return r1
            L_0x0087:
                r9 = r10
            L_0x0088:
                r9.releaseIntercepted()
                lf.M r9 = lf.C6514M.f71813a
                return r9
            L_0x008e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L_0x0092:
                r9.releaseIntercepted()
                throw r10
            L_0x0096:
                r9 = move-exception
                r2 = r8
            L_0x0098:
                Xg.S r10 = new Xg.S
                r10.<init>(r9)
                yf.q r2 = r2.f66581b
                r0.f66585d = r9
                r0.f66586e = r6
                r0.f66583b = r4
                java.lang.Object r10 = Xg.C5703o.c(r10, r2, r9, r0)
                if (r10 != r1) goto L_0x00ac
                return r1
            L_0x00ac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5703o.b.collect(Xg.g, qf.d):java.lang.Object");
        }
    }

    /* renamed from: Xg.o$c */
    public static final class c implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f66587a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5694f f66588b;

        /* renamed from: Xg.o$c$a */
        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f66589a;

            /* renamed from: b  reason: collision with root package name */
            int f66590b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c f66591c;

            /* renamed from: d  reason: collision with root package name */
            Object f66592d;

            /* renamed from: e  reason: collision with root package name */
            Object f66593e;

            /* renamed from: f  reason: collision with root package name */
            Object f66594f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c cVar, C6658d dVar) {
                super(dVar);
                this.f66591c = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66589a = obj;
                this.f66590b |= Integer.MIN_VALUE;
                return this.f66591c.collect((C5695g) null, this);
            }
        }

        public c(p pVar, C5694f fVar) {
            this.f66587a = pVar;
            this.f66588b = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0082 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(Xg.C5695g r7, qf.C6658d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof Xg.C5703o.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                Xg.o$c$a r0 = (Xg.C5703o.c.a) r0
                int r1 = r0.f66590b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66590b = r1
                goto L_0x0018
            L_0x0013:
                Xg.o$c$a r0 = new Xg.o$c$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f66589a
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66590b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                lf.w.b(r8)
                goto L_0x0083
            L_0x002c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0034:
                java.lang.Object r7 = r0.f66594f
                Yg.u r7 = (Yg.u) r7
                java.lang.Object r2 = r0.f66593e
                Xg.g r2 = (Xg.C5695g) r2
                java.lang.Object r4 = r0.f66592d
                Xg.o$c r4 = (Xg.C5703o.c) r4
                lf.w.b(r8)     // Catch:{ all -> 0x0044 }
                goto L_0x006e
            L_0x0044:
                r8 = move-exception
                goto L_0x008a
            L_0x0046:
                lf.w.b(r8)
                Yg.u r8 = new Yg.u
                qf.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                yf.p r2 = r6.f66587a     // Catch:{ all -> 0x0086 }
                r0.f66592d = r6     // Catch:{ all -> 0x0086 }
                r0.f66593e = r7     // Catch:{ all -> 0x0086 }
                r0.f66594f = r8     // Catch:{ all -> 0x0086 }
                r0.f66590b = r4     // Catch:{ all -> 0x0086 }
                r4 = 6
                kotlin.jvm.internal.C6495q.a(r4)     // Catch:{ all -> 0x0086 }
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch:{ all -> 0x0086 }
                r4 = 7
                kotlin.jvm.internal.C6495q.a(r4)     // Catch:{ all -> 0x0086 }
                if (r2 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r4 = r6
                r2 = r7
                r7 = r8
            L_0x006e:
                r7.releaseIntercepted()
                Xg.f r7 = r4.f66588b
                r8 = 0
                r0.f66592d = r8
                r0.f66593e = r8
                r0.f66594f = r8
                r0.f66590b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L_0x0083
                return r1
            L_0x0083:
                lf.M r7 = lf.C6514M.f71813a
                return r7
            L_0x0086:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x008a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5703o.c.collect(Xg.g, qf.d):java.lang.Object");
        }
    }

    public static final void b(C5695g gVar) {
        if (gVar instanceof S) {
            throw ((S) gVar).f66488a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Throwable} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(Xg.C5695g r4, yf.q r5, java.lang.Throwable r6, qf.C6658d r7) {
        /*
            boolean r0 = r7 instanceof Xg.C5703o.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Xg.o$a r0 = (Xg.C5703o.a) r0
            int r1 = r0.f66579c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66579c = r1
            goto L_0x0018
        L_0x0013:
            Xg.o$a r0 = new Xg.o$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f66578b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66579c
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r4 = r0.f66577a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            lf.w.b(r7)     // Catch:{ all -> 0x002e }
            goto L_0x0046
        L_0x002e:
            r4 = move-exception
            goto L_0x0049
        L_0x0030:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0038:
            lf.w.b(r7)
            r0.f66577a = r6     // Catch:{ all -> 0x002e }
            r0.f66579c = r3     // Catch:{ all -> 0x002e }
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch:{ all -> 0x002e }
            if (r4 != r1) goto L_0x0046
            return r1
        L_0x0046:
            lf.M r4 = lf.C6514M.f71813a
            return r4
        L_0x0049:
            if (r6 == 0) goto L_0x0050
            if (r6 == r4) goto L_0x0050
            lf.C6523g.a(r4, r6)
        L_0x0050:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.C5703o.c(Xg.g, yf.q, java.lang.Throwable, qf.d):java.lang.Object");
    }

    public static final C5694f d(C5694f fVar, q qVar) {
        return new b(fVar, qVar);
    }

    public static final C5694f e(C5694f fVar, p pVar) {
        return new c(pVar, fVar);
    }
}
