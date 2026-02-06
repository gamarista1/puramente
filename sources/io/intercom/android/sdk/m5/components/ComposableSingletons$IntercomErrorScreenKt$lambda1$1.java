package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.ErrorState;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$IntercomErrorScreenKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$IntercomErrorScreenKt$lambda1$1 implements p {
    public static final ComposableSingletons$IntercomErrorScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$IntercomErrorScreenKt$lambda1$1();

    ComposableSingletons$IntercomErrorScreenKt$lambda1$1() {
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
            IntercomErrorScreenKt.IntercomErrorScreen(new ErrorState.WithCTA(0, 0, (Integer) null, 0, new C6062z(), 15, (DefaultConstructorMarker) null), (i) null, mVar, 0, 2);
        } else {
            mVar.I();
        }
    }
}
