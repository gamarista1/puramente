package io.intercom.android.sdk.ui.component;

import M0.e;
import V.V;
import Y.C1500m;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PermissionDeniedDialogKt$PermissionDeniedDialog$5 implements p {
    final /* synthetic */ Integer $iconId;

    PermissionDeniedDialogKt$PermissionDeniedDialog$5(Integer num) {
        this.$iconId = num;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            Integer num = this.$iconId;
            if (num != null) {
                V.a(e.c(num.intValue(), mVar, 0), "", (i) null, IntercomTheme.INSTANCE.getColors(mVar, 6).m699getPrimaryIcon0d7_KjU(), mVar, 56, 4);
                return;
            }
            return;
        }
        mVar.I();
    }
}
