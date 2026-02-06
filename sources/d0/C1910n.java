package d0;

import b0.C1866d;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6556i;

/* renamed from: d0.n  reason: case insensitive filesystem */
public final class C1910n extends C6556i implements C1866d {

    /* renamed from: b  reason: collision with root package name */
    private final C1900d f19422b;

    public C1910n(C1900d dVar) {
        this.f19422b = dVar;
    }

    public int a() {
        return this.f19422b.size();
    }

    public boolean b(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.f19422b.get(entry.getKey());
        if (obj != null) {
            return C6496s.c(obj, entry.getValue());
        }
        if (entry.getValue() != null || !this.f19422b.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return b((Map.Entry) obj);
    }

    public Iterator iterator() {
        return new C1911o(this.f19422b.s());
    }
}
