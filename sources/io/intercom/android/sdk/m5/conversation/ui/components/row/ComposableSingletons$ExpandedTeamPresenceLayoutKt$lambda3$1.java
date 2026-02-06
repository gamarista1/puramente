package io.intercom.android.sdk.m5.conversation.ui.components.row;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda3$1 implements p {
    public static final ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda3$1 INSTANCE = new ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda3$1();

    ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda3$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            Header.Expanded.Style style = Header.Expanded.Style.PARAGRAPH;
            List q10 = C6565s.q(new Header.Expanded.Body(style, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(style, "I'm here to answer any questions you have about Intercom.", "#000000"));
            AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
            Avatar create = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "F");
            C6496s.g(create, "create(...)");
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", q10, avatarType, C6565s.e(new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null)), C6565s.e(new Header.Expanded.Footer(style, "Powered by Intercom", (String) null, new AvatarDetails(avatarType, C6565s.q(new Avatar.Builder().withImageUrl("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064").withInitials("SK"), new Avatar.Builder().withImageUrl("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064").withInitials("RH"))))), C6565s.e(new Header.Expanded.SocialAccount("twitter", "https://twitter.com/intercom", "https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "intercom")), false), (i) null, mVar, 8, 2);
            return;
        }
        mVar.I();
    }
}
