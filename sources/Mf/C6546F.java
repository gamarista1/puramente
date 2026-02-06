package mf;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

/* renamed from: mf.F  reason: case insensitive filesystem */
final class C6546F implements Map, Serializable, C6828a {

    /* renamed from: a  reason: collision with root package name */
    public static final C6546F f72030a = new C6546F();
    private static final long serialVersionUID = 8246714829545688274L;

    private C6546F() {
    }

    private final Object readResolve() {
        return f72030a;
    }

    public boolean a(Void voidR) {
        C6496s.h(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    public Set c() {
        return C6547G.f72031a;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return a((Void) obj);
    }

    public Set e() {
        return C6547G.f72031a;
    }

    public final /* bridge */ Set entrySet() {
        return c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public int g() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Collection j() {
        return C6545E.f72029a;
    }

    /* renamed from: k */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ Set keySet() {
        return e();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return g();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return j();
    }
}
