package F4;

import G4.c;
import android.graphics.Color;

/* renamed from: F4.g  reason: case insensitive filesystem */
public class C3004g implements N {

    /* renamed from: a  reason: collision with root package name */
    public static final C3004g f30699a = new C3004g();

    private C3004g() {
    }

    /* renamed from: b */
    public Integer a(c cVar, float f10) {
        boolean z10;
        double d10;
        if (cVar.M() == c.b.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.b();
        }
        double v10 = cVar.v();
        double v11 = cVar.v();
        double v12 = cVar.v();
        if (cVar.M() == c.b.NUMBER) {
            d10 = cVar.v();
        } else {
            d10 = 1.0d;
        }
        if (z10) {
            cVar.n();
        }
        if (v10 <= 1.0d && v11 <= 1.0d && v12 <= 1.0d) {
            v10 *= 255.0d;
            v11 *= 255.0d;
            v12 *= 255.0d;
            if (d10 <= 1.0d) {
                d10 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d10, (int) v10, (int) v11, (int) v12));
    }
}
