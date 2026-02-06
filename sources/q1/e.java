package Q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.f;

final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    private final KeyListener f5413a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5414b;

    public static class a {
        public boolean a(Editable editable, int i10, KeyEvent keyEvent) {
            return f.i(editable, i10, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f5413a.clearMetaKeyState(view, editable, i10);
    }

    public int getInputType() {
        return this.f5413a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        if (this.f5414b.a(editable, i10, keyEvent) || this.f5413a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f5413a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f5413a.onKeyUp(view, editable, i10, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f5413a = keyListener;
        this.f5414b = aVar;
    }
}
