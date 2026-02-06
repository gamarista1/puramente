package T8;

import Ef.m;
import e1.C1943b;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import q0.C2422h;
import q0.C2427m;
import r0.C2514n0;
import r0.C2544x0;
import w.C2769M;

final class e implements b {

    /* renamed from: b  reason: collision with root package name */
    private final long f34233b;

    /* renamed from: c  reason: collision with root package name */
    private final C2769M f34234c;

    /* renamed from: d  reason: collision with root package name */
    private final float f34235d;

    public /* synthetic */ e(long j10, C2769M m10, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, m10, f10);
    }

    public C2514n0 a(float f10, long j10) {
        return C2514n0.a.g(C2514n0.f25547b, C6565s.q(C2544x0.k(C2544x0.o(this.f34233b, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C2544x0.k(this.f34233b), C2544x0.k(C2544x0.o(this.f34233b, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), C2422h.a(0.0f, 0.0f), m.c(Math.max(C2427m.k(j10), C2427m.i(j10)) * f10 * ((float) 2), 0.01f), 0, 8, (Object) null);
    }

    public C2769M b() {
        return this.f34234c;
    }

    public float c(float f10) {
        float f11 = this.f34235d;
        if (f10 <= f11) {
            return C1943b.b(0.0f, 1.0f, f10 / f11);
        }
        return C1943b.b(1.0f, 0.0f, (f10 - f11) / (1.0f - f11));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (C2544x0.q(this.f34233b, eVar.f34233b) && C6496s.c(this.f34234c, eVar.f34234c) && Float.compare(this.f34235d, eVar.f34235d) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((C2544x0.w(this.f34233b) * 31) + this.f34234c.hashCode()) * 31) + Float.hashCode(this.f34235d);
    }

    public String toString() {
        return "Shimmer(highlightColor=" + C2544x0.x(this.f34233b) + ", animationSpec=" + this.f34234c + ", progressForMaxAlpha=" + this.f34235d + ')';
    }

    private e(long j10, C2769M m10, float f10) {
        C6496s.h(m10, "animationSpec");
        this.f34233b = j10;
        this.f34234c = m10;
        this.f34235d = f10;
    }
}
