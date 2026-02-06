package Uf;

import eg.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.c;
import ng.f;

public final class F extends u implements j, y {

    /* renamed from: a  reason: collision with root package name */
    private final TypeVariable f65218a;

    public F(TypeVariable typeVariable) {
        C6496s.h(typeVariable, "typeVariable");
        this.f65218a = typeVariable;
    }

    public boolean E() {
        return false;
    }

    /* renamed from: R */
    public List getUpperBounds() {
        Type type;
        Type[] bounds = this.f65218a.getBounds();
        C6496s.g(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type sVar : bounds) {
            arrayList.add(new s(sVar));
        }
        s sVar2 = (s) C6565s.R0(arrayList);
        if (sVar2 != null) {
            type = sVar2.R();
        } else {
            type = null;
        }
        if (C6496s.c(type, Object.class)) {
            return C6565s.n();
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof F) || !C6496s.c(this.f65218a, ((F) obj).f65218a)) {
            return false;
        }
        return true;
    }

    public f getName() {
        f i10 = f.i(this.f65218a.getName());
        C6496s.g(i10, "identifier(...)");
        return i10;
    }

    public int hashCode() {
        return this.f65218a.hashCode();
    }

    public AnnotatedElement t() {
        TypeVariable typeVariable = this.f65218a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public String toString() {
        return F.class.getName() + ": " + this.f65218a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = Uf.k.b((r0 = r0.getDeclaredAnnotations()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List getAnnotations() {
        /*
            r1 = this;
            java.lang.reflect.AnnotatedElement r0 = r1.t()
            if (r0 == 0) goto L_0x0012
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = Uf.k.b(r0)
            if (r0 != 0) goto L_0x0016
        L_0x0012:
            java.util.List r0 = mf.C6565s.n()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Uf.F.getAnnotations():java.util.List");
    }

    public C5554g i(c cVar) {
        Annotation[] declaredAnnotations;
        C6496s.h(cVar, "fqName");
        AnnotatedElement t10 = t();
        if (t10 == null || (declaredAnnotations = t10.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, cVar);
    }
}
