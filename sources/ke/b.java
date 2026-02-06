package ke;

import ae.C4464a;
import ae.u;
import android.os.Bundle;
import ge.C5008b;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private u f60947a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f60948b = C6531o.b(new a(this));

    /* renamed from: c  reason: collision with root package name */
    public Lazy f60949c;

    private final C5008b d() {
        return (C5008b) this.f60948b.getValue();
    }

    /* access modifiers changed from: private */
    public static final C5008b g(b bVar) {
        return bVar.c().c(bVar);
    }

    public abstract d b();

    public C4464a c() {
        C4464a aVar;
        u uVar = this.f60947a;
        if (uVar != null) {
            aVar = uVar.b();
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("You attempted to access the app context before the module was created. Defer accessing the context until after the module initializes.");
    }

    public final u e() {
        u uVar = this.f60947a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException("The module wasn't created! You can't access the runtime context.");
    }

    public final u f() {
        return this.f60947a;
    }

    public final void h(String str, Bundle bundle) {
        C6496s.h(str, "name");
        C5008b d10 = d();
        if (d10 != null) {
            d10.a(str, bundle);
        }
    }

    public final void i(Lazy lazy) {
        C6496s.h(lazy, "<set-?>");
        this.f60949c = lazy;
    }

    public final void j(u uVar) {
        this.f60947a = uVar;
    }
}
