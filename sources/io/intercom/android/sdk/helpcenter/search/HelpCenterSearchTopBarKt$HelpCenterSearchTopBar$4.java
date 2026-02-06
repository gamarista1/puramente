package io.intercom.android.sdk.helpcenter.search;

import B.l;
import V.S;
import V.U;
import Y.C1500m;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4 implements p {
    final /* synthetic */ C6787a $onBackClick;

    HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4(C6787a aVar) {
        this.$onBackClick = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            U.b(this.$onBackClick, (i) null, false, (S) null, (l) null, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m135getLambda3$intercom_sdk_base_release(), mVar, 196608, 30);
        } else {
            mVar.I();
        }
    }
}
