package nf;

import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6555h;

/* renamed from: nf.a  reason: case insensitive filesystem */
public abstract class C6609a extends C6555h {
    public final boolean b(Map.Entry entry) {
        C6496s.h(entry, "element");
        return g(entry);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return b((Map.Entry) obj);
    }

    public abstract boolean g(Map.Entry entry);

    public abstract /* bridge */ boolean k(Map.Entry entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return k((Map.Entry) obj);
    }
}
