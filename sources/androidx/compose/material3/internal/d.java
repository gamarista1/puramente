package androidx.compose.material3.internal;

import W.h;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Map f13248a;

    public d(Map map) {
        this.f13248a = map;
    }

    public Object a(float f10, boolean z10) {
        Object obj;
        float f11;
        float f12;
        Iterator it = this.f13248a.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) obj).getValue()).floatValue();
                if (z10) {
                    f11 = floatValue - f10;
                } else {
                    f11 = f10 - floatValue;
                }
                if (f11 < 0.0f) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    if (z10) {
                        f12 = floatValue2 - f10;
                    } else {
                        f12 = f10 - floatValue2;
                    }
                    if (f12 < 0.0f) {
                        f12 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f11, f12) > 0) {
                        obj = next;
                        f11 = f12;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public Object b(float f10) {
        Object obj;
        Iterator it = this.f13248a.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f10 - ((Number) ((Map.Entry) obj).getValue()).floatValue());
                do {
                    Object next = it.next();
                    float abs2 = Math.abs(f10 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        obj = next;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public boolean c(Object obj) {
        return this.f13248a.containsKey(obj);
    }

    public float d() {
        Float G02 = C6565s.G0(this.f13248a.values());
        if (G02 != null) {
            return G02.floatValue();
        }
        return Float.NaN;
    }

    public float e(Object obj) {
        Float f10 = (Float) this.f13248a.get(obj);
        if (f10 != null) {
            return f10.floatValue();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return C6496s.c(this.f13248a, ((d) obj).f13248a);
    }

    public float f() {
        Float E02 = C6565s.E0(this.f13248a.values());
        if (E02 != null) {
            return E02.floatValue();
        }
        return Float.NaN;
    }

    public int hashCode() {
        return this.f13248a.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.f13248a + ')';
    }
}
