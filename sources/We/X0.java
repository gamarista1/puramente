package We;

import ff.C5868v;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p003if.b;
import p003if.h;

public class X0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5868v f65766a;

    /* renamed from: b  reason: collision with root package name */
    private final b1 f65767b;

    /* renamed from: c  reason: collision with root package name */
    private b1 f65768c;

    /* renamed from: d  reason: collision with root package name */
    protected String f65769d;

    /* renamed from: e  reason: collision with root package name */
    protected String f65770e;

    /* renamed from: f  reason: collision with root package name */
    protected c1 f65771f;

    /* renamed from: g  reason: collision with root package name */
    protected Map f65772g = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    protected String f65773h = "manual";

    /* renamed from: i  reason: collision with root package name */
    protected Map f65774i = new ConcurrentHashMap();

    /* renamed from: j  reason: collision with root package name */
    private Map f65775j;

    /* renamed from: k  reason: collision with root package name */
    private I f65776k = I.SENTRY;

    /* renamed from: l  reason: collision with root package name */
    protected C5615a f65777l;

    public static final class a {
    }

    public X0(X0 x02) {
        this.f65766a = x02.f65766a;
        this.f65767b = x02.f65767b;
        this.f65768c = x02.f65768c;
        b((g1) null);
        this.f65769d = x02.f65769d;
        this.f65770e = x02.f65770e;
        this.f65771f = x02.f65771f;
        Map b10 = b.b(x02.f65772g);
        if (b10 != null) {
            this.f65772g = b10;
        }
        Map b11 = b.b(x02.f65775j);
        if (b11 != null) {
            this.f65775j = b11;
        }
        this.f65777l = x02.f65777l;
        Map b12 = b.b(x02.f65774i);
        if (b12 != null) {
            this.f65774i = b12;
        }
    }

    public c1 a() {
        return this.f65771f;
    }

    public void b(g1 g1Var) {
        C5615a aVar = this.f65777l;
        if (aVar != null) {
            aVar.g((g1) null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return false;
        }
        X0 x02 = (X0) obj;
        if (!this.f65766a.equals(x02.f65766a) || !this.f65767b.equals(x02.f65767b) || !h.a(this.f65768c, x02.f65768c) || !this.f65769d.equals(x02.f65769d) || !h.a(this.f65770e, x02.f65770e) || a() != x02.a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return h.b(this.f65766a, this.f65767b, this.f65768c, this.f65769d, this.f65770e, a());
    }
}
