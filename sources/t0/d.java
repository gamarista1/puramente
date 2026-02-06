package T0;

import R0.n0;
import android.graphics.Paint;
import android.text.Layout;

public abstract class d {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5912a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5912a = iArr;
        }
    }

    public static final float a(Layout layout, int i10, Paint paint) {
        int i11;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        if (!n0.m(layout, i10) || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if (paragraphAlignment == null) {
            i11 = -1;
        } else {
            i11 = a.f5912a[paragraphAlignment.ordinal()];
        }
        if (i11 == 1) {
            abs = Math.abs(lineLeft);
            width = (((float) layout.getWidth()) - primaryHorizontal) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = ((float) layout.getWidth()) - primaryHorizontal;
        }
        return abs + width;
    }

    public static /* synthetic */ float b(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
        }
        return a(layout, i10, paint);
    }

    public static final float c(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        if (!n0.m(layout, i10)) {
            return 0.0f;
        }
        int i11 = -1;
        if (layout.getParagraphDirection(i10) != -1 || ((float) layout.getWidth()) >= layout.getLineRight(i10)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if (paragraphAlignment != null) {
            i11 = a.f5912a[paragraphAlignment.ordinal()];
        }
        if (i11 == 1) {
            width = ((float) layout.getWidth()) - layout.getLineRight(i10);
            width2 = (((float) layout.getWidth()) - lineRight) / 2.0f;
        } else {
            width = ((float) layout.getWidth()) - layout.getLineRight(i10);
            width2 = ((float) layout.getWidth()) - lineRight;
        }
        return width - width2;
    }

    public static /* synthetic */ float d(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
        }
        return c(layout, i10, paint);
    }
}
