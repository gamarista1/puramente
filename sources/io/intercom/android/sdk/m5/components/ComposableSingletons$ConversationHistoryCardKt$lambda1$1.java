package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import androidx.compose.foundation.layout.q;
import io.intercom.android.sdk.models.Avatar;
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
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationHistoryCardKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$ConversationHistoryCardKt$lambda1$1 implements p {
    public static final ComposableSingletons$ConversationHistoryCardKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationHistoryCardKt$lambda1$1();

    ComposableSingletons$ConversationHistoryCardKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3(Conversation conversation) {
        C6496s.h(conversation, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            i h10 = q.h(i.f23074a, 0.0f, 1, (Object) null);
            List c10 = C6565s.c();
            int i11 = 0;
            while (i11 < 2) {
                boolean z10 = i11 == 0;
                Ticket ticket = r26;
                Ticket ticket2 = new Ticket((String) null, (String) null, "Export button not working", (String) null, (String) null, (String) null, (Ticket.Status) null, (List) null, (List) null, 0, (Participant.Builder) null, (String) null, (Ticket.ConversationButton) null, (Boolean) null, 0, 32763, (DefaultConstructorMarker) null);
                LastParticipatingAdmin.Builder withAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
                C6496s.g(withAvatar, "withAvatar(...)");
                c10.add(new Conversation("123", z10, (List) null, C6565s.e(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886)), (List) null, withAvatar, (ComposerState) null, false, false, (String) null, (String) null, false, ticket, (ConversationUiFlags) null, (Header) null, (ConversationEndedButton) null, (FooterNotice) null, (PoweredBy) null, (String) null, (String) null, 1044436, (DefaultConstructorMarker) null));
                i11++;
            }
            int i12 = 0;
            for (int i13 = 2; i12 < i13; i13 = 2) {
                boolean z11 = i12 == 0;
                LastParticipatingAdmin.Builder withAvatar2 = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
                C6496s.g(withAvatar2, "withAvatar(...)");
                Conversation conversation = r12;
                Conversation conversation2 = new Conversation("123", z11, (List) null, C6565s.e(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886)), (List) null, withAvatar2, (ComposerState) null, false, false, (String) null, (String) null, false, (Ticket) null, (ConversationUiFlags) null, (Header) null, (ConversationEndedButton) null, (FooterNotice) null, (PoweredBy) null, (String) null, (String) null, 1048532, (DefaultConstructorMarker) null);
                c10.add(conversation);
                i12++;
            }
            C6514M m10 = C6514M.f71813a;
            ConversationHistoryCardKt.ConversationHistoryCard(h10, "Your recent conversations", C6565s.a(c10), new C6043p(), mVar, 3638, 0);
            return;
        }
        mVar.I();
    }
}
