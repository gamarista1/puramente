package U8;

import android.view.View;
import android.view.Window;
import androidx.core.view.C1708p0;
import androidx.core.view.f1;
import kotlin.jvm.internal.C6496s;
import r0.C2544x0;
import r0.C2550z0;
import yf.C6798l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final View f34428a;

    /* renamed from: b  reason: collision with root package name */
    private final Window f34429b;

    /* renamed from: c  reason: collision with root package name */
    private final f1 f34430c;

    public a(View view, Window window) {
        f1 f1Var;
        C6496s.h(view, "view");
        this.f34428a = view;
        this.f34429b = window;
        if (window != null) {
            f1Var = C1708p0.a(window, view);
        } else {
            f1Var = null;
        }
        this.f34430c = f1Var;
    }

    public void b(long j10, boolean z10, C6798l lVar) {
        f1 f1Var;
        C6496s.h(lVar, "transformColorForLightContent");
        c(z10);
        Window window = this.f34429b;
        if (window != null) {
            if (z10 && ((f1Var = this.f34430c) == null || !f1Var.b())) {
                j10 = ((C2544x0) lVar.invoke(C2544x0.k(j10))).y();
            }
            window.setStatusBarColor(C2550z0.k(j10));
        }
    }

    public void c(boolean z10) {
        f1 f1Var = this.f34430c;
        if (f1Var != null) {
            f1Var.d(z10);
        }
    }
}
