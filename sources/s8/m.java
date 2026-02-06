package s8;

import android.text.TextPaint;
import kotlin.jvm.internal.C6496s;

public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f48099a;

    public m(TextPaint textPaint) {
        C6496s.h(textPaint, "textPaint");
        this.f48099a = textPaint;
    }

    public final TextPaint a() {
        return this.f48099a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && C6496s.c(this.f48099a, ((m) obj).f48099a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f48099a.hashCode();
    }

    public String toString() {
        TextPaint textPaint = this.f48099a;
        return "ReactTextPaintHolderSpan(textPaint=" + textPaint + ")";
    }
}
