package tg;

import Fg.S;
import Of.H;
import kotlin.jvm.internal.C6496s;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private final Object f73556a;

    public g(Object obj) {
        this.f73556a = obj;
    }

    public abstract S a(H h10);

    public Object b() {
        return this.f73556a;
    }

    public boolean equals(Object obj) {
        g gVar;
        if (this != obj) {
            Object b10 = b();
            Object obj2 = null;
            if (obj instanceof g) {
                gVar = (g) obj;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                obj2 = gVar.b();
            }
            if (C6496s.c(b10, obj2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object b10 = b();
        if (b10 != null) {
            return b10.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
