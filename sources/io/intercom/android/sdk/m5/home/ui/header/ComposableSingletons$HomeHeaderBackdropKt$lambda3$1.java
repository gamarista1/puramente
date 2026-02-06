package io.intercom.android.sdk.m5.home.ui.header;

import Y.C1500m;
import c1.h;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.utilities.ColorUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2550z0;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$HomeHeaderBackdropKt$lambda3$1 implements p {
    public static final ComposableSingletons$HomeHeaderBackdropKt$lambda3$1 INSTANCE = new ComposableSingletons$HomeHeaderBackdropKt$lambda3$1();

    ComposableSingletons$HomeHeaderBackdropKt$lambda3$1() {
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
            HomeHeaderBackdropKt.m390HomeHeaderBackdroporJrPs(h.j((float) 200), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(C2550z0.b(ColorUtils.parseColor("#326D7D")), true, (DefaultConstructorMarker) null), new c(), mVar, 390);
        } else {
            mVar.I();
        }
    }
}
