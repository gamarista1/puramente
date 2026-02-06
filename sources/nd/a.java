package Nd;

import java.util.Collection;
import java.util.Map;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private Map f52098a;

    public a(Map map) {
        this.f52098a = map;
    }

    public boolean a(String str, boolean z10) {
        Object obj = this.f52098a.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z10;
    }

    public Collection b() {
        return this.f52098a.keySet();
    }

    public int c(String str, int i10) {
        Object obj = this.f52098a.get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return i10;
    }

    public Map f(String str, Map map) {
        Object obj = this.f52098a.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return map;
    }

    public String g(String str, String str2) {
        Object obj = this.f52098a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return str2;
    }

    public Object get(String str) {
        return this.f52098a.get(str);
    }

    public boolean h(String str) {
        return this.f52098a.containsKey(str);
    }
}
