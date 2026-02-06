package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.FinStreamingData;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.models.ComposerState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationEndedButton;
import io.intercom.android.sdk.models.ConversationUiFlags;
import io.intercom.android.sdk.models.FooterNotice;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.models.Ticket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/MarkUserContentAsSeenByAdmin;", "", "<init>", "()V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "Llf/M;", "invoke", "(LXg/x;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MarkUserContentAsSeenByAdmin {
    public static final int $stable = 0;

    public final void invoke(x xVar) {
        Object value;
        ConversationClientState conversationClientState;
        Conversation conversation;
        x xVar2 = xVar;
        C6496s.h(xVar2, "clientStateFlow");
        do {
            value = xVar.getValue();
            conversationClientState = (ConversationClientState) value;
            Conversation conversation2 = conversationClientState.getConversation();
            if (conversation2 != null) {
                Iterable e12 = C6565s.e1(conversationClientState.getConversation().getPartBuilderList());
                ArrayList arrayList = new ArrayList(C6565s.y(e12, 10));
                int i10 = 0;
                for (Object next : e12) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        C6565s.x();
                    }
                    Part.Builder builder = (Part.Builder) next;
                    Part build = builder.build();
                    if (!build.isAdmin()) {
                        if (i10 == C6565s.p(conversationClientState.getConversation().parts())) {
                            builder = builder.withSeenByAdmin(SeenState.SEEN);
                        } else if (!C6496s.c(build.getSeenByAdmin(), SeenState.HIDE)) {
                            builder = builder.withSeenByAdmin(SeenState.HIDE);
                        }
                    }
                    arrayList.add(builder);
                    i10 = i11;
                }
                conversation = Conversation.copy$default(conversation2, (String) null, false, (List) null, arrayList, (List) null, (LastParticipatingAdmin.Builder) null, (ComposerState) null, false, false, (String) null, (String) null, false, (Ticket) null, (ConversationUiFlags) null, (Header) null, (ConversationEndedButton) null, (FooterNotice) null, (PoweredBy) null, (String) null, (String) null, 1048567, (Object) null);
            } else {
                conversation = null;
            }
        } while (!xVar2.e(value, ConversationClientState.copy$default(conversationClientState, (Map) null, conversation, (String) null, (CurrentlyTypingState) null, (io.intercom.android.sdk.m5.conversation.states.ComposerState) null, (BottomSheetState) null, (LaunchMode) null, (NetworkResponse) null, (ArticleMetadata) null, (NetworkState) null, (List) null, (List) null, (FinStreamingData) null, (OpenMessengerResponse) null, 0, 0, (FloatingIndicatorState) null, (String) null, false, false, 1048573, (Object) null)));
    }
}
