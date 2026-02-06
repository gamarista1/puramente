package x;

import Ef.m;
import H0.C1193n;
import H0.C1194o;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import androidx.compose.foundation.o;
import c1.b;
import com.google.android.gms.common.api.a;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import z.q;

public final class b0 extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private o f27922n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f27923o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f27924p;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f27925a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f27926b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ U f27927c;

        /* renamed from: x.b0$a$a  reason: collision with other inner class name */
        static final class C0468a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ U f27928a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f27929b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f27930c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0468a(U u10, int i10, int i11) {
                super(1);
                this.f27928a = u10;
                this.f27929b = i10;
                this.f27930c = i11;
            }

            public final void a(U.a aVar) {
                U.a.p(aVar, this.f27928a, this.f27929b, this.f27930c, 0.0f, (C6798l) null, 12, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b0 b0Var, int i10, U u10) {
            super(1);
            this.f27925a = b0Var;
            this.f27926b = i10;
            this.f27927c = u10;
        }

        public final void a(U.a aVar) {
            int i10;
            int i11;
            int i12 = 0;
            int l10 = m.l(this.f27925a.l2().n(), 0, this.f27926b);
            if (this.f27925a.m2()) {
                i10 = l10 - this.f27926b;
            } else {
                i10 = -l10;
            }
            if (this.f27925a.n2()) {
                i11 = 0;
            } else {
                i11 = i10;
            }
            if (this.f27925a.n2()) {
                i12 = i10;
            }
            aVar.A(new C0468a(this.f27927c, i11, i12));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public b0(o oVar, boolean z10, boolean z11) {
        this.f27922n = oVar;
        this.f27923o = z10;
        this.f27924p = z11;
    }

    public int B(C1194o oVar, C1193n nVar, int i10) {
        if (this.f27924p) {
            return nVar.s(i10);
        }
        return nVar.s(a.e.API_PRIORITY_OTHER);
    }

    public int D(C1194o oVar, C1193n nVar, int i10) {
        if (this.f27924p) {
            return nVar.e0(i10);
        }
        return nVar.e0(a.e.API_PRIORITY_OTHER);
    }

    public int G(C1194o oVar, C1193n nVar, int i10) {
        if (this.f27924p) {
            return nVar.t0(a.e.API_PRIORITY_OTHER);
        }
        return nVar.t0(i10);
    }

    public final o l2() {
        return this.f27922n;
    }

    public final boolean m2() {
        return this.f27923o;
    }

    public final boolean n2() {
        return this.f27924p;
    }

    public G o(H h10, E e10, long j10) {
        q qVar;
        int i10;
        int i11;
        if (this.f27924p) {
            qVar = q.Vertical;
        } else {
            qVar = q.Horizontal;
        }
        C2871j.a(j10, qVar);
        boolean z10 = this.f27924p;
        int i12 = a.e.API_PRIORITY_OTHER;
        if (z10) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = b.k(j10);
        }
        if (this.f27924p) {
            i12 = b.l(j10);
        }
        U v02 = e10.v0(b.d(j10, 0, i12, 0, i10, 5, (Object) null));
        int h11 = m.h(v02.X0(), b.l(j10));
        int h12 = m.h(v02.R0(), b.k(j10));
        int R02 = v02.R0() - h12;
        int X02 = v02.X0() - h11;
        if (!this.f27924p) {
            R02 = X02;
        }
        this.f27922n.p(R02);
        o oVar = this.f27922n;
        if (this.f27924p) {
            i11 = h12;
        } else {
            i11 = h11;
        }
        oVar.r(i11);
        return H.N(h10, h11, h12, (Map) null, new a(this, R02, v02), 4, (Object) null);
    }

    public final void o2(boolean z10) {
        this.f27923o = z10;
    }

    public final void p2(o oVar) {
        this.f27922n = oVar;
    }

    public final void q2(boolean z10) {
        this.f27924p = z10;
    }

    public int x(C1194o oVar, C1193n nVar, int i10) {
        if (this.f27924p) {
            return nVar.s0(a.e.API_PRIORITY_OTHER);
        }
        return nVar.s0(i10);
    }
}
