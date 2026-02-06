package io.intercom.android.sdk.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/HostAppState;", "", "isBackgrounded", "", "sessionStartedSinceLastBackgrounded", "backgroundedTimestamp", "", "<init>", "(ZZJ)V", "()Z", "getSessionStartedSinceLastBackgrounded", "getBackgroundedTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HostAppState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final HostAppState NULL = new HostAppState(false, false, 0, 7, (DefaultConstructorMarker) null);
    private final long backgroundedTimestamp;
    private final boolean isBackgrounded;
    private final boolean sessionStartedSinceLastBackgrounded;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/HostAppState$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/HostAppState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HostAppState() {
        this(false, false, 0, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ HostAppState copy$default(HostAppState hostAppState, boolean z10, boolean z11, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = hostAppState.isBackgrounded;
        }
        if ((i10 & 2) != 0) {
            z11 = hostAppState.sessionStartedSinceLastBackgrounded;
        }
        if ((i10 & 4) != 0) {
            j10 = hostAppState.backgroundedTimestamp;
        }
        return hostAppState.copy(z10, z11, j10);
    }

    public final boolean component1() {
        return this.isBackgrounded;
    }

    public final boolean component2() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    public final long component3() {
        return this.backgroundedTimestamp;
    }

    public final HostAppState copy(boolean z10, boolean z11, long j10) {
        return new HostAppState(z10, z11, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAppState)) {
            return false;
        }
        HostAppState hostAppState = (HostAppState) obj;
        return this.isBackgrounded == hostAppState.isBackgrounded && this.sessionStartedSinceLastBackgrounded == hostAppState.sessionStartedSinceLastBackgrounded && this.backgroundedTimestamp == hostAppState.backgroundedTimestamp;
    }

    public final long getBackgroundedTimestamp() {
        return this.backgroundedTimestamp;
    }

    public final boolean getSessionStartedSinceLastBackgrounded() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isBackgrounded) * 31) + Boolean.hashCode(this.sessionStartedSinceLastBackgrounded)) * 31) + Long.hashCode(this.backgroundedTimestamp);
    }

    public final boolean isBackgrounded() {
        return this.isBackgrounded;
    }

    public String toString() {
        return "HostAppState(isBackgrounded=" + this.isBackgrounded + ", sessionStartedSinceLastBackgrounded=" + this.sessionStartedSinceLastBackgrounded + ", backgroundedTimestamp=" + this.backgroundedTimestamp + ')';
    }

    public HostAppState(boolean z10, boolean z11, long j10) {
        this.isBackgrounded = z10;
        this.sessionStartedSinceLastBackgrounded = z11;
        this.backgroundedTimestamp = j10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HostAppState(boolean z10, boolean z11, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? 0 : j10);
    }
}
