package T0;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class o extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f5947a;

    public o(Typeface typeface) {
        this.f5947a = typeface;
    }

    private final void a(Paint paint) {
        paint.setTypeface(this.f5947a);
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
