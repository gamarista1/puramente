package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2466S;
import r0.M1;

/* renamed from: androidx.compose.ui.platform.e0  reason: case insensitive filesystem */
final class C1626e0 implements C1623d0 {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f13718a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f13719b;

    public /* synthetic */ C1626e0(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private final void b(float[] fArr, Matrix matrix) {
        C2466S.b(this.f13718a, matrix);
        O.i(fArr, this.f13718a);
    }

    private final void c(float[] fArr, float f10, float f11) {
        O.j(fArr, f10, f11, this.f13718a);
    }

    private final void d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            c(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            int[] iArr = this.f13719b;
            view.getLocationInWindow(iArr);
            c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            c(fArr, (float) iArr[0], (float) iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            b(fArr, matrix);
        }
    }

    public void a(View view, float[] fArr) {
        M1.h(fArr);
        d(view, fArr);
    }

    private C1626e0(float[] fArr) {
        this.f13718a = fArr;
        this.f13719b = new int[2];
    }
}
