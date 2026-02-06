package androidx.datastore.preferences.protobuf;

import com.amazon.device.simplesignin.a.a.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class a0 {

    /* renamed from: c  reason: collision with root package name */
    private static final a0 f16310c = new a0();

    /* renamed from: a  reason: collision with root package name */
    private final f0 f16311a = new G();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap f16312b = new ConcurrentHashMap();

    private a0() {
    }

    public static a0 a() {
        return f16310c;
    }

    public e0 b(Class cls, e0 e0Var) {
        C1751y.b(cls, "messageType");
        C1751y.b(e0Var, a.f37994E);
        return (e0) this.f16312b.putIfAbsent(cls, e0Var);
    }

    public e0 c(Class cls) {
        C1751y.b(cls, "messageType");
        e0 e0Var = (e0) this.f16312b.get(cls);
        if (e0Var != null) {
            return e0Var;
        }
        e0 a10 = this.f16311a.a(cls);
        e0 b10 = b(cls, a10);
        if (b10 != null) {
            return b10;
        }
        return a10;
    }

    public e0 d(Object obj) {
        return c(obj.getClass());
    }
}
