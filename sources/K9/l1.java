package k9;

import android.os.Bundle;
import ja.C3645a;
import k9.C3700i;
import nb.k;

public final class l1 extends Z0 {

    /* renamed from: d  reason: collision with root package name */
    public static final C3700i.a f45622d = new k1();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f45623b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f45624c;

    public l1() {
        this.f45623b = false;
        this.f45624c = false;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static l1 e(Bundle bundle) {
        boolean z10;
        if (bundle.getInt(c(0), -1) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        if (bundle.getBoolean(c(1), false)) {
            return new l1(bundle.getBoolean(c(2), false));
        }
        return new l1();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f45624c == l1Var.f45624c && this.f45623b == l1Var.f45623b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(Boolean.valueOf(this.f45623b), Boolean.valueOf(this.f45624c));
    }

    public l1(boolean z10) {
        this.f45623b = true;
        this.f45624c = z10;
    }
}
