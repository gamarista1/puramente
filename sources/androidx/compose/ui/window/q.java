package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

class q implements n {
    public void a(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    public void b(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    public void c(View view, int i10, int i11) {
    }
}
