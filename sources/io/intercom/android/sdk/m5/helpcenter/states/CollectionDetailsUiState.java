package io.intercom.android.sdk.m5.helpcenter.states;

import com.amazon.a.a.o.b;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "", "Initial", "Loading", "Error", "Content", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Content;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Error;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Initial;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CollectionDetailsUiState {

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0000J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003JQ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tHÇ\u0001J\u0013\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010'H×\u0003J\t\u0010(\u001a\u00020\u0007H×\u0001J\t\u0010)\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Content;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "id", "", "title", "summary", "articlesCount", "", "authors", "", "Lio/intercom/android/sdk/helpcenter/sections/Author;", "collectionDetailsRows", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsRow;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSummary", "getArticlesCount", "()I", "getAuthors", "()Ljava/util/List;", "getCollectionDetailsRows", "hasSendMessageRow", "", "copyWithSingleSendMessageRow", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "copyWithoutSendMessageRow", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content implements CollectionDetailsUiState {
        public static final int $stable = 8;
        private final int articlesCount;
        private final List<Author> authors;
        private final List<CollectionDetailsRow> collectionDetailsRows;

        /* renamed from: id  reason: collision with root package name */
        private final String f69635id;
        private final String summary;
        private final String title;

        public Content(String str, String str2, String str3, int i10, List<Author> list, List<? extends CollectionDetailsRow> list2) {
            C6496s.h(str, "id");
            C6496s.h(str2, b.f37461S);
            C6496s.h(str3, "summary");
            C6496s.h(list, "authors");
            C6496s.h(list2, "collectionDetailsRows");
            this.f69635id = str;
            this.title = str2;
            this.summary = str3;
            this.articlesCount = i10;
            this.authors = list;
            this.collectionDetailsRows = list2;
        }

        public static /* synthetic */ Content copy$default(Content content, String str, String str2, String str3, int i10, List<Author> list, List<CollectionDetailsRow> list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = content.f69635id;
            }
            if ((i11 & 2) != 0) {
                str2 = content.title;
            }
            String str4 = str2;
            if ((i11 & 4) != 0) {
                str3 = content.summary;
            }
            String str5 = str3;
            if ((i11 & 8) != 0) {
                i10 = content.articlesCount;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                list = content.authors;
            }
            List<Author> list3 = list;
            if ((i11 & 32) != 0) {
                list2 = content.collectionDetailsRows;
            }
            return content.copy(str, str4, str5, i12, list3, list2);
        }

        public final String component1() {
            return this.f69635id;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.summary;
        }

        public final int component4() {
            return this.articlesCount;
        }

        public final List<Author> component5() {
            return this.authors;
        }

        public final List<CollectionDetailsRow> component6() {
            return this.collectionDetailsRows;
        }

        public final Content copy(String str, String str2, String str3, int i10, List<Author> list, List<? extends CollectionDetailsRow> list2) {
            C6496s.h(str, "id");
            C6496s.h(str2, b.f37461S);
            C6496s.h(str3, "summary");
            C6496s.h(list, "authors");
            C6496s.h(list2, "collectionDetailsRows");
            return new Content(str, str2, str3, i10, list, list2);
        }

        public final Content copyWithSingleSendMessageRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            C6496s.h(teamPresenceState, "teamPresenceState");
            if (hasSendMessageRow()) {
                ArrayList arrayList = new ArrayList();
                for (Object next : this.collectionDetailsRows) {
                    if (!(((CollectionDetailsRow) next) instanceof CollectionDetailsRow.SendMessageRow)) {
                        arrayList.add(next);
                    }
                }
                return copy$default(this, (String) null, (String) null, (String) null, 0, (List) null, C6565s.L0(arrayList, new CollectionDetailsRow.SendMessageRow(teamPresenceState)), 31, (Object) null);
            }
            return copy$default(this, (String) null, (String) null, (String) null, 0, (List) null, C6565s.L0(this.collectionDetailsRows, new CollectionDetailsRow.SendMessageRow(teamPresenceState)), 31, (Object) null);
        }

        public final Content copyWithoutSendMessageRow() {
            ArrayList arrayList = new ArrayList();
            for (Object next : this.collectionDetailsRows) {
                if (!(((CollectionDetailsRow) next) instanceof CollectionDetailsRow.SendMessageRow)) {
                    arrayList.add(next);
                }
            }
            return copy$default(this, (String) null, (String) null, (String) null, 0, (List) null, arrayList, 31, (Object) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return C6496s.c(this.f69635id, content.f69635id) && C6496s.c(this.title, content.title) && C6496s.c(this.summary, content.summary) && this.articlesCount == content.articlesCount && C6496s.c(this.authors, content.authors) && C6496s.c(this.collectionDetailsRows, content.collectionDetailsRows);
        }

        public final int getArticlesCount() {
            return this.articlesCount;
        }

        public final List<Author> getAuthors() {
            return this.authors;
        }

        public final List<CollectionDetailsRow> getCollectionDetailsRows() {
            return this.collectionDetailsRows;
        }

        public final String getId() {
            return this.f69635id;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean hasSendMessageRow() {
            Iterable<CollectionDetailsRow> iterable = this.collectionDetailsRows;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (CollectionDetailsRow collectionDetailsRow : iterable) {
                if (collectionDetailsRow instanceof CollectionDetailsRow.SendMessageRow) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.f69635id.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31) + Integer.hashCode(this.articlesCount)) * 31) + this.authors.hashCode()) * 31) + this.collectionDetailsRows.hashCode();
        }

        public String toString() {
            return "Content(id=" + this.f69635id + ", title=" + this.title + ", summary=" + this.summary + ", articlesCount=" + this.articlesCount + ", authors=" + this.authors + ", collectionDetailsRows=" + this.collectionDetailsRows + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Error;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "<init>", "(Lio/intercom/android/sdk/m5/components/ErrorState;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error implements CollectionDetailsUiState {
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Initial;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initial implements CollectionDetailsUiState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return -545067083;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Loading;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading implements CollectionDetailsUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return 2138208685;
        }

        public String toString() {
            return "Loading";
        }
    }
}
