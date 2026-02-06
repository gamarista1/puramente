package r0;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;

/* renamed from: r0.D0  reason: case insensitive filesystem */
final class C2441D0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C2441D0 f25402a = new C2441D0();

    private C2441D0() {
    }

    public final float[] a(ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return C2435A0.a(colorMatrix.getArray());
    }
}
