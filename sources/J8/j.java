package j8;

import com.facebook.react.uimanager.G;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final float f44897a;

    /* renamed from: b  reason: collision with root package name */
    private final float f44898b;

    public j(float f10, float f11) {
        this.f44897a = f10;
        this.f44898b = f11;
    }

    public final float a() {
        return this.f44897a;
    }

    public final float b() {
        return this.f44898b;
    }

    public final j c() {
        return new j(G.h(this.f44897a), G.h(this.f44898b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (Float.compare(this.f44897a, jVar.f44897a) == 0 && Float.compare(this.f44898b, jVar.f44898b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f44897a) * 31) + Float.hashCode(this.f44898b);
    }

    public String toString() {
        float f10 = this.f44897a;
        float f11 = this.f44898b;
        return "CornerRadii(horizontal=" + f10 + ", vertical=" + f11 + ")";
    }
}
