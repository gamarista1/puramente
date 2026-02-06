package d0;

import java.util.Map;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

/* renamed from: d0.b  reason: case insensitive filesystem */
public class C1898b implements Map.Entry, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f19396a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f19397b;

    public C1898b(Object obj, Object obj2) {
        this.f19396a = obj;
        this.f19397b = obj2;
    }

    public boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !C6496s.c(entry.getKey(), getKey()) || !C6496s.c(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    public Object getKey() {
        return this.f19396a;
    }

    public Object getValue() {
        return this.f19397b;
    }

    public int hashCode() {
        int i10;
        Object key = getKey();
        int i11 = 0;
        if (key != null) {
            i10 = key.hashCode();
        } else {
            i10 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i11 = value.hashCode();
        }
        return i10 ^ i11;
    }

    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
