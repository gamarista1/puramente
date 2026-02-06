package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Attachments;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import lf.C6521e;

public class Part implements Parcelable {
    public static final Parcelable.Creator<Part> CREATOR = new Parcelable.Creator<Part>() {
        public Part createFromParcel(Parcel parcel) {
            return new Part(parcel);
        }

        public Part[] newArray(int i10) {
            return new Part[i10];
        }
    };
    public static final Part NULL = new Part(new Builder());
    private final AiAnswerInfo aiAnswerInfo;
    private final List<Attachments> attachments;
    private final List<Block> blocks;
    private String clientAssignedUuid;
    private final long createdAt;
    private final DeliveryOption deliveryOption;
    private final EventData eventData;
    private final Form form;
    private boolean fromVoiceDictation;

    /* renamed from: id  reason: collision with root package name */
    private final String f70037id;
    private final boolean isInitialMessage;
    private MessageState messageState;
    private final MessageStyle messageStyle;
    private final Metadata metadata;
    private Conversation parentConversation;
    private Participant participant;
    private String participantId;
    private final boolean participantIsAdmin;
    private final ReactionReply reactionReply;
    private final List<ReplyOption> replyOptions;
    private String seenByAdmin;
    private final List<Source> sources;
    private final String summary;

    public static final class Builder {
        AiAnswerInfo ai_answer_info;
        List<Attachments.Builder> attachments;
        List<Block.Builder> body;
        String client_assigned_uuid;
        long created_at;
        DeliveryOption delivery_option;
        EventData event_data;
        Form form;
        boolean fromVoiceDictation = false;

        /* renamed from: id  reason: collision with root package name */
        String f70038id;
        boolean is_initial_message;
        MessageStyle message_style;
        Metadata metadata;
        String participant_id;
        boolean participant_is_admin;
        ReactionReply.Builder reactions_reply;
        List<ReplyOption> reply_options;
        String seen_by_admin;
        List<Source> sources;
        String summary;

        public Part build() {
            return new Part(this);
        }

        public Builder withAiAnswerInfo(AiAnswerInfo aiAnswerInfo) {
            this.ai_answer_info = aiAnswerInfo;
            return this;
        }

        public Builder withAttachments(List<Attachments.Builder> list) {
            this.attachments = list;
            return this;
        }

        public Builder withBlocks(List<Block.Builder> list) {
            this.body = list;
            return this;
        }

        public Builder withClientAssignedUuid(String str) {
            this.client_assigned_uuid = str;
            return this;
        }

        public Builder withCreatedAt(long j10) {
            this.created_at = j10;
            return this;
        }

        public Builder withDeliveryOptions(DeliveryOption deliveryOption) {
            this.delivery_option = deliveryOption;
            return this;
        }

        public Builder withEventData(EventData eventData) {
            this.event_data = eventData;
            return this;
        }

        public Builder withForm(Form form2) {
            this.form = form2;
            return this;
        }

        public Builder withFromVoiceDictation(boolean z10) {
            this.fromVoiceDictation = z10;
            return this;
        }

        public Builder withId(String str) {
            this.f70038id = str;
            return this;
        }

        public Builder withIsInitialMessage(Boolean bool) {
            this.is_initial_message = bool.booleanValue();
            return this;
        }

        public Builder withMetadata(Metadata metadata2) {
            this.metadata = metadata2;
            return this;
        }

        public Builder withParticipantId(String str) {
            this.participant_id = str;
            return this;
        }

        public Builder withParticipantIsAdmin(boolean z10) {
            this.participant_is_admin = z10;
            return this;
        }

        public Builder withReplyOptions(List<ReplyOption> list) {
            this.reply_options = list;
            return this;
        }

        public Builder withSeenByAdmin(String str) {
            this.seen_by_admin = str;
            return this;
        }

        public Builder withSources(List<Source> list) {
            this.sources = list;
            return this;
        }

        public Builder withStyle(MessageStyle messageStyle) {
            this.message_style = messageStyle;
            return this;
        }

        public Builder withSummary(String str) {
            this.summary = str;
            return this;
        }
    }

