package s8;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.C6496s;

/* renamed from: s8.d  reason: case insensitive filesystem */
public final class C3995d implements LineHeightSpan, j {

    /* renamed from: a  reason: collision with root package name */
    private final int f48095a;

    public C3995d(float f10) {
        this.f48095a = (int) Math.ceil((double) f10);
    }

    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        C6496s.h(fontMetricsInt, "fm");
        int i14 = fontMetricsInt.descent;
        int i15 = this.f48095a;
        if (i14 > i15) {
            int min = (int) Math.min((double) i15, (double) i14);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
            return;
        }
        int i16 = fontMetricsInt.ascent;
        if ((-i16) + i14 > i15) {
            fontMetricsInt.bottom = i14;
            int i17 = (-i15) + i14;
            fontMetricsInt.ascent = i17;
            fontMetricsInt.top = i17;
            return;
        }
        int i18 = fontMetricsInt.bottom;
        if ((-i16) + i18 > i15) {
            fontMetricsInt.top = i16;
            fontMetricsInt.bottom = i16 + i15;
            return;
        }
        int i19 = fontMetricsInt.top;
        if ((-i19) + i18 > i15) {
            fontMetricsInt.top = i18 - i15;
            return;
        }
        double d10 = (double) (((float) (i15 - ((-i19) + i18))) / 2.0f);
        int ceil = (int) (((float) i19) - ((float) Math.ceil(d10)));
        int floor = (int) (((float) fontMetricsInt.bottom) + ((float) Math.floor(d10)));
        fontMetricsInt.top = ceil;
        fontMetricsInt.ascent = ceil;
        fontMetricsInt.descent = floor;
        fontMetricsInt.bottom = floor;
    }
}
