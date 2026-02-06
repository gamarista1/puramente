package Uf;

import Uf.C5555h;
import eg.C5824a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import ng.b;
import ng.f;
import xf.C6781a;

/* renamed from: Uf.g  reason: case insensitive filesystem */
public final class C5554g extends u implements C5824a {

    /* renamed from: a  reason: collision with root package name */
    private final Annotation f65246a;

    public C5554g(Annotation annotation) {
        C6496s.h(annotation, "annotation");
        this.f65246a = annotation;
    }

    public boolean H() {
        return false;
    }

    public final Annotation R() {
        return this.f65246a;
    }

    /* renamed from: S */
    public q a() {
        return new q(C6781a.b(C6781a.a(this.f65246a)));
    }

    public Collection c() {
        Method[] declaredMethods = C6781a.b(C6781a.a(this.f65246a)).getDeclaredMethods();
        C6496s.g(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            C5555h.a aVar = C5555h.f65247b;
            Object invoke = method.invoke(this.f65246a, (Object[]) null);
            C6496s.g(invoke, "invoke(...)");
            arrayList.add(aVar.a(invoke, f.i(method.getName())));
        }
        return arrayList;
    }

    public b d() {
        return C5553f.e(C6781a.b(C6781a.a(this.f65246a)));
    }

    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5554g) || this.f65246a != ((C5554g) obj).f65246a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f65246a);
    }

    public String toString() {
        return C5554g.class.getName() + ": " + this.f65246a;
    }
}
