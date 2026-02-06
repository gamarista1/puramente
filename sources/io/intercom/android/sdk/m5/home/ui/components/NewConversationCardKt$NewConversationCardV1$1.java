package io.intercom.android.sdk.m5.home.ui.components;

import Y.C1500m;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import java.util.ArrayList;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import r0.g2;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class NewConversationCardKt$NewConversationCardV1$1 implements p {
    final /* synthetic */ List<AvatarWrapper> $adminAvatars;
    final /* synthetic */ AvatarWrapper $botAvatar;
    final /* synthetic */ HomeCards.HomeNewConversationData $newConversationData;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.m5.home.data.IconType[] r0 = io.intercom.android.sdk.m5.home.data.IconType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.m5.home.data.IconType r1 = io.intercom.android.sdk.m5.home.data.IconType.FIN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.m5.home.data.IconType r1 = io.intercom.android.sdk.m5.home.data.IconType.FACE_PILE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$NewConversationCardV1$1.WhenMappings.<clinit>():void");
        }
    }

    NewConversationCardKt$NewConversationCardV1$1(HomeCards.HomeNewConversationData homeNewConversationData, AvatarWrapper avatarWrapper, List<AvatarWrapper> list) {
        this.$newConversationData = homeNewConversationData;
        this.$botAvatar = avatarWrapper;
        this.$adminAvatars = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            IconType icon = this.$newConversationData.getAction().getIcon();
            int i11 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            if (i11 == 1) {
                mVar.T(1718791131);
                if (this.$botAvatar != null) {
                    AvatarIconKt.m208AvatarIconRd90Nhg(q.n(i.f23074a, h.j((float) 32)), this.$botAvatar, (g2) null, false, 0, (C2544x0) null, mVar, 70, 60);
                }
                mVar.M();
            } else if (i11 != 2) {
                mVar.T(-83081034);
                mVar.M();
            } else {
                mVar.T(1719018020);
                if (this.$botAvatar != null) {
                    Iterable<AvatarWrapper> iterable = this.$adminAvatars;
                    ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
                    for (AvatarWrapper avatar : iterable) {
                        arrayList.add(avatar.getAvatar());
                    }
                    BotAndHumansFacePileKt.m138BotAndHumansFacePilehGBTI10((i) null, this.$botAvatar.getAvatar(), BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), h.j((float) 36), (String) null, mVar, 3648, 17);
                }
                mVar.M();
            }
        } else {
            mVar.I();
        }
    }
}
