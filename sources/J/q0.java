package J;

import H0.C1203y;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import Q0.L;
import W0.a0;
import c1.b;
import com.google.android.gms.common.api.a;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import z.q;

final class q0 implements C1203y {

    /* renamed from: b  reason: collision with root package name */
    private final W f3462b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3463c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f3464d;

    /* renamed from: e  reason: collision with root package name */
    private final C6787a f3465e;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f3466a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q0 f3467b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ U f3468c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(H h10, q0 q0Var, U u10, int i10) {
            super(1);
            this.f3466a = h10;
            this.f3467b = q0Var;
            this.f3468c = u10;
            this.f3469d = i10;
        }

        public final void a(U.a aVar) {
            L l10;
            H h10 = this.f3466a;
            int a10 = this.f3467b.a();
            a0 e10 = this.f3467b.e();
            a0 a0Var = (a0) this.f3467b.d().invoke();
            if (a0Var != null) {
                l10 = a0Var.f();
            } else {
                l10 = null;
            }
            this.f3467b.b().j(q.Vertical, V.b(h10, a10, e10, l10, false, this.f3468c.X0()), this.f3469d, this.f3468c.R0());
            U.a.l(aVar, this.f3468c, 0, Math.round(-this.f3467b.b().d()), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public q0(W w10, int i10, a0 a0Var, C6787a aVar) {
        this.f3462b = w10;
        this.f3463c = i10;
        this.f3464d = a0Var;
        this.f3465e = aVar;
    }

    public final int a() {
        return this.f3463c;
    }

    public final W b() {
        return this.f3462b;
    }

    public final C6787a d() {
        return this.f3465e;
    }

    public final a0 e() {
        return this.f3464d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (C6496s.c(this.f3462b, q0Var.f3462b) && this.f3463c == q0Var.f3463c && C6496s.c(this.f3464d, q0Var.f3464d) && C6496s.c(this.f3465e, q0Var.f3465e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f3462b.hashCode() * 31) + Integer.hashCode(this.f3463c)) * 31) + this.f3464d.hashCode()) * 31) + this.f3465e.hashCode();
    }

    public G o(H h10, E e10, long j10) {
        U v02 = e10.v0(b.d(j10, 0, 0, 0, a.e.API_PRIORITY_OTHER, 7, (Object) null));
        int min = Math.min(v02.R0(), b.k(j10));
        return H.N(h10, v02.X0(), min, (Map) null, new a(h10, this, v02, min), 4, (Object) null);
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f3462b + ", cursorOffset=" + this.f3463c + ", transformedText=" + this.f3464d + ", textLayoutResultProvider=" + this.f3465e + ')';
    }
}
