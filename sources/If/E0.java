package If;

import Ff.n;
import If.K0;
import Of.Z;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import lf.C6534r;

public class E0 extends K0 implements n {

    /* renamed from: o  reason: collision with root package name */
    private final Lazy f63548o;

    /* renamed from: p  reason: collision with root package name */
    private final Lazy f63549p;

    public static final class a extends K0.c implements n.a {

        /* renamed from: j  reason: collision with root package name */
        private final E0 f63550j;

        public a(E0 e02) {
            C6496s.h(e02, "property");
            this.f63550j = e02;
        }

        /* renamed from: h0 */
        public E0 i() {
            return this.f63550j;
        }

        public Object invoke(Object obj) {
            return i().get(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E0(C5432d0 d0Var, String str, String str2, Object obj) {
        super(d0Var, str, str2, obj);
        C6496s.h(d0Var, "container");
        C6496s.h(str, "name");
        C6496s.h(str2, "signature");
        C6534r rVar = C6534r.PUBLICATION;
        this.f63548o = C6531o.a(rVar, new C0(this));
        this.f63549p = C6531o.a(rVar, new D0(this));
    }

    /* access modifiers changed from: private */
    public static final a l0(E0 e02) {
        return new a(e02);
    }

    /* access modifiers changed from: private */
    public static final Member o0(E0 e02) {
        return e02.e0();
    }

    public Object get(Object obj) {
        return i0().call(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    /* renamed from: p0 */
    public a i0() {
        return (a) this.f63548o.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E0(C5432d0 d0Var, Z z10) {
        super(d0Var, z10);
        C6496s.h(d0Var, "container");
        C6496s.h(z10, "descriptor");
        C6534r rVar = C6534r.PUBLICATION;
        this.f63548o = C6531o.a(rVar, new C0(this));
        this.f63549p = C6531o.a(rVar, new D0(this));
    }
}
