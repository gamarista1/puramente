package x;

import Y.C1500m;
import Y.C1506p;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: x.n  reason: case insensitive filesystem */
public abstract class C2875n {
    public static final boolean a(C1500m mVar, int i10) {
        boolean z10;
        if (C1506p.H()) {
            C1506p.Q(-882615028, i10, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        if ((((Configuration) mVar.m(AndroidCompositionLocals_androidKt.f())).uiMode & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (C1506p.H()) {
            C1506p.P();
        }
        return z10;
    }
}
