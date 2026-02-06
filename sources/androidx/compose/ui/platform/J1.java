package androidx.compose.ui.platform;

import Ug.K;
import Y.C1500m;
import Y.C1506p;
import Y.C1508q;
import Y.C1521x;
import Y.J0;
import Y.P;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.r;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import g0.c;
import j0.C2119d;
import java.util.Set;
import k0.m;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.V;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

final class J1 implements C1508q, C1795s {

    /* renamed from: a  reason: collision with root package name */
    private final r f13580a;

    /* renamed from: b  reason: collision with root package name */
    private final C1508q f13581b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f13582c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C1790m f13583d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public p f13584e = C1641j0.f13759a.a();

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J1 f13585a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f13586b;

        /* renamed from: androidx.compose.ui.platform.J1$a$a  reason: collision with other inner class name */
        static final class C0258a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ J1 f13587a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f13588b;

            /* renamed from: androidx.compose.ui.platform.J1$a$a$a  reason: collision with other inner class name */
            static final class C0259a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f13589a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ J1 f13590b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0259a(J1 j12, C6658d dVar) {
                    super(2, dVar);
                    this.f13590b = j12;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0259a(this.f13590b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0259a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f13589a;
                    if (i10 == 0) {
                        w.b(obj);
                        r C10 = this.f13590b.C();
                        this.f13589a = 1;
                        if (C10.d0(this) == f10) {
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

            /* renamed from: androidx.compose.ui.platform.J1$a$a$b */
            static final class b extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f13591a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ J1 f13592b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(J1 j12, C6658d dVar) {
                    super(2, dVar);
                    this.f13592b = j12;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new b(this.f13592b, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f13591a;
                    if (i10 == 0) {
                        w.b(obj);
                        r C10 = this.f13592b.C();
                        this.f13591a = 1;
                        if (C10.e0(this) == f10) {
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

            /* renamed from: androidx.compose.ui.platform.J1$a$a$c */
            static final class c extends C6498u implements p {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ J1 f13593a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ p f13594b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(J1 j12, p pVar) {
                    super(2);
                    this.f13593a = j12;
                    this.f13594b = pVar;
                }

                public final void a(C1500m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.i()) {
                        if (C1506p.H()) {
                            C1506p.Q(-1193460702, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                        }
                        AndroidCompositionLocals_androidKt.a(this.f13593a.C(), this.f13594b, mVar, 0);
                        if (C1506p.H()) {
                            C1506p.P();
                            return;
                        }
                        return;
                    }
                    mVar.I();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0258a(J1 j12, p pVar) {
                super(2);
                this.f13587a = j12;
                this.f13588b = pVar;
            }

            public final void a(C1500m mVar, int i10) {
                Set set;
                View view;
                Object obj;
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(-2000640158, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)");
                    }
                    Object tag = this.f13587a.C().getTag(m.f23102K);
                    if (V.p(tag)) {
                        set = (Set) tag;
                    } else {
                        set = null;
                    }
                    if (set == null) {
                        ViewParent parent = this.f13587a.C().getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            obj = view.getTag(m.f23102K);
                        } else {
                            obj = null;
                        }
                        if (V.p(obj)) {
                            set = (Set) obj;
                        } else {
                            set = null;
                        }
                    }
                    if (set != null) {
                        set.add(mVar.B());
                        mVar.w();
                    }
                    r C10 = this.f13587a.C();
                    boolean C11 = mVar.C(this.f13587a);
                    J1 j12 = this.f13587a;
                    Object A10 = mVar.A();
                    if (C11 || A10 == C1500m.f10026a.a()) {
                        A10 = new C0259a(j12, (C6658d) null);
                        mVar.r(A10);
                    }
                    P.g(C10, (p) A10, mVar, 0);
                    r C12 = this.f13587a.C();
                    boolean C13 = mVar.C(this.f13587a);
                    J1 j13 = this.f13587a;
                    Object A11 = mVar.A();
                    if (C13 || A11 == C1500m.f10026a.a()) {
                        A11 = new b(j13, (C6658d) null);
                        mVar.r(A11);
                    }
                    P.g(C12, (p) A11, mVar, 0);
                    C1521x.a(C2119d.a().d(set), g0.c.e(-1193460702, true, new c(this.f13587a, this.f13588b), mVar, 54), mVar, J0.f9784i | 48);
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                mVar.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1500m) obj, ((Number) obj2).intValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(J1 j12, p pVar) {
            super(1);
            this.f13585a = j12;
            this.f13586b = pVar;
        }

        public final void a(r.b bVar) {
            if (!this.f13585a.f13582c) {
                C1790m lifecycle = bVar.a().getLifecycle();
                this.f13585a.f13584e = this.f13586b;
                if (this.f13585a.f13583d == null) {
                    this.f13585a.f13583d = lifecycle;
                    lifecycle.a(this.f13585a);
                } else if (lifecycle.b().b(C1790m.b.CREATED)) {
                    this.f13585a.B().d(c.c(-2000640158, true, new C0258a(this.f13585a, this.f13586b)));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r.b) obj);
            return C6514M.f71813a;
        }
    }

    public J1(r rVar, C1508q qVar) {
        this.f13580a = rVar;
        this.f13581b = qVar;
    }

    public final C1508q B() {
        return this.f13581b;
    }

    public final r C() {
        return this.f13580a;
    }

    public void d(p pVar) {
        this.f13580a.setOnViewTreeOwnersAvailable(new a(this, pVar));
    }

    public void dispose() {
        if (!this.f13582c) {
            this.f13582c = true;
            this.f13580a.getView().setTag(m.f23103L, (Object) null);
            C1790m mVar = this.f13583d;
            if (mVar != null) {
                mVar.d(this);
            }
        }
        this.f13581b.dispose();
    }

    public void f(C1798v vVar, C1790m.a aVar) {
        if (aVar == C1790m.a.ON_DESTROY) {
            dispose();
        } else if (aVar == C1790m.a.ON_CREATE && !this.f13582c) {
            d(this.f13584e);
        }
    }
}
