package R0;

import android.text.Spanned;

public abstract class T {
    public static final boolean a(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static final boolean b(Spanned spanned, Class cls, int i10, int i11) {
        if (spanned.nextSpanTransition(i10 - 1, i11, cls) != i11) {
            return true;
        }
        return false;
    }
}
