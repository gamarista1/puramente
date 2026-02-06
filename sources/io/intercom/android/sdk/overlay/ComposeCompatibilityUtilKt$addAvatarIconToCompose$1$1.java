package io.intercom.android.sdk.overlay;

import Y.C1500m;
import g0.c;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import r0.g2;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ComposeCompatibilityUtilKt$addAvatarIconToCompose$1$1 implements p {
    final /* synthetic */ AppConfig $appConfig;
    final /* synthetic */ Participant $lastAdmin;

    ComposeCompatibilityUtilKt$addAvatarIconToCompose$1$1(AppConfig appConfig, Participant participant) {
        this.$appConfig = appConfig;
        this.$lastAdmin = participant;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            AppConfig appConfig = this.$appConfig;
            final Participant participant = this.$lastAdmin;
            ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, c.e(2111948784, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        Avatar avatar = participant.getAvatar();
                        C6496s.g(avatar, "getAvatar(...)");
                        Boolean isBot = participant.isBot();
                        C6496s.g(isBot, "isBot(...)");
                        AvatarIconKt.m208AvatarIconRd90Nhg((i) null, new AvatarWrapper(avatar, isBot.booleanValue()), (g2) null, false, 0, (C2544x0) null, mVar, 64, 61);
                        return;
                    }
                    mVar.I();
                }
            }, mVar, 54), mVar, 56);
            return;
        }
        mVar.I();
    }
}
