package Sf;

import Of.w0;
import Of.x0;
import kotlin.jvm.internal.C6496s;

public final class b extends x0 {

    /* renamed from: c  reason: collision with root package name */
    public static final b f65026c = new b();

    private b() {
        super("protected_and_package", true);
    }

    public Integer a(x0 x0Var) {
        int i10;
        C6496s.h(x0Var, "visibility");
        if (C6496s.c(this, x0Var)) {
            return 0;
        }
        if (x0Var == w0.b.f64527c) {
            return null;
        }
        if (w0.f64523a.b(x0Var)) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        return Integer.valueOf(i10);
    }

    public String b() {
        return "protected/*protected and package*/";
    }

    public x0 d() {
        return w0.g.f64532c;
    }
}
