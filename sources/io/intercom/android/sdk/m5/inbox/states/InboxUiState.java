package io.intercom.android.sdk.m5.inbox.states;

import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.common.IntercomTopBarState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n3.C2331a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "", "intercomTopBarState", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;)V", "getIntercomTopBarState", "()Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "Initial", "Loading", "Content", "Empty", "Error", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class InboxUiState {
    public static final int $stable = IntercomTopBarState.$stable;
    private final IntercomTopBarState intercomTopBarState;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\t\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState$Content;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "intercomTopBarState", "Ln3/a;", "Lio/intercom/android/sdk/models/Conversation;", "inboxConversations", "", "showSendMessageFab", "isLoadingMore", "Lio/intercom/android/sdk/m5/components/ErrorState;", "errorState", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;Ln3/a;ZZLio/intercom/android/sdk/m5/components/ErrorState;)V", "Ln3/a;", "getInboxConversations", "()Ln3/a;", "Z", "getShowSendMessageFab", "()Z", "Lio/intercom/android/sdk/m5/components/ErrorState;", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content extends InboxUiState {
        public static final int $stable = C2331a.f24669f;
        private final ErrorState errorState;
        private final C2331a inboxConversations;
        private final boolean isLoadingMore;
        private final boolean showSendMessageFab;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Content(IntercomTopBarState intercomTopBarState, C2331a aVar, boolean z10, boolean z11, ErrorState errorState2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(intercomTopBarState, aVar, z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : errorState2);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final C2331a getInboxConversations() {
            return this.inboxConversations;
        }

        public final boolean getShowSendMessageFab() {
            return this.showSendMessageFab;
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Content(IntercomTopBarState intercomTopBarState, C2331a aVar, boolean z10, boolean z11, ErrorState errorState2) {
            super(intercomTopBarState);
            C6496s.h(intercomTopBarState, "intercomTopBarState");
            C6496s.h(aVar, "inboxConversations");
            this.inboxConversations = aVar;
            this.showSendMessageFab = z10;
            this.isLoadingMore = z11;
            this.errorState = errorState2;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState$Empty;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "intercomTopBarState", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "emptyState", "Lio/intercom/android/sdk/models/EmptyState;", "showActionButton", "", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;Lio/intercom/android/sdk/models/EmptyState;Z)V", "getEmptyState", "()Lio/intercom/android/sdk/models/EmptyState;", "getShowActionButton", "()Z", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Empty extends InboxUiState {
        public static final int $stable = 0;
        private final EmptyState emptyState;
        private final boolean showActionButton;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Empty(IntercomTopBarState intercomTopBarState, EmptyState emptyState2, boolean z10) {
            super(intercomTopBarState);
            C6496s.h(intercomTopBarState, "intercomTopBarState");
            C6496s.h(emptyState2, "emptyState");
            this.emptyState = emptyState2;
            this.showActionButton = z10;
        }

        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        public final boolean getShowActionButton() {
            return this.showActionButton;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState$Error;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "intercomTopBarState", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;Lio/intercom/android/sdk/m5/components/ErrorState;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends InboxUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(IntercomTopBarState intercomTopBarState, ErrorState errorState2) {
            super(intercomTopBarState);
            C6496s.h(intercomTopBarState, "intercomTopBarState");
            C6496s.h(errorState2, "errorState");
            this.errorState = errorState2;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState$Initial;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "intercomTopBarState", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initial extends InboxUiState {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Initial(IntercomTopBarState intercomTopBarState) {
            super(intercomTopBarState);
            C6496s.h(intercomTopBarState, "intercomTopBarState");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState$Loading;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "intercomTopBarState", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends InboxUiState {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Loading(IntercomTopBarState intercomTopBarState) {
            super(intercomTopBarState);
            C6496s.h(intercomTopBarState, "intercomTopBarState");
        }
    }

    public InboxUiState(IntercomTopBarState intercomTopBarState2) {
        C6496s.h(intercomTopBarState2, "intercomTopBarState");
        this.intercomTopBarState = intercomTopBarState2;
    }

    public final IntercomTopBarState getIntercomTopBarState() {
        return this.intercomTopBarState;
    }
}
