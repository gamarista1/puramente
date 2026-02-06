package J0;

import G0.a;
import androidx.compose.ui.focus.k;
import lf.C6527k;

/* renamed from: J0.e  reason: case insensitive filesystem */
final class C1238e implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final C1238e f3850a = new C1238e();

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f3851b;

    private C1238e() {
    }

    public void h(boolean z10) {
        f3851b = Boolean.valueOf(z10);
    }

    public boolean j() {
        Boolean bool = f3851b;
        if (bool != null) {
            return bool.booleanValue();
        }
        a.c("canFocus is read before it is written");
        throw new C6527k();
    }

    public final boolean n() {
        if (f3851b != null) {
            return true;
        }
        return false;
    }

    public final void p() {
        f3851b = null;
    }
}
