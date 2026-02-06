package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;
import p1.C2389e;

class e implements f.e {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f16586b = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f16587a;

    e() {
        TextPaint textPaint = new TextPaint();
        this.f16587a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f16586b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder b10 = b();
        b10.setLength(0);
        while (i10 < i11) {
            b10.append(charSequence.charAt(i10));
            i10++;
        }
        return C2389e.a(this.f16587a, b10.toString());
    }
}
