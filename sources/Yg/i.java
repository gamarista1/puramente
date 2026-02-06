package Yg;

import Ug.K;
import Ug.L;
import Xg.C5694f;
import Xg.C5695g;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import qf.h;
import rf.C6680b;
import yf.p;
import yf.q;

public final class i extends g {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final q f66797e;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f66798a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f66799b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f66800c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5695g f66801d;

        /* renamed from: Yg.i$a$a  reason: collision with other inner class name */
        static final class C0980a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ N f66802a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f66803b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ i f66804c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5695g f66805d;

            /* renamed from: Yg.i$a$a$a  reason: collision with other inner class name */
            static final class C0981a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f66806a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ i f66807b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C5695g f66808c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ Object f66809d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0981a(i iVar, C5695g gVar, Object obj, C6658d dVar) {
                    super(2, dVar);
                    this.f66807b = iVar;
                    this.f66808c = gVar;
                    this.f66809d = obj;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0981a(this.f66807b, this.f66808c, this.f66809d, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0981a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f66806a;
                    if (i10 == 0) {
                        w.b(obj);
                        q s10 = this.f66807b.f66797e;
                        C5695g gVar = this.f66808c;
                        Object obj2 = this.f66809d;
                        this.f66806a = 1;
                        if (s10.invoke(gVar, obj2, this) == f10) {
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

            /* renamed from: Yg.i$a$a$b */
            static final class b extends d {

                /* renamed from: a  reason: collision with root package name */
                Object f66810a;

                /* renamed from: b  reason: collision with root package name */
                Object f66811b;

                /* renamed from: c  reason: collision with root package name */
                Object f66812c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f66813d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0980a f66814e;

                /* renamed from: f  reason: collision with root package name */
                int f66815f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C0980a aVar, C6658d dVar) {
                    super(dVar);
                    this.f66814e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f66813d = obj;
                    this.f66815f |= Integer.MIN_VALUE;
                    return this.f66814e.emit((Object) null, this);
                }
            }

            C0980a(N n10, K k10, i iVar, C5695g gVar) {
                this.f66802a = n10;
                this.f66803b = k10;
                this.f66804c = iVar;
                this.f66805d = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, qf.C6658d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof Yg.i.a.C0980a.b
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    Yg.i$a$a$b r0 = (Yg.i.a.C0980a.b) r0
                    int r1 = r0.f66815f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f66815f = r1
                    goto L_0x0018
                L_0x0013:
                    Yg.i$a$a$b r0 = new Yg.i$a$a$b
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f66813d
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f66815f
                    r3 = 1
                    if (r2 == 0) goto L_0x003b
                    if (r2 != r3) goto L_0x0033
                    java.lang.Object r8 = r0.f66812c
                    Ug.w0 r8 = (Ug.C5600w0) r8
                    java.lang.Object r8 = r0.f66811b
                    java.lang.Object r0 = r0.f66810a
                    Yg.i$a$a r0 = (Yg.i.a.C0980a) r0
                    lf.w.b(r9)
                    goto L_0x005e
                L_0x0033:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x003b:
                    lf.w.b(r9)
                    kotlin.jvm.internal.N r9 = r7.f66802a
                    java.lang.Object r9 = r9.f71759a
                    Ug.w0 r9 = (Ug.C5600w0) r9
                    if (r9 == 0) goto L_0x005d
                    Yg.k r2 = new Yg.k
                    r2.<init>()
                    r9.n(r2)
                    r0.f66810a = r7
                    r0.f66811b = r8
                    r0.f66812c = r9
                    r0.f66815f = r3
                    java.lang.Object r9 = r9.B0(r0)
                    if (r9 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    r0 = r7
                L_0x005e:
                    kotlin.jvm.internal.N r9 = r0.f66802a
                    Ug.K r1 = r0.f66803b
                    Ug.M r3 = Ug.M.UNDISPATCHED
                    Yg.i$a$a$a r4 = new Yg.i$a$a$a
                    Yg.i r2 = r0.f66804c
                    Xg.g r0 = r0.f66805d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    Ug.w0 r8 = Ug.C5576k.d(r1, r2, r3, r4, r5, r6)
                    r9.f71759a = r8
                    lf.M r8 = lf.C6514M.f71813a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: Yg.i.a.C0980a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C5695g gVar, C6658d dVar) {
            super(2, dVar);
            this.f66800c = iVar;
            this.f66801d = gVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f66800c, this.f66801d, dVar);
            aVar.f66799b = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f66798a;
            if (i10 == 0) {
                w.b(obj);
                N n10 = new N();
                i iVar = this.f66800c;
                C5694f fVar = iVar.f66793d;
                C0980a aVar = new C0980a(n10, (K) this.f66799b, iVar, this.f66801d);
                this.f66798a = 1;
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(q qVar, C5694f fVar, g gVar, int i10, Wg.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, fVar, (i11 & 4) != 0 ? h.f72645a : gVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? Wg.a.SUSPEND : aVar);
    }

    /* access modifiers changed from: protected */
    public e j(g gVar, int i10, Wg.a aVar) {
        return new i(this.f66797e, this.f66793d, gVar, i10, aVar);
    }

    /* access modifiers changed from: protected */
    public Object r(C5695g gVar, C6658d dVar) {
        Object e10 = L.e(new a(this, gVar, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public i(q qVar, C5694f fVar, g gVar, int i10, Wg.a aVar) {
        super(fVar, gVar, i10, aVar);
        this.f66797e = qVar;
    }
}
