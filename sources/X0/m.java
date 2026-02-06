package x0;

import Y.C1510r0;
import Y.o1;
import c1.s;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q0.C2421g;
import q0.C2427m;
import r0.C2547y0;
import r0.H1;
import r0.I1;
import t0.C2603d;
import t0.C2605f;
import yf.C6787a;
import yf.C6798l;

public final class m extends l {

    /* renamed from: b  reason: collision with root package name */
    private final C2890c f28156b;

    /* renamed from: c  reason: collision with root package name */
    private String f28157c = "";

    /* renamed from: d  reason: collision with root package name */
    private boolean f28158d = true;

    /* renamed from: e  reason: collision with root package name */
    private final C2888a f28159e = new C2888a();

    /* renamed from: f  reason: collision with root package name */
    private C6787a f28160f = c.f28170a;

    /* renamed from: g  reason: collision with root package name */
    private final C1510r0 f28161g = u1.d((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    private C2547y0 f28162h;

    /* renamed from: i  reason: collision with root package name */
    private final C1510r0 f28163i;

    /* renamed from: j  reason: collision with root package name */
    private long f28164j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public float f28165k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public float f28166l;

    /* renamed from: m  reason: collision with root package name */
    private final C6798l f28167m;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f28168a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar) {
            super(1);
            this.f28168a = mVar;
        }

        public final void a(l lVar) {
            this.f28168a.h();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f28169a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar) {
            super(1);
            this.f28169a = mVar;
        }

        public final void a(C2605f fVar) {
            C2890c l10 = this.f28169a.l();
            m mVar = this.f28169a;
            float f10 = mVar.f28165k;
            float g10 = mVar.f28166l;
            long c10 = C2421g.f25320b.c();
            C2603d w12 = fVar.w1();
            long d10 = w12.d();
            w12.f().q();
            try {
                w12.e().e(f10, g10, c10);
                l10.a(fVar);
            } finally {
                w12.f().h();
                w12.h(d10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f28170a = new c();

        c() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public m(C2890c cVar) {
        super((DefaultConstructorMarker) null);
        this.f28156b = cVar;
        cVar.d(new a(this));
        C2427m.a aVar = C2427m.f25341b;
        this.f28163i = u1.d(C2427m.c(aVar.b()), (o1) null, 2, (Object) null);
        this.f28164j = aVar.a();
        this.f28165k = 1.0f;
        this.f28166l = 1.0f;
        this.f28167m = new b(this);
    }

    /* access modifiers changed from: private */
    public final void h() {
        this.f28158d = true;
        this.f28160f.invoke();
    }

    public void a(C2605f fVar) {
        i(fVar, 1.0f, (C2547y0) null);
    }

    public final void i(C2605f fVar, float f10, C2547y0 y0Var) {
        int b10;
        C2547y0 y0Var2;
        if (!this.f28156b.j() || this.f28156b.g() == 16 || !o.f(k()) || !o.f(y0Var)) {
            b10 = I1.f25425b.b();
        } else {
            b10 = I1.f25425b.a();
        }
        int i10 = b10;
        if (this.f28158d || !C2427m.h(this.f28164j, fVar.d()) || !I1.i(i10, j())) {
            if (I1.i(i10, I1.f25425b.a())) {
                y0Var2 = C2547y0.a.c(C2547y0.f25576b, this.f28156b.g(), 0, 2, (Object) null);
            } else {
                y0Var2 = null;
            }
            this.f28162h = y0Var2;
            this.f28165k = C2427m.k(fVar.d()) / C2427m.k(m());
            this.f28166l = C2427m.i(fVar.d()) / C2427m.i(m());
            this.f28159e.b(i10, s.a((int) ((float) Math.ceil((double) C2427m.k(fVar.d()))), (int) ((float) Math.ceil((double) C2427m.i(fVar.d())))), fVar, fVar.getLayoutDirection(), this.f28167m);
            this.f28158d = false;
            this.f28164j = fVar.d();
        }
        if (y0Var == null) {
            if (k() != null) {
                y0Var = k();
            } else {
                y0Var = this.f28162h;
            }
        }
        this.f28159e.c(fVar, f10, y0Var);
    }

    public final int j() {
        H1 d10 = this.f28159e.d();
        if (d10 != null) {
            return d10.b();
        }
        return I1.f25425b.b();
    }

    public final C2547y0 k() {
        return (C2547y0) this.f28161g.getValue();
    }

    public final C2890c l() {
        return this.f28156b;
    }

    public final long m() {
        return ((C2427m) this.f28163i.getValue()).o();
    }

    public final void n(C2547y0 y0Var) {
        this.f28161g.setValue(y0Var);
    }

    public final void o(C6787a aVar) {
        this.f28160f = aVar;
    }

    public final void p(String str) {
        this.f28157c = str;
    }

    public final void q(long j10) {
        this.f28163i.setValue(C2427m.c(j10));
    }

    public String toString() {
        String str = "Params: " + "\tname: " + this.f28157c + "\n" + "\tviewportWidth: " + C2427m.k(m()) + "\n" + "\tviewportHeight: " + C2427m.i(m()) + "\n";
        C6496s.g(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
