package T0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class f extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f5914a;

    public f(float f10) {
        this.f5914a = f10;
    }

    private final void a(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != 0.0f) {
            textPaint.setLetterSpacing(this.f5914a / textSize);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
