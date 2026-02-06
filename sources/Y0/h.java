package Y0;

import android.text.TextPaint;

public abstract class h {
    public static final void a(TextPaint textPaint, float f10) {
        if (!Float.isNaN(f10)) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f10 * ((float) 255)));
        }
    }
}
