package J0;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import lf.C6534r;
import yf.C6787a;

/* renamed from: J0.n  reason: case insensitive filesystem */
public final class C1248n {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3897a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f3898b = C6531o.a(C6534r.NONE, b.f3901a);

    /* renamed from: c  reason: collision with root package name */
    private final Comparator f3899c;

    /* renamed from: d  reason: collision with root package name */
    private final D0 f3900d;

    /* renamed from: J0.n$a */
    public static final class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(G g10, G g11) {
            int i10 = C6496s.i(g10.L(), g11.L());
            if (i10 != 0) {
                return i10;
            }
            return C6496s.i(g10.hashCode(), g11.hashCode());
        }
    }

    /* renamed from: J0.n$b */
    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f3901a = new b();

        b() {
            super(0);
        }

        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    public C1248n(boolean z10) {
        this.f3897a = z10;
        a aVar = new a();
        this.f3899c = aVar;
        this.f3900d = new D0(aVar);
    }

    private final Map c() {
        return (Map) this.f3898b.getValue();
    }

    public final void a(G g10) {
        boolean z10;
        if (!g10.J0()) {
            G0.a.b("DepthSortedSet.add called on an unattached node");
        }
        if (this.f3897a) {
            Integer num = (Integer) c().get(g10);
            if (num == null) {
                c().put(g10, Integer.valueOf(g10.L()));
            } else {
                if (num.intValue() == g10.L()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    G0.a.b("invalid node depth");
                }
            }
        }
        this.f3900d.add(g10);
    }

    public final boolean b(G g10) {
        boolean z10;
        boolean contains = this.f3900d.contains(g10);
        if (this.f3897a) {
            if (contains == c().containsKey(g10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                G0.a.b("inconsistency in TreeSet");
            }
        }
        return contains;
    }

    public final boolean d() {
        return this.f3900d.isEmpty();
    }

    public final G e() {
        G g10 = (G) this.f3900d.first();
        f(g10);
        return g10;
    }

    public final boolean f(G g10) {
        Integer num;
        if (!g10.J0()) {
            G0.a.b("DepthSortedSet.remove called on an unattached node");
        }
        boolean remove = this.f3900d.remove(g10);
        if (this.f3897a) {
            Integer num2 = (Integer) c().remove(g10);
            if (remove) {
                num = Integer.valueOf(g10.L());
            } else {
                num = null;
            }
            if (!C6496s.c(num2, num)) {
                G0.a.b("invalid node depth");
            }
        }
        return remove;
    }

    public String toString() {
        return this.f3900d.toString();
    }
}
