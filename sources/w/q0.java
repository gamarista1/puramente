package w;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class q0 implements C2759C {

    /* renamed from: a  reason: collision with root package name */
    private final int f27570a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27571b;

    /* renamed from: c  reason: collision with root package name */
    private final C2760D f27572c;

    public q0(int i10, int i11, C2760D d10) {
        this.f27570a = i10;
        this.f27571b = i11;
        this.f27572c = d10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (q0Var.f27570a == this.f27570a && q0Var.f27571b == this.f27571b && C6496s.c(q0Var.f27572c, this.f27572c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public F0 a(r0 r0Var) {
        return new F0(this.f27570a, this.f27571b, this.f27572c);
    }

    public int hashCode() {
        return (((this.f27570a * 31) + this.f27572c.hashCode()) * 31) + this.f27571b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i10, int i11, C2760D d10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? C2762F.d() : d10);
    }
}
