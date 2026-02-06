package W0;

import A1.c;
import Q0.Q;
import W0.C1455x;
import W0.C1456y;
import W0.r;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.f;
import java.util.concurrent.Executor;

public abstract class Y {
    public static final Executor d(Choreographer choreographer) {
        return new W(choreographer);
    }

    /* access modifiers changed from: private */
    public static final void e(Choreographer choreographer, Runnable runnable) {
        choreographer.postFrameCallback(new X(runnable));
    }

    /* access modifiers changed from: private */
    public static final void f(Runnable runnable, long j10) {
        runnable.run();
    }

    private static final boolean g(int i10, int i11) {
        if ((i10 & i11) == i11) {
            return true;
        }
        return false;
    }

    public static final void h(EditorInfo editorInfo, C1450s sVar, Q q10) {
        int e10 = sVar.e();
        r.a aVar = r.f8593b;
        int i10 = 6;
        if (r.m(e10, aVar.a())) {
            if (!sVar.h()) {
                i10 = 0;
            }
        } else if (r.m(e10, aVar.e())) {
            i10 = 1;
        } else if (r.m(e10, aVar.c())) {
            i10 = 2;
        } else if (r.m(e10, aVar.d())) {
            i10 = 5;
        } else if (r.m(e10, aVar.f())) {
            i10 = 7;
        } else if (r.m(e10, aVar.g())) {
            i10 = 3;
        } else if (r.m(e10, aVar.h())) {
            i10 = 4;
        } else if (!r.m(e10, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        sVar.g();
        int f10 = sVar.f();
        C1456y.a aVar2 = C1456y.f8623b;
        if (C1456y.n(f10, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (C1456y.n(f10, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (C1456y.n(f10, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (C1456y.n(f10, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (C1456y.n(f10, aVar2.j())) {
            editorInfo.inputType = 17;
        } else if (C1456y.n(f10, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (C1456y.n(f10, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (C1456y.n(f10, aVar2.e())) {
            editorInfo.inputType = 18;
        } else if (C1456y.n(f10, aVar2.b())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type");
        }
        if (!sVar.h() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (r.m(sVar.e(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int c10 = sVar.c();
            C1455x.a aVar3 = C1455x.f8616b;
            if (C1455x.i(c10, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (C1455x.i(c10, aVar3.e())) {
                editorInfo.inputType |= 8192;
            } else if (C1455x.i(c10, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (sVar.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = Q.n(q10.g());
        editorInfo.initialSelEnd = Q.i(q10.g());
        c.f(editorInfo, q10.h());
        editorInfo.imeOptions |= 33554432;
    }

    /* access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (f.k()) {
            f.c().x(editorInfo);
        }
    }
}
