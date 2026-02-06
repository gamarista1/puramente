package v;

import kotlin.jvm.internal.C6496s;
import w.C2763G;

/* renamed from: v.l  reason: case insensitive filesystem */
public final class C2729l {

    /* renamed from: a  reason: collision with root package name */
    private final float f26886a;

    /* renamed from: b  reason: collision with root package name */
    private final C2763G f26887b;

    public C2729l(float f10, C2763G g10) {
        this.f26886a = f10;
        this.f26887b = g10;
    }

    public final float a() {
        return this.f26886a;
    }

    public final C2763G b() {
        return this.f26887b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2729l)) {
            return false;
        }
        C2729l lVar = (C2729l) obj;
        if (Float.compare(this.f26886a, lVar.f26886a) == 0 && C6496s.c(this.f26887b, lVar.f26887b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f26886a) * 31) + this.f26887b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f26886a + ", animationSpec=" + this.f26887b + ')';
    }
}
