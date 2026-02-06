package r6;

import java.util.Arrays;

/* renamed from: r6.d  reason: case insensitive filesystem */
public class C3979d {

    /* renamed from: a  reason: collision with root package name */
    private a f47971a = a.BITMAP_ONLY;

    /* renamed from: b  reason: collision with root package name */
    private boolean f47972b = false;

    /* renamed from: c  reason: collision with root package name */
    private float[] f47973c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f47974d = 0;

    /* renamed from: e  reason: collision with root package name */
    private float f47975e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    private int f47976f = 0;

    /* renamed from: g  reason: collision with root package name */
    private float f47977g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47978h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f47979i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f47980j = false;

    /* renamed from: r6.d$a */
    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static C3979d a(float f10) {
        return new C3979d().m(f10);
    }

    private float[] e() {
        if (this.f47973c == null) {
            this.f47973c = new float[8];
        }
        return this.f47973c;
    }

    public int b() {
        return this.f47976f;
    }

    public float c() {
        return this.f47975e;
    }

    public float[] d() {
        return this.f47973c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3979d dVar = (C3979d) obj;
        if (this.f47972b == dVar.f47972b && this.f47974d == dVar.f47974d && Float.compare(dVar.f47975e, this.f47975e) == 0 && this.f47976f == dVar.f47976f && Float.compare(dVar.f47977g, this.f47977g) == 0 && this.f47971a == dVar.f47971a && this.f47978h == dVar.f47978h && this.f47979i == dVar.f47979i) {
            return Arrays.equals(this.f47973c, dVar.f47973c);
        }
        return false;
    }

    public int f() {
        return this.f47974d;
    }

    public float g() {
        return this.f47977g;
    }

    public boolean h() {
        return this.f47979i;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        a aVar = this.f47971a;
        int i13 = 0;
        if (aVar != null) {
            i10 = aVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = ((i10 * 31) + (this.f47972b ? 1 : 0)) * 31;
        float[] fArr = this.f47973c;
        if (fArr != null) {
            i11 = Arrays.hashCode(fArr);
        } else {
            i11 = 0;
        }
        int i15 = (((i14 + i11) * 31) + this.f47974d) * 31;
        float f10 = this.f47975e;
        if (f10 != 0.0f) {
            i12 = Float.floatToIntBits(f10);
        } else {
            i12 = 0;
        }
        int i16 = (((i15 + i12) * 31) + this.f47976f) * 31;
        float f11 = this.f47977g;
        if (f11 != 0.0f) {
            i13 = Float.floatToIntBits(f11);
        }
        return ((((i16 + i13) * 31) + (this.f47978h ? 1 : 0)) * 31) + (this.f47979i ? 1 : 0);
    }

    public boolean i() {
        return this.f47980j;
    }

    public boolean j() {
        return this.f47972b;
    }

    public a k() {
        return this.f47971a;
    }

    public boolean l() {
        return this.f47978h;
    }

    public C3979d m(float f10) {
        Arrays.fill(e(), f10);
        return this;
    }

    public C3979d n(int i10) {
        this.f47974d = i10;
        this.f47971a = a.OVERLAY_COLOR;
        return this;
    }

    public C3979d o(boolean z10) {
        this.f47979i = z10;
        return this;
    }

    public C3979d p(a aVar) {
        this.f47971a = aVar;
        return this;
    }
}
