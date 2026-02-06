package io.intercom.android.sdk.models;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0014\u001a\u00020\u0005H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "", "enabled", "", "startTimeout", "", "syncInterval", "<init>", "(ZII)V", "getEnabled", "()Z", "getStartTimeout", "()I", "getSyncInterval", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConversationStateSyncSettings {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final ConversationStateSyncSettings DEFAULT = new ConversationStateSyncSettings(false, 0, 0);
    @c("enabled")
    private final boolean enabled;
    @c("start_timeout")
    private final int startTimeout;
    @c("sync_interval")
    private final int syncInterval;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/models/ConversationStateSyncSettings$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "getDEFAULT", "()Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConversationStateSyncSettings getDEFAULT() {
            return ConversationStateSyncSettings.DEFAULT;
        }

        private Companion() {
        }
    }

    public ConversationStateSyncSettings(boolean z10, int i10, int i11) {
        this.enabled = z10;
        this.startTimeout = i10;
        this.syncInterval = i11;
    }

    public static /* synthetic */ ConversationStateSyncSettings copy$default(ConversationStateSyncSettings conversationStateSyncSettings, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = conversationStateSyncSettings.enabled;
        }
        if ((i12 & 2) != 0) {
            i10 = conversationStateSyncSettings.startTimeout;
        }
        if ((i12 & 4) != 0) {
            i11 = conversationStateSyncSettings.syncInterval;
        }
        return conversationStateSyncSettings.copy(z10, i10, i11);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.startTimeout;
    }

    public final int component3() {
        return this.syncInterval;
    }

    public final ConversationStateSyncSettings copy(boolean z10, int i10, int i11) {
        return new ConversationStateSyncSettings(z10, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationStateSyncSettings)) {
            return false;
        }
        ConversationStateSyncSettings conversationStateSyncSettings = (ConversationStateSyncSettings) obj;
        return this.enabled == conversationStateSyncSettings.enabled && this.startTimeout == conversationStateSyncSettings.startTimeout && this.syncInterval == conversationStateSyncSettings.syncInterval;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getStartTimeout() {
        return this.startTimeout;
    }

    public final int getSyncInterval() {
        return this.syncInterval;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.enabled) * 31) + Integer.hashCode(this.startTimeout)) * 31) + Integer.hashCode(this.syncInterval);
    }

    public String toString() {
        return "ConversationStateSyncSettings(enabled=" + this.enabled + ", startTimeout=" + this.startTimeout + ", syncInterval=" + this.syncInterval + ')';
    }
}
