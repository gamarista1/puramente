package v;

import kotlin.jvm.internal.C6496s;
import w.C2763G;
import yf.C6798l;

/* renamed from: v.v  reason: case insensitive filesystem */
public final class C2739v {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f26899a;

    /* renamed from: b  reason: collision with root package name */
    private final C2763G f26900b;

    public C2739v(C6798l lVar, C2763G g10) {
        this.f26899a = lVar;
        this.f26900b = g10;
    }

    public final C2763G a() {
        return this.f26900b;
    }

    public final C6798l b() {
        return this.f26899a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2739v)) {
            return false;
        }
        C2739v vVar = (C2739v) obj;
        if (C6496s.c(this.f26899a, vVar.f26899a) && C6496s.c(this.f26900b, vVar.f26900b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f26899a.hashCode() * 31) + this.f26900b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f26899a + ", animationSpec=" + this.f26900b + ')';
    }
}
