package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public abstract class i implements Window.Callback {

    /* renamed from: a  reason: collision with root package name */
    final Window.Callback f11213a;

    static class a {
        static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i10) {
            return callback.onWindowStartingActionMode(callback2, i10);
        }
    }

    static class b {
        static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            callback.onProvideKeyboardShortcuts(list, menu, i10);
        }
    }

    static class c {
        static void a(Window.Callback callback, boolean z10) {
            callback.onPointerCaptureChanged(z10);
        }
    }

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f11213a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f11213a;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f11213a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f11213a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f11213a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f11213a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f11213a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f11213a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f11213a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f11213a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f11213a.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f11213a.onCreatePanelMenu(i10, menu);
    }

    public View onCreatePanelView(int i10) {
        return this.f11213a.onCreatePanelView(i10);
    }

    public void onDetachedFromWindow() {
        this.f11213a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f11213a.onMenuItemSelected(i10, menuItem);
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f11213a.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, Menu menu) {
        this.f11213a.onPanelClosed(i10, menu);
    }

    public void onPointerCaptureChanged(boolean z10) {
        c.a(this.f11213a, z10);
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f11213a.onPreparePanel(i10, view, menu);
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        b.a(this.f11213a, list, menu, i10);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f11213a, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f11213a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z10) {
        this.f11213a.onWindowFocusChanged(z10);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return a.b(this.f11213a, callback, i10);
    }

    public boolean onSearchRequested() {
        return this.f11213a.onSearchRequested();
    }
}
