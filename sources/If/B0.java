package If;

import Ff.m;
import If.K0;
import Of.Z;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import lf.C6534r;

public class B0 extends K0 implements m {

    /* renamed from: o  reason: collision with root package name */
    private final Lazy f63540o;

    /* renamed from: p  reason: collision with root package name */
    private final Lazy f63541p;

    public static final class a extends K0.c implements m.a {

        /* renamed from: j  reason: collision with root package name */
        private final B0 f63542j;

        public a(B0 b02) {
            C6496s.h(b02, "property");
            this.f63542j = b02;
        }

        /* renamed from: h0 */
        public B0 i() {
            return this.f63542j;
        }

        public Object invoke() {
            return i().get();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0(C5432d0 d0Var, Z z10) {
        super(d0Var, z10);
        C6496s.h(d0Var, "container");
        C6496s.h(z10, "descriptor");
        C6534r rVar = C6534r.PUBLICATION;
        this.f63540o = C6531o.a(rVar, new C5475z0(this));
        this.f63541p = C6531o.a(rVar, new A0(this));
    }

    /* access modifiers changed from: private */
    public static final a l0(B0 b02) {
        return new a(b02);
    }

    /* access modifiers changed from: private */
    public static final Object o0(B0 b02) {
        return b02.g0(b02.e0(), (Object) null, (Object) null);
    }

    public Object get() {
        return i0().call(new Object[0]);
    }

    public Object invoke() {
        return get();
    }

    /* renamed from: p0 */
    public a i0() {
        return (a) this.f63540o.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0(C5432d0 d0Var, String str, String str2, Object obj) {
        super(d0Var, str, str2, obj);
        C6496s.h(d0Var, "container");
        C6496s.h(str, "name");
        C6496s.h(str2, "signature");
        C6534r rVar = C6534r.PUBLICATION;
        this.f63540o = C6531o.a(rVar, new C5475z0(this));
        this.f63541p = C6531o.a(rVar, new A0(this));
    }
}
