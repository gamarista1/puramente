package Uf;

import eg.w;
import eg.x;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;

public final class D extends y implements w {

    /* renamed from: a  reason: collision with root package name */
    private final Object f65216a;

    public D(Object obj) {
        C6496s.h(obj, "recordComponent");
        this.f65216a = obj;
    }

    public Member S() {
        Method c10 = C5548a.f65226a.c(this.f65216a);
        if (c10 != null) {
            return c10;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public x getType() {
        Class d10 = C5548a.f65226a.d(this.f65216a);
        if (d10 != null) {
            return new s(d10);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    public boolean m() {
        return false;
    }
}
