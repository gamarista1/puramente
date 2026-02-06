package s8;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.C6496s;

/* renamed from: s8.b  reason: case insensitive filesystem */
public final class C3993b implements LineHeightSpan, j {

    /* renamed from: a  reason: collision with root package name */
    private final int f48088a;

    public C3993b(float f10) {
        this.f48088a = (int) Math.ceil((double) f10);
    }

    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        C6496s.h(charSequence, AttributeType.TEXT);
        C6496s.h(fontMetricsInt, "fm");
        int i14 = this.f48088a;
        int i15 = fontMetricsInt.ascent;
        double d10 = (double) (((float) (i14 - ((-i15) + fontMetricsInt.descent))) / 2.0f);
        fontMetricsInt.ascent = i15 - ((int) ((float) Math.ceil(d10)));
        fontMetricsInt.descent += (int) ((float) Math.floor(d10));
        if (i10 == 0) {
            fontMetricsInt.top = fontMetricsInt.ascent;
        }
        if (i11 == charSequence.length()) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
        }
    }
}
