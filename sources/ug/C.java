package Ug;

import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final Object f65279a;

    /* renamed from: b  reason: collision with root package name */
    public final C6798l f65280b;

    public C(Object obj, C6798l lVar) {
        this.f65279a = obj;
        this.f65280b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (C6496s.c(this.f65279a, c10.f65279a) && C6496s.c(this.f65280b, c10.f65280b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        Object obj = this.f65279a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return (i10 * 31) + this.f65280b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f65279a + ", onCancellation=" + this.f65280b + ')';
    }
}
