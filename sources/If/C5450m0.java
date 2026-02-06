package If;

import Ff.j;
import If.K0;
import Of.Z;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6531o;
import lf.C6534r;

/* renamed from: If.m0  reason: case insensitive filesystem */
public final class C5450m0 extends E0 implements j {

    /* renamed from: q  reason: collision with root package name */
    private final Lazy f63706q = C6531o.a(C6534r.PUBLICATION, new C5448l0(this));

    /* renamed from: If.m0$a */
    public static final class a extends K0.d implements j.a {

        /* renamed from: j  reason: collision with root package name */
        private final C5450m0 f63707j;

        public a(C5450m0 m0Var) {
            C6496s.h(m0Var, "property");
            this.f63707j = m0Var;
        }

        /* renamed from: h0 */
        public C5450m0 i() {
            return this.f63707j;
        }

        public void i0(Object obj, Object obj2) {
            i().t0(obj, obj2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            i0(obj, obj2);
            return C6514M.f71813a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5450m0(C5432d0 d0Var, String str, String str2, Object obj) {
        super(d0Var, str, str2, obj);
        C6496s.h(d0Var, "container");
        C6496s.h(str, "name");
        C6496s.h(str2, "signature");
    }

    /* access modifiers changed from: private */
    public static final a q0(C5450m0 m0Var) {
        return new a(m0Var);
    }

    /* renamed from: s0 */
    public a g() {
        return (a) this.f63706q.getValue();
    }

    public void t0(Object obj, Object obj2) {
        g().call(obj, obj2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5450m0(C5432d0 d0Var, Z z10) {
        super(d0Var, z10);
        C6496s.h(d0Var, "container");
        C6496s.h(z10, "descriptor");
    }
}
