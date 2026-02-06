package F4;

import G4.c;
import android.graphics.PointF;

public class B implements N {

    /* renamed from: a  reason: collision with root package name */
    public static final B f30676a = new B();

    private B() {
    }

    /* renamed from: b */
    public PointF a(c cVar, float f10) {
        c.b M10 = cVar.M();
        if (M10 == c.b.BEGIN_ARRAY) {
            return s.e(cVar, f10);
        }
        if (M10 == c.b.BEGIN_OBJECT) {
            return s.e(cVar, f10);
        }
        if (M10 == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.v()) * f10, ((float) cVar.v()) * f10);
            while (cVar.q()) {
                cVar.V();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + M10);
    }
}
