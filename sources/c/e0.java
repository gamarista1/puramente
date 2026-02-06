package C;

import J0.p0;
import c1.d;
import k0.c;
import k0.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e0 extends i.c implements p0 {

    /* renamed from: n  reason: collision with root package name */
    private c.C0368c f924n;

    public e0(c.C0368c cVar) {
        this.f924n = cVar;
    }

    /* renamed from: l2 */
    public V s(d dVar, Object obj) {
        V v10;
        if (obj instanceof V) {
            v10 = (V) obj;
        } else {
            v10 = null;
        }
        if (v10 == null) {
            v10 = new V(0.0f, false, (C1095m) null, (r) null, 15, (DefaultConstructorMarker) null);
        }
        v10.e(C1095m.f994a.b(this.f924n));
        return v10;
    }

    public final void m2(c.C0368c cVar) {
        this.f924n = cVar;
    }
}
