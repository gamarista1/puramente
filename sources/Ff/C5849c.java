package ff;

import We.C5618b0;
import We.C5664z;
import We.X0;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p003if.h;

/* renamed from: ff.c  reason: case insensitive filesystem */
public class C5849c {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap f67493a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    protected final p003if.a f67494b = new p003if.a();

    /* renamed from: ff.c$a */
    public static final class a {
    }

    public C5849c() {
    }

    public Set a() {
        return this.f67493a.entrySet();
    }

    public Object b(String str, Object obj) {
        if (str == null) {
            return null;
        }
        if (obj == null) {
            return this.f67493a.remove(str);
        }
        return this.f67493a.put(str, obj);
    }

    public void c(C5847a aVar) {
        b("app", aVar);
    }

    public void d(C5848b bVar) {
        b("browser", bVar);
    }

    public void e(C5852f fVar) {
        b("device", fVar);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5849c)) {
            return false;
        }
        return this.f67493a.equals(((C5849c) obj).f67493a);
    }

    public void f(C5854h hVar) {
        b("gpu", hVar);
    }

    public void g(C5858l lVar) {
        b("os", lVar);
    }

    public void h(C5618b0 b0Var) {
        h.c(b0Var, "profileContext is required");
        b("profile", b0Var);
    }

    public int hashCode() {
        return this.f67493a.hashCode();
    }

    public void i(C5860n nVar) {
        C5664z a10 = this.f67494b.a();
        try {
            b("response", nVar);
            if (a10 != null) {
                a10.close();
                return;
            }
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public void j(C5870x xVar) {
        b("runtime", xVar);
    }

    public void k(C5843D d10) {
        b("spring", d10);
    }

    public void l(X0 x02) {
        h.c(x02, "traceContext is required");
        b("trace", x02);
    }

    public C5849c(C5849c cVar) {
        for (Map.Entry entry : cVar.a()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C5847a)) {
                    c(new C5847a((C5847a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof C5848b)) {
                    d(new C5848b((C5848b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof C5852f)) {
                    e(new C5852f((C5852f) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof C5858l)) {
                    g(new C5858l((C5858l) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof C5870x)) {
                    j(new C5870x((C5870x) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C5854h)) {
                    f(new C5854h((C5854h) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof X0)) {
                    l(new X0((X0) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof C5618b0)) {
                    h(new C5618b0((C5618b0) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof C5860n)) {
                    i(new C5860n((C5860n) value));
                } else if (!"spring".equals(entry.getKey()) || !(value instanceof C5843D)) {
                    b((String) entry.getKey(), value);
                } else {
                    k(new C5843D((C5843D) value));
                }
            }
        }
    }
}
