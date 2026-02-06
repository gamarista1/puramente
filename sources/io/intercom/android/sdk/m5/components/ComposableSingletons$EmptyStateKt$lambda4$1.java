package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import io.intercom.android.sdk.ui.R;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$EmptyStateKt$lambda-4$1  reason: invalid class name */
final class ComposableSingletons$EmptyStateKt$lambda4$1 implements p {
    public static final ComposableSingletons$EmptyStateKt$lambda4$1 INSTANCE = new ComposableSingletons$EmptyStateKt$lambda4$1();

    ComposableSingletons$EmptyStateKt$lambda4$1() {
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
            IntercomPrimaryButtonKt.IntercomPrimaryButton("Send us a message", (i) null, Integer.valueOf(R.drawable.intercom_send), new C6056w(), mVar, 3078, 2);
        } else {
            mVar.I();
        }
    }
}
