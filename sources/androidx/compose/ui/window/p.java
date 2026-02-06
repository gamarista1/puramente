package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import mf.C6565s;

final class p extends q {
    public void c(View view, int i10, int i11) {
        view.setSystemGestureExclusionRects(C6565s.t(new Rect(0, 0, i10, i11)));
    }
}
