package A4;

import android.graphics.PointF;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f29338a;

    /* renamed from: b  reason: collision with root package name */
    public String f29339b;

    /* renamed from: c  reason: collision with root package name */
    public float f29340c;

    /* renamed from: d  reason: collision with root package name */
    public a f29341d;

    /* renamed from: e  reason: collision with root package name */
    public int f29342e;

    /* renamed from: f  reason: collision with root package name */
    public float f29343f;

    /* renamed from: g  reason: collision with root package name */
    public float f29344g;

    /* renamed from: h  reason: collision with root package name */
    public int f29345h;

    /* renamed from: i  reason: collision with root package name */
    public int f29346i;

    /* renamed from: j  reason: collision with root package name */
    public float f29347j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f29348k;

    /* renamed from: l  reason: collision with root package name */
    public PointF f29349l;

    /* renamed from: m  reason: collision with root package name */
    public PointF f29350m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f29338a = str;
        this.f29339b = str2;
        this.f29340c = f10;
        this.f29341d = aVar;
        this.f29342e = i10;
        this.f29343f = f11;
        this.f29344g = f12;
        this.f29345h = i11;
        this.f29346i = i12;
        this.f29347j = f13;
        this.f29348k = z10;
        this.f29349l = pointF;
        this.f29350m = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.f29338a.hashCode() * 31) + this.f29339b.hashCode()) * 31)) + this.f29340c)) * 31) + this.f29341d.ordinal()) * 31) + this.f29342e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f29343f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f29345h;
    }

    public b() {
    }
}
