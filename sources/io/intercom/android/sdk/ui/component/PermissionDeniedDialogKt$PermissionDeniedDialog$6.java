package io.intercom.android.sdk.ui.component;

import Q0.T;
import V.T0;
import V0.h;
import V0.n;
import Y.C1500m;
import b1.j;
import b1.k;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PermissionDeniedDialogKt$PermissionDeniedDialog$6 implements p {
    final /* synthetic */ String $message;

    PermissionDeniedDialogKt$PermissionDeniedDialog$6(String str) {
        this.$message = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            T type04 = intercomTheme.getTypography(mVar2, 6).getType04();
            T0.b(this.$message, (i) null, intercomTheme.getColors(mVar2, 6).m700getPrimaryText0d7_KjU(), 0, (n) null, (V0.p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, type04, mVar, 0, 0, 65530);
            return;
        }
        mVar.I();
    }
}
