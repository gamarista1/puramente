package T0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class m extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f5944a;

    public m(float f10) {
        this.f5944a = f10;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f5944a + textPaint.getTextSkewX());
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f5944a + textPaint.getTextSkewX());
    }
}
