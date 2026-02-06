package io.intercom.android.sdk.helpcenter.articles;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "", "<init>", "()V", "Initial", "Content", "TeamPresenceState", "ConversationState", "ReactionState", "WebViewStatus", "Error", "Reaction", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Initial;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ArticleViewState {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020#H×\u0001J\t\u0010$\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "articleUrl", "", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "webViewStatus", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "reactionState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "getArticleUrl", "()Ljava/lang/String;", "getArticleMetadata", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "getWebViewStatus", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "getReactionState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content extends ArticleViewState {
        public static final int $stable = 0;
        private final ArticleMetadata articleMetadata;
        private final String articleUrl;
        private final ReactionState reactionState;
        private final TeamPresenceState teamPresenceState;
        private final WebViewStatus webViewStatus;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Content(String str, ArticleMetadata articleMetadata2, WebViewStatus webViewStatus2, ReactionState reactionState2, TeamPresenceState teamPresenceState2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "articleUrl");
            C6496s.h(webViewStatus2, "webViewStatus");
            C6496s.h(reactionState2, "reactionState");
            C6496s.h(teamPresenceState2, "teamPresenceState");
            this.articleUrl = str;
            this.articleMetadata = articleMetadata2;
            this.webViewStatus = webViewStatus2;
            this.reactionState = reactionState2;
            this.teamPresenceState = teamPresenceState2;
        }

        public static /* synthetic */ Content copy$default(Content content, String str, ArticleMetadata articleMetadata2, WebViewStatus webViewStatus2, ReactionState reactionState2, TeamPresenceState teamPresenceState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = content.articleUrl;
            }
            if ((i10 & 2) != 0) {
                articleMetadata2 = content.articleMetadata;
            }
            ArticleMetadata articleMetadata3 = articleMetadata2;
            if ((i10 & 4) != 0) {
                webViewStatus2 = content.webViewStatus;
            }
            WebViewStatus webViewStatus3 = webViewStatus2;
            if ((i10 & 8) != 0) {
                reactionState2 = content.reactionState;
            }
            ReactionState reactionState3 = reactionState2;
            if ((i10 & 16) != 0) {
                teamPresenceState2 = content.teamPresenceState;
            }
            return content.copy(str, articleMetadata3, webViewStatus3, reactionState3, teamPresenceState2);
        }

        public final String component1() {
            return this.articleUrl;
        }

        public final ArticleMetadata component2() {
            return this.articleMetadata;
        }

        public final WebViewStatus component3() {
            return this.webViewStatus;
        }

        public final ReactionState component4() {
            return this.reactionState;
        }

        public final TeamPresenceState component5() {
            return this.teamPresenceState;
        }

        public final Content copy(String str, ArticleMetadata articleMetadata2, WebViewStatus webViewStatus2, ReactionState reactionState2, TeamPresenceState teamPresenceState2) {
            C6496s.h(str, "articleUrl");
            C6496s.h(webViewStatus2, "webViewStatus");
            C6496s.h(reactionState2, "reactionState");
            C6496s.h(teamPresenceState2, "teamPresenceState");
            return new Content(str, articleMetadata2, webViewStatus2, reactionState2, teamPresenceState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return C6496s.c(this.articleUrl, content.articleUrl) && C6496s.c(this.articleMetadata, content.articleMetadata) && this.webViewStatus == content.webViewStatus && C6496s.c(this.reactionState, content.reactionState) && C6496s.c(this.teamPresenceState, content.teamPresenceState);
        }

        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        public final String getArticleUrl() {
            return this.articleUrl;
        }

        public final ReactionState getReactionState() {
            return this.reactionState;
        }

        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public final WebViewStatus getWebViewStatus() {
            return this.webViewStatus;
        }

        public int hashCode() {
            int hashCode = this.articleUrl.hashCode() * 31;
            ArticleMetadata articleMetadata2 = this.articleMetadata;
            return ((((((hashCode + (articleMetadata2 == null ? 0 : articleMetadata2.hashCode())) * 31) + this.webViewStatus.hashCode()) * 31) + this.reactionState.hashCode()) * 31) + this.teamPresenceState.hashCode();
        }

        public String toString() {
            return "Content(articleUrl=" + this.articleUrl + ", articleMetadata=" + this.articleMetadata + ", webViewStatus=" + this.webViewStatus + ", reactionState=" + this.reactionState + ", teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "message", "", "retryButtonVisibility", "retryButtonPrimaryColor", "<init>", "(III)V", "getMessage", "()I", "getRetryButtonVisibility", "getRetryButtonPrimaryColor", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends ArticleViewState {
        public static final int $stable = 0;
        private final int message;
        private final int retryButtonPrimaryColor;
        private final int retryButtonVisibility;

        public Error(int i10, int i11, int i12) {
            super((DefaultConstructorMarker) null);
            this.message = i10;
            this.retryButtonVisibility = i11;
            this.retryButtonPrimaryColor = i12;
        }

        public static /* synthetic */ Error copy$default(Error error, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = error.message;
            }
            if ((i13 & 2) != 0) {
                i11 = error.retryButtonVisibility;
            }
            if ((i13 & 4) != 0) {
                i12 = error.retryButtonPrimaryColor;
            }
            return error.copy(i10, i11, i12);
        }

        public final int component1() {
            return this.message;
        }

        public final int component2() {
            return this.retryButtonVisibility;
        }

        public final int component3() {
            return this.retryButtonPrimaryColor;
        }

        public final Error copy(int i10, int i11, int i12) {
            return new Error(i10, i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.message == error.message && this.retryButtonVisibility == error.retryButtonVisibility && this.retryButtonPrimaryColor == error.retryButtonPrimaryColor;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getRetryButtonPrimaryColor() {
            return this.retryButtonPrimaryColor;
        }

        public final int getRetryButtonVisibility() {
            return this.retryButtonVisibility;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.message) * 31) + Integer.hashCode(this.retryButtonVisibility)) * 31) + Integer.hashCode(this.retryButtonPrimaryColor);
        }

        public String toString() {
            return "Error(message=" + this.message + ", retryButtonVisibility=" + this.retryButtonVisibility + ", retryButtonPrimaryColor=" + this.retryButtonPrimaryColor + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Initial;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initial extends ArticleViewState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Sad", "Neutral", "Happy", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Reaction {
        None,
        Sad,
        Neutral,
        Happy;

        static {
            Reaction[] $values;
            $ENTRIES = C6714a.a($values);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Idle", "Loading", "Ready", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum WebViewStatus {
        Idle,
        Loading,
        Ready;

        static {
            WebViewStatus[] $values;
            $ENTRIES = C6714a.a($values);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ ArticleViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ArticleViewState() {
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0005H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "", "conversationId", "", "messageButtonText", "", "<init>", "(Ljava/lang/String;I)V", "getConversationId", "()Ljava/lang/String;", "getMessageButtonText", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConversationState {
        public static final int $stable = 0;
        private final String conversationId;
        private final int messageButtonText;

        public ConversationState(String str, int i10) {
            C6496s.h(str, "conversationId");
            this.conversationId = str;
            this.messageButtonText = i10;
        }

        public static /* synthetic */ ConversationState copy$default(ConversationState conversationState, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationState.conversationId;
            }
            if ((i11 & 2) != 0) {
                i10 = conversationState.messageButtonText;
            }
            return conversationState.copy(str, i10);
        }

        public final String component1() {
            return this.conversationId;
        }

        public final int component2() {
            return this.messageButtonText;
        }

        public final ConversationState copy(String str, int i10) {
            C6496s.h(str, "conversationId");
            return new ConversationState(str, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationState)) {
                return false;
            }
            ConversationState conversationState = (ConversationState) obj;
            return C6496s.c(this.conversationId, conversationState.conversationId) && this.messageButtonText == conversationState.messageButtonText;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        public int hashCode() {
            return (this.conversationId.hashCode() * 31) + Integer.hashCode(this.messageButtonText);
        }

        public String toString() {
            return "ConversationState(conversationId=" + this.conversationId + ", messageButtonText=" + this.messageButtonText + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ConversationState(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? R.string.intercom_continue_the_conversation : i10);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u0003H×\u0001J\t\u0010\u001d\u001a\u00020\u001eH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "", "reactionComponentVisibility", "", "transitionState", "selectedReaction", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;", "teamHelpVisibility", "shouldScrollToBottom", "", "<init>", "(IILio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;IZ)V", "getReactionComponentVisibility", "()I", "getTransitionState", "getSelectedReaction", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Reaction;", "getTeamHelpVisibility", "getShouldScrollToBottom", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReactionState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final ReactionState defaultReactionState = new ReactionState(8, R.id.start, (Reaction) null, 8, false, 4, (DefaultConstructorMarker) null);
        private final int reactionComponentVisibility;
        private final Reaction selectedReaction;
        private final boolean shouldScrollToBottom;
        private final int teamHelpVisibility;
        private final int transitionState;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState$Companion;", "", "<init>", "()V", "defaultReactionState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "getDefaultReactionState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ReactionState getDefaultReactionState() {
                return ReactionState.defaultReactionState;
            }

            private Companion() {
            }
        }

        public ReactionState(int i10, int i11, Reaction reaction, int i12, boolean z10) {
            C6496s.h(reaction, "selectedReaction");
            this.reactionComponentVisibility = i10;
            this.transitionState = i11;
            this.selectedReaction = reaction;
            this.teamHelpVisibility = i12;
            this.shouldScrollToBottom = z10;
        }

        public static /* synthetic */ ReactionState copy$default(ReactionState reactionState, int i10, int i11, Reaction reaction, int i12, boolean z10, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = reactionState.reactionComponentVisibility;
            }
            if ((i13 & 2) != 0) {
                i11 = reactionState.transitionState;
            }
            int i14 = i11;
            if ((i13 & 4) != 0) {
                reaction = reactionState.selectedReaction;
            }
            Reaction reaction2 = reaction;
            if ((i13 & 8) != 0) {
                i12 = reactionState.teamHelpVisibility;
            }
            int i15 = i12;
            if ((i13 & 16) != 0) {
                z10 = reactionState.shouldScrollToBottom;
            }
            return reactionState.copy(i10, i14, reaction2, i15, z10);
        }

        public final int component1() {
            return this.reactionComponentVisibility;
        }

        public final int component2() {
            return this.transitionState;
        }

        public final Reaction component3() {
            return this.selectedReaction;
        }

        public final int component4() {
            return this.teamHelpVisibility;
        }

        public final boolean component5() {
            return this.shouldScrollToBottom;
        }

        public final ReactionState copy(int i10, int i11, Reaction reaction, int i12, boolean z10) {
            C6496s.h(reaction, "selectedReaction");
            return new ReactionState(i10, i11, reaction, i12, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReactionState)) {
                return false;
            }
            ReactionState reactionState = (ReactionState) obj;
            return this.reactionComponentVisibility == reactionState.reactionComponentVisibility && this.transitionState == reactionState.transitionState && this.selectedReaction == reactionState.selectedReaction && this.teamHelpVisibility == reactionState.teamHelpVisibility && this.shouldScrollToBottom == reactionState.shouldScrollToBottom;
        }

        public final int getReactionComponentVisibility() {
            return this.reactionComponentVisibility;
        }

        public final Reaction getSelectedReaction() {
            return this.selectedReaction;
        }

        public final boolean getShouldScrollToBottom() {
            return this.shouldScrollToBottom;
        }

        public final int getTeamHelpVisibility() {
            return this.teamHelpVisibility;
        }

        public final int getTransitionState() {
            return this.transitionState;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.reactionComponentVisibility) * 31) + Integer.hashCode(this.transitionState)) * 31) + this.selectedReaction.hashCode()) * 31) + Integer.hashCode(this.teamHelpVisibility)) * 31) + Boolean.hashCode(this.shouldScrollToBottom);
        }

        public String toString() {
            return "ReactionState(reactionComponentVisibility=" + this.reactionComponentVisibility + ", transitionState=" + this.transitionState + ", selectedReaction=" + this.selectedReaction + ", teamHelpVisibility=" + this.teamHelpVisibility + ", shouldScrollToBottom=" + this.shouldScrollToBottom + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ReactionState(int i10, int i11, Reaction reaction, int i12, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, (i13 & 4) != 0 ? Reaction.None : reaction, i12, z10);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\b\u0018\u0000 52\u00020\u0001:\u00015Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jz\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÇ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00103\u001a\u00020\u0007H×\u0001J\t\u00104\u001a\u00020\fH×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "conversationState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "subtitleText", "", "messageButtonText", "messageButtonIcon", "messageButtonColor", "metricPlace", "", "metricContext", "isFromSearchBrowse", "", "ctaData", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "<init>", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;)V", "getArticleMetadata", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "getConversationState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "getSubtitleText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessageButtonText", "()I", "getMessageButtonIcon", "getMessageButtonColor", "getMetricPlace", "()Ljava/lang/String;", "getMetricContext", "()Z", "getCtaData", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;)Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "equals", "other", "hashCode", "toString", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TeamPresenceState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final TeamPresenceState defaultTeamPresenceState;
        private final ArticleMetadata articleMetadata;
        private final ConversationState conversationState;
        private final OpenMessengerResponse.NewConversationData.Cta ctaData;
        private final boolean isFromSearchBrowse;
        private final int messageButtonColor;
        private final int messageButtonIcon;
        private final int messageButtonText;
        private final String metricContext;
        private final String metricPlace;
        private final Integer subtitleText;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState$Companion;", "", "<init>", "()V", "defaultTeamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "getDefaultTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TeamPresenceState getDefaultTeamPresenceState() {
                return TeamPresenceState.defaultTeamPresenceState;
            }

            private Companion() {
            }
        }

        static {
            int i10 = R.string.intercom_the_team_can_help_if_needed;
            defaultTeamPresenceState = new TeamPresenceState((ArticleMetadata) null, (ConversationState) null, Integer.valueOf(i10), R.string.intercom_send_us_a_message, R.drawable.intercom_new_conversation_send_button, -16777216, "article", MetricTracker.Context.STYLE_HUMAN, false, (OpenMessengerResponse.NewConversationData.Cta) null, 512, (DefaultConstructorMarker) null);
        }

        public TeamPresenceState(ArticleMetadata articleMetadata2, ConversationState conversationState2, Integer num, int i10, int i11, int i12, String str, String str2, boolean z10, OpenMessengerResponse.NewConversationData.Cta cta) {
            C6496s.h(str, "metricPlace");
            C6496s.h(str2, "metricContext");
            this.articleMetadata = articleMetadata2;
            this.conversationState = conversationState2;
            this.subtitleText = num;
            this.messageButtonText = i10;
            this.messageButtonIcon = i11;
            this.messageButtonColor = i12;
            this.metricPlace = str;
            this.metricContext = str2;
            this.isFromSearchBrowse = z10;
            this.ctaData = cta;
        }

        public static /* synthetic */ TeamPresenceState copy$default(TeamPresenceState teamPresenceState, ArticleMetadata articleMetadata2, ConversationState conversationState2, Integer num, int i10, int i11, int i12, String str, String str2, boolean z10, OpenMessengerResponse.NewConversationData.Cta cta, int i13, Object obj) {
            TeamPresenceState teamPresenceState2 = teamPresenceState;
            int i14 = i13;
            return teamPresenceState.copy((i14 & 1) != 0 ? teamPresenceState2.articleMetadata : articleMetadata2, (i14 & 2) != 0 ? teamPresenceState2.conversationState : conversationState2, (i14 & 4) != 0 ? teamPresenceState2.subtitleText : num, (i14 & 8) != 0 ? teamPresenceState2.messageButtonText : i10, (i14 & 16) != 0 ? teamPresenceState2.messageButtonIcon : i11, (i14 & 32) != 0 ? teamPresenceState2.messageButtonColor : i12, (i14 & 64) != 0 ? teamPresenceState2.metricPlace : str, (i14 & 128) != 0 ? teamPresenceState2.metricContext : str2, (i14 & 256) != 0 ? teamPresenceState2.isFromSearchBrowse : z10, (i14 & 512) != 0 ? teamPresenceState2.ctaData : cta);
        }

        public final ArticleMetadata component1() {
            return this.articleMetadata;
        }

        public final OpenMessengerResponse.NewConversationData.Cta component10() {
            return this.ctaData;
        }

        public final ConversationState component2() {
            return this.conversationState;
        }

        public final Integer component3() {
            return this.subtitleText;
        }

        public final int component4() {
            return this.messageButtonText;
        }

        public final int component5() {
            return this.messageButtonIcon;
        }

        public final int component6() {
            return this.messageButtonColor;
        }

        public final String component7() {
            return this.metricPlace;
        }

        public final String component8() {
            return this.metricContext;
        }

        public final boolean component9() {
            return this.isFromSearchBrowse;
        }

        public final TeamPresenceState copy(ArticleMetadata articleMetadata2, ConversationState conversationState2, Integer num, int i10, int i11, int i12, String str, String str2, boolean z10, OpenMessengerResponse.NewConversationData.Cta cta) {
            String str3 = str;
            C6496s.h(str3, "metricPlace");
            String str4 = str2;
            C6496s.h(str4, "metricContext");
            return new TeamPresenceState(articleMetadata2, conversationState2, num, i10, i11, i12, str3, str4, z10, cta);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TeamPresenceState)) {
                return false;
            }
            TeamPresenceState teamPresenceState = (TeamPresenceState) obj;
            return C6496s.c(this.articleMetadata, teamPresenceState.articleMetadata) && C6496s.c(this.conversationState, teamPresenceState.conversationState) && C6496s.c(this.subtitleText, teamPresenceState.subtitleText) && this.messageButtonText == teamPresenceState.messageButtonText && this.messageButtonIcon == teamPresenceState.messageButtonIcon && this.messageButtonColor == teamPresenceState.messageButtonColor && C6496s.c(this.metricPlace, teamPresenceState.metricPlace) && C6496s.c(this.metricContext, teamPresenceState.metricContext) && this.isFromSearchBrowse == teamPresenceState.isFromSearchBrowse && C6496s.c(this.ctaData, teamPresenceState.ctaData);
        }

        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        public final ConversationState getConversationState() {
            return this.conversationState;
        }

        public final OpenMessengerResponse.NewConversationData.Cta getCtaData() {
            return this.ctaData;
        }

        public final int getMessageButtonColor() {
            return this.messageButtonColor;
        }

        public final int getMessageButtonIcon() {
            return this.messageButtonIcon;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        public final String getMetricContext() {
            return this.metricContext;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public final Integer getSubtitleText() {
            return this.subtitleText;
        }

        public int hashCode() {
            ArticleMetadata articleMetadata2 = this.articleMetadata;
            int i10 = 0;
            int hashCode = (articleMetadata2 == null ? 0 : articleMetadata2.hashCode()) * 31;
            ConversationState conversationState2 = this.conversationState;
            int hashCode2 = (hashCode + (conversationState2 == null ? 0 : conversationState2.hashCode())) * 31;
            Integer num = this.subtitleText;
            int hashCode3 = (((((((((((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.messageButtonText)) * 31) + Integer.hashCode(this.messageButtonIcon)) * 31) + Integer.hashCode(this.messageButtonColor)) * 31) + this.metricPlace.hashCode()) * 31) + this.metricContext.hashCode()) * 31) + Boolean.hashCode(this.isFromSearchBrowse)) * 31;
            OpenMessengerResponse.NewConversationData.Cta cta = this.ctaData;
            if (cta != null) {
                i10 = cta.hashCode();
            }
            return hashCode3 + i10;
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public String toString() {
            return "TeamPresenceState(articleMetadata=" + this.articleMetadata + ", conversationState=" + this.conversationState + ", subtitleText=" + this.subtitleText + ", messageButtonText=" + this.messageButtonText + ", messageButtonIcon=" + this.messageButtonIcon + ", messageButtonColor=" + this.messageButtonColor + ", metricPlace=" + this.metricPlace + ", metricContext=" + this.metricContext + ", isFromSearchBrowse=" + this.isFromSearchBrowse + ", ctaData=" + this.ctaData + ')';
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ TeamPresenceState(io.intercom.android.sdk.helpcenter.articles.ArticleMetadata r14, io.intercom.android.sdk.helpcenter.articles.ArticleViewState.ConversationState r15, java.lang.Integer r16, int r17, int r18, int r19, java.lang.String r20, java.lang.String r21, boolean r22, io.intercom.android.sdk.models.OpenMessengerResponse.NewConversationData.Cta r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
            /*
                r13 = this;
                r0 = r24
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0009
                r1 = 0
                r11 = r1
                goto L_0x000b
            L_0x0009:
                r11 = r22
            L_0x000b:
                r0 = r0 & 512(0x200, float:7.175E-43)
                if (r0 == 0) goto L_0x0012
                r0 = 0
                r12 = r0
                goto L_0x0014
            L_0x0012:
                r12 = r23
            L_0x0014:
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r8 = r19
                r9 = r20
                r10 = r21
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState.<init>(io.intercom.android.sdk.helpcenter.articles.ArticleMetadata, io.intercom.android.sdk.helpcenter.articles.ArticleViewState$ConversationState, java.lang.Integer, int, int, int, java.lang.String, java.lang.String, boolean, io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData$Cta, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
