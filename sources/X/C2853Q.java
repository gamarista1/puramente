package x;

import C.N;
import androidx.compose.foundation.layout.n;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.C2550z0;

/* renamed from: x.Q  reason: case insensitive filesystem */
public final class C2853Q {

    /* renamed from: a  reason: collision with root package name */
    private final long f27889a;

    /* renamed from: b  reason: collision with root package name */
    private final N f27890b;

    public /* synthetic */ C2853Q(long j10, N n10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, n10);
    }

    public final N a() {
        return this.f27890b;
    }

    public final long b() {
        return this.f27889a;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C6496s.c(C2853Q.class, cls)) {
            return false;
        }
        C6496s.f(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C2853Q q10 = (C2853Q) obj;
        if (C2544x0.q(this.f27889a, q10.f27889a) && C6496s.c(this.f27890b, q10.f27890b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C2544x0.w(this.f27889a) * 31) + this.f27890b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + C2544x0.x(this.f27889a) + ", drawPadding=" + this.f27890b + ')';
    }

    private C2853Q(long j10, N n10) {
        this.f27889a = j10;
        this.f27890b = n10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2853Q(long j10, N n10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C2550z0.d(4284900966L) : j10, (i10 & 2) != 0 ? n.c(0.0f, 0.0f, 3, (Object) null) : n10, (DefaultConstructorMarker) null);
    }
}
