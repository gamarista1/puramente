package io.intercom.android.sdk.m5.notification;

import Y.C1500m;
import io.intercom.android.sdk.models.ComposerState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationEndedButton;
import io.intercom.android.sdk.models.ConversationUiFlags;
import io.intercom.android.sdk.models.FooterNotice;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.notification.ComposableSingletons$InAppNotificationCardKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$InAppNotificationCardKt$lambda1$1 implements p {
    public static final ComposableSingletons$InAppNotificationCardKt$lambda1$1 INSTANCE = new ComposableSingletons$InAppNotificationCardKt$lambda1$1();

    ComposableSingletons$InAppNotificationCardKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            InAppNotificationCardKt.InAppNotificationCard(new Conversation((String) null, false, C6565s.e(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), C6565s.e(new Part.Builder().withSummary("Hello There")), (List) null, (LastParticipatingAdmin.Builder) null, (ComposerState) null, false, false, (String) null, (String) null, false, (Ticket) null, (ConversationUiFlags) null, (Header) null, (ConversationEndedButton) null, (FooterNotice) null, (PoweredBy) null, (String) null, (String) null, 1048563, (DefaultConstructorMarker) null), (i) null, mVar, 8, 2);
        } else {
            mVar.I();
        }
    }
}
