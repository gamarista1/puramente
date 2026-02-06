package d0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

/* renamed from: d0.h  reason: case insensitive filesystem */
public final class C1904h extends C1897a {

    /* renamed from: a  reason: collision with root package name */
    private final C1902f f19418a;

    public C1904h(C1902f fVar) {
        this.f19418a = fVar;
    }

    public int a() {
        return this.f19418a.size();
    }

    public void clear() {
        this.f19418a.clear();
    }

    public boolean g(Map.Entry entry) {
        Object obj = this.f19418a.get(entry.getKey());
        if (obj != null) {
            return C6496s.c(obj, entry.getValue());
        }
        if (entry.getValue() != null || !this.f19418a.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return new C1905i(this.f19418a);
    }

    public boolean n(Map.Entry entry) {
        return this.f19418a.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: r */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }
}
