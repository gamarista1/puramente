package b1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2514n0;
import r0.C2544x0;

/* renamed from: b1.d  reason: case insensitive filesystem */
final class C1872d implements n {

    /* renamed from: b  reason: collision with root package name */
    private final long f19066b;

    public /* synthetic */ C1872d(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public float a() {
        return C2544x0.r(d());
    }

    public long d() {
        return this.f19066b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1872d) && C2544x0.q(this.f19066b, ((C1872d) obj).f19066b)) {
            return true;
        }
        return false;
    }

    public C2514n0 f() {
        return null;
    }

    public int hashCode() {
        return C2544x0.w(this.f19066b);
    }

    public String toString() {
        return "ColorStyle(value=" + C2544x0.x(this.f19066b) + ')';
    }

    private C1872d(long j10) {
        this.f19066b = j10;
        if (j10 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
