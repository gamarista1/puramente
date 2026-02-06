package io.intercom.android.sdk.ui.component;

import M0.e;
import V.V;
import Y.C1500m;
import androidx.compose.foundation.layout.q;
import c1.h;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomTopBarKt$IntercomTopBar$2$2$2 implements p {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ IntercomTopBarIcon $navIcon;

    IntercomTopBarKt$IntercomTopBar$2$2$2(IntercomTopBarIcon intercomTopBarIcon, long j10) {
        this.$navIcon = intercomTopBarIcon;
        this.$contentColor = j10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            V.a(e.c(this.$navIcon.getIconRes(), mVar, 0), this.$navIcon.getContentDescription(), q.n(i.f23074a, h.j((float) 24)), this.$contentColor, mVar, 392, 0);
        } else {
            mVar.I();
        }
    }
}
