package f2;

import i2.L;

public final class P {

    /* renamed from: e  reason: collision with root package name */
    public static final P f19906e = new P(0, 0);

    /* renamed from: f  reason: collision with root package name */
    private static final String f19907f = L.y0(0);

    /* renamed from: g  reason: collision with root package name */
    private static final String f19908g = L.y0(1);

    /* renamed from: h  reason: collision with root package name */
    private static final String f19909h = L.y0(2);

    /* renamed from: i  reason: collision with root package name */
    private static final String f19910i = L.y0(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f19911a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19912b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19913c;

    /* renamed from: d  reason: collision with root package name */
    public final float f19914d;

    public P(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        if (this.f19911a == p10.f19911a && this.f19912b == p10.f19912b && this.f19913c == p10.f19913c && this.f19914d == p10.f19914d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f19911a) * 31) + this.f19912b) * 31) + this.f19913c) * 31) + Float.floatToRawIntBits(this.f19914d);
    }

    public P(int i10, int i11, int i12, float f10) {
        this.f19911a = i10;
        this.f19912b = i11;
        this.f19913c = i12;
        this.f19914d = f10;
    }
}
