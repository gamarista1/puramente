package u4;

import android.graphics.Bitmap;

public class O {

    /* renamed from: a  reason: collision with root package name */
    private final int f48382a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48383b;

    /* renamed from: c  reason: collision with root package name */
    private final String f48384c;

    /* renamed from: d  reason: collision with root package name */
    private final String f48385d;

    /* renamed from: e  reason: collision with root package name */
    private final String f48386e;

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f48387f;

    public O(int i10, int i11, String str, String str2, String str3) {
        this.f48382a = i10;
        this.f48383b = i11;
        this.f48384c = str;
        this.f48385d = str2;
        this.f48386e = str3;
    }

    public O a(float f10) {
        O o10 = new O((int) (((float) this.f48382a) * f10), (int) (((float) this.f48383b) * f10), this.f48384c, this.f48385d, this.f48386e);
        Bitmap bitmap = this.f48387f;
        if (bitmap != null) {
            o10.g(Bitmap.createScaledBitmap(bitmap, o10.f48382a, o10.f48383b, true));
        }
        return o10;
    }

    public Bitmap b() {
        return this.f48387f;
    }

    public String c() {
        return this.f48385d;
    }

    public int d() {
        return this.f48383b;
    }

    public String e() {
        return this.f48384c;
    }

    public int f() {
        return this.f48382a;
    }

    public void g(Bitmap bitmap) {
        this.f48387f = bitmap;
    }
}
