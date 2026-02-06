package lf;

import java.io.Serializable;
import kotlin.Lazy;

/* renamed from: lf.j  reason: case insensitive filesystem */
public final class C6526j implements Lazy, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f71827a;

    public C6526j(Object obj) {
        this.f71827a = obj;
    }

    public boolean e() {
        return true;
    }

    public Object getValue() {
        return this.f71827a;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
