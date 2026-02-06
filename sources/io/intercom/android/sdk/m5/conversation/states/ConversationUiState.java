package io.intercom.android.sdk.m5.conversation.states;

import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "Loading", "Content", "Error", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Content;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Error;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ConversationUiState {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Error;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "showCta", "", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "<init>", "(ZLio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;)V", "getShowCta", "()Z", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error implements ConversationUiState {
        public static final int $stable = 8;
        private final boolean showCta;
        private final TopAppBarUiState topAppBarUiState;

        public Error(boolean z10, TopAppBarUiState topAppBarUiState2) {
            C6496s.h(topAppBarUiState2, "topAppBarUiState");
            this.showCta = z10;
            this.topAppBarUiState = topAppBarUiState2;
        }

        public static /* synthetic */ Error copy$default(Error error, boolean z10, TopAppBarUiState topAppBarUiState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = error.showCta;
            }
            if ((i10 & 2) != 0) {
                topAppBarUiState2 = error.topAppBarUiState;
            }
            return error.copy(z10, topAppBarUiState2);
        }

        public final boolean component1() {
            return this.showCta;
        }

        public final TopAppBarUiState component2() {
            return this.topAppBarUiState;
        }

        public final Error copy(boolean z10, TopAppBarUiState topAppBarUiState2) {
            C6496s.h(topAppBarUiState2, "topAppBarUiState");
            return new Error(z10, topAppBarUiState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.showCta == error.showCta && C6496s.c(this.topAppBarUiState, error.topAppBarUiState);
        }

        public final boolean getShowCta() {
            return this.showCta;
        }

        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.showCta) * 31) + this.topAppBarUiState.hashCode();
        }

        public String toString() {
            return "Error(showCta=" + this.showCta + ", topAppBarUiState=" + this.topAppBarUiState + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Loading;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;)V", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading implements ConversationUiState {
        public static final int $stable = 8;
        private final TopAppBarUiState topAppBarUiState;

        public Loading(TopAppBarUiState topAppBarUiState2) {
            C6496s.h(topAppBarUiState2, "topAppBarUiState");
            this.topAppBarUiState = topAppBarUiState2;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, TopAppBarUiState topAppBarUiState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                topAppBarUiState2 = loading.topAppBarUiState;
            }
            return loading.copy(topAppBarUiState2);
        }

        public final TopAppBarUiState component1() {
            return this.topAppBarUiState;
        }

        public final Loading copy(TopAppBarUiState topAppBarUiState2) {
            C6496s.h(topAppBarUiState2, "topAppBarUiState");
            return new Loading(topAppBarUiState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && C6496s.c(this.topAppBarUiState, ((Loading) obj).topAppBarUiState);
        }

        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return this.topAppBarUiState.hashCode();
        }

        public String toString() {
            return "Loading(topAppBarUiState=" + this.topAppBarUiState + ')';
        }
    }

    TopAppBarUiState getTopAppBarUiState();

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\t\u0010'\u001a\u00020\u0010HÆ\u0003JU\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÇ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H×\u0003J\t\u0010-\u001a\u00020.H×\u0001J\t\u0010/\u001a\u000200H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Content;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "contentRows", "", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "bottomBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "networkState", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "bottomSheetState", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "floatingIndicatorState", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "teamPresenceState", "Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;Ljava/util/List;Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;Lio/intercom/android/sdk/m5/conversation/states/NetworkState;Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;)V", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "getContentRows", "()Ljava/util/List;", "getBottomBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "getNetworkState", "()Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "getBottomSheetState", "()Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "getFloatingIndicatorState", "()Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "getTeamPresenceState", "()Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content implements ConversationUiState {
        public static final int $stable = 8;
        private final BottomBarUiState bottomBarUiState;
        private final BottomSheetState bottomSheetState;
        private final List<ContentRow> contentRows;
        private final FloatingIndicatorState floatingIndicatorState;
        private final NetworkState networkState;
        private final TeamPresenceState teamPresenceState;
        private final TopAppBarUiState topAppBarUiState;

        public Content(TopAppBarUiState topAppBarUiState2, List<? extends ContentRow> list, BottomBarUiState bottomBarUiState2, NetworkState networkState2, BottomSheetState bottomSheetState2, FloatingIndicatorState floatingIndicatorState2, TeamPresenceState teamPresenceState2) {
            C6496s.h(topAppBarUiState2, "topAppBarUiState");
            C6496s.h(list, "contentRows");
            C6496s.h(bottomBarUiState2, "bottomBarUiState");
            C6496s.h(networkState2, "networkState");
            C6496s.h(bottomSheetState2, "bottomSheetState");
            C6496s.h(floatingIndicatorState2, "floatingIndicatorState");
            C6496s.h(teamPresenceState2, "teamPresenceState");
            this.topAppBarUiState = topAppBarUiState2;
            this.contentRows = list;
            this.bottomBarUiState = bottomBarUiState2;
            this.networkState = networkState2;
            this.bottomSheetState = bottomSheetState2;
            this.floatingIndicatorState = floatingIndicatorState2;
            this.teamPresenceState = teamPresenceState2;
        }

        public static /* synthetic */ Content copy$default(Content content, TopAppBarUiState topAppBarUiState2, List<ContentRow> list, BottomBarUiState bottomBarUiState2, NetworkState networkState2, BottomSheetState bottomSheetState2, FloatingIndicatorState floatingIndicatorState2, TeamPresenceState teamPresenceState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                topAppBarUiState2 = content.topAppBarUiState;
            }
            if ((i10 & 2) != 0) {
                list = content.contentRows;
            }
            List<ContentRow> list2 = list;
            if ((i10 & 4) != 0) {
                bottomBarUiState2 = content.bottomBarUiState;
            }
            BottomBarUiState bottomBarUiState3 = bottomBarUiState2;
            if ((i10 & 8) != 0) {
                networkState2 = content.networkState;
            }
            NetworkState networkState3 = networkState2;
            if ((i10 & 16) != 0) {
                bottomSheetState2 = content.bottomSheetState;
            }
            BottomSheetState bottomSheetState3 = bottomSheetState2;
            if ((i10 & 32) != 0) {
                floatingIndicatorState2 = content.floatingIndicatorState;
            }
            FloatingIndicatorState floatingIndicatorState3 = floatingIndicatorState2;
            if ((i10 & 64) != 0) {
                teamPresenceState2 = content.teamPresenceState;
            }
            return content.copy(topAppBarUiState2, list2, bottomBarUiState3, networkState3, bottomSheetState3, floatingIndicatorState3, teamPresenceState2);
        }

        public final TopAppBarUiState component1() {
            return this.topAppBarUiState;
        }

        public final List<ContentRow> component2() {
            return this.contentRows;
        }

        public final BottomBarUiState component3() {
            return this.bottomBarUiState;
        }

        public final NetworkState component4() {
            return this.networkState;
        }

        public final BottomSheetState component5() {
            return this.bottomSheetState;
        }

        public final FloatingIndicatorState component6() {
            return this.floatingIndicatorState;
        }

        public final TeamPresenceState component7() {
            return this.teamPresenceState;
        }

        public final Content copy(TopAppBarUiState topAppBarUiState2, List<? extends ContentRow> list, BottomBarUiState bottomBarUiState2, NetworkState networkState2, BottomSheetState bottomSheetState2, FloatingIndicatorState floatingIndicatorState2, TeamPresenceState teamPresenceState2) {
            C6496s.h(topAppBarUiState2, "topAppBarUiState");
            C6496s.h(list, "contentRows");
            C6496s.h(bottomBarUiState2, "bottomBarUiState");
            C6496s.h(networkState2, "networkState");
            C6496s.h(bottomSheetState2, "bottomSheetState");
            C6496s.h(floatingIndicatorState2, "floatingIndicatorState");
            TeamPresenceState teamPresenceState3 = teamPresenceState2;
            C6496s.h(teamPresenceState3, "teamPresenceState");
            return new Content(topAppBarUiState2, list, bottomBarUiState2, networkState2, bottomSheetState2, floatingIndicatorState2, teamPresenceState3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return C6496s.c(this.topAppBarUiState, content.topAppBarUiState) && C6496s.c(this.contentRows, content.contentRows) && C6496s.c(this.bottomBarUiState, content.bottomBarUiState) && C6496s.c(this.networkState, content.networkState) && C6496s.c(this.bottomSheetState, content.bottomSheetState) && C6496s.c(this.floatingIndicatorState, content.floatingIndicatorState) && C6496s.c(this.teamPresenceState, content.teamPresenceState);
        }

        public final BottomBarUiState getBottomBarUiState() {
            return this.bottomBarUiState;
        }

        public final BottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final List<ContentRow> getContentRows() {
            return this.contentRows;
        }

        public final FloatingIndicatorState getFloatingIndicatorState() {
            return this.floatingIndicatorState;
        }

        public final NetworkState getNetworkState() {
            return this.networkState;
        }

        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return (((((((((((this.topAppBarUiState.hashCode() * 31) + this.contentRows.hashCode()) * 31) + this.bottomBarUiState.hashCode()) * 31) + this.networkState.hashCode()) * 31) + this.bottomSheetState.hashCode()) * 31) + this.floatingIndicatorState.hashCode()) * 31) + this.teamPresenceState.hashCode();
        }

        public String toString() {
            return "Content(topAppBarUiState=" + this.topAppBarUiState + ", contentRows=" + this.contentRows + ", bottomBarUiState=" + this.bottomBarUiState + ", networkState=" + this.networkState + ", bottomSheetState=" + this.bottomSheetState + ", floatingIndicatorState=" + this.floatingIndicatorState + ", teamPresenceState=" + this.teamPresenceState + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Content(TopAppBarUiState topAppBarUiState2, List list, BottomBarUiState bottomBarUiState2, NetworkState networkState2, BottomSheetState bottomSheetState2, FloatingIndicatorState floatingIndicatorState2, TeamPresenceState teamPresenceState2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(topAppBarUiState2, list, bottomBarUiState2, (i10 & 8) != 0 ? NetworkState.Connected.INSTANCE : networkState2, (i10 & 16) != 0 ? BottomSheetState.Empty.INSTANCE : bottomSheetState2, floatingIndicatorState2, teamPresenceState2);
        }
    }
}