    public enum MessageState {
        SENDING,
        FAILED,
        UPLOAD_FAILED,
        NORMAL
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Part)) {
            return false;
        }
        Part part = (Part) obj;
        if (((!this.f70037id.equals(part.f70037id) || !this.form.equals(part.form)) && (this.clientAssignedUuid.equals("") || !this.clientAssignedUuid.equals(part.clientAssignedUuid))) || !this.seenByAdmin.equals(part.seenByAdmin)) {
            return false;
        }
        return true;
    }

    public AiAnswerInfo getAiAnswerInfo() {
        return this.aiAnswerInfo;
    }

    public List<Attachments> getAttachments() {
        return this.attachments;
    }

    public List<Block> getBlocks() {
        return this.blocks;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public DeliveryOption getDeliveryOption() {
        return this.deliveryOption;
    }

    public EventData getEventData() {
        return this.eventData;
    }

    public Form getForm() {
        return this.form;
    }

    public String getId() {
        return this.f70037id;
    }

    public MessageState getMessageState() {
        return this.messageState;
    }

    public MessageStyle getMessageStyle() {
        return this.messageStyle;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    @C6521e
    public Conversation getParentConversation() {
        return this.parentConversation;
    }

    public Participant getParticipant() {
        return this.participant;
    }

    public String getParticipantId() {
        return this.participantId;
    }

    public ReactionReply getReactionReply() {
        return this.reactionReply;
    }

    public List<ReplyOption> getReplyOptions() {
        return this.replyOptions;
    }

    public String getSeenByAdmin() {
        if (this.participantIsAdmin) {
            return SeenState.HIDE;
        }
        return this.seenByAdmin;
    }

    public List<Source> getSources() {
        return this.sources;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getUuid() {
        return this.clientAssignedUuid;
    }

    public boolean hasAttachments() {
        return !this.attachments.isEmpty();
    }

    public int hashCode() {
        return this.f70037id.hashCode();
    }

    public boolean isAdmin() {
        return this.participantIsAdmin;
    }

    public Boolean isEvent() {
        boolean z10;
        if (!this.eventData.getEventAsPlainText().isEmpty() || ((this.eventData.getCustomStateLabel() != null && !this.eventData.getCustomStateLabel().isEmpty()) || (this.eventData.getMergedConversationId() != null && !this.eventData.getMergedConversationId().isEmpty()))) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public boolean isFromVoiceDictation() {
        return this.fromVoiceDictation;
    }

    public boolean isInitialMessage() {
        return this.isInitialMessage;
    }

    public boolean isReply() {
        return !this.isInitialMessage;
    }

    public boolean isUser() {
        return !isAdmin();
    }

    public void setMessageState(MessageState messageState2) {
        this.messageState = messageState2;
    }

    public void setParentConversation(Conversation conversation) {
        this.parentConversation = conversation;
    }

    public void setParticipant(Participant participant2) {
        this.participant = participant2;
        this.participantId = participant2.getId();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f70037id);
        parcel.writeString(this.participantId);
        parcel.writeByte(this.participantIsAdmin ? (byte) 1 : 0);
        parcel.writeList(this.blocks);
        parcel.writeList(this.attachments);
        parcel.writeList(this.replyOptions);
        parcel.writeValue(this.messageStyle);
        parcel.writeLong(this.createdAt);
        parcel.writeString(this.summary);
        if (ReactionReply.isNull(this.reactionReply)) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeValue(this.reactionReply);
        }
        parcel.writeString(this.seenByAdmin);
        parcel.writeValue(this.participant);
        parcel.writeValue(this.eventData);
        parcel.writeByte(this.isInitialMessage ? (byte) 1 : 0);
        parcel.writeValue(this.deliveryOption);
        parcel.writeValue(this.form);
        parcel.writeList(this.sources);
        parcel.writeValue(this.aiAnswerInfo);
        parcel.writeValue(this.metadata);
    }

    public Part() {
        this(new Builder());
    }

    private Part(Builder builder) {
        ReactionReply reactionReply2;
        String str = builder.f70038id;
        this.f70037id = str == null ? UUID.randomUUID().toString() : str;
        this.participantId = NullSafety.valueOrEmpty(builder.participant_id);
        this.participantIsAdmin = builder.participant_is_admin;
        this.summary = NullSafety.valueOrEmpty(builder.summary);
        this.createdAt = builder.created_at;
        MessageStyle messageStyle2 = builder.message_style;
        this.messageStyle = messageStyle2 == null ? MessageStyle.CHAT : messageStyle2;
        DeliveryOption deliveryOption2 = builder.delivery_option;
        this.deliveryOption = deliveryOption2 == null ? DeliveryOption.SUMMARY : deliveryOption2;
        this.blocks = new ArrayList();
        List<Block.Builder> list = builder.body;
        if (list != null) {
            for (Block.Builder build : list) {
                this.blocks.add(build.build());
            }
        }
        ReactionReply.Builder builder2 = builder.reactions_reply;
        if (builder2 == null) {
            reactionReply2 = ReactionReply.NULL;
        } else {
            reactionReply2 = builder2.build();
        }
        this.reactionReply = reactionReply2;
        String str2 = builder.seen_by_admin;
        this.seenByAdmin = str2 == null ? SeenState.HIDE : str2;
        this.attachments = new ArrayList();
        List<Attachments.Builder> list2 = builder.attachments;
        if (list2 != null) {
            for (Attachments.Builder build2 : list2) {
                this.attachments.add(build2.build());
            }
        }
        EventData eventData2 = builder.event_data;
        this.eventData = eventData2 == null ? EventData.NULL : eventData2;
        this.parentConversation = new Conversation();
        this.participant = Participant.NULL;
        this.isInitialMessage = builder.is_initial_message;
        this.messageState = MessageState.NORMAL;
        ArrayList arrayList = new ArrayList();
        this.replyOptions = arrayList;
        List<ReplyOption> list3 = builder.reply_options;
        if (list3 != null) {
            arrayList.addAll(list3);
        }
        Form form2 = builder.form;
        this.form = form2 == null ? new Form("", Collections.emptyList(), false) : form2;
        this.clientAssignedUuid = NullSafety.valueOrEmpty(builder.client_assigned_uuid);
        ArrayList arrayList2 = new ArrayList();
        this.sources = arrayList2;
        List<Source> list4 = builder.sources;
        if (list4 != null) {
            arrayList2.addAll(list4);
        }
        AiAnswerInfo aiAnswerInfo2 = builder.ai_answer_info;
        this.aiAnswerInfo = aiAnswerInfo2 == null ? new AiAnswerInfo("", "") : aiAnswerInfo2;
        this.fromVoiceDictation = builder.fromVoiceDictation;
        this.metadata = builder.metadata;
    }

    private Part(Parcel parcel) {
        this.f70037id = parcel.readString();
        this.participantId = parcel.readString();
        boolean z10 = false;
        this.participantIsAdmin = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        this.blocks = arrayList;
        parcel.readList(arrayList, Block.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.attachments = arrayList2;
        parcel.readList(arrayList2, Attachments.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.replyOptions = arrayList3;
        parcel.readList(arrayList3, ReplyOption.class.getClassLoader());
        this.messageStyle = (MessageStyle) parcel.readValue(MessageStyle.class.getClassLoader());
        this.createdAt = parcel.readLong();
        this.summary = parcel.readString();
        if (parcel.readByte() == 0) {
            this.reactionReply = ReactionReply.NULL;
        } else {
            this.reactionReply = (ReactionReply) parcel.readValue(ReactionReply.class.getClassLoader());
        }
        this.seenByAdmin = parcel.readString();
        this.participant = (Participant) parcel.readValue(Participant.class.getClassLoader());
        this.eventData = (EventData) parcel.readValue(EventData.class.getClassLoader());
        this.isInitialMessage = parcel.readByte() != 0 ? true : z10;
        this.deliveryOption = (DeliveryOption) parcel.readValue(DeliveryOption.class.getClassLoader());
        this.form = (Form) parcel.readValue(Form.class.getClassLoader());
        ArrayList arrayList4 = new ArrayList();
        this.sources = arrayList4;
        parcel.readList(arrayList4, Source.class.getClassLoader());
        this.aiAnswerInfo = (AiAnswerInfo) parcel.readValue(AiAnswerInfo.class.getClassLoader());
        this.metadata = (Metadata) parcel.readValue(Metadata.class.getClassLoader());
    }
}
