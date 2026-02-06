package I;

import c1.h;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f2668a;

    public /* synthetic */ d(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    public float a(long j10, c1.d dVar) {
        return dVar.t1(this.f2668a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && h.m(this.f2668a, ((d) obj).f2668a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return h.o(this.f2668a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f2668a + ".dp)";
    }

    private d(float f10) {
        this.f2668a = f10;
    }
}
