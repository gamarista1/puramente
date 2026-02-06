package J;

import H0.C1203y;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import Q0.L;
import W0.a0;
import c1.b;
import c1.t;
import com.google.android.gms.common.api.a;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import z.q;

/* renamed from: J.o  reason: case insensitive filesystem */
final class C1219o implements C1203y {

    /* renamed from: b  reason: collision with root package name */
    private final W f3400b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3401c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f3402d;

    /* renamed from: e  reason: collision with root package name */
    private final C6787a f3403e;

    /* renamed from: J.o$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f3404a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1219o f3405b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ U f3406c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3407d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(H h10, C1219o oVar, U u10, int i10) {
            super(1);
            this.f3404a = h10;
            this.f3405b = oVar;
            this.f3406c = u10;
            this.f3407d = i10;
        }

        public final void a(U.a aVar) {
            L l10;
            boolean z10;
            H h10 = this.f3404a;
            int a10 = this.f3405b.a();
            a0 e10 = this.f3405b.e();
            a0 a0Var = (a0) this.f3405b.d().invoke();
            if (a0Var != null) {
                l10 = a0Var.f();
            } else {
                l10 = null;
            }
            if (this.f3404a.getLayoutDirection() == t.Rtl) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f3405b.b().j(q.Horizontal, V.b(h10, a10, e10, l10, z10, this.f3406c.X0()), this.f3407d, this.f3406c.X0());
            U.a.l(aVar, this.f3406c, Math.round(-this.f3405b.b().d()), 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public C1219o(W w10, int i10, a0 a0Var, C6787a aVar) {
        this.f3400b = w10;
        this.f3401c = i10;
        this.f3402d = a0Var;
        this.f3403e = aVar;
    }

    public final int a() {
        return this.f3401c;
    }

    public final W b() {
        return this.f3400b;
    }

    public final C6787a d() {
        return this.f3403e;
    }

    public final a0 e() {
        return this.f3402d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1219o)) {
            return false;
        }
        C1219o oVar = (C1219o) obj;
        if (C6496s.c(this.f3400b, oVar.f3400b) && this.f3401c == oVar.f3401c && C6496s.c(this.f3402d, oVar.f3402d) && C6496s.c(this.f3403e, oVar.f3403e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f3400b.hashCode() * 31) + Integer.hashCode(this.f3401c)) * 31) + this.f3402d.hashCode()) * 31) + this.f3403e.hashCode();
    }

    public G o(H h10, E e10, long j10) {
        long j11;
        if (e10.t0(b.k(j10)) < b.l(j10)) {
            j11 = j10;
        } else {
            j11 = b.d(j10, 0, a.e.API_PRIORITY_OTHER, 0, 0, 13, (Object) null);
        }
        U v02 = e10.v0(j11);
        int min = Math.min(v02.X0(), b.l(j10));
        return H.N(h10, min, v02.R0(), (Map) null, new a(h10, this, v02, min), 4, (Object) null);
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f3400b + ", cursorOffset=" + this.f3401c + ", transformedText=" + this.f3402d + ", textLayoutResultProvider=" + this.f3403e + ')';
    }
}
