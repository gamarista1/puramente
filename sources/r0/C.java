package R0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

final class C {

    /* renamed from: a  reason: collision with root package name */
    public static final C f5497a = new C();

    private C() {
    }

    public final boolean a(Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.quickReject(f10, f11, f12, f13);
    }

    public final boolean b(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public final boolean c(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
