package io.intercom.android.sdk.m5.components;

import M0.e;
import M0.i;
import V.V;
import Y.C1500m;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TopActionBarKt$TopActionBar$2$2$1 implements p {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Integer $navIcon;

    TopActionBarKt$TopActionBar$2$2$1(Integer num, long j10) {
        this.$navIcon = num;
        this.$contentColor = j10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            V.a(e.c(this.$navIcon.intValue(), mVar, 0), i.a(R.string.intercom_navigation_back, mVar, 0), q.n(k0.i.f23074a, h.j((float) 24)), this.$contentColor, mVar, 392, 0);
            return;
        }
        mVar.I();
    }
}
