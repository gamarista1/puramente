package Hg;

import Lf.g;
import Lf.i;
import Of.C5495m;
import Of.C5497o;
import Of.G;
import Of.H;
import Of.V;
import Pf.h;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import mf.C6565s;
import mf.Y;
import ng.c;
import ng.f;
import yf.C6798l;

public final class e implements H {

    /* renamed from: a  reason: collision with root package name */
    public static final e f63351a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final f f63352b;

    /* renamed from: c  reason: collision with root package name */
    private static final List f63353c = C6565s.n();

    /* renamed from: d  reason: collision with root package name */
    private static final List f63354d = C6565s.n();

    /* renamed from: e  reason: collision with root package name */
    private static final Set f63355e = Y.e();

    /* renamed from: f  reason: collision with root package name */
    private static final Lazy f63356f = C6531o.b(d.f63350a);

    static {
        f m10 = f.m(b.ERROR_MODULE.b());
        C6496s.g(m10, "special(...)");
        f63352b = m10;
    }

    private e() {
    }

    /* access modifiers changed from: private */
    public static final g m0() {
        return g.f63871h.a();
    }

    public Object C0(G g10) {
        C6496s.h(g10, "capability");
        return null;
    }

    public f F0() {
        return f63352b;
    }

    public boolean J(H h10) {
        C6496s.h(h10, "targetModule");
        return false;
    }

    public Object U(C5497o oVar, Object obj) {
        C6496s.h(oVar, "visitor");
        return null;
    }

    public C5495m b() {
        return null;
    }

    public h getAnnotations() {
        return h.f64602L.b();
    }

    public f getName() {
        return F0();
    }

    public V l0(c cVar) {
        C6496s.h(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    public i m() {
        return (i) f63356f.getValue();
    }

    public Collection s(c cVar, C6798l lVar) {
        C6496s.h(cVar, "fqName");
        C6496s.h(lVar, "nameFilter");
        return C6565s.n();
    }

    public List z0() {
        return f63354d;
    }

    public C5495m a() {
        return this;
    }
}
