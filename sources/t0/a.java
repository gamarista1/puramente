package T0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class a extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f5910a;

    public a(float f10) {
        this.f5910a = f10;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.f5910a)));
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.f5910a)));
    }
}
