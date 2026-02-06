package u3;

import kotlin.jvm.internal.C6496s;
import y3.k;

public abstract class i extends C2706A {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(u uVar) {
        super(uVar);
        C6496s.h(uVar, "database");
    }

    /* access modifiers changed from: protected */
    public abstract void i(k kVar, Object obj);

    public final void j(Object obj) {
        k b10 = b();
        try {
            i(b10, obj);
            b10.w0();
        } finally {
            h(b10);
        }
    }
}
