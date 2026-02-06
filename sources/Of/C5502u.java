package Of;

import kotlin.jvm.internal.C6496s;
import zg.C6840g;

/* renamed from: Of.u  reason: case insensitive filesystem */
public abstract class C5502u {
    protected C5502u() {
    }

    public final Integer a(C5502u uVar) {
        C6496s.h(uVar, "visibility");
        return b().a(uVar.b());
    }

    public abstract x0 b();

    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(C6840g gVar, C5499q qVar, C5495m mVar, boolean z10);

    public abstract C5502u f();

    public final String toString() {
        return b().toString();
    }
}
