package M0;

import Y.C1500m;
import Y.C1506p;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public abstract class h {
    public static final Resources a(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1554054999, i10, -1, "androidx.compose.ui.res.resources (Resources.android.kt:33)");
        }
        mVar.m(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) mVar.m(AndroidCompositionLocals_androidKt.g())).getResources();
        if (C1506p.H()) {
            C1506p.P();
        }
        return resources;
    }
}
