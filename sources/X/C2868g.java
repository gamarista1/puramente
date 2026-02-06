package x;

import c1.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2514n0;

/* renamed from: x.g  reason: case insensitive filesystem */
public final class C2868g {

    /* renamed from: a  reason: collision with root package name */
    private final float f27963a;

    /* renamed from: b  reason: collision with root package name */
    private final C2514n0 f27964b;

    public /* synthetic */ C2868g(float f10, C2514n0 n0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, n0Var);
    }

    public final C2514n0 a() {
        return this.f27964b;
    }

    public final float b() {
        return this.f27963a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2868g)) {
            return false;
        }
        C2868g gVar = (C2868g) obj;
        if (h.m(this.f27963a, gVar.f27963a) && C6496s.c(this.f27964b, gVar.f27964b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (h.o(this.f27963a) * 31) + this.f27964b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + h.p(this.f27963a) + ", brush=" + this.f27964b + ')';
    }

    private C2868g(float f10, C2514n0 n0Var) {
        this.f27963a = f10;
        this.f27964b = n0Var;
    }
}
