package io.intercom.android.sdk.survey.ui.questiontype.text;

import Q.b;
import S.c;
import V.V;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TextInputPillKt$TextInputPill$4 implements p {
    final /* synthetic */ boolean $showTrailingIcon;

    TextInputPillKt$TextInputPill$4(boolean z10) {
        this.$showTrailingIcon = z10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) == 2 && mVar.i()) {
            mVar.I();
        } else if (this.$showTrailingIcon) {
            V.b(c.a(b.f5154a.a()), "Looks good!", n.i(i.f23074a, h.j((float) 16)), IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m674getActive0d7_KjU(), mVar, 432, 0);
        }
    }
}
