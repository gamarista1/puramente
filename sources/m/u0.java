package M;

import J.C1228y;
import P.G;
import W0.C1433a;
import W0.C1439g;
import W0.C1440h;
import W0.C1441i;
import W0.C1446n;
import W0.N;
import W0.O;
import W0.P;
import W0.Q;
import W0.S;
import W0.r;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.v1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

public final class u0 implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f4275a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4276b;

    /* renamed from: c  reason: collision with root package name */
    private final C1228y f4277c;

    /* renamed from: d  reason: collision with root package name */
    private final G f4278d;

    /* renamed from: e  reason: collision with root package name */
    private final v1 f4279e;

    /* renamed from: f  reason: collision with root package name */
    private int f4280f;

    /* renamed from: g  reason: collision with root package name */
    private Q f4281g;

    /* renamed from: h  reason: collision with root package name */
    private int f4282h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4283i;

    /* renamed from: j  reason: collision with root package name */
    private final List f4284j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private boolean f4285k = true;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0 f4286a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u0 u0Var) {
            super(1);
            this.f4286a = u0Var;
        }

        public final void a(C1441i iVar) {
            this.f4286a.c(iVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1441i) obj);
            return C6514M.f71813a;
        }
    }

    public u0(Q q10, k0 k0Var, boolean z10, C1228y yVar, G g10, v1 v1Var) {
        this.f4275a = k0Var;
        this.f4276b = z10;
        this.f4277c = yVar;
        this.f4278d = g10;
        this.f4279e = v1Var;
        this.f4281g = q10;
    }

    /* access modifiers changed from: private */
    public final void c(C1441i iVar) {
        d();
        try {
            this.f4284j.add(iVar);
        } finally {
            e();
        }
    }

    private final boolean d() {
        this.f4280f++;
        return true;
    }

    private final boolean e() {
        int i10 = this.f4280f - 1;
        this.f4280f = i10;
        if (i10 == 0 && !this.f4284j.isEmpty()) {
            this.f4275a.d(C6565s.h1(this.f4284j));
            this.f4284j.clear();
        }
        if (this.f4280f > 0) {
            return true;
        }
        return false;
    }

    private final void f(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    public boolean beginBatchEdit() {
        boolean z10 = this.f4285k;
        if (z10) {
            return d();
        }
        return z10;
    }

    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f4285k;
        if (z10) {
            return false;
        }
        return z10;
    }

    public void closeConnection() {
        this.f4284j.clear();
        this.f4280f = 0;
        this.f4285k = false;
        this.f4275a.e(this);
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f4285k;
        if (z10) {
            return false;
        }
        return z10;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f4285k;
        if (z10) {
            return false;
        }
        return z10;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f4285k;
        if (z10) {
            return this.f4276b;
        }
        return z10;
    }

    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f4285k;
        if (z10) {
            c(new C1433a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f4285k;
        if (!z10) {
            return z10;
        }
        c(new C1439g(i10, i11));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f4285k;
        if (!z10) {
            return z10;
        }
        c(new C1440h(i10, i11));
        return true;
    }

    public boolean endBatchEdit() {
        return e();
    }

    public boolean finishComposingText() {
        boolean z10 = this.f4285k;
        if (!z10) {
            return z10;
        }
        c(new C1446n());
        return true;
    }

    public final void g(Q q10) {
        this.f4281g = q10;
    }

    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f4281g.h(), Q0.Q.l(this.f4281g.g()), i10);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = true;
        int i11 = 0;
        if ((i10 & 1) == 0) {
            z10 = false;
        }
        this.f4283i = z10;
        if (z10) {
            if (extractedTextRequest != null) {
                i11 = extractedTextRequest.token;
            }
            this.f4282h = i11;
        }
        return v0.b(this.f4281g);
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i10) {
        if (Q0.Q.h(this.f4281g.g())) {
            return null;
        }
        return S.a(this.f4281g).toString();
    }

    public CharSequence getTextAfterCursor(int i10, int i11) {
        return S.b(this.f4281g, i10).toString();
    }

    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return S.c(this.f4281g, i10).toString();
    }

    public final void h(Q q10, l0 l0Var) {
        int i10;
        if (this.f4285k) {
            g(q10);
            if (this.f4283i) {
                l0Var.b(this.f4282h, v0.b(q10));
            }
            Q0.Q f10 = q10.f();
            int i11 = -1;
            if (f10 != null) {
                i10 = Q0.Q.l(f10.r());
            } else {
                i10 = -1;
            }
            Q0.Q f11 = q10.f();
            if (f11 != null) {
                i11 = Q0.Q.k(f11.r());
            }
            l0Var.c(Q0.Q.l(q10.g()), Q0.Q.k(q10.g()), i10, i11);
        }
    }

    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f4285k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case 16908319:
                    c(new P(0, this.f4281g.h().length()));
                    break;
                case 16908320:
                    f(277);
                    break;
                case 16908321:
                    f(278);
                    break;
                case 16908322:
                    f(279);
                    break;
            }
        }
        return z10;
    }

    public boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f4285k;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    i11 = r.f8593b.c();
                    break;
                case 3:
                    i11 = r.f8593b.g();
                    break;
                case 4:
                    i11 = r.f8593b.h();
                    break;
                case 5:
                    i11 = r.f8593b.d();
                    break;
                case 6:
                    i11 = r.f8593b.b();
                    break;
                case 7:
                    i11 = r.f8593b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                    i11 = r.f8593b.a();
                    break;
            }
        } else {
            i11 = r.f8593b.a();
        }
        this.f4275a.c(i11);
        return true;
    }

    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C1262c.f4209a.b(this.f4277c, this.f4278d, handwritingGesture, this.f4279e, executor, intConsumer, new a(this));
        }
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f4285k;
        if (z10) {
            return true;
        }
        return z10;
    }

    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1262c.f4209a.d(this.f4277c, this.f4278d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    public boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19 = this.f4285k;
        if (!z19) {
            return z19;
        }
        boolean z20 = false;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            if ((i10 & 16) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i10 & 8) != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((i10 & 4) != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (i11 >= 34 && (i10 & 32) != 0) {
                z20 = true;
            }
            if (z16 || z17 || z18 || z20) {
                z12 = z20;
                z13 = z18;
                z14 = z17;
                z15 = z16;
            } else if (i11 >= 34) {
                z15 = true;
                z14 = true;
                z13 = true;
                z12 = true;
            } else {
                z12 = z20;
                z15 = true;
                z14 = true;
                z13 = true;
            }
        } else {
            z13 = false;
            z12 = false;
            z15 = true;
            z14 = true;
        }
        this.f4275a.b(z10, z11, z15, z14, z13, z12);
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f4285k;
        if (!z10) {
            return z10;
        }
        this.f4275a.a(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f4285k;
        if (z10) {
            c(new N(i10, i11));
        }
        return z10;
    }

    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f4285k;
        if (z10) {
            c(new O(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f4285k;
        if (!z10) {
            return z10;
        }
        c(new P(i10, i11));
        return true;
    }
}
