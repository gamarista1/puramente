package s8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.C6496s;

public final class r extends ReplacementSpan implements j {

    /* renamed from: a  reason: collision with root package name */
    private final int f48109a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48110b;

    /* renamed from: c  reason: collision with root package name */
    private final int f48111c;

    public r(int i10, int i11, int i12) {
        this.f48109a = i10;
        this.f48110b = i11;
        this.f48111c = i12;
    }

    public final int a() {
        return this.f48111c;
    }

    public final int b() {
        return this.f48109a;
    }

    public final int c() {
        return this.f48110b;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        C6496s.h(canvas, "canvas");
        C6496s.h(paint, "paint");
    }

    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        C6496s.h(paint, "paint");
        if (fontMetricsInt != null) {
            int i12 = -this.f48111c;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i12;
            fontMetricsInt.bottom = 0;
        }
        return this.f48110b;
    }
}
