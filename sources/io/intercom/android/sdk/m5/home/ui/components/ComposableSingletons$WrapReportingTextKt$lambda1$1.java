package io.intercom.android.sdk.m5.home.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import r0.C2544x0;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$WrapReportingTextKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$WrapReportingTextKt$lambda1$1 implements p {
    public static final ComposableSingletons$WrapReportingTextKt$lambda1$1 INSTANCE = new ComposableSingletons$WrapReportingTextKt$lambda1$1();

    ComposableSingletons$WrapReportingTextKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            WrapReportingTextKt.m381WrapReportingTextT042LqI((i) null, "Hello there", C2544x0.f25560b.j(), IntercomTheme.INSTANCE.getTypography(mVar, IntercomTheme.$stable).getType01(), (C6798l) null, mVar, 432, 17);
        } else {
            mVar.I();
        }
    }
}
