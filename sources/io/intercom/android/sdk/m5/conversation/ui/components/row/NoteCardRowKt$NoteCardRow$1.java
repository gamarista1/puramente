package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1092j;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class NoteCardRowKt$NoteCardRow$1 implements q {
    final /* synthetic */ String $companyName;
    final /* synthetic */ Part $part;

    NoteCardRowKt$NoteCardRow$1(Part part, String str) {
        this.$part = part;
        this.$companyName = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) != 16 || !mVar.i()) {
            List<Block> blocks = this.$part.getBlocks();
            C6496s.g(blocks, "getBlocks(...)");
            String forename = this.$part.getParticipant().getForename();
            C6496s.g(forename, "getForename(...)");
            String str = this.$companyName;
            Avatar avatar = this.$part.getParticipant().getAvatar();
            C6496s.g(avatar, "getAvatar(...)");
            Boolean isBot = this.$part.getParticipant().isBot();
            C6496s.g(isBot, "isBot(...)");
            PostCardRowKt.m326PostContentFHprtrg(blocks, forename, str, new AvatarWrapper(avatar, isBot.booleanValue()), ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m672getAction0d7_KjU()), n.i(androidx.compose.foundation.layout.q.h(i.f23074a, 0.0f, 1, (Object) null), h.j((float) 16)), mVar, 200712, 0);
            return;
        }
        mVar.I();
    }
}
