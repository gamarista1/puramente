package W;

import Y.C1500m;
import Y.C1506p;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public abstract class w {
    public static final String a(int i10, C1500m mVar, int i11) {
        if (C1506p.H()) {
            C1506p.Q(-907677715, i11, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        mVar.m(AndroidCompositionLocals_androidKt.f());
        String string = ((Context) mVar.m(AndroidCompositionLocals_androidKt.g())).getResources().getString(i10);
        if (C1506p.H()) {
            C1506p.P();
        }
        return string;
    }
}
