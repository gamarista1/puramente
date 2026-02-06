package Sf;

import Of.w0;
import Of.x0;
import kotlin.jvm.internal.C6496s;

public final class a extends x0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f65025c = new a();

    private a() {
        super("package", false);
    }

    public Integer a(x0 x0Var) {
        C6496s.h(x0Var, "visibility");
        if (this == x0Var) {
            return 0;
        }
        if (w0.f64523a.b(x0Var)) {
            return 1;
        }
        return -1;
    }

    public String b() {
        return "public/*package*/";
    }

    public x0 d() {
        return w0.g.f64532c;
    }
}
