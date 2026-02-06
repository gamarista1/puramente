package io.intercom.android.sdk.m5.inbox.ui;

import D.c;
import Y.C1500m;
import io.intercom.android.sdk.m5.components.ErrorState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InboxScreenKt$InboxScreen$5$1$2$1 implements q {
    final /* synthetic */ ErrorState $errorState;

    InboxScreenKt$InboxScreen$5$1$2$1(ErrorState errorState) {
        this.$errorState = errorState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((c) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, C1500m mVar, int i10) {
        C6496s.h(cVar, "$this$item");
        if ((i10 & 81) != 16 || !mVar.i()) {
            InboxScreenKt.InboxErrorRow(this.$errorState, mVar, 0);
        } else {
            mVar.I();
        }
    }
}
