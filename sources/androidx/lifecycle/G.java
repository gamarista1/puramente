package androidx.lifecycle;

import Ug.Z;
import kotlin.jvm.internal.C6496s;
import qf.g;

public final class G extends Ug.G {

    /* renamed from: c  reason: collision with root package name */
    public final C1784g f17100c = new C1784g();

    public boolean B1(g gVar) {
        C6496s.h(gVar, "context");
        if (Z.c().D1().B1(gVar)) {
            return true;
        }
        return !this.f17100c.b();
    }

    public void z1(g gVar, Runnable runnable) {
        C6496s.h(gVar, "context");
        C6496s.h(runnable, "block");
        this.f17100c.c(gVar, runnable);
    }
}
