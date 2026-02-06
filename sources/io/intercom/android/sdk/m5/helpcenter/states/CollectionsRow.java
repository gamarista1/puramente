package io.intercom.android.sdk.m5.helpcenter.states;

import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "", "<init>", "()V", "CollectionRow", "FullHelpCenterRow", "BrowseAllHelpTopicsAsListRow", "SendMessageRow", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$BrowseAllHelpTopicsAsListRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$CollectionRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$FullHelpCenterRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$SendMessageRow;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CollectionsRow {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$BrowseAllHelpTopicsAsListRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BrowseAllHelpTopicsAsListRow extends CollectionsRow {
        public static final int $stable = 0;
        public static final BrowseAllHelpTopicsAsListRow INSTANCE = new BrowseAllHelpTopicsAsListRow();

        private BrowseAllHelpTopicsAsListRow() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BrowseAllHelpTopicsAsListRow);
        }

        public int hashCode() {
            return 164025713;
        }

        public String toString() {
            return "BrowseAllHelpTopicsAsListRow";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$CollectionRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "rowData", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionRowData;", "<init>", "(Lio/intercom/android/sdk/m5/helpcenter/states/CollectionRowData;)V", "getRowData", "()Lio/intercom/android/sdk/m5/helpcenter/states/CollectionRowData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CollectionRow extends CollectionsRow {
        public static final int $stable = 0;
        private final CollectionRowData rowData;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CollectionRow(CollectionRowData collectionRowData) {
            super((DefaultConstructorMarker) null);
            C6496s.h(collectionRowData, "rowData");
            this.rowData = collectionRowData;
        }

        public static /* synthetic */ CollectionRow copy$default(CollectionRow collectionRow, CollectionRowData collectionRowData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                collectionRowData = collectionRow.rowData;
            }
            return collectionRow.copy(collectionRowData);
        }

        public final CollectionRowData component1() {
            return this.rowData;
        }

        public final CollectionRow copy(CollectionRowData collectionRowData) {
            C6496s.h(collectionRowData, "rowData");
            return new CollectionRow(collectionRowData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CollectionRow) && C6496s.c(this.rowData, ((CollectionRow) obj).rowData);
        }

        public final CollectionRowData getRowData() {
            return this.rowData;
        }

        public int hashCode() {
            return this.rowData.hashCode();
        }

        public String toString() {
            return "CollectionRow(rowData=" + this.rowData + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$FullHelpCenterRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FullHelpCenterRow extends CollectionsRow {
        public static final int $stable = 0;
        public static final FullHelpCenterRow INSTANCE = new FullHelpCenterRow();

        private FullHelpCenterRow() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FullHelpCenterRow);
        }

        public int hashCode() {
            return 788964466;
        }

        public String toString() {
            return "FullHelpCenterRow";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$SendMessageRow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "<init>", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SendMessageRow extends CollectionsRow {
        public static final int $stable = 0;
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SendMessageRow(ArticleViewState.TeamPresenceState teamPresenceState2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(teamPresenceState2, "teamPresenceState");
            this.teamPresenceState = teamPresenceState2;
        }

        public static /* synthetic */ SendMessageRow copy$default(SendMessageRow sendMessageRow, ArticleViewState.TeamPresenceState teamPresenceState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                teamPresenceState2 = sendMessageRow.teamPresenceState;
            }
            return sendMessageRow.copy(teamPresenceState2);
        }

        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        public final SendMessageRow copy(ArticleViewState.TeamPresenceState teamPresenceState2) {
            C6496s.h(teamPresenceState2, "teamPresenceState");
            return new SendMessageRow(teamPresenceState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendMessageRow) && C6496s.c(this.teamPresenceState, ((SendMessageRow) obj).teamPresenceState);
        }

        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode();
        }

        public String toString() {
            return "SendMessageRow(teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    public /* synthetic */ CollectionsRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CollectionsRow() {
    }
}
