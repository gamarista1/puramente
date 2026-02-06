package Lg;

import kotlin.jvm.internal.C6496s;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f64072a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f64073b;

    public a(Object obj, Object obj2) {
        this.f64072a = obj;
        this.f64073b = obj2;
    }

    public final Object a() {
        return this.f64072a;
    }

    public final Object b() {
        return this.f64073b;
    }

    public final Object c() {
        return this.f64072a;
    }

    public final Object d() {
        return this.f64073b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (C6496s.c(this.f64072a, aVar.f64072a) && C6496s.c(this.f64073b, aVar.f64073b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        Object obj = this.f64072a;
        int i11 = 0;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i12 = i10 * 31;
        Object obj2 = this.f64073b;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f64072a + ", upper=" + this.f64073b + ')';
    }
}
