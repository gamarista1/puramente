package io.intercom.android.sdk.ui.common;

import androidx.compose.animation.g;
import androidx.compose.animation.i;
import kotlin.Metadata;
import w.C2763G;
import w.C2798j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "slideOffset", "Landroidx/compose/animation/i;", "floatingButtonEnterTransition", "(I)Landroidx/compose/animation/i;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TransitionsKt {
    public static final i floatingButtonEnterTransition(int i10) {
        return g.s((C2763G) null, 0.8f, 0, 5, (Object) null).c(g.B(C2798j.h(0.75f, 500.0f, (Object) null, 4, (Object) null), new a(i10)));
    }

    /* access modifiers changed from: private */
    public static final int floatingButtonEnterTransition$lambda$0(int i10, int i11) {
        return i11 + i10;
    }
}
