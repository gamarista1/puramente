package io.intercom.android.sdk.ui.component;

import B.l;
import C.N;
import C.Y;
import Q0.T;
import V.C1387j;
import V.C1391l;
import V.C1393m;
import V.T0;
import V0.h;
import V0.n;
import Y.C1500m;
import b1.j;
import b1.k;
import g0.c;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PermissionDeniedDialogKt$PermissionDeniedDialog$4 implements p {
    final /* synthetic */ String $dismissText;
    final /* synthetic */ C6787a $onDismiss;

    PermissionDeniedDialogKt$PermissionDeniedDialog$4(C6787a aVar, String str) {
        this.$onDismiss = aVar;
        this.$dismissText = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            C6787a aVar = this.$onDismiss;
            final String str = this.$dismissText;
            C1393m.c(aVar, (i) null, false, (g2) null, (C1387j) null, (C1391l) null, (C2868g) null, (N) null, (l) null, c.e(-1570315255, true, new q() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(Y y10, C1500m mVar, int i10) {
                    C1500m mVar2 = mVar;
                    C6496s.h(y10, "$this$TextButton");
                    if ((i10 & 81) != 16 || !mVar.i()) {
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        T type04SemiBold = intercomTheme.getTypography(mVar2, 6).getType04SemiBold();
                        T0.b(str, (i) null, intercomTheme.getColors(mVar2, 6).m673getActionContrastWhite0d7_KjU(), 0, (n) null, (V0.p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, type04SemiBold, mVar, 0, 0, 65530);
                        return;
                    }
                    mVar.I();
                }
            }, mVar, 54), mVar, 805306368, 510);
            return;
        }
        mVar.I();
    }
}
