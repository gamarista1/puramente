package io.intercom.android.sdk.m5.home.ui.components;

import Y.C1500m;
import c1.h;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import java.util.ArrayList;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class NewConversationCardKt$NewConversationCardV2$1 implements p {
    final /* synthetic */ OpenMessengerResponse.NewConversationData.HomeCard $homeCard;

    NewConversationCardKt$NewConversationCardV2$1(OpenMessengerResponse.NewConversationData.HomeCard homeCard) {
        this.$homeCard = homeCard;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            AvatarDetails avatarDetails = this.$homeCard.getAvatarDetails();
            if ((avatarDetails != null ? avatarDetails.getAvatarType() : null) == AvatarType.FACEPILE) {
                Avatar build = this.$homeCard.getAvatarDetails().getAvatars().get(0).build();
                C6496s.g(build, "build(...)");
                Iterable<Avatar.Builder> g02 = C6565s.g0(this.$homeCard.getAvatarDetails().getAvatars(), 1);
                ArrayList arrayList = new ArrayList(C6565s.y(g02, 10));
                for (Avatar.Builder build2 : g02) {
                    arrayList.add(build2.build());
                }
                BotAndHumansFacePileKt.m138BotAndHumansFacePilehGBTI10((i) null, build, BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), h.j((float) 36), (String) null, mVar, 3648, 17);
                return;
            }
            return;
        }
        mVar.I();
    }
}
