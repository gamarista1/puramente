package p;

import java.util.HashMap;
import java.util.Map;
import p.C2383b;

/* renamed from: p.a  reason: case insensitive filesystem */
public class C2382a extends C2383b {

    /* renamed from: e  reason: collision with root package name */
    private final HashMap f25080e = new HashMap();

    /* access modifiers changed from: protected */
    public C2383b.c b(Object obj) {
        return (C2383b.c) this.f25080e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f25080e.containsKey(obj);
    }

    public Object k(Object obj, Object obj2) {
        C2383b.c b10 = b(obj);
        if (b10 != null) {
            return b10.f25086b;
        }
        this.f25080e.put(obj, h(obj, obj2));
        return null;
    }

    public Object m(Object obj) {
        Object m10 = super.m(obj);
        this.f25080e.remove(obj);
        return m10;
    }

    public Map.Entry n(Object obj) {
        if (contains(obj)) {
            return ((C2383b.c) this.f25080e.get(obj)).f25088d;
        }
        return null;
    }
}
