package L0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import q0.C2423i;

public final class a extends ActionMode.Callback2 {

    /* renamed from: a  reason: collision with root package name */
    private final c f4110a;

    public a(c cVar) {
        this.f4110a = cVar;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f4110a.d(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f4110a.e(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f4110a.f();
    }

    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C2423i c10 = this.f4110a.c();
        if (rect != null) {
            rect.set((int) c10.i(), (int) c10.l(), (int) c10.j(), (int) c10.e());
        }
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f4110a.g(actionMode, menu);
    }
}
