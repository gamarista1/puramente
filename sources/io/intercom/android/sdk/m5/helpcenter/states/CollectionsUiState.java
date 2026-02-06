package io.intercom.android.sdk.m5.helpcenter.states;

import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "", "Initial", "Loading", "Error", "Content", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Content;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Error;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Initial;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CollectionsUiState {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0000J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Content;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "collections", "", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "<init>", "(Ljava/util/List;)V", "getCollections", "()Ljava/util/List;", "hasSendMessageRow", "", "copyWithSingleSendMessageRow", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "copyWithoutSendMessageRow", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content implements CollectionsUiState {
        public static final int $stable = 8;
        private final List<CollectionsRow> collections;

        public Content(List<? extends CollectionsRow> list) {
            C6496s.h(list, "collections");
            this.collections = list;
        }

        public static /* synthetic */ Content copy$default(Content content, List<CollectionsRow> list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = content.collections;
            }
            return content.copy(list);
        }

        public final List<CollectionsRow> component1() {
            return this.collections;
        }

        public final Content copy(List<? extends CollectionsRow> list) {
            C6496s.h(list, "collections");
            return new Content(list);
        }

        public final Content copyWithSingleSendMessageRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            C6496s.h(teamPresenceState, "teamPresenceState");
            if (!hasSendMessageRow()) {
                return copy(C6565s.L0(this.collections, new CollectionsRow.SendMessageRow(teamPresenceState)));
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : this.collections) {
                if (!(((CollectionsRow) next) instanceof CollectionsRow.SendMessageRow)) {
                    arrayList.add(next);
                }
            }
            return copy(C6565s.L0(arrayList, new CollectionsRow.SendMessageRow(teamPresenceState)));
        }

        public final Content copyWithoutSendMessageRow() {
            ArrayList arrayList = new ArrayList();
            for (Object next : this.collections) {
                if (!(((CollectionsRow) next) instanceof CollectionsRow.SendMessageRow)) {
                    arrayList.add(next);
                }
            }
            return copy(arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && C6496s.c(this.collections, ((Content) obj).collections);
        }

        public final List<CollectionsRow> getCollections() {
            return this.collections;
        }

        public final boolean hasSendMessageRow() {
            Iterable<CollectionsRow> iterable = this.collections;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (CollectionsRow collectionsRow : iterable) {
                if (collectionsRow instanceof CollectionsRow.SendMessageRow) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.collections.hashCode();
        }

        public String toString() {
            return "Content(collections=" + this.collections + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Error;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "<init>", "(Lio/intercom/android/sdk/m5/components/ErrorState;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error implements CollectionsUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;

        public Error(ErrorState errorState2) {
            C6496s.h(errorState2, "errorState");
            this.errorState = errorState2;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorState2 = error.errorState;
            }
            return error.copy(errorState2);
        }

        public final ErrorState component1() {
            return this.errorState;
        }

        public final Error copy(ErrorState errorState2) {
            C6496s.h(errorState2, "errorState");
            return new Error(errorState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && C6496s.c(this.errorState, ((Error) obj).errorState);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public int hashCode() {
            return this.errorState.hashCode();
        }

        public String toString() {
            return "Error(errorState=" + this.errorState + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Initial;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initial implements CollectionsUiState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return 1088616516;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Loading;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading implements CollectionsUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -523075012;
        }

        public String toString() {
            return "Loading";
        }
    }
}
