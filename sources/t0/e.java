package T0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class e extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f5913a;

    public e(float f10) {
        this.f5913a = f10;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f5913a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f5913a);
    }
}
