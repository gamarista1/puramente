package W0;

import Q0.Q;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;
import mf.C6565s;

public final class M implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    private final C1451t f8491a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8492b;

    /* renamed from: c  reason: collision with root package name */
    private int f8493c;

    /* renamed from: d  reason: collision with root package name */
    private Q f8494d;

    /* renamed from: e  reason: collision with root package name */
    private int f8495e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8496f;

    /* renamed from: g  reason: collision with root package name */
    private final List f8497g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private boolean f8498h = true;

    public M(Q q10, C1451t tVar, boolean z10) {
        this.f8491a = tVar;
        this.f8492b = z10;
        this.f8494d = q10;
    }

    private final void b(C1441i iVar) {
        c();
        try {
            this.f8497g.add(iVar);
        } finally {
            d();
        }
    }

    private final boolean c() {
        this.f8493c++;
        return true;
    }

    private final boolean d() {
        int i10 = this.f8493c - 1;
        this.f8493c = i10;
        if (i10 == 0 && !this.f8497g.isEmpty()) {
            this.f8491a.d(C6565s.h1(this.f8497g));
            this.f8497g.clear();
        }
        if (this.f8493c > 0) {
            return true;
        }
        return false;
    }

    private final void e(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    public boolean beginBatchEdit() {
        boolean z10 = this.f8498h;
        if (z10) {
            return c();
        }
        return z10;
    }

    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f8498h;
        if (z10) {
            return false;
        }
        return z10;
    }

    public void closeConnection() {
        this.f8497g.clear();
        this.f8493c = 0;
        this.f8498h = false;
        this.f8491a.e(this);
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f8498h;
        if (z10) {
            return false;
        }
        return z10;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f8498h;
        if (z10) {
            return false;
        }
        return z10;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f8498h;
        if (z10) {
            return this.f8492b;
        }
        return z10;
    }

    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f8498h;
        if (z10) {
            b(new C1433a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f8498h;
        if (!z10) {
            return z10;
        }
        b(new C1439g(i10, i11));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f8498h;
        if (!z10) {
            return z10;
        }
        b(new C1440h(i10, i11));
        return true;
    }

    public boolean endBatchEdit() {
        return d();
    }

    public final void f(Q q10) {
        this.f8494d = q10;
    }

    public boolean finishComposingText() {
        boolean z10 = this.f8498h;
        if (!z10) {
            return z10;
        }
        b(new C1446n());
        return true;
    }

    public final void g(Q q10, C1452u uVar) {
        int i10;
        if (this.f8498h) {
            f(q10);
            if (this.f8496f) {
                uVar.b(this.f8495e, C1454w.a(q10));
            }
            Q f10 = q10.f();
            int i11 = -1;
            if (f10 != null) {
                i10 = Q.l(f10.r());
            } else {
                i10 = -1;
            }
            Q f11 = q10.f();
            if (f11 != null) {
                i11 = Q.k(f11.r());
            }
            uVar.c(Q.l(q10.g()), Q.k(q10.g()), i10, i11);
        }
    }

    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f8494d.h(), Q.l(this.f8494d.g()), i10);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = true;
        int i11 = 0;
        if ((i10 & 1) == 0) {
            z10 = false;
        }
        this.f8496f = z10;
        if (z10) {
            if (extractedTextRequest != null) {
                i11 = extractedTextRequest.token;
            }
            this.f8495e = i11;
        }
        return C1454w.a(this.f8494d);
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i10) {
        if (Q.h(this.f8494d.g())) {
            return null;
        }
        return S.a(this.f8494d).toString();
    }

    public CharSequence getTextAfterCursor(int i10, int i11) {
        return S.b(this.f8494d, i10).toString();
    }

    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return S.c(this.f8494d, i10).toString();
    }

    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f8498h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case 16908319:
                    b(new P(0, this.f8494d.h().length()));
                    break;
                case 16908320:
                    e(277);
                    break;
                case 16908321:
                    e(278);
                    break;
                case 16908322:
                    e(279);
                    break;
            }
        }
        return z10;
    }

    public boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f8498h;
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
        this.f8491a.c(i11);
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f8498h;
        if (z10) {
            return true;
        }
        return z10;
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
        boolean z19 = this.f8498h;
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
        this.f8491a.b(z10, z11, z15, z14, z13, z12);
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f8498h;
        if (!z10) {
            return z10;
        }
        this.f8491a.a(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f8498h;
        if (z10) {
            b(new N(i10, i11));
        }
        return z10;
    }

    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f8498h;
        if (z10) {
            b(new O(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f8498h;
        if (!z10) {
            return z10;
        }
        b(new P(i10, i11));
        return true;
    }
}
