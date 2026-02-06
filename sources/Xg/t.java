package Xg;

import Ug.C5572i;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Xg.H;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

abstract /* synthetic */ class t {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f66675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ H f66676b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5694f f66677c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w f66678d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f66679e;

        /* renamed from: Xg.t$a$a  reason: collision with other inner class name */
        static final class C0973a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f66680a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ int f66681b;

            C0973a(C6658d dVar) {
                super(2, dVar);
            }

            public final C6658d create(Object obj, C6658d dVar) {
                C0973a aVar = new C0973a(dVar);
                aVar.f66681b = ((Number) obj).intValue();
                return aVar;
            }

            public final Object i(int i10, C6658d dVar) {
                return ((C0973a) create(Integer.valueOf(i10), dVar)).invokeSuspend(C6514M.f71813a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((Number) obj).intValue(), (C6658d) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                boolean z10;
                C6680b.f();
                if (this.f66680a == 0) {
                    w.b(obj);
                    if (this.f66681b > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        static final class b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f66682a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f66683b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5694f f66684c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ w f66685d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object f66686e;

            /* renamed from: Xg.t$a$b$a  reason: collision with other inner class name */
            public /* synthetic */ class C0974a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f66687a;

                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                static {
                    /*
                        Xg.F[] r0 = Xg.F.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        Xg.F r1 = Xg.F.START     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        Xg.F r1 = Xg.F.STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        Xg.F r1 = Xg.F.STOP_AND_RESET_REPLAY_CACHE     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        f66687a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Xg.t.a.b.C0974a.<clinit>():void");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C5694f fVar, w wVar, Object obj, C6658d dVar) {
                super(2, dVar);
                this.f66684c = fVar;
                this.f66685d = wVar;
                this.f66686e = obj;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                b bVar = new b(this.f66684c, this.f66685d, this.f66686e, dVar);
                bVar.f66683b = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(F f10, C6658d dVar) {
                return ((b) create(f10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f66682a;
                if (i10 == 0) {
                    w.b(obj);
                    int i11 = C0974a.f66687a[((F) this.f66683b).ordinal()];
                    if (i11 == 1) {
                        C5694f fVar = this.f66684c;
                        w wVar = this.f66685d;
                        this.f66682a = 1;
                        if (fVar.collect(wVar, this) == f10) {
                            return f10;
                        }
                    } else if (i11 == 3) {
                        Object obj2 = this.f66686e;
                        if (obj2 == D.f66431a) {
                            this.f66685d.h();
                        } else {
                            this.f66685d.b(obj2);
                        }
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
        a(H h10, C5694f fVar, w wVar, Object obj, C6658d dVar) {
            super(2, dVar);
            this.f66676b = h10;
            this.f66677c = fVar;
            this.f66678d = wVar;
            this.f66679e = obj;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f66676b, this.f66677c, this.f66678d, this.f66679e, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f66675a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        w.b(obj);
                    } else if (!(i10 == 3 || i10 == 4)) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                w.b(obj);
                return C6514M.f71813a;
            }
            w.b(obj);
            H h10 = this.f66676b;
            H.a aVar = H.f66443a;
            if (h10 == aVar.c()) {
                C5694f fVar = this.f66677c;
                w wVar = this.f66678d;
                this.f66675a = 1;
                if (fVar.collect(wVar, this) == f10) {
                    return f10;
                }
            } else if (this.f66676b == aVar.d()) {
                L c10 = this.f66678d.c();
                C0973a aVar2 = new C0973a((C6658d) null);
                this.f66675a = 2;
                if (C5696h.v(c10, aVar2, this) == f10) {
                    return f10;
                }
            } else {
                C5694f n10 = C5696h.n(this.f66676b.a(this.f66678d.c()));
                b bVar = new b(this.f66677c, this.f66678d, this.f66679e, (C6658d) null);
                this.f66675a = 4;
                if (C5696h.i(n10, bVar, this) == f10) {
                    return f10;
                }
            }
            return C6514M.f71813a;
            C5694f fVar2 = this.f66677c;
            w wVar2 = this.f66678d;
            this.f66675a = 3;
            if (fVar2.collect(wVar2, this) == f10) {
                return f10;
            }
            return C6514M.f71813a;
        }
    }

    public static final B a(w wVar) {
        return new y(wVar, (C5600w0) null);
    }

    public static final L b(x xVar) {
        return new z(xVar, (C5600w0) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3 == 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final Xg.G c(Xg.C5694f r7, int r8) {
        /*
            Wg.d$a r0 = Wg.d.f66028P
            int r0 = r0.a()
            int r0 = Ef.m.d(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof Yg.e
            if (r1 == 0) goto L_0x003c
            r1 = r7
            Yg.e r1 = (Yg.e) r1
            Xg.f r2 = r1.k()
            if (r2 == 0) goto L_0x003c
            Xg.G r7 = new Xg.G
            int r3 = r1.f66784b
            r4 = -3
            if (r3 == r4) goto L_0x0026
            r4 = -2
            if (r3 == r4) goto L_0x0026
            if (r3 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0034
        L_0x0026:
            Wg.a r4 = r1.f66785c
            Wg.a r5 = Wg.a.SUSPEND
            r6 = 0
            if (r4 != r5) goto L_0x0031
            if (r3 != 0) goto L_0x0034
        L_0x002f:
            r0 = r6
            goto L_0x0034
        L_0x0031:
            if (r8 != 0) goto L_0x002f
            r0 = 1
        L_0x0034:
            Wg.a r8 = r1.f66785c
            qf.g r1 = r1.f66783a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L_0x003c:
            Xg.G r8 = new Xg.G
            Wg.a r1 = Wg.a.SUSPEND
            qf.h r2 = qf.h.f72645a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.t.c(Xg.f, int):Xg.G");
    }

    private static final C5600w0 d(K k10, g gVar, C5694f fVar, w wVar, H h10, Object obj) {
        M m10;
        if (C6496s.c(h10, H.f66443a.c())) {
            m10 = M.DEFAULT;
        } else {
            m10 = M.UNDISPATCHED;
        }
        return C5572i.c(k10, gVar, m10, new a(h10, fVar, wVar, obj, (C6658d) null));
    }

    public static final B e(B b10, p pVar) {
        return new Q(b10, pVar);
    }

    public static final B f(C5694f fVar, K k10, H h10, int i10) {
        G c10 = c(fVar, i10);
        w a10 = D.a(i10, c10.f66440b, c10.f66441c);
        return new y(a10, d(k10, c10.f66442d, c10.f66439a, a10, h10, D.f66431a));
    }

    public static /* synthetic */ B g(C5694f fVar, K k10, H h10, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return C5696h.K(fVar, k10, h10, i10);
    }

    public static final L h(C5694f fVar, K k10, H h10, Object obj) {
        G c10 = c(fVar, 1);
        x a10 = N.a(obj);
        return new z(a10, d(k10, c10.f66442d, c10.f66439a, a10, h10, obj));
    }
}
