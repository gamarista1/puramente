package m3;

import kotlin.jvm.internal.C6496s;

/* renamed from: m3.l  reason: case insensitive filesystem */
public final class C2213l {

    /* renamed from: a  reason: collision with root package name */
    private final int f24071a;

    /* renamed from: b  reason: collision with root package name */
    private final Z f24072b;

    public C2213l(int i10, Z z10) {
        C6496s.h(z10, "hint");
        this.f24071a = i10;
        this.f24072b = z10;
    }

    public final int a() {
        return this.f24071a;
    }

    public final Z b() {
        return this.f24072b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2213l)) {
            return false;
        }
        C2213l lVar = (C2213l) obj;
        if (this.f24071a == lVar.f24071a && C6496s.c(this.f24072b, lVar.f24072b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f24071a) * 31) + this.f24072b.hashCode();
    }

    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.f24071a + ", hint=" + this.f24072b + ')';
    }
}
