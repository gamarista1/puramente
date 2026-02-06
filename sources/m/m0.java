package M;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.O;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import lf.C6534r;
import yf.C6787a;

public final class m0 implements l0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final View f4217a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f4218b = C6531o.a(C6534r.NONE, new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final O f4219c;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f4220a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(0);
            this.f4220a = m0Var;
        }

        /* renamed from: a */
        public final InputMethodManager invoke() {
            Object systemService = this.f4220a.f4217a.getContext().getSystemService("input_method");
            C6496s.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public m0(View view) {
        this.f4217a = view;
        this.f4219c = new O(view);
    }

    private final InputMethodManager h() {
        return (InputMethodManager) this.f4218b.getValue();
    }

    public boolean a() {
        return h().isActive(this.f4217a);
    }

    public void b(int i10, ExtractedText extractedText) {
        h().updateExtractedText(this.f4217a, i10, extractedText);
    }

    public void c(int i10, int i11, int i12, int i13) {
        h().updateSelection(this.f4217a, i10, i11, i12, i13);
    }

    public void d() {
        h().restartInput(this.f4217a);
    }

    public void e(CursorAnchorInfo cursorAnchorInfo) {
        h().updateCursorAnchorInfo(this.f4217a, cursorAnchorInfo);
    }

    public void f() {
        if (Build.VERSION.SDK_INT >= 34) {
            C1264e.f4210a.a(h(), this.f4217a);
        }
    }
}
