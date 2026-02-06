package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;

public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final q1 f13825a = new q1();

    private q1() {
    }

    public final void a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i10) {
        return view.startActionMode(callback, i10);
    }
}
