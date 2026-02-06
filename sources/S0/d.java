package S0;

import android.text.TextPaint;

public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f5824a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f5825b;

    public d(CharSequence charSequence, TextPaint textPaint) {
        this.f5824a = charSequence;
        this.f5825b = textPaint;
    }

    public int e(int i10) {
        TextPaint textPaint = this.f5825b;
        CharSequence charSequence = this.f5824a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    public int f(int i10) {
        TextPaint textPaint = this.f5825b;
        CharSequence charSequence = this.f5824a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
