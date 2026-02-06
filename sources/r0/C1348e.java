package R0;

import android.graphics.RectF;
import android.text.Layout;
import yf.p;

/* renamed from: R0.e  reason: case insensitive filesystem */
public final /* synthetic */ class C1348e implements Layout.TextInclusionStrategy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f5529a;

    public /* synthetic */ C1348e(p pVar) {
        this.f5529a = pVar;
    }

    public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
        return C1349f.b(this.f5529a, rectF, rectF2);
    }
}
