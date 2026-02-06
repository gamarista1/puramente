package dc;

import Eb.D;

/* renamed from: dc.a  reason: case insensitive filesystem */
public class C4942a {

    /* renamed from: a  reason: collision with root package name */
    private final Class f60051a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f60052b;

    public C4942a(Class cls, Object obj) {
        this.f60051a = (Class) D.b(cls);
        this.f60052b = D.b(obj);
    }

    public Object a() {
        return this.f60052b;
    }

    public Class b() {
        return this.f60051a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f60051a, this.f60052b});
    }
}
