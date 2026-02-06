package x0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import t0.C2605f;
import yf.C6798l;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private C6798l f28155a;

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(C2605f fVar);

    public C6798l b() {
        return this.f28155a;
    }

    public final void c() {
        C6798l b10 = b();
        if (b10 != null) {
            b10.invoke(this);
        }
    }

    public void d(C6798l lVar) {
        this.f28155a = lVar;
    }

    private l() {
    }
}
