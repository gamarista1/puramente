package m3;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Xg.B;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import Xg.D;
import Xg.w;
import com.google.android.gms.common.api.a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.L;
import lf.C6514M;
import m3.C2224x;
import mf.I;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;
import yf.p;

/* renamed from: m3.b  reason: case insensitive filesystem */
public final class C2203b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C2210i f23946a = new C2210i();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final w f23947b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final B f23948c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C5600w0 f23949d;

    /* renamed from: e  reason: collision with root package name */
    private final C5694f f23950e;

    /* renamed from: m3.b$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f23951a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f23952b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2203b f23953c;

        /* renamed from: m3.b$a$a  reason: collision with other inner class name */
        static final class C0389a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f23954a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f23955b;

            C0389a(C6658d dVar) {
                super(2, dVar);
            }

            public final C6658d create(Object obj, C6658d dVar) {
                C0389a aVar = new C0389a(dVar);
                aVar.f23955b = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(I i10, C6658d dVar) {
                return ((C0389a) create(i10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                boolean z10;
                C6680b.f();
                if (this.f23954a == 0) {
                    lf.w.b(obj);
                    if (((I) this.f23955b) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: m3.b$a$b  reason: collision with other inner class name */
        static final class C0390b implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ L f23956a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5695g f23957b;

            /* renamed from: m3.b$a$b$a  reason: collision with other inner class name */
            static final class C0391a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                Object f23958a;

                /* renamed from: b  reason: collision with root package name */
                Object f23959b;

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f23960c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C0390b f23961d;

                /* renamed from: e  reason: collision with root package name */
                int f23962e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0391a(C0390b bVar, C6658d dVar) {
                    super(dVar);
                    this.f23961d = bVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f23960c = obj;
                    this.f23962e |= Integer.MIN_VALUE;
                    return this.f23961d.emit((I) null, this);
                }
            }

            C0390b(L l10, C5695g gVar) {
                this.f23956a = l10;
                this.f23957b = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(mf.I r5, qf.C6658d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof m3.C2203b.a.C0390b.C0391a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    m3.b$a$b$a r0 = (m3.C2203b.a.C0390b.C0391a) r0
                    int r1 = r0.f23962e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f23962e = r1
                    goto L_0x0018
                L_0x0013:
                    m3.b$a$b$a r0 = new m3.b$a$b$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f23960c
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f23962e
                    r3 = 1
                    if (r2 == 0) goto L_0x0039
                    if (r2 != r3) goto L_0x0031
                    java.lang.Object r5 = r0.f23959b
                    mf.I r5 = (mf.I) r5
                    java.lang.Object r0 = r0.f23958a
                    m3.b$a$b r0 = (m3.C2203b.a.C0390b) r0
                    lf.w.b(r6)
                    goto L_0x005d
                L_0x0031:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0039:
                    lf.w.b(r6)
                    kotlin.jvm.internal.C6496s.e(r5)
                    int r6 = r5.c()
                    kotlin.jvm.internal.L r2 = r4.f23956a
                    int r2 = r2.f71757a
                    if (r6 <= r2) goto L_0x0065
                    Xg.g r6 = r4.f23957b
                    java.lang.Object r2 = r5.d()
                    r0.f23958a = r4
                    r0.f23959b = r5
                    r0.f23962e = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L_0x005c
                    return r1
                L_0x005c:
                    r0 = r4
                L_0x005d:
                    kotlin.jvm.internal.L r6 = r0.f23956a
                    int r5 = r5.c()
                    r6.f71757a = r5
                L_0x0065:
                    lf.M r5 = lf.C6514M.f71813a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C2203b.a.C0390b.emit(mf.I, qf.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2203b bVar, C6658d dVar) {
            super(2, dVar);
            this.f23953c = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f23953c, dVar);
            aVar.f23952b = obj;
            return aVar;
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f23951a;
            if (i10 == 0) {
                lf.w.b(obj);
                L l10 = new L();
                l10.f71757a = Integer.MIN_VALUE;
                C5694f N10 = C5696h.N(this.f23953c.f23948c, new C0389a((C6658d) null));
                C0390b bVar = new C0390b(l10, (C5695g) this.f23952b);
                this.f23951a = 1;
                if (N10.collect(bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: m3.b$b  reason: collision with other inner class name */
    static final class C0392b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f23963a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5694f f23964b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2203b f23965c;

        /* renamed from: m3.b$b$a */
        static final class a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2203b f23966a;

            /* renamed from: m3.b$b$a$a  reason: collision with other inner class name */
            static final class C0393a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                Object f23967a;

                /* renamed from: b  reason: collision with root package name */
                Object f23968b;

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f23969c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ a f23970d;

                /* renamed from: e  reason: collision with root package name */
                int f23971e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0393a(a aVar, C6658d dVar) {
                    super(dVar);
                    this.f23970d = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f23969c = obj;
                    this.f23971e |= Integer.MIN_VALUE;
                    return this.f23970d.emit((I) null, this);
                }
            }

            a(C2203b bVar) {
                this.f23966a = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(mf.I r6, qf.C6658d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof m3.C2203b.C0392b.a.C0393a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    m3.b$b$a$a r0 = (m3.C2203b.C0392b.a.C0393a) r0
                    int r1 = r0.f23971e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f23971e = r1
                    goto L_0x0018
                L_0x0013:
                    m3.b$b$a$a r0 = new m3.b$b$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f23969c
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f23971e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0040
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    lf.w.b(r7)
                    goto L_0x006b
                L_0x002c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0034:
                    java.lang.Object r6 = r0.f23968b
                    mf.I r6 = (mf.I) r6
                    java.lang.Object r2 = r0.f23967a
                    m3.b$b$a r2 = (m3.C2203b.C0392b.a) r2
                    lf.w.b(r7)
                    goto L_0x0057
                L_0x0040:
                    lf.w.b(r7)
                    m3.b r7 = r5.f23966a
                    Xg.w r7 = r7.f23947b
                    r0.f23967a = r5
                    r0.f23968b = r6
                    r0.f23971e = r4
                    java.lang.Object r7 = r7.emit(r6, r0)
                    if (r7 != r1) goto L_0x0056
                    return r1
                L_0x0056:
                    r2 = r5
                L_0x0057:
                    m3.b r7 = r2.f23966a
                    m3.i r7 = r7.f23946a
                    r2 = 0
                    r0.f23967a = r2
                    r0.f23968b = r2
                    r0.f23971e = r3
                    java.lang.Object r6 = r7.c(r6, r0)
                    if (r6 != r1) goto L_0x006b
                    return r1
                L_0x006b:
                    lf.M r6 = lf.C6514M.f71813a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C2203b.C0392b.a.emit(mf.I, qf.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0392b(C5694f fVar, C2203b bVar, C6658d dVar) {
            super(2, dVar);
            this.f23964b = fVar;
            this.f23965c = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new C0392b(this.f23964b, this.f23965c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((C0392b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f23963a;
            if (i10 == 0) {
                lf.w.b(obj);
                C5694f P10 = C5696h.P(this.f23964b);
                a aVar = new a(this.f23965c);
                this.f23963a = 1;
                if (P10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: m3.b$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2203b f23972a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2203b bVar) {
            super(1);
            this.f23972a = bVar;
        }

        public final void a(Throwable th2) {
            this.f23972a.f23947b.b((Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: m3.b$d */
    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f23973a;

        /* renamed from: b  reason: collision with root package name */
        int f23974b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f23975c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2203b f23976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C2203b bVar, C6658d dVar) {
            super(2, dVar);
            this.f23976d = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            d dVar2 = new d(this.f23976d, dVar);
            dVar2.f23975c = obj;
            return dVar2;
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((d) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: Xg.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r4.f23974b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r1 = r4.f23973a
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r4.f23975c
                Xg.g r3 = (Xg.C5695g) r3
                lf.w.b(r5)
                goto L_0x0056
            L_0x001a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0022:
                java.lang.Object r1 = r4.f23975c
                Xg.g r1 = (Xg.C5695g) r1
                lf.w.b(r5)
                goto L_0x0043
            L_0x002a:
                lf.w.b(r5)
                java.lang.Object r5 = r4.f23975c
                r1 = r5
                Xg.g r1 = (Xg.C5695g) r1
                m3.b r5 = r4.f23976d
                m3.i r5 = r5.f23946a
                r4.f23975c = r1
                r4.f23974b = r3
                java.lang.Object r5 = r5.b(r4)
                if (r5 != r0) goto L_0x0043
                return r0
            L_0x0043:
                java.util.List r5 = (java.util.List) r5
                m3.b r3 = r4.f23976d
                Ug.w0 r3 = r3.f23949d
                r3.start()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
                r3 = r1
                r1 = r5
            L_0x0056:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x006f
                java.lang.Object r5 = r1.next()
                mf.I r5 = (mf.I) r5
                r4.f23975c = r3
                r4.f23973a = r1
                r4.f23974b = r2
                java.lang.Object r5 = r3.emit(r5, r4)
                if (r5 != r0) goto L_0x0056
                return r0
            L_0x006f:
                lf.M r5 = lf.C6514M.f71813a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2203b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C2203b(C5694f fVar, K k10) {
        C6496s.h(fVar, "src");
        C6496s.h(k10, "scope");
        w a10 = D.a(1, a.e.API_PRIORITY_OTHER, Wg.a.SUSPEND);
        this.f23947b = a10;
        this.f23948c = C5696h.I(a10, new d(this, (C6658d) null));
        C5600w0 d10 = C5576k.d(k10, (g) null, M.LAZY, new C0392b(fVar, this, (C6658d) null), 1, (Object) null);
        d10.P0(new c(this));
        this.f23949d = d10;
        this.f23950e = C5696h.y(new a(this, (C6658d) null));
    }

    public final void e() {
        C5600w0.a.a(this.f23949d, (CancellationException) null, 1, (Object) null);
    }

    public final C2224x.b f() {
        return this.f23946a.a();
    }

    public final C5694f g() {
        return this.f23950e;
    }
}
