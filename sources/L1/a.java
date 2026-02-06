package L1;

import L1.d;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final Map f4125a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f4126b;

    /* renamed from: L1.a$a  reason: collision with other inner class name */
    static final class C0095a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C0095a f4127a = new C0095a();

        C0095a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(Map.Entry entry) {
            C6496s.h(entry, "entry");
            return "  " + ((d.a) entry.getKey()).a() + " = " + entry.getValue();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    public Map a() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.f4125a);
        C6496s.g(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    public Object b(d.a aVar) {
        C6496s.h(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.f4125a.get(aVar);
    }

    public final void e() {
        if (this.f4126b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return C6496s.c(this.f4125a, ((a) obj).f4125a);
        }
        return false;
    }

    public final void f() {
        this.f4126b.set(true);
    }

    public final void g(d.b... bVarArr) {
        C6496s.h(bVarArr, "pairs");
        e();
        if (bVarArr.length > 0) {
            d.b bVar = bVarArr[0];
            throw null;
        }
    }

    public final Object h(d.a aVar) {
        C6496s.h(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        e();
        return this.f4125a.remove(aVar);
    }

    public int hashCode() {
        return this.f4125a.hashCode();
    }

    public final void i(d.a aVar, Object obj) {
        C6496s.h(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        j(aVar, obj);
    }

    public final void j(d.a aVar, Object obj) {
        C6496s.h(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        e();
        if (obj == null) {
            h(aVar);
        } else if (obj instanceof Set) {
            Map map = this.f4125a;
            Set unmodifiableSet = Collections.unmodifiableSet(C6565s.j1((Iterable) obj));
            C6496s.g(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(aVar, unmodifiableSet);
        } else {
            this.f4125a.put(aVar, obj);
        }
    }

    public String toString() {
        return C6565s.x0(this.f4125a.entrySet(), ",\n", "{\n", "\n}", 0, (CharSequence) null, C0095a.f4127a, 24, (Object) null);
    }

    public a(Map map, boolean z10) {
        C6496s.h(map, "preferencesMap");
        this.f4125a = map;
        this.f4126b = new AtomicBoolean(z10);
    }
}
