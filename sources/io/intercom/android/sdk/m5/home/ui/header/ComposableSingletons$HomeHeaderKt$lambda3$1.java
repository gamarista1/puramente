package io.intercom.android.sdk.m5.home.ui.header;

import Y.C1500m;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$HomeHeaderKt$lambda3$1 implements p {
    public static final ComposableSingletons$HomeHeaderKt$lambda3$1 INSTANCE = new ComposableSingletons$HomeHeaderKt$lambda3$1();

    ComposableSingletons$HomeHeaderKt$lambda3$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            HomeHeaderKt.HomeErrorHeader((i) null, new HomeUiState.Error.ErrorHeader("#FFFFFF", "#000000"), new e(), mVar, 384, 1);
        } else {
            mVar.I();
        }
    }
}
