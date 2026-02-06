package io.intercom.android.sdk.m5.conversation.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$TeammateSheetContentKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$TeammateSheetContentKt$lambda1$1 implements p {
    public static final ComposableSingletons$TeammateSheetContentKt$lambda1$1 INSTANCE = new ComposableSingletons$TeammateSheetContentKt$lambda1$1();

    ComposableSingletons$TeammateSheetContentKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            List e10 = C6565s.e(new Header.Expanded.Body(Header.Expanded.Style.H1, "Body 1", (String) null));
            AvatarType avatarType = AvatarType.FACEPILE;
            Avatar build = new Avatar.Builder().withInitials("A").build();
            C6496s.g(build, "build(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(build, false);
            Avatar build2 = new Avatar.Builder().withInitials("B").build();
            C6496s.g(build2, "build(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(build2, false);
            Avatar build3 = new Avatar.Builder().withInitials("C").build();
            C6496s.g(build3, "build(...)");
            TeammateSheetContentKt.TeammateSheetContent((i) null, (String) null, new ExpandedTeamPresenceState("Title", e10, avatarType, C6565s.q(avatarWrapper, avatarWrapper2, new AvatarWrapper(build3, false)), C6565s.n(), C6565s.n(), false), mVar, 512, 3);
            return;
        }
        mVar.I();
    }
}
