package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import Y.C1500m;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$BottomBarButtonComponentKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$BottomBarButtonComponentKt$lambda1$1 implements p {
    public static final ComposableSingletons$BottomBarButtonComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$BottomBarButtonComponentKt$lambda1$1();

    ComposableSingletons$BottomBarButtonComponentKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            BottomBarButtonComponentKt.BottomBarButtonComponent((i) null, C6565s.q(BottomBarUiState.BottomBarButton.GifInsert.INSTANCE, BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE), false, (C6787a) null, (C6787a) null, mVar, 48, 29);
            return;
        }
        mVar.I();
    }
}
