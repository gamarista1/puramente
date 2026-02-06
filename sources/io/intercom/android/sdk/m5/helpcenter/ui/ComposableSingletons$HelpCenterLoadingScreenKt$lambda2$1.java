package io.intercom.android.sdk.m5.helpcenter.ui;

import Y.C1500m;
import androidx.compose.foundation.b;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import r0.g2;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterLoadingScreenKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$HelpCenterLoadingScreenKt$lambda2$1 implements p {
    public static final ComposableSingletons$HelpCenterLoadingScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$HelpCenterLoadingScreenKt$lambda2$1();

    ComposableSingletons$HelpCenterLoadingScreenKt$lambda2$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(b.d(i.f23074a, IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), mVar, 0, 0);
        } else {
            mVar.I();
        }
    }
}
