package lf;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;

/* renamed from: lf.N  reason: case insensitive filesystem */
public final class C6515N implements Lazy, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private C6787a f71814a;

    /* renamed from: b  reason: collision with root package name */
    private Object f71815b = C6510I.f71807a;

    public C6515N(C6787a aVar) {
        C6496s.h(aVar, "initializer");
        this.f71814a = aVar;
    }

    private final Object writeReplace() {
        return new C6526j(getValue());
    }

    public boolean e() {
        if (this.f71815b != C6510I.f71807a) {
            return true;
        }
        return false;
    }

    public Object getValue() {
        if (this.f71815b == C6510I.f71807a) {
            C6787a aVar = this.f71814a;
            C6496s.e(aVar);
            this.f71815b = aVar.invoke();
            this.f71814a = null;
        }
        return this.f71815b;
    }

    public String toString() {
        if (e()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
