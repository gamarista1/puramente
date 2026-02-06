package s8;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.C6496s;

/* renamed from: s8.a  reason: case insensitive filesystem */
public final class C3992a extends MetricAffectingSpan implements j {

    /* renamed from: a  reason: collision with root package name */
    private final float f48087a;

    public C3992a(float f10) {
        this.f48087a = f10;
    }

    private final void a(TextPaint textPaint) {
        if (!Float.isNaN(this.f48087a)) {
            textPaint.setLetterSpacing(this.f48087a);
        }
    }

    public final float b() {
        return this.f48087a;
    }

    public void updateDrawState(TextPaint textPaint) {
        C6496s.h(textPaint, "paint");
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C6496s.h(textPaint, "paint");
        a(textPaint);
    }
}
