package io.intercom.android.sdk.m5.home.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.Action;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$NewConversationCardKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$NewConversationCardKt$lambda1$1 implements p {
    public static final ComposableSingletons$NewConversationCardKt$lambda1$1 INSTANCE = new ComposableSingletons$NewConversationCardKt$lambda1$1();

    ComposableSingletons$NewConversationCardKt$lambda1$1() {
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
            HomeCards.HomeNewConversationData homeNewConversationData = new HomeCards.HomeNewConversationData("Get in touch", HomeCardType.NEW_CONVERSATION, new Action("Send us a message", IconType.TEAMMATE, "Usual reply time is a few minutes"), false, C6565s.n(), false, false, (OpenMessengerResponse.NewConversationData.HomeCard) null);
            Avatar create = Avatar.create("", "VR");
            C6496s.g(create, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null);
            Avatar create2 = Avatar.create("", "PR");
            C6496s.g(create2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(create2, false, 2, (DefaultConstructorMarker) null);
            Avatar create3 = Avatar.create("", "SK");
            C6496s.g(create3, "create(...)");
            AvatarWrapper avatarWrapper3 = new AvatarWrapper(create3, false, 2, (DefaultConstructorMarker) null);
            Avatar create4 = Avatar.create("", "LD");
            C6496s.g(create4, "create(...)");
            NewConversationCardKt.NewConversationCard(homeNewConversationData, C6565s.q(avatarWrapper, avatarWrapper2, avatarWrapper3, new AvatarWrapper(create4, false, 2, (DefaultConstructorMarker) null)), (AvatarWrapper) null, new C6213a(), mVar, 3144, 4);
            return;
        }
        mVar.I();
    }
}
