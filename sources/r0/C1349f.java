package R0;

import S0.a;
import S0.j;
import android.graphics.RectF;
import android.text.SegmentFinder;
import yf.p;

/* renamed from: R0.f  reason: case insensitive filesystem */
public final class C1349f {

    /* renamed from: a  reason: collision with root package name */
    public static final C1349f f5530a = new C1349f();

    private C1349f() {
    }

    /* access modifiers changed from: private */
    public static final boolean b(p pVar, RectF rectF, RectF rectF2) {
        return ((Boolean) pVar.invoke(rectF, rectF2)).booleanValue();
    }

    public final int[] c(l0 l0Var, RectF rectF, int i10, p pVar) {
        SegmentFinder segmentFinder;
        if (i10 == 1) {
            segmentFinder = a.f5822a.a(new j(l0Var.G(), l0Var.I()));
        } else {
            C1345b.a();
            segmentFinder = C1346c.a(C1344a.a(l0Var.G(), l0Var.H()));
        }
        return l0Var.i().getRangeForRect(rectF, segmentFinder, new C1348e(pVar));
    }
}
