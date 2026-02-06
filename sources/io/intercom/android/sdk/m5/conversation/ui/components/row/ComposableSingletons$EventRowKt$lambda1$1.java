package io.intercom.android.sdk.m5.conversation.ui.components.row;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$EventRowKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$EventRowKt$lambda1$1 implements p {
    public static final ComposableSingletons$EventRowKt$lambda1$1 INSTANCE = new ComposableSingletons$EventRowKt$lambda1$1();

    ComposableSingletons$EventRowKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            Avatar build = new Avatar.Builder().withInitials("AA").build();
            C6496s.g(build, "build(...)");
            EventRowKt.EventRow((i) null, "Participant added to conversation", new AvatarWrapper(build, false, 2, (DefaultConstructorMarker) null), mVar, 560, 1);
            return;
        }
        mVar.I();
    }
}
