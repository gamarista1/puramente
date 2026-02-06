package io.intercom.android.sdk.m5.helpcenter.ui;

import D.c;
import Y.C1500m;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$3$1$1 implements q {
    final /* synthetic */ CollectionsUiState $uiState;

    HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$3$1$1(CollectionsUiState collectionsUiState) {
        this.$uiState = collectionsUiState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((c) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, C1500m mVar, int i10) {
        C6496s.h(cVar, "$this$item");
        if ((i10 & 14) == 0) {
            i10 |= mVar.S(cVar) ? 4 : 2;
        }
        if ((i10 & 91) != 18 || !mVar.i()) {
            HelpCenterErrorScreenKt.HelpCenterErrorScreen(((CollectionsUiState.Error) this.$uiState).getErrorState(), c.a(cVar, i.f23074a, 0.0f, 1, (Object) null), mVar, 0, 0);
        } else {
            mVar.I();
        }
    }
}
