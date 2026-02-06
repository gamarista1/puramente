package R0;

import android.text.Layout;
import kotlin.jvm.internal.C6496s;

public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f5557a = new j0();

    /* renamed from: b  reason: collision with root package name */
    private static final Layout.Alignment f5558b;

    /* renamed from: c  reason: collision with root package name */
    private static final Layout.Alignment f5559c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (C6496s.c(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (C6496s.c(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f5558b = alignment;
        f5559c = alignment2;
    }

    private j0() {
    }

    public final Layout.Alignment a(int i10) {
        if (i10 == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i10 == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (i10 == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (i10 == 3) {
            return f5558b;
        }
        if (i10 != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return f5559c;
    }
}
