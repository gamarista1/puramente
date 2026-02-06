package Of;

import kotlin.jvm.internal.C6496s;

public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f64536a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f64537b;

    protected x0(String str, boolean z10) {
        C6496s.h(str, "name");
        this.f64536a = str;
        this.f64537b = z10;
    }

    public Integer a(x0 x0Var) {
        C6496s.h(x0Var, "visibility");
        return w0.f64523a.a(this, x0Var);
    }

    public String b() {
        return this.f64536a;
    }

    public final boolean c() {
        return this.f64537b;
    }

    public final String toString() {
        return b();
    }

    public x0 d() {
        return this;
    }
}
