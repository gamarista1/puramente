package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import M0.e;
import V.V;
import Y.C1500m;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BottomBarButtonComponentKt$BottomBarIcon$2 implements p {
    final /* synthetic */ int $icon;

    BottomBarButtonComponentKt$BottomBarIcon$2(int i10) {
        this.$icon = i10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            V.a(e.c(this.$icon, mVar, 0), (String) null, q.n(i.f23074a, h.j((float) 24)), IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m686getDescriptionText0d7_KjU(), mVar, 440, 0);
            return;
        }
        mVar.I();
    }
}
