package io.intercom.android.sdk.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

public class OrderedListSpan implements LeadingMarginSpan {
    private final int gapWidth;
    private final String number;

    public OrderedListSpan(int i10, String str) {
        this.gapWidth = i10;
        this.number = str;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i15) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            float f10 = (float) i10;
            if (i11 == -1) {
                f10 -= paint.measureText(this.number);
            }
            canvas.drawText(this.number + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, f10, (float) i13, paint);
            paint.setStyle(style);
        }
    }

    public int getLeadingMargin(boolean z10) {
        return (int) (new Paint().measureText(this.number) + ((float) this.gapWidth));
    }
}
