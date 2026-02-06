package w;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.g0  reason: case insensitive filesystem */
public final class C2795g0 implements C2763G {

    /* renamed from: a  reason: collision with root package name */
    private final float f27418a;

    /* renamed from: b  reason: collision with root package name */
    private final float f27419b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f27420c;

    public C2795g0(float f10, float f11, Object obj) {
        this.f27418a = f10;
        this.f27419b = f11;
        this.f27420c = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2795g0)) {
            return false;
        }
        C2795g0 g0Var = (C2795g0) obj;
        if (g0Var.f27418a == this.f27418a && g0Var.f27419b == this.f27419b && C6496s.c(g0Var.f27420c, this.f27420c)) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.f27418a;
    }

    public final float g() {
        return this.f27419b;
    }

    public final Object h() {
        return this.f27420c;
    }

    public int hashCode() {
        int i10;
        Object obj = this.f27420c;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return (((i10 * 31) + Float.hashCode(this.f27418a)) * 31) + Float.hashCode(this.f27419b);
    }

    /* renamed from: i */
    public E0 a(r0 r0Var) {
        return new E0(this.f27418a, this.f27419b, C2798j.b(r0Var, this.f27420c));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2795g0(float f10, float f11, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }
}
