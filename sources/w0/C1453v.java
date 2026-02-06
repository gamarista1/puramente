package W0;

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

/* renamed from: W0.v  reason: case insensitive filesystem */
public final class C1453v implements C1452u {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final View f8612a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f8613b = C6531o.a(C6534r.NONE, new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final O f8614c;

    /* renamed from: W0.v$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1453v f8615a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1453v vVar) {
            super(0);
            this.f8615a = vVar;
        }

        /* renamed from: a */
        public final InputMethodManager invoke() {
            Object systemService = this.f8615a.f8612a.getContext().getSystemService("input_method");
            C6496s.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public C1453v(View view) {
        this.f8612a = view;
        this.f8614c = new O(view);
    }

    private final InputMethodManager i() {
        return (InputMethodManager) this.f8613b.getValue();
    }

    public boolean a() {
        return i().isActive(this.f8612a);
    }

    public void b(int i10, ExtractedText extractedText) {
        i().updateExtractedText(this.f8612a, i10, extractedText);
    }

    public void c(int i10, int i11, int i12, int i13) {
        i().updateSelection(this.f8612a, i10, i11, i12, i13);
    }

    public void d() {
        i().restartInput(this.f8612a);
    }

    public void e(CursorAnchorInfo cursorAnchorInfo) {
        i().updateCursorAnchorInfo(this.f8612a, cursorAnchorInfo);
    }

    public void f() {
        this.f8614c.b();
    }

    public void g() {
        this.f8614c.a();
    }
}
