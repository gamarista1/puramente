package io.intercom.android.sdk.helpcenter.search;

import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "", "<init>", "()V", "ArticleResultRow", "TeammateHelpRow", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$ArticleResultRow;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$TeammateHelpRow;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ArticleSearchResultRow {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$TeammateHelpRow;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "<init>", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TeammateHelpRow extends ArticleSearchResultRow {
        public static final int $stable = 0;
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TeammateHelpRow(ArticleViewState.TeamPresenceState teamPresenceState2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(teamPresenceState2, "teamPresenceState");
            this.teamPresenceState = teamPresenceState2;
        }

        public static /* synthetic */ TeammateHelpRow copy$default(TeammateHelpRow teammateHelpRow, ArticleViewState.TeamPresenceState teamPresenceState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                teamPresenceState2 = teammateHelpRow.teamPresenceState;
            }
            return teammateHelpRow.copy(teamPresenceState2);
        }

        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        public final TeammateHelpRow copy(ArticleViewState.TeamPresenceState teamPresenceState2) {
            C6496s.h(teamPresenceState2, "teamPresenceState");
            return new TeammateHelpRow(teamPresenceState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TeammateHelpRow) && C6496s.c(this.teamPresenceState, ((TeammateHelpRow) obj).teamPresenceState);
        }

        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode();
        }

        public String toString() {
            return "TeammateHelpRow(teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    public /* synthetic */ ArticleSearchResultRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0007H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$ArticleResultRow;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "id", "", "titleText", "summaryText", "summaryVisibility", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getTitleText", "getSummaryText", "getSummaryVisibility", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ArticleResultRow extends ArticleSearchResultRow {
        public static final int $stable = 0;

        /* renamed from: id  reason: collision with root package name */
        private final String f68593id;
        private final String summaryText;
        private final int summaryVisibility;
        private final String titleText;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ArticleResultRow(String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? 8 : i10);
        }

        public static /* synthetic */ ArticleResultRow copy$default(ArticleResultRow articleResultRow, String str, String str2, String str3, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = articleResultRow.f68593id;
            }
            if ((i11 & 2) != 0) {
                str2 = articleResultRow.titleText;
            }
            if ((i11 & 4) != 0) {
                str3 = articleResultRow.summaryText;
            }
            if ((i11 & 8) != 0) {
                i10 = articleResultRow.summaryVisibility;
            }
            return articleResultRow.copy(str, str2, str3, i10);
        }

        public final String component1() {
            return this.f68593id;
        }

        public final String component2() {
            return this.titleText;
        }

        public final String component3() {
            return this.summaryText;
        }

        public final int component4() {
            return this.summaryVisibility;
        }

        public final ArticleResultRow copy(String str, String str2, String str3, int i10) {
            C6496s.h(str, "id");
            C6496s.h(str2, "titleText");
            C6496s.h(str3, "summaryText");
            return new ArticleResultRow(str, str2, str3, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleResultRow)) {
                return false;
            }
            ArticleResultRow articleResultRow = (ArticleResultRow) obj;
            return C6496s.c(this.f68593id, articleResultRow.f68593id) && C6496s.c(this.titleText, articleResultRow.titleText) && C6496s.c(this.summaryText, articleResultRow.summaryText) && this.summaryVisibility == articleResultRow.summaryVisibility;
        }

        public final String getId() {
            return this.f68593id;
        }

        public final String getSummaryText() {
            return this.summaryText;
        }

        public final int getSummaryVisibility() {
            return this.summaryVisibility;
        }

        public final String getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            return (((((this.f68593id.hashCode() * 31) + this.titleText.hashCode()) * 31) + this.summaryText.hashCode()) * 31) + Integer.hashCode(this.summaryVisibility);
        }

        public String toString() {
            return "ArticleResultRow(id=" + this.f68593id + ", titleText=" + this.titleText + ", summaryText=" + this.summaryText + ", summaryVisibility=" + this.summaryVisibility + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ArticleResultRow(String str, String str2, String str3, int i10) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "id");
            C6496s.h(str2, "titleText");
            C6496s.h(str3, "summaryText");
            this.f68593id = str;
            this.titleText = str2;
            this.summaryText = str3;
            this.summaryVisibility = i10;
        }
    }

    private ArticleSearchResultRow() {
    }
}
