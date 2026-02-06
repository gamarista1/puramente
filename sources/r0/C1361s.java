package R0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: R0.s  reason: case insensitive filesystem */
final class C1361s {

    /* renamed from: a  reason: collision with root package name */
    public static final C1361s f5584a = new C1361s();

    private C1361s() {
    }

    public final boolean a(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean b(Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.clipOutRect(f10, f11, f12, f13);
    }

    public final boolean c(Canvas canvas, int i10, int i11, int i12, int i13) {
        return canvas.clipOutRect(i10, i11, i12, i13);
    }

    public final boolean d(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean e(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
