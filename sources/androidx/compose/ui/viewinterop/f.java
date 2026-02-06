package androidx.compose.ui.viewinterop;

import J0.C1245k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import k0.i;
import p0.g;
import q0.C2423i;

public abstract class f {
    /* access modifiers changed from: private */
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final i e(i iVar) {
        return androidx.compose.ui.focus.i.a(androidx.compose.ui.focus.i.a(iVar.h(FocusGroupPropertiesElement.f14102b)).h(FocusTargetPropertiesElement.f14103b));
    }

    /* access modifiers changed from: private */
    public static final Rect f(g gVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C2423i o10 = gVar.o();
        if (o10 == null) {
            return null;
        }
        return new Rect((((int) o10.i()) + iArr[0]) - iArr2[0], (((int) o10.l()) + iArr[1]) - iArr2[1], (((int) o10.j()) + iArr[0]) - iArr2[0], (((int) o10.e()) + iArr[1]) - iArr2[1]);
    }

    /* access modifiers changed from: private */
    public static final View g(i.c cVar) {
        View R10 = C1245k.m(cVar.v0()).R();
        if (R10 != null) {
            return R10;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
