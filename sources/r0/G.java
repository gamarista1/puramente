package R0;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

final class G {

    /* renamed from: a  reason: collision with root package name */
    public static final G f5498a = new G();

    private G() {
    }

    public final void a(Canvas canvas, int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
    }

    public final void b(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public final void c(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
