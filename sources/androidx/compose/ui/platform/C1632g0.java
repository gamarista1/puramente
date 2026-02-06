package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import r0.C2466S;

/* renamed from: androidx.compose.ui.platform.g0  reason: case insensitive filesystem */
final class C1632g0 implements C1623d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f13741a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final int[] f13742b = new int[2];

    public void a(View view, float[] fArr) {
        this.f13741a.reset();
        view.transformMatrixToGlobal(this.f13741a);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        view.getLocationOnScreen(this.f13742b);
        int[] iArr = this.f13742b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f13742b;
        this.f13741a.postTranslate((float) (iArr2[0] - i10), (float) (iArr2[1] - i11));
        C2466S.b(fArr, this.f13741a);
    }
}
