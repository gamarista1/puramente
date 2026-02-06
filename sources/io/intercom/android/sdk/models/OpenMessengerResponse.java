package io.intercom.android.sdk.models;

import Oc.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import sf.C6714a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002./B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003J_\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÇ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010+\u001a\u00020,H×\u0001J\t\u0010-\u001a\u00020\tH×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lio/intercom/android/sdk/models/OpenMessengerResponse;", "", "composerSuggestions", "Lio/intercom/android/sdk/models/ComposerSuggestions;", "newConversationData", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData;", "composerState", "Lio/intercom/android/sdk/models/ComposerState;", "requestId", "", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "openInboundConversations", "", "privacyNotice", "Lio/intercom/android/sdk/models/PrivacyNotice;", "<init>", "(Lio/intercom/android/sdk/models/ComposerSuggestions;Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData;Lio/intercom/android/sdk/models/ComposerState;Ljava/lang/String;Lio/intercom/android/sdk/models/PoweredBy;Ljava/util/List;Lio/intercom/android/sdk/models/PrivacyNotice;)V", "getComposerSuggestions", "()Lio/intercom/android/sdk/models/ComposerSuggestions;", "getNewConversationData", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData;", "getComposerState", "()Lio/intercom/android/sdk/models/ComposerState;", "getRequestId", "()Ljava/lang/String;", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "getOpenInboundConversations", "()Ljava/util/List;", "getPrivacyNotice", "()Lio/intercom/android/sdk/models/PrivacyNotice;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "NewConversationData", "IconType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OpenMessengerResponse {
    public static final int $stable = 8;
    @c("composer_state")
    private final ComposerState composerState;
    @c("composer_suggestions")
    private final ComposerSuggestions composerSuggestions;
    @c("new_conversation")
    private final NewConversationData newConversationData;
    @c("open_inbound_conversation_ids")
    private final List<String> openInboundConversations;
    @c("powered_by")
    private final PoweredBy poweredBy;
    @c("privacy_policy_notice")
    private final PrivacyNotice privacyNotice;
    @c("request_id")
    private final String requestId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "", "<init>", "(Ljava/lang/String;I)V", "CHEVRON", "QUESTION_BUBBLE", "PAPER_PLANE", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum IconType {
        ;

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/models/OpenMessengerResponse.IconType.CHEVRON", "Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class CHEVRON extends IconType {
            CHEVRON(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_chevron);
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/models/OpenMessengerResponse.IconType.PAPER_PLANE", "Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class PAPER_PLANE extends IconType {
            PAPER_PLANE(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_send_message_icon);
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/models/OpenMessengerResponse.IconType.QUESTION_BUBBLE", "Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class QUESTION_BUBBLE extends IconType {
            QUESTION_BUBBLE(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_conversation_card_question);
            }
        }

        static {
            IconType[] $values;
            $ENTRIES = C6714a.a($values);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public abstract Integer getIcon();
    }

    public OpenMessengerResponse() {
        this((ComposerSuggestions) null, (NewConversationData) null, (ComposerState) null, (String) null, (PoweredBy) null, (List) null, (PrivacyNotice) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OpenMessengerResponse copy$default(OpenMessengerResponse openMessengerResponse, ComposerSuggestions composerSuggestions2, NewConversationData newConversationData2, ComposerState composerState2, String str, PoweredBy poweredBy2, List<String> list, PrivacyNotice privacyNotice2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            composerSuggestions2 = openMessengerResponse.composerSuggestions;
        }
        if ((i10 & 2) != 0) {
            newConversationData2 = openMessengerResponse.newConversationData;
        }
        NewConversationData newConversationData3 = newConversationData2;
        if ((i10 & 4) != 0) {
            composerState2 = openMessengerResponse.composerState;
        }
        ComposerState composerState3 = composerState2;
        if ((i10 & 8) != 0) {
            str = openMessengerResponse.requestId;
        }
        String str2 = str;
        if ((i10 & 16) != 0) {
            poweredBy2 = openMessengerResponse.poweredBy;
        }
        PoweredBy poweredBy3 = poweredBy2;
        if ((i10 & 32) != 0) {
            list = openMessengerResponse.openInboundConversations;
        }
        List<String> list2 = list;
        if ((i10 & 64) != 0) {
            privacyNotice2 = openMessengerResponse.privacyNotice;
        }
        return openMessengerResponse.copy(composerSuggestions2, newConversationData3, composerState3, str2, poweredBy3, list2, privacyNotice2);
    }

    public final ComposerSuggestions component1() {
        return this.composerSuggestions;
    }

    public final NewConversationData component2() {
        return this.newConversationData;
    }

    public final ComposerState component3() {
        return this.composerState;
    }

    public final String component4() {
        return this.requestId;
    }

    public final PoweredBy component5() {
        return this.poweredBy;
    }

    public final List<String> component6() {
        return this.openInboundConversations;
    }

    public final PrivacyNotice component7() {
        return this.privacyNotice;
    }

    public final OpenMessengerResponse copy(ComposerSuggestions composerSuggestions2, NewConversationData newConversationData2, ComposerState composerState2, String str, PoweredBy poweredBy2, List<String> list, PrivacyNotice privacyNotice2) {
        C6496s.h(composerState2, "composerState");
        C6496s.h(list, "openInboundConversations");
        return new OpenMessengerResponse(composerSuggestions2, newConversationData2, composerState2, str, poweredBy2, list, privacyNotice2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenMessengerResponse)) {
            return false;
        }
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
        return C6496s.c(this.composerSuggestions, openMessengerResponse.composerSuggestions) && C6496s.c(this.newConversationData, openMessengerResponse.newConversationData) && C6496s.c(this.composerState, openMessengerResponse.composerState) && C6496s.c(this.requestId, openMessengerResponse.requestId) && C6496s.c(this.poweredBy, openMessengerResponse.poweredBy) && C6496s.c(this.openInboundConversations, openMessengerResponse.openInboundConversations) && C6496s.c(this.privacyNotice, openMessengerResponse.privacyNotice);
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final ComposerSuggestions getComposerSuggestions() {
        return this.composerSuggestions;
    }

    public final NewConversationData getNewConversationData() {
        return this.newConversationData;
    }

    public final List<String> getOpenInboundConversations() {
        return this.openInboundConversations;
    }

    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final PrivacyNotice getPrivacyNotice() {
        return this.privacyNotice;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        ComposerSuggestions composerSuggestions2 = this.composerSuggestions;
        int i10 = 0;
        int hashCode = (composerSuggestions2 == null ? 0 : composerSuggestions2.hashCode()) * 31;
        NewConversationData newConversationData2 = this.newConversationData;
        int hashCode2 = (((hashCode + (newConversationData2 == null ? 0 : newConversationData2.hashCode())) * 31) + this.composerState.hashCode()) * 31;
        String str = this.requestId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PoweredBy poweredBy2 = this.poweredBy;
        int hashCode4 = (((hashCode3 + (poweredBy2 == null ? 0 : poweredBy2.hashCode())) * 31) + this.openInboundConversations.hashCode()) * 31;
        PrivacyNotice privacyNotice2 = this.privacyNotice;
        if (privacyNotice2 != null) {
            i10 = privacyNotice2.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "OpenMessengerResponse(composerSuggestions=" + this.composerSuggestions + ", newConversationData=" + this.newConversationData + ", composerState=" + this.composerState + ", requestId=" + this.requestId + ", poweredBy=" + this.poweredBy + ", openInboundConversations=" + this.openInboundConversations + ", privacyNotice=" + this.privacyNotice + ')';
    }

    public OpenMessengerResponse(ComposerSuggestions composerSuggestions2, NewConversationData newConversationData2, ComposerState composerState2, String str, PoweredBy poweredBy2, List<String> list, PrivacyNotice privacyNotice2) {
        C6496s.h(composerState2, "composerState");
        C6496s.h(list, "openInboundConversations");
        this.composerSuggestions = composerSuggestions2;
        this.newConversationData = newConversationData2;
        this.composerState = composerState2;
        this.requestId = str;
        this.poweredBy = poweredBy2;
        this.openInboundConversations = list;
        this.privacyNotice = privacyNotice2;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002,-B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÇ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010)\u001a\u00020*H×\u0001J\t\u0010+\u001a\u00020\u000eH×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006."}, d2 = {"Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData;", "", "cta", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "homeCard", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;", "parts", "", "Lio/intercom/android/sdk/models/Part$Builder;", "participants", "Lio/intercom/android/sdk/models/Participant$Builder;", "header", "Lio/intercom/android/sdk/models/Header;", "teamIntro", "", "specialNotice", "<init>", "(Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/models/Header;Ljava/lang/String;Ljava/lang/String;)V", "getCta", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "getHomeCard", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;", "getParts", "()Ljava/util/List;", "getParticipants", "getHeader", "()Lio/intercom/android/sdk/models/Header;", "getTeamIntro", "()Ljava/lang/String;", "getSpecialNotice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Cta", "HomeCard", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NewConversationData {
        public static final int $stable = 8;
        @c("cta")
        private final Cta cta;
        @c("header")
        private final Header header;
        @c("home_card")
        private final HomeCard homeCard;
        @c("participants")
        private final List<Participant.Builder> participants;
        @c("parts")
        private final List<Part.Builder> parts;
        @c("special_notice")
        private final String specialNotice;
        @c("team_intro")
        private final String teamIntro;

        public NewConversationData(Cta cta2, HomeCard homeCard2, List<Part.Builder> list, List<Participant.Builder> list2, Header header2, String str, String str2) {
            C6496s.h(cta2, "cta");
            C6496s.h(homeCard2, "homeCard");
            C6496s.h(list, "parts");
            C6496s.h(list2, "participants");
            this.cta = cta2;
            this.homeCard = homeCard2;
            this.parts = list;
            this.participants = list2;
            this.header = header2;
            this.teamIntro = str;
            this.specialNotice = str2;
        }

        public static /* synthetic */ NewConversationData copy$default(NewConversationData newConversationData, Cta cta2, HomeCard homeCard2, List<Part.Builder> list, List<Participant.Builder> list2, Header header2, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cta2 = newConversationData.cta;
            }
            if ((i10 & 2) != 0) {
                homeCard2 = newConversationData.homeCard;
            }
            HomeCard homeCard3 = homeCard2;
            if ((i10 & 4) != 0) {
                list = newConversationData.parts;
            }
            List<Part.Builder> list3 = list;
            if ((i10 & 8) != 0) {
                list2 = newConversationData.participants;
            }
            List<Participant.Builder> list4 = list2;
            if ((i10 & 16) != 0) {
                header2 = newConversationData.header;
            }
            Header header3 = header2;
            if ((i10 & 32) != 0) {
                str = newConversationData.teamIntro;
            }
            String str3 = str;
            if ((i10 & 64) != 0) {
                str2 = newConversationData.specialNotice;
            }
            return newConversationData.copy(cta2, homeCard3, list3, list4, header3, str3, str2);
        }

        public final Cta component1() {
            return this.cta;
        }

        public final HomeCard component2() {
            return this.homeCard;
        }

        public final List<Part.Builder> component3() {
            return this.parts;
        }

        public final List<Participant.Builder> component4() {
            return this.participants;
        }

        public final Header component5() {
            return this.header;
        }

        public final String component6() {
            return this.teamIntro;
        }

        public final String component7() {
            return this.specialNotice;
        }

        public final NewConversationData copy(Cta cta2, HomeCard homeCard2, List<Part.Builder> list, List<Participant.Builder> list2, Header header2, String str, String str2) {
            C6496s.h(cta2, "cta");
            C6496s.h(homeCard2, "homeCard");
            C6496s.h(list, "parts");
            C6496s.h(list2, "participants");
            return new NewConversationData(cta2, homeCard2, list, list2, header2, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewConversationData)) {
                return false;
            }
            NewConversationData newConversationData = (NewConversationData) obj;
            return C6496s.c(this.cta, newConversationData.cta) && C6496s.c(this.homeCard, newConversationData.homeCard) && C6496s.c(this.parts, newConversationData.parts) && C6496s.c(this.participants, newConversationData.participants) && C6496s.c(this.header, newConversationData.header) && C6496s.c(this.teamIntro, newConversationData.teamIntro) && C6496s.c(this.specialNotice, newConversationData.specialNotice);
        }

        public final Cta getCta() {
            return this.cta;
        }

        public final Header getHeader() {
            return this.header;
        }

        public final HomeCard getHomeCard() {
            return this.homeCard;
        }

        public final List<Participant.Builder> getParticipants() {
            return this.participants;
        }

        public final List<Part.Builder> getParts() {
            return this.parts;
        }

        public final String getSpecialNotice() {
            return this.specialNotice;
        }

        public final String getTeamIntro() {
            return this.teamIntro;
        }

        public int hashCode() {
            int hashCode = ((((((this.cta.hashCode() * 31) + this.homeCard.hashCode()) * 31) + this.parts.hashCode()) * 31) + this.participants.hashCode()) * 31;
            Header header2 = this.header;
            int i10 = 0;
            int hashCode2 = (hashCode + (header2 == null ? 0 : header2.hashCode())) * 31;
            String str = this.teamIntro;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.specialNotice;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            return "NewConversationData(cta=" + this.cta + ", homeCard=" + this.homeCard + ", parts=" + this.parts + ", participants=" + this.participants + ", header=" + this.header + ", teamIntro=" + this.teamIntro + ", specialNotice=" + this.specialNotice + ')';
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "", "text", "", "subtitle", "icon", "Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;)V", "getText", "()Ljava/lang/String;", "getSubtitle", "getIcon", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Cta {
            public static final int $stable = 0;
            @c("icon")
            private final IconType icon;
            @c("subtitle")
            private final String subtitle;
            @c("text")
            private final String text;

            public Cta(String str, String str2, IconType iconType) {
                C6496s.h(str, AttributeType.TEXT);
                C6496s.h(iconType, "icon");
                this.text = str;
                this.subtitle = str2;
                this.icon = iconType;
            }

            public static /* synthetic */ Cta copy$default(Cta cta, String str, String str2, IconType iconType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = cta.text;
                }
                if ((i10 & 2) != 0) {
                    str2 = cta.subtitle;
                }
                if ((i10 & 4) != 0) {
                    iconType = cta.icon;
                }
                return cta.copy(str, str2, iconType);
            }

            public final String component1() {
                return this.text;
            }

            public final String component2() {
                return this.subtitle;
            }

            public final IconType component3() {
                return this.icon;
            }

            public final Cta copy(String str, String str2, IconType iconType) {
                C6496s.h(str, AttributeType.TEXT);
                C6496s.h(iconType, "icon");
                return new Cta(str, str2, iconType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Cta)) {
                    return false;
                }
                Cta cta = (Cta) obj;
                return C6496s.c(this.text, cta.text) && C6496s.c(this.subtitle, cta.subtitle) && this.icon == cta.icon;
            }

            public final IconType getIcon() {
                return this.icon;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                String str = this.subtitle;
                return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.icon.hashCode();
            }

            public String toString() {
                return "Cta(text=" + this.text + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Cta(String str, String str2, IconType iconType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, iconType);
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;", "", "text", "", "subtitle", "avatarDetails", "Lio/intercom/android/sdk/models/AvatarDetails;", "icon", "Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/AvatarDetails;Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;)V", "getText", "()Ljava/lang/String;", "getSubtitle", "getAvatarDetails", "()Lio/intercom/android/sdk/models/AvatarDetails;", "getIcon", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HomeCard {
            public static final int $stable = 8;
            @c("avatar_details")
            private final AvatarDetails avatarDetails;
            @c("icon")
            private final IconType icon;
            @c("subtitle")
            private final String subtitle;
            @c("text")
            private final String text;

            public HomeCard(String str, String str2, AvatarDetails avatarDetails2, IconType iconType) {
                C6496s.h(str, AttributeType.TEXT);
                this.text = str;
                this.subtitle = str2;
                this.avatarDetails = avatarDetails2;
                this.icon = iconType;
            }

            public static /* synthetic */ HomeCard copy$default(HomeCard homeCard, String str, String str2, AvatarDetails avatarDetails2, IconType iconType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeCard.text;
                }
                if ((i10 & 2) != 0) {
                    str2 = homeCard.subtitle;
                }
                if ((i10 & 4) != 0) {
                    avatarDetails2 = homeCard.avatarDetails;
                }
                if ((i10 & 8) != 0) {
                    iconType = homeCard.icon;
                }
                return homeCard.copy(str, str2, avatarDetails2, iconType);
            }

            public final String component1() {
                return this.text;
            }

            public final String component2() {
                return this.subtitle;
            }

            public final AvatarDetails component3() {
                return this.avatarDetails;
            }

            public final IconType component4() {
                return this.icon;
            }

            public final HomeCard copy(String str, String str2, AvatarDetails avatarDetails2, IconType iconType) {
                C6496s.h(str, AttributeType.TEXT);
                return new HomeCard(str, str2, avatarDetails2, iconType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HomeCard)) {
                    return false;
                }
                HomeCard homeCard = (HomeCard) obj;
                return C6496s.c(this.text, homeCard.text) && C6496s.c(this.subtitle, homeCard.subtitle) && C6496s.c(this.avatarDetails, homeCard.avatarDetails) && this.icon == homeCard.icon;
            }

            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }

            public final IconType getIcon() {
                return this.icon;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                String str = this.subtitle;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                AvatarDetails avatarDetails2 = this.avatarDetails;
                int hashCode3 = (hashCode2 + (avatarDetails2 == null ? 0 : avatarDetails2.hashCode())) * 31;
                IconType iconType = this.icon;
                if (iconType != null) {
                    i10 = iconType.hashCode();
                }
                return hashCode3 + i10;
            }

            public String toString() {
                return "HomeCard(text=" + this.text + ", subtitle=" + this.subtitle + ", avatarDetails=" + this.avatarDetails + ", icon=" + this.icon + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ HomeCard(String str, String str2, AvatarDetails avatarDetails2, IconType iconType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : avatarDetails2, (i10 & 8) != 0 ? null : iconType);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NewConversationData(Cta cta2, HomeCard homeCard2, List list, List list2, Header header2, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cta2, homeCard2, (i10 & 4) != 0 ? C6565s.n() : list, (i10 & 8) != 0 ? C6565s.n() : list2, (i10 & 16) != 0 ? null : header2, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? null : str2);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OpenMessengerResponse(io.intercom.android.sdk.models.ComposerSuggestions r7, io.intercom.android.sdk.models.OpenMessengerResponse.NewConversationData r8, io.intercom.android.sdk.models.ComposerState r9, java.lang.String r10, io.intercom.android.sdk.models.PoweredBy r11, java.util.List r12, io.intercom.android.sdk.models.PrivacyNotice r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0019
            io.intercom.android.sdk.models.ComposerState$Companion r7 = io.intercom.android.sdk.models.ComposerState.Companion
            io.intercom.android.sdk.models.ComposerState r9 = r7.getNULL()
        L_0x0019:
            r2 = r9
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0020
            r3 = r0
            goto L_0x0021
        L_0x0020:
            r3 = r10
        L_0x0021:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0027
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r11
        L_0x0028:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x0030
            java.util.List r12 = mf.C6565s.n()
        L_0x0030:
            r5 = r12
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0037
            r14 = r0
            goto L_0x0038
        L_0x0037:
            r14 = r13
        L_0x0038:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.OpenMessengerResponse.<init>(io.intercom.android.sdk.models.ComposerSuggestions, io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData, io.intercom.android.sdk.models.ComposerState, java.lang.String, io.intercom.android.sdk.models.PoweredBy, java.util.List, io.intercom.android.sdk.models.PrivacyNotice, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
