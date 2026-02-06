package io.intercom.android.sdk.m5.conversation.ui.components.row;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.common.StringProvider;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TypingIndicatorKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$TypingIndicatorKt$lambda3$1 implements p {
    public static final ComposableSingletons$TypingIndicatorKt$lambda3$1 INSTANCE = new ComposableSingletons$TypingIndicatorKt$lambda3$1();

    ComposableSingletons$TypingIndicatorKt$lambda3$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            Avatar create = Avatar.create("", "SK");
            C6496s.g(create, "create(...)");
            TypingIndicatorKt.m327TypingIndicator6a0pyJM((i) null, new CurrentlyTypingState(new AvatarWrapper(create, true), false, (StringProvider) null, TypingIndicatorType.ADMIN, 4, (DefaultConstructorMarker) null), 0.0f, mVar, 64, 5);
            return;
        }
        mVar.I();
    }
}
