package io.intercom.android.sdk.m5.home.ui.header;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import x.C2874m;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$HomeHeaderKt$lambda1$1 implements p {
    public static final ComposableSingletons$HomeHeaderKt$lambda1$1 INSTANCE = new ComposableSingletons$HomeHeaderKt$lambda1$1();

    ComposableSingletons$HomeHeaderKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            Avatar create = Avatar.create("", "SK");
            C6496s.g(create, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null);
            Avatar create2 = Avatar.create("", "RS");
            C6496s.g(create2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(create2, false, 2, (DefaultConstructorMarker) null);
            Avatar create3 = Avatar.create("", "VR");
            C6496s.g(create3, "create(...)");
            HomeHeaderKt.HomeContentHeader((i) null, new HomeUiState.Content.ContentHeader(true, "", new HomeUiState.Content.ContentHeader.ColoredText("I am greeting.", C2874m.a(mVar2, 0) ? "#FFFFFF" : "#000000", 0.5f), new HomeUiState.Content.ContentHeader.ColoredText("I am intro.", C2874m.a(mVar2, 0) ? "#FFFFFF" : "#000000", 1.0f), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m678getBackground0d7_KjU(), false, (DefaultConstructorMarker) null), true, C6565s.q(avatarWrapper, avatarWrapper2, new AvatarWrapper(create3, false, 2, (DefaultConstructorMarker) null)), new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", "#FFFFFF", 0.5f)), mVar2, 64, 1);
            return;
        }
        mVar.I();
    }
}
