package kh;

import ih.f;
import ih.j;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

public final class s0 implements f, C6463m {

    /* renamed from: a  reason: collision with root package name */
    private final f f71702a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71703b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f71704c;

    public s0(f fVar) {
        C6496s.h(fVar, "original");
        this.f71702a = fVar;
        this.f71703b = fVar.i() + '?';
        this.f71704c = C6454h0.a(fVar);
    }

    public Set a() {
        return this.f71704c;
    }

    public boolean b() {
        return true;
    }

    public int c(String str) {
        C6496s.h(str, "name");
        return this.f71702a.c(str);
    }

    public int d() {
        return this.f71702a.d();
    }

    public String e(int i10) {
        return this.f71702a.e(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s0) && C6496s.c(this.f71702a, ((s0) obj).f71702a)) {
            return true;
        }
        return false;
    }

    public List f(int i10) {
        return this.f71702a.f(i10);
    }

    public f g(int i10) {
        return this.f71702a.g(i10);
    }

    public List getAnnotations() {
        return this.f71702a.getAnnotations();
    }

    public j h() {
        return this.f71702a.h();
    }

    public int hashCode() {
        return this.f71702a.hashCode() * 31;
    }

    public String i() {
        return this.f71703b;
    }

    public boolean isInline() {
        return this.f71702a.isInline();
    }

    public boolean j(int i10) {
        return this.f71702a.j(i10);
    }

    public final f k() {
        return this.f71702a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f71702a);
        sb2.append('?');
        return sb2.toString();
    }
}
