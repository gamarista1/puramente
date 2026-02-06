package k9;

import android.os.Bundle;
import ja.C3645a;
import k9.C3700i;
import nb.k;

public final class h1 extends Z0 {

    /* renamed from: d  reason: collision with root package name */
    public static final C3700i.a f45562d = new g1();

    /* renamed from: b  reason: collision with root package name */
    private final int f45563b;

    /* renamed from: c  reason: collision with root package name */
    private final float f45564c;

    public h1(int i10) {
        C3645a.b(i10 > 0, "maxStars must be a positive integer");
        this.f45563b = i10;
        this.f45564c = -1.0f;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static h1 e(Bundle bundle) {
        boolean z10 = false;
        if (bundle.getInt(c(0), -1) == 2) {
            z10 = true;
        }
        C3645a.a(z10);
        int i10 = bundle.getInt(c(1), 5);
        float f10 = bundle.getFloat(c(2), -1.0f);
        if (f10 == -1.0f) {
            return new h1(i10);
        }
        return new h1(i10, f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (this.f45563b == h1Var.f45563b && this.f45564c == h1Var.f45564c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(Integer.valueOf(this.f45563b), Float.valueOf(this.f45564c));
    }

    public h1(int i10, float f10) {
        boolean z10 = false;
        C3645a.b(i10 > 0, "maxStars must be a positive integer");
        if (f10 >= 0.0f && f10 <= ((float) i10)) {
            z10 = true;
        }
        C3645a.b(z10, "starRating is out of range [0, maxStars]");
        this.f45563b = i10;
        this.f45564c = f10;
    }
}
