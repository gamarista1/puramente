package io.intercom.android.sdk.m5.conversation.states;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0003H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/JumpToBottomButtonState;", "", "unreadMessages", "", "scrollToPosition", "lastSeenItemIndex", "<init>", "(III)V", "getUnreadMessages", "()I", "getScrollToPosition", "getLastSeenItemIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JumpToBottomButtonState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int UNKNOWN_SCROLL_TO_POSITION = -1;
    private final int lastSeenItemIndex;
    private final int scrollToPosition;
    private final int unreadMessages;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/JumpToBottomButtonState$Companion;", "", "<init>", "()V", "UNKNOWN_SCROLL_TO_POSITION", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public JumpToBottomButtonState() {
        this(0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ JumpToBottomButtonState copy$default(JumpToBottomButtonState jumpToBottomButtonState, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = jumpToBottomButtonState.unreadMessages;
        }
        if ((i13 & 2) != 0) {
            i11 = jumpToBottomButtonState.scrollToPosition;
        }
        if ((i13 & 4) != 0) {
            i12 = jumpToBottomButtonState.lastSeenItemIndex;
        }
        return jumpToBottomButtonState.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.unreadMessages;
    }

    public final int component2() {
        return this.scrollToPosition;
    }

    public final int component3() {
        return this.lastSeenItemIndex;
    }

    public final JumpToBottomButtonState copy(int i10, int i11, int i12) {
        return new JumpToBottomButtonState(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JumpToBottomButtonState)) {
            return false;
        }
        JumpToBottomButtonState jumpToBottomButtonState = (JumpToBottomButtonState) obj;
        return this.unreadMessages == jumpToBottomButtonState.unreadMessages && this.scrollToPosition == jumpToBottomButtonState.scrollToPosition && this.lastSeenItemIndex == jumpToBottomButtonState.lastSeenItemIndex;
    }

    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    public final int getScrollToPosition() {
        return this.scrollToPosition;
    }

    public final int getUnreadMessages() {
        return this.unreadMessages;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.unreadMessages) * 31) + Integer.hashCode(this.scrollToPosition)) * 31) + Integer.hashCode(this.lastSeenItemIndex);
    }

    public String toString() {
        return "JumpToBottomButtonState(unreadMessages=" + this.unreadMessages + ", scrollToPosition=" + this.scrollToPosition + ", lastSeenItemIndex=" + this.lastSeenItemIndex + ')';
    }

    public JumpToBottomButtonState(int i10, int i11, int i12) {
        this.unreadMessages = i10;
        this.scrollToPosition = i11;
        this.lastSeenItemIndex = i12;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JumpToBottomButtonState(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? -1 : i11, (i13 & 4) != 0 ? 0 : i12);
    }
}
