package Uf;

import eg.C5821B;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import ng.c;
import ng.f;

public final class G extends u implements C5821B {

    /* renamed from: a  reason: collision with root package name */
    private final E f65219a;

    /* renamed from: b  reason: collision with root package name */
    private final Annotation[] f65220b;

    /* renamed from: c  reason: collision with root package name */
    private final String f65221c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f65222d;

    public G(E e10, Annotation[] annotationArr, String str, boolean z10) {
        C6496s.h(e10, "type");
        C6496s.h(annotationArr, "reflectAnnotations");
        this.f65219a = e10;
        this.f65220b = annotationArr;
        this.f65221c = str;
        this.f65222d = z10;
    }

    public boolean E() {
        return false;
    }

    /* renamed from: R */
    public E getType() {
        return this.f65219a;
    }

    public f getName() {
        String str = this.f65221c;
        if (str != null) {
            return f.f(str);
        }
        return null;
    }

    public boolean m() {
        return this.f65222d;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G.class.getName());
        sb2.append(": ");
        if (m()) {
            str = "vararg ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    public List getAnnotations() {
        return k.b(this.f65220b);
    }

    public C5554g i(c cVar) {
        C6496s.h(cVar, "fqName");
        return k.a(this.f65220b, cVar);
    }
}
