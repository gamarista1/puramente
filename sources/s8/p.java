package s8;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.C6496s;

public final class p extends CharacterStyle implements j {

    /* renamed from: a  reason: collision with root package name */
    private final float f48104a;

    /* renamed from: b  reason: collision with root package name */
    private final float f48105b;

    /* renamed from: c  reason: collision with root package name */
    private final float f48106c;

    /* renamed from: d  reason: collision with root package name */
    private final int f48107d;

    public p(float f10, float f11, float f12, int i10) {
        this.f48104a = f10;
        this.f48105b = f11;
        this.f48106c = f12;
        this.f48107d = i10;
    }

    public void updateDrawState(TextPaint textPaint) {
        C6496s.h(textPaint, "textPaint");
        textPaint.setShadowLayer(this.f48106c, this.f48104a, this.f48105b, this.f48107d);
    }
}
