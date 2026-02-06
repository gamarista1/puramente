package io.intercom.android.sdk.m5.conversation.ui.components.row;

import Y.C1500m;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$SpecialNoticeKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$SpecialNoticeKt$lambda1$1 implements p {
    public static final ComposableSingletons$SpecialNoticeKt$lambda1$1 INSTANCE = new ComposableSingletons$SpecialNoticeKt$lambda1$1();

    ComposableSingletons$SpecialNoticeKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            SpecialNoticeKt.SpecialNotice("Our response times are slower than usual. We’re working hard to get to your <a href=\"https://google.com\">message</a>", (i) null, mVar, 6, 2);
        } else {
            mVar.I();
        }
    }
}
