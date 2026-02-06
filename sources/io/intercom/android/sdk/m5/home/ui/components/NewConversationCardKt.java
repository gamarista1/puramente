package io.intercom.android.sdk.m5.home.ui.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.q;
import c1.h;
import g0.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6521e;
import yf.C6787a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\f\u0010\n\u001a%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u000f\u0010\u0015\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeNewConversationData;", "newConversation", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "adminAvatars", "botAvatar", "Lkotlin/Function0;", "Llf/M;", "onNewConversationClicked", "NewConversationCard", "(Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeNewConversationData;Ljava/util/List;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;Lyf/a;LY/m;II)V", "newConversationData", "NewConversationCardV1", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;", "homeCard", "NewConversationCardV2", "(Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;Lyf/a;LY/m;I)V", "NewConversationCardTeammatePreview", "(LY/m;I)V", "NewConversationCardBotPreview", "NewConversationCardFinWithHumanAccessPreview", "NewConversationCardFinWithoutHumanAccessPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NewConversationCardKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                io.intercom.android.sdk.m5.home.data.IconType[] r0 = io.intercom.android.sdk.m5.home.data.IconType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                io.intercom.android.sdk.m5.home.data.IconType r2 = io.intercom.android.sdk.m5.home.data.IconType.TEAMMATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.m5.home.data.IconType r2 = io.intercom.android.sdk.m5.home.data.IconType.BOT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.m5.home.data.IconType r2 = io.intercom.android.sdk.m5.home.data.IconType.FIN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                io.intercom.android.sdk.models.OpenMessengerResponse$IconType[] r0 = io.intercom.android.sdk.models.OpenMessengerResponse.IconType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.models.OpenMessengerResponse$IconType r2 = io.intercom.android.sdk.models.OpenMessengerResponse.IconType.PAPER_PLANE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.WhenMappings.<clinit>():void");
        }
    }

    public static final void NewConversationCard(HomeCards.HomeNewConversationData homeNewConversationData, List<AvatarWrapper> list, AvatarWrapper avatarWrapper, C6787a aVar, C1500m mVar, int i10, int i11) {
        C6496s.h(homeNewConversationData, "newConversation");
        C6496s.h(list, "adminAvatars");
        C6496s.h(aVar, "onNewConversationClicked");
        C1500m h10 = mVar.h(-773584515);
        if ((i11 & 4) != 0) {
            avatarWrapper = null;
        }
        IntercomCardKt.IntercomCard((i) null, (IntercomCardStyle.Style) null, c.e(-1464624655, true, new NewConversationCardKt$NewConversationCard$1(homeNewConversationData, aVar, list, avatarWrapper), h10, 54), h10, 384, 3);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new o(homeNewConversationData, list, avatarWrapper, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NewConversationCard$lambda$0(HomeCards.HomeNewConversationData homeNewConversationData, List list, AvatarWrapper avatarWrapper, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(homeNewConversationData, "$newConversation");
        C6496s.h(list, "$adminAvatars");
        C6496s.h(aVar, "$onNewConversationClicked");
        NewConversationCard(homeNewConversationData, list, avatarWrapper, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void NewConversationCardBotPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-322151692);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$NewConversationCardKt.INSTANCE.m376getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new l(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NewConversationCardBotPreview$lambda$4(int i10, C1500m mVar, int i11) {
        NewConversationCardBotPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void NewConversationCardFinWithHumanAccessPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1635839473);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$NewConversationCardKt.INSTANCE.m377getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new k(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NewConversationCardFinWithHumanAccessPreview$lambda$5(int i10, C1500m mVar, int i11) {
        NewConversationCardFinWithHumanAccessPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void NewConversationCardFinWithoutHumanAccessPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1289284327);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$NewConversationCardKt.INSTANCE.m378getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new m(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NewConversationCardFinWithoutHumanAccessPreview$lambda$6(int i10, C1500m mVar, int i11) {
        NewConversationCardFinWithoutHumanAccessPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void NewConversationCardTeammatePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(605107279);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$NewConversationCardKt.INSTANCE.m375getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new q(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NewConversationCardTeammatePreview$lambda$3(int i10, C1500m mVar, int i11) {
        NewConversationCardTeammatePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    @C6521e
    public static final void NewConversationCardV1(HomeCards.HomeNewConversationData homeNewConversationData, List<AvatarWrapper> list, AvatarWrapper avatarWrapper, C6787a aVar, C1500m mVar, int i10, int i11) {
        AvatarWrapper avatarWrapper2;
        int i12;
        C1500m h10 = mVar.h(-1141879848);
        Integer num = null;
        if ((i11 & 4) != 0) {
            avatarWrapper2 = null;
        } else {
            avatarWrapper2 = avatarWrapper;
        }
        i iVar = i.f23074a;
        i b10 = q.b(iVar, 0.0f, h.j((float) 64), 1, (Object) null);
        IconType icon = homeNewConversationData.getAction().getIcon();
        int i13 = -1;
        if (icon == null) {
            i12 = -1;
        } else {
            i12 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
        }
        if (i12 == 1) {
            num = Integer.valueOf(R.drawable.intercom_send_message_icon);
        } else if (i12 == 2) {
            num = Integer.valueOf(R.drawable.intercom_conversation_card_question);
        } else if (i12 == 3) {
            num = Integer.valueOf(R.drawable.intercom_chevron);
        }
        IconType icon2 = homeNewConversationData.getAction().getIcon();
        if (icon2 != null) {
            i13 = WhenMappings.$EnumSwitchMapping$0[icon2.ordinal()];
        }
        if (i13 == 1) {
            iVar = q.n(iVar, h.j((float) 16));
        }
        String label = homeNewConversationData.getAction().getLabel();
        String subtitle = homeNewConversationData.getAction().getSubtitle();
        HomeItemKt.HomeItem(b10, num, c.e(1023934521, true, new NewConversationCardKt$NewConversationCardV1$1(homeNewConversationData, avatarWrapper2, list), h10, 54), iVar, (Integer) null, label, subtitle, (HomeItemBadge) null, aVar, h10, ((i10 << 15) & 234881024) | 390, 144);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new n(homeNewConversationData, list, avatarWrapper2, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NewConversationCardV1$lambda$1(HomeCards.HomeNewConversationData homeNewConversationData, List list, AvatarWrapper avatarWrapper, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(homeNewConversationData, "$newConversationData");
        C6496s.h(list, "$adminAvatars");
        C6496s.h(aVar, "$onNewConversationClicked");
        NewConversationCardV1(homeNewConversationData, list, avatarWrapper, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void NewConversationCardV2(OpenMessengerResponse.NewConversationData.HomeCard homeCard, C6787a aVar, C1500m mVar, int i10) {
        Integer num;
        int i11;
        OpenMessengerResponse.NewConversationData.HomeCard homeCard2 = homeCard;
        int i12 = i10;
        C1500m h10 = mVar.h(341363796);
        i iVar = i.f23074a;
        i b10 = q.b(iVar, 0.0f, h.j((float) 64), 1, (Object) null);
        OpenMessengerResponse.IconType icon = homeCard.getIcon();
        if (icon != null) {
            num = icon.getIcon();
        } else {
            num = null;
        }
        OpenMessengerResponse.IconType icon2 = homeCard.getIcon();
        if (icon2 == null) {
            i11 = -1;
        } else {
            i11 = WhenMappings.$EnumSwitchMapping$1[icon2.ordinal()];
        }
        if (i11 == 1) {
            iVar = q.n(iVar, h.j((float) 16));
        }
        String text = homeCard.getText();
        String subtitle = homeCard.getSubtitle();
        HomeItemKt.HomeItem(b10, num, c.e(94824693, true, new NewConversationCardKt$NewConversationCardV2$1(homeCard), h10, 54), iVar, (Integer) null, text, subtitle, (HomeItemBadge) null, aVar, h10, ((i12 << 21) & 234881024) | 390, 144);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new p(homeCard, aVar, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NewConversationCardV2$lambda$2(OpenMessengerResponse.NewConversationData.HomeCard homeCard, C6787a aVar, int i10, C1500m mVar, int i11) {
        C6496s.h(homeCard, "$homeCard");
        C6496s.h(aVar, "$onNewConversationClicked");
        NewConversationCardV2(homeCard, aVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
