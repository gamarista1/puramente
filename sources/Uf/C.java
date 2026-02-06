package Uf;

import Lf.l;
import eg.v;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import wg.C6769e;

public final class C extends E implements v {

    /* renamed from: b  reason: collision with root package name */
    private final Class f65213b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection f65214c = C6565s.n();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f65215d;

    public C(Class cls) {
        C6496s.h(cls, "reflectType");
        this.f65213b = cls;
    }

    public boolean E() {
        return this.f65215d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public Class R() {
        return this.f65213b;
    }

    public Collection getAnnotations() {
        return this.f65214c;
    }

    public l getType() {
        if (C6496s.c(R(), Void.TYPE)) {
            return null;
        }
        return C6769e.c(R().getName()).i();
    }
}
