package J0;

import G0.a;
import c1.d;
import c1.f;
import lf.C6527k;

public abstract class K {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final d f3605a = f.b(1.0f, 0.0f, 2, (Object) null);

    public static final m0 b(G g10) {
        m0 m02 = g10.m0();
        if (m02 != null) {
            return m02;
        }
        a.c("LayoutNode should be attached to an owner");
        throw new C6527k();
    }
}
