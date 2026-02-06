package io.intercom.android.sdk.helpcenter.search;

import M0.i;
import R.a;
import V.V;
import Y.C1500m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$HelpCenterSearchTopBarKt$lambda3$1 implements p {
    public static final ComposableSingletons$HelpCenterSearchTopBarKt$lambda3$1 INSTANCE = new ComposableSingletons$HelpCenterSearchTopBarKt$lambda3$1();

    ComposableSingletons$HelpCenterSearchTopBarKt$lambda3$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            V.b(a.a(Q.a.f5153a), i.a(R.string.intercom_navigation_back, mVar, 0), (k0.i) null, IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m699getPrimaryIcon0d7_KjU(), mVar, 0, 4);
        } else {
            mVar.I();
        }
    }
}
