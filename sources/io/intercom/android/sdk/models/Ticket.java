package io.intercom.android.sdk.models;

import Oc.c;
import Sg.p;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.models.Participant;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b3\b\b\u0018\u0000 K2\u00020\u0001:\u0004HIJKB±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0012HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010/J\t\u0010A\u001a\u00020\u0019HÆ\u0003J¸\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÇ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010F\u001a\u00020\u0010H×\u0001J\t\u0010G\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b\u0016\u0010/R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006L"}, d2 = {"Lio/intercom/android/sdk/models/Ticket;", "", "id", "", "publicId", "title", "description", "iconUrl", "emoji", "currentStatus", "Lio/intercom/android/sdk/models/Ticket$Status;", "statusList", "", "attributes", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "ticketTypeId", "", "assignee", "Lio/intercom/android/sdk/models/Participant$Builder;", "conversationId", "conversationButton", "Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "isRead", "", "latestStatusUpdatedAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$Status;Ljava/util/List;Ljava/util/List;ILio/intercom/android/sdk/models/Participant$Builder;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$ConversationButton;Ljava/lang/Boolean;J)V", "getId", "()Ljava/lang/String;", "getPublicId", "getTitle", "getDescription", "getIconUrl", "getEmoji", "getCurrentStatus", "()Lio/intercom/android/sdk/models/Ticket$Status;", "getStatusList", "()Ljava/util/List;", "getAttributes", "getTicketTypeId", "()I", "getAssignee", "()Lio/intercom/android/sdk/models/Participant$Builder;", "getConversationId", "getConversationButton", "()Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLatestStatusUpdatedAt", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$Status;Ljava/util/List;Ljava/util/List;ILio/intercom/android/sdk/models/Participant$Builder;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$ConversationButton;Ljava/lang/Boolean;J)Lio/intercom/android/sdk/models/Ticket;", "equals", "other", "hashCode", "toString", "Status", "TicketAttribute", "ConversationButton", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Ticket {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Ticket NULL = new Ticket((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Status) null, (List) null, (List) null, 0, (Participant.Builder) null, (String) null, (ConversationButton) null, (Boolean) null, 0, 32767, (DefaultConstructorMarker) null);
    @c("assignee")
    private final Participant.Builder assignee;
    @c("attributes")
    private final List<TicketAttribute> attributes;
    @c("conversation_button")
    private final ConversationButton conversationButton;
    @c("conversation_id")
    private final String conversationId;
    @c("current_status")
    private final Status currentStatus;
    @c("description")
    private final String description;
    @c("emoji")
    private final String emoji;
    @c("icon_url")
    private final String iconUrl;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f70041id;
    @c("read")
    private final Boolean isRead;
    @c("latest_status_updated_at")
    private final long latestStatusUpdatedAt;
    @c("public_ticket_id")
    private final String publicId;
    @c("status_list")
    private final List<Status> statusList;
    @c("ticket_type_id")
    private final int ticketTypeId;
    @c("title")
    private final String title;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/Ticket;", "getNULL", "()Lio/intercom/android/sdk/models/Ticket;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ticket getNULL() {
            return Ticket.NULL;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "", "icon", "Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", "text", "", "<init>", "(Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;Ljava/lang/String;)V", "getIcon", "()Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "IconType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConversationButton {
        public static final int $stable = 0;
        @c("icon")
        private final IconType icon;
        @c("text")
        private final String text;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", "", "<init>", "(Ljava/lang/String;I)V", "SEND", "CONVERSATION", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum IconType {
            SEND,
            CONVERSATION;

            static {
                IconType[] $values;
                $ENTRIES = C6714a.a($values);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }
        }

        public ConversationButton(IconType iconType, String str) {
            C6496s.h(str, AttributeType.TEXT);
            this.icon = iconType;
            this.text = str;
        }

        public static /* synthetic */ ConversationButton copy$default(ConversationButton conversationButton, IconType iconType, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iconType = conversationButton.icon;
            }
            if ((i10 & 2) != 0) {
                str = conversationButton.text;
            }
            return conversationButton.copy(iconType, str);
        }

        public final IconType component1() {
            return this.icon;
        }

        public final String component2() {
            return this.text;
        }

        public final ConversationButton copy(IconType iconType, String str) {
            C6496s.h(str, AttributeType.TEXT);
            return new ConversationButton(iconType, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationButton)) {
                return false;
            }
            ConversationButton conversationButton = (ConversationButton) obj;
            return this.icon == conversationButton.icon && C6496s.c(this.text, conversationButton.text);
        }

        public final IconType getIcon() {
            return this.icon;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            IconType iconType = this.icon;
            return ((iconType == null ? 0 : iconType.hashCode()) * 31) + this.text.hashCode();
        }

        public String toString() {
            return "ConversationButton(icon=" + this.icon + ", text=" + this.text + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$Status;", "", "title", "", "type", "statusDetail", "isCurrentStatus", "", "createdDate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V", "getTitle", "()Ljava/lang/String;", "getType", "getStatusDetail", "()Z", "getCreatedDate", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Status {
        public static final int $stable = 0;
        @c("created_date")
        private final long createdDate;
        @c("is_current_status")
        private final boolean isCurrentStatus;
        @c("status_detail")
        private final String statusDetail;
        @c("title")
        private final String title;
        @c("type")
        private final String type;

        public Status() {
            this((String) null, (String) null, (String) null, false, 0, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Status copy$default(Status status, String str, String str2, String str3, boolean z10, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = status.title;
            }
            if ((i10 & 2) != 0) {
                str2 = status.type;
            }
            String str4 = str2;
            if ((i10 & 4) != 0) {
                str3 = status.statusDetail;
            }
            String str5 = str3;
            if ((i10 & 8) != 0) {
                z10 = status.isCurrentStatus;
            }
            boolean z11 = z10;
            if ((i10 & 16) != 0) {
                j10 = status.createdDate;
            }
            return status.copy(str, str4, str5, z11, j10);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.type;
        }

        public final String component3() {
            return this.statusDetail;
        }

        public final boolean component4() {
            return this.isCurrentStatus;
        }

        public final long component5() {
            return this.createdDate;
        }

        public final Status copy(String str, String str2, String str3, boolean z10, long j10) {
            C6496s.h(str, b.f37461S);
            C6496s.h(str2, "type");
            C6496s.h(str3, "statusDetail");
            return new Status(str, str2, str3, z10, j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            return C6496s.c(this.title, status.title) && C6496s.c(this.type, status.type) && C6496s.c(this.statusDetail, status.statusDetail) && this.isCurrentStatus == status.isCurrentStatus && this.createdDate == status.createdDate;
        }

        public final long getCreatedDate() {
            return this.createdDate;
        }

        public final String getStatusDetail() {
            return this.statusDetail;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.type.hashCode()) * 31) + this.statusDetail.hashCode()) * 31) + Boolean.hashCode(this.isCurrentStatus)) * 31) + Long.hashCode(this.createdDate);
        }

        public final boolean isCurrentStatus() {
            return this.isCurrentStatus;
        }

        public String toString() {
            return "Status(title=" + this.title + ", type=" + this.type + ", statusDetail=" + this.statusDetail + ", isCurrentStatus=" + this.isCurrentStatus + ", createdDate=" + this.createdDate + ')';
        }

        public Status(String str, String str2, String str3, boolean z10, long j10) {
            C6496s.h(str, b.f37461S);
            C6496s.h(str2, "type");
            C6496s.h(str3, "statusDetail");
            this.title = str;
            this.type = str2;
            this.statusDetail = str3;
            this.isCurrentStatus = z10;
            this.createdDate = j10;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Status(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, long r8, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r3 = this;
                r11 = r10 & 1
                java.lang.String r0 = ""
                if (r11 == 0) goto L_0x0008
                r11 = r0
                goto L_0x0009
            L_0x0008:
                r11 = r4
            L_0x0009:
                r4 = r10 & 2
                if (r4 == 0) goto L_0x000f
                r1 = r0
                goto L_0x0010
            L_0x000f:
                r1 = r5
            L_0x0010:
                r4 = r10 & 4
                if (r4 == 0) goto L_0x0015
                goto L_0x0016
            L_0x0015:
                r0 = r6
            L_0x0016:
                r4 = r10 & 8
                if (r4 == 0) goto L_0x001b
                r7 = 0
            L_0x001b:
                r2 = r7
                r4 = r10 & 16
                if (r4 == 0) goto L_0x0022
                r8 = 0
            L_0x0022:
                r9 = r8
                r4 = r3
                r5 = r11
                r6 = r1
                r7 = r0
                r8 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.Ticket.Status.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B9\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0007H&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0001\u0005\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;)V", "getId", "()Ljava/lang/String;", "getIdentifier", "getName", "getRequired", "()Z", "getType", "()Lio/intercom/android/sdk/models/TicketAttributeType;", "hasValue", "PrimitiveAttribute", "ListAttribute", "DateTimeAttribute", "FilesAttribute", "UnSupported", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$DateTimeAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$ListAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$PrimitiveAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$UnSupported;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TicketAttribute {
        public static final int $stable = 0;
        @c("id")

        /* renamed from: id  reason: collision with root package name */
        private final String f70042id;
        @c("identifier")
        private final String identifier;
        @c("name")
        private final String name;
        @c("required")
        private final boolean required;
        @c("type")
        private final TicketAttributeType type;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$DateTimeAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class DateTimeAttribute extends TicketAttribute {
            public static final int $stable = 0;
            @c("value")
            private final String value;

            public DateTimeAttribute() {
                this((String) null, (String) null, (String) null, false, (TicketAttributeType) null, (String) null, 63, (DefaultConstructorMarker) null);
            }

            public final String getValue() {
                return this.value;
            }

            public boolean hasValue() {
                return !p.d0(this.value);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ DateTimeAttribute(java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, io.intercom.android.sdk.models.TicketAttributeType r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
                /*
                    r5 = this;
                    r13 = r12 & 1
                    java.lang.String r0 = ""
                    if (r13 == 0) goto L_0x0008
                    r13 = r0
                    goto L_0x0009
                L_0x0008:
                    r13 = r6
                L_0x0009:
                    r6 = r12 & 2
                    if (r6 == 0) goto L_0x000f
                    r1 = r0
                    goto L_0x0010
                L_0x000f:
                    r1 = r7
                L_0x0010:
                    r6 = r12 & 4
                    if (r6 == 0) goto L_0x0016
                    r2 = r0
                    goto L_0x0017
                L_0x0016:
                    r2 = r8
                L_0x0017:
                    r6 = r12 & 8
                    if (r6 == 0) goto L_0x001c
                    r9 = 0
                L_0x001c:
                    r3 = r9
                    r6 = r12 & 16
                    if (r6 == 0) goto L_0x0023
                    io.intercom.android.sdk.models.TicketAttributeType r10 = io.intercom.android.sdk.models.TicketAttributeType.DATETIME
                L_0x0023:
                    r4 = r10
                    r6 = r12 & 32
                    if (r6 == 0) goto L_0x002a
                    r12 = r0
                    goto L_0x002b
                L_0x002a:
                    r12 = r11
                L_0x002b:
                    r6 = r5
                    r7 = r13
                    r8 = r1
                    r9 = r2
                    r10 = r3
                    r11 = r4
                    r6.<init>(r7, r8, r9, r10, r11, r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.Ticket.TicketAttribute.DateTimeAttribute.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, io.intercom.android.sdk.models.TicketAttributeType, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public DateTimeAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4) {
                super(str, str2, str3, z10, ticketAttributeType, (DefaultConstructorMarker) null);
                C6496s.h(str, "id");
                C6496s.h(str2, "identifier");
                C6496s.h(str3, "name");
                C6496s.h(ticketAttributeType, "type");
                C6496s.h(str4, "value");
                this.value = str4;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0007H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute$File;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "hasValue", "File", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FilesAttribute extends TicketAttribute {
            public static final int $stable = 8;
            @c("value")
            private final List<File> value;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute$File;", "", "id", "", "name", "url", "fileType", "Lio/intercom/android/sdk/models/FileType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/FileType;)V", "getId", "()Ljava/lang/String;", "getName", "getUrl", "getFileType", "()Lio/intercom/android/sdk/models/FileType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class File {
                public static final int $stable = 0;
                @c("media_type")
                private final FileType fileType;
                @c("id")

                /* renamed from: id  reason: collision with root package name */
                private final String f70043id;
                @c("name")
                private final String name;
                @c("url")
                private final String url;

                public File(String str, String str2, String str3, FileType fileType2) {
                    C6496s.h(str, "id");
                    C6496s.h(str2, "name");
                    C6496s.h(str3, "url");
                    C6496s.h(fileType2, "fileType");
                    this.f70043id = str;
                    this.name = str2;
                    this.url = str3;
                    this.fileType = fileType2;
                }

                public static /* synthetic */ File copy$default(File file, String str, String str2, String str3, FileType fileType2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = file.f70043id;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = file.name;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = file.url;
                    }
                    if ((i10 & 8) != 0) {
                        fileType2 = file.fileType;
                    }
                    return file.copy(str, str2, str3, fileType2);
                }

                public final String component1() {
                    return this.f70043id;
                }

                public final String component2() {
                    return this.name;
                }

                public final String component3() {
                    return this.url;
                }

                public final FileType component4() {
                    return this.fileType;
                }

                public final File copy(String str, String str2, String str3, FileType fileType2) {
                    C6496s.h(str, "id");
                    C6496s.h(str2, "name");
                    C6496s.h(str3, "url");
                    C6496s.h(fileType2, "fileType");
                    return new File(str, str2, str3, fileType2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof File)) {
                        return false;
                    }
                    File file = (File) obj;
                    return C6496s.c(this.f70043id, file.f70043id) && C6496s.c(this.name, file.name) && C6496s.c(this.url, file.url) && this.fileType == file.fileType;
                }

                public final FileType getFileType() {
                    return this.fileType;
                }

                public final String getId() {
                    return this.f70043id;
                }

                public final String getName() {
                    return this.name;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return (((((this.f70043id.hashCode() * 31) + this.name.hashCode()) * 31) + this.url.hashCode()) * 31) + this.fileType.hashCode();
                }

                public String toString() {
                    return "File(id=" + this.f70043id + ", name=" + this.name + ", url=" + this.url + ", fileType=" + this.fileType + ')';
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ FilesAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, ticketAttributeType, list);
            }

            public final List<File> getValue() {
                return this.value;
            }

            public boolean hasValue() {
                return !this.value.isEmpty();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public FilesAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, List<File> list) {
                super(str, str2, str3, z10, ticketAttributeType, (DefaultConstructorMarker) null);
                C6496s.h(str, "id");
                C6496s.h(str2, "identifier");
                C6496s.h(str3, "name");
                C6496s.h(ticketAttributeType, "type");
                C6496s.h(list, "value");
                this.value = list;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$ListAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ListAttribute extends TicketAttribute {
            public static final int $stable = 0;
            @c("value")
            private final String value;

            public ListAttribute() {
                this((String) null, (String) null, (String) null, false, (TicketAttributeType) null, (String) null, 63, (DefaultConstructorMarker) null);
            }

            public final String getValue() {
                return this.value;
            }

            public boolean hasValue() {
                return !p.d0(this.value);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ ListAttribute(java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, io.intercom.android.sdk.models.TicketAttributeType r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
                /*
                    r5 = this;
                    r13 = r12 & 1
                    java.lang.String r0 = ""
                    if (r13 == 0) goto L_0x0008
                    r13 = r0
                    goto L_0x0009
                L_0x0008:
                    r13 = r6
                L_0x0009:
                    r6 = r12 & 2
                    if (r6 == 0) goto L_0x000f
                    r1 = r0
                    goto L_0x0010
                L_0x000f:
                    r1 = r7
                L_0x0010:
                    r6 = r12 & 4
                    if (r6 == 0) goto L_0x0016
                    r2 = r0
                    goto L_0x0017
                L_0x0016:
                    r2 = r8
                L_0x0017:
                    r6 = r12 & 8
                    if (r6 == 0) goto L_0x001c
                    r9 = 0
                L_0x001c:
                    r3 = r9
                    r6 = r12 & 16
                    if (r6 == 0) goto L_0x0023
                    io.intercom.android.sdk.models.TicketAttributeType r10 = io.intercom.android.sdk.models.TicketAttributeType.LIST
                L_0x0023:
                    r4 = r10
                    r6 = r12 & 32
                    if (r6 == 0) goto L_0x002a
                    r12 = r0
                    goto L_0x002b
                L_0x002a:
                    r12 = r11
                L_0x002b:
                    r6 = r5
                    r7 = r13
                    r8 = r1
                    r9 = r2
                    r10 = r3
                    r11 = r4
                    r6.<init>(r7, r8, r9, r10, r11, r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.Ticket.TicketAttribute.ListAttribute.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, io.intercom.android.sdk.models.TicketAttributeType, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ListAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4) {
                super(str, str2, str3, z10, ticketAttributeType, (DefaultConstructorMarker) null);
                C6496s.h(str, "id");
                C6496s.h(str2, "identifier");
                C6496s.h(str3, "name");
                C6496s.h(ticketAttributeType, "type");
                C6496s.h(str4, "value");
                this.value = str4;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$PrimitiveAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PrimitiveAttribute extends TicketAttribute {
            public static final int $stable = 0;
            @c("value")
            private final String value;

            public PrimitiveAttribute() {
                this((String) null, (String) null, (String) null, false, (TicketAttributeType) null, (String) null, 63, (DefaultConstructorMarker) null);
            }

            public final String getValue() {
                return this.value;
            }

            public boolean hasValue() {
                return !p.d0(this.value);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ PrimitiveAttribute(java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, io.intercom.android.sdk.models.TicketAttributeType r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
                /*
                    r5 = this;
                    r13 = r12 & 1
                    java.lang.String r0 = ""
                    if (r13 == 0) goto L_0x0008
                    r13 = r0
                    goto L_0x0009
                L_0x0008:
                    r13 = r6
                L_0x0009:
                    r6 = r12 & 2
                    if (r6 == 0) goto L_0x000f
                    r1 = r0
                    goto L_0x0010
                L_0x000f:
                    r1 = r7
                L_0x0010:
                    r6 = r12 & 4
                    if (r6 == 0) goto L_0x0016
                    r2 = r0
                    goto L_0x0017
                L_0x0016:
                    r2 = r8
                L_0x0017:
                    r6 = r12 & 8
                    if (r6 == 0) goto L_0x001c
                    r9 = 0
                L_0x001c:
                    r3 = r9
                    r6 = r12 & 16
                    if (r6 == 0) goto L_0x0023
                    io.intercom.android.sdk.models.TicketAttributeType r10 = io.intercom.android.sdk.models.TicketAttributeType.STRING
                L_0x0023:
                    r4 = r10
                    r6 = r12 & 32
                    if (r6 == 0) goto L_0x002a
                    r12 = r0
                    goto L_0x002b
                L_0x002a:
                    r12 = r11
                L_0x002b:
                    r6 = r5
                    r7 = r13
                    r8 = r1
                    r9 = r2
                    r10 = r3
                    r11 = r4
                    r6.<init>(r7, r8, r9, r10, r11, r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.Ticket.TicketAttribute.PrimitiveAttribute.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, io.intercom.android.sdk.models.TicketAttributeType, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public PrimitiveAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4) {
                super(str, str2, str3, z10, ticketAttributeType, (DefaultConstructorMarker) null);
                C6496s.h(str, "id");
                C6496s.h(str2, "identifier");
                C6496s.h(str3, "name");
                C6496s.h(ticketAttributeType, "type");
                C6496s.h(str4, "value");
                this.value = str4;
            }
        }

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z10, ticketAttributeType);
        }

        public final String getId() {
            return this.f70042id;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getRequired() {
            return this.required;
        }

        public final TicketAttributeType getType() {
            return this.type;
        }

        public abstract boolean hasValue();

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$UnSupported;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", "identifier", "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UnSupported extends TicketAttribute {
            public static final int $stable = 8;
            @c("value")
            private final Object value;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ UnSupported(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, z10, ticketAttributeType, (i10 & 32) != 0 ? "" : str4);
            }

            public final Object getValue() {
                return this.value;
            }

            public boolean hasValue() {
                return !p.d0(this.value.toString());
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public UnSupported(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, Object obj) {
                super(str, str2, str3, z10, ticketAttributeType, (DefaultConstructorMarker) null);
                C6496s.h(str, "id");
                C6496s.h(str2, "identifier");
                C6496s.h(str3, "name");
                C6496s.h(ticketAttributeType, "type");
                C6496s.h(obj, "value");
                this.value = obj;
            }
        }

        private TicketAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType) {
            this.f70042id = str;
            this.identifier = str2;
            this.name = str3;
            this.required = z10;
            this.type = ticketAttributeType;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, ticketAttributeType, (DefaultConstructorMarker) null);
        }
    }

    public Ticket() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Status) null, (List) null, (List) null, 0, (Participant.Builder) null, (String) null, (ConversationButton) null, (Boolean) null, 0, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, int i10, Participant.Builder builder, String str7, ConversationButton conversationButton2, Boolean bool, long j10, int i11, Object obj) {
        Ticket ticket2 = ticket;
        int i12 = i11;
        return ticket.copy((i12 & 1) != 0 ? ticket2.f70041id : str, (i12 & 2) != 0 ? ticket2.publicId : str2, (i12 & 4) != 0 ? ticket2.title : str3, (i12 & 8) != 0 ? ticket2.description : str4, (i12 & 16) != 0 ? ticket2.iconUrl : str5, (i12 & 32) != 0 ? ticket2.emoji : str6, (i12 & 64) != 0 ? ticket2.currentStatus : status, (i12 & 128) != 0 ? ticket2.statusList : list, (i12 & 256) != 0 ? ticket2.attributes : list2, (i12 & 512) != 0 ? ticket2.ticketTypeId : i10, (i12 & 1024) != 0 ? ticket2.assignee : builder, (i12 & 2048) != 0 ? ticket2.conversationId : str7, (i12 & 4096) != 0 ? ticket2.conversationButton : conversationButton2, (i12 & 8192) != 0 ? ticket2.isRead : bool, (i12 & 16384) != 0 ? ticket2.latestStatusUpdatedAt : j10);
    }

    public final String component1() {
        return this.f70041id;
    }

    public final int component10() {
        return this.ticketTypeId;
    }

    public final Participant.Builder component11() {
        return this.assignee;
    }

    public final String component12() {
        return this.conversationId;
    }

    public final ConversationButton component13() {
        return this.conversationButton;
    }

    public final Boolean component14() {
        return this.isRead;
    }

    public final long component15() {
        return this.latestStatusUpdatedAt;
    }

    public final String component2() {
        return this.publicId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final String component6() {
        return this.emoji;
    }

    public final Status component7() {
        return this.currentStatus;
    }

    public final List<Status> component8() {
        return this.statusList;
    }

    public final List<TicketAttribute> component9() {
        return this.attributes;
    }

    public final Ticket copy(String str, String str2, String str3, String str4, String str5, String str6, Status status, List<Status> list, List<? extends TicketAttribute> list2, int i10, Participant.Builder builder, String str7, ConversationButton conversationButton2, Boolean bool, long j10) {
        String str8 = str;
        C6496s.h(str8, "id");
        C6496s.h(str3, b.f37461S);
        C6496s.h(str4, b.f37480c);
        C6496s.h(str5, b.f37487j);
        C6496s.h(str6, "emoji");
        C6496s.h(status, "currentStatus");
        C6496s.h(list, "statusList");
        C6496s.h(list2, "attributes");
        C6496s.h(builder, "assignee");
        return new Ticket(str8, str2, str3, str4, str5, str6, status, list, list2, i10, builder, str7, conversationButton2, bool, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) obj;
        return C6496s.c(this.f70041id, ticket.f70041id) && C6496s.c(this.publicId, ticket.publicId) && C6496s.c(this.title, ticket.title) && C6496s.c(this.description, ticket.description) && C6496s.c(this.iconUrl, ticket.iconUrl) && C6496s.c(this.emoji, ticket.emoji) && C6496s.c(this.currentStatus, ticket.currentStatus) && C6496s.c(this.statusList, ticket.statusList) && C6496s.c(this.attributes, ticket.attributes) && this.ticketTypeId == ticket.ticketTypeId && C6496s.c(this.assignee, ticket.assignee) && C6496s.c(this.conversationId, ticket.conversationId) && C6496s.c(this.conversationButton, ticket.conversationButton) && C6496s.c(this.isRead, ticket.isRead) && this.latestStatusUpdatedAt == ticket.latestStatusUpdatedAt;
    }

    public final Participant.Builder getAssignee() {
        return this.assignee;
    }

    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    public final ConversationButton getConversationButton() {
        return this.conversationButton;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final Status getCurrentStatus() {
        return this.currentStatus;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.f70041id;
    }

    public final long getLatestStatusUpdatedAt() {
        return this.latestStatusUpdatedAt;
    }

    public final String getPublicId() {
        return this.publicId;
    }

    public final List<Status> getStatusList() {
        return this.statusList;
    }

    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.f70041id.hashCode() * 31;
        String str = this.publicId;
        int i10 = 0;
        int hashCode2 = (((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.emoji.hashCode()) * 31) + this.currentStatus.hashCode()) * 31) + this.statusList.hashCode()) * 31) + this.attributes.hashCode()) * 31) + Integer.hashCode(this.ticketTypeId)) * 31) + this.assignee.hashCode()) * 31;
        String str2 = this.conversationId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConversationButton conversationButton2 = this.conversationButton;
        int hashCode4 = (hashCode3 + (conversationButton2 == null ? 0 : conversationButton2.hashCode())) * 31;
        Boolean bool = this.isRead;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return ((hashCode4 + i10) * 31) + Long.hashCode(this.latestStatusUpdatedAt);
    }

    public final Boolean isRead() {
        return this.isRead;
    }

    public String toString() {
        return "Ticket(id=" + this.f70041id + ", publicId=" + this.publicId + ", title=" + this.title + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", emoji=" + this.emoji + ", currentStatus=" + this.currentStatus + ", statusList=" + this.statusList + ", attributes=" + this.attributes + ", ticketTypeId=" + this.ticketTypeId + ", assignee=" + this.assignee + ", conversationId=" + this.conversationId + ", conversationButton=" + this.conversationButton + ", isRead=" + this.isRead + ", latestStatusUpdatedAt=" + this.latestStatusUpdatedAt + ')';
    }

    public Ticket(String str, String str2, String str3, String str4, String str5, String str6, Status status, List<Status> list, List<? extends TicketAttribute> list2, int i10, Participant.Builder builder, String str7, ConversationButton conversationButton2, Boolean bool, long j10) {
        String str8 = str5;
        String str9 = str6;
        Status status2 = status;
        List<Status> list3 = list;
        List<? extends TicketAttribute> list4 = list2;
        Participant.Builder builder2 = builder;
        C6496s.h(str, "id");
        C6496s.h(str3, b.f37461S);
        C6496s.h(str4, b.f37480c);
        C6496s.h(str8, b.f37487j);
        C6496s.h(str9, "emoji");
        C6496s.h(status2, "currentStatus");
        C6496s.h(list3, "statusList");
        C6496s.h(list4, "attributes");
        C6496s.h(builder2, "assignee");
        this.f70041id = str;
        this.publicId = str2;
        this.title = str3;
        this.description = str4;
        this.iconUrl = str8;
        this.emoji = str9;
        this.currentStatus = status2;
        this.statusList = list3;
        this.attributes = list4;
        this.ticketTypeId = i10;
        this.assignee = builder2;
        this.conversationId = str7;
        this.conversationButton = conversationButton2;
        this.isRead = bool;
        this.latestStatusUpdatedAt = j10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Ticket(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, io.intercom.android.sdk.models.Ticket.Status r25, java.util.List r26, java.util.List r27, int r28, io.intercom.android.sdk.models.Participant.Builder r29, java.lang.String r30, io.intercom.android.sdk.models.Ticket.ConversationButton r31, java.lang.Boolean r32, long r33, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r18 = this;
            r0 = r35
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r19
        L_0x000c:
            r3 = r0 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0013
            r3 = r4
            goto L_0x0015
        L_0x0013:
            r3 = r20
        L_0x0015:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001b
            r5 = r2
            goto L_0x001d
        L_0x001b:
            r5 = r21
        L_0x001d:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0023
            r6 = r2
            goto L_0x0025
        L_0x0023:
            r6 = r22
        L_0x0025:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002b
            r7 = r2
            goto L_0x002d
        L_0x002b:
            r7 = r23
        L_0x002d:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r2 = r24
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0049
            io.intercom.android.sdk.models.Ticket$Status r8 = new io.intercom.android.sdk.models.Ticket$Status
            r16 = 31
            r17 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r16, r17)
            goto L_0x004b
        L_0x0049:
            r8 = r25
        L_0x004b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0054
            java.util.List r9 = mf.C6565s.n()
            goto L_0x0056
        L_0x0054:
            r9 = r26
        L_0x0056:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x005f
            java.util.List r10 = mf.C6565s.n()
            goto L_0x0061
        L_0x005f:
            r10 = r27
        L_0x0061:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0067
            r11 = 0
            goto L_0x0069
        L_0x0067:
            r11 = r28
        L_0x0069:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0073
            io.intercom.android.sdk.models.Participant$Builder r12 = new io.intercom.android.sdk.models.Participant$Builder
            r12.<init>()
            goto L_0x0075
        L_0x0073:
            r12 = r29
        L_0x0075:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x007b
            r13 = r4
            goto L_0x007d
        L_0x007b:
            r13 = r30
        L_0x007d:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0083
            r14 = r4
            goto L_0x0085
        L_0x0083:
            r14 = r31
        L_0x0085:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r4 = r32
        L_0x008c:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0093
            r15 = 0
            goto L_0x0095
        L_0x0093:
            r15 = r33
        L_0x0095:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r2
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r4
            r34 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.Ticket.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, io.intercom.android.sdk.models.Ticket$Status, java.util.List, java.util.List, int, io.intercom.android.sdk.models.Participant$Builder, java.lang.String, io.intercom.android.sdk.models.Ticket$ConversationButton, java.lang.Boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
