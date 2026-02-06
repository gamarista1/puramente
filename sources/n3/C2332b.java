package n3;

import Ug.C5572i;
import Ug.K;
import Xg.C5694f;
import Y.C1500m;
import Y.C1506p;
import Y.P;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import m3.C2219s;
import m3.r;
import qf.C6658d;
import qf.g;
import qf.h;
import rf.C6680b;
import yf.p;

/* renamed from: n3.b  reason: case insensitive filesystem */
public abstract class C2332b {

    /* renamed from: a  reason: collision with root package name */
    private static final r.c f24680a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C2219s f24681b;

    /* renamed from: n3.b$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f24682a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f24683b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2331a f24684c;

        /* renamed from: n3.b$a$a  reason: collision with other inner class name */
        static final class C0417a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f24685a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2331a f24686b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0417a(C2331a aVar, C6658d dVar) {
                super(2, dVar);
                this.f24686b = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0417a(this.f24686b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0417a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f24685a;
                if (i10 == 0) {
                    w.b(obj);
                    C2331a aVar = this.f24686b;
                    this.f24685a = 1;
                    if (aVar.e(this) == f10) {
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
        a(g gVar, C2331a aVar, C6658d dVar) {
            super(2, dVar);
            this.f24683b = gVar;
            this.f24684c = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f24683b, this.f24684c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f24682a;
            if (i10 == 0) {
                w.b(obj);
                if (C6496s.c(this.f24683b, h.f72645a)) {
                    C2331a aVar = this.f24684c;
                    this.f24682a = 1;
                    if (aVar.e(this) == f10) {
                        return f10;
                    }
                } else {
                    g gVar = this.f24683b;
                    C0417a aVar2 = new C0417a(this.f24684c, (C6658d) null);
                    this.f24682a = 2;
                    if (C5572i.g(gVar, aVar2, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: n3.b$b  reason: collision with other inner class name */
    static final class C0418b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f24687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f24688b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2331a f24689c;

        /* renamed from: n3.b$b$a */
        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f24690a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2331a f24691b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2331a aVar, C6658d dVar) {
                super(2, dVar);
                this.f24691b = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f24691b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f24690a;
                if (i10 == 0) {
                    w.b(obj);
                    C2331a aVar = this.f24691b;
                    this.f24690a = 1;
                    if (aVar.d(this) == f10) {
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
        C0418b(g gVar, C2331a aVar, C6658d dVar) {
            super(2, dVar);
            this.f24688b = gVar;
            this.f24689c = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new C0418b(this.f24688b, this.f24689c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((C0418b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f24687a;
            if (i10 == 0) {
                w.b(obj);
                if (C6496s.c(this.f24688b, h.f72645a)) {
                    C2331a aVar = this.f24689c;
                    this.f24687a = 1;
                    if (aVar.d(this) == f10) {
                        return f10;
                    }
                } else {
                    g gVar = this.f24688b;
                    a aVar2 = new a(this.f24689c, (C6658d) null);
                    this.f24687a = 2;
                    if (C5572i.g(gVar, aVar2, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static {
        r.c cVar = new r.c(false);
        f24680a = cVar;
        f24681b = new C2219s(r.b.f24096b, cVar, cVar);
    }

    public static final C2331a b(C5694f fVar, g gVar, C1500m mVar, int i10, int i11) {
        C6496s.h(fVar, "<this>");
        mVar.z(388053246);
        if ((i11 & 1) != 0) {
            gVar = h.f72645a;
        }
        if (C1506p.H()) {
            C1506p.Q(388053246, i10, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:203)");
        }
        mVar.z(1046463091);
        boolean S10 = mVar.S(fVar);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = new C2331a(fVar);
            mVar.r(A10);
        }
        C2331a aVar = (C2331a) A10;
        mVar.R();
        mVar.z(1046463169);
        boolean C10 = mVar.C(gVar) | mVar.C(aVar);
        Object A11 = mVar.A();
        if (C10 || A11 == C1500m.f10026a.a()) {
            A11 = new a(gVar, aVar, (C6658d) null);
            mVar.r(A11);
        }
        mVar.R();
        P.g(aVar, (p) A11, mVar, 0);
        mVar.z(1046463438);
        boolean C11 = mVar.C(gVar) | mVar.C(aVar);
        Object A12 = mVar.A();
        if (C11 || A12 == C1500m.f10026a.a()) {
            A12 = new C0418b(gVar, aVar, (C6658d) null);
            mVar.r(A12);
        }
        mVar.R();
        P.g(aVar, (p) A12, mVar, 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        mVar.R();
        return aVar;
    }
}
