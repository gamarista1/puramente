package m3;

import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import Xg.H;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;
import yf.q;

/* renamed from: m3.c  reason: case insensitive filesystem */
public abstract class C2204c {

    /* renamed from: m3.c$a */
    public static final class a implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f23977a;

        /* renamed from: m3.c$a$a  reason: collision with other inner class name */
        public static final class C0394a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5695g f23978a;

            /* renamed from: m3.c$a$a$a  reason: collision with other inner class name */
            public static final class C0395a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f23979a;

                /* renamed from: b  reason: collision with root package name */
                int f23980b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C0394a f23981c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0395a(C0394a aVar, C6658d dVar) {
                    super(dVar);
                    this.f23981c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f23979a = obj;
                    this.f23980b |= Integer.MIN_VALUE;
                    return this.f23981c.emit((Object) null, this);
                }
            }

            public C0394a(C5695g gVar) {
                this.f23978a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, qf.C6658d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof m3.C2204c.a.C0394a.C0395a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    m3.c$a$a$a r0 = (m3.C2204c.a.C0394a.C0395a) r0
                    int r1 = r0.f23980b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f23980b = r1
                    goto L_0x0018
                L_0x0013:
                    m3.c$a$a$a r0 = new m3.c$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f23979a
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f23980b
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    lf.w.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    lf.w.b(r6)
                    Xg.g r6 = r4.f23978a
                    m3.u r5 = (m3.C2221u) r5
                    m3.F r5 = r5.b()
                    r0.f23980b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    lf.M r5 = lf.C6514M.f71813a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C2204c.a.C0394a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        public a(C5694f fVar) {
            this.f23977a = fVar;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object collect = this.f23977a.collect(new C0394a(gVar), dVar);
            if (collect == C6680b.f()) {
                return collect;
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: m3.c$b */
    public static final class b extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f23982a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f23983b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f23984c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f23985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C6658d dVar, K k10, C2202a aVar) {
            super(3, dVar);
            this.f23985d = k10;
        }

        public final Object invoke(C5695g gVar, Object obj, C6658d dVar) {
            b bVar = new b(dVar, this.f23985d, (C2202a) null);
            bVar.f23983b = gVar;
            bVar.f23984c = obj;
            return bVar.invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f23982a;
            if (i10 == 0) {
                w.b(obj);
                C2221u uVar = new C2221u(this.f23985d, (C2201F) this.f23984c, (C2202a) null);
                this.f23982a = 1;
                if (((C5695g) this.f23983b).emit(uVar, this) == f10) {
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

    /* renamed from: m3.c$c  reason: collision with other inner class name */
    static final class C0396c extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f23986a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f23987b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f23988c;

        C0396c(C6658d dVar) {
            super(3, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C2221u uVar, C2221u uVar2, C6658d dVar) {
            C0396c cVar = new C0396c(dVar);
            cVar.f23987b = uVar;
            cVar.f23988c = uVar2;
            return cVar.invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f23986a;
            if (i10 == 0) {
                w.b(obj);
                C2221u uVar = (C2221u) this.f23988c;
                this.f23987b = uVar;
                this.f23986a = 1;
                if (((C2221u) this.f23987b).c(this) == f10) {
                    return f10;
                }
                return uVar;
            } else if (i10 == 1) {
                C2221u uVar2 = (C2221u) this.f23987b;
                w.b(obj);
                return uVar2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* renamed from: m3.c$d */
    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f23989a;

        d(C2202a aVar, C6658d dVar) {
            super(2, dVar);
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d((C2202a) null, dVar);
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((d) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            int i10 = this.f23989a;
            if (i10 == 0 || i10 == 1) {
                w.b(obj);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: m3.c$e */
    static final class e extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f23990a;

        e(C2202a aVar, C6658d dVar) {
            super(3, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C5695g gVar, Throwable th2, C6658d dVar) {
            return new e((C2202a) null, dVar).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            int i10 = this.f23990a;
            if (i10 == 0 || i10 == 1) {
                w.b(obj);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final C5694f a(C5694f fVar, K k10) {
        C6496s.h(fVar, "<this>");
        C6496s.h(k10, "scope");
        return b(fVar, k10, (C2202a) null);
    }

    public static final C5694f b(C5694f fVar, K k10, C2202a aVar) {
        C6496s.h(fVar, "<this>");
        C6496s.h(k10, "scope");
        return C5696h.K(C5696h.F(C5696h.H(new a(C2212k.b(C2212k.d(fVar, new b((C6658d) null, k10, aVar)), new C0396c((C6658d) null))), new d(aVar, (C6658d) null)), new e(aVar, (C6658d) null)), k10, H.f66443a.d(), 1);
    }
}
