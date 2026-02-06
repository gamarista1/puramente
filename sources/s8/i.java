package s8;

import Af.a;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.C6496s;

public final class i extends CharacterStyle implements UpdateAppearance, j {

    /* renamed from: a  reason: collision with root package name */
    private final float f48097a;

    public i(float f10) {
        this.f48097a = f10;
    }

    public void updateDrawState(TextPaint textPaint) {
        C6496s.h(textPaint, "paint");
        textPaint.setAlpha(a.d(((float) Color.alpha(textPaint.getColor())) * this.f48097a));
        int i10 = textPaint.bgColor;
        if (i10 != 0) {
            textPaint.bgColor = Color.argb(a.d(((float) Color.alpha(i10)) * this.f48097a), Color.red(textPaint.bgColor), Color.green(textPaint.bgColor), Color.blue(textPaint.bgColor));
        }
    }
}
