package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import io.intercom.android.sdk.R;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$EmptyStateKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$EmptyStateKt$lambda2$1 implements p {
    public static final ComposableSingletons$EmptyStateKt$lambda2$1 INSTANCE = new ComposableSingletons$EmptyStateKt$lambda2$1();

    ComposableSingletons$EmptyStateKt$lambda2$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            EmptyStateKt.EmptyState("No messages", (i) null, "Messages from the team, queries and support tickets will be visible here", Integer.valueOf(R.drawable.intercom_messages_icon), ComposableSingletons$EmptyStateKt.INSTANCE.m156getLambda1$intercom_sdk_base_release(), mVar, 24966, 2);
        } else {
            mVar.I();
        }
    }
}
