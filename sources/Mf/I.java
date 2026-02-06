package mf;

import kotlin.jvm.internal.C6496s;

public final class I {

    /* renamed from: a  reason: collision with root package name */
    private final int f72032a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f72033b;

    public I(int i10, Object obj) {
        this.f72032a = i10;
        this.f72033b = obj;
    }

    public final int a() {
        return this.f72032a;
    }

    public final Object b() {
        return this.f72033b;
    }

    public final int c() {
        return this.f72032a;
    }

    public final Object d() {
        return this.f72033b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        if (this.f72032a == i10.f72032a && C6496s.c(this.f72033b, i10.f72033b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = Integer.hashCode(this.f72032a) * 31;
        Object obj = this.f72033b;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "IndexedValue(index=" + this.f72032a + ", value=" + this.f72033b + ')';
    }
}
