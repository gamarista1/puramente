package f2;

import i2.C2076a;
import i2.L;

/* renamed from: f2.D  reason: case insensitive filesystem */
public final class C1963D {

    /* renamed from: d  reason: collision with root package name */
    public static final C1963D f19706d = new C1963D(1.0f);

    /* renamed from: e  reason: collision with root package name */
    private static final String f19707e = L.y0(0);

    /* renamed from: f  reason: collision with root package name */
    private static final String f19708f = L.y0(1);

    /* renamed from: a  reason: collision with root package name */
    public final float f19709a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19710b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19711c;

    public C1963D(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j10) {
        return j10 * ((long) this.f19711c);
    }

    public C1963D b(float f10) {
        return new C1963D(f10, this.f19710b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1963D.class != obj.getClass()) {
            return false;
        }
        C1963D d10 = (C1963D) obj;
        if (this.f19709a == d10.f19709a && this.f19710b == d10.f19710b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f19709a)) * 31) + Float.floatToRawIntBits(this.f19710b);
    }

    public String toString() {
        return L.F("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f19709a), Float.valueOf(this.f19710b));
    }

    public C1963D(float f10, float f11) {
        boolean z10 = false;
        C2076a.a(f10 > 0.0f);
        C2076a.a(f11 > 0.0f ? true : z10);
        this.f19709a = f10;
        this.f19710b = f11;
        this.f19711c = Math.round(f10 * 1000.0f);
    }
}
