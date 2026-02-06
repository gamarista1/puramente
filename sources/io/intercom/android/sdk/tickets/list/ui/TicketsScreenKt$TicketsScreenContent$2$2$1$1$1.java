package io.intercom.android.sdk.tickets.list.ui;

import C.Y;
import M0.i;
import V.T0;
import V0.h;
import V0.n;
import V0.p;
import Y.C1500m;
import b1.j;
import b1.k;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketsScreenKt$TicketsScreenContent$2$2$1$1$1 implements q {
    final /* synthetic */ ErrorState $errorState;

    TicketsScreenKt$TicketsScreenContent$2$2$1$1$1(ErrorState errorState) {
        this.$errorState = errorState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(y10, "$this$TextButton");
        if ((i10 & 81) != 16 || !mVar.i()) {
            T0.b(i.a(((ErrorState.WithCTA) this.$errorState).getCtaResId(), mVar2, 0), (k0.i) null, 0, 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType04(), mVar, 0, 0, 65534);
        } else {
            mVar.I();
        }
    }
}
