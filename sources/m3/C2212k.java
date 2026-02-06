package m3;

import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;
import yf.q;

/* renamed from: m3.k  reason: case insensitive filesystem */
public abstract class C2212k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Object f24036a = new Object();

    /* renamed from: m3.k$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f24037a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f24038b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5694f f24039c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f24040d;

        /* renamed from: m3.k$a$a  reason: collision with other inner class name */
        static final class C0400a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ N f24041a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ q f24042b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5695g f24043c;

            /* renamed from: m3.k$a$a$a  reason: collision with other inner class name */
            static final class C0401a extends d {

                /* renamed from: a  reason: collision with root package name */
                Object f24044a;

                /* renamed from: b  reason: collision with root package name */
                Object f24045b;

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f24046c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C0400a f24047d;

                /* renamed from: e  reason: collision with root package name */
                int f24048e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0401a(C0400a aVar, C6658d dVar) {
                    super(dVar);
                    this.f24047d = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24046c = obj;
                    this.f24048e |= Integer.MIN_VALUE;
                    return this.f24047d.emit((Object) null, this);
                }
            }

            C0400a(N n10, q qVar, C5695g gVar) {
                this.f24041a = n10;
                this.f24042b = qVar;
                this.f24043c = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x007e A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, qf.C6658d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof m3.C2212k.a.C0400a.C0401a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    m3.k$a$a$a r0 = (m3.C2212k.a.C0400a.C0401a) r0
                    int r1 = r0.f24048e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f24048e = r1
                    goto L_0x0018
                L_0x0013:
                    m3.k$a$a$a r0 = new m3.k$a$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f24046c
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f24048e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0040
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    lf.w.b(r9)
                    goto L_0x007f
                L_0x002c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0034:
                    java.lang.Object r8 = r0.f24045b
                    kotlin.jvm.internal.N r8 = (kotlin.jvm.internal.N) r8
                    java.lang.Object r2 = r0.f24044a
                    m3.k$a$a r2 = (m3.C2212k.a.C0400a) r2
                    lf.w.b(r9)
                    goto L_0x0066
                L_0x0040:
                    lf.w.b(r9)
                    kotlin.jvm.internal.N r9 = r7.f24041a
                    java.lang.Object r2 = r9.f71759a
                    java.lang.Object r5 = m3.C2212k.f24036a
                    if (r2 != r5) goto L_0x004f
                    r2 = r7
                    goto L_0x0069
                L_0x004f:
                    yf.q r2 = r7.f24042b
                    kotlin.jvm.internal.N r5 = r7.f24041a
                    java.lang.Object r5 = r5.f71759a
                    r0.f24044a = r7
                    r0.f24045b = r9
                    r0.f24048e = r4
                    java.lang.Object r8 = r2.invoke(r5, r8, r0)
                    if (r8 != r1) goto L_0x0062
                    return r1
                L_0x0062:
                    r2 = r7
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L_0x0066:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L_0x0069:
                    r9.f71759a = r8
                    Xg.g r8 = r2.f24043c
                    kotlin.jvm.internal.N r9 = r2.f24041a
                    java.lang.Object r9 = r9.f71759a
                    r2 = 0
                    r0.f24044a = r2
                    r0.f24045b = r2
                    r0.f24048e = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L_0x007f
                    return r1
                L_0x007f:
                    lf.M r8 = lf.C6514M.f71813a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C2212k.a.C0400a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5694f fVar, q qVar, C6658d dVar) {
            super(2, dVar);
            this.f24039c = fVar;
            this.f24040d = qVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f24039c, this.f24040d, dVar);
            aVar.f24038b = obj;
            return aVar;
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f24037a;
            if (i10 == 0) {
                w.b(obj);
                N n10 = new N();
                n10.f71759a = C2212k.f24036a;
                C5694f fVar = this.f24039c;
                C0400a aVar = new C0400a(n10, this.f24040d, (C5695g) this.f24038b);
                this.f24037a = 1;
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

    /* renamed from: m3.k$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f24049a;

        /* renamed from: b  reason: collision with root package name */
        int f24050b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f24051c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f24052d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5694f f24053e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q f24054f;

        /* renamed from: m3.k$b$a */
        static final class a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ N f24055a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ q f24056b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5695g f24057c;

            /* renamed from: m3.k$b$a$a  reason: collision with other inner class name */
            static final class C0402a extends d {

                /* renamed from: a  reason: collision with root package name */
                Object f24058a;

                /* renamed from: b  reason: collision with root package name */
                Object f24059b;

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f24060c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ a f24061d;

                /* renamed from: e  reason: collision with root package name */
                int f24062e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0402a(a aVar, C6658d dVar) {
                    super(dVar);
                    this.f24061d = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24060c = obj;
                    this.f24062e |= Integer.MIN_VALUE;
                    return this.f24061d.emit((Object) null, this);
                }
            }

            a(N n10, q qVar, C5695g gVar) {
                this.f24055a = n10;
                this.f24056b = qVar;
                this.f24057c = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, qf.C6658d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof m3.C2212k.b.a.C0402a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    m3.k$b$a$a r0 = (m3.C2212k.b.a.C0402a) r0
                    int r1 = r0.f24062e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f24062e = r1
                    goto L_0x0018
                L_0x0013:
                    m3.k$b$a$a r0 = new m3.k$b$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f24060c
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f24062e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0040
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    lf.w.b(r9)
                    goto L_0x0070
                L_0x002c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0034:
                    java.lang.Object r8 = r0.f24059b
                    kotlin.jvm.internal.N r8 = (kotlin.jvm.internal.N) r8
                    java.lang.Object r2 = r0.f24058a
                    m3.k$b$a r2 = (m3.C2212k.b.a) r2
                    lf.w.b(r9)
                    goto L_0x005a
                L_0x0040:
                    lf.w.b(r9)
                    kotlin.jvm.internal.N r9 = r7.f24055a
                    yf.q r2 = r7.f24056b
                    java.lang.Object r5 = r9.f71759a
                    r0.f24058a = r7
                    r0.f24059b = r9
                    r0.f24062e = r4
                    java.lang.Object r8 = r2.invoke(r5, r8, r0)
                    if (r8 != r1) goto L_0x0056
                    return r1
                L_0x0056:
                    r2 = r7
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L_0x005a:
                    r8.f71759a = r9
                    Xg.g r8 = r2.f24057c
                    kotlin.jvm.internal.N r9 = r2.f24055a
                    java.lang.Object r9 = r9.f71759a
                    r2 = 0
                    r0.f24058a = r2
                    r0.f24059b = r2
                    r0.f24062e = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L_0x0070
                    return r1
                L_0x0070:
                    lf.M r8 = lf.C6514M.f71813a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C2212k.b.a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Object obj, C5694f fVar, q qVar, C6658d dVar) {
            super(2, dVar);
            this.f24052d = obj;
            this.f24053e = fVar;
            this.f24054f = qVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f24052d, this.f24053e, this.f24054f, dVar);
            bVar.f24051c = obj;
            return bVar;
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((b) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C5695g gVar;
            N n10;
            Object f10 = C6680b.f();
            int i10 = this.f24050b;
            if (i10 == 0) {
                w.b(obj);
                C5695g gVar2 = (C5695g) this.f24051c;
                n10 = new N();
                Object obj2 = this.f24052d;
                n10.f71759a = obj2;
                this.f24051c = gVar2;
                this.f24049a = n10;
                this.f24050b = 1;
                if (gVar2.emit(obj2, this) == f10) {
                    return f10;
                }
                gVar = gVar2;
            } else if (i10 == 1) {
                n10 = (N) this.f24049a;
                gVar = (C5695g) this.f24051c;
                w.b(obj);
            } else if (i10 == 2) {
                w.b(obj);
                return C6514M.f71813a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5694f fVar = this.f24053e;
            a aVar = new a(n10, this.f24054f, gVar);
            this.f24051c = null;
            this.f24049a = null;
            this.f24050b = 2;
            if (fVar.collect(aVar, this) == f10) {
                return f10;
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: m3.k$c */
    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f24063a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f24064b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5694f f24065c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f24066d;

        /* renamed from: m3.k$c$a */
        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f24067a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f24068b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ q f24069c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C2206e f24070d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(q qVar, C2206e eVar, C6658d dVar) {
                super(2, dVar);
                this.f24069c = qVar;
                this.f24070d = eVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f24069c, this.f24070d, dVar);
                aVar.f24068b = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(Object obj, C6658d dVar) {
                return ((a) create(obj, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f24067a;
                if (i10 == 0) {
                    w.b(obj);
                    Object obj2 = this.f24068b;
                    q qVar = this.f24069c;
                    C2206e eVar = this.f24070d;
                    this.f24067a = 1;
                    if (qVar.invoke(eVar, obj2, this) == f10) {
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
        c(C5694f fVar, q qVar, C6658d dVar) {
            super(2, dVar);
            this.f24065c = fVar;
            this.f24066d = qVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f24065c, this.f24066d, dVar);
            cVar.f24064b = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(T t10, C6658d dVar) {
            return ((c) create(t10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f24063a;
            if (i10 == 0) {
                w.b(obj);
                C5694f fVar = this.f24065c;
                a aVar = new a(this.f24066d, new C2206e((T) this.f24064b), (C6658d) null);
                this.f24063a = 1;
                if (C5696h.i(fVar, aVar, this) == f10) {
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

    public static final C5694f b(C5694f fVar, q qVar) {
        C6496s.h(fVar, "<this>");
        C6496s.h(qVar, "operation");
        return C5696h.y(new a(fVar, qVar, (C6658d) null));
    }

    public static final C5694f c(C5694f fVar, Object obj, q qVar) {
        C6496s.h(fVar, "<this>");
        C6496s.h(qVar, "operation");
        return C5696h.y(new b(obj, fVar, qVar, (C6658d) null));
    }

    public static final C5694f d(C5694f fVar, q qVar) {
        C6496s.h(fVar, "<this>");
        C6496s.h(qVar, "transform");
        return S.a(new c(fVar, qVar, (C6658d) null));
    }
}
