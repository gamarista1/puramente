package T0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class n extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5945a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5946b;

    public n(boolean z10, boolean z11) {
        this.f5945a = z10;
        this.f5946b = z11;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f5945a);
        textPaint.setStrikeThruText(this.f5946b);
    }
}
