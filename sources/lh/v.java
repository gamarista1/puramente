package lh;

import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import gh.C5978b;
import gh.C5985i;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mh.a0;
import yf.C6798l;
import zf.C6828a;

@C5985i(with = w.class)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\tB\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001d0\u001c8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00168\u0016X\u0005¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010%8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Llh/v;", "Llh/i;", "", "", "content", "<init>", "(Ljava/util/Map;)V", "key", "", "a", "(Ljava/lang/String;)Z", "value", "b", "(Llh/i;)Z", "g", "(Ljava/lang/String;)Llh/i;", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "", "", "k", "()Ljava/util/Set;", "entries", "n", "keys", "r", "size", "", "t", "()Ljava/util/Collection;", "values", "Companion", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class v extends i implements Map<String, i>, C6828a {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map f72012a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return w.f72014a;
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f72013a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(Map.Entry entry) {
            C6496s.h(entry, "<name for destructuring parameter 0>");
            StringBuilder sb2 = new StringBuilder();
            a0.c(sb2, (String) entry.getKey());
            sb2.append(':');
            sb2.append((i) entry.getValue());
            String sb3 = sb2.toString();
            C6496s.g(sb3, "toString(...)");
            return sb3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(Map map) {
        super((DefaultConstructorMarker) null);
        C6496s.h(map, "content");
        this.f72012a = map;
    }

    public boolean a(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.f72012a.containsKey(str);
    }

    public boolean b(i iVar) {
        C6496s.h(iVar, "value");
        return this.f72012a.containsValue(iVar);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return a((String) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return b((i) obj);
    }

    public final /* bridge */ Set entrySet() {
        return k();
    }

    public boolean equals(Object obj) {
        return C6496s.c(this.f72012a, obj);
    }

    public i g(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return (i) this.f72012a.get(str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return g((String) obj);
    }

    public int hashCode() {
        return this.f72012a.hashCode();
    }

    public boolean isEmpty() {
        return this.f72012a.isEmpty();
    }

    public Set k() {
        return this.f72012a.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return n();
    }

    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set n() {
        return this.f72012a.keySet();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int r() {
        return this.f72012a.size();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return r();
    }

    public Collection t() {
        return this.f72012a.values();
    }

    public String toString() {
        return C6565s.x0(this.f72012a.entrySet(), f.f37529a, "{", "}", 0, (CharSequence) null, b.f72013a, 24, (Object) null);
    }

    /* renamed from: v */
    public i remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ Collection values() {
        return t();
    }

    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
