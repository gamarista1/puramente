package androidx.compose.foundation.lazy.layout;

import E.C1150t;
import E.F;
import J0.w0;
import J0.x0;
import O0.h;
import O0.t;
import O0.v;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import z.q;

final class g extends i.c implements w0 {
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public C6787a f13037n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public F f13038o;

    /* renamed from: p  reason: collision with root package name */
    private q f13039p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13040q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f13041r;

    /* renamed from: s  reason: collision with root package name */
    private h f13042s;

    /* renamed from: t  reason: collision with root package name */
    private final C6798l f13043t = new b(this);

    /* renamed from: u  reason: collision with root package name */
    private C6798l f13044u;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f13045a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.f13045a = gVar;
        }

        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf((float) (this.f13045a.f13038o.d() - this.f13045a.f13038o.a()));
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f13046a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(1);
            this.f13046a = gVar;
        }

        /* renamed from: a */
        public final Integer invoke(Object obj) {
            C1150t tVar = (C1150t) this.f13046a.f13037n.invoke();
            int a10 = tVar.a();
            int i10 = 0;
            while (true) {
                if (i10 >= a10) {
                    i10 = -1;
                    break;
                } else if (C6496s.c(tVar.d(i10), obj)) {
                    break;
                } else {
                    i10++;
                }
            }
            return Integer.valueOf(i10);
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f13047a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(0);
            this.f13047a = gVar;
        }

        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(this.f13047a.f13038o.e());
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f13048a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.f13048a = gVar;
        }

        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(this.f13048a.f13038o.b());
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f13049a;

        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f13050a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f13051b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f13052c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, int i10, C6658d dVar) {
                super(2, dVar);
                this.f13051b = gVar;
                this.f13052c = i10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f13051b, this.f13052c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f13050a;
                if (i10 == 0) {
                    w.b(obj);
                    F m22 = this.f13051b.f13038o;
                    int i11 = this.f13052c;
                    this.f13050a = 1;
                    if (m22.f(i11, this) == f10) {
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
        e(g gVar) {
            super(1);
            this.f13049a = gVar;
        }

        public final Boolean a(int i10) {
            C1150t tVar = (C1150t) this.f13049a.f13037n.invoke();
            if (i10 < 0 || i10 >= tVar.a()) {
                throw new IllegalArgumentException(("Can't scroll to index " + i10 + ", it is out of bounds [0, " + tVar.a() + ')').toString());
            }
            C5600w0 unused = C5576k.d(this.f13049a.L1(), (qf.g) null, (M) null, new a(this.f13049a, i10, (C6658d) null), 3, (Object) null);
            return Boolean.TRUE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public g(C6787a aVar, F f10, q qVar, boolean z10, boolean z11) {
        this.f13037n = aVar;
        this.f13038o = f10;
        this.f13039p = qVar;
        this.f13040q = z10;
        this.f13041r = z11;
        q2();
    }

    private final O0.b n2() {
        return this.f13038o.c();
    }

    private final boolean o2() {
        if (this.f13039p == q.Vertical) {
            return true;
        }
        return false;
    }

    private final void q2() {
        e eVar;
        this.f13042s = new h(new c(this), new d(this), this.f13041r);
        if (this.f13040q) {
            eVar = new e(this);
        } else {
            eVar = null;
        }
        this.f13044u = eVar;
    }

    public boolean Q1() {
        return false;
    }

    public void W(v vVar) {
        t.t0(vVar, true);
        t.t(vVar, this.f13043t);
        if (o2()) {
            h hVar = this.f13042s;
            if (hVar == null) {
                C6496s.v("scrollAxisRange");
                hVar = null;
            }
            t.v0(vVar, hVar);
        } else {
            h hVar2 = this.f13042s;
            if (hVar2 == null) {
                C6496s.v("scrollAxisRange");
                hVar2 = null;
            }
            t.c0(vVar, hVar2);
        }
        C6798l lVar = this.f13044u;
        if (lVar != null) {
            t.V(vVar, (String) null, lVar, 1, (Object) null);
        }
        t.q(vVar, (String) null, new a(this), 1, (Object) null);
        t.W(vVar, n2());
    }

    public final void p2(C6787a aVar, F f10, q qVar, boolean z10, boolean z11) {
        this.f13037n = aVar;
        this.f13038o = f10;
        if (this.f13039p != qVar) {
            this.f13039p = qVar;
            x0.b(this);
        }
        if (this.f13040q != z10 || this.f13041r != z11) {
            this.f13040q = z10;
            this.f13041r = z11;
            q2();
            x0.b(this);
        }
    }
}
