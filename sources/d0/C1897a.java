package d0;

import java.util.Map;
import mf.C6555h;

/* renamed from: d0.a  reason: case insensitive filesystem */
public abstract class C1897a extends C6555h {
    public final boolean b(Map.Entry entry) {
        Map.Entry entry2;
        if (entry != null) {
            entry2 = entry;
        } else {
            entry2 = null;
        }
        if (entry2 == null) {
            return false;
        }
        return g(entry);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return b((Map.Entry) obj);
    }

    public abstract boolean g(Map.Entry entry);

    public final boolean k(Map.Entry entry) {
        Map.Entry entry2;
        if (entry != null) {
            entry2 = entry;
        } else {
            entry2 = null;
        }
        if (entry2 == null) {
            return false;
        }
        return n(entry);
    }

    public abstract boolean n(Map.Entry entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return k((Map.Entry) obj);
    }
}
