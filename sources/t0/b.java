package T0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class b extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final String f5911a;

    public b(String str) {
        this.f5911a = str;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f5911a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f5911a);
    }
}
