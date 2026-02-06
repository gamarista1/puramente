package k9;

import android.os.Bundle;
import k9.C3700i;

public abstract class Z0 implements C3700i {

    /* renamed from: a  reason: collision with root package name */
    public static final C3700i.a f45425a = new Y0();

    Z0() {
    }

    /* access modifiers changed from: private */
    public static Z0 b(Bundle bundle) {
        int i10 = bundle.getInt(c(0), -1);
        if (i10 == 0) {
            return (Z0) C3722t0.f45835d.a(bundle);
        }
        if (i10 == 1) {
            return (Z0) N0.f45341c.a(bundle);
        }
        if (i10 == 2) {
            return (Z0) h1.f45562d.a(bundle);
        }
        if (i10 == 3) {
            return (Z0) l1.f45622d.a(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i10);
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }
}
