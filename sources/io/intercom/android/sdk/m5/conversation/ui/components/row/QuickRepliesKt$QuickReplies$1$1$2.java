package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1092j;
import V.T0;
import V0.p;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class QuickRepliesKt$QuickReplies$1$1$2 implements q {
    final /* synthetic */ QuickReply $it;

    QuickRepliesKt$QuickReplies$1$1$2(QuickReply quickReply) {
        this.$it = quickReply;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) != 16 || !mVar.i()) {
            i j10 = n.j(i.f23074a, h.j((float) 20), h.j((float) 12));
            String text = this.$it.getText();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            T0.b(text, j10, intercomTheme.getColors(mVar2, i11).m673getActionContrastWhite0d7_KjU(), 0, (V0.n) null, (p) null, (V0.h) null, 0, (k) null, j.h(j.f19110b.f()), 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar2, i11).getType04Point5(), mVar, 0, 0, 65016);
            return;
        }
        mVar.I();
    }
}
