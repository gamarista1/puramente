package Q1;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.f;

final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f5407a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5408b;

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
            return f.h(inputConnection, editable, i10, i11, z10);
        }

        public void b(EditorInfo editorInfo) {
            if (f.k()) {
                f.c().x(editorInfo);
            }
        }
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable b() {
        return this.f5407a.getEditableText();
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        if (this.f5408b.a(this, b(), i10, i11, false) || super.deleteSurroundingText(i10, i11)) {
            return true;
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        if (this.f5408b.a(this, b(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11)) {
            return true;
        }
        return false;
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f5407a = textView;
        this.f5408b = aVar;
        aVar.b(editorInfo);
    }
}
