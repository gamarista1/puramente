package b1;

import kotlin.jvm.internal.C6496s;
import r0.C2514n0;
import r0.C2544x0;
import r0.c2;

/* renamed from: b1.c  reason: case insensitive filesystem */
final class C1871c implements n {

    /* renamed from: b  reason: collision with root package name */
    private final c2 f19064b;

    /* renamed from: c  reason: collision with root package name */
    private final float f19065c;

    public C1871c(c2 c2Var, float f10) {
        this.f19064b = c2Var;
        this.f19065c = f10;
    }

    public float a() {
        return this.f19065c;
    }

    public final c2 b() {
        return this.f19064b;
    }

    public long d() {
        return C2544x0.f25560b.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1871c)) {
            return false;
        }
        C1871c cVar = (C1871c) obj;
        if (C6496s.c(this.f19064b, cVar.f19064b) && Float.compare(this.f19065c, cVar.f19065c) == 0) {
            return true;
        }
        return false;
    }

    public C2514n0 f() {
        return this.f19064b;
    }

    public int hashCode() {
        return (this.f19064b.hashCode() * 31) + Float.hashCode(this.f19065c);
    }

    public String toString() {
        return "BrushStyle(value=" + this.f19064b + ", alpha=" + this.f19065c + ')';
    }
}
