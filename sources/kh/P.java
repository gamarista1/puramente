package kh;

import Sg.p;
import ih.f;
import ih.j;
import ih.k;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public abstract class P implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f71622a;

    /* renamed from: b  reason: collision with root package name */
    private final int f71623b;

    public /* synthetic */ P(f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public boolean b() {
        return f.a.c(this);
    }

    public int c(String str) {
        C6496s.h(str, "name");
        Integer m10 = p.m(str);
        if (m10 != null) {
            return m10.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    public int d() {
        return this.f71623b;
    }

    public String e(int i10) {
        return String.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        if (!C6496s.c(this.f71622a, p10.f71622a) || !C6496s.c(i(), p10.i())) {
            return false;
        }
        return true;
    }

    public List f(int i10) {
        if (i10 >= 0) {
            return C6565s.n();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public f g(int i10) {
        if (i10 >= 0) {
            return this.f71622a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public List getAnnotations() {
        return f.a.a(this);
    }

    public j h() {
        return k.b.f68507a;
    }

    public int hashCode() {
        return (this.f71622a.hashCode() * 31) + i().hashCode();
    }

    public boolean isInline() {
        return f.a.b(this);
    }

    public boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return i() + '(' + this.f71622a + ')';
    }

    private P(f fVar) {
        this.f71622a = fVar;
        this.f71623b = 1;
    }
}
