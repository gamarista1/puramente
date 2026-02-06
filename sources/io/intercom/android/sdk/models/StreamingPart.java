package io.intercom.android.sdk.models;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/models/StreamingPart;", "", "metadata", "Lio/intercom/android/sdk/models/Metadata;", "<init>", "(Lio/intercom/android/sdk/models/Metadata;)V", "getMetadata", "()Lio/intercom/android/sdk/models/Metadata;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StreamingPart {
    public static final int $stable = 8;
    @c("metadata")
    private final Metadata metadata;

    public StreamingPart() {
        this((Metadata) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StreamingPart copy$default(StreamingPart streamingPart, Metadata metadata2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            metadata2 = streamingPart.metadata;
        }
        return streamingPart.copy(metadata2);
    }

    public final Metadata component1() {
        return this.metadata;
    }

    public final StreamingPart copy(Metadata metadata2) {
        return new StreamingPart(metadata2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreamingPart) && C6496s.c(this.metadata, ((StreamingPart) obj).metadata);
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        Metadata metadata2 = this.metadata;
        if (metadata2 == null) {
            return 0;
        }
        return metadata2.hashCode();
    }

    public String toString() {
        return "StreamingPart(metadata=" + this.metadata + ')';
    }

    public StreamingPart(Metadata metadata2) {
        this.metadata = metadata2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StreamingPart(Metadata metadata2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : metadata2);
    }
}
