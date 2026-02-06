package C;

import I0.d;
import I0.j;
import I0.k;
import I0.l;
import Y.C1510r0;
import Y.o1;
import kotlin.jvm.internal.DefaultConstructorMarker;

abstract class C implements d, j {

    /* renamed from: b  reason: collision with root package name */
    private final C1510r0 f828b;

    public /* synthetic */ C(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final f0 b() {
        return (f0) this.f828b.getValue();
    }

    private final void e(f0 f0Var) {
        this.f828b.setValue(f0Var);
    }

    public abstract f0 a(f0 f0Var);

    /* renamed from: d */
    public f0 getValue() {
        return b();
    }

    public void g(k kVar) {
        e(a((f0) kVar.a(i0.b())));
    }

    public l getKey() {
        return i0.b();
    }

    private C() {
        this.f828b = u1.d(h0.a(0, 0, 0, 0), (o1) null, 2, (Object) null);
    }
}
