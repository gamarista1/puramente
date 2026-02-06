package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.models.BotIntro;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001H\u0002¨\u0006\f"}, d2 = {"reduceIntroParts", "", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "clientState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "botIntro", "Lio/intercom/android/sdk/models/BotIntro;", "timeProvider", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "reduceBotIntroParts", "introParts", "Lio/intercom/android/sdk/models/Part;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntroPartsReducerKt {
    private static final List<ContentRow> reduceBotIntroParts(ConversationClientState conversationClientState, List<? extends Part> list) {
        boolean z10;
        List<? extends Part> list2 = list;
        List c10 = C6565s.c();
        boolean isEmpty = conversationClientState.getPendingMessages().isEmpty();
        Iterable iterable = list2;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            Part part = (Part) next;
            if (i10 != C6565s.p(list) || !isEmpty) {
                z10 = false;
            } else {
                z10 = true;
            }
            arrayList.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(part, z10, true, (List) null, (List) null, 24, (DefaultConstructorMarker) null), ConversationPartsReducerKt.getGroupingPosition(list2, i10), (PendingMessage.FailedImageUploadData) null, false, false, 16, (DefaultConstructorMarker) null));
            i10 = i11;
        }
        c10.addAll(arrayList);
        return C6565s.a(c10);
    }

    public static final List<ContentRow> reduceIntroParts(ConversationClientState conversationClientState, BotIntro botIntro, TimeProvider timeProvider) {
        OpenMessengerResponse.NewConversationData newConversationData;
        Collection collection;
        Iterable parts;
        Object obj;
        Participant participant;
        C6496s.h(conversationClientState, "clientState");
        C6496s.h(botIntro, "botIntro");
        C6496s.h(timeProvider, "timeProvider");
        Iterable<List> blocks = botIntro.getBlocks();
        Collection arrayList = new ArrayList(C6565s.y(blocks, 10));
        for (List withBlocks : blocks) {
            Part build = new Part.Builder().withBlocks(withBlocks).withParticipantIsAdmin(true).withCreatedAt(timeProvider.currentTimeMillis()).build();
            build.setParticipant(botIntro.getBuiltParticipant());
            arrayList.add(build);
        }
        OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
        if (openMessengerResponse != null) {
            newConversationData = openMessengerResponse.getNewConversationData();
        } else {
            newConversationData = null;
        }
        if (newConversationData == null || (parts = newConversationData.getParts()) == null) {
            collection = C6565s.n();
        } else {
            Iterable<Part.Builder> iterable = parts;
            collection = new ArrayList(C6565s.y(iterable, 10));
            for (Part.Builder build2 : iterable) {
                Part build3 = build2.build();
                Iterator it = newConversationData.getParticipants().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C6496s.c(((Participant.Builder) obj).build().getId(), build3.getParticipantId())) {
                        break;
                    }
                }
                Participant.Builder builder = (Participant.Builder) obj;
                if (builder != null) {
                    participant = builder.build();
                } else {
                    participant = null;
                }
                if (participant != null) {
                    build3.setParticipant(participant);
                }
                collection.add(build3);
            }
        }
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            arrayList = collection2;
        }
        List list = (List) arrayList;
        if (!list.isEmpty()) {
            return reduceBotIntroParts(conversationClientState, list);
        }
        return C6565s.n();
    }
}
