package io.intercom.android.sdk.models;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/UploadMetadata;", "", "safeAppId", "", "<init>", "(Ljava/lang/String;)V", "getSafeAppId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadMetadata {
    public static final int $stable = 0;
    @c("safe_app_id")
    private final String safeAppId;

    public UploadMetadata() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UploadMetadata copy$default(UploadMetadata uploadMetadata, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uploadMetadata.safeAppId;
        }
        return uploadMetadata.copy(str);
    }

    public final String component1() {
        return this.safeAppId;
    }

    public final UploadMetadata copy(String str) {
        C6496s.h(str, "safeAppId");
        return new UploadMetadata(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UploadMetadata) && C6496s.c(this.safeAppId, ((UploadMetadata) obj).safeAppId);
    }

    public final String getSafeAppId() {
        return this.safeAppId;
    }

    public int hashCode() {
        return this.safeAppId.hashCode();
    }

    public String toString() {
        return "UploadMetadata(safeAppId=" + this.safeAppId + ')';
    }

    public UploadMetadata(String str) {
        C6496s.h(str, "safeAppId");
        this.safeAppId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploadMetadata(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
