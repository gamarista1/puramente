package If;

import Ff.i;
import If.K0;
import Of.Z;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6531o;
import lf.C6534r;

/* renamed from: If.k0  reason: case insensitive filesystem */
public final class C5446k0 extends B0 implements i {

    /* renamed from: q  reason: collision with root package name */
    private final Lazy f63699q = C6531o.a(C6534r.PUBLICATION, new C5444j0(this));

    /* renamed from: If.k0$a */
    public static final class a extends K0.d implements i.a {

        /* renamed from: j  reason: collision with root package name */
        private final C5446k0 f63700j;

        public a(C5446k0 k0Var) {
            C6496s.h(k0Var, "property");
            this.f63700j = k0Var;
        }

        /* renamed from: h0 */
        public C5446k0 i() {
            return this.f63700j;
        }

        public void i0(Object obj) {
            i().set(obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i0(obj);
            return C6514M.f71813a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5446k0(C5432d0 d0Var, Z z10) {
        super(d0Var, z10);
        C6496s.h(d0Var, "container");
        C6496s.h(z10, "descriptor");
    }

    /* access modifiers changed from: private */
    public static final a q0(C5446k0 k0Var) {
        return new a(k0Var);
    }

    /* renamed from: s0 */
    public a g() {
        return (a) this.f63699q.getValue();
    }

    public void set(Object obj) {
        g().call(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5446k0(C5432d0 d0Var, String str, String str2, Object obj) {
        super(d0Var, str, str2, obj);
        C6496s.h(d0Var, "container");
        C6496s.h(str, "name");
        C6496s.h(str2, "signature");
    }
}
