package Q1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.api.a;
import x1.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f5399a;

    /* renamed from: b  reason: collision with root package name */
    private int f5400b = a.e.API_PRIORITY_OTHER;

    /* renamed from: c  reason: collision with root package name */
    private int f5401c = 0;

    /* renamed from: Q1.a$a  reason: collision with other inner class name */
    private static class C0135a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f5402a;

        /* renamed from: b  reason: collision with root package name */
        private final g f5403b;

        C0135a(EditText editText, boolean z10) {
            this.f5402a = editText;
            g gVar = new g(editText, z10);
            this.f5403b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(b.getInstance());
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new e(keyListener);
        }

        /* access modifiers changed from: package-private */
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof c) {
                return inputConnection;
            }
            return new c(this.f5402a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            this.f5403b.c(z10);
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract KeyListener a(KeyListener keyListener);

        /* access modifiers changed from: package-private */
        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        /* access modifiers changed from: package-private */
        public abstract void c(boolean z10);
    }

    public a(EditText editText, boolean z10) {
        g.g(editText, "editText cannot be null");
        this.f5399a = new C0135a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f5399a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f5399a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f5399a.c(z10);
    }
}
