package Pf;

import Fg.S;
import Of.h0;
import Pf.c;
import java.util.Map;
import ng.c;
import qg.n;

public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final S f64581a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f64582b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f64583c;

    public d(S s10, Map map, h0 h0Var) {
        if (s10 == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (h0Var == null) {
            b(2);
        }
        this.f64581a = s10;
        this.f64582b = map;
        this.f64583c = h0Var;
    }

    private static /* synthetic */ void b(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i10 == 3 || i10 == 4 || i10 == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public Map a() {
        Map map = this.f64582b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    public c f() {
        return c.a.a(this);
    }

    public S getType() {
        S s10 = this.f64581a;
        if (s10 == null) {
            b(3);
        }
        return s10;
    }

    public h0 i() {
        h0 h0Var = this.f64583c;
        if (h0Var == null) {
            b(5);
        }
        return h0Var;
    }

    public String toString() {
        return n.f72699h.P(this, (e) null);
    }
}
