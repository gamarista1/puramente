package w;

import Y.C1510r0;
import Y.o1;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final C1510r0 f27569a;

    public /* synthetic */ p0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object a();

    public abstract Object b();

    public final boolean c() {
        return ((Boolean) this.f27569a.getValue()).booleanValue();
    }

    public abstract void d(Object obj);

    public final void e(boolean z10) {
        this.f27569a.setValue(Boolean.valueOf(z10));
    }

    public abstract void f(n0 n0Var);

    public abstract void g();

    private p0() {
        this.f27569a = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
    }
}
