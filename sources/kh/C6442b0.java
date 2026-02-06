package kh;

import ih.f;
import ih.j;
import ih.k;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6527k;

/* renamed from: kh.b0  reason: case insensitive filesystem */
public final class C6442b0 implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final C6442b0 f71642a = new C6442b0();

    /* renamed from: b  reason: collision with root package name */
    private static final j f71643b = k.d.f68509a;

    /* renamed from: c  reason: collision with root package name */
    private static final String f71644c = "kotlin.Nothing";

    private C6442b0() {
    }

    private final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        return false;
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

    public j h() {
        return f71643b;
    }

    public int hashCode() {
        return i().hashCode() + (h().hashCode() * 31);
    }

    public String i() {
        return f71644c;
    }

    public boolean isInline() {
        return f.a.b(this);
    }

    public boolean j(int i10) {
        a();
        throw new C6527k();
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
