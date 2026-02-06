package io.intercom.android.sdk.m5.conversation.states;

import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\nH×\u0001J\t\u0010\u001c\u001a\u00020\bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FinStreamingData;", "", "isFinStreaming", "", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "clientAssignedUUID", "", "tokenSequenceIndex", "", "<init>", "(ZLjava/util/List;Ljava/lang/String;I)V", "()Z", "getBlocks", "()Ljava/util/List;", "getClientAssignedUUID", "()Ljava/lang/String;", "getTokenSequenceIndex", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FinStreamingData {
    public static final int $stable = 8;
    private final List<Block> blocks;
    private final String clientAssignedUUID;
    private final boolean isFinStreaming;
    private final int tokenSequenceIndex;

    public FinStreamingData(boolean z10, List<? extends Block> list, String str, int i10) {
        C6496s.h(list, "blocks");
        C6496s.h(str, "clientAssignedUUID");
        this.isFinStreaming = z10;
        this.blocks = list;
        this.clientAssignedUUID = str;
        this.tokenSequenceIndex = i10;
    }

    public static /* synthetic */ FinStreamingData copy$default(FinStreamingData finStreamingData, boolean z10, List<Block> list, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = finStreamingData.isFinStreaming;
        }
        if ((i11 & 2) != 0) {
            list = finStreamingData.blocks;
        }
        if ((i11 & 4) != 0) {
            str = finStreamingData.clientAssignedUUID;
        }
        if ((i11 & 8) != 0) {
            i10 = finStreamingData.tokenSequenceIndex;
        }
        return finStreamingData.copy(z10, list, str, i10);
    }

    public final boolean component1() {
        return this.isFinStreaming;
    }

    public final List<Block> component2() {
        return this.blocks;
    }

    public final String component3() {
        return this.clientAssignedUUID;
    }

    public final int component4() {
        return this.tokenSequenceIndex;
    }

    public final FinStreamingData copy(boolean z10, List<? extends Block> list, String str, int i10) {
        C6496s.h(list, "blocks");
        C6496s.h(str, "clientAssignedUUID");
        return new FinStreamingData(z10, list, str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinStreamingData)) {
            return false;
        }
        FinStreamingData finStreamingData = (FinStreamingData) obj;
        return this.isFinStreaming == finStreamingData.isFinStreaming && C6496s.c(this.blocks, finStreamingData.blocks) && C6496s.c(this.clientAssignedUUID, finStreamingData.clientAssignedUUID) && this.tokenSequenceIndex == finStreamingData.tokenSequenceIndex;
    }

    public final List<Block> getBlocks() {
        return this.blocks;
    }

    public final String getClientAssignedUUID() {
        return this.clientAssignedUUID;
    }

    public final int getTokenSequenceIndex() {
        return this.tokenSequenceIndex;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isFinStreaming) * 31) + this.blocks.hashCode()) * 31) + this.clientAssignedUUID.hashCode()) * 31) + Integer.hashCode(this.tokenSequenceIndex);
    }

    public final boolean isFinStreaming() {
        return this.isFinStreaming;
    }

    public String toString() {
        return "FinStreamingData(isFinStreaming=" + this.isFinStreaming + ", blocks=" + this.blocks + ", clientAssignedUUID=" + this.clientAssignedUUID + ", tokenSequenceIndex=" + this.tokenSequenceIndex + ')';
    }
}
