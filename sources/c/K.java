package C;

import J0.p0;
import c1.d;
import k0.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class K extends i.c implements p0 {

    /* renamed from: n  reason: collision with root package name */
    private float f852n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f853o;

    public K(float f10, boolean z10) {
        this.f852n = f10;
        this.f853o = z10;
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
        v10.g(this.f852n);
        v10.f(this.f853o);
        return v10;
    }

    public final void m2(boolean z10) {
        this.f853o = z10;
    }

    public final void n2(float f10) {
        this.f852n = f10;
    }
}
