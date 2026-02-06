package io.intercom.android.sdk.tickets.list.data;

import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.EmptyState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n3.C2331a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "", "<init>", "()V", "screenLabel", "", "getScreenLabel", "()Ljava/lang/String;", "Initial", "Loading", "Content", "Empty", "Error", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Content;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Empty;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Error;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Initial;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TicketsScreenUiState {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006&"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Content;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "Ln3/a;", "Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "lazyPagingTickets", "", "isLoadingMore", "Lio/intercom/android/sdk/m5/components/ErrorState;", "errorState", "", "screenLabel", "<init>", "(Ln3/a;ZLio/intercom/android/sdk/m5/components/ErrorState;Ljava/lang/String;)V", "component1", "()Ln3/a;", "component2", "()Z", "component3", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "component4", "()Ljava/lang/String;", "copy", "(Ln3/a;ZLio/intercom/android/sdk/m5/components/ErrorState;Ljava/lang/String;)Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Content;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ln3/a;", "getLazyPagingTickets", "Z", "Lio/intercom/android/sdk/m5/components/ErrorState;", "getErrorState", "Ljava/lang/String;", "getScreenLabel", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content extends TicketsScreenUiState {
        public static final int $stable = C2331a.f24669f;
        private final ErrorState errorState;
        private final boolean isLoadingMore;
        private final C2331a lazyPagingTickets;
        private final String screenLabel;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Content(C2331a aVar, boolean z10, ErrorState errorState2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : errorState2, str);
        }

        public static /* synthetic */ Content copy$default(Content content, C2331a aVar, boolean z10, ErrorState errorState2, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = content.lazyPagingTickets;
            }
            if ((i10 & 2) != 0) {
                z10 = content.isLoadingMore;
            }
            if ((i10 & 4) != 0) {
                errorState2 = content.errorState;
            }
            if ((i10 & 8) != 0) {
                str = content.screenLabel;
            }
            return content.copy(aVar, z10, errorState2, str);
        }

        public final C2331a component1() {
            return this.lazyPagingTickets;
        }

        public final boolean component2() {
            return this.isLoadingMore;
        }

        public final ErrorState component3() {
            return this.errorState;
        }

        public final String component4() {
            return this.screenLabel;
        }

        public final Content copy(C2331a aVar, boolean z10, ErrorState errorState2, String str) {
            C6496s.h(aVar, "lazyPagingTickets");
            C6496s.h(str, "screenLabel");
            return new Content(aVar, z10, errorState2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return C6496s.c(this.lazyPagingTickets, content.lazyPagingTickets) && this.isLoadingMore == content.isLoadingMore && C6496s.c(this.errorState, content.errorState) && C6496s.c(this.screenLabel, content.screenLabel);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final C2331a getLazyPagingTickets() {
            return this.lazyPagingTickets;
        }

        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            int hashCode = ((this.lazyPagingTickets.hashCode() * 31) + Boolean.hashCode(this.isLoadingMore)) * 31;
            ErrorState errorState2 = this.errorState;
            return ((hashCode + (errorState2 == null ? 0 : errorState2.hashCode())) * 31) + this.screenLabel.hashCode();
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public String toString() {
            return "Content(lazyPagingTickets=" + this.lazyPagingTickets + ", isLoadingMore=" + this.isLoadingMore + ", errorState=" + this.errorState + ", screenLabel=" + this.screenLabel + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Content(C2331a aVar, boolean z10, ErrorState errorState2, String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(aVar, "lazyPagingTickets");
            C6496s.h(str, "screenLabel");
            this.lazyPagingTickets = aVar;
            this.isLoadingMore = z10;
            this.errorState = errorState2;
            this.screenLabel = str;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Empty;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "emptyState", "Lio/intercom/android/sdk/models/EmptyState;", "screenLabel", "", "<init>", "(Lio/intercom/android/sdk/models/EmptyState;Ljava/lang/String;)V", "getEmptyState", "()Lio/intercom/android/sdk/models/EmptyState;", "getScreenLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Empty extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final EmptyState emptyState;
        private final String screenLabel;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Empty(EmptyState emptyState2, String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(emptyState2, "emptyState");
            C6496s.h(str, "screenLabel");
            this.emptyState = emptyState2;
            this.screenLabel = str;
        }

        public static /* synthetic */ Empty copy$default(Empty empty, EmptyState emptyState2, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emptyState2 = empty.emptyState;
            }
            if ((i10 & 2) != 0) {
                str = empty.screenLabel;
            }
            return empty.copy(emptyState2, str);
        }

        public final EmptyState component1() {
            return this.emptyState;
        }

        public final String component2() {
            return this.screenLabel;
        }

        public final Empty copy(EmptyState emptyState2, String str) {
            C6496s.h(emptyState2, "emptyState");
            C6496s.h(str, "screenLabel");
            return new Empty(emptyState2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) obj;
            return C6496s.c(this.emptyState, empty.emptyState) && C6496s.c(this.screenLabel, empty.screenLabel);
        }

        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return (this.emptyState.hashCode() * 31) + this.screenLabel.hashCode();
        }

        public String toString() {
            return "Empty(emptyState=" + this.emptyState + ", screenLabel=" + this.screenLabel + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Error;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "screenLabel", "", "<init>", "(Lio/intercom/android/sdk/m5/components/ErrorState;Ljava/lang/String;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "getScreenLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;
        private final String screenLabel;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(ErrorState errorState2, String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(errorState2, "errorState");
            C6496s.h(str, "screenLabel");
            this.errorState = errorState2;
            this.screenLabel = str;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState2, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorState2 = error.errorState;
            }
            if ((i10 & 2) != 0) {
                str = error.screenLabel;
            }
            return error.copy(errorState2, str);
        }

        public final ErrorState component1() {
            return this.errorState;
        }

        public final String component2() {
            return this.screenLabel;
        }

        public final Error copy(ErrorState errorState2, String str) {
            C6496s.h(errorState2, "errorState");
            C6496s.h(str, "screenLabel");
            return new Error(errorState2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return C6496s.c(this.errorState, error.errorState) && C6496s.c(this.screenLabel, error.screenLabel);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return (this.errorState.hashCode() * 31) + this.screenLabel.hashCode();
        }

        public String toString() {
            return "Error(errorState=" + this.errorState + ", screenLabel=" + this.screenLabel + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Initial;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "screenLabel", "", "<init>", "(Ljava/lang/String;)V", "getScreenLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initial extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final String screenLabel;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Initial(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "screenLabel");
            this.screenLabel = str;
        }

        public static /* synthetic */ Initial copy$default(Initial initial, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = initial.screenLabel;
            }
            return initial.copy(str);
        }

        public final String component1() {
            return this.screenLabel;
        }

        public final Initial copy(String str) {
            C6496s.h(str, "screenLabel");
            return new Initial(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initial) && C6496s.c(this.screenLabel, ((Initial) obj).screenLabel);
        }

        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode();
        }

        public String toString() {
            return "Initial(screenLabel=" + this.screenLabel + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Loading;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "screenLabel", "", "<init>", "(Ljava/lang/String;)V", "getScreenLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final String screenLabel;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Loading(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "screenLabel");
            this.screenLabel = str;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = loading.screenLabel;
            }
            return loading.copy(str);
        }

        public final String component1() {
            return this.screenLabel;
        }

        public final Loading copy(String str) {
            C6496s.h(str, "screenLabel");
            return new Loading(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && C6496s.c(this.screenLabel, ((Loading) obj).screenLabel);
        }

        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode();
        }

        public String toString() {
            return "Loading(screenLabel=" + this.screenLabel + ')';
        }
    }

    public /* synthetic */ TicketsScreenUiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getScreenLabel();

    private TicketsScreenUiState() {
    }
}
