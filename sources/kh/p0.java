package kh;

import ih.e;
import ih.f;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6527k;

public final class p0 implements f {

    /* renamed from: a  reason: collision with root package name */
    private final String f71694a;

    /* renamed from: b  reason: collision with root package name */
    private final e f71695b;

    public p0(String str, e eVar) {
        C6496s.h(str, "serialName");
        C6496s.h(eVar, "kind");
        this.f71694a = str;
        this.f71695b = eVar;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public boolean b() {
        return f.a.c(this);
    }

    public int c(String str) {
        C6496s.h(str, "name");
        a();
        throw new C6527k();
    }

    public int d() {
        return 0;
    }

    public String e(int i10) {
        a();
        throw new C6527k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!C6496s.c(i(), p0Var.i()) || !C6496s.c(h(), p0Var.h())) {
            return false;
        }
        return true;
    }

    public List f(int i10) {
        a();
        throw new C6527k();
    }

    public f g(int i10) {
        a();
        throw new C6527k();
    }

    public List getAnnotations() {
        return f.a.a(this);
    }

    public int hashCode() {
        return i().hashCode() + (h().hashCode() * 31);
    }

    public String i() {
        return this.f71694a;
    }

    public boolean isInline() {
        return f.a.b(this);
    }

    public boolean j(int i10) {
        a();
        throw new C6527k();
    }

    /* renamed from: k */
    public e h() {
        return this.f71695b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + i() + ')';
    }
}
