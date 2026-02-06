package q6;

import android.graphics.Matrix;
import android.graphics.Rect;

public abstract class p implements q {
    public Matrix a(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11) {
        int i12 = i10;
        int i13 = i11;
        b(matrix, rect, i12, i13, f10, f11, ((float) rect.width()) / ((float) i12), ((float) rect.height()) / ((float) i13));
        return matrix;
    }

    public abstract void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13);
}
