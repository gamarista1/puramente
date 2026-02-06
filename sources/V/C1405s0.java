package V;

import U.g;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

/* renamed from: V.s0  reason: case insensitive filesystem */
public final class C1405s0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f8014a;

    /* renamed from: b  reason: collision with root package name */
    private final g f8015b;

    public /* synthetic */ C1405s0(long j10, g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, gVar);
    }

    public final long a() {
        return this.f8014a;
    }

    public final g b() {
        return this.f8015b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1405s0)) {
            return false;
        }
        C1405s0 s0Var = (C1405s0) obj;
        if (C2544x0.q(this.f8014a, s0Var.f8014a) && C6496s.c(this.f8015b, s0Var.f8015b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int w10 = C2544x0.w(this.f8014a) * 31;
        g gVar = this.f8015b;
        if (gVar != null) {
            i10 = gVar.hashCode();
        } else {
            i10 = 0;
        }
        return w10 + i10;
    }

    public String toString() {
        return "RippleConfiguration(color=" + C2544x0.x(this.f8014a) + ", rippleAlpha=" + this.f8015b + ')';
    }

    private C1405s0(long j10, g gVar) {
        this.f8014a = j10;
        this.f8015b = gVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1405s0(long j10, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C2544x0.f25560b.h() : j10, (i10 & 2) != 0 ? null : gVar, (DefaultConstructorMarker) null);
    }
}
