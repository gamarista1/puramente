package Xg;

import Ug.K;
import Wg.h;
import Wg.r;
import Yg.k;
import Yg.o;
import Yg.t;
import Zg.G;
import ch.C5810i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: Xg.m  reason: case insensitive filesystem */
abstract /* synthetic */ class C5701m {

    /* renamed from: Xg.m$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f66526a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(long j10) {
            super(1);
            this.f66526a = j10;
        }

        /* renamed from: a */
        public final Long invoke(Object obj) {
            return Long.valueOf(this.f66526a);
        }
    }

    /* renamed from: Xg.m$b */
    static final class b extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        Object f66527a;

        /* renamed from: b  reason: collision with root package name */
        Object f66528b;

        /* renamed from: c  reason: collision with root package name */
        int f66529c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f66530d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f66531e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6798l f66532f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5694f f66533g;

        /* renamed from: Xg.m$b$a */
        static final class a extends l implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            int f66534a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5695g f66535b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ N f66536c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5695g gVar, N n10, C6658d dVar) {
                super(1, dVar);
                this.f66535b = gVar;
                this.f66536c = n10;
            }

            public final C6658d create(C6658d dVar) {
                return new a(this.f66535b, this.f66536c, dVar);
            }

            /* renamed from: i */
            public final Object invoke(C6658d dVar) {
                return ((a) create(dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f66534a;
                if (i10 == 0) {
                    w.b(obj);
                    C5695g gVar = this.f66535b;
                    G g10 = t.f66850a;
                    Object obj2 = this.f66536c.f71759a;
                    if (obj2 == g10) {
                        obj2 = null;
                    }
                    this.f66534a = 1;
                    if (gVar.emit(obj2, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f66536c.f71759a = null;
                return C6514M.f71813a;
            }
        }

        /* renamed from: Xg.m$b$b  reason: collision with other inner class name */
        static final class C0969b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            Object f66537a;

            /* renamed from: b  reason: collision with root package name */
            int f66538b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f66539c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ N f66540d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C5695g f66541e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0969b(N n10, C5695g gVar, C6658d dVar) {
                super(2, dVar);
                this.f66540d = n10;
                this.f66541e = gVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                C0969b bVar = new C0969b(this.f66540d, this.f66541e, dVar);
                bVar.f66539c = obj;
                return bVar;
            }

            public final Object i(Object obj, C6658d dVar) {
                return ((C0969b) create(h.b(obj), dVar)).invokeSuspend(C6514M.f71813a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((h) obj).k(), (C6658d) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                N n10;
                N n11;
                Object f10 = C6680b.f();
                int i10 = this.f66538b;
                if (i10 == 0) {
                    w.b(obj);
                    Object k10 = ((h) this.f66539c).k();
                    n10 = this.f66540d;
                    boolean z10 = k10 instanceof h.c;
                    if (!z10) {
                        n10.f71759a = k10;
                    }
                    C5695g gVar = this.f66541e;
                    if (z10) {
                        Throwable e10 = h.e(k10);
                        if (e10 == null) {
                            Object obj2 = n10.f71759a;
                            if (obj2 != null) {
                                if (obj2 == t.f66850a) {
                                    obj2 = null;
                                }
                                this.f66539c = k10;
                                this.f66537a = n10;
                                this.f66538b = 1;
                                if (gVar.emit(obj2, this) == f10) {
                                    return f10;
                                }
                                n11 = n10;
                            }
                            n10.f71759a = t.f66852c;
                        } else {
                            throw e10;
                        }
                    }
                    return C6514M.f71813a;
                } else if (i10 == 1) {
                    n11 = (N) this.f66537a;
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n10 = n11;
                n10.f71759a = t.f66852c;
                return C6514M.f71813a;
            }
        }

        /* renamed from: Xg.m$b$c */
        static final class c extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f66542a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f66543b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5694f f66544c;

            /* renamed from: Xg.m$b$c$a */
            static final class a implements C5695g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ r f66545a;

                /* renamed from: Xg.m$b$c$a$a  reason: collision with other inner class name */
                static final class C0970a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f66546a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ a f66547b;

                    /* renamed from: c  reason: collision with root package name */
                    int f66548c;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0970a(a aVar, C6658d dVar) {
                        super(dVar);
                        this.f66547b = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f66546a = obj;
                        this.f66548c |= Integer.MIN_VALUE;
                        return this.f66547b.emit((Object) null, this);
                    }
                }

                a(r rVar) {
                    this.f66545a = rVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, qf.C6658d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof Xg.C5701m.b.c.a.C0970a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        Xg.m$b$c$a$a r0 = (Xg.C5701m.b.c.a.C0970a) r0
                        int r1 = r0.f66548c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f66548c = r1
                        goto L_0x0018
                    L_0x0013:
                        Xg.m$b$c$a$a r0 = new Xg.m$b$c$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f66546a
                        java.lang.Object r1 = rf.C6680b.f()
                        int r2 = r0.f66548c
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        lf.w.b(r6)
                        goto L_0x0043
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        lf.w.b(r6)
                        Wg.r r6 = r4.f66545a
                        if (r5 != 0) goto L_0x003a
                        Zg.G r5 = Yg.t.f66850a
                    L_0x003a:
                        r0.f66548c = r3
                        java.lang.Object r5 = r6.k(r5, r0)
                        if (r5 != r1) goto L_0x0043
                        return r1
                    L_0x0043:
                        lf.M r5 = lf.C6514M.f71813a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Xg.C5701m.b.c.a.emit(java.lang.Object, qf.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C5694f fVar, C6658d dVar) {
                super(2, dVar);
                this.f66544c = fVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                c cVar = new c(this.f66544c, dVar);
                cVar.f66543b = obj;
                return cVar;
            }

            public final Object invoke(r rVar, C6658d dVar) {
                return ((c) create(rVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f66542a;
                if (i10 == 0) {
                    w.b(obj);
                    C5694f fVar = this.f66544c;
                    a aVar = new a((r) this.f66543b);
                    this.f66542a = 1;
                    if (fVar.collect(aVar, this) == f10) {
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
        b(C6798l lVar, C5694f fVar, C6658d dVar) {
            super(3, dVar);
            this.f66532f = lVar;
            this.f66533g = fVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C5695g gVar, C6658d dVar) {
            b bVar = new b(this.f66532f, this.f66533g, dVar);
            bVar.f66530d = k10;
            bVar.f66531e = gVar;
            return bVar.invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r14.f66529c
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x003e
                if (r1 == r3) goto L_0x002a
                if (r1 != r2) goto L_0x0022
                java.lang.Object r1 = r14.f66527a
                kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                java.lang.Object r5 = r14.f66531e
                Wg.t r5 = (Wg.t) r5
                java.lang.Object r6 = r14.f66530d
                Xg.g r6 = (Xg.C5695g) r6
                lf.w.b(r15)
            L_0x001e:
                r7 = r6
                r6 = r5
                r5 = r1
                goto L_0x0060
            L_0x0022:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x002a:
                java.lang.Object r1 = r14.f66528b
                kotlin.jvm.internal.M r1 = (kotlin.jvm.internal.M) r1
                java.lang.Object r5 = r14.f66527a
                kotlin.jvm.internal.N r5 = (kotlin.jvm.internal.N) r5
                java.lang.Object r6 = r14.f66531e
                Wg.t r6 = (Wg.t) r6
                java.lang.Object r7 = r14.f66530d
                Xg.g r7 = (Xg.C5695g) r7
                lf.w.b(r15)
                goto L_0x00a2
            L_0x003e:
                lf.w.b(r15)
                java.lang.Object r15 = r14.f66530d
                r5 = r15
                Ug.K r5 = (Ug.K) r5
                java.lang.Object r15 = r14.f66531e
                Xg.g r15 = (Xg.C5695g) r15
                Xg.m$b$c r8 = new Xg.m$b$c
                Xg.f r1 = r14.f66533g
                r8.<init>(r1, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                Wg.t r1 = Wg.p.e(r5, r6, r7, r8, r9, r10)
                kotlin.jvm.internal.N r5 = new kotlin.jvm.internal.N
                r5.<init>()
                r7 = r15
                r6 = r1
            L_0x0060:
                java.lang.Object r15 = r5.f71759a
                Zg.G r1 = Yg.t.f66852c
                if (r15 == r1) goto L_0x00e5
                kotlin.jvm.internal.M r1 = new kotlin.jvm.internal.M
                r1.<init>()
                java.lang.Object r15 = r5.f71759a
                if (r15 == 0) goto L_0x00a4
                yf.l r8 = r14.f66532f
                Zg.G r9 = Yg.t.f66850a
                if (r15 != r9) goto L_0x0076
                r15 = r4
            L_0x0076:
                java.lang.Object r15 = r8.invoke(r15)
                java.lang.Number r15 = (java.lang.Number) r15
                long r10 = r15.longValue()
                r1.f71758a = r10
                r12 = 0
                int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r15 < 0) goto L_0x00a9
                int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r15 != 0) goto L_0x00a4
                java.lang.Object r15 = r5.f71759a
                if (r15 != r9) goto L_0x0091
                r15 = r4
            L_0x0091:
                r14.f66530d = r7
                r14.f66531e = r6
                r14.f66527a = r5
                r14.f66528b = r1
                r14.f66529c = r3
                java.lang.Object r15 = r7.emit(r15, r14)
                if (r15 != r0) goto L_0x00a2
                return r0
            L_0x00a2:
                r5.f71759a = r4
            L_0x00a4:
                r15 = r1
                r1 = r5
                r5 = r6
                r6 = r7
                goto L_0x00b1
            L_0x00a9:
                java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Debounce timeout should not be negative"
                r15.<init>(r0)
                throw r15
            L_0x00b1:
                ch.i r7 = new ch.i
                qf.g r8 = r14.getContext()
                r7.<init>(r8)
                java.lang.Object r8 = r1.f71759a
                if (r8 == 0) goto L_0x00c8
                long r8 = r15.f71758a
                Xg.m$b$a r15 = new Xg.m$b$a
                r15.<init>(r6, r1, r4)
                ch.C5803b.a(r7, r8, r15)
            L_0x00c8:
                ch.f r15 = r5.h()
                Xg.m$b$b r8 = new Xg.m$b$b
                r8.<init>(r1, r6, r4)
                r7.d(r15, r8)
                r14.f66530d = r6
                r14.f66531e = r5
                r14.f66527a = r1
                r14.f66528b = r4
                r14.f66529c = r2
                java.lang.Object r15 = r7.o(r14)
                if (r15 != r0) goto L_0x001e
                return r0
            L_0x00e5:
                lf.M r15 = lf.C6514M.f71813a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5701m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: Xg.m$c */
    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f66549a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f66550b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f66551c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(long j10, C6658d dVar) {
            super(2, dVar);
            this.f66551c = j10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f66551c, dVar);
            cVar.f66550b = obj;
            return cVar;
        }

        public final Object invoke(r rVar, C6658d dVar) {
            return ((c) create(rVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: Wg.r} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[RETURN] */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r7.f66549a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r4) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                goto L_0x0022
            L_0x0012:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001a:
                java.lang.Object r1 = r7.f66550b
                Wg.r r1 = (Wg.r) r1
                lf.w.b(r8)
                goto L_0x0050
            L_0x0022:
                java.lang.Object r1 = r7.f66550b
                Wg.r r1 = (Wg.r) r1
                lf.w.b(r8)
                goto L_0x003f
            L_0x002a:
                lf.w.b(r8)
                java.lang.Object r8 = r7.f66550b
                r1 = r8
                Wg.r r1 = (Wg.r) r1
                long r5 = r7.f66551c
                r7.f66550b = r1
                r7.f66549a = r4
                java.lang.Object r8 = Ug.V.a(r5, r7)
                if (r8 != r0) goto L_0x003f
                return r0
            L_0x003f:
                Wg.u r8 = r1.t()
                lf.M r4 = lf.C6514M.f71813a
                r7.f66550b = r1
                r7.f66549a = r3
                java.lang.Object r8 = r8.k(r4, r7)
                if (r8 != r0) goto L_0x0050
                return r0
            L_0x0050:
                long r4 = r7.f66551c
                r7.f66550b = r1
                r7.f66549a = r2
                java.lang.Object r8 = Ug.V.a(r4, r7)
                if (r8 != r0) goto L_0x003f
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5701m.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: Xg.m$d */
    static final class d extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        Object f66552a;

        /* renamed from: b  reason: collision with root package name */
        Object f66553b;

        /* renamed from: c  reason: collision with root package name */
        int f66554c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f66555d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f66556e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f66557f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5694f f66558g;

        /* renamed from: Xg.m$d$a */
        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f66559a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f66560b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ N f66561c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Wg.t f66562d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(N n10, Wg.t tVar, C6658d dVar) {
                super(2, dVar);
                this.f66561c = n10;
                this.f66562d = tVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f66561c, this.f66562d, dVar);
                aVar.f66560b = obj;
                return aVar;
            }

            public final Object i(Object obj, C6658d dVar) {
                return ((a) create(h.b(obj), dVar)).invokeSuspend(C6514M.f71813a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((h) obj).k(), (C6658d) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                C6680b.f();
                if (this.f66559a == 0) {
                    w.b(obj);
                    Object k10 = ((h) this.f66560b).k();
                    N n10 = this.f66561c;
                    boolean z10 = k10 instanceof h.c;
                    if (!z10) {
                        n10.f71759a = k10;
                    }
                    Wg.t tVar = this.f66562d;
                    if (z10) {
                        Throwable e10 = h.e(k10);
                        if (e10 == null) {
                            tVar.n(new k());
                            n10.f71759a = t.f66852c;
                        } else {
                            throw e10;
                        }
                    }
                    return C6514M.f71813a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: Xg.m$d$b */
        static final class b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f66563a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ N f66564b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5695g f66565c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(N n10, C5695g gVar, C6658d dVar) {
                super(2, dVar);
                this.f66564b = n10;
                this.f66565c = gVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new b(this.f66564b, this.f66565c, dVar);
            }

            /* renamed from: i */
            public final Object invoke(C6514M m10, C6658d dVar) {
                return ((b) create(m10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f66563a;
                if (i10 == 0) {
                    w.b(obj);
                    N n10 = this.f66564b;
                    Object obj2 = n10.f71759a;
                    if (obj2 == null) {
                        return C6514M.f71813a;
                    }
                    n10.f71759a = null;
                    C5695g gVar = this.f66565c;
                    if (obj2 == t.f66850a) {
                        obj2 = null;
                    }
                    this.f66563a = 1;
                    if (gVar.emit(obj2, this) == f10) {
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

        /* renamed from: Xg.m$d$c */
        static final class c extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f66566a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f66567b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5694f f66568c;

            /* renamed from: Xg.m$d$c$a */
            static final class a implements C5695g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ r f66569a;

                /* renamed from: Xg.m$d$c$a$a  reason: collision with other inner class name */
                static final class C0971a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f66570a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ a f66571b;

                    /* renamed from: c  reason: collision with root package name */
                    int f66572c;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0971a(a aVar, C6658d dVar) {
                        super(dVar);
                        this.f66571b = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f66570a = obj;
                        this.f66572c |= Integer.MIN_VALUE;
                        return this.f66571b.emit((Object) null, this);
                    }
                }

                a(r rVar) {
                    this.f66569a = rVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, qf.C6658d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof Xg.C5701m.d.c.a.C0971a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        Xg.m$d$c$a$a r0 = (Xg.C5701m.d.c.a.C0971a) r0
                        int r1 = r0.f66572c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f66572c = r1
                        goto L_0x0018
                    L_0x0013:
                        Xg.m$d$c$a$a r0 = new Xg.m$d$c$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f66570a
                        java.lang.Object r1 = rf.C6680b.f()
                        int r2 = r0.f66572c
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        lf.w.b(r6)
                        goto L_0x0043
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        lf.w.b(r6)
                        Wg.r r6 = r4.f66569a
                        if (r5 != 0) goto L_0x003a
                        Zg.G r5 = Yg.t.f66850a
                    L_0x003a:
                        r0.f66572c = r3
                        java.lang.Object r5 = r6.k(r5, r0)
                        if (r5 != r1) goto L_0x0043
                        return r1
                    L_0x0043:
                        lf.M r5 = lf.C6514M.f71813a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Xg.C5701m.d.c.a.emit(java.lang.Object, qf.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C5694f fVar, C6658d dVar) {
                super(2, dVar);
                this.f66568c = fVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                c cVar = new c(this.f66568c, dVar);
                cVar.f66567b = obj;
                return cVar;
            }

            public final Object invoke(r rVar, C6658d dVar) {
                return ((c) create(rVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f66566a;
                if (i10 == 0) {
                    w.b(obj);
                    C5694f fVar = this.f66568c;
                    a aVar = new a((r) this.f66567b);
                    this.f66566a = 1;
                    if (fVar.collect(aVar, this) == f10) {
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
        d(long j10, C5694f fVar, C6658d dVar) {
            super(3, dVar);
            this.f66557f = j10;
            this.f66558g = fVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C5695g gVar, C6658d dVar) {
            d dVar2 = new d(this.f66557f, this.f66558g, dVar);
            dVar2.f66555d = k10;
            dVar2.f66556e = gVar;
            return dVar2.invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C5695g gVar;
            Wg.t tVar;
            N n10;
            Wg.t tVar2;
            Object f10 = C6680b.f();
            int i10 = this.f66554c;
            if (i10 == 0) {
                w.b(obj);
                K k10 = (K) this.f66555d;
                Wg.t e10 = Wg.p.e(k10, (g) null, -1, new c(this.f66558g, (C6658d) null), 1, (Object) null);
                N n11 = new N();
                Wg.t x10 = C5696h.x(k10, this.f66557f);
                gVar = (C5695g) this.f66556e;
                tVar2 = x10;
                N n12 = n11;
                tVar = e10;
                n10 = n12;
            } else if (i10 == 1) {
                tVar2 = (Wg.t) this.f66553b;
                n10 = (N) this.f66552a;
                tVar = (Wg.t) this.f66556e;
                gVar = (C5695g) this.f66555d;
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (n10.f71759a != t.f66852c) {
                C5810i iVar = new C5810i(getContext());
                iVar.d(tVar.h(), new a(n10, tVar2, (C6658d) null));
                iVar.d(tVar2.g(), new b(n10, gVar, (C6658d) null));
                this.f66555d = gVar;
                this.f66556e = tVar;
                this.f66552a = n10;
                this.f66553b = tVar2;
                this.f66554c = 1;
                if (iVar.o(this) == f10) {
                    return f10;
                }
            }
            return C6514M.f71813a;
        }
    }

    public static final C5694f a(C5694f fVar, long j10) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative");
        } else if (i10 == 0) {
            return fVar;
        } else {
            return c(fVar, new a(j10));
        }
    }

    public static final C5694f b(C5694f fVar, C6798l lVar) {
        return c(fVar, lVar);
    }

    private static final C5694f c(C5694f fVar, C6798l lVar) {
        return o.b(new b(lVar, fVar, (C6658d) null));
    }

    public static final Wg.t d(K k10, long j10) {
        return Wg.p.e(k10, (g) null, 0, new c(j10, (C6658d) null), 1, (Object) null);
    }

    public static final C5694f e(C5694f fVar, long j10) {
        if (j10 > 0) {
            return o.b(new d(j10, fVar, (C6658d) null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }
}
