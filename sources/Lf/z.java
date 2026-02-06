package lf;

import java.io.Serializable;
import kotlin.jvm.internal.C6496s;

public final class z implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f71852a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f71853b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f71854c;

    public z(Object obj, Object obj2, Object obj3) {
        this.f71852a = obj;
        this.f71853b = obj2;
        this.f71854c = obj3;
    }

    public final Object a() {
        return this.f71852a;
    }

    public final Object b() {
        return this.f71853b;
    }

    public final Object c() {
        return this.f71854c;
    }

    public final Object d() {
        return this.f71852a;
    }

    public final Object e() {
        return this.f71853b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (C6496s.c(this.f71852a, zVar.f71852a) && C6496s.c(this.f71853b, zVar.f71853b) && C6496s.c(this.f71854c, zVar.f71854c)) {
            return true;
        }
        return false;
    }

    public final Object f() {
        return this.f71854c;
    }

    public int hashCode() {
        int i10;
        int i11;
        Object obj = this.f71852a;
        int i12 = 0;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i13 = i10 * 31;
        Object obj2 = this.f71853b;
        if (obj2 == null) {
            i11 = 0;
        } else {
            i11 = obj2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Object obj3 = this.f71854c;
        if (obj3 != null) {
            i12 = obj3.hashCode();
        }
        return i14 + i12;
    }

    public String toString() {
        return '(' + this.f71852a + ", " + this.f71853b + ", " + this.f71854c + ')';
    }
}
