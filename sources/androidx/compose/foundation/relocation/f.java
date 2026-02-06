package androidx.compose.foundation.relocation;

import H0.C1197s;
import J0.A;
import J0.B0;
import J0.C1245k;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import q0.C2423i;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6787a;
import yf.p;

public final class f extends i.c implements H.a, A, B0 {

    /* renamed from: q  reason: collision with root package name */
    public static final a f13118q = new a((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f13119r = 8;

    /* renamed from: n  reason: collision with root package name */
    private H.c f13120n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13121o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13122p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f13123a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f13124b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f13125c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1197s f13126d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6787a f13127e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6787a f13128f;

        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f13129a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f13130b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C1197s f13131c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C6787a f13132d;

            /* renamed from: androidx.compose.foundation.relocation.f$b$a$a  reason: collision with other inner class name */
            /* synthetic */ class C0247a extends C6494p implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f13133a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C1197s f13134b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C6787a f13135c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0247a(f fVar, C1197s sVar, C6787a aVar) {
                    super(0, C6496s.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f13133a = fVar;
                    this.f13134b = sVar;
                    this.f13135c = aVar;
                }

                /* renamed from: i */
                public final C2423i invoke() {
                    return f.m2(this.f13133a, this.f13134b, this.f13135c);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar, C1197s sVar, C6787a aVar, C6658d dVar) {
                super(2, dVar);
                this.f13130b = fVar;
                this.f13131c = sVar;
                this.f13132d = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f13130b, this.f13131c, this.f13132d, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f13129a;
                if (i10 == 0) {
                    w.b(obj);
                    H.c n22 = this.f13130b.n2();
                    C0247a aVar = new C0247a(this.f13130b, this.f13131c, this.f13132d);
                    this.f13129a = 1;
                    if (n22.Q0(aVar, this) == f10) {
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

        /* renamed from: androidx.compose.foundation.relocation.f$b$b  reason: collision with other inner class name */
        static final class C0248b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f13136a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f13137b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C6787a f13138c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0248b(f fVar, C6787a aVar, C6658d dVar) {
                super(2, dVar);
                this.f13137b = fVar;
                this.f13138c = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0248b(this.f13137b, this.f13138c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0248b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                H.a c10;
                Object f10 = C6680b.f();
                int i10 = this.f13136a;
                if (i10 == 0) {
                    w.b(obj);
                    if (this.f13137b.S1() && (c10 = b.c(this.f13137b)) != null) {
                        C1197s k10 = C1245k.k(this.f13137b);
                        C6787a aVar = this.f13138c;
                        this.f13136a = 1;
                        if (c10.v1(k10, aVar, this) == f10) {
                            return f10;
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
        b(f fVar, C1197s sVar, C6787a aVar, C6787a aVar2, C6658d dVar) {
            super(2, dVar);
            this.f13125c = fVar;
            this.f13126d = sVar;
            this.f13127e = aVar;
            this.f13128f = aVar2;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f13125c, this.f13126d, this.f13127e, this.f13128f, dVar);
            bVar.f13124b = obj;
            return bVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f13123a == 0) {
                w.b(obj);
                K k10 = (K) this.f13124b;
                C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new a(this.f13125c, this.f13126d, this.f13127e, (C6658d) null), 3, (Object) null);
                return C5576k.d(k10, (g) null, (M) null, new C0248b(this.f13125c, this.f13128f, (C6658d) null), 3, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f13139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1197s f13140b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f13141c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C1197s sVar, C6787a aVar) {
            super(0);
            this.f13139a = fVar;
            this.f13140b = sVar;
            this.f13141c = aVar;
        }

        /* renamed from: a */
        public final C2423i invoke() {
            C2423i l22 = f.m2(this.f13139a, this.f13140b, this.f13141c);
            if (l22 != null) {
                return this.f13139a.n2().K0(l22);
            }
            return null;
        }
    }

    public f(H.c cVar) {
        this.f13120n = cVar;
    }

    /* access modifiers changed from: private */
    public static final C2423i m2(f fVar, C1197s sVar, C6787a aVar) {
        C2423i iVar;
        if (!fVar.S1() || !fVar.f13122p) {
            return null;
        }
        C1197s k10 = C1245k.k(fVar);
        if (!sVar.G()) {
            sVar = null;
        }
        if (sVar == null || (iVar = (C2423i) aVar.invoke()) == null) {
            return null;
        }
        return d.c(k10, sVar, iVar);
    }

    public void H0(C1197s sVar) {
        this.f13122p = true;
    }

    public Object L() {
        return f13118q;
    }

    public boolean Q1() {
        return this.f13121o;
    }

    public final H.c n2() {
        return this.f13120n;
    }

    public Object v1(C1197s sVar, C6787a aVar, C6658d dVar) {
        Object e10 = L.e(new b(this, sVar, aVar, new c(this, sVar, aVar), (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }
}
