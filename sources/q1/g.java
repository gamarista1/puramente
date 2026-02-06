package Q1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import com.google.android.gms.common.api.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f5420a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5421b;

    /* renamed from: c  reason: collision with root package name */
    private f.C0294f f5422c;

    /* renamed from: d  reason: collision with root package name */
    private int f5423d = a.e.API_PRIORITY_OTHER;

    /* renamed from: e  reason: collision with root package name */
    private int f5424e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5425f;

    private static class a extends f.C0294f {

        /* renamed from: a  reason: collision with root package name */
        private final Reference f5426a;

        a(EditText editText) {
            this.f5426a = new WeakReference(editText);
        }

        public void b() {
            super.b();
            g.b((EditText) this.f5426a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f5420a = editText;
        this.f5421b = z10;
        this.f5425f = true;
    }

    private f.C0294f a() {
        if (this.f5422c == null) {
            this.f5422c = new a(this.f5420a);
        }
        return this.f5422c;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            f.c().r(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (!this.f5425f || (!this.f5421b && !f.k())) {
            return true;
        }
        return false;
    }

    public void c(boolean z10) {
        if (this.f5425f != z10) {
            if (this.f5422c != null) {
                f.c().w(this.f5422c);
            }
            this.f5425f = z10;
            if (z10) {
                b(this.f5420a, f.c().g());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.f5420a.isInEditMode() && !d() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int g10 = f.c().g();
            if (g10 != 0) {
                if (g10 == 1) {
                    f.c().u((Spannable) charSequence, i10, i10 + i12, this.f5423d, this.f5424e);
                    return;
                } else if (g10 != 3) {
                    return;
                }
            }
            f.c().v(a());
        }
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
