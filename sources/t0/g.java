package T0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

public final class g implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f5915a;

    public g(float f10) {
        this.f5915a = f10;
    }

    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int a10 = i.a(fontMetricsInt);
        if (a10 > 0) {
            int ceil = (int) ((float) Math.ceil((double) this.f5915a));
            int ceil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((((float) ceil) * 1.0f) / ((float) a10))));
            fontMetricsInt.descent = ceil2;
            fontMetricsInt.ascent = ceil2 - ceil;
        }
    }
}
