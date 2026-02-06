package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"lastActionCreatedAt", "", "Lio/intercom/android/sdk/models/Conversation;", "hasNonTicketParts", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationExtensionsKt {
    public static final boolean hasNonTicketParts(Conversation conversation) {
        C6496s.h(conversation, "<this>");
        Iterable<Part> parts = conversation.parts();
        if ((parts instanceof Collection) && ((Collection) parts).isEmpty()) {
            return false;
        }
        for (Part messageStyle : parts) {
            if (messageStyle.getMessageStyle() != MessageStyle.TICKET_STATE_UPDATED) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: io.intercom.android.sdk.models.Ticket$Status} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long lastActionCreatedAt(io.intercom.android.sdk.models.Conversation r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            io.intercom.android.sdk.models.Part r0 = r7.lastPart()
            io.intercom.android.sdk.models.Part r1 = io.intercom.android.sdk.models.Part.NULL
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r1)
            if (r0 != 0) goto L_0x001a
            io.intercom.android.sdk.models.Part r7 = r7.lastPart()
            long r0 = r7.getCreatedAt()
            goto L_0x006a
        L_0x001a:
            io.intercom.android.sdk.models.Ticket r7 = r7.getTicket()
            if (r7 == 0) goto L_0x0068
            java.util.List r7 = r7.getStatusList()
            if (r7 == 0) goto L_0x0068
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0034
            r7 = 0
            goto L_0x005f
        L_0x0034:
            java.lang.Object r0 = r7.next()
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L_0x0040
        L_0x003e:
            r7 = r0
            goto L_0x005f
        L_0x0040:
            r1 = r0
            io.intercom.android.sdk.models.Ticket$Status r1 = (io.intercom.android.sdk.models.Ticket.Status) r1
            long r1 = r1.getCreatedDate()
        L_0x0047:
            java.lang.Object r3 = r7.next()
            r4 = r3
            io.intercom.android.sdk.models.Ticket$Status r4 = (io.intercom.android.sdk.models.Ticket.Status) r4
            long r4 = r4.getCreatedDate()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0058
            r0 = r3
            r1 = r4
        L_0x0058:
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L_0x0047
            goto L_0x003e
        L_0x005f:
            io.intercom.android.sdk.models.Ticket$Status r7 = (io.intercom.android.sdk.models.Ticket.Status) r7
            if (r7 == 0) goto L_0x0068
            long r0 = r7.getCreatedDate()
            goto L_0x006a
        L_0x0068:
            r0 = 0
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt.lastActionCreatedAt(io.intercom.android.sdk.models.Conversation):long");
    }
}
