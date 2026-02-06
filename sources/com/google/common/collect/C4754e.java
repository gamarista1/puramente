package com.google.common.collect;

import com.amazon.a.a.o.b.f;
import java.util.Map;
import nb.k;

/* renamed from: com.google.common.collect.e  reason: case insensitive filesystem */
abstract class C4754e implements Map.Entry {
    C4754e() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!k.a(getKey(), entry.getKey()) || !k.a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public int hashCode() {
        int i10;
        Object key = getKey();
        Object value = getValue();
        int i11 = 0;
        if (key == null) {
            i10 = 0;
        } else {
            i10 = key.hashCode();
        }
        if (value != null) {
            i11 = value.hashCode();
        }
        return i10 ^ i11;
    }

    public String toString() {
        return getKey() + f.f37530b + getValue();
    }
}
