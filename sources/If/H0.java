package If;

import Ff.o;
import If.K0;
import Of.Z;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.jvm.internal.C6484f;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import lf.C6534r;

public class H0 extends K0 implements o {

    /* renamed from: o  reason: collision with root package name */
    private final Lazy f63556o;

    /* renamed from: p  reason: collision with root package name */
    private final Lazy f63557p;

    public static final class a extends K0.c implements o.a {

        /* renamed from: j  reason: collision with root package name */
        private final H0 f63558j;

        public a(H0 h02) {
            C6496s.h(h02, "property");
            this.f63558j = h02;
        }

        /* renamed from: h0 */
        public H0 i() {
            return this.f63558j;
        }

        public Object invoke(Object obj, Object obj2) {
            return i().p(obj, obj2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H0(C5432d0 d0Var, String str, String str2) {
        super(d0Var, str, str2, C6484f.NO_RECEIVER);
        C6496s.h(d0Var, "container");
        C6496s.h(str, "name");
        C6496s.h(str2, "signature");
        C6534r rVar = C6534r.PUBLICATION;
        this.f63556o = C6531o.a(rVar, new F0(this));
        this.f63557p = C6531o.a(rVar, new G0(this));
    }

    /* access modifiers changed from: private */
    public static final a l0(H0 h02) {
        return new a(h02);
    }

    /* access modifiers changed from: private */
    public static final Member o0(H0 h02) {
        return h02.e0();
    }

    public Object invoke(Object obj, Object obj2) {
        return p(obj, obj2);
    }

    public Object p(Object obj, Object obj2) {
        return i0().call(obj, obj2);
    }

    /* renamed from: p0 */
    public a i0() {
        return (a) this.f63556o.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H0(C5432d0 d0Var, Z z10) {
        super(d0Var, z10);
        C6496s.h(d0Var, "container");
        C6496s.h(z10, "descriptor");
        C6534r rVar = C6534r.PUBLICATION;
        this.f63556o = C6531o.a(rVar, new F0(this));
        this.f63557p = C6531o.a(rVar, new G0(this));
    }
}
