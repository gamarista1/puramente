package io.intercom.android.sdk.m5.home.ui.components;

import C.C1092j;
import Y.C1500m;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class NewConversationCardKt$NewConversationCard$1 implements q {
    final /* synthetic */ List<AvatarWrapper> $adminAvatars;
    final /* synthetic */ AvatarWrapper $botAvatar;
    final /* synthetic */ HomeCards.HomeNewConversationData $newConversation;
    final /* synthetic */ C6787a $onNewConversationClicked;

    NewConversationCardKt$NewConversationCard$1(HomeCards.HomeNewConversationData homeNewConversationData, C6787a aVar, List<AvatarWrapper> list, AvatarWrapper avatarWrapper) {
        this.$newConversation = homeNewConversationData;
        this.$onNewConversationClicked = aVar;
        this.$adminAvatars = list;
        this.$botAvatar = avatarWrapper;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) == 16 && mVar.i()) {
            mVar.I();
        } else if (this.$newConversation.getHomeCard() != null) {
            mVar.T(995075445);
            NewConversationCardKt.NewConversationCardV2(this.$newConversation.getHomeCard(), this.$onNewConversationClicked, mVar, 8);
            mVar.M();
        } else {
            mVar.T(995264607);
            NewConversationCardKt.NewConversationCardV1(this.$newConversation, this.$adminAvatars, this.$botAvatar, this.$onNewConversationClicked, mVar, 584, 0);
            mVar.M();
        }
    }
}
