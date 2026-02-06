package androidx.compose.foundation;

import J0.w0;
import O0.h;
import O0.t;
import O0.v;
import k0.i;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

final class n extends i.c implements w0 {

    /* renamed from: n  reason: collision with root package name */
    private o f13085n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13086o;

    /* renamed from: p  reason: collision with root package name */
    private z.n f13087p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13088q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f13089r;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f13090a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar) {
            super(0);
            this.f13090a = nVar;
        }

        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf((float) this.f13090a.l2().n());
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f13091a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(0);
            this.f13091a = nVar;
        }

        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf((float) this.f13091a.l2().m());
        }
    }

    public n(o oVar, boolean z10, z.n nVar, boolean z11, boolean z12) {
        this.f13085n = oVar;
        this.f13086o = z10;
        this.f13087p = nVar;
        this.f13088q = z11;
        this.f13089r = z12;
    }

    public void W(v vVar) {
        t.t0(vVar, true);
        h hVar = new h(new a(this), new b(this), this.f13086o);
        if (this.f13089r) {
            t.v0(vVar, hVar);
        } else {
            t.c0(vVar, hVar);
        }
    }

    public final o l2() {
        return this.f13085n;
    }

    public final void m2(z.n nVar) {
        this.f13087p = nVar;
    }

    public final void n2(boolean z10) {
        this.f13086o = z10;
    }

    public final void o2(boolean z10) {
        this.f13088q = z10;
    }

    public final void p2(o oVar) {
        this.f13085n = oVar;
    }

    public final void q2(boolean z10) {
        this.f13089r = z10;
    }
}
