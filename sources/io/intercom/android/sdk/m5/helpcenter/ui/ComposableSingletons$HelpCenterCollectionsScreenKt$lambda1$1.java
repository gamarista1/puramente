package io.intercom.android.sdk.m5.helpcenter.ui;

import D.c;
import Y.C1500m;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionsScreenKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$HelpCenterCollectionsScreenKt$lambda1$1 implements q {
    public static final ComposableSingletons$HelpCenterCollectionsScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$HelpCenterCollectionsScreenKt$lambda1$1();

    ComposableSingletons$HelpCenterCollectionsScreenKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((c) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, C1500m mVar, int i10) {
        C6496s.h(cVar, "$this$item");
        if ((i10 & 81) != 16 || !mVar.i()) {
            HelpCenterLoadingScreenKt.HelpCenterLoadingScreen((i) null, mVar, 0, 1);
        } else {
            mVar.I();
        }
    }
}
