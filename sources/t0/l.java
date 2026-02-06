package T0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class l extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    private final int f5940a;

    /* renamed from: b  reason: collision with root package name */
    private final float f5941b;

    /* renamed from: c  reason: collision with root package name */
    private final float f5942c;

    /* renamed from: d  reason: collision with root package name */
    private final float f5943d;

    public l(int i10, float f10, float f11, float f12) {
        this.f5940a = i10;
        this.f5941b = f10;
        this.f5942c = f11;
        this.f5943d = f12;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f5943d, this.f5941b, this.f5942c, this.f5940a);
    }
}
