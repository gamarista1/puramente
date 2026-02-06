package R0;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: R0.m  reason: case insensitive filesystem */
final class C1356m {

    /* renamed from: a  reason: collision with root package name */
    public static final C1356m f5581a = new C1356m();

    private C1356m() {
    }

    public final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        canvas.drawTextRun(charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    public final void b(Canvas canvas, char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        canvas.drawTextRun(cArr, i10, i11, i12, i13, f10, f11, z10, paint);
    }
}
