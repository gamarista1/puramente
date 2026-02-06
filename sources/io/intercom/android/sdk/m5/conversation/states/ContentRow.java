package io.intercom.android.sdk.m5.conversation.states;

import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.tickets.TicketDetailState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0012\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0001\u0012\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "", "key", "", "getKey", "()Ljava/lang/String;", "SpecialNoticeRow", "TeamIntroRow", "BigTicketRow", "EventRow", "TicketStatusRow", "MergedConversationRow", "AskedAboutRow", "BubbleMessageRow", "PostCardRow", "NoteCardRow", "ComposerSuggestionRow", "QuickRepliesRow", "DayDividerRow", "FinAnswerRow", "FinStreamingRow", "TypingIndicatorRow", "NewMessagesRow", "FooterNoticeRow", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$AskedAboutRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BigTicketRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$ComposerSuggestionRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$DayDividerRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$EventRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FinAnswerRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FinStreamingRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FooterNoticeRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$MergedConversationRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$NewMessagesRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$NoteCardRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$PostCardRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$QuickRepliesRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$SpecialNoticeRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TeamIntroRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TicketStatusRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TypingIndicatorRow;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ContentRow {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$AskedAboutRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "part", "Lio/intercom/android/sdk/models/Part;", "<init>", "(Lio/intercom/android/sdk/models/Part;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", "key", "", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AskedAboutRow implements ContentRow {
        public static final int $stable = 8;
        private final Part part;

        public AskedAboutRow(Part part2) {
            C6496s.h(part2, "part");
            this.part = part2;
        }

        public static /* synthetic */ AskedAboutRow copy$default(AskedAboutRow askedAboutRow, Part part2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part2 = askedAboutRow.part;
            }
            return askedAboutRow.copy(part2);
        }

        public final Part component1() {
            return this.part;
        }

        public final AskedAboutRow copy(Part part2) {
            C6496s.h(part2, "part");
            return new AskedAboutRow(part2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AskedAboutRow) && C6496s.c(this.part, ((AskedAboutRow) obj).part);
        }

        public String getKey() {
            return "asked_about_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return this.part.hashCode();
        }

        public String toString() {
            return "AskedAboutRow(part=" + this.part + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BigTicketRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "ticketDetailContentState", "Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "ticketId", "", "<init>", "(Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;Ljava/lang/String;)V", "getTicketDetailContentState", "()Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "getTicketId", "()Ljava/lang/String;", "key", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BigTicketRow implements ContentRow {
        public static final int $stable = 8;
        private final TicketDetailState.TicketDetailContentState ticketDetailContentState;
        private final String ticketId;

        public BigTicketRow(TicketDetailState.TicketDetailContentState ticketDetailContentState2, String str) {
            C6496s.h(ticketDetailContentState2, "ticketDetailContentState");
            C6496s.h(str, "ticketId");
            this.ticketDetailContentState = ticketDetailContentState2;
            this.ticketId = str;
        }

        public static /* synthetic */ BigTicketRow copy$default(BigTicketRow bigTicketRow, TicketDetailState.TicketDetailContentState ticketDetailContentState2, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ticketDetailContentState2 = bigTicketRow.ticketDetailContentState;
            }
            if ((i10 & 2) != 0) {
                str = bigTicketRow.ticketId;
            }
            return bigTicketRow.copy(ticketDetailContentState2, str);
        }

        public final TicketDetailState.TicketDetailContentState component1() {
            return this.ticketDetailContentState;
        }

        public final String component2() {
            return this.ticketId;
        }

        public final BigTicketRow copy(TicketDetailState.TicketDetailContentState ticketDetailContentState2, String str) {
            C6496s.h(ticketDetailContentState2, "ticketDetailContentState");
            C6496s.h(str, "ticketId");
            return new BigTicketRow(ticketDetailContentState2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BigTicketRow)) {
                return false;
            }
            BigTicketRow bigTicketRow = (BigTicketRow) obj;
            return C6496s.c(this.ticketDetailContentState, bigTicketRow.ticketDetailContentState) && C6496s.c(this.ticketId, bigTicketRow.ticketId);
        }

        public String getKey() {
            return "big_ticket_row_" + this.ticketId;
        }

        public final TicketDetailState.TicketDetailContentState getTicketDetailContentState() {
            return this.ticketDetailContentState;
        }

        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return (this.ticketDetailContentState.hashCode() * 31) + this.ticketId.hashCode();
        }

        public String toString() {
            return "BigTicketRow(ticketDetailContentState=" + this.ticketDetailContentState + ", ticketId=" + this.ticketId + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\nH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$ComposerSuggestionRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "suggestions", "", "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "<init>", "(Ljava/util/List;)V", "getSuggestions", "()Ljava/util/List;", "key", "", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ComposerSuggestionRow implements ContentRow {
        public static final int $stable = 8;
        private final List<ReplySuggestion> suggestions;

        public ComposerSuggestionRow(List<ReplySuggestion> list) {
            C6496s.h(list, "suggestions");
            this.suggestions = list;
        }

        public static /* synthetic */ ComposerSuggestionRow copy$default(ComposerSuggestionRow composerSuggestionRow, List<ReplySuggestion> list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = composerSuggestionRow.suggestions;
            }
            return composerSuggestionRow.copy(list);
        }

        public final List<ReplySuggestion> component1() {
            return this.suggestions;
        }

        public final ComposerSuggestionRow copy(List<ReplySuggestion> list) {
            C6496s.h(list, "suggestions");
            return new ComposerSuggestionRow(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComposerSuggestionRow) && C6496s.c(this.suggestions, ((ComposerSuggestionRow) obj).suggestions);
        }

        public String getKey() {
            return "composer_suggestion_row_" + this.suggestions.hashCode();
        }

        public final List<ReplySuggestion> getSuggestions() {
            return this.suggestions;
        }

        public int hashCode() {
            return this.suggestions.hashCode();
        }

        public String toString() {
            return "ComposerSuggestionRow(suggestions=" + this.suggestions + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$DayDividerRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "timestamp", "", "<init>", "(J)V", "getTimestamp", "()J", "key", "", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DayDividerRow implements ContentRow {
        public static final int $stable = 0;
        private final long timestamp;

        public DayDividerRow(long j10) {
            this.timestamp = j10;
        }

        public static /* synthetic */ DayDividerRow copy$default(DayDividerRow dayDividerRow, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = dayDividerRow.timestamp;
            }
            return dayDividerRow.copy(j10);
        }

        public final long component1() {
            return this.timestamp;
        }

        public final DayDividerRow copy(long j10) {
            return new DayDividerRow(j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DayDividerRow) && this.timestamp == ((DayDividerRow) obj).timestamp;
        }

        public String getKey() {
            return "day_divider_row_" + Long.hashCode(this.timestamp);
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "DayDividerRow(timestamp=" + this.timestamp + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$EventRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "label", "", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "partId", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/models/Avatar;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getAvatar", "()Lio/intercom/android/sdk/models/Avatar;", "getPartId", "key", "getKey", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EventRow implements ContentRow {
        public static final int $stable = 8;
        private final Avatar avatar;
        private final String label;
        private final String partId;

        public EventRow(String str, Avatar avatar2, String str2) {
            C6496s.h(str, "label");
            C6496s.h(avatar2, "avatar");
            C6496s.h(str2, "partId");
            this.label = str;
            this.avatar = avatar2;
            this.partId = str2;
        }

        public static /* synthetic */ EventRow copy$default(EventRow eventRow, String str, Avatar avatar2, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = eventRow.label;
            }
            if ((i10 & 2) != 0) {
                avatar2 = eventRow.avatar;
            }
            if ((i10 & 4) != 0) {
                str2 = eventRow.partId;
            }
            return eventRow.copy(str, avatar2, str2);
        }

        public final String component1() {
            return this.label;
        }

        public final Avatar component2() {
            return this.avatar;
        }

        public final String component3() {
            return this.partId;
        }

        public final EventRow copy(String str, Avatar avatar2, String str2) {
            C6496s.h(str, "label");
            C6496s.h(avatar2, "avatar");
            C6496s.h(str2, "partId");
            return new EventRow(str, avatar2, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventRow)) {
                return false;
            }
            EventRow eventRow = (EventRow) obj;
            return C6496s.c(this.label, eventRow.label) && C6496s.c(this.avatar, eventRow.avatar) && C6496s.c(this.partId, eventRow.partId);
        }

        public final Avatar getAvatar() {
            return this.avatar;
        }

        public String getKey() {
            return "event_row_" + this.partId;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            return (((this.label.hashCode() * 31) + this.avatar.hashCode()) * 31) + this.partId.hashCode();
        }

        public String toString() {
            return "EventRow(label=" + this.label + ", avatar=" + this.avatar + ", partId=" + this.partId + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\rH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FinAnswerRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "part", "Lio/intercom/android/sdk/models/Part;", "groupingPosition", "Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "<init>", "(Lio/intercom/android/sdk/models/Part;Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", "getGroupingPosition", "()Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "key", "", "getKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FinAnswerRow implements ContentRow {
        public static final int $stable = 8;
        private final GroupingPosition groupingPosition;
        private final Part part;

        public FinAnswerRow(Part part2, GroupingPosition groupingPosition2) {
            C6496s.h(part2, "part");
            C6496s.h(groupingPosition2, "groupingPosition");
            this.part = part2;
            this.groupingPosition = groupingPosition2;
        }

        public static /* synthetic */ FinAnswerRow copy$default(FinAnswerRow finAnswerRow, Part part2, GroupingPosition groupingPosition2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part2 = finAnswerRow.part;
            }
            if ((i10 & 2) != 0) {
                groupingPosition2 = finAnswerRow.groupingPosition;
            }
            return finAnswerRow.copy(part2, groupingPosition2);
        }

        public final Part component1() {
            return this.part;
        }

        public final GroupingPosition component2() {
            return this.groupingPosition;
        }

        public final FinAnswerRow copy(Part part2, GroupingPosition groupingPosition2) {
            C6496s.h(part2, "part");
            C6496s.h(groupingPosition2, "groupingPosition");
            return new FinAnswerRow(part2, groupingPosition2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinAnswerRow)) {
                return false;
            }
            FinAnswerRow finAnswerRow = (FinAnswerRow) obj;
            return C6496s.c(this.part, finAnswerRow.part) && this.groupingPosition == finAnswerRow.groupingPosition;
        }

        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        public String getKey() {
            return "fin_answer_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return (this.part.hashCode() * 31) + this.groupingPosition.hashCode();
        }

        public String toString() {
            return "FinAnswerRow(part=" + this.part + ", groupingPosition=" + this.groupingPosition + ')';
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u000eH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FinStreamingRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "streamingPart", "Lio/intercom/android/sdk/models/StreamingPart;", "<init>", "(Ljava/util/List;Lio/intercom/android/sdk/models/StreamingPart;)V", "getBlocks", "()Ljava/util/List;", "getStreamingPart", "()Lio/intercom/android/sdk/models/StreamingPart;", "key", "", "getKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FinStreamingRow implements ContentRow {
        public static final int $stable = 8;
        private final List<Block> blocks;
        private final StreamingPart streamingPart;

        public FinStreamingRow(List<? extends Block> list, StreamingPart streamingPart2) {
            C6496s.h(list, "blocks");
            C6496s.h(streamingPart2, "streamingPart");
            this.blocks = list;
            this.streamingPart = streamingPart2;
        }

        public static /* synthetic */ FinStreamingRow copy$default(FinStreamingRow finStreamingRow, List<Block> list, StreamingPart streamingPart2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = finStreamingRow.blocks;
            }
            if ((i10 & 2) != 0) {
                streamingPart2 = finStreamingRow.streamingPart;
            }
            return finStreamingRow.copy(list, streamingPart2);
        }

        public final List<Block> component1() {
            return this.blocks;
        }

        public final StreamingPart component2() {
            return this.streamingPart;
        }

        public final FinStreamingRow copy(List<? extends Block> list, StreamingPart streamingPart2) {
            C6496s.h(list, "blocks");
            C6496s.h(streamingPart2, "streamingPart");
            return new FinStreamingRow(list, streamingPart2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinStreamingRow)) {
                return false;
            }
            FinStreamingRow finStreamingRow = (FinStreamingRow) obj;
            return C6496s.c(this.blocks, finStreamingRow.blocks) && C6496s.c(this.streamingPart, finStreamingRow.streamingPart);
        }

        public final List<Block> getBlocks() {
            return this.blocks;
        }

        public String getKey() {
            return "fin_streaming_row_" + this.blocks.hashCode();
        }

        public final StreamingPart getStreamingPart() {
            return this.streamingPart;
        }

        public int hashCode() {
            return (this.blocks.hashCode() * 31) + this.streamingPart.hashCode();
        }

        public String toString() {
            return "FinStreamingRow(blocks=" + this.blocks + ", streamingPart=" + this.streamingPart + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FooterNoticeRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "footerNoticeState", "Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;)V", "getFooterNoticeState", "()Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;", "key", "", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FooterNoticeRow implements ContentRow {
        public static final int $stable = 8;
        private final FooterNoticeState footerNoticeState;

        public FooterNoticeRow(FooterNoticeState footerNoticeState2) {
            C6496s.h(footerNoticeState2, "footerNoticeState");
            this.footerNoticeState = footerNoticeState2;
        }

        public static /* synthetic */ FooterNoticeRow copy$default(FooterNoticeRow footerNoticeRow, FooterNoticeState footerNoticeState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                footerNoticeState2 = footerNoticeRow.footerNoticeState;
            }
            return footerNoticeRow.copy(footerNoticeState2);
        }

        public final FooterNoticeState component1() {
            return this.footerNoticeState;
        }

        public final FooterNoticeRow copy(FooterNoticeState footerNoticeState2) {
            C6496s.h(footerNoticeState2, "footerNoticeState");
            return new FooterNoticeRow(footerNoticeState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterNoticeRow) && C6496s.c(this.footerNoticeState, ((FooterNoticeRow) obj).footerNoticeState);
        }

        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        public String getKey() {
            return "footer_notice_row_" + this.footerNoticeState.hashCode();
        }

        public int hashCode() {
            return this.footerNoticeState.hashCode();
        }

        public String toString() {
            return "FooterNoticeRow(footerNoticeState=" + this.footerNoticeState + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$MergedConversationRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "description", "", "conversationId", "partId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getConversationId", "getPartId", "key", "getKey", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MergedConversationRow implements ContentRow {
        public static final int $stable = 0;
        private final String conversationId;
        private final String description;
        private final String partId;

        public MergedConversationRow(String str, String str2, String str3) {
            C6496s.h(str3, "partId");
            this.description = str;
            this.conversationId = str2;
            this.partId = str3;
        }

        public static /* synthetic */ MergedConversationRow copy$default(MergedConversationRow mergedConversationRow, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = mergedConversationRow.description;
            }
            if ((i10 & 2) != 0) {
                str2 = mergedConversationRow.conversationId;
            }
            if ((i10 & 4) != 0) {
                str3 = mergedConversationRow.partId;
            }
            return mergedConversationRow.copy(str, str2, str3);
        }

        public final String component1() {
            return this.description;
        }

        public final String component2() {
            return this.conversationId;
        }

        public final String component3() {
            return this.partId;
        }

        public final MergedConversationRow copy(String str, String str2, String str3) {
            C6496s.h(str3, "partId");
            return new MergedConversationRow(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MergedConversationRow)) {
                return false;
            }
            MergedConversationRow mergedConversationRow = (MergedConversationRow) obj;
            return C6496s.c(this.description, mergedConversationRow.description) && C6496s.c(this.conversationId, mergedConversationRow.conversationId) && C6496s.c(this.partId, mergedConversationRow.partId);
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getDescription() {
            return this.description;
        }

        public String getKey() {
            return "merged_conversation_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            String str = this.description;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.conversationId;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return ((hashCode + i10) * 31) + this.partId.hashCode();
        }

        public String toString() {
            return "MergedConversationRow(description=" + this.description + ", conversationId=" + this.conversationId + ", partId=" + this.partId + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$NewMessagesRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "partId", "", "<init>", "(Ljava/lang/String;)V", "getPartId", "()Ljava/lang/String;", "key", "getKey", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NewMessagesRow implements ContentRow {
        public static final int $stable = 0;
        private final String partId;

        public NewMessagesRow(String str) {
            C6496s.h(str, "partId");
            this.partId = str;
        }

        public static /* synthetic */ NewMessagesRow copy$default(NewMessagesRow newMessagesRow, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = newMessagesRow.partId;
            }
            return newMessagesRow.copy(str);
        }

        public final String component1() {
            return this.partId;
        }

        public final NewMessagesRow copy(String str) {
            C6496s.h(str, "partId");
            return new NewMessagesRow(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewMessagesRow) && C6496s.c(this.partId, ((NewMessagesRow) obj).partId);
        }

        public String getKey() {
            return "new_messages_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            return this.partId.hashCode();
        }

        public String toString() {
            return "NewMessagesRow(partId=" + this.partId + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$NoteCardRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "part", "Lio/intercom/android/sdk/models/Part;", "companyName", "", "<init>", "(Lio/intercom/android/sdk/models/Part;Ljava/lang/String;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", "getCompanyName", "()Ljava/lang/String;", "key", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoteCardRow implements ContentRow {
        public static final int $stable = 8;
        private final String companyName;
        private final Part part;

        public NoteCardRow(Part part2, String str) {
            C6496s.h(part2, "part");
            C6496s.h(str, "companyName");
            this.part = part2;
            this.companyName = str;
        }

        public static /* synthetic */ NoteCardRow copy$default(NoteCardRow noteCardRow, Part part2, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part2 = noteCardRow.part;
            }
            if ((i10 & 2) != 0) {
                str = noteCardRow.companyName;
            }
            return noteCardRow.copy(part2, str);
        }

        public final Part component1() {
            return this.part;
        }

        public final String component2() {
            return this.companyName;
        }

        public final NoteCardRow copy(Part part2, String str) {
            C6496s.h(part2, "part");
            C6496s.h(str, "companyName");
            return new NoteCardRow(part2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoteCardRow)) {
                return false;
            }
            NoteCardRow noteCardRow = (NoteCardRow) obj;
            return C6496s.c(this.part, noteCardRow.part) && C6496s.c(this.companyName, noteCardRow.companyName);
        }

        public final String getCompanyName() {
            return this.companyName;
        }

        public String getKey() {
            return "note_card_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return (this.part.hashCode() * 31) + this.companyName.hashCode();
        }

        public String toString() {
            return "NoteCardRow(part=" + this.part + ", companyName=" + this.companyName + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$PostCardRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "part", "Lio/intercom/android/sdk/models/Part;", "companyName", "", "<init>", "(Lio/intercom/android/sdk/models/Part;Ljava/lang/String;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", "getCompanyName", "()Ljava/lang/String;", "key", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PostCardRow implements ContentRow {
        public static final int $stable = 8;
        private final String companyName;
        private final Part part;

        public PostCardRow(Part part2, String str) {
            C6496s.h(part2, "part");
            C6496s.h(str, "companyName");
            this.part = part2;
            this.companyName = str;
        }

        public static /* synthetic */ PostCardRow copy$default(PostCardRow postCardRow, Part part2, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                part2 = postCardRow.part;
            }
            if ((i10 & 2) != 0) {
                str = postCardRow.companyName;
            }
            return postCardRow.copy(part2, str);
        }

        public final Part component1() {
            return this.part;
        }

        public final String component2() {
            return this.companyName;
        }

        public final PostCardRow copy(Part part2, String str) {
            C6496s.h(part2, "part");
            C6496s.h(str, "companyName");
            return new PostCardRow(part2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PostCardRow)) {
                return false;
            }
            PostCardRow postCardRow = (PostCardRow) obj;
            return C6496s.c(this.part, postCardRow.part) && C6496s.c(this.companyName, postCardRow.companyName);
        }

        public final String getCompanyName() {
            return this.companyName;
        }

        public String getKey() {
            return "post_card_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return (this.part.hashCode() * 31) + this.companyName.hashCode();
        }

        public String toString() {
            return "PostCardRow(part=" + this.part + ", companyName=" + this.companyName + ')';
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0006H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$QuickRepliesRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "replyOptions", "", "Lio/intercom/android/sdk/models/ReplyOption;", "partId", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getReplyOptions", "()Ljava/util/List;", "getPartId", "()Ljava/lang/String;", "key", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class QuickRepliesRow implements ContentRow {
        public static final int $stable = 8;
        private final String partId;
        private final List<ReplyOption> replyOptions;

        public QuickRepliesRow(List<ReplyOption> list, String str) {
            C6496s.h(list, "replyOptions");
            C6496s.h(str, "partId");
            this.replyOptions = list;
            this.partId = str;
        }

        public static /* synthetic */ QuickRepliesRow copy$default(QuickRepliesRow quickRepliesRow, List<ReplyOption> list, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = quickRepliesRow.replyOptions;
            }
            if ((i10 & 2) != 0) {
                str = quickRepliesRow.partId;
            }
            return quickRepliesRow.copy(list, str);
        }

        public final List<ReplyOption> component1() {
            return this.replyOptions;
        }

        public final String component2() {
            return this.partId;
        }

        public final QuickRepliesRow copy(List<ReplyOption> list, String str) {
            C6496s.h(list, "replyOptions");
            C6496s.h(str, "partId");
            return new QuickRepliesRow(list, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickRepliesRow)) {
                return false;
            }
            QuickRepliesRow quickRepliesRow = (QuickRepliesRow) obj;
            return C6496s.c(this.replyOptions, quickRepliesRow.replyOptions) && C6496s.c(this.partId, quickRepliesRow.partId);
        }

        public String getKey() {
            return "quick_replies_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public final List<ReplyOption> getReplyOptions() {
            return this.replyOptions;
        }

        public int hashCode() {
            return (this.replyOptions.hashCode() * 31) + this.partId.hashCode();
        }

        public String toString() {
            return "QuickRepliesRow(replyOptions=" + this.replyOptions + ", partId=" + this.partId + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$SpecialNoticeRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "key", "getKey", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SpecialNoticeRow implements ContentRow {
        public static final int $stable = 0;
        private final String message;

        public SpecialNoticeRow(String str) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            this.message = str;
        }

        public static /* synthetic */ SpecialNoticeRow copy$default(SpecialNoticeRow specialNoticeRow, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = specialNoticeRow.message;
            }
            return specialNoticeRow.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final SpecialNoticeRow copy(String str) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            return new SpecialNoticeRow(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SpecialNoticeRow) && C6496s.c(this.message, ((SpecialNoticeRow) obj).message);
        }

        public String getKey() {
            return "special_notice_row_" + this.message.hashCode();
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "SpecialNoticeRow(message=" + this.message + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TeamIntroRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "key", "getKey", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TeamIntroRow implements ContentRow {
        public static final int $stable = 0;
        private final String message;

        public TeamIntroRow(String str) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            this.message = str;
        }

        public static /* synthetic */ TeamIntroRow copy$default(TeamIntroRow teamIntroRow, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = teamIntroRow.message;
            }
            return teamIntroRow.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final TeamIntroRow copy(String str) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            return new TeamIntroRow(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TeamIntroRow) && C6496s.c(this.message, ((TeamIntroRow) obj).message);
        }

        public String getKey() {
            return "team_intro_row_" + this.message.hashCode();
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "TeamIntroRow(message=" + this.message + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\"H×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TicketStatusRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "ticketEventStatus", "", "ticketStatusText", "createdAt", "", "customStateLabel", "customStatePrefix", "partId", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTicketEventStatus", "()Ljava/lang/String;", "getTicketStatusText", "getCreatedAt", "()J", "getCustomStateLabel", "getCustomStatePrefix", "getPartId", "key", "getKey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TicketStatusRow implements ContentRow {
        public static final int $stable = 0;
        private final long createdAt;
        private final String customStateLabel;
        private final String customStatePrefix;
        private final String partId;
        private final String ticketEventStatus;
        private final String ticketStatusText;

        public TicketStatusRow(String str, String str2, long j10, String str3, String str4, String str5) {
            C6496s.h(str, "ticketEventStatus");
            C6496s.h(str2, "ticketStatusText");
            C6496s.h(str5, "partId");
            this.ticketEventStatus = str;
            this.ticketStatusText = str2;
            this.createdAt = j10;
            this.customStateLabel = str3;
            this.customStatePrefix = str4;
            this.partId = str5;
        }

        public static /* synthetic */ TicketStatusRow copy$default(TicketStatusRow ticketStatusRow, String str, String str2, long j10, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ticketStatusRow.ticketEventStatus;
            }
            if ((i10 & 2) != 0) {
                str2 = ticketStatusRow.ticketStatusText;
            }
            String str6 = str2;
            if ((i10 & 4) != 0) {
                j10 = ticketStatusRow.createdAt;
            }
            long j11 = j10;
            if ((i10 & 8) != 0) {
                str3 = ticketStatusRow.customStateLabel;
            }
            String str7 = str3;
            if ((i10 & 16) != 0) {
                str4 = ticketStatusRow.customStatePrefix;
            }
            String str8 = str4;
            if ((i10 & 32) != 0) {
                str5 = ticketStatusRow.partId;
            }
            return ticketStatusRow.copy(str, str6, j11, str7, str8, str5);
        }

        public final String component1() {
            return this.ticketEventStatus;
        }

        public final String component2() {
            return this.ticketStatusText;
        }

        public final long component3() {
            return this.createdAt;
        }

        public final String component4() {
            return this.customStateLabel;
        }

        public final String component5() {
            return this.customStatePrefix;
        }

        public final String component6() {
            return this.partId;
        }

        public final TicketStatusRow copy(String str, String str2, long j10, String str3, String str4, String str5) {
            C6496s.h(str, "ticketEventStatus");
            C6496s.h(str2, "ticketStatusText");
            String str6 = str5;
            C6496s.h(str6, "partId");
            return new TicketStatusRow(str, str2, j10, str3, str4, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketStatusRow)) {
                return false;
            }
            TicketStatusRow ticketStatusRow = (TicketStatusRow) obj;
            return C6496s.c(this.ticketEventStatus, ticketStatusRow.ticketEventStatus) && C6496s.c(this.ticketStatusText, ticketStatusRow.ticketStatusText) && this.createdAt == ticketStatusRow.createdAt && C6496s.c(this.customStateLabel, ticketStatusRow.customStateLabel) && C6496s.c(this.customStatePrefix, ticketStatusRow.customStatePrefix) && C6496s.c(this.partId, ticketStatusRow.partId);
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final String getCustomStateLabel() {
            return this.customStateLabel;
        }

        public final String getCustomStatePrefix() {
            return this.customStatePrefix;
        }

        public String getKey() {
            return "ticket_status_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public final String getTicketEventStatus() {
            return this.ticketEventStatus;
        }

        public final String getTicketStatusText() {
            return this.ticketStatusText;
        }

        public int hashCode() {
            int hashCode = ((((this.ticketEventStatus.hashCode() * 31) + this.ticketStatusText.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31;
            String str = this.customStateLabel;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customStatePrefix;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.partId.hashCode();
        }

        public String toString() {
            return "TicketStatusRow(ticketEventStatus=" + this.ticketEventStatus + ", ticketStatusText=" + this.ticketStatusText + ", createdAt=" + this.createdAt + ", customStateLabel=" + this.customStateLabel + ", customStatePrefix=" + this.customStatePrefix + ", partId=" + this.partId + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TypingIndicatorRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "currentlyTypingState", "Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;)V", "getCurrentlyTypingState", "()Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "key", "", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TypingIndicatorRow implements ContentRow {
        public static final int $stable = 8;
        private final CurrentlyTypingState currentlyTypingState;

        public TypingIndicatorRow(CurrentlyTypingState currentlyTypingState2) {
            C6496s.h(currentlyTypingState2, "currentlyTypingState");
            this.currentlyTypingState = currentlyTypingState2;
        }

        public static /* synthetic */ TypingIndicatorRow copy$default(TypingIndicatorRow typingIndicatorRow, CurrentlyTypingState currentlyTypingState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                currentlyTypingState2 = typingIndicatorRow.currentlyTypingState;
            }
            return typingIndicatorRow.copy(currentlyTypingState2);
        }

        public final CurrentlyTypingState component1() {
            return this.currentlyTypingState;
        }

        public final TypingIndicatorRow copy(CurrentlyTypingState currentlyTypingState2) {
            C6496s.h(currentlyTypingState2, "currentlyTypingState");
            return new TypingIndicatorRow(currentlyTypingState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypingIndicatorRow) && C6496s.c(this.currentlyTypingState, ((TypingIndicatorRow) obj).currentlyTypingState);
        }

        public final CurrentlyTypingState getCurrentlyTypingState() {
            return this.currentlyTypingState;
        }

        public String getKey() {
            return "typing_indicator_row_" + this.currentlyTypingState.hashCode();
        }

        public int hashCode() {
            return this.currentlyTypingState.hashCode();
        }

        public String toString() {
            return "TypingIndicatorRow(currentlyTypingState=" + this.currentlyTypingState + ')';
        }
    }

    String getKey();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001$B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\"H×\u0001J\t\u0010#\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "partWrapper", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow$PartWrapper;", "groupingPosition", "Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "failedImageUploadData", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "isFailed", "", "isPending", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow$PartWrapper;Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;ZZ)V", "getPartWrapper", "()Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow$PartWrapper;", "getGroupingPosition", "()Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "getFailedImageUploadData", "()Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "()Z", "key", "", "getKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "PartWrapper", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BubbleMessageRow implements ContentRow {
        public static final int $stable = 8;
        private final PendingMessage.FailedImageUploadData failedImageUploadData;
        private final GroupingPosition groupingPosition;
        private final boolean isFailed;
        private final boolean isPending;
        private final PartWrapper partWrapper;

        public BubbleMessageRow(PartWrapper partWrapper2, GroupingPosition groupingPosition2, PendingMessage.FailedImageUploadData failedImageUploadData2, boolean z10, boolean z11) {
            C6496s.h(partWrapper2, "partWrapper");
            C6496s.h(groupingPosition2, "groupingPosition");
            this.partWrapper = partWrapper2;
            this.groupingPosition = groupingPosition2;
            this.failedImageUploadData = failedImageUploadData2;
            this.isFailed = z10;
            this.isPending = z11;
        }

        public static /* synthetic */ BubbleMessageRow copy$default(BubbleMessageRow bubbleMessageRow, PartWrapper partWrapper2, GroupingPosition groupingPosition2, PendingMessage.FailedImageUploadData failedImageUploadData2, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                partWrapper2 = bubbleMessageRow.partWrapper;
            }
            if ((i10 & 2) != 0) {
                groupingPosition2 = bubbleMessageRow.groupingPosition;
            }
            GroupingPosition groupingPosition3 = groupingPosition2;
            if ((i10 & 4) != 0) {
                failedImageUploadData2 = bubbleMessageRow.failedImageUploadData;
            }
            PendingMessage.FailedImageUploadData failedImageUploadData3 = failedImageUploadData2;
            if ((i10 & 8) != 0) {
                z10 = bubbleMessageRow.isFailed;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = bubbleMessageRow.isPending;
            }
            return bubbleMessageRow.copy(partWrapper2, groupingPosition3, failedImageUploadData3, z12, z11);
        }

        public final PartWrapper component1() {
            return this.partWrapper;
        }

        public final GroupingPosition component2() {
            return this.groupingPosition;
        }

        public final PendingMessage.FailedImageUploadData component3() {
            return this.failedImageUploadData;
        }

        public final boolean component4() {
            return this.isFailed;
        }

        public final boolean component5() {
            return this.isPending;
        }

        public final BubbleMessageRow copy(PartWrapper partWrapper2, GroupingPosition groupingPosition2, PendingMessage.FailedImageUploadData failedImageUploadData2, boolean z10, boolean z11) {
            C6496s.h(partWrapper2, "partWrapper");
            C6496s.h(groupingPosition2, "groupingPosition");
            return new BubbleMessageRow(partWrapper2, groupingPosition2, failedImageUploadData2, z10, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BubbleMessageRow)) {
                return false;
            }
            BubbleMessageRow bubbleMessageRow = (BubbleMessageRow) obj;
            return C6496s.c(this.partWrapper, bubbleMessageRow.partWrapper) && this.groupingPosition == bubbleMessageRow.groupingPosition && C6496s.c(this.failedImageUploadData, bubbleMessageRow.failedImageUploadData) && this.isFailed == bubbleMessageRow.isFailed && this.isPending == bubbleMessageRow.isPending;
        }

        public final PendingMessage.FailedImageUploadData getFailedImageUploadData() {
            return this.failedImageUploadData;
        }

        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        public String getKey() {
            return "message_row_" + this.partWrapper.getPart().getId();
        }

        public final PartWrapper getPartWrapper() {
            return this.partWrapper;
        }

        public int hashCode() {
            int hashCode = ((this.partWrapper.hashCode() * 31) + this.groupingPosition.hashCode()) * 31;
            PendingMessage.FailedImageUploadData failedImageUploadData2 = this.failedImageUploadData;
            return ((((hashCode + (failedImageUploadData2 == null ? 0 : failedImageUploadData2.hashCode())) * 31) + Boolean.hashCode(this.isFailed)) * 31) + Boolean.hashCode(this.isPending);
        }

        public final boolean isFailed() {
            return this.isFailed;
        }

        public final boolean isPending() {
            return this.isPending;
        }

        public String toString() {
            return "BubbleMessageRow(partWrapper=" + this.partWrapper + ", groupingPosition=" + this.groupingPosition + ", failedImageUploadData=" + this.failedImageUploadData + ", isFailed=" + this.isFailed + ", isPending=" + this.isPending + ')';
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow$PartWrapper;", "", "part", "Lio/intercom/android/sdk/models/Part;", "isLastPart", "", "isAdminOrAltParticipant", "failedAttributeIdentifiers", "", "", "loadingAttributeIdentifiers", "<init>", "(Lio/intercom/android/sdk/models/Part;ZZLjava/util/List;Ljava/util/List;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", "()Z", "getFailedAttributeIdentifiers", "()Ljava/util/List;", "getLoadingAttributeIdentifiers", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PartWrapper {
            public static final int $stable = 8;
            private final List<String> failedAttributeIdentifiers;
            private final boolean isAdminOrAltParticipant;
            private final boolean isLastPart;
            private final List<String> loadingAttributeIdentifiers;
            private final Part part;

            public PartWrapper(Part part2, boolean z10, boolean z11, List<String> list, List<String> list2) {
                C6496s.h(part2, "part");
                C6496s.h(list, "failedAttributeIdentifiers");
                C6496s.h(list2, "loadingAttributeIdentifiers");
                this.part = part2;
                this.isLastPart = z10;
                this.isAdminOrAltParticipant = z11;
                this.failedAttributeIdentifiers = list;
                this.loadingAttributeIdentifiers = list2;
            }

            public static /* synthetic */ PartWrapper copy$default(PartWrapper partWrapper, Part part2, boolean z10, boolean z11, List<String> list, List<String> list2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    part2 = partWrapper.part;
                }
                if ((i10 & 2) != 0) {
                    z10 = partWrapper.isLastPart;
                }
                boolean z12 = z10;
                if ((i10 & 4) != 0) {
                    z11 = partWrapper.isAdminOrAltParticipant;
                }
                boolean z13 = z11;
                if ((i10 & 8) != 0) {
                    list = partWrapper.failedAttributeIdentifiers;
                }
                List<String> list3 = list;
                if ((i10 & 16) != 0) {
                    list2 = partWrapper.loadingAttributeIdentifiers;
                }
                return partWrapper.copy(part2, z12, z13, list3, list2);
            }

            public final Part component1() {
                return this.part;
            }

            public final boolean component2() {
                return this.isLastPart;
            }

            public final boolean component3() {
                return this.isAdminOrAltParticipant;
            }

            public final List<String> component4() {
                return this.failedAttributeIdentifiers;
            }

            public final List<String> component5() {
                return this.loadingAttributeIdentifiers;
            }

            public final PartWrapper copy(Part part2, boolean z10, boolean z11, List<String> list, List<String> list2) {
                C6496s.h(part2, "part");
                C6496s.h(list, "failedAttributeIdentifiers");
                C6496s.h(list2, "loadingAttributeIdentifiers");
                return new PartWrapper(part2, z10, z11, list, list2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PartWrapper)) {
                    return false;
                }
                PartWrapper partWrapper = (PartWrapper) obj;
                return C6496s.c(this.part, partWrapper.part) && this.isLastPart == partWrapper.isLastPart && this.isAdminOrAltParticipant == partWrapper.isAdminOrAltParticipant && C6496s.c(this.failedAttributeIdentifiers, partWrapper.failedAttributeIdentifiers) && C6496s.c(this.loadingAttributeIdentifiers, partWrapper.loadingAttributeIdentifiers);
            }

            public final List<String> getFailedAttributeIdentifiers() {
                return this.failedAttributeIdentifiers;
            }

            public final List<String> getLoadingAttributeIdentifiers() {
                return this.loadingAttributeIdentifiers;
            }

            public final Part getPart() {
                return this.part;
            }

            public int hashCode() {
                return (((((((this.part.hashCode() * 31) + Boolean.hashCode(this.isLastPart)) * 31) + Boolean.hashCode(this.isAdminOrAltParticipant)) * 31) + this.failedAttributeIdentifiers.hashCode()) * 31) + this.loadingAttributeIdentifiers.hashCode();
            }

            public final boolean isAdminOrAltParticipant() {
                return this.isAdminOrAltParticipant;
            }

            public final boolean isLastPart() {
                return this.isLastPart;
            }

            public String toString() {
                return "PartWrapper(part=" + this.part + ", isLastPart=" + this.isLastPart + ", isAdminOrAltParticipant=" + this.isAdminOrAltParticipant + ", failedAttributeIdentifiers=" + this.failedAttributeIdentifiers + ", loadingAttributeIdentifiers=" + this.loadingAttributeIdentifiers + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ PartWrapper(Part part2, boolean z10, boolean z11, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(part2, z10, z11, (i10 & 8) != 0 ? C6565s.n() : list, (i10 & 16) != 0 ? C6565s.n() : list2);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BubbleMessageRow(PartWrapper partWrapper2, GroupingPosition groupingPosition2, PendingMessage.FailedImageUploadData failedImageUploadData2, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(partWrapper2, groupingPosition2, failedImageUploadData2, z10, (i10 & 16) != 0 ? false : z11);
        }
    }
}
