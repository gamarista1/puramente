package io.intercom.android.sdk.m5.conversation.ui.components.row;

import Y.C1500m;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$PostCardRowKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$PostCardRowKt$lambda1$1 implements p {
    public static final ComposableSingletons$PostCardRowKt$lambda1$1 INSTANCE = new ComposableSingletons$PostCardRowKt$lambda1$1();

    ComposableSingletons$PostCardRowKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            Part build = new Part.Builder().withParticipantIsAdmin(false).withBlocks(C6565s.q(BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock())).withStyle(MessageStyle.POST).build();
            build.setParticipant(Participant.create("", "Paul", Participant.USER_TYPE, "", Avatar.create("", "PK"), Boolean.FALSE));
            C6496s.g(build, "apply(...)");
            PostCardRowKt.PostCardRow((i) null, build, "SDK Test App", mVar, 448, 1);
            return;
        }
        mVar.I();
    }
}
