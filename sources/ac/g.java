package Ac;

import java.util.NoSuchElementException;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Object f50240a;

    private g() {
        this.f50240a = null;
    }

    public static g a() {
        return new g();
    }

    public static g b(Object obj) {
        if (obj == null) {
            return a();
        }
        return e(obj);
    }

    public static g e(Object obj) {
        return new g(obj);
    }

    public Object c() {
        Object obj = this.f50240a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        if (this.f50240a != null) {
            return true;
        }
        return false;
    }

    private g(Object obj) {
        if (obj != null) {
            this.f50240a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
