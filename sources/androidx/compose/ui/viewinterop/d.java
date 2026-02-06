package androidx.compose.ui.viewinterop;

import C0.e;
import H0.C1198t;
import J0.G;
import android.view.View;
import q0.C2421g;

public abstract class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final a f14162a = new a();

    public static final class a implements C0.a {
        a() {
        }
    }

    /* access modifiers changed from: private */
    public static final void f(View view, G g10) {
        long e10 = C1198t.e(g10.m());
        int round = Math.round(C2421g.m(e10));
        int round2 = Math.round(C2421g.n(e10));
        view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
    }

    /* access modifiers changed from: private */
    public static final float g(int i10) {
        return ((float) i10) * ((float) -1);
    }

    /* access modifiers changed from: private */
    public static final float h(float f10) {
        return f10 * -1.0f;
    }

    /* access modifiers changed from: private */
    public static final int i(int i10) {
        if (i10 == 0) {
            return e.f1131a.b();
        }
        return e.f1131a.a();
    }
}
