package r0;

import android.graphics.Rect;
import android.graphics.RectF;
import c1.p;
import q0.C2423i;

public abstract class Z1 {
    public static final Rect a(p pVar) {
        return new Rect(pVar.g(), pVar.i(), pVar.h(), pVar.d());
    }

    public static final Rect b(C2423i iVar) {
        return new Rect((int) iVar.i(), (int) iVar.l(), (int) iVar.j(), (int) iVar.e());
    }

    public static final RectF c(C2423i iVar) {
        return new RectF(iVar.i(), iVar.l(), iVar.j(), iVar.e());
    }

    public static final p d(Rect rect) {
        return new p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C2423i e(Rect rect) {
        return new C2423i((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    public static final C2423i f(RectF rectF) {
        return new C2423i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
