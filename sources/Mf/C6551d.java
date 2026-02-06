package mf;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;
import zf.C6828a;

/* renamed from: mf.d  reason: case insensitive filesystem */
public abstract class C6551d implements Map, C6828a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72070a = new a((DefaultConstructorMarker) null);

    /* renamed from: mf.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: mf.d$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6551d f72071a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6551d dVar) {
            super(1);
            this.f72071a = dVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(Map.Entry entry) {
            C6496s.h(entry, "it");
            return this.f72071a.n(entry);
        }
    }

    protected C6551d() {
    }

    private final String l(Object obj) {
        if (obj == this) {
            return "(this Map)";
        }
        return String.valueOf(obj);
    }

    /* access modifiers changed from: private */
    public final String n(Map.Entry entry) {
        return l(entry.getKey()) + '=' + l(entry.getValue());
    }

    public final boolean c(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        C6496s.f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!C6496s.c(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        C6496s.f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        if (!containsKey(key)) {
            return false;
        }
        return true;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsValue(Object obj) {
        Iterable<Map.Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && ((Collection) entrySet).isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (C6496s.c(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set e();

    public final /* bridge */ Set entrySet() {
        return e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Iterable<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && ((Collection) entrySet).isEmpty()) {
            return true;
        }
        for (Map.Entry c10 : entrySet) {
            if (!c(c10)) {
                return false;
            }
        }
        return true;
    }

    public abstract Set g();

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract int j();

    public abstract Collection k();

    public final /* bridge */ Set keySet() {
        return g();
    }

    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return j();
    }

    public String toString() {
        return C6565s.x0(entrySet(), ", ", "{", "}", 0, (CharSequence) null, new b(this), 24, (Object) null);
    }

    public final /* bridge */ Collection values() {
        return k();
    }
}
