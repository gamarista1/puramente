package v;

import androidx.compose.ui.graphics.f;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w.C2763G;

/* renamed from: v.s  reason: case insensitive filesystem */
public final class C2736s {

    /* renamed from: a  reason: collision with root package name */
    private final float f26895a;

    /* renamed from: b  reason: collision with root package name */
    private final long f26896b;

    /* renamed from: c  reason: collision with root package name */
    private final C2763G f26897c;

    public /* synthetic */ C2736s(float f10, long j10, C2763G g10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, j10, g10);
    }

    public final C2763G a() {
        return this.f26897c;
    }

    public final float b() {
        return this.f26895a;
    }

    public final long c() {
        return this.f26896b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2736s)) {
            return false;
        }
        C2736s sVar = (C2736s) obj;
        if (Float.compare(this.f26895a, sVar.f26895a) == 0 && f.e(this.f26896b, sVar.f26896b) && C6496s.c(this.f26897c, sVar.f26897c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f26895a) * 31) + f.h(this.f26896b)) * 31) + this.f26897c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.f26895a + ", transformOrigin=" + f.i(this.f26896b) + ", animationSpec=" + this.f26897c + ')';
    }

    private C2736s(float f10, long j10, C2763G g10) {
        this.f26895a = f10;
        this.f26896b = j10;
        this.f26897c = g10;
    }
}
