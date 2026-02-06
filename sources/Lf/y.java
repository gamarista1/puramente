package lf;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

final class y implements Lazy, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private C6787a f71849a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f71850b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f71851c;

    public y(C6787a aVar, Object obj) {
        C6496s.h(aVar, "initializer");
        this.f71849a = aVar;
        this.f71850b = C6510I.f71807a;
        this.f71851c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C6526j(getValue());
    }

    public boolean e() {
        if (this.f71850b != C6510I.f71807a) {
            return true;
        }
        return false;
    }

    public Object getValue() {
        Object obj;
        Object obj2 = this.f71850b;
        C6510I i10 = C6510I.f71807a;
        if (obj2 != i10) {
            return obj2;
        }
        synchronized (this.f71851c) {
            obj = this.f71850b;
            if (obj == i10) {
                C6787a aVar = this.f71849a;
                C6496s.e(aVar);
                obj = aVar.invoke();
                this.f71850b = obj;
                this.f71849a = null;
            }
        }
        return obj;
    }

    public String toString() {
        if (e()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(C6787a aVar, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
