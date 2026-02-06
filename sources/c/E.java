package C;

import H0.C1203y;
import H0.G;
import H0.H;
import H0.U;
import I0.d;
import I0.j;
import I0.k;
import I0.l;
import Y.C1510r0;
import Y.o1;
import c1.c;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public final class E implements C1203y, d, j {

    /* renamed from: b  reason: collision with root package name */
    private final f0 f833b;

    /* renamed from: c  reason: collision with root package name */
    private final C1510r0 f834c;

    /* renamed from: d  reason: collision with root package name */
    private final C1510r0 f835d;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f837b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f838c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10, int i10, int i11) {
            super(1);
            this.f836a = u10;
            this.f837b = i10;
            this.f838c = i11;
        }

        public final void a(U.a aVar) {
            U.a.h(aVar, this.f836a, this.f837b, this.f838c, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public E(f0 f0Var) {
        this.f833b = f0Var;
        this.f834c = u1.d(f0Var, (o1) null, 2, (Object) null);
        this.f835d = u1.d(f0Var, (o1) null, 2, (Object) null);
    }

    private final f0 a() {
        return (f0) this.f835d.getValue();
    }

    private final f0 b() {
        return (f0) this.f834c.getValue();
    }

    private final void e(f0 f0Var) {
        this.f835d.setValue(f0Var);
    }

    private final void i(f0 f0Var) {
        this.f834c.setValue(f0Var);
    }

    /* renamed from: d */
    public f0 getValue() {
        return a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        return C6496s.c(((E) obj).f833b, this.f833b);
    }

    public void g(k kVar) {
        f0 f0Var = (f0) kVar.a(i0.b());
        i(h0.f(this.f833b, f0Var));
        e(h0.h(f0Var, this.f833b));
    }

    public l getKey() {
        return i0.b();
    }

    public int hashCode() {
        return this.f833b.hashCode();
    }

    public G o(H h10, H0.E e10, long j10) {
        int d10 = b().d(h10, h10.getLayoutDirection());
        int c10 = b().c(h10);
        int b10 = b().b(h10, h10.getLayoutDirection()) + d10;
        int a10 = b().a(h10) + c10;
        U v02 = e10.v0(c.n(j10, -b10, -a10));
        return H.N(h10, c.i(j10, v02.X0() + b10), c.h(j10, v02.R0() + a10), (Map) null, new a(v02, d10, c10), 4, (Object) null);
    }
}
