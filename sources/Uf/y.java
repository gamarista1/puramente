package Uf;

import Of.w0;
import Of.x0;
import Sf.a;
import Sf.b;
import Sf.c;
import eg.q;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import mf.C6565s;
import ng.f;
import ng.h;

public abstract class y extends u implements j, A, q {
    public boolean E() {
        return false;
    }

    public int J() {
        return S().getModifiers();
    }

    /* renamed from: R */
    public q Q() {
        Class<?> declaringClass = S().getDeclaringClass();
        C6496s.g(declaringClass, "getDeclaringClass(...)");
        return new q(declaringClass);
    }

    public abstract Member S();

    /* access modifiers changed from: protected */
    public final List T(Type[] typeArr, Annotation[][] annotationArr, boolean z10) {
        int i10;
        String str;
        boolean z11;
        C6496s.h(typeArr, "parameterTypes");
        C6496s.h(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List b10 = C5550c.f65236a.b(S());
        if (b10 != null) {
            i10 = b10.size() - typeArr.length;
        } else {
            i10 = 0;
        }
        int length = typeArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            E a10 = E.f65217a.a(typeArr[i11]);
            if (b10 != null) {
                str = (String) C6565s.r0(b10, i11 + i10);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i11 + '+' + i10 + " (name=" + getName() + " type=" + a10 + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (!z10 || i11 != C6559l.j0(typeArr)) {
                z11 = false;
            } else {
                z11 = true;
            }
            arrayList.add(new G(a10, annotationArr[i11], str, z11));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y) || !C6496s.c(S(), ((y) obj).S())) {
            return false;
        }
        return true;
    }

    public boolean g() {
        return Modifier.isStatic(J());
    }

    public f getName() {
        f i10;
        String name = S().getName();
        if (name == null || (i10 = f.i(name)) == null) {
            return h.f72304b;
        }
        return i10;
    }

    public x0 getVisibility() {
        int J10 = J();
        if (Modifier.isPublic(J10)) {
            return w0.h.f64533c;
        }
        if (Modifier.isPrivate(J10)) {
            return w0.e.f64530c;
        }
        if (!Modifier.isProtected(J10)) {
            return a.f65025c;
        }
        if (Modifier.isStatic(J10)) {
            return c.f65027c;
        }
        return b.f65026c;
    }

    public int hashCode() {
        return S().hashCode();
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(J());
    }

    public boolean isFinal() {
        return Modifier.isFinal(J());
    }

    public AnnotatedElement t() {
        Member S10 = S();
        C6496s.f(S10, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) S10;
    }

    public String toString() {
        return getClass().getName() + ": " + S();
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
        throw new UnsupportedOperationException("Method not decompiled: Uf.y.getAnnotations():java.util.List");
    }

    public C5554g i(ng.c cVar) {
        Annotation[] declaredAnnotations;
        C6496s.h(cVar, "fqName");
        AnnotatedElement t10 = t();
        if (t10 == null || (declaredAnnotations = t10.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, cVar);
    }
}
