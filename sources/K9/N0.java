package k9;

import android.os.Bundle;
import ja.C3645a;
import k9.C3700i;
import nb.k;

public final class N0 extends Z0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C3700i.a f45341c = new M0();

    /* renamed from: b  reason: collision with root package name */
    private final float f45342b;

    public N0() {
        this.f45342b = -1.0f;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static N0 e(Bundle bundle) {
        boolean z10 = false;
        if (bundle.getInt(c(0), -1) == 1) {
            z10 = true;
        }
        C3645a.a(z10);
        float f10 = bundle.getFloat(c(1), -1.0f);
        if (f10 == -1.0f) {
            return new N0();
        }
        return new N0(f10);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof N0) && this.f45342b == ((N0) obj).f45342b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(Float.valueOf(this.f45342b));
    }

    public N0(float f10) {
        C3645a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f45342b = f10;
    }
}
