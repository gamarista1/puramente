package io.intercom.android.sdk.m5.conversation.usecase;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0005H×\u0001J\t\u0010\u0019\u001a\u00020\u001aH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/ConversationScrolledState;", "", "scrolled", "", "scrollToPosition", "", "isLandscape", "isLargeFont", "lastSeenItemIndex", "<init>", "(ZIZZI)V", "getScrolled", "()Z", "getScrollToPosition", "()I", "getLastSeenItemIndex", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConversationScrolledState {
    public static final int $stable = 0;
    private final boolean isLandscape;
    private final boolean isLargeFont;
    private final int lastSeenItemIndex;
    private final int scrollToPosition;
    private final boolean scrolled;

    public ConversationScrolledState(boolean z10, int i10, boolean z11, boolean z12, int i11) {
        this.scrolled = z10;
        this.scrollToPosition = i10;
        this.isLandscape = z11;
        this.isLargeFont = z12;
        this.lastSeenItemIndex = i11;
    }

    public static /* synthetic */ ConversationScrolledState copy$default(ConversationScrolledState conversationScrolledState, boolean z10, int i10, boolean z11, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = conversationScrolledState.scrolled;
        }
        if ((i12 & 2) != 0) {
            i10 = conversationScrolledState.scrollToPosition;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            z11 = conversationScrolledState.isLandscape;
        }
        boolean z13 = z11;
        if ((i12 & 8) != 0) {
            z12 = conversationScrolledState.isLargeFont;
        }
        boolean z14 = z12;
        if ((i12 & 16) != 0) {
            i11 = conversationScrolledState.lastSeenItemIndex;
        }
        return conversationScrolledState.copy(z10, i13, z13, z14, i11);
    }

    public final boolean component1() {
        return this.scrolled;
    }

    public final int component2() {
        return this.scrollToPosition;
    }

    public final boolean component3() {
        return this.isLandscape;
    }

    public final boolean component4() {
        return this.isLargeFont;
    }

    public final int component5() {
        return this.lastSeenItemIndex;
    }

    public final ConversationScrolledState copy(boolean z10, int i10, boolean z11, boolean z12, int i11) {
        return new ConversationScrolledState(z10, i10, z11, z12, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationScrolledState)) {
            return false;
        }
        ConversationScrolledState conversationScrolledState = (ConversationScrolledState) obj;
        return this.scrolled == conversationScrolledState.scrolled && this.scrollToPosition == conversationScrolledState.scrollToPosition && this.isLandscape == conversationScrolledState.isLandscape && this.isLargeFont == conversationScrolledState.isLargeFont && this.lastSeenItemIndex == conversationScrolledState.lastSeenItemIndex;
    }

    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    public final int getScrollToPosition() {
        return this.scrollToPosition;
    }

    public final boolean getScrolled() {
        return this.scrolled;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.scrolled) * 31) + Integer.hashCode(this.scrollToPosition)) * 31) + Boolean.hashCode(this.isLandscape)) * 31) + Boolean.hashCode(this.isLargeFont)) * 31) + Integer.hashCode(this.lastSeenItemIndex);
    }

    public final boolean isLandscape() {
        return this.isLandscape;
    }

    public final boolean isLargeFont() {
        return this.isLargeFont;
    }

    public String toString() {
        return "ConversationScrolledState(scrolled=" + this.scrolled + ", scrollToPosition=" + this.scrollToPosition + ", isLandscape=" + this.isLandscape + ", isLargeFont=" + this.isLargeFont + ", lastSeenItemIndex=" + this.lastSeenItemIndex + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConversationScrolledState(boolean z10, int i10, boolean z11, boolean z12, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, z11, z12, (i12 & 16) != 0 ? 0 : i11);
    }
}
