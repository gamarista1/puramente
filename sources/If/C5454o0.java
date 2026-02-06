package If;

import Ff.h;
import Ff.o;
import If.K0;
import Of.Z;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6531o;
import lf.C6534r;
import yf.q;

/* renamed from: If.o0  reason: case insensitive filesystem */
public final class C5454o0 extends H0 implements o, h {

    /* renamed from: q  reason: collision with root package name */
    private final Lazy f63718q = C6531o.a(C6534r.PUBLICATION, new C5452n0(this));

    /* renamed from: If.o0$a */
    public static final class a extends K0.d implements h.a, q {

        /* renamed from: j  reason: collision with root package name */
        private final C5454o0 f63719j;

        public a(C5454o0 o0Var) {
            C6496s.h(o0Var, "property");
            this.f63719j = o0Var;
        }

        /* renamed from: h0 */
        public C5454o0 i() {
            return this.f63719j;
        }

        public void i0(Object obj, Object obj2, Object obj3) {
            i().t0(obj, obj2, obj3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            i0(obj, obj2, obj3);
            return C6514M.f71813a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5454o0(C5432d0 d0Var, Z z10) {
        super(d0Var, z10);
        C6496s.h(d0Var, "container");
        C6496s.h(z10, "descriptor");
    }

    /* access modifiers changed from: private */
    public static final a q0(C5454o0 o0Var) {
        return new a(o0Var);
    }

    /* renamed from: s0 */
    public a g() {
        return (a) this.f63718q.getValue();
    }

    public void t0(Object obj, Object obj2, Object obj3) {
        g().call(obj, obj2, obj3);
    }
}
