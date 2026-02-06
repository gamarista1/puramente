package d0;

import java.util.Map;
import zf.C6828a;

/* renamed from: d0.c  reason: case insensitive filesystem */
final class C1899c extends C1898b implements Map.Entry, C6828a {

    /* renamed from: c  reason: collision with root package name */
    private final C1905i f19398c;

    /* renamed from: d  reason: collision with root package name */
    private Object f19399d;

    public C1899c(C1905i iVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f19398c = iVar;
        this.f19399d = obj2;
    }

    public void a(Object obj) {
        this.f19399d = obj;
    }

    public Object getValue() {
        return this.f19399d;
    }

    public Object setValue(Object obj) {
        Object value = getValue();
        a(obj);
        this.f19398c.b(getKey(), obj);
        return value;
    }
}
