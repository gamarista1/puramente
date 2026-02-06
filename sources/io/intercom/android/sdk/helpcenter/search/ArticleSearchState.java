package io.intercom.android.sdk.helpcenter.search;

import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "", "<init>", "()V", "Initial", "Loading", "Content", "NoResults", "NoResultsNoTeamHelp", "Error", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Content;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Error;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Initial;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Loading;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$NoResults;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$NoResultsNoTeamHelp;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ArticleSearchState {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Content;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "searchResults", "", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "<init>", "(Ljava/util/List;)V", "getSearchResults", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content extends ArticleSearchState {
        public static final int $stable = 8;
        private final List<ArticleSearchResultRow> searchResults;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Content(List<? extends ArticleSearchResultRow> list) {
            super((DefaultConstructorMarker) null);
            C6496s.h(list, "searchResults");
            this.searchResults = list;
        }

        public static /* synthetic */ Content copy$default(Content content, List<ArticleSearchResultRow> list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = content.searchResults;
            }
            return content.copy(list);
        }

        public final List<ArticleSearchResultRow> component1() {
            return this.searchResults;
        }

        public final Content copy(List<? extends ArticleSearchResultRow> list) {
            C6496s.h(list, "searchResults");
            return new Content(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && C6496s.c(this.searchResults, ((Content) obj).searchResults);
        }

        public final List<ArticleSearchResultRow> getSearchResults() {
            return this.searchResults;
        }

        public int hashCode() {
            return this.searchResults.hashCode();
        }

        public String toString() {
            return "Content(searchResults=" + this.searchResults + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Error;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends ArticleSearchState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Initial;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initial extends ArticleSearchState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return -498820373;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Loading;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends ArticleSearchState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -2110511901;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$NoResults;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "searchTerm", "", "<init>", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;Ljava/lang/String;)V", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "getSearchTerm", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoResults extends ArticleSearchState {
        public static final int $stable = 0;
        private final String searchTerm;
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NoResults(ArticleViewState.TeamPresenceState teamPresenceState2, String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(teamPresenceState2, "teamPresenceState");
            C6496s.h(str, "searchTerm");
            this.teamPresenceState = teamPresenceState2;
            this.searchTerm = str;
        }

        public static /* synthetic */ NoResults copy$default(NoResults noResults, ArticleViewState.TeamPresenceState teamPresenceState2, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                teamPresenceState2 = noResults.teamPresenceState;
            }
            if ((i10 & 2) != 0) {
                str = noResults.searchTerm;
            }
            return noResults.copy(teamPresenceState2, str);
        }

        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        public final String component2() {
            return this.searchTerm;
        }

        public final NoResults copy(ArticleViewState.TeamPresenceState teamPresenceState2, String str) {
            C6496s.h(teamPresenceState2, "teamPresenceState");
            C6496s.h(str, "searchTerm");
            return new NoResults(teamPresenceState2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoResults)) {
                return false;
            }
            NoResults noResults = (NoResults) obj;
            return C6496s.c(this.teamPresenceState, noResults.teamPresenceState) && C6496s.c(this.searchTerm, noResults.searchTerm);
        }

        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return (this.teamPresenceState.hashCode() * 31) + this.searchTerm.hashCode();
        }

        public String toString() {
            return "NoResults(teamPresenceState=" + this.teamPresenceState + ", searchTerm=" + this.searchTerm + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$NoResultsNoTeamHelp;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "searchTerm", "", "<init>", "(Ljava/lang/String;)V", "getSearchTerm", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoResultsNoTeamHelp extends ArticleSearchState {
        public static final int $stable = 0;
        private final String searchTerm;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NoResultsNoTeamHelp(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "searchTerm");
            this.searchTerm = str;
        }

        public static /* synthetic */ NoResultsNoTeamHelp copy$default(NoResultsNoTeamHelp noResultsNoTeamHelp, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = noResultsNoTeamHelp.searchTerm;
            }
            return noResultsNoTeamHelp.copy(str);
        }

        public final String component1() {
            return this.searchTerm;
        }

        public final NoResultsNoTeamHelp copy(String str) {
            C6496s.h(str, "searchTerm");
            return new NoResultsNoTeamHelp(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoResultsNoTeamHelp) && C6496s.c(this.searchTerm, ((NoResultsNoTeamHelp) obj).searchTerm);
        }

        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public int hashCode() {
            return this.searchTerm.hashCode();
        }

        public String toString() {
            return "NoResultsNoTeamHelp(searchTerm=" + this.searchTerm + ')';
        }
    }

    public /* synthetic */ ArticleSearchState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ArticleSearchState() {
    }
}
