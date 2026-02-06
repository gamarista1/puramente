package C;

import c1.h;
import c1.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class P implements N {

    /* renamed from: a  reason: collision with root package name */
    private final float f857a;

    /* renamed from: b  reason: collision with root package name */
    private final float f858b;

    /* renamed from: c  reason: collision with root package name */
    private final float f859c;

    /* renamed from: d  reason: collision with root package name */
    private final float f860d;

    public /* synthetic */ P(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    public float a() {
        return this.f860d;
    }

    public float b(t tVar) {
        if (tVar == t.Ltr) {
            return this.f859c;
        }
        return this.f857a;
    }

    public float c(t tVar) {
        if (tVar == t.Ltr) {
            return this.f857a;
        }
        return this.f859c;
    }

    public float d() {
        return this.f858b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        if (!h.m(this.f857a, p10.f857a) || !h.m(this.f858b, p10.f858b) || !h.m(this.f859c, p10.f859c) || !h.m(this.f860d, p10.f860d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((h.o(this.f857a) * 31) + h.o(this.f858b)) * 31) + h.o(this.f859c)) * 31) + h.o(this.f860d);
    }

    public String toString() {
        return "PaddingValues(start=" + h.p(this.f857a) + ", top=" + h.p(this.f858b) + ", end=" + h.p(this.f859c) + ", bottom=" + h.p(this.f860d) + ')';
    }

    private P(float f10, float f11, float f12, float f13) {
        this.f857a = f10;
        this.f858b = f11;
        this.f859c = f12;
        this.f860d = f13;
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        } else if (f11 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        } else if (f12 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        } else if (f13 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }
}
